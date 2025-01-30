DESCRIPTION = "Web Framework to build REST APIs, Webservices or any HTTP endpoint in C language. Can stream large amount of data, integrate JSON data with Jansson, and create websocket services"
HOMEPAGE = "https://babelouest.github.io/ulfius/"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=40d2542b8c43a3ec2b7f5da31a697b88"

inherit cmake pkgconfig
SRC_URI = "git://github.com/babelouest/ulfius;branch=master;protocol=https"
SRCREV = "a0603447d3ed63c0880db396b9c395fb4bf6b559"

S = "${WORKDIR}/git"

DEPENDS = "gnutls jansson libmicrohttpd yder orcania"
RDEPENDS_${PN} = "gnutls jansson libmicrohttpd yder orcania"
EXTRA_OECMAKE += "-DWITH_JOURNALD=off"
