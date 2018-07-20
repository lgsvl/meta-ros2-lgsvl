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

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI_append = " file://0001-catch-bridge-exceptions.patch"

TARGET_CFLAGS += "-fpic"

do_install () {
    export HOME=${WORKDIR}
    export AMENT_PREFIX_PATH="${STAGING_EXECPREFIXDIR}"
    export CFLAGS="$CFLAGS -fpermissive"
    export CXXFLAGS="$CXXFLAGS -fpermissive"

    # configure cache to be in working directory
    ${STAGING_BINDIR_NATIVE}/npm set cache ${WORKDIR}/npm_cache

    # clear local cache prior to each compile
    ${STAGING_BINDIR_NATIVE}/npm cache clear

    case ${TARGET_ARCH} in
        i?86) targetArch="ia32"
            echo "targetArch = 32"
            ;;
        x86_64) targetArch="x64"
            echo "targetArch = 64"
            ;;
        arm) targetArch="arm"
            ;;
        aarch64) targetArch="arm64"
            ;;
        mips) targetArch="mips"
            ;;
        sparc) targetArch="sparc"
            ;;
        *) echo "unknown architecture"
           exit 1
            ;;
    esac

    # Compile and install
    ${STAGING_BINDIR_NATIVE}/npm install --production --unsafe-perm --arch=${targetArch} --target-arch=${targetArch} --verbose -g --prefix=${D}${prefix}

    # patch rclnodejs
    cd ${D}${prefix}/lib/node_modules/ros2-web-bridge/node_modules/rclnodejs
    patch -p 1 -i "${THISDIR}/files/0002-fix-new-delete-mismatch.patch"
    patch -p 1 -i "${THISDIR}/files/0003-fix-memory-leak-in-subscription-messages.patch"
    ${STAGING_BINDIR_NATIVE}/npm rebuild --production --unsafe-perm --arch=${targetArch} --target-arch=${targetArch} --verbose -g --prefix=${D}${prefix}

    rm -fr ${D}${libdir}/node_modules/ros2-web-bridge/npm-pack.sh
    rm -fr ${D}${libdir}/node_modules/ros2-web-bridge/node_modules/rclnodejs/test/
    rm -fr ${D}${libdir}/node_modules/ros2-web-bridge/node_modules/rclnodejs/scripts
    rm -fr ${D}${libdir}/node_modules/ros2-web-bridge/node_modules/rclnodejs/src/third_party/spdlog

    install -m 0777 -d ${D}${libdir}/node_modules/ros2-web-bridge/node_modules/rclnodejs/generated
}

FILES_${PN} += "${prefix}"

