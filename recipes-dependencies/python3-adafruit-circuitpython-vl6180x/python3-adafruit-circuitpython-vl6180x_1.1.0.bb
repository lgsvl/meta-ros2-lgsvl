SUMMARY = "adafruit-circuitpython-vl6180x 1.1.0 package for python 3"
LICENSE = "MIT"
LIC_FILES_CHKSUM="file://LICENSE;md5=asfasfa"

PYPI_PACKAGE = "adafruit-circuitpython-vl6180x"

inherit pypi setuptools3

SRC_URI[sha256sum] = "4e30f19910d20b35efb7b1e62bf73bbc7ade80e2a36f23eb627c411491fef272"

DEPENDS = " \
    python3-adafruit-blinka \
    python3-adafruit-circuitpython-busdevice \
"
