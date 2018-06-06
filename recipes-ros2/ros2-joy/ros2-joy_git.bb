SUMMARY = "Joy package for ROS2."

LICENSE = "CLOSED"

inherit ament

DEPENDS = " \
    rclcpp \
    ros2-sensor-msgs \
"

SRCREV = "730b8fc2d0d4e4b8a7a69d5bdc536ac98df62140"
SRC_URI = " \
    git://git@github.com/ros2/joystick_drivers.git;protocol=https;branch=ros2;subpath=joy \
"

# temporary to check joystick /dev/input/by-path
FILEXEXTRAPATHS_prepend := "${THISDIR}/files:"

ROS_BPN = "ros2-joy"

S="${WORKDIR}/joy"

FILES_${PN} = " \
    /usr/share/* \
    ${libdir}/* \
"
