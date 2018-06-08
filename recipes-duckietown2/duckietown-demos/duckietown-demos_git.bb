SUMMARY = "Duckietown demos ROS2 package containing demo launch files"

LICENSE = "CLOSED"

inherit ament-python

RDEPENDS_${PN} = " \
    ros2-launch \
"

SRCREV = "b9abd26efd9251e6f640b6f13fd1ef445ba35d86"
SRC_URI = " \
    git://git@auto-gitlab.lgsvl.net/duckietown/duckietown2.git;protocol=ssh;subpath=70-convenience-packages/duckietown_demos  \
"

S="${WORKDIR}/duckietown_demos"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI_append = "file://run_duckiebot.sh"

do_install_append() {
    install -Dm 0777 ${WORKDIR}/run_duckiebot.sh ${D}/${bindir}/run_duckiebot.sh
}

FILES_${PN} += " \
    ${bindir}/run_duckiebot.sh \
"

