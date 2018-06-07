SUMMARY = "Object classifier based on inception-v4"

LICENSE = "CLOSED"

inherit ament-python

RDEPENDS_${PN} = " \
    python3-core \
    movidius \
"

SRCREV = "c930b0fca1ae43649718a2e45a9caefb322a8f66"
SRC_URI = " \
    git://git@auto-gitlab.lgsvl.net/duckietown/duckietown2.git;protocol=ssh;subpath=80-deep-learning/object_classifier  \
"

S="${WORKDIR}/object_classifier"
