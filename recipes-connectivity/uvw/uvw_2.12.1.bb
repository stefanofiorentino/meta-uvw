SUMMARY = "A libuv wrapper in modern C++"
HOMEPAGE = "https://github.com/skypjack/uvw"
DESCRIPTION = "Header-only, event based, tiny and easy to use libuv wrapper in modern C++ - now available as also shared/static library!"
BUGTRACKER = "https://github.com/skypjack/uvw/issues"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=39169c9b4e3b62dd392950780576c55e"

DEPENDS = "libuv"

SRCREV = "36b9d189a19d999acfd35fc79ef12b839a61977d"
SRC_URI = "git://github.com/skypjack/uvw.git;branch=master;protocol=https"

S = "${WORKDIR}/git"

inherit cmake pkgconfig

PACKAGECONFIG ?= "shared"
PACKAGECONFIG[shared] = "-DBUILD_UVW_SHARED_LIB=ON,-DBUILD_UVW_SHARED_LIB=OFF,"
PACKAGECONFIG[libuv] = "-DFETCH_LIBUV=ON,-DFETCH_LIBUV=OFF,"

BBCLASSEXTEND = "native"
