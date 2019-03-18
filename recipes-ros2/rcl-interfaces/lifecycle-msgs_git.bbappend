# Copyright (c) 2019 LG Electronics, Inc.

EXTENDPRAUTO_append = "ros2-lgsvl1"

# Remove this file when upstream recipe is updated.

DEPENDS_append = " \
    rmw-implementation-cmake \
    rosidl-typesupport-c \
    rosidl-typesupport-cpp \
"
