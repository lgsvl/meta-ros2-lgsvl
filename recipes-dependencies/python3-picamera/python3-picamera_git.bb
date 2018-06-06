SUMMARY = "picamera package for python 3"

HOMEPAGE = "https://github.com/waveform80/picamera"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a5f6282f39d52726bdc1e51d5c4b95c9"

inherit pypi setuptools3

SRCREV = "e18d70989eb6c3bf19f4cea859c7401bea3b9048"
SRC_URI = " \
    git://git@github.com/waveform80/picamera.git;protocol=https \
"

S="${WORKDIR}/git"

do_install_prepend() {
    export READTHEDOCS=True
}
