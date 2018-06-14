# Copyright (c) 2018 LG Electronics, Inc.

EXTENDPRAUTO_append = "r2d21"

FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI_append = " \
    file://0001-Set-com-enactjs-app-face-auto-launch-at-boot.patch \
"

