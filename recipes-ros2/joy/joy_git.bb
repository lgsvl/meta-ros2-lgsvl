SUMMARY = "Joy package for ROS2."

LICENSE = "CLOSED"

inherit ament

DEPENDS = " \
    rclcpp \
	ros2-sensor-msgs \
"

SRCREV = "730b8fc2d0d4e4b8a7a69d5bdc536ac98df62140"
SRC_URI = " \
	git://git@github.com/ros2/joystick_drivers.git;protocol=ssh;branch=ros2;subpath=joy \
" 

ROS_BPN = "joy"

S="${WORKDIR}/joy"


