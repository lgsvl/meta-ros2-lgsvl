# Copyright (c) 2018 LG Electronics, Inc.

# You don't need to change this value when you're changing just a RDEPENDS_${PN} variable.
EXTENDPRAUTO_append = "ros2-lgsvl1"

RDEPENDS_${PN}_append = " \
    packagegroup-ros2-world \
    cv-bridge \
    python3-opencv \
    ros2-web-bridge \
    ros2-joy \
    com.enactjs.app.face \
    packagegroup-duckietown2 \
    packagegroup-duckietown-dependencies \
    com.palm.service.devmode \
"
