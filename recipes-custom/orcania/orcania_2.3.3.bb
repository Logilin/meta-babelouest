DESCRIPTION = "Potluck with different functions for different purposes that can be shared among C programs"
HOMEPAGE = "https://github.com/babelouest/orcania"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fc178bcd425090939a8b634d1d6a9594"

SRC_URI = "git://github.com/babelouest/orcania;branch=master;protocol=https"

S = "${WORKDIR}/git"

inherit cmake pkgconfig


DEPENDS = "jansson"
RDEPENDS_${PN} = "jansson"
