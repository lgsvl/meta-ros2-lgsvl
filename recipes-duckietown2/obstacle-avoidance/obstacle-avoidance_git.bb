SUMMARY = "Obstacle avoidance package using range sensors"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=fe8b75cf0aba647401e1038bcd69ee74"

inherit ament-python

RDEPENDS_${PN} = " \
    rclpy \
    ros2-sensor-msgs \
    duckietown-msgs \
     \
"

SRCREV = "f68222e42319864e1b8553cf1429c025588a6dfb"
SRC_URI = " \
    git://git@auto-gitlab.lgsvl.net/duckietown/duckietown2.git;protocol=ssh;subpath=50-misc-additional-functionality/obstacle_avoidance  \
"

S="${WORKDIR}/obstacle_avoidance"
