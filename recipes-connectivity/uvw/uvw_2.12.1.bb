SUMMARY = "A libuv wrapper in modern C++"
HOMEPAGE = "https://github.com/skypjack/uvw"
DESCRIPTION = "Header-only, event based, tiny and easy to use libuv wrapper in modern C++ - now available as also shared/static library!"
BUGTRACKER = "https://github.com/skypjack/uvw/issues"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=39169c9b4e3b62dd392950780576c55e"

DEPENDS = "libuv"

SRCREV = "3db9e8f75a4351325e1ea00e17586af2b00cf1ea"
SRC_URI = "git://github.com/skypjack/uvw.git;branch=master;protocol=https"

S = "${WORKDIR}/git"

inherit cmake pkgconfig

PACKAGECONFIG ?= "shared"
PACKAGECONFIG[shared] = "-DBUILD_UVW_SHARED_LIB=ON,-DBUILD_UVW_SHARED_LIB=OFF,"
PACKAGECONFIG[libuv] = "-DFETCH_LIBUV=ON,-DFETCH_LIBUV=OFF,"

BBCLASSEXTEND = "native"
