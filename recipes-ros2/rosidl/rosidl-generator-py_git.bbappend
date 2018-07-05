FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI_append = " file://0001-use-byte-array-rosidl-generator-py.patch \
                   file://0002-rosidl-generator-py-fix-memory-leak-for-nested-fields.patch "
