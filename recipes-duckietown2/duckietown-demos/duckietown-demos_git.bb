SUMMARY = "Duckietown demos ROS2 package containing demo launch files"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=e0cab6c37b6a5e30363d6546a6bccfb5"

inherit ament-python

RDEPENDS_${PN} = " \
    ros2-launch \
"

SRCREV = "6dd0652f9900ec826550f16e5a4384195b48404d"
SRC_URI = " \
    git://git@auto-gitlab.lgsvl.net/duckietown/duckietown2.git;protocol=ssh;subpath=70-convenience-packages/duckietown_demos  \
"

S="${WORKDIR}/duckietown_demos"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI_append = "\
    file://run_duckiebot.sh \
    file://obstacle-joy.service \
    file://rosbridge.service \
    file://duckiebot.env \
"

do_install_append() {
    install -Dm 0777 ${WORKDIR}/run_duckiebot.sh ${D}/${bindir}/run_duckiebot.sh
    install -d ${D}${sysconfdir}/default/
    install -v -m 644 ${WORKDIR}/duckiebot.env ${D}${sysconfdir}/default/duckiebot.env
    install -d ${D}${systemd_system_unitdir}
    install -v -m 644 ${WORKDIR}/rosbridge.service ${D}${systemd_system_unitdir}/rosbridge.service
    install -v -m 644 ${WORKDIR}/obstacle-joy.service ${D}${systemd_system_unitdir}/obstacle-joy.service
    install -d ${D}${sysconfdir}/systemd/system/multi-user.target.wants/
    ln -snf /lib/systemd/system/rosbridge.service ${D}${sysconfdir}/systemd/system/multi-user.target.wants/rosbridge.service
    ln -snf /lib/systemd/system/obstacle-joy.service ${D}${sysconfdir}/systemd/system/multi-user.target.wants/obstacle-joy.service
}

FILES_${PN} += " \
    ${bindir}/run_duckiebot.sh \
    ${sysconfdir}/default/ \
    ${systemd_system_unitdir} \
    ${sysconfdir}/systemd/system/multi-user.target.wants/ \
"

