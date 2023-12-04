DESCRIPTION = "Potluck with different functions for different purposes that can be shared among C programs"
HOMEPAGE = "https://github.com/babelouest/orcania"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fc178bcd425090939a8b634d1d6a9594"

SRC_URI = "git://github.com/babelouest/orcania;branch=master;protocol=https"
SRCREV = "ffc8b55d09a3488f4f6be38034b33bc64bf8b0ce"
S = "${WORKDIR}/git"

inherit cmake pkgconfig


DEPENDS = "jansson"
RDEPENDS_${PN} = "jansson"
