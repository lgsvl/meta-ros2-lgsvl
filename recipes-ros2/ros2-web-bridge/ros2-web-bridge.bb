SUMMARY = "Server Implementations of the rosbridge v2 Protocol"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS = " \
    nodejs-native \
    rcl \
    rmw \
    rosidl-generator-c \
    rcutils \
"
SRC_URI = "git://github.com/RobotWebTools/ros2-web-bridge.git;protocol=https;branch=develop;"
SRCREV = "91e3ea17328d9f9b59a94fbe223f4970d276a7d7"
S = "${WORKDIR}/git"

do_install () {
    export HOME=${WORKDIR}
    export AMENT_PREFIX_PATH=/usr
    export CFLAGS="$CFLAGS -fpermissive"
    export CXXFLAGS="$CXXFLAGS -fpermissive"

    # configure cache to be in working directory
    ${STAGING_BINDIR_NATIVE}/npm set cache ${WORKDIR}/npm_cache

    # clear local cache prior to each compile
    ${STAGING_BINDIR_NATIVE}/npm cache clear

    # Compile and install node modules in source directory
    ${STAGING_BINDIR_NATIVE}/npm install --production --unsafe-perm --arch=${TARGET_ARCH}

    install -d ${D}${libdir}/node_modules/ros2-web-bridge/
    install -m 0644 ${S}/index.js ${D}${libdir}/node_modules/ros2-web-bridge/index.js
    install -m 0644 ${S}/README.md ${D}${libdir}/node_modules/ros2-web-bridge/README.md
    install -m 0644 ${S}/package.json ${D}${libdir}/node_modules/ros2-web-bridge/package.json

    cp -r ${S}/examples/ ${D}${libdir}/node_modules/ros2-web-bridge/
    cp -r ${S}${base_libdir} ${D}${libdir}/node_modules/ros2-web-bridge/
    cp -r ${S}/node_modules/ ${D}${libdir}/node_modules/ros2-web-bridge/

    rm -fr ${D}${libdir}/node_modules/ros2-web-bridge/node_modules/rclnodejs/test/
    rm -fr ${D}${libdir}/node_modules/ros2-web-bridge/node_modules/rclnodejs/scripts
    rm -fr ${D}${libdir}/node_modules/ros2-web-bridge/node_modules/rclnodejs/src/third_party/spdlog

    install -m 0777 -d ${D}${libdir}/node_modules/ros2-web-bridge/node_modules/rclnodejs/generated

    install -d ${D}${libdir}/node_modules/ros2-web-bridge/bin/
    install -m 0755 ${S}/bin/rosbridge.js ${D}${libdir}/node_modules/ros2-web-bridge/bin/
}

FILES_${PN} = "${libdir}/node_modules/ros2-web-bridge/ \
"

