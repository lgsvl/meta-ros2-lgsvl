# Copyright (c) 2018 LG Electronics, Inc.

EXTENDPRAUTO_append = "ros2-lgsvlrpi1"

FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI_append = " \
    file://0001-Make-swap-files-contiguous.patch \
"
