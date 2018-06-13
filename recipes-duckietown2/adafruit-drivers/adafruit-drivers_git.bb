SUMMARY = "Adafruit package for ROS2."

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=fe8b75cf0aba647401e1038bcd69ee74"

inherit setuptools3

RDEPENDS_${PN} = " \
    python3-smbus2 \
"

SRCREV = "f68222e42319864e1b8553cf1429c025588a6dfb"
SRC_URI = " \
    git://git@auto-gitlab.lgsvl.net/duckietown/duckietown2.git;protocol=ssh;subpath=05-teleop/adafruit_drivers \
"

S="${WORKDIR}/adafruit_drivers"


