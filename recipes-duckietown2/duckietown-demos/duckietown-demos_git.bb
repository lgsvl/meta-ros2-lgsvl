SUMMARY = "Duckietown demos ROS2 package containing demo launch files"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=fe8b75cf0aba647401e1038bcd69ee74"

inherit ament-python

RDEPENDS_${PN} = " \
    ros2-launch \
"

SRCREV = "f68222e42319864e1b8553cf1429c025588a6dfb"
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

