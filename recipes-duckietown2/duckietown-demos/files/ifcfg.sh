#!/bin/sh
# This is a workaround for the issue where DDS used by ROS2
# doesn't work at all if interfaces doesn't have an assigned IP
#
# This blocks until webos-connman-adapter startup job is done
CMD_NET_STATUS='luna-send -n 1 -f palm://com.webos.service.connectionmanager/getStatus {}'
${CMD_NET_STATUS} | grep "\"returnValue\": false"
while [ $? == 0 ]; do /bin/usleep 250000; ${CMD_NET_STATUS} | grep "\"returnValue\": false"; done
# Sets a valid IP address for each of the interfaces that have MAC addresses
/sbin/ip addr add 192.168.0.1/24 dev eth0
/sbin/ip addr add 192.168.1.1/24 dev wlan0
