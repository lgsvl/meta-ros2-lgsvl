SUMMARY = "Intel Movidius Neural Compute SDK"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://LICENSE;md5=05b1939845b405db6b10a8050e4aa40c"

#SRC_URI = "git://github.com/movidius/ncsdk.git;protocol=https;"
#SRCREV = "ec17dbb87ed890738be583f615c7644cfd62a3e0"
SRC_URI = "https://ncs-forum-uploads.s3.amazonaws.com/ncsdk/ncsdk-01_12_00_01-full/ncsdk-1.12.00.01.tar.gz"
SRC_URI[md5sum] = "87561471aaf912f7b4bdb72e94f4ac67"
SRC_URI[sha256sum] = "1394a1c8cdf99a83dfa90d0bf02f76a8f6f06c9401cca4a7310eb2b0197670d0"

S = "${WORKDIR}/ncsdk-1.12.00.01"

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
