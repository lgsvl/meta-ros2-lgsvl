SUMMARY = "Joy mapper package for ROS2."

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=1e7b3bcc2e271699c77c769685058cbe"

inherit ament-python

RDEPENDS_${PN} = " \
    rclpy \
    ros2-sensor-msgs \
    ros2-geometry-msgs \
    duckietown-msgs \
    python3-rpi-gpio \
"

SRCREV = "ea9dcbb2132fb4309d62f13f61cb8ee88c19f281"
SRC_URI = " \
    git://github.com/lgsvl/duckietown2.git;subpath=05-teleop/joy_mapper \
"

S="${WORKDIR}/joy_mapper"
