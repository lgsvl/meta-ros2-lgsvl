# Copyright (c) 2018 LG Electronics, Inc.

SUMMARY = "Enact Face application"
SECTION = "webos/apps"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

inherit webos_enact_repo
inherit webos_enactjs_app

FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

S = "${WORKDIR}/git"

SRC_URI = " \
    ${ENACTJS_GIT_REPO}/face.git;nobranch=1; \
"

PV = "0.1.0"
SRCREV = "f95295137ff96c47ff6cf738b260a06fbf9ac20f"

# NOTE: We only need to bump PR if we change something OTHER than
# PV, SRCREV or the require statement above.

PR = "r2"

WEBOS_ENACTJS_PACK_OPTS = "--production"
WEBOS_ENACTJS_SHRINKWRAP_OVERRIDE = "false"

do_install_prepend() {
	# Use the basic example config.json with localhost as host address
	cp -f ${S}/example/config.json ${S}/config.json
}
