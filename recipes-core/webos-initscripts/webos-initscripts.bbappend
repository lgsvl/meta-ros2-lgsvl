# Copyright (c) 2018 LG Electronics, Inc.

EXTENDPRAUTO_append = "ros2-lgsvlrpi2"

FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI_append = " \
    file://0001-Set-default-resolution-to-800x480.patch \
    file://0002-Add-delay-between-LSM-startup-retries.patch \
    file://0003-Configure-swapon-during-boot.patch \
"

do_install_append() {
    dd if=/dev/zero of=swapfile.swap bs=1M count=512
    mkswap -p 4096 swapfile.swap
    install -vm 0600 swapfile.swap ${D}/
}

FILES_${PN} += " \
    /swapfile.swap \
"

