SUMMARY = "Pi-camera package for ROS2."

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=1e7b3bcc2e271699c77c769685058cbe"

inherit ament-python

RDEPENDS_${PN} = " \
    python3-pyyaml \
    python3-picamera \
    rclpy \
    builtin-interfaces \
    ros2-sensor-msgs \
    duckietown-msgs \
"

SRCREV = "6e3e342f2363bea10460a4acf4a004a3b3490901"
SRC_URI = " \
    git://github.com/lgsvl/duckietown2.git;subpath=05-teleop/pi_camera \
"

S="${WORKDIR}/pi_camera"


