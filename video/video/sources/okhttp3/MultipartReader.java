package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import o.C4500Ve2;
import o.C5205aw1;
import o.C5422bq;
import o.C6562gT0;
import o.C8120mp2;
import o.C8859ps;
import o.C9516sY;
import o.C9604su1;
import o.InterfaceC2677Cq;
import o.InterfaceC7072ia2;
import o.InterfaceC8046mW0;
import o.InterfaceC8303na2;
import o.VI0;
import okhttp3.internal.http1.HeadersReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nMultipartReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n1#2:211\n*E\n"})
/* loaded from: classes4.dex */
public final class MultipartReader implements Closeable {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final C5205aw1 afterBoundaryOptions;
    @NotNull
    private final String boundary;
    private boolean closed;
    @NotNull
    private final C8859ps crlfDashDashBoundary;
    @Nullable
    private PartSource currentPart;
    @NotNull
    private final C8859ps dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    @NotNull
    private final InterfaceC2677Cq source;

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        @NotNull
        public final C5205aw1 getAfterBoundaryOptions() {
            return MultipartReader.afterBoundaryOptions;
        }

        private Companion() {
        }
    }

    /* loaded from: classes4.dex */
    public static final class Part implements Closeable {
        @NotNull
        private final InterfaceC2677Cq body;
        @NotNull
        private final Headers headers;

        public Part(@NotNull Headers headers, @NotNull InterfaceC2677Cq interfaceC2677Cq) {
            C6562gT0.p(headers, "headers");
            C6562gT0.p(interfaceC2677Cq, "body");
            this.headers = headers;
            this.body = interfaceC2677Cq;
        }

        @InterfaceC8046mW0(name = "body")
        @NotNull
        public final InterfaceC2677Cq body() {
            return this.body;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.body.close();
        }

        @InterfaceC8046mW0(name = "headers")
        @NotNull
        public final Headers headers() {
            return this.headers;
        }
    }

    @InterfaceC8303na2({"SMAP\nMultipartReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader$PartSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Timeout.kt\nokio/Timeout\n*L\n1#1,210:1\n1#2:211\n268#3,26:212\n*S KotlinDebug\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader$PartSource\n*L\n159#1:212,26\n*E\n"})
    /* loaded from: classes4.dex */
    public final class PartSource implements InterfaceC7072ia2 {
        @NotNull
        private final C8120mp2 timeout = new C8120mp2();

        public PartSource() {
        }

        @Override // o.InterfaceC7072ia2, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (C6562gT0.g(MultipartReader.this.currentPart, this)) {
                MultipartReader.this.currentPart = null;
            }
        }

        @Override // o.InterfaceC7072ia2
        public long read(@NotNull C5422bq c5422bq, long j) {
            long read;
            long j2;
            long read2;
            C6562gT0.p(c5422bq, "sink");
            if (j >= 0) {
                if (C6562gT0.g(MultipartReader.this.currentPart, this)) {
                    C8120mp2 timeout = MultipartReader.this.source.timeout();
                    C8120mp2 c8120mp2 = this.timeout;
                    MultipartReader multipartReader = MultipartReader.this;
                    long timeoutNanos = timeout.timeoutNanos();
                    long a = C8120mp2.Companion.a(c8120mp2.timeoutNanos(), timeout.timeoutNanos());
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    timeout.timeout(a, timeUnit);
                    if (timeout.hasDeadline()) {
                        long deadlineNanoTime = timeout.deadlineNanoTime();
                        if (c8120mp2.hasDeadline()) {
                            j2 = 0;
                            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), c8120mp2.deadlineNanoTime()));
                        } else {
                            j2 = 0;
                        }
                        try {
                            long currentPartBytesRemaining = multipartReader.currentPartBytesRemaining(j);
                            if (currentPartBytesRemaining == j2) {
                                read2 = -1;
                            } else {
                                read2 = multipartReader.source.read(c5422bq, currentPartBytesRemaining);
                            }
                            timeout.timeout(timeoutNanos, timeUnit);
                            if (c8120mp2.hasDeadline()) {
                                timeout.deadlineNanoTime(deadlineNanoTime);
                            }
                            return read2;
                        } catch (Throwable th) {
                            timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                            if (c8120mp2.hasDeadline()) {
                                timeout.deadlineNanoTime(deadlineNanoTime);
                            }
                            throw th;
                        }
                    }
                    if (c8120mp2.hasDeadline()) {
                        timeout.deadlineNanoTime(c8120mp2.deadlineNanoTime());
                    }
                    try {
                        long currentPartBytesRemaining2 = multipartReader.currentPartBytesRemaining(j);
                        if (currentPartBytesRemaining2 == 0) {
                            read = -1;
                        } else {
                            read = multipartReader.source.read(c5422bq, currentPartBytesRemaining2);
                        }
                        timeout.timeout(timeoutNanos, timeUnit);
                        if (c8120mp2.hasDeadline()) {
                            timeout.clearDeadline();
                        }
                        return read;
                    } catch (Throwable th2) {
                        timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                        if (c8120mp2.hasDeadline()) {
                            timeout.clearDeadline();
                        }
                        throw th2;
                    }
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }

        @Override // o.InterfaceC7072ia2
        @NotNull
        public C8120mp2 timeout() {
            return this.timeout;
        }
    }

    static {
        C5205aw1.a aVar = C5205aw1.Z0;
        C8859ps.a aVar2 = C8859ps.Y0;
        afterBoundaryOptions = aVar.d(aVar2.l(VI0.D), aVar2.l("--"), aVar2.l(C4500Ve2.b), aVar2.l("\t"));
    }

    public MultipartReader(@NotNull InterfaceC2677Cq interfaceC2677Cq, @NotNull String str) throws IOException {
        C6562gT0.p(interfaceC2677Cq, "source");
        C6562gT0.p(str, "boundary");
        this.source = interfaceC2677Cq;
        this.boundary = str;
        this.dashDashBoundary = new C5422bq().K1("--").K1(str).G4();
        this.crlfDashDashBoundary = new C5422bq().K1("\r\n--").K1(str).G4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long currentPartBytesRemaining(long j) {
        this.source.Q2(this.crlfDashDashBoundary.g0());
        long w1 = this.source.B().w1(this.crlfDashDashBoundary);
        if (w1 == -1) {
            return Math.min(j, (this.source.B().size() - this.crlfDashDashBoundary.g0()) + 1);
        }
        return Math.min(j, w1);
    }

    @InterfaceC8046mW0(name = "boundary")
    @NotNull
    public final String boundary() {
        return this.boundary;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }

    @Nullable
    public final Part nextPart() throws IOException {
        if (!this.closed) {
            if (this.noMoreParts) {
                return null;
            }
            if (this.partCount == 0 && this.source.a1(0L, this.dashDashBoundary)) {
                this.source.skip(this.dashDashBoundary.g0());
            } else {
                while (true) {
                    long currentPartBytesRemaining = currentPartBytesRemaining(8192L);
                    if (currentPartBytesRemaining == 0) {
                        break;
                    }
                    this.source.skip(currentPartBytesRemaining);
                }
                this.source.skip(this.crlfDashDashBoundary.g0());
            }
            boolean z = false;
            while (true) {
                int I5 = this.source.I5(afterBoundaryOptions);
                if (I5 != -1) {
                    if (I5 != 0) {
                        if (I5 != 1) {
                            if (I5 == 2 || I5 == 3) {
                                z = true;
                            }
                        } else if (!z) {
                            if (this.partCount != 0) {
                                this.noMoreParts = true;
                                return null;
                            }
                            throw new ProtocolException("expected at least 1 part");
                        } else {
                            throw new ProtocolException("unexpected characters after boundary");
                        }
                    } else {
                        this.partCount++;
                        Headers readHeaders = new HeadersReader(this.source).readHeaders();
                        PartSource partSource = new PartSource();
                        this.currentPart = partSource;
                        return new Part(readHeaders, C9604su1.e(partSource));
                    }
                } else {
                    throw new ProtocolException("unexpected characters after boundary");
                }
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MultipartReader(@NotNull ResponseBody responseBody) throws IOException {
        this(r0, r3);
        String parameter;
        C6562gT0.p(responseBody, "response");
        InterfaceC2677Cq source = responseBody.source();
        MediaType contentType = responseBody.contentType();
        if (contentType != null && (parameter = contentType.parameter("boundary")) != null) {
            return;
        }
        throw new ProtocolException("expected the Content-Type to have a boundary parameter");
    }
}
