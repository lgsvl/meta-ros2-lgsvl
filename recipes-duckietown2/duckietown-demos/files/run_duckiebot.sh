#!/bin/sh

export AMENT_PREFIX_PATH=/usr
export PYTHONUNBUFFERED=1
export PYTHONOPTIMIZE=2

launch /usr/lib/python3.5/site-packages/duckietown_demos/duckietown_demos_launch/obstacle_joy_launch.py &
while true; do
    rosbridge
done

