SUMMARY = "A libuv wrapper in modern C++"
HOMEPAGE = "https://github.com/skypjack/uvw"
DESCRIPTION = "Header-only, event based, tiny and easy to use libuv wrapper in modern C++ - now available as also shared/static library!"
BUGTRACKER = "https://github.com/skypjack/uvw/issues"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e945c29a02adba41f817317921f056ca"

SRCREV = "v2.12.1_libuv_v1.44"
SRC_URI = "git://github.com/skypjack/uvw.git;protocol=https"
UPSTREAM_CHECK_GITTAGREGEX = "v(?P<pver>\d+(\.\d+)+)"

S = "${WORKDIR}/git"

FILES_${PN}-dev = "${libdir}/* ${includedir}"

EXTRA_OECMAKE += "-D BUILD_UVW_LIBS=ON"

inherit cmake

BBCLASSEXTEND = "native"