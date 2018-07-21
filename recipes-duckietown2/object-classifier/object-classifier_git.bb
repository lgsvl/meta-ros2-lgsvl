SUMMARY = "Object classifier based on inception-v4"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=68b329da9893e34099c7d8ad5cb9c940"

inherit ament-python

RDEPENDS_${PN} = " \
    python3-core \
    movidius \
"

SRCREV = "abfbbea2f15db6706c04252be56f29cfad22a481"
SRC_URI = " \
    git://github.com/lgsvl/duckietown2.git;subpath=80-deep-learning/object_classifier  \
"

S="${WORKDIR}/object_classifier"
