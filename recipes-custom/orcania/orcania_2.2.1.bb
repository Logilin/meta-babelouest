DESCRIPTION = "Potluck with different functions for different purposes that can be shared among C programs"
HOMEPAGE = "https://github.com/babelouest/orcania"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fc178bcd425090939a8b634d1d6a9594"

inherit cmake pkgconfig
SRC_URI = "git://github.com/babelouest/orcania;protocol=https"
SRCREV = "v${PV}"
S = "${WORKDIR}/git"

DEPENDS = "jansson"
RDEPENDS_${PN} = "jansson"
