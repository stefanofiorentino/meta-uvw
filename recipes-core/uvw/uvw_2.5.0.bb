DESCRIPTION = "Header-only, event based, tiny and easy to use libuv wrapper in modern C++ - now available as also shared/static library!"
SECTION = "examples"
DEPENDS = ""
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e945c29a02adba41f817317921f056ca"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRCREV = "v2.5.0_libuv-v1.37"
SRC_URI = "git://github.com/skypjack/uvw.git"

S = "${WORKDIR}/git"

FILES_${PN}-dev = "${libdir}/* ${includedir}"

EXTRA_OECMAKE += "-D BUILD_UVW_LIBS=ON"

inherit cmake
