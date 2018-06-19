SUMMARY = "Duckietown package for ROS2. Provides helper functions used in the Duckietown project."

LICENSE = "GPLv3"
LIC_FILES_CHKSUM="file://package.xml;beginline=8;endline=8;md5=fe8b75cf0aba647401e1038bcd69ee74"

inherit ament-python

RDEPENDS_${PN} = " \
    rclpy \
    python3-numpy \
"

SRCREV = "f68222e42319864e1b8553cf1429c025588a6dfb"
SRC_URI = " \
    git://git@auto-gitlab.lgsvl.net/duckietown/duckietown2.git;protocol=ssh;subpath=00-infrastructure/duckietown \
"

S="${WORKDIR}/duckietown"


