SUMMARY = "Pi-camera package for ROS2."

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=fe8b75cf0aba647401e1038bcd69ee74"

inherit ament-python

RDEPENDS_${PN} = " \
    python3-pyyaml \
    python3-picamera \
    rclpy \
    builtin-interfaces \
    ros2-sensor-msgs \
    duckietown-msgs \
"

SRCREV = "f68222e42319864e1b8553cf1429c025588a6dfb"
SRC_URI = " \
    git://git@auto-gitlab.lgsvl.net/duckietown/duckietown2.git;protocol=ssh;subpath=05-teleop/pi_camera \
"

S="${WORKDIR}/pi_camera"


