SUMMARY = "Intel Movidius Neural Compute SDK"
LICENSE = "CUSTOM"
LIC_FILES_CHKSUM = "file://LICENSE;md5=05b1939845b405db6b10a8050e4aa40c"

SRC_URI = "git://github.com/movidius/ncsdk.git;protocol=https;"
SRCREV = "ec17dbb87ed890738be583f615c7644cfd62a3e0"
S = "${WORKDIR}/git"

DEPENDS = "libusb1"

EXTRA_OEMAKE = " \
  ARCH=${TARGET_ARCH} \
  'CC=${CC}' \
  'CFLAGS=${CFLAGS} -O2 -Wall -pthread -fPIC -MMD -MP' \
  DESTDIR=${D} \
  INSTALLDIR=${D}${prefix} \
  PYTHON3DIST=${PYTHON_SITEPACKAGES_DIR} \
  PYTHON2DIST=${libdir}/python2.7/site-packages \
"

inherit python3-dir

do_configure() {
}

do_compile () {
    export SYSROOT="${STAGING_DIR_TARGET}"

    cd api/src
    oe_runmake SBINDIR=${sbindir} MANDIR=${mandir} INCLUDEDIR=${includedir}
}

do_install () {
    cd api/src
    oe_runmake basicinstall pythoninstall
}

INSANE_SKIP_${PN} = "dev-so"

FILES_${PN} += "${libdir}"
FILES_SOLIBSDEV = ""
