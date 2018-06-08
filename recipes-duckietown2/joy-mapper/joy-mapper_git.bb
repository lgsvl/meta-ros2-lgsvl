SUMMARY = "Joy mapper package for ROS2."

LICENSE = "CLOSED"

inherit ament-python

RDEPENDS_${PN} = " \
    rclpy \
    ros2-sensor-msgs \
    ros2-geometry-msgs \
    duckietown-msgs \
    python3-rpi-gpio \
"

SRCREV = "c1104ed11da394a3b4abfadccb49a198eb65ba38"
SRC_URI = " \
    git://git@auto-gitlab.lgsvl.net/duckietown/duckietown2.git;protocol=ssh;subpath=05-teleop/joy_mapper \
"

S="${WORKDIR}/joy_mapper"
