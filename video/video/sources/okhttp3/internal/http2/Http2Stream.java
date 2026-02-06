package okhttp3.internal.http2;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import o.C3526Lf;
import o.C5422bq;
import o.C6562gT0;
import o.C7458kA2;
import o.C8120mp2;
import o.C9516sY;
import o.InterfaceC2677Cq;
import o.InterfaceC7072ia2;
import o.InterfaceC8303na2;
import o.J82;
import okhttp3.Headers;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nHttp2Stream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,688:1\n1#2:689\n615#3,4:690\n615#3,4:694\n563#3:698\n615#3,4:699\n615#3,4:703\n563#3:707\n563#3:708\n615#3,4:709\n563#3:713\n557#3:714\n*S KotlinDebug\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream\n*L\n176#1:690,4\n255#1:694,4\n263#1:698\n274#1:699,4\n281#1:703,4\n295#1:707\n305#1:708\n491#1:709,4\n637#1:713\n657#1:714\n*E\n"})
/* loaded from: classes4.dex */
public final class Http2Stream {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final long EMIT_BUFFER_SIZE = 16384;
    @NotNull
    private final Http2Connection connection;
    @Nullable
    private ErrorCode errorCode;
    @Nullable
    private IOException errorException;
    private boolean hasResponseHeaders;
    @NotNull
    private final ArrayDeque<Headers> headersQueue;
    private final int id;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    @NotNull
    private final StreamTimeout readTimeout;
    @NotNull
    private final FramingSink sink;
    @NotNull
    private final FramingSource source;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    @NotNull
    private final StreamTimeout writeTimeout;

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        private Companion() {
        }
    }

    @InterfaceC8303na2({"SMAP\nHttp2Stream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,688:1\n1#2:689\n615#3,4:690\n615#3,4:694\n563#3:698\n563#3:699\n*S KotlinDebug\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSource\n*L\n407#1:690,4\n418#1:694,4\n458#1:698\n480#1:699\n*E\n"})
    /* loaded from: classes4.dex */
    public final class FramingSource implements InterfaceC7072ia2 {
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;
        @Nullable
        private Headers trailers;
        @NotNull
        private final C5422bq receiveBuffer = new C5422bq();
        @NotNull
        private final C5422bq readBuffer = new C5422bq();

        public FramingSource(long j, boolean z) {
            this.maxByteCount = j;
            this.finished = z;
        }

        private final void updateConnectionFlowControl(long j) {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            Http2Stream.this.getConnection().updateConnectionFlowControl$okhttp(j);
        }

        @Override // o.InterfaceC7072ia2, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long size;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                this.closed = true;
                size = this.readBuffer.size();
                this.readBuffer.h();
                C6562gT0.n(http2Stream, "null cannot be cast to non-null type java.lang.Object");
                http2Stream.notifyAll();
                C7458kA2 c7458kA2 = C7458kA2.a;
            }
            if (size > 0) {
                updateConnectionFlowControl(size);
            }
            Http2Stream.this.cancelStreamIfNecessary$okhttp();
        }

        public final boolean getClosed$okhttp() {
            return this.closed;
        }

        public final boolean getFinished$okhttp() {
            return this.finished;
        }

        @NotNull
        public final C5422bq getReadBuffer() {
            return this.readBuffer;
        }

        @NotNull
        public final C5422bq getReceiveBuffer() {
            return this.receiveBuffer;
        }

        @Nullable
        public final Headers getTrailers() {
            return this.trailers;
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x00c2, code lost:
            throw new java.io.IOException("stream closed");
         */
        @Override // o.InterfaceC7072ia2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public long read(@NotNull C5422bq c5422bq, long j) throws IOException {
            IOException iOException;
            boolean z;
            long j2;
            C6562gT0.p(c5422bq, "sink");
            long j3 = 0;
            if (j < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            }
            while (true) {
                Http2Stream http2Stream = Http2Stream.this;
                synchronized (http2Stream) {
                    http2Stream.getReadTimeout$okhttp().enter();
                    if (http2Stream.getErrorCode$okhttp() != null && !this.finished) {
                        iOException = http2Stream.getErrorException$okhttp();
                        if (iOException == null) {
                            ErrorCode errorCode$okhttp = http2Stream.getErrorCode$okhttp();
                            C6562gT0.m(errorCode$okhttp);
                            iOException = new StreamResetException(errorCode$okhttp);
                        }
                    } else {
                        iOException = null;
                    }
                    if (this.closed) {
                        break;
                    }
                    z = false;
                    if (this.readBuffer.size() > j3) {
                        C5422bq c5422bq2 = this.readBuffer;
                        j2 = c5422bq2.read(c5422bq, Math.min(j, c5422bq2.size()));
                        http2Stream.setReadBytesTotal$okhttp(http2Stream.getReadBytesTotal() + j2);
                        long readBytesTotal = http2Stream.getReadBytesTotal() - http2Stream.getReadBytesAcknowledged();
                        if (iOException == null && readBytesTotal >= http2Stream.getConnection().getOkHttpSettings().getInitialWindowSize() / 2) {
                            http2Stream.getConnection().writeWindowUpdateLater$okhttp(http2Stream.getId(), readBytesTotal);
                            http2Stream.setReadBytesAcknowledged$okhttp(http2Stream.getReadBytesTotal());
                        }
                    } else {
                        if (!this.finished && iOException == null) {
                            http2Stream.waitForIo$okhttp();
                            z = true;
                        }
                        j2 = -1;
                    }
                    http2Stream.getReadTimeout$okhttp().exitAndThrowIfTimedOut();
                    C7458kA2 c7458kA2 = C7458kA2.a;
                }
                if (z) {
                    j3 = 0;
                } else if (j2 != -1) {
                    return j2;
                } else {
                    if (iOException == null) {
                        return -1L;
                    }
                    throw iOException;
                }
            }
        }

        public final void receive$okhttp(@NotNull InterfaceC2677Cq interfaceC2677Cq, long j) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            C6562gT0.p(interfaceC2677Cq, "source");
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            long j2 = j;
            while (j2 > 0) {
                synchronized (Http2Stream.this) {
                    z = this.finished;
                    z2 = false;
                    if (this.readBuffer.size() + j2 > this.maxByteCount) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    C7458kA2 c7458kA2 = C7458kA2.a;
                }
                if (z3) {
                    interfaceC2677Cq.skip(j2);
                    Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    interfaceC2677Cq.skip(j2);
                    return;
                } else {
                    long read = interfaceC2677Cq.read(this.receiveBuffer, j2);
                    if (read != -1) {
                        j2 -= read;
                        Http2Stream http2Stream2 = Http2Stream.this;
                        synchronized (http2Stream2) {
                            try {
                                if (this.closed) {
                                    this.receiveBuffer.h();
                                } else {
                                    if (this.readBuffer.size() == 0) {
                                        z2 = true;
                                    }
                                    this.readBuffer.Q1(this.receiveBuffer);
                                    if (z2) {
                                        C6562gT0.n(http2Stream2, "null cannot be cast to non-null type java.lang.Object");
                                        http2Stream2.notifyAll();
                                    }
                                }
                            } finally {
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
            updateConnectionFlowControl(j);
        }

        public final void setClosed$okhttp(boolean z) {
            this.closed = z;
        }

        public final void setFinished$okhttp(boolean z) {
            this.finished = z;
        }

        public final void setTrailers(@Nullable Headers headers) {
            this.trailers = headers;
        }

        @Override // o.InterfaceC7072ia2
        @NotNull
        public C8120mp2 timeout() {
            return Http2Stream.this.getReadTimeout$okhttp();
        }
    }

    /* loaded from: classes4.dex */
    public final class StreamTimeout extends C3526Lf {
        public StreamTimeout() {
        }

        public final void exitAndThrowIfTimedOut() throws IOException {
            if (!exit()) {
                return;
            }
            throw newTimeoutException(null);
        }

        @Override // o.C3526Lf
        @NotNull
        public IOException newTimeoutException(@Nullable IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // o.C3526Lf
        public void timedOut() {
            Http2Stream.this.closeLater(ErrorCode.CANCEL);
            Http2Stream.this.getConnection().sendDegradedPingLater$okhttp();
        }
    }

    public Http2Stream(int i, @NotNull Http2Connection http2Connection, boolean z, boolean z2, @Nullable Headers headers) {
        C6562gT0.p(http2Connection, "connection");
        this.id = i;
        this.connection = http2Connection;
        this.writeBytesMaximum = http2Connection.getPeerSettings().getInitialWindowSize();
        ArrayDeque<Headers> arrayDeque = new ArrayDeque<>();
        this.headersQueue = arrayDeque;
        this.source = new FramingSource(http2Connection.getOkHttpSettings().getInitialWindowSize(), z2);
        this.sink = new FramingSink(z);
        this.readTimeout = new StreamTimeout();
        this.writeTimeout = new StreamTimeout();
        if (headers != null) {
            if (!isLocallyInitiated()) {
                arrayDeque.add(headers);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        } else if (isLocallyInitiated()) {
        } else {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    private final boolean closeInternal(ErrorCode errorCode, IOException iOException) {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (this.errorCode != null) {
                return false;
            }
            this.errorCode = errorCode;
            this.errorException = iOException;
            C6562gT0.n(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            if (this.source.getFinished$okhttp() && this.sink.getFinished()) {
                return false;
            }
            C7458kA2 c7458kA2 = C7458kA2.a;
            this.connection.removeStream$okhttp(this.id);
            return true;
        }
    }

    public final void addBytesToWriteWindow(long j) {
        this.writeBytesMaximum += j;
        if (j > 0) {
            C6562gT0.n(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void cancelStreamIfNecessary$okhttp() throws IOException {
        boolean z;
        boolean isOpen;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.source.getFinished$okhttp() || !this.source.getClosed$okhttp() || (!this.sink.getFinished() && !this.sink.getClosed())) {
                    z = false;
                    isOpen = isOpen();
                    C7458kA2 c7458kA2 = C7458kA2.a;
                }
                z = true;
                isOpen = isOpen();
                C7458kA2 c7458kA22 = C7458kA2.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            close(ErrorCode.CANCEL, null);
        } else if (!isOpen) {
            this.connection.removeStream$okhttp(this.id);
        }
    }

    public final void checkOutNotClosed$okhttp() throws IOException {
        if (!this.sink.getClosed()) {
            if (!this.sink.getFinished()) {
                if (this.errorCode != null) {
                    IOException iOException = this.errorException;
                    if (iOException == null) {
                        ErrorCode errorCode = this.errorCode;
                        C6562gT0.m(errorCode);
                        throw new StreamResetException(errorCode);
                    }
                    throw iOException;
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    public final void close(@NotNull ErrorCode errorCode, @Nullable IOException iOException) throws IOException {
        C6562gT0.p(errorCode, "rstStatusCode");
        if (!closeInternal(errorCode, iOException)) {
            return;
        }
        this.connection.writeSynReset$okhttp(this.id, errorCode);
    }

    public final void closeLater(@NotNull ErrorCode errorCode) {
        C6562gT0.p(errorCode, "errorCode");
        if (!closeInternal(errorCode, null)) {
            return;
        }
        this.connection.writeSynResetLater$okhttp(this.id, errorCode);
    }

    public final void enqueueTrailers(@NotNull Headers headers) {
        C6562gT0.p(headers, "trailers");
        synchronized (this) {
            if (!this.sink.getFinished()) {
                if (headers.size() != 0) {
                    this.sink.setTrailers(headers);
                    C7458kA2 c7458kA2 = C7458kA2.a;
                } else {
                    throw new IllegalArgumentException("trailers.size() == 0");
                }
            } else {
                throw new IllegalStateException("already finished");
            }
        }
    }

    @NotNull
    public final Http2Connection getConnection() {
        return this.connection;
    }

    @Nullable
    public final synchronized ErrorCode getErrorCode$okhttp() {
        return this.errorCode;
    }

    @Nullable
    public final IOException getErrorException$okhttp() {
        return this.errorException;
    }

    public final int getId() {
        return this.id;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    @NotNull
    public final StreamTimeout getReadTimeout$okhttp() {
        return this.readTimeout;
    }

    @NotNull
    public final J82 getSink() {
        synchronized (this) {
            try {
                if (!this.hasResponseHeaders && !isLocallyInitiated()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                C7458kA2 c7458kA2 = C7458kA2.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.sink;
    }

    @NotNull
    public final FramingSink getSink$okhttp() {
        return this.sink;
    }

    @NotNull
    public final InterfaceC7072ia2 getSource() {
        return this.source;
    }

    @NotNull
    public final FramingSource getSource$okhttp() {
        return this.source;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    @NotNull
    public final StreamTimeout getWriteTimeout$okhttp() {
        return this.writeTimeout;
    }

    public final boolean isLocallyInitiated() {
        boolean z;
        if ((this.id & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (this.connection.getClient$okhttp() == z) {
            return true;
        }
        return false;
    }

    public final synchronized boolean isOpen() {
        try {
            if (this.errorCode != null) {
                return false;
            }
            if (!this.source.getFinished$okhttp()) {
                if (this.source.getClosed$okhttp()) {
                }
                return true;
            }
            if (this.sink.getFinished() || this.sink.getClosed()) {
                if (this.hasResponseHeaders) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @NotNull
    public final C8120mp2 readTimeout() {
        return this.readTimeout;
    }

    public final void receiveData(@NotNull InterfaceC2677Cq interfaceC2677Cq, int i) throws IOException {
        C6562gT0.p(interfaceC2677Cq, "source");
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        this.source.receive$okhttp(interfaceC2677Cq, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051 A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:10:0x0038, B:14:0x0040, B:19:0x0051, B:20:0x0056, B:17:0x0048), top: B:27:0x0038 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void receiveHeaders(@NotNull Headers headers, boolean z) {
        boolean isOpen;
        C6562gT0.p(headers, "headers");
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.hasResponseHeaders && z) {
                    this.source.setTrailers(headers);
                    if (z) {
                        this.source.setFinished$okhttp(true);
                    }
                    isOpen = isOpen();
                    C6562gT0.n(this, "null cannot be cast to non-null type java.lang.Object");
                    notifyAll();
                    C7458kA2 c7458kA2 = C7458kA2.a;
                }
                this.hasResponseHeaders = true;
                this.headersQueue.add(headers);
                if (z) {
                }
                isOpen = isOpen();
                C6562gT0.n(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
                C7458kA2 c7458kA22 = C7458kA2.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!isOpen) {
            this.connection.removeStream$okhttp(this.id);
        }
    }

    public final synchronized void receiveRstStream(@NotNull ErrorCode errorCode) {
        C6562gT0.p(errorCode, "errorCode");
        if (this.errorCode == null) {
            this.errorCode = errorCode;
            C6562gT0.n(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void setErrorCode$okhttp(@Nullable ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public final void setErrorException$okhttp(@Nullable IOException iOException) {
        this.errorException = iOException;
    }

    public final void setReadBytesAcknowledged$okhttp(long j) {
        this.readBytesAcknowledged = j;
    }

    public final void setReadBytesTotal$okhttp(long j) {
        this.readBytesTotal = j;
    }

    public final void setWriteBytesMaximum$okhttp(long j) {
        this.writeBytesMaximum = j;
    }

    public final void setWriteBytesTotal$okhttp(long j) {
        this.writeBytesTotal = j;
    }

    @NotNull
    public final synchronized Headers takeHeaders() throws IOException {
        Headers removeFirst;
        this.readTimeout.enter();
        while (this.headersQueue.isEmpty() && this.errorCode == null) {
            waitForIo$okhttp();
        }
        this.readTimeout.exitAndThrowIfTimedOut();
        if (!this.headersQueue.isEmpty()) {
            removeFirst = this.headersQueue.removeFirst();
            C6562gT0.o(removeFirst, "headersQueue.removeFirst()");
        } else {
            IOException iOException = this.errorException;
            if (iOException == null) {
                ErrorCode errorCode = this.errorCode;
                C6562gT0.m(errorCode);
                throw new StreamResetException(errorCode);
            }
            throw iOException;
        }
        return removeFirst;
    }

    @NotNull
    public final synchronized Headers trailers() throws IOException {
        Headers trailers;
        if (this.source.getFinished$okhttp() && this.source.getReceiveBuffer().M3() && this.source.getReadBuffer().M3()) {
            trailers = this.source.getTrailers();
            if (trailers == null) {
                trailers = Util.EMPTY_HEADERS;
            }
        } else if (this.errorCode != null) {
            IOException iOException = this.errorException;
            if (iOException == null) {
                ErrorCode errorCode = this.errorCode;
                C6562gT0.m(errorCode);
                throw new StreamResetException(errorCode);
            }
            throw iOException;
        } else {
            throw new IllegalStateException("too early; can't read the trailers yet");
        }
        return trailers;
    }

    public final void waitForIo$okhttp() throws InterruptedIOException {
        try {
            C6562gT0.n(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final void writeHeaders(@NotNull List<Header> list, boolean z, boolean z2) throws IOException {
        boolean z3;
        C6562gT0.p(list, "responseHeaders");
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            z3 = true;
            try {
                this.hasResponseHeaders = true;
                if (z) {
                    this.sink.setFinished(true);
                }
                C7458kA2 c7458kA2 = C7458kA2.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            synchronized (this.connection) {
                if (this.connection.getWriteBytesTotal() < this.connection.getWriteBytesMaximum()) {
                    z3 = false;
                }
            }
            z2 = z3;
        }
        this.connection.writeHeaders$okhttp(this.id, z, list);
        if (z2) {
            this.connection.flush();
        }
    }

    @NotNull
    public final C8120mp2 writeTimeout() {
        return this.writeTimeout;
    }

    @InterfaceC8303na2({"SMAP\nHttp2Stream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSink\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,688:1\n615#2,4:689\n615#2,4:693\n615#2,4:697\n*S KotlinDebug\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSink\n*L\n528#1:689,4\n573#1:693,4\n589#1:697,4\n*E\n"})
    /* loaded from: classes4.dex */
    public final class FramingSink implements J82 {
        private boolean closed;
        private boolean finished;
        @NotNull
        private final C5422bq sendBuffer;
        @Nullable
        private Headers trailers;

        public FramingSink(boolean z) {
            this.finished = z;
            this.sendBuffer = new C5422bq();
        }

        private final void emitFrame(boolean z) throws IOException {
            long min;
            boolean z2;
            boolean z3;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                try {
                    http2Stream.getWriteTimeout$okhttp().enter();
                    while (http2Stream.getWriteBytesTotal() >= http2Stream.getWriteBytesMaximum() && !this.finished && !this.closed && http2Stream.getErrorCode$okhttp() == null) {
                        http2Stream.waitForIo$okhttp();
                    }
                    http2Stream.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                    http2Stream.checkOutNotClosed$okhttp();
                    min = Math.min(http2Stream.getWriteBytesMaximum() - http2Stream.getWriteBytesTotal(), this.sendBuffer.size());
                    http2Stream.setWriteBytesTotal$okhttp(http2Stream.getWriteBytesTotal() + min);
                    if (z && min == this.sendBuffer.size()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = z2;
                    C7458kA2 c7458kA2 = C7458kA2.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            Http2Stream.this.getWriteTimeout$okhttp().enter();
            try {
                Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), z3, this.sendBuffer, min);
            } finally {
                Http2Stream.this.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
            }
        }

        @Override // o.J82, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            boolean z;
            boolean z2;
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            Http2Stream http2Stream2 = Http2Stream.this;
            synchronized (http2Stream2) {
                if (this.closed) {
                    return;
                }
                if (http2Stream2.getErrorCode$okhttp() == null) {
                    z = true;
                } else {
                    z = false;
                }
                C7458kA2 c7458kA2 = C7458kA2.a;
                if (!Http2Stream.this.getSink$okhttp().finished) {
                    if (this.sendBuffer.size() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (this.trailers != null) {
                        while (this.sendBuffer.size() > 0) {
                            emitFrame(false);
                        }
                        Http2Connection connection = Http2Stream.this.getConnection();
                        int id = Http2Stream.this.getId();
                        Headers headers = this.trailers;
                        C6562gT0.m(headers);
                        connection.writeHeaders$okhttp(id, z, Util.toHeaderList(headers));
                    } else if (z2) {
                        while (this.sendBuffer.size() > 0) {
                            emitFrame(true);
                        }
                    } else if (z) {
                        Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), true, null, 0L);
                    }
                }
                synchronized (Http2Stream.this) {
                    this.closed = true;
                    C7458kA2 c7458kA22 = C7458kA2.a;
                }
                Http2Stream.this.getConnection().flush();
                Http2Stream.this.cancelStreamIfNecessary$okhttp();
            }
        }

        @Override // o.J82, java.io.Flushable
        public void flush() throws IOException {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            Http2Stream http2Stream2 = Http2Stream.this;
            synchronized (http2Stream2) {
                http2Stream2.checkOutNotClosed$okhttp();
                C7458kA2 c7458kA2 = C7458kA2.a;
            }
            while (this.sendBuffer.size() > 0) {
                emitFrame(false);
                Http2Stream.this.getConnection().flush();
            }
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final boolean getFinished() {
            return this.finished;
        }

        @Nullable
        public final Headers getTrailers() {
            return this.trailers;
        }

        public final void setClosed(boolean z) {
            this.closed = z;
        }

        public final void setFinished(boolean z) {
            this.finished = z;
        }

        public final void setTrailers(@Nullable Headers headers) {
            this.trailers = headers;
        }

        @Override // o.J82
        @NotNull
        public C8120mp2 timeout() {
            return Http2Stream.this.getWriteTimeout$okhttp();
        }

        @Override // o.J82
        public void write(@NotNull C5422bq c5422bq, long j) throws IOException {
            C6562gT0.p(c5422bq, "source");
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            this.sendBuffer.write(c5422bq, j);
            while (this.sendBuffer.size() >= 16384) {
                emitFrame(false);
            }
        }

        public /* synthetic */ FramingSink(Http2Stream http2Stream, boolean z, int i, C9516sY c9516sY) {
            this((i & 1) != 0 ? false : z);
        }
    }
}
