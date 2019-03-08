EXTENDPRAUTO_append = "ros2-lgsvl1"

FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"
SRC_URI += "file://memfd.patch"
