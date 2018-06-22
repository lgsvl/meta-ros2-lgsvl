SUMMARY = "Adafruit package for ROS2."

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=1e7b3bcc2e271699c77c769685058cbe"

inherit setuptools3

RDEPENDS_${PN} = " \
    python3-smbus2 \
"

SRCREV = "d207167fa507eda6f9cb8f2c02627aa2dec73d2a"
SRC_URI = " \
    git://github.com/lgsvl/duckietown2.git;subpath=05-teleop/adafruit_drivers \
"

S="${WORKDIR}/adafruit_drivers"


