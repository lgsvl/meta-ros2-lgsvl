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

SRCREV = "d207167fa507eda6f9cb8f2c02627aa2dec73d2a"
SRC_URI = " \
    git://git@auto-gitlab.lgsvl.net/duckietown/duckietown2.git;protocol=ssh;subpath=50-misc-additional-functionality/obstacle_avoidance  \
"

S="${WORKDIR}/obstacle_avoidance"
