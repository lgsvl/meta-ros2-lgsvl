SUMMARY = "Adafruit package for ROS2."

LICENSE = "CLOSED"

inherit setuptools3

RDEPENDS_${PN} = " \
	python3-smbus2 \
"

SRCREV = "cd972e2d348f151c31e505c612d995f2de5c7584"
SRC_URI = " \
	git://git@auto-gitlab.lgsvl.net/duckietown/duckietown2.git;protocol=ssh;subpath=05-teleop/adafruit_drivers \
" 

S="${WORKDIR}/adafruit_drivers"


