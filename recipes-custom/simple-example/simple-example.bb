DESCRIPTION = "A simple example application for Ulfius framework."
SECTION = "Custom"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI  = "file://simple-example.c"
SRC_URI += "file://u_example.h"
SRC_URI += "file://Makefile"

S = "${WORKDIR}"


DEPENDS = "gnutls jansson libmicrohttpd orcania ulfius yder"
RDEPENDS_${PN} = "gnutls jansson libmicrohttpd orcania ulfius yder"

TARGET_CFLAGS += " -I."

do_compile() {
	oe_runmake
}

do_install() {
        install -m 0755 -d ${D}${bindir}
	oe_runmake DESTDIR="${D}${bindir}" install
}
