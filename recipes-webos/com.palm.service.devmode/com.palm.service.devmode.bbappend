# Copyright (c) 2018 LG Electronics, Inc.

EXTENDPRAUTO_append = "r2d21"

# touch /var/luna/preferences/debug_system_apps in emulator build
do_install_append_emulator() {
    install -D /dev/null ${D}${webos_sysmgr_localstatedir}/preferences/debug_system_apps
}

# touch /var/luna/preferences/debug_system_apps in webOS OSE build
do_install_append_webos() {
    install -D /dev/null ${D}${webos_sysmgr_localstatedir}/preferences/debug_system_apps
}

