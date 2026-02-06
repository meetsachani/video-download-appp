package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.C10711xR0;
import o.C5075aO1;
import o.C5422bq;
import o.C6562gT0;
import o.C8120mp2;
import o.C8859ps;
import o.C9516sY;
import o.InterfaceC2677Cq;
import o.InterfaceC7072ia2;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class Http2Reader implements Closeable {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final Logger logger;
    private final boolean client;
    @NotNull
    private final ContinuationSource continuation;
    @NotNull
    private final Hpack.Reader hpackReader;
    @NotNull
    private final InterfaceC2677Cq source;

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        @NotNull
        public final Logger getLogger() {
            return Http2Reader.logger;
        }

        public final int lengthWithoutPadding(int i, int i2, int i3) throws IOException {
            if ((i2 & 8) != 0) {
                i--;
            }
            if (i3 <= i) {
                return i - i3;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i3 + " > remaining length " + i);
        }

        private Companion() {
        }
    }

    /* loaded from: classes4.dex */
    public static final class ContinuationSource implements InterfaceC7072ia2 {
        private int flags;
        private int left;
        private int length;
        private int padding;
        @NotNull
        private final InterfaceC2677Cq source;
        private int streamId;

        public ContinuationSource(@NotNull InterfaceC2677Cq interfaceC2677Cq) {
            C6562gT0.p(interfaceC2677Cq, "source");
            this.source = interfaceC2677Cq;
        }

        private final void readContinuationHeader() throws IOException {
            int i = this.streamId;
            int readMedium = Util.readMedium(this.source);
            this.left = readMedium;
            this.length = readMedium;
            int and = Util.and(this.source.readByte(), 255);
            this.flags = Util.and(this.source.readByte(), 255);
            Companion companion = Http2Reader.Companion;
            if (companion.getLogger().isLoggable(Level.FINE)) {
                companion.getLogger().fine(Http2.INSTANCE.frameLog(true, this.streamId, this.length, and, this.flags));
            }
            int readInt = this.source.readInt() & Integer.MAX_VALUE;
            this.streamId = readInt;
            if (and == 9) {
                if (readInt == i) {
                    return;
                }
                throw new IOException("TYPE_CONTINUATION streamId changed");
            }
            throw new IOException(and + " != TYPE_CONTINUATION");
        }

        @Override // o.InterfaceC7072ia2, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        public final int getFlags() {
            return this.flags;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getLength() {
            return this.length;
        }

        public final int getPadding() {
            return this.padding;
        }

        public final int getStreamId() {
            return this.streamId;
        }

        @Override // o.InterfaceC7072ia2
        public long read(@NotNull C5422bq c5422bq, long j) throws IOException {
            C6562gT0.p(c5422bq, "sink");
            while (true) {
                int i = this.left;
                if (i == 0) {
                    this.source.skip(this.padding);
                    this.padding = 0;
                    if ((this.flags & 4) != 0) {
                        return -1L;
                    }
                    readContinuationHeader();
                } else {
                    long read = this.source.read(c5422bq, Math.min(j, i));
                    if (read == -1) {
                        return -1L;
                    }
                    this.left -= (int) read;
                    return read;
                }
            }
        }

        public final void setFlags(int i) {
            this.flags = i;
        }

        public final void setLeft(int i) {
            this.left = i;
        }

        public final void setLength(int i) {
            this.length = i;
        }

        public final void setPadding(int i) {
            this.padding = i;
        }

        public final void setStreamId(int i) {
            this.streamId = i;
        }

        @Override // o.InterfaceC7072ia2
        @NotNull
        public C8120mp2 timeout() {
            return this.source.timeout();
        }
    }

    /* loaded from: classes4.dex */
    public interface Handler {
        void ackSettings();

        void alternateService(int i, @NotNull String str, @NotNull C8859ps c8859ps, @NotNull String str2, int i2, long j);

        void data(boolean z, int i, @NotNull InterfaceC2677Cq interfaceC2677Cq, int i2) throws IOException;

        void goAway(int i, @NotNull ErrorCode errorCode, @NotNull C8859ps c8859ps);

        void headers(boolean z, int i, int i2, @NotNull List<Header> list);

        void ping(boolean z, int i, int i2);

        void priority(int i, int i2, int i3, boolean z);

        void pushPromise(int i, int i2, @NotNull List<Header> list) throws IOException;

        void rstStream(int i, @NotNull ErrorCode errorCode);

        void settings(boolean z, @NotNull Settings settings);

        void windowUpdate(int i, long j);
    }

    static {
        Logger logger2 = Logger.getLogger(Http2.class.getName());
        C6562gT0.o(logger2, "getLogger(Http2::class.java.name)");
        logger = logger2;
    }

    public Http2Reader(@NotNull InterfaceC2677Cq interfaceC2677Cq, boolean z) {
        C6562gT0.p(interfaceC2677Cq, "source");
        this.source = interfaceC2677Cq;
        this.client = z;
        ContinuationSource continuationSource = new ContinuationSource(interfaceC2677Cq);
        this.continuation = continuationSource;
        this.hpackReader = new Hpack.Reader(continuationSource, 4096, 0, 4, null);
    }

    private final void readData(Handler handler, int i, int i2, int i3) throws IOException {
        boolean z;
        if (i3 != 0) {
            int i4 = 0;
            if ((i2 & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i2 & 32) == 0) {
                if ((i2 & 8) != 0) {
                    i4 = Util.and(this.source.readByte(), 255);
                }
                handler.data(z, i3, this.source, Companion.lengthWithoutPadding(i, i2, i4));
                this.source.skip(i4);
                return;
            }
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }

    private final void readGoAway(Handler handler, int i, int i2, int i3) throws IOException {
        if (i >= 8) {
            if (i3 == 0) {
                int readInt = this.source.readInt();
                int readInt2 = this.source.readInt();
                int i4 = i - 8;
                ErrorCode fromHttp2 = ErrorCode.Companion.fromHttp2(readInt2);
                if (fromHttp2 != null) {
                    C8859ps c8859ps = C8859ps.Z0;
                    if (i4 > 0) {
                        c8859ps = this.source.n3(i4);
                    }
                    handler.goAway(readInt, fromHttp2, c8859ps);
                    return;
                }
                throw new IOException("TYPE_GOAWAY unexpected error code: " + readInt2);
            }
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        throw new IOException("TYPE_GOAWAY length < 8: " + i);
    }

    private final List<Header> readHeaderBlock(int i, int i2, int i3, int i4) throws IOException {
        this.continuation.setLeft(i);
        ContinuationSource continuationSource = this.continuation;
        continuationSource.setLength(continuationSource.getLeft());
        this.continuation.setPadding(i2);
        this.continuation.setFlags(i3);
        this.continuation.setStreamId(i4);
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private final void readHeaders(Handler handler, int i, int i2, int i3) throws IOException {
        boolean z;
        if (i3 != 0) {
            int i4 = 0;
            if ((i2 & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i2 & 8) != 0) {
                i4 = Util.and(this.source.readByte(), 255);
            }
            if ((i2 & 32) != 0) {
                readPriority(handler, i3);
                i -= 5;
            }
            handler.headers(z, i3, -1, readHeaderBlock(Companion.lengthWithoutPadding(i, i2, i4), i4, i2, i3));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    private final void readPing(Handler handler, int i, int i2, int i3) throws IOException {
        if (i == 8) {
            if (i3 == 0) {
                int readInt = this.source.readInt();
                int readInt2 = this.source.readInt();
                boolean z = true;
                if ((i2 & 1) == 0) {
                    z = false;
                }
                handler.ping(z, readInt, readInt2);
                return;
            }
            throw new IOException("TYPE_PING streamId != 0");
        }
        throw new IOException("TYPE_PING length != 8: " + i);
    }

    private final void readPriority(Handler handler, int i, int i2, int i3) throws IOException {
        if (i == 5) {
            if (i3 != 0) {
                readPriority(handler, i3);
                return;
            }
            throw new IOException("TYPE_PRIORITY streamId == 0");
        }
        throw new IOException("TYPE_PRIORITY length: " + i + " != 5");
    }

    private final void readPushPromise(Handler handler, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 != 0) {
            if ((i2 & 8) != 0) {
                i4 = Util.and(this.source.readByte(), 255);
            } else {
                i4 = 0;
            }
            handler.pushPromise(i3, this.source.readInt() & Integer.MAX_VALUE, readHeaderBlock(Companion.lengthWithoutPadding(i - 4, i2, i4), i4, i2, i3));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }

    private final void readRstStream(Handler handler, int i, int i2, int i3) throws IOException {
        if (i == 4) {
            if (i3 != 0) {
                int readInt = this.source.readInt();
                ErrorCode fromHttp2 = ErrorCode.Companion.fromHttp2(readInt);
                if (fromHttp2 != null) {
                    handler.rstStream(i3, fromHttp2);
                    return;
                }
                throw new IOException("TYPE_RST_STREAM unexpected error code: " + readInt);
            }
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        throw new IOException("TYPE_RST_STREAM length: " + i + " != 4");
    }

    private final void readSettings(Handler handler, int i, int i2, int i3) throws IOException {
        int readInt;
        if (i3 == 0) {
            if ((i2 & 1) != 0) {
                if (i == 0) {
                    handler.ackSettings();
                    return;
                }
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            } else if (i % 6 == 0) {
                Settings settings = new Settings();
                C10711xR0 B1 = C5075aO1.B1(C5075aO1.W1(0, i), 6);
                int j = B1.j();
                int k = B1.k();
                int l = B1.l();
                if ((l > 0 && j <= k) || (l < 0 && k <= j)) {
                    while (true) {
                        int and = Util.and(this.source.readShort(), 65535);
                        readInt = this.source.readInt();
                        if (and != 2) {
                            if (and != 3) {
                                if (and != 4) {
                                    if (and == 5 && (readInt < 16384 || readInt > 16777215)) {
                                        break;
                                    }
                                } else if (readInt >= 0) {
                                    and = 7;
                                } else {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                }
                            } else {
                                and = 4;
                            }
                        } else if (readInt != 0 && readInt != 1) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                        }
                        settings.set(and, readInt);
                        if (j == k) {
                            break;
                        }
                        j += l;
                    }
                    throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + readInt);
                }
                handler.settings(false, settings);
                return;
            } else {
                throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i);
            }
        }
        throw new IOException("TYPE_SETTINGS streamId != 0");
    }

    private final void readWindowUpdate(Handler handler, int i, int i2, int i3) throws IOException {
        if (i == 4) {
            long and = Util.and(this.source.readInt(), 2147483647L);
            if (and != 0) {
                handler.windowUpdate(i3, and);
                return;
            }
            throw new IOException("windowSizeIncrement was 0");
        }
        throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.source.close();
    }

    public final boolean nextFrame(boolean z, @NotNull Handler handler) throws IOException {
        C6562gT0.p(handler, "handler");
        try {
            this.source.Q2(9L);
            int readMedium = Util.readMedium(this.source);
            if (readMedium <= 16384) {
                int and = Util.and(this.source.readByte(), 255);
                int and2 = Util.and(this.source.readByte(), 255);
                int readInt = this.source.readInt() & Integer.MAX_VALUE;
                Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine(Http2.INSTANCE.frameLog(true, readInt, readMedium, and, and2));
                }
                if (z && and != 4) {
                    throw new IOException("Expected a SETTINGS frame but was " + Http2.INSTANCE.formattedType$okhttp(and));
                }
                switch (and) {
                    case 0:
                        readData(handler, readMedium, and2, readInt);
                        return true;
                    case 1:
                        readHeaders(handler, readMedium, and2, readInt);
                        return true;
                    case 2:
                        readPriority(handler, readMedium, and2, readInt);
                        return true;
                    case 3:
                        readRstStream(handler, readMedium, and2, readInt);
                        return true;
                    case 4:
                        readSettings(handler, readMedium, and2, readInt);
                        return true;
                    case 5:
                        readPushPromise(handler, readMedium, and2, readInt);
                        return true;
                    case 6:
                        readPing(handler, readMedium, and2, readInt);
                        return true;
                    case 7:
                        readGoAway(handler, readMedium, and2, readInt);
                        return true;
                    case 8:
                        readWindowUpdate(handler, readMedium, and2, readInt);
                        return true;
                    default:
                        this.source.skip(readMedium);
                        return true;
                }
            }
            throw new IOException("FRAME_SIZE_ERROR: " + readMedium);
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void readConnectionPreface(@NotNull Handler handler) throws IOException {
        C6562gT0.p(handler, "handler");
        if (this.client) {
            if (!nextFrame(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        InterfaceC2677Cq interfaceC2677Cq = this.source;
        C8859ps c8859ps = Http2.CONNECTION_PREFACE;
        C8859ps n3 = interfaceC2677Cq.n3(c8859ps.g0());
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Util.format("<< CONNECTION " + n3.A(), new Object[0]));
        }
        if (C6562gT0.g(c8859ps, n3)) {
            return;
        }
        throw new IOException("Expected a connection header but was " + n3.s0());
    }

    private final void readPriority(Handler handler, int i) throws IOException {
        int readInt = this.source.readInt();
        handler.priority(i, readInt & Integer.MAX_VALUE, Util.and(this.source.readByte(), 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }
}
