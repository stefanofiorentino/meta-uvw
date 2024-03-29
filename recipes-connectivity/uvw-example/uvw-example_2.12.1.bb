SUMMARY = "Examples of linking options of uvw application"
HOMEPAGE = "https://github.com/stefanofiorentino/uvw_static_lib_client"
DESCRIPTION = "Examples of linking options of uvw application"
BUGTRACKER = "https://github.com/stefanofiorentino/uvw_static_lib_client/issues"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=39169c9b4e3b62dd392950780576c55e"

DEPENDS = "uvw"

SRCREV = "9218c943c0395b50ea1ce3f54134b67da2885fe0"
SRC_URI = "git://github.com/stefanofiorentino/uvw_static_lib_client.git;branch=master;protocol=https"

S = "${WORKDIR}/git"

inherit cmake pkgconfig

PACKAGECONFIG ?= ""
PACKAGECONFIG[fetch] = "-DFETCH_UVW=ON -DFETCH_LIBUV=ON,-DFETCH_UVW=OFF -DFETCH_LIBUV=OFF,"
