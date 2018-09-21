SUMMARY = "Joy package for ROS2."

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

inherit ament

DEPENDS = " \
    rclcpp \
    ros2-sensor-msgs \
"

SRCREV = "1fdd2bf817015d3917d6654eb90c92cb6d949a9a"
SRC_URI = " \
    git://git@github.com/ros2/joystick_drivers.git;protocol=https;branch=bouncy;subpath=joy \
"

# temporary to check joystick /dev/input/by-path
FILEXEXTRAPATHS_prepend := "${THISDIR}/files:"

ROS_BPN = "ros2-joy"

S="${WORKDIR}/joy"

FILES_${PN} = " \
    /usr/share/* \
    ${libdir}/* \
"
