SUMMARY = "Adafruit-PureIO 0.2.3 package for python 3"

HOMEPAGE = "https://github.com/adafruit/Adafruit_Python_PureIO"

LICENSE = "MIT"
LIC_FILES_CHKSUM="file://LICENSE;md5=88249dac6ef92678a584c6bb77fdfff8"

inherit setuptools3

SRCREV = "90e73171e3a7400e59be42fab36f4d67506fc9b7"
SRC_URI = " \
    git://git@github.com/adafruit/Adafruit_Python_PureIO.git;protocol=https \
"

S = "${WORKDIR}/git"
