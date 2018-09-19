SUMMARY = "Obstacle avoidance package using range sensors"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=e0cab6c37b6a5e30363d6546a6bccfb5"

inherit ament-python

RDEPENDS_${PN} = " \
    rclpy \
    ros2-sensor-msgs \
    duckietown-msgs \
     \
"

SRCREV = "6e3e342f2363bea10460a4acf4a004a3b3490901"
SRC_URI = " \
    git://github.com/lgsvl/duckietown2.git;subpath=50-misc-additional-functionality/obstacle_avoidance  \
"

S="${WORKDIR}/obstacle_avoidance"
