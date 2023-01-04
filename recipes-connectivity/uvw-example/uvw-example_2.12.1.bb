SUMMARY = "Examples of linking options of uvw application"
HOMEPAGE = "https://github.com/stefanofiorentino/uvw_static_lib_client"
DESCRIPTION = "Examples of linking options of uvw application"
BUGTRACKER = "https://github.com/stefanofiorentino/uvw_static_lib_client/issues"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=39169c9b4e3b62dd392950780576c55e"

DEPENDS = "uvw"

SRCREV = "85a20483fcc12fd520f3e62c968e9bffdd20fa82"
SRC_URI = "git://github.com/stefanofiorentino/uvw_static_lib_client.git;branch=master;protocol=https"

S = "${WORKDIR}/git"

EXTRA_OECMAKE += " \
    -D FETCH_UVW:BOOL=OFF \
    -D FETCH_LIBUV:BOOL=OFF \
    "

inherit cmake
