# Copyright (c) 2018 LG Electronics, Inc.

EXTENDPRAUTO_append = "r2d21"

FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}-${SHRT_VER}:"

SRC_URI_append = " \
    file://0001-Enable-raspberrypi-official-7-inch-touch-screen.patch \
    file://0002-Enable-joystick-support.patch \
"
