# Copyright (c) 2018 LG Electronics, Inc.

DESCRIPTION = "duckietown2 dependencies package group"

inherit packagegroup

PACKAGES = "${PN}"

RDEPENDS_${PN} = "\
	python3-smbus2 \
	python3-yaml \
	python3-picamera \
"
