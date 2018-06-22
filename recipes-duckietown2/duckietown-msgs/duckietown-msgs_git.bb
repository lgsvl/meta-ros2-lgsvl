SUMMARY = "Duckietown package for ROS2. Provides helper functions used in the Duckietown project."

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=fe8b75cf0aba647401e1038bcd69ee74"

inherit ament pythonpath-insane

DEPENDS = " \
    builtin-interfaces \
    rosidl-default-runtime \
    rosidl-typesupport-c \
    ros2-std-msgs \
    ros2-geometry-msgs \
    ros2-sensor-msgs \
"

RDEPENDS_${PN} = " \
    ros2-std-msgs \
    ros2-geometry-msgs \
    ros2-sensor-msgs\
"

SRCREV = "f68222e42319864e1b8553cf1429c025588a6dfb"
SRC_URI = " \
    git://github.com/lgsvl/duckietown2.git;subpath=00-infrastructure/duckietown_msgs \
"

S="${WORKDIR}/duckietown_msgs"


