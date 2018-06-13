#!/bin/sh

export AMENT_PREFIX_PATH=/usr
export ROS_DOMAIN_ID=10     # arbitrary fixed number 0-255 to segregate within network
export PYTHONUNBUFFERED=1
export PYTHONOPTIMIZE=2

launch /usr/lib/python3.5/site-packages/duckietown_demos/duckietown_demos_launch/obstacle_joy_launch.py &
while true; do
    rosbridge
done

