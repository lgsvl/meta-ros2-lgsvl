meta-ros2-lgsvl
======================

Summary
-------
This repository contains the Yocto meta-layer for building LGSVL's  Beanbird robot on top of webOS OSE.

It contains bitbake recipes for several ROS2 Duckietown packages: duckietown, duckietown_msgs, joy_mapper, and dagu_car.

It also contains the Enact Face application for the Beanbird robot as well as startup scripts for the ROS and web app programs to launch on boot.

Finally, it contains any and all custom modifications to existing upstream Yocto layers that are used, including meta-ros2, meta-webosose, and meta-raspberrypi.

Please refer to the main repo for building instructions:

https://github.com/lgsvl/build-ros2-lgsvl

Copyright and License Information
---------------------------------
Unless otherwise specified, all content, including all source code files and documentation files in this repository are:

Copyright (c) 2008-2018 LG Electronics, Inc.

Unless otherwise specified or set forth in the NOTICE file, all content, including all source code files and documentation files in this repository are: Licensed under the Apache License, Version 2.0 (the "License"); you may not use this content except in compliance with the License. You may obtain a copy of the License at

<http://www.apache.org/licenses/LICENSE-2.0>

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.