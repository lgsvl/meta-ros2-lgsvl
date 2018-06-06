SUMMARY = "Dagu-car package for ROS2."

LICENSE = "CLOSED"

inherit ament-python

RDEPENDS_${PN} = " \
    rclpy \
	builtin-interfaces \
	duckietown-msgs \
	python3-numpy \
"

SRCREV = "cd972e2d348f151c31e505c612d995f2de5c7584"
SRC_URI = " \
	git://git@auto-gitlab.lgsvl.net/duckietown/duckietown2.git;protocol=ssh;subpath=05-teleop/dagu_car \
" 

S="${WORKDIR}/dagu_car"


