FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI_append = " file://0001-fix-memory-leaks.patch \
                   file://0002-fix-memory-leak-for-nested-fields.patch "

