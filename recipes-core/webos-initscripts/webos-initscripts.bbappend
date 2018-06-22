# Copyright (c) 2018 LG Electronics, Inc.

EXTENDPRAUTO_append = "ros2-lgsvlrpi1"

FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI_append = " \
    file://0001-Set-default-resolution-to-800x480.patch \
    file://0002-Add-delay-between-LSM-startup-retries.patch \
"

