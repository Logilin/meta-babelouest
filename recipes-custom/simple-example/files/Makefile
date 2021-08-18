
EXE=simple-example

OBJS=${EXE}.o

DESTDIR ?= /usr/local/bin

LDFLAGS += -lorcania -lyder -lulfius

all: ${EXE}

${EXE}: ${OBJS}
	${CC} ${LDFLAGS} -o ${EXE} $^ ${LDFLAGS}

clean:
	rm -f ${EXE} *.o

install: ${EXE}
	cp ${EXE} ${DESTDIR}/


%.o: %.c
	${CC} -DMYFLAG1 ${CPPFLAGS} -DMYFLAG2 ${CFLAGS} -DMYFLAG3 -c $^
