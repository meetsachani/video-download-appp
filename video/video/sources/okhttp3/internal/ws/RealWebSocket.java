package okhttp3.internal.ws;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import o.AI0;
import o.C11197zR0;
import o.C3771Nr1;
import o.C6562gT0;
import o.C7458kA2;
import o.C7979mF;
import o.C8859ps;
import o.C9516sY;
import o.C9545sf2;
import o.InterfaceC2579Bq;
import o.InterfaceC2677Cq;
import o.InterfaceC8303na2;
import o.SQ0;
import o.W12;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.ws.RealWebSocket;
import okhttp3.internal.ws.WebSocketReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nRealWebSocket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealWebSocket.kt\nokhttp3/internal/ws/RealWebSocket\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 4 Util.kt\nokhttp3/internal/Util\n*L\n1#1,654:1\n1#2:655\n84#3,4:656\n90#3,13:664\n608#4,4:660\n*S KotlinDebug\n*F\n+ 1 RealWebSocket.kt\nokhttp3/internal/ws/RealWebSocket\n*L\n269#1:656,4\n512#1:664,13\n457#1:660,4\n*E\n"})
/* loaded from: classes4.dex */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 1024;
    private static final long MAX_QUEUE_SIZE = 16777216;
    private boolean awaitingPong;
    @Nullable
    private Call call;
    private boolean enqueuedClose;
    @Nullable
    private WebSocketExtensions extensions;
    private boolean failed;
    @NotNull
    private final String key;
    @NotNull
    private final WebSocketListener listener;
    @NotNull
    private final ArrayDeque<Object> messageAndCloseQueue;
    private long minimumDeflateSize;
    @Nullable
    private String name;
    @NotNull
    private final Request originalRequest;
    private final long pingIntervalMillis;
    @NotNull
    private final ArrayDeque<C8859ps> pongQueue;
    private long queueSize;
    @NotNull
    private final Random random;
    @Nullable
    private WebSocketReader reader;
    private int receivedCloseCode;
    @Nullable
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    @Nullable
    private Streams streams;
    @NotNull
    private TaskQueue taskQueue;
    @Nullable
    private WebSocketWriter writer;
    @Nullable
    private Task writerTask;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final List<Protocol> ONLY_HTTP1 = C7979mF.k(Protocol.HTTP_1_1);

    /* loaded from: classes4.dex */
    public static final class Close {
        private final long cancelAfterCloseMillis;
        private final int code;
        @Nullable
        private final C8859ps reason;

        public Close(int i, @Nullable C8859ps c8859ps, long j) {
            this.code = i;
            this.reason = c8859ps;
            this.cancelAfterCloseMillis = j;
        }

        public final long getCancelAfterCloseMillis() {
            return this.cancelAfterCloseMillis;
        }

        public final int getCode() {
            return this.code;
        }

        @Nullable
        public final C8859ps getReason() {
            return this.reason;
        }
    }

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        private Companion() {
        }
    }

    /* loaded from: classes4.dex */
    public static final class Message {
        @NotNull
        private final C8859ps data;
        private final int formatOpcode;

        public Message(int i, @NotNull C8859ps c8859ps) {
            C6562gT0.p(c8859ps, "data");
            this.formatOpcode = i;
            this.data = c8859ps;
        }

        @NotNull
        public final C8859ps getData() {
            return this.data;
        }

        public final int getFormatOpcode() {
            return this.formatOpcode;
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class Streams implements Closeable {
        private final boolean client;
        @NotNull
        private final InterfaceC2579Bq sink;
        @NotNull
        private final InterfaceC2677Cq source;

        public Streams(boolean z, @NotNull InterfaceC2677Cq interfaceC2677Cq, @NotNull InterfaceC2579Bq interfaceC2579Bq) {
            C6562gT0.p(interfaceC2677Cq, "source");
            C6562gT0.p(interfaceC2579Bq, "sink");
            this.client = z;
            this.source = interfaceC2677Cq;
            this.sink = interfaceC2579Bq;
        }

        public final boolean getClient() {
            return this.client;
        }

        @NotNull
        public final InterfaceC2579Bq getSink() {
            return this.sink;
        }

        @NotNull
        public final InterfaceC2677Cq getSource() {
            return this.source;
        }
    }

    /* loaded from: classes4.dex */
    public final class WriterTask extends Task {
        public WriterTask() {
            super(RealWebSocket.this.name + " writer", false, 2, null);
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            try {
                if (RealWebSocket.this.writeOneFrame$okhttp()) {
                    return 0L;
                }
                return -1L;
            } catch (IOException e) {
                RealWebSocket.this.failWebSocket(e, null);
                return -1L;
            }
        }
    }

    public RealWebSocket(@NotNull TaskRunner taskRunner, @NotNull Request request, @NotNull WebSocketListener webSocketListener, @NotNull Random random, long j, @Nullable WebSocketExtensions webSocketExtensions, long j2) {
        C6562gT0.p(taskRunner, "taskRunner");
        C6562gT0.p(request, "originalRequest");
        C6562gT0.p(webSocketListener, ServiceSpecificExtraArgs.CastExtraArgs.a);
        C6562gT0.p(random, "random");
        this.originalRequest = request;
        this.listener = webSocketListener;
        this.random = random;
        this.pingIntervalMillis = j;
        this.extensions = webSocketExtensions;
        this.minimumDeflateSize = j2;
        this.taskQueue = taskRunner.newQueue();
        this.pongQueue = new ArrayDeque<>();
        this.messageAndCloseQueue = new ArrayDeque<>();
        this.receivedCloseCode = -1;
        if (C6562gT0.g("GET", request.method())) {
            C8859ps.a aVar = C8859ps.Y0;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            C7458kA2 c7458kA2 = C7458kA2.a;
            this.key = C8859ps.a.p(aVar, bArr, 0, 0, 3, null).i();
            return;
        }
        throw new IllegalArgumentException(("Request must be GET: " + request.method()).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isValid(WebSocketExtensions webSocketExtensions) {
        if (webSocketExtensions.unknownValues || webSocketExtensions.clientMaxWindowBits != null) {
            return false;
        }
        if (webSocketExtensions.serverMaxWindowBits != null && !new C11197zR0(8, 15).w(webSocketExtensions.serverMaxWindowBits.intValue())) {
            return false;
        }
        return true;
    }

    private final void runWriter() {
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        Task task = this.writerTask;
        if (task != null) {
            TaskQueue.schedule$default(this.taskQueue, task, 0L, 2, null);
        }
    }

    public final void awaitTermination(long j, @NotNull TimeUnit timeUnit) throws InterruptedException {
        C6562gT0.p(timeUnit, "timeUnit");
        this.taskQueue.idleLatch().await(j, timeUnit);
    }

    @Override // okhttp3.WebSocket
    public void cancel() {
        Call call = this.call;
        C6562gT0.m(call);
        call.cancel();
    }

    public final void checkUpgradeSuccess$okhttp(@NotNull Response response, @Nullable Exchange exchange) throws IOException {
        C6562gT0.p(response, "response");
        if (response.code() == 101) {
            String header$default = Response.header$default(response, "Connection", null, 2, null);
            if (C9545sf2.c2(AI0.N, header$default, true)) {
                String header$default2 = Response.header$default(response, AI0.N, null, 2, null);
                if (C9545sf2.c2("websocket", header$default2, true)) {
                    String header$default3 = Response.header$default(response, AI0.P1, null, 2, null);
                    C8859ps.a aVar = C8859ps.Y0;
                    String i = aVar.l(this.key + WebSocketProtocol.ACCEPT_MAGIC).d0().i();
                    if (C6562gT0.g(i, header$default3)) {
                        if (exchange != null) {
                            return;
                        }
                        throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
                    }
                    throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + i + "' but was '" + header$default3 + '\'');
                }
                throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + header$default2 + '\'');
            }
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + header$default + '\'');
        }
        throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + ' ' + response.message() + '\'');
    }

    @Override // okhttp3.WebSocket
    public boolean close(int i, @Nullable String str) {
        return close(i, str, 60000L);
    }

    public final void connect(@NotNull OkHttpClient okHttpClient) {
        C6562gT0.p(okHttpClient, "client");
        if (this.originalRequest.header(AI0.Q1) != null) {
            failWebSocket(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        OkHttpClient build = okHttpClient.newBuilder().eventListener(EventListener.NONE).protocols(ONLY_HTTP1).build();
        final Request build2 = this.originalRequest.newBuilder().header(AI0.N, "websocket").header("Connection", AI0.N).header(AI0.R1, this.key).header(AI0.T1, "13").header(AI0.Q1, "permessage-deflate").build();
        RealCall realCall = new RealCall(build, build2, true);
        this.call = realCall;
        C6562gT0.m(realCall);
        realCall.enqueue(new Callback() { // from class: okhttp3.internal.ws.RealWebSocket$connect$1
            @Override // okhttp3.Callback
            public void onFailure(@NotNull Call call, @NotNull IOException iOException) {
                C6562gT0.p(call, C3771Nr1.E0);
                C6562gT0.p(iOException, W12.i);
                RealWebSocket.this.failWebSocket(iOException, null);
            }

            @Override // okhttp3.Callback
            public void onResponse(@NotNull Call call, @NotNull Response response) {
                boolean isValid;
                ArrayDeque arrayDeque;
                C6562gT0.p(call, C3771Nr1.E0);
                C6562gT0.p(response, "response");
                Exchange exchange = response.exchange();
                try {
                    RealWebSocket.this.checkUpgradeSuccess$okhttp(response, exchange);
                    C6562gT0.m(exchange);
                    RealWebSocket.Streams newWebSocketStreams = exchange.newWebSocketStreams();
                    WebSocketExtensions parse = WebSocketExtensions.Companion.parse(response.headers());
                    RealWebSocket.this.extensions = parse;
                    isValid = RealWebSocket.this.isValid(parse);
                    if (!isValid) {
                        RealWebSocket realWebSocket = RealWebSocket.this;
                        synchronized (realWebSocket) {
                            arrayDeque = realWebSocket.messageAndCloseQueue;
                            arrayDeque.clear();
                            realWebSocket.close(1010, "unexpected Sec-WebSocket-Extensions in response header");
                        }
                    }
                    try {
                        RealWebSocket.this.initReaderAndWriter(Util.okHttpName + " WebSocket " + build2.url().redact(), newWebSocketStreams);
                        RealWebSocket.this.getListener$okhttp().onOpen(RealWebSocket.this, response);
                        RealWebSocket.this.loopReader();
                    } catch (Exception e) {
                        RealWebSocket.this.failWebSocket(e, null);
                    }
                } catch (IOException e2) {
                    RealWebSocket.this.failWebSocket(e2, response);
                    Util.closeQuietly(response);
                    if (exchange != null) {
                        exchange.webSocketUpgradeFailed();
                    }
                }
            }
        });
    }

    public final void failWebSocket(@NotNull Exception exc, @Nullable Response response) {
        C6562gT0.p(exc, W12.i);
        synchronized (this) {
            if (this.failed) {
                return;
            }
            this.failed = true;
            Streams streams = this.streams;
            this.streams = null;
            WebSocketReader webSocketReader = this.reader;
            this.reader = null;
            WebSocketWriter webSocketWriter = this.writer;
            this.writer = null;
            this.taskQueue.shutdown();
            C7458kA2 c7458kA2 = C7458kA2.a;
            try {
                this.listener.onFailure(this, exc, response);
            } finally {
                if (streams != null) {
                    Util.closeQuietly(streams);
                }
                if (webSocketReader != null) {
                    Util.closeQuietly(webSocketReader);
                }
                if (webSocketWriter != null) {
                    Util.closeQuietly(webSocketWriter);
                }
            }
        }
    }

    @NotNull
    public final WebSocketListener getListener$okhttp() {
        return this.listener;
    }

    public final void initReaderAndWriter(@NotNull String str, @NotNull Streams streams) throws IOException {
        Throwable th;
        C6562gT0.p(str, "name");
        C6562gT0.p(streams, "streams");
        WebSocketExtensions webSocketExtensions = this.extensions;
        C6562gT0.m(webSocketExtensions);
        synchronized (this) {
            try {
                this.name = str;
                this.streams = streams;
                this.writer = new WebSocketWriter(streams.getClient(), streams.getSink(), this.random, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(streams.getClient()), this.minimumDeflateSize);
                this.writerTask = new WriterTask();
                long j = this.pingIntervalMillis;
                if (j != 0) {
                    try {
                        final long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                        final String str2 = str + " ping";
                        this.taskQueue.schedule(new Task(str2) { // from class: okhttp3.internal.ws.RealWebSocket$initReaderAndWriter$lambda$3$$inlined$schedule$1
                            @Override // okhttp3.internal.concurrent.Task
                            public long runOnce() {
                                this.writePingFrame$okhttp();
                                return nanos;
                            }
                        }, nanos);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                if (!this.messageAndCloseQueue.isEmpty()) {
                    runWriter();
                }
                C7458kA2 c7458kA2 = C7458kA2.a;
                this.reader = new WebSocketReader(streams.getClient(), streams.getSource(), this, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(!streams.getClient()));
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public final void loopReader() throws IOException {
        while (this.receivedCloseCode == -1) {
            WebSocketReader webSocketReader = this.reader;
            C6562gT0.m(webSocketReader);
            webSocketReader.processNextFrame();
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadClose(int i, @NotNull String str) {
        Streams streams;
        WebSocketReader webSocketReader;
        WebSocketWriter webSocketWriter;
        C6562gT0.p(str, SQ0.n);
        if (i != -1) {
            synchronized (this) {
                try {
                    if (this.receivedCloseCode == -1) {
                        this.receivedCloseCode = i;
                        this.receivedCloseReason = str;
                        streams = null;
                        if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                            Streams streams2 = this.streams;
                            this.streams = null;
                            webSocketReader = this.reader;
                            this.reader = null;
                            webSocketWriter = this.writer;
                            this.writer = null;
                            this.taskQueue.shutdown();
                            streams = streams2;
                        } else {
                            webSocketReader = null;
                            webSocketWriter = null;
                        }
                        C7458kA2 c7458kA2 = C7458kA2.a;
                    } else {
                        throw new IllegalStateException("already closed");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                this.listener.onClosing(this, i, str);
                if (streams != null) {
                    this.listener.onClosed(this, i, str);
                }
                if (webSocketWriter != null) {
                    return;
                }
                return;
            } finally {
                if (streams != null) {
                    Util.closeQuietly(streams);
                }
                if (webSocketReader != null) {
                    Util.closeQuietly(webSocketReader);
                }
                if (webSocketWriter != null) {
                    Util.closeQuietly(webSocketWriter);
                }
            }
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(@NotNull String str) throws IOException {
        C6562gT0.p(str, "text");
        this.listener.onMessage(this, str);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPing(@NotNull C8859ps c8859ps) {
        try {
            C6562gT0.p(c8859ps, "payload");
            if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
                this.pongQueue.add(c8859ps);
                runWriter();
                this.receivedPingCount++;
            }
        } finally {
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPong(@NotNull C8859ps c8859ps) {
        C6562gT0.p(c8859ps, "payload");
        this.receivedPongCount++;
        this.awaitingPong = false;
    }

    public final synchronized boolean pong(@NotNull C8859ps c8859ps) {
        try {
            C6562gT0.p(c8859ps, "payload");
            if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
                this.pongQueue.add(c8859ps);
                runWriter();
                return true;
            }
            return false;
        } finally {
        }
    }

    public final boolean processNextFrame() throws IOException {
        try {
            WebSocketReader webSocketReader = this.reader;
            C6562gT0.m(webSocketReader);
            webSocketReader.processNextFrame();
            if (this.receivedCloseCode != -1) {
                return false;
            }
            return true;
        } catch (Exception e) {
            failWebSocket(e, null);
            return false;
        }
    }

    @Override // okhttp3.WebSocket
    public synchronized long queueSize() {
        return this.queueSize;
    }

    public final synchronized int receivedPingCount() {
        return this.receivedPingCount;
    }

    public final synchronized int receivedPongCount() {
        return this.receivedPongCount;
    }

    @Override // okhttp3.WebSocket
    @NotNull
    public Request request() {
        return this.originalRequest;
    }

    @Override // okhttp3.WebSocket
    public boolean send(@NotNull String str) {
        C6562gT0.p(str, "text");
        return send(C8859ps.Y0.l(str), 1);
    }

    public final synchronized int sentPingCount() {
        return this.sentPingCount;
    }

    public final void tearDown() throws InterruptedException {
        this.taskQueue.shutdown();
        this.taskQueue.idleLatch().await(10L, TimeUnit.SECONDS);
    }

    public final boolean writeOneFrame$okhttp() throws IOException {
        String str;
        WebSocketReader webSocketReader;
        WebSocketWriter webSocketWriter;
        int i;
        Streams streams;
        synchronized (this) {
            try {
                if (this.failed) {
                    return false;
                }
                WebSocketWriter webSocketWriter2 = this.writer;
                C8859ps poll = this.pongQueue.poll();
                Message message = null;
                if (poll == null) {
                    Object poll2 = this.messageAndCloseQueue.poll();
                    if (poll2 instanceof Close) {
                        i = this.receivedCloseCode;
                        str = this.receivedCloseReason;
                        if (i != -1) {
                            streams = this.streams;
                            this.streams = null;
                            webSocketReader = this.reader;
                            this.reader = null;
                            webSocketWriter = this.writer;
                            this.writer = null;
                            this.taskQueue.shutdown();
                        } else {
                            long cancelAfterCloseMillis = ((Close) poll2).getCancelAfterCloseMillis();
                            final String str2 = this.name + " cancel";
                            this.taskQueue.schedule(new Task(str2, true) { // from class: okhttp3.internal.ws.RealWebSocket$writeOneFrame$lambda$8$$inlined$execute$default$1
                                @Override // okhttp3.internal.concurrent.Task
                                public long runOnce() {
                                    this.cancel();
                                    return -1L;
                                }
                            }, TimeUnit.MILLISECONDS.toNanos(cancelAfterCloseMillis));
                            streams = null;
                            webSocketReader = null;
                            webSocketWriter = null;
                        }
                    } else if (poll2 == null) {
                        return false;
                    } else {
                        str = null;
                        webSocketReader = null;
                        webSocketWriter = null;
                        i = -1;
                        streams = null;
                    }
                    message = poll2;
                } else {
                    str = null;
                    webSocketReader = null;
                    webSocketWriter = null;
                    i = -1;
                    streams = null;
                }
                C7458kA2 c7458kA2 = C7458kA2.a;
                try {
                    if (poll != null) {
                        C6562gT0.m(webSocketWriter2);
                        webSocketWriter2.writePong(poll);
                    } else if (message instanceof Message) {
                        Message message2 = message;
                        C6562gT0.m(webSocketWriter2);
                        webSocketWriter2.writeMessageFrame(message2.getFormatOpcode(), message2.getData());
                        synchronized (this) {
                            this.queueSize -= message2.getData().g0();
                        }
                    } else if (message instanceof Close) {
                        Close close = (Close) message;
                        C6562gT0.m(webSocketWriter2);
                        webSocketWriter2.writeClose(close.getCode(), close.getReason());
                        if (streams != null) {
                            WebSocketListener webSocketListener = this.listener;
                            C6562gT0.m(str);
                            webSocketListener.onClosed(this, i, str);
                        }
                    } else {
                        throw new AssertionError();
                    }
                    return true;
                } finally {
                    if (streams != null) {
                        Util.closeQuietly(streams);
                    }
                    if (webSocketReader != null) {
                        Util.closeQuietly(webSocketReader);
                    }
                    if (webSocketWriter != null) {
                        Util.closeQuietly(webSocketWriter);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void writePingFrame$okhttp() {
        int i;
        synchronized (this) {
            try {
                if (this.failed) {
                    return;
                }
                WebSocketWriter webSocketWriter = this.writer;
                if (webSocketWriter == null) {
                    return;
                }
                if (this.awaitingPong) {
                    i = this.sentPingCount;
                } else {
                    i = -1;
                }
                this.sentPingCount++;
                this.awaitingPong = true;
                C7458kA2 c7458kA2 = C7458kA2.a;
                if (i != -1) {
                    failWebSocket(new SocketTimeoutException("sent ping but didn't receive pong within " + this.pingIntervalMillis + "ms (after " + (i - 1) + " successful ping/pongs)"), null);
                    return;
                }
                try {
                    webSocketWriter.writePing(C8859ps.Z0);
                } catch (IOException e) {
                    failWebSocket(e, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized boolean close(int i, @Nullable String str, long j) {
        C8859ps c8859ps;
        try {
            WebSocketProtocol.INSTANCE.validateCloseCode(i);
            if (str != null) {
                c8859ps = C8859ps.Y0.l(str);
                if (c8859ps.g0() > 123) {
                    throw new IllegalArgumentException(("reason.size() > 123: " + str).toString());
                }
            } else {
                c8859ps = null;
            }
            if (!this.failed && !this.enqueuedClose) {
                this.enqueuedClose = true;
                this.messageAndCloseQueue.add(new Close(i, c8859ps, j));
                runWriter();
                return true;
            }
            return false;
        } finally {
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(@NotNull C8859ps c8859ps) throws IOException {
        C6562gT0.p(c8859ps, "bytes");
        this.listener.onMessage(this, c8859ps);
    }

    @Override // okhttp3.WebSocket
    public boolean send(@NotNull C8859ps c8859ps) {
        C6562gT0.p(c8859ps, "bytes");
        return send(c8859ps, 2);
    }

    private final synchronized boolean send(C8859ps c8859ps, int i) {
        if (!this.failed && !this.enqueuedClose) {
            if (this.queueSize + c8859ps.g0() > MAX_QUEUE_SIZE) {
                close(1001, null);
                return false;
            }
            this.queueSize += c8859ps.g0();
            this.messageAndCloseQueue.add(new Message(i, c8859ps));
            runWriter();
            return true;
        }
        return false;
    }
}
