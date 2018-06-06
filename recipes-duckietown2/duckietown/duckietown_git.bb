SUMMARY = "Duckietown package for ROS2. Provides helper functions used in the Duckietown project."

LICENSE = "CLOSED"

inherit ament-python

RDEPENDS_${PN} = " \
    rclpy \
	python3-numpy \
"

SRCREV = "cd972e2d348f151c31e505c612d995f2de5c7584"
SRC_URI = " \
	git://git@auto-gitlab.lgsvl.net/duckietown/duckietown2.git;protocol=ssh;subpath=00-infrastructure/duckietown \
" 

S="${WORKDIR}/duckietown"


