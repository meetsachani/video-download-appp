package okhttp3.internal.http2;

import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.C5422bq;
import o.C6562gT0;
import o.C9516sY;
import o.InterfaceC2579Bq;
import o.InterfaceC8303na2;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nHttp2Writer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Writer.kt\nokhttp3/internal/http2/Http2Writer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,317:1\n1#2:318\n*E\n"})
/* loaded from: classes4.dex */
public final class Http2Writer implements Closeable {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    @NotNull
    private final C5422bq hpackBuffer;
    @NotNull
    private final Hpack.Writer hpackWriter;
    private int maxFrameSize;
    @NotNull
    private final InterfaceC2579Bq sink;

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        private Companion() {
        }
    }

    public Http2Writer(@NotNull InterfaceC2579Bq interfaceC2579Bq, boolean z) {
        C6562gT0.p(interfaceC2579Bq, "sink");
        this.sink = interfaceC2579Bq;
        this.client = z;
        C5422bq c5422bq = new C5422bq();
        this.hpackBuffer = c5422bq;
        this.maxFrameSize = 16384;
        this.hpackWriter = new Hpack.Writer(0, false, c5422bq, 3, null);
    }

    private final void writeContinuationFrames(int i, long j) throws IOException {
        int i2;
        while (j > 0) {
            long min = Math.min(this.maxFrameSize, j);
            j -= min;
            int i3 = (int) min;
            if (j == 0) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            frameHeader(i, i3, 9, i2);
            this.sink.write(this.hpackBuffer, min);
        }
    }

    public final synchronized void applyAndAckSettings(@NotNull Settings settings) throws IOException {
        try {
            C6562gT0.p(settings, "peerSettings");
            if (!this.closed) {
                this.maxFrameSize = settings.getMaxFrameSize(this.maxFrameSize);
                if (settings.getHeaderTableSize() != -1) {
                    this.hpackWriter.resizeHeaderTable(settings.getHeaderTableSize());
                }
                frameHeader(0, 0, 4, 1);
                this.sink.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.closed = true;
        this.sink.close();
    }

    public final synchronized void connectionPreface() throws IOException {
        try {
            if (!this.closed) {
                if (!this.client) {
                    return;
                }
                Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine(Util.format(">> CONNECTION " + Http2.CONNECTION_PREFACE.A(), new Object[0]));
                }
                this.sink.K4(Http2.CONNECTION_PREFACE);
                this.sink.flush();
                return;
            }
            throw new IOException("closed");
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void data(boolean z, int i, @Nullable C5422bq c5422bq, int i2) throws IOException {
        if (!this.closed) {
            dataFrame(i, z ? 1 : 0, c5422bq, i2);
        } else {
            throw new IOException("closed");
        }
    }

    public final void dataFrame(int i, int i2, @Nullable C5422bq c5422bq, int i3) throws IOException {
        frameHeader(i, i3, 0, i2);
        if (i3 > 0) {
            InterfaceC2579Bq interfaceC2579Bq = this.sink;
            C6562gT0.m(c5422bq);
            interfaceC2579Bq.write(c5422bq, i3);
        }
    }

    public final synchronized void flush() throws IOException {
        if (!this.closed) {
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final void frameHeader(int i, int i2, int i3, int i4) throws IOException {
        int i5;
        int i6;
        int i7;
        int i8;
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            i5 = i;
            i6 = i2;
            i7 = i3;
            i8 = i4;
            logger2.fine(Http2.INSTANCE.frameLog(false, i5, i6, i7, i8));
        } else {
            i5 = i;
            i6 = i2;
            i7 = i3;
            i8 = i4;
        }
        if (i6 <= this.maxFrameSize) {
            if ((Integer.MIN_VALUE & i5) == 0) {
                Util.writeMedium(this.sink, i6);
                this.sink.writeByte(i7 & 255);
                this.sink.writeByte(i8 & 255);
                this.sink.writeInt(Integer.MAX_VALUE & i5);
                return;
            }
            throw new IllegalArgumentException(("reserved bit set: " + i5).toString());
        }
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.maxFrameSize + ": " + i6).toString());
    }

    @NotNull
    public final Hpack.Writer getHpackWriter() {
        return this.hpackWriter;
    }

    public final synchronized void goAway(int i, @NotNull ErrorCode errorCode, @NotNull byte[] bArr) throws IOException {
        try {
            C6562gT0.p(errorCode, "errorCode");
            C6562gT0.p(bArr, "debugData");
            if (!this.closed) {
                if (errorCode.getHttpCode() != -1) {
                    boolean z = false;
                    frameHeader(0, bArr.length + 8, 7, 0);
                    this.sink.writeInt(i);
                    this.sink.writeInt(errorCode.getHttpCode());
                    if (bArr.length == 0) {
                        z = true;
                    }
                    if (!z) {
                        this.sink.write(bArr);
                    }
                    this.sink.flush();
                } else {
                    throw new IllegalArgumentException("errorCode.httpCode == -1");
                }
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void headers(boolean z, int i, @NotNull List<Header> list) throws IOException {
        int i2;
        C6562gT0.p(list, "headerBlock");
        if (!this.closed) {
            this.hpackWriter.writeHeaders(list);
            long size = this.hpackBuffer.size();
            long min = Math.min(this.maxFrameSize, size);
            int i3 = (size > min ? 1 : (size == min ? 0 : -1));
            if (i3 == 0) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            if (z) {
                i2 |= 1;
            }
            frameHeader(i, (int) min, 1, i2);
            this.sink.write(this.hpackBuffer, min);
            if (i3 > 0) {
                writeContinuationFrames(i, size - min);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final int maxDataLength() {
        return this.maxFrameSize;
    }

    public final synchronized void ping(boolean z, int i, int i2) throws IOException {
        if (!this.closed) {
            frameHeader(0, 8, 6, z ? 1 : 0);
            this.sink.writeInt(i);
            this.sink.writeInt(i2);
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void pushPromise(int i, int i2, @NotNull List<Header> list) throws IOException {
        int i3;
        C6562gT0.p(list, "requestHeaders");
        if (!this.closed) {
            this.hpackWriter.writeHeaders(list);
            long size = this.hpackBuffer.size();
            int min = (int) Math.min(this.maxFrameSize - 4, size);
            int i4 = min + 4;
            long j = min;
            int i5 = (size > j ? 1 : (size == j ? 0 : -1));
            if (i5 == 0) {
                i3 = 4;
            } else {
                i3 = 0;
            }
            frameHeader(i, i4, 5, i3);
            this.sink.writeInt(i2 & Integer.MAX_VALUE);
            this.sink.write(this.hpackBuffer, j);
            if (i5 > 0) {
                writeContinuationFrames(i, size - j);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void rstStream(int i, @NotNull ErrorCode errorCode) throws IOException {
        C6562gT0.p(errorCode, "errorCode");
        if (!this.closed) {
            if (errorCode.getHttpCode() != -1) {
                frameHeader(i, 4, 3, 0);
                this.sink.writeInt(errorCode.getHttpCode());
                this.sink.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.");
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void settings(@NotNull Settings settings) throws IOException {
        int i;
        try {
            C6562gT0.p(settings, RemoteConfigComponent.f388o);
            if (!this.closed) {
                frameHeader(0, settings.size() * 6, 4, 0);
                for (int i2 = 0; i2 < 10; i2++) {
                    if (settings.isSet(i2)) {
                        if (i2 != 4) {
                            if (i2 != 7) {
                                i = i2;
                            } else {
                                i = 4;
                            }
                        } else {
                            i = 3;
                        }
                        this.sink.writeShort(i);
                        this.sink.writeInt(settings.get(i2));
                    }
                }
                this.sink.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void windowUpdate(int i, long j) throws IOException {
        if (!this.closed) {
            if (j != 0 && j <= 2147483647L) {
                frameHeader(i, 4, 8, 0);
                this.sink.writeInt((int) j);
                this.sink.flush();
            } else {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
            }
        } else {
            throw new IOException("closed");
        }
    }
}
