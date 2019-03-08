EXTENDPRAUTO_append = "ros2-lgsvl1"

FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"
SRC_URI += "file://0001-misc-rename-copy_file_range-to-copy_file_chunk.patch"
