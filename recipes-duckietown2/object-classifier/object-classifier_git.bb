SUMMARY = "Object classifier based on inception-v4"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=68b329da9893e34099c7d8ad5cb9c940"

inherit ament-python

RDEPENDS_${PN} = " \
    python3-core \
    movidius \
"

SRCREV = "f68222e42319864e1b8553cf1429c025588a6dfb"
SRC_URI = " \
    git://git@auto-gitlab.lgsvl.net/duckietown/duckietown2.git;protocol=ssh;subpath=80-deep-learning/object_classifier  \
"

S="${WORKDIR}/object_classifier"
