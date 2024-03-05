SUMMARY = "CM4 CAN Reader Using vSomeIP"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c1675da6bb0731efd997bdd23adc4892"

SRC_URI = "https://github.com/mehmettozbek/vsomeip_applications.git;protocol=https;branch=master"
SRCREV = "f337a06f260bb64f01705f96ade82cd7f1893ae0"

S = "${WORKDIR}/git"

DEPENDS = "vsomeip3"
inherit cmake

FILES:${PN} = "/usr/lib/* /usr/include/* /usr/etc/vsomeip/*"
