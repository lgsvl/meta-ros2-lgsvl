SUMMARY = "Duckietown package for ROS2. Provides helper functions used in the Duckietown project."

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=1e7b3bcc2e271699c77c769685058cbe"

inherit ament pythonpath-insane

DEPENDS = " \
    builtin-interfaces \
    rosidl-default-runtime \
    rosidl-typesupport-c \
    ros2-std-msgs \
    ros2-geometry-msgs \
    ros2-sensor-msgs \
    ros2-visualization-msgs \
"

RDEPENDS_${PN} = " \
    ros2-std-msgs \
    ros2-geometry-msgs \
    ros2-sensor-msgs\
"

SRCREV = "6e3e342f2363bea10460a4acf4a004a3b3490901"
SRC_URI = " \
    git://github.com/lgsvl/duckietown2.git;subpath=00-infrastructure/duckietown_msgs \
"

S="${WORKDIR}/duckietown_msgs"


