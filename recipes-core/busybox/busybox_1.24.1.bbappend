# Copyright (c) 2018 LG Electronics, Inc.

EXTENDPRAUTO_append = "ros2-lgsvl1"

FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI += "file://smemcap_fail_silently_transient_process_vanished_underneath.patch"

#
# Things are this complicated because overrides to the webOS configuration
# need to appear first in defconfig and we want to allow distros that use
# meta-webos-pro to use this configuration as a base but be able to have their
# own overrides. The reason overrides need to appear first is that only the first
# setting found in defconfig (which is filtered into ${S}/.config by the upstream
# recipe) is used. Subsequent duplicate settings produce warnings and are ignored.
#

addtask make_empty_defconfig_overrides before do_prepare_defconfig_overrides after do_patch
addtask prepare_defconfig_overrides before do_configure after do_make_empty_defconfig_overrides

do_make_empty_defconfig_overrides() {
    cp -f /dev/null ${WORKDIR}/defconfig-overrides
}

do_prepare_defconfig_overrides() {
    # Enable busybox features needed by webOS Pro that aren't enabled in Open
    # webOS. You should remove settings added here that also appear in the
    # .bbappend-s in other "higher" distros (e.g. meta-starfish).
    cat <<! >> ${WORKDIR}/defconfig-overrides
CONFIG_GZIP=y
CONFIG_SMEMCAP=y
CONFIG_FEATURE_REVERSE_SEARCH=y
!
}

do_configure_prepend() {
    # Allow do_configure() to be rerun by not creating defconfig-upstream if it
    # already exists.
    [ -e ${WORKDIR}/defconfig-upstream ] || mv ${WORKDIR}/defconfig ${WORKDIR}/defconfig-upstream
    cat ${WORKDIR}/defconfig-overrides ${WORKDIR}/defconfig-upstream > ${WORKDIR}/defconfig
}
