SUMMARY = "A libuv wrapper in modern C++"
HOMEPAGE = "https://github.com/skypjack/uvw"
DESCRIPTION = "Header-only, event based, tiny and easy to use libuv wrapper in modern C++ - now available as also shared/static library!"
BUGTRACKER = "https://github.com/skypjack/uvw/issues"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=39169c9b4e3b62dd392950780576c55e"

SRC_URI = "git://github.com/skypjack/uvw.git;protocol=https;branch=main"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "3db9e8f75a4351325e1ea00e17586af2b00cf1ea"

S = "${WORKDIR}/git"

DEPENDS = "libuv"

inherit cmake pkgconfig

PACKAGECONFIG ?= "shared"
PACKAGECONFIG[shared] = "-DBUILD_UVW_SHARED_LIB:BOOL=TRUE,-DBUILD_UVW_SHARED_LIB:BOOL=FALSE,"

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = " \
    -DFETCH_LIBUV:BOOL=FALSE \
"