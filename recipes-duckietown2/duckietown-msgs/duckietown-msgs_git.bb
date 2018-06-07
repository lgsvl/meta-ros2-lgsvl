SUMMARY = "Duckietown package for ROS2. Provides helper functions used in the Duckietown project."

LICENSE = "CLOSED"

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

SRCREV = "c930b0fca1ae43649718a2e45a9caefb322a8f66"
SRC_URI = " \
	git://git@auto-gitlab.lgsvl.net/duckietown/duckietown2.git;protocol=ssh;subpath=00-infrastructure/duckietown_msgs \
" 

S="${WORKDIR}/duckietown_msgs"


