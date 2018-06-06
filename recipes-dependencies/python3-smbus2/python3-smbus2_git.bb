SUMMARY = "smbus2 package for python 3"

HOMEPAGE = "https://github.com/kplindegaard/smbus2"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2a3eca2de44816126b3c6f33811a9fba"

inherit pypi setuptools3

SRCREV = "de190f6132678fe901eed653809e6c944d8dff5c"
SRC_URI = " \
    git://git@github.com/kplindegaard/smbus2.git;protocol=https \
"

S="${WORKDIR}/git"
