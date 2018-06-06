SUMMARY = "Joy mapper package for ROS2."

LICENSE = "CLOSED"

inherit ament-python

RDEPENDS_${PN} = " \
    rclpy \
	ros2-sensor-msgs \
	ros2-geometry-msgs \
	duckietown-msgs \
"

SRCREV = "cd972e2d348f151c31e505c612d995f2de5c7584"
SRC_URI = " \
	git://git@auto-gitlab.lgsvl.net/duckietown/duckietown2.git;protocol=ssh;subpath=05-teleop/joy_mapper \
" 

S="${WORKDIR}/joy_mapper"


