DESCRIPTION = "Logging library for C applications"
HOMEPAGE = "https://github.com/babelouest/yder"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=40d2542b8c43a3ec2b7f5da31a697b88"

inherit cmake pkgconfig
SRC_URI = "git://github.com/babelouest/yder;branch=master;protocol=https"
SRCREV = "28206b26635abcaab47e81984f891c9f74b5bcff"

S = "${WORKDIR}/git"

DEPENDS = "jansson orcania"
RDEPENDS_${PN} = "jansson orcania"
EXTRA_OECMAKE += "-DWITH_JOURNALD=off"
