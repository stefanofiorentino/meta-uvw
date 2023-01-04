SUMMARY = "Examples of linking options of uvw application"
HOMEPAGE = "https://github.com/stefanofiorentino/uvw_static_lib_client"
DESCRIPTION = "Examples of linking options of uvw application"
BUGTRACKER = "https://github.com/stefanofiorentino/uvw_static_lib_client/issues"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=39169c9b4e3b62dd392950780576c55e"

DEPENDS = "uvw"

SRCREV = "6c1359c8eb953145e42adead00e70b5649d4b9c0"
SRC_URI = "git://github.com/stefanofiorentino/uvw_static_lib_client.git;branch=master;protocol=https"

S = "${WORKDIR}/git"

EXTRA_OECMAKE += " \
    -D FETCH_UVW:BOOL=OFF \
    -D FETCH_LIBUV:BOOL=OFF \
    "

inherit cmake
