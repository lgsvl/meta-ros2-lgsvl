SUMMARY = "Pi-camera package for ROS2."

LICENSE = "CLOSED"

inherit ament-python

RDEPENDS_${PN} = " \
	python3-yaml \
	python3-picamera \
    rclpy \
	builtin-interfaces \
	ros2-sensor-msgs \
	duckietown-msgs \
"

SRCREV = "cd972e2d348f151c31e505c612d995f2de5c7584"
SRC_URI = " \
	git://git@auto-gitlab.lgsvl.net/duckietown/duckietown2.git;protocol=ssh;subpath=05-teleop/pi_camera \
" 

S="${WORKDIR}/pi_camera"


