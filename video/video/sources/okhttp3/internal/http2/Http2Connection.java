package okhttp3.internal.http2;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import o.C5422bq;
import o.C6562gT0;
import o.C7458kA2;
import o.C8859ps;
import o.C9516sY;
import o.C9604su1;
import o.FA0;
import o.InterfaceC2579Bq;
import o.InterfaceC2677Cq;
import o.InterfaceC7058iW0;
import o.InterfaceC8289nW0;
import o.InterfaceC8303na2;
import o.RP1;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskQueue$execute$1;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.platform.Platform;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nHttp2Connection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n+ 2 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1006:1\n84#2,4:1007\n90#2,13:1014\n90#2,13:1027\n90#2,13:1069\n90#2,13:1082\n90#2,13:1095\n90#2,13:1108\n90#2,13:1121\n90#2,13:1134\n563#3:1011\n557#3:1013\n557#3:1040\n615#3,4:1041\n402#3,5:1045\n402#3,5:1053\n402#3,5:1059\n402#3,5:1064\n1#4:1012\n37#5,2:1050\n13309#6:1052\n13310#6:1058\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n152#1:1007,4\n340#1:1014,13\n361#1:1027,13\n506#1:1069,13\n554#1:1082,13\n893#1:1095,13\n911#1:1108,13\n938#1:1121,13\n952#1:1134,13\n183#1:1011\n319#1:1013\n402#1:1040\n446#1:1041,4\n448#1:1045,5\n461#1:1053,5\n467#1:1059,5\n472#1:1064,5\n455#1:1050,2\n460#1:1052\n460#1:1058\n*E\n"})
/* loaded from: classes4.dex */
public final class Http2Connection implements Closeable {
    public static final int AWAIT_PING = 3;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final Settings DEFAULT_SETTINGS;
    public static final int DEGRADED_PING = 2;
    public static final int DEGRADED_PONG_TIMEOUT_NS = 1000000000;
    public static final int INTERVAL_PING = 1;
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    private long awaitPingsSent;
    private long awaitPongsReceived;
    private final boolean client;
    @NotNull
    private final String connectionName;
    @NotNull
    private final Set<Integer> currentPushRequests;
    private long degradedPingsSent;
    private long degradedPongDeadlineNs;
    private long degradedPongsReceived;
    private long intervalPingsSent;
    private long intervalPongsReceived;
    private boolean isShutdown;
    private int lastGoodStreamId;
    @NotNull
    private final Listener listener;
    private int nextStreamId;
    @NotNull
    private final Settings okHttpSettings;
    @NotNull
    private Settings peerSettings;
    @NotNull
    private final PushObserver pushObserver;
    @NotNull
    private final TaskQueue pushQueue;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    @NotNull
    private final ReaderRunnable readerRunnable;
    @NotNull
    private final TaskQueue settingsListenerQueue;
    @NotNull
    private final Socket socket;
    @NotNull
    private final Map<Integer, Http2Stream> streams;
    @NotNull
    private final TaskRunner taskRunner;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    @NotNull
    private final Http2Writer writer;
    @NotNull
    private final TaskQueue writerQueue;

    /* loaded from: classes4.dex */
    public static final class Builder {
        private boolean client;
        public String connectionName;
        @NotNull
        private Listener listener;
        private int pingIntervalMillis;
        @NotNull
        private PushObserver pushObserver;
        public InterfaceC2579Bq sink;
        public Socket socket;
        public InterfaceC2677Cq source;
        @NotNull
        private final TaskRunner taskRunner;

        public Builder(boolean z, @NotNull TaskRunner taskRunner) {
            C6562gT0.p(taskRunner, "taskRunner");
            this.client = z;
            this.taskRunner = taskRunner;
            this.listener = Listener.REFUSE_INCOMING_STREAMS;
            this.pushObserver = PushObserver.CANCEL;
        }

        public static /* synthetic */ Builder socket$default(Builder builder, Socket socket, String str, InterfaceC2677Cq interfaceC2677Cq, InterfaceC2579Bq interfaceC2579Bq, int i, Object obj) throws IOException {
            if ((i & 2) != 0) {
                str = Util.peerName(socket);
            }
            if ((i & 4) != 0) {
                interfaceC2677Cq = C9604su1.e(C9604su1.v(socket));
            }
            if ((i & 8) != 0) {
                interfaceC2579Bq = C9604su1.d(C9604su1.q(socket));
            }
            return builder.socket(socket, str, interfaceC2677Cq, interfaceC2579Bq);
        }

        @NotNull
        public final Http2Connection build() {
            return new Http2Connection(this);
        }

        public final boolean getClient$okhttp() {
            return this.client;
        }

        @NotNull
        public final String getConnectionName$okhttp() {
            String str = this.connectionName;
            if (str != null) {
                return str;
            }
            C6562gT0.S("connectionName");
            return null;
        }

        @NotNull
        public final Listener getListener$okhttp() {
            return this.listener;
        }

        public final int getPingIntervalMillis$okhttp() {
            return this.pingIntervalMillis;
        }

        @NotNull
        public final PushObserver getPushObserver$okhttp() {
            return this.pushObserver;
        }

        @NotNull
        public final InterfaceC2579Bq getSink$okhttp() {
            InterfaceC2579Bq interfaceC2579Bq = this.sink;
            if (interfaceC2579Bq != null) {
                return interfaceC2579Bq;
            }
            C6562gT0.S("sink");
            return null;
        }

        @NotNull
        public final Socket getSocket$okhttp() {
            Socket socket = this.socket;
            if (socket != null) {
                return socket;
            }
            C6562gT0.S("socket");
            return null;
        }

        @NotNull
        public final InterfaceC2677Cq getSource$okhttp() {
            InterfaceC2677Cq interfaceC2677Cq = this.source;
            if (interfaceC2677Cq != null) {
                return interfaceC2677Cq;
            }
            C6562gT0.S("source");
            return null;
        }

        @NotNull
        public final TaskRunner getTaskRunner$okhttp() {
            return this.taskRunner;
        }

        @NotNull
        public final Builder listener(@NotNull Listener listener) {
            C6562gT0.p(listener, ServiceSpecificExtraArgs.CastExtraArgs.a);
            this.listener = listener;
            return this;
        }

        @NotNull
        public final Builder pingIntervalMillis(int i) {
            this.pingIntervalMillis = i;
            return this;
        }

        @NotNull
        public final Builder pushObserver(@NotNull PushObserver pushObserver) {
            C6562gT0.p(pushObserver, "pushObserver");
            this.pushObserver = pushObserver;
            return this;
        }

        public final void setClient$okhttp(boolean z) {
            this.client = z;
        }

        public final void setConnectionName$okhttp(@NotNull String str) {
            C6562gT0.p(str, "<set-?>");
            this.connectionName = str;
        }

        public final void setListener$okhttp(@NotNull Listener listener) {
            C6562gT0.p(listener, "<set-?>");
            this.listener = listener;
        }

        public final void setPingIntervalMillis$okhttp(int i) {
            this.pingIntervalMillis = i;
        }

        public final void setPushObserver$okhttp(@NotNull PushObserver pushObserver) {
            C6562gT0.p(pushObserver, "<set-?>");
            this.pushObserver = pushObserver;
        }

        public final void setSink$okhttp(@NotNull InterfaceC2579Bq interfaceC2579Bq) {
            C6562gT0.p(interfaceC2579Bq, "<set-?>");
            this.sink = interfaceC2579Bq;
        }

        public final void setSocket$okhttp(@NotNull Socket socket) {
            C6562gT0.p(socket, "<set-?>");
            this.socket = socket;
        }

        public final void setSource$okhttp(@NotNull InterfaceC2677Cq interfaceC2677Cq) {
            C6562gT0.p(interfaceC2677Cq, "<set-?>");
            this.source = interfaceC2677Cq;
        }

        @InterfaceC8289nW0
        @NotNull
        public final Builder socket(@NotNull Socket socket) throws IOException {
            C6562gT0.p(socket, "socket");
            return socket$default(this, socket, null, null, null, 14, null);
        }

        @InterfaceC8289nW0
        @NotNull
        public final Builder socket(@NotNull Socket socket, @NotNull String str) throws IOException {
            C6562gT0.p(socket, "socket");
            C6562gT0.p(str, "peerName");
            return socket$default(this, socket, str, null, null, 12, null);
        }

        @InterfaceC8289nW0
        @NotNull
        public final Builder socket(@NotNull Socket socket, @NotNull String str, @NotNull InterfaceC2677Cq interfaceC2677Cq) throws IOException {
            C6562gT0.p(socket, "socket");
            C6562gT0.p(str, "peerName");
            C6562gT0.p(interfaceC2677Cq, "source");
            return socket$default(this, socket, str, interfaceC2677Cq, null, 8, null);
        }

        @InterfaceC8289nW0
        @NotNull
        public final Builder socket(@NotNull Socket socket, @NotNull String str, @NotNull InterfaceC2677Cq interfaceC2677Cq, @NotNull InterfaceC2579Bq interfaceC2579Bq) throws IOException {
            String str2;
            C6562gT0.p(socket, "socket");
            C6562gT0.p(str, "peerName");
            C6562gT0.p(interfaceC2677Cq, "source");
            C6562gT0.p(interfaceC2579Bq, "sink");
            setSocket$okhttp(socket);
            if (this.client) {
                str2 = Util.okHttpName + ' ' + str;
            } else {
                str2 = "MockWebServer " + str;
            }
            setConnectionName$okhttp(str2);
            setSource$okhttp(interfaceC2677Cq);
            setSink$okhttp(interfaceC2579Bq);
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        @NotNull
        public final Settings getDEFAULT_SETTINGS() {
            return Http2Connection.DEFAULT_SETTINGS;
        }

        private Companion() {
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class Listener {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @InterfaceC7058iW0
        @NotNull
        public static final Listener REFUSE_INCOMING_STREAMS = new Listener() { // from class: okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
            @Override // okhttp3.internal.http2.Http2Connection.Listener
            public void onStream(@NotNull Http2Stream http2Stream) throws IOException {
                C6562gT0.p(http2Stream, "stream");
                http2Stream.close(ErrorCode.REFUSED_STREAM, null);
            }
        };

        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(C9516sY c9516sY) {
                this();
            }

            private Companion() {
            }
        }

        public void onSettings(@NotNull Http2Connection http2Connection, @NotNull Settings settings) {
            C6562gT0.p(http2Connection, "connection");
            C6562gT0.p(settings, RemoteConfigComponent.f388o);
        }

        public abstract void onStream(@NotNull Http2Stream http2Stream) throws IOException;
    }

    @InterfaceC8303na2({"SMAP\nHttp2Connection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n+ 2 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 Util.kt\nokhttp3/internal/Util\n*L\n1#1,1006:1\n90#2,13:1007\n90#2,13:1020\n90#2,13:1035\n90#2,13:1049\n37#3,2:1033\n37#3,2:1062\n563#4:1048\n563#4:1064\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n*L\n687#1:1007,13\n715#1:1020,13\n758#1:1035,13\n806#1:1049,13\n753#1:1033,2\n824#1:1062,2\n797#1:1048\n841#1:1064\n*E\n"})
    /* loaded from: classes4.dex */
    public final class ReaderRunnable implements Http2Reader.Handler, FA0<C7458kA2> {
        @NotNull
        private final Http2Reader reader;
        final /* synthetic */ Http2Connection this$0;

        public ReaderRunnable(@NotNull Http2Connection http2Connection, Http2Reader http2Reader) {
            C6562gT0.p(http2Reader, "reader");
            this.this$0 = http2Connection;
            this.reader = http2Reader;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ackSettings() {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void alternateService(int i, @NotNull String str, @NotNull C8859ps c8859ps, @NotNull String str2, int i2, long j) {
            C6562gT0.p(str, "origin");
            C6562gT0.p(c8859ps, "protocol");
            C6562gT0.p(str2, "host");
        }

        /* JADX WARN: Type inference failed for: r13v1 */
        /* JADX WARN: Type inference failed for: r13v2, types: [T, okhttp3.internal.http2.Settings] */
        /* JADX WARN: Type inference failed for: r13v3 */
        public final void applyAndAckSettings(boolean z, @NotNull Settings settings) {
            ?? r13;
            long initialWindowSize;
            int i;
            Http2Stream[] http2StreamArr;
            C6562gT0.p(settings, RemoteConfigComponent.f388o);
            final RP1.h hVar = new RP1.h();
            Http2Writer writer = this.this$0.getWriter();
            final Http2Connection http2Connection = this.this$0;
            synchronized (writer) {
                synchronized (http2Connection) {
                    Settings peerSettings = http2Connection.getPeerSettings();
                    if (z) {
                        r13 = settings;
                    } else {
                        Settings settings2 = new Settings();
                        settings2.merge(peerSettings);
                        settings2.merge(settings);
                        r13 = settings2;
                    }
                    hVar.X = r13;
                    initialWindowSize = r13.getInitialWindowSize() - peerSettings.getInitialWindowSize();
                    if (initialWindowSize != 0 && !http2Connection.getStreams$okhttp().isEmpty()) {
                        http2StreamArr = (Http2Stream[]) http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                        http2Connection.setPeerSettings((Settings) hVar.X);
                        http2Connection.settingsListenerQueue.schedule(new Task(http2Connection.getConnectionName$okhttp() + " onSettings", true) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$lambda$7$lambda$6$$inlined$execute$default$1
                            @Override // okhttp3.internal.concurrent.Task
                            public long runOnce() {
                                http2Connection.getListener$okhttp().onSettings(http2Connection, (Settings) hVar.X);
                                return -1L;
                            }
                        }, 0L);
                        C7458kA2 c7458kA2 = C7458kA2.a;
                    }
                    http2StreamArr = null;
                    http2Connection.setPeerSettings((Settings) hVar.X);
                    http2Connection.settingsListenerQueue.schedule(new Task(http2Connection.getConnectionName$okhttp() + " onSettings", true) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$lambda$7$lambda$6$$inlined$execute$default$1
                        @Override // okhttp3.internal.concurrent.Task
                        public long runOnce() {
                            http2Connection.getListener$okhttp().onSettings(http2Connection, (Settings) hVar.X);
                            return -1L;
                        }
                    }, 0L);
                    C7458kA2 c7458kA22 = C7458kA2.a;
                }
                try {
                    http2Connection.getWriter().applyAndAckSettings((Settings) hVar.X);
                } catch (IOException e) {
                    http2Connection.failConnection(e);
                }
                C7458kA2 c7458kA23 = C7458kA2.a;
            }
            if (http2StreamArr != null) {
                for (Http2Stream http2Stream : http2StreamArr) {
                    synchronized (http2Stream) {
                        http2Stream.addBytesToWriteWindow(initialWindowSize);
                        C7458kA2 c7458kA24 = C7458kA2.a;
                    }
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void data(boolean z, int i, @NotNull InterfaceC2677Cq interfaceC2677Cq, int i2) throws IOException {
            C6562gT0.p(interfaceC2677Cq, "source");
            if (this.this$0.pushedStream$okhttp(i)) {
                this.this$0.pushDataLater$okhttp(i, interfaceC2677Cq, i2, z);
                return;
            }
            Http2Stream stream = this.this$0.getStream(i);
            if (stream == null) {
                this.this$0.writeSynResetLater$okhttp(i, ErrorCode.PROTOCOL_ERROR);
                long j = i2;
                this.this$0.updateConnectionFlowControl$okhttp(j);
                interfaceC2677Cq.skip(j);
                return;
            }
            stream.receiveData(interfaceC2677Cq, i2);
            if (z) {
                stream.receiveHeaders(Util.EMPTY_HEADERS, true);
            }
        }

        @NotNull
        public final Http2Reader getReader$okhttp() {
            return this.reader;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void goAway(int i, @NotNull ErrorCode errorCode, @NotNull C8859ps c8859ps) {
            int i2;
            Object[] array;
            Http2Stream[] http2StreamArr;
            C6562gT0.p(errorCode, "errorCode");
            C6562gT0.p(c8859ps, "debugData");
            c8859ps.g0();
            Http2Connection http2Connection = this.this$0;
            synchronized (http2Connection) {
                array = http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                http2Connection.isShutdown = true;
                C7458kA2 c7458kA2 = C7458kA2.a;
            }
            for (Http2Stream http2Stream : (Http2Stream[]) array) {
                if (http2Stream.getId() > i && http2Stream.isLocallyInitiated()) {
                    http2Stream.receiveRstStream(ErrorCode.REFUSED_STREAM);
                    this.this$0.removeStream$okhttp(http2Stream.getId());
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void headers(boolean z, int i, int i2, @NotNull List<Header> list) {
            C6562gT0.p(list, "headerBlock");
            if (this.this$0.pushedStream$okhttp(i)) {
                this.this$0.pushHeadersLater$okhttp(i, list, z);
                return;
            }
            final Http2Connection http2Connection = this.this$0;
            synchronized (http2Connection) {
                Http2Stream stream = http2Connection.getStream(i);
                if (stream == null) {
                    if (http2Connection.isShutdown) {
                        return;
                    }
                    if (i <= http2Connection.getLastGoodStreamId$okhttp()) {
                        return;
                    }
                    if (i % 2 == http2Connection.getNextStreamId$okhttp() % 2) {
                        return;
                    }
                    final Http2Stream http2Stream = new Http2Stream(i, http2Connection, false, z, Util.toHeaders(list));
                    http2Connection.setLastGoodStreamId$okhttp(i);
                    http2Connection.getStreams$okhttp().put(Integer.valueOf(i), http2Stream);
                    TaskQueue newQueue = http2Connection.taskRunner.newQueue();
                    newQueue.schedule(new Task(http2Connection.getConnectionName$okhttp() + '[' + i + "] onStream", true) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$headers$lambda$2$$inlined$execute$default$1
                        @Override // okhttp3.internal.concurrent.Task
                        public long runOnce() {
                            try {
                                http2Connection.getListener$okhttp().onStream(http2Stream);
                                return -1L;
                            } catch (IOException e) {
                                Platform platform = Platform.Companion.get();
                                platform.log("Http2Connection.Listener failure for " + http2Connection.getConnectionName$okhttp(), 4, e);
                                try {
                                    http2Stream.close(ErrorCode.PROTOCOL_ERROR, e);
                                    return -1L;
                                } catch (IOException unused) {
                                    return -1L;
                                }
                            }
                        }
                    }, 0L);
                    return;
                }
                C7458kA2 c7458kA2 = C7458kA2.a;
                stream.receiveHeaders(Util.toHeaders(list), z);
            }
        }

        @Override // o.FA0
        public /* bridge */ /* synthetic */ C7458kA2 invoke() {
            invoke2();
            return C7458kA2.a;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ping(boolean z, final int i, final int i2) {
            if (!z) {
                final Http2Connection http2Connection = this.this$0;
                this.this$0.writerQueue.schedule(new Task(this.this$0.getConnectionName$okhttp() + " ping", true) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1
                    @Override // okhttp3.internal.concurrent.Task
                    public long runOnce() {
                        http2Connection.writePing(true, i, i2);
                        return -1L;
                    }
                }, 0L);
                return;
            }
            Http2Connection http2Connection2 = this.this$0;
            synchronized (http2Connection2) {
                try {
                    if (i == 1) {
                        http2Connection2.intervalPongsReceived++;
                    } else if (i == 2) {
                        http2Connection2.degradedPongsReceived++;
                    } else {
                        if (i == 3) {
                            http2Connection2.awaitPongsReceived++;
                            C6562gT0.n(http2Connection2, "null cannot be cast to non-null type java.lang.Object");
                            http2Connection2.notifyAll();
                        }
                        C7458kA2 c7458kA2 = C7458kA2.a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void priority(int i, int i2, int i3, boolean z) {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void pushPromise(int i, int i2, @NotNull List<Header> list) {
            C6562gT0.p(list, "requestHeaders");
            this.this$0.pushRequestLater$okhttp(i2, list);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void rstStream(int i, @NotNull ErrorCode errorCode) {
            C6562gT0.p(errorCode, "errorCode");
            if (this.this$0.pushedStream$okhttp(i)) {
                this.this$0.pushResetLater$okhttp(i, errorCode);
                return;
            }
            Http2Stream removeStream$okhttp = this.this$0.removeStream$okhttp(i);
            if (removeStream$okhttp != null) {
                removeStream$okhttp.receiveRstStream(errorCode);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void settings(final boolean z, @NotNull final Settings settings) {
            C6562gT0.p(settings, RemoteConfigComponent.f388o);
            TaskQueue taskQueue = this.this$0.writerQueue;
            taskQueue.schedule(new Task(this.this$0.getConnectionName$okhttp() + " applyAndAckSettings", true) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    this.applyAndAckSettings(z, settings);
                    return -1L;
                }
            }, 0L);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void windowUpdate(int i, long j) {
            if (i == 0) {
                Http2Connection http2Connection = this.this$0;
                synchronized (http2Connection) {
                    http2Connection.writeBytesMaximum = http2Connection.getWriteBytesMaximum() + j;
                    C6562gT0.n(http2Connection, "null cannot be cast to non-null type java.lang.Object");
                    http2Connection.notifyAll();
                    C7458kA2 c7458kA2 = C7458kA2.a;
                }
                return;
            }
            Http2Stream stream = this.this$0.getStream(i);
            if (stream != null) {
                synchronized (stream) {
                    stream.addBytesToWriteWindow(j);
                    C7458kA2 c7458kA22 = C7458kA2.a;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http2.ErrorCode] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable, okhttp3.internal.http2.Http2Reader] */
        /* renamed from: invoke */
        public void invoke2() {
            ErrorCode errorCode;
            ErrorCode errorCode2;
            ErrorCode errorCode3 = ErrorCode.INTERNAL_ERROR;
            IOException e = null;
            try {
                try {
                    this.reader.readConnectionPreface(this);
                    do {
                    } while (this.reader.nextFrame(false, this));
                    errorCode2 = ErrorCode.NO_ERROR;
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th) {
                    th = th;
                    errorCode = errorCode3;
                    this.this$0.close$okhttp(errorCode, errorCode3, e);
                    Util.closeQuietly(this.reader);
                    throw th;
                }
                try {
                    this.this$0.close$okhttp(errorCode2, ErrorCode.CANCEL, null);
                    errorCode = errorCode2;
                } catch (IOException e3) {
                    e = e3;
                    ErrorCode errorCode4 = ErrorCode.PROTOCOL_ERROR;
                    Http2Connection http2Connection = this.this$0;
                    http2Connection.close$okhttp(errorCode4, errorCode4, e);
                    errorCode = http2Connection;
                    errorCode3 = this.reader;
                    Util.closeQuietly((Closeable) errorCode3);
                }
                errorCode3 = this.reader;
                Util.closeQuietly((Closeable) errorCode3);
            } catch (Throwable th2) {
                th = th2;
                this.this$0.close$okhttp(errorCode, errorCode3, e);
                Util.closeQuietly(this.reader);
                throw th;
            }
        }
    }

    static {
        Settings settings = new Settings();
        settings.set(7, 65535);
        settings.set(5, 16384);
        DEFAULT_SETTINGS = settings;
    }

    public Http2Connection(@NotNull Builder builder) {
        int i;
        C6562gT0.p(builder, "builder");
        boolean client$okhttp = builder.getClient$okhttp();
        this.client = client$okhttp;
        this.listener = builder.getListener$okhttp();
        this.streams = new LinkedHashMap();
        String connectionName$okhttp = builder.getConnectionName$okhttp();
        this.connectionName = connectionName$okhttp;
        if (builder.getClient$okhttp()) {
            i = 3;
        } else {
            i = 2;
        }
        this.nextStreamId = i;
        TaskRunner taskRunner$okhttp = builder.getTaskRunner$okhttp();
        this.taskRunner = taskRunner$okhttp;
        TaskQueue newQueue = taskRunner$okhttp.newQueue();
        this.writerQueue = newQueue;
        this.pushQueue = taskRunner$okhttp.newQueue();
        this.settingsListenerQueue = taskRunner$okhttp.newQueue();
        this.pushObserver = builder.getPushObserver$okhttp();
        Settings settings = new Settings();
        if (builder.getClient$okhttp()) {
            settings.set(7, 16777216);
        }
        this.okHttpSettings = settings;
        Settings settings2 = DEFAULT_SETTINGS;
        this.peerSettings = settings2;
        this.writeBytesMaximum = settings2.getInitialWindowSize();
        this.socket = builder.getSocket$okhttp();
        this.writer = new Http2Writer(builder.getSink$okhttp(), client$okhttp);
        this.readerRunnable = new ReaderRunnable(this, new Http2Reader(builder.getSource$okhttp(), client$okhttp));
        this.currentPushRequests = new LinkedHashSet();
        if (builder.getPingIntervalMillis$okhttp() != 0) {
            final long nanos = TimeUnit.MILLISECONDS.toNanos(builder.getPingIntervalMillis$okhttp());
            newQueue.schedule(new Task(connectionName$okhttp + " ping") { // from class: okhttp3.internal.http2.Http2Connection$special$$inlined$schedule$1
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    long j;
                    long j2;
                    boolean z;
                    synchronized (this) {
                        long j3 = this.intervalPongsReceived;
                        j = this.intervalPingsSent;
                        if (j3 >= j) {
                            j2 = this.intervalPingsSent;
                            this.intervalPingsSent = j2 + 1;
                            z = false;
                        } else {
                            z = true;
                        }
                    }
                    if (z) {
                        this.failConnection(null);
                        return -1L;
                    }
                    this.writePing(false, 1, 0);
                    return nanos;
                }
            }, nanos);
        }
    }

    public final void failConnection(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        close$okhttp(errorCode, errorCode, iOException);
    }

    public static /* synthetic */ void start$default(Http2Connection http2Connection, boolean z, TaskRunner taskRunner, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            taskRunner = TaskRunner.INSTANCE;
        }
        http2Connection.start(z, taskRunner);
    }

    public final synchronized void awaitPong() throws InterruptedException {
        while (this.awaitPongsReceived < this.awaitPingsSent) {
            C6562gT0.n(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        close$okhttp(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final void close$okhttp(@NotNull ErrorCode errorCode, @NotNull ErrorCode errorCode2, @Nullable IOException iOException) {
        int i;
        Object[] objArr;
        C6562gT0.p(errorCode, "connectionCode");
        C6562gT0.p(errorCode2, "streamCode");
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            shutdown(errorCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (!this.streams.isEmpty()) {
                    objArr = this.streams.values().toArray(new Http2Stream[0]);
                    this.streams.clear();
                } else {
                    objArr = null;
                }
                C7458kA2 c7458kA2 = C7458kA2.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Http2Stream[] http2StreamArr = (Http2Stream[]) objArr;
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.close(errorCode2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.writer.close();
        } catch (IOException unused3) {
        }
        try {
            this.socket.close();
        } catch (IOException unused4) {
        }
        this.writerQueue.shutdown();
        this.pushQueue.shutdown();
        this.settingsListenerQueue.shutdown();
    }

    public final void flush() throws IOException {
        this.writer.flush();
    }

    public final boolean getClient$okhttp() {
        return this.client;
    }

    @NotNull
    public final String getConnectionName$okhttp() {
        return this.connectionName;
    }

    public final int getLastGoodStreamId$okhttp() {
        return this.lastGoodStreamId;
    }

    @NotNull
    public final Listener getListener$okhttp() {
        return this.listener;
    }

    public final int getNextStreamId$okhttp() {
        return this.nextStreamId;
    }

    @NotNull
    public final Settings getOkHttpSettings() {
        return this.okHttpSettings;
    }

    @NotNull
    public final Settings getPeerSettings() {
        return this.peerSettings;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    @NotNull
    public final ReaderRunnable getReaderRunnable() {
        return this.readerRunnable;
    }

    @NotNull
    public final Socket getSocket$okhttp() {
        return this.socket;
    }

    @Nullable
    public final synchronized Http2Stream getStream(int i) {
        return this.streams.get(Integer.valueOf(i));
    }

    @NotNull
    public final Map<Integer, Http2Stream> getStreams$okhttp() {
        return this.streams;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    @NotNull
    public final Http2Writer getWriter() {
        return this.writer;
    }

    public final synchronized boolean isHealthy(long j) {
        if (this.isShutdown) {
            return false;
        }
        if (this.degradedPongsReceived < this.degradedPingsSent) {
            if (j >= this.degradedPongDeadlineNs) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public final Http2Stream newStream(@NotNull List<Header> list, boolean z) throws IOException {
        C6562gT0.p(list, "requestHeaders");
        return newStream(0, list, z);
    }

    public final synchronized int openStreamCount() {
        return this.streams.size();
    }

    public final void pushDataLater$okhttp(final int i, @NotNull InterfaceC2677Cq interfaceC2677Cq, final int i2, final boolean z) throws IOException {
        C6562gT0.p(interfaceC2677Cq, "source");
        final C5422bq c5422bq = new C5422bq();
        long j = i2;
        interfaceC2677Cq.Q2(j);
        interfaceC2677Cq.read(c5422bq, j);
        this.pushQueue.schedule(new Task(this.connectionName + '[' + i + "] onData", true) { // from class: okhttp3.internal.http2.Http2Connection$pushDataLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                PushObserver pushObserver;
                Set set;
                try {
                    pushObserver = this.pushObserver;
                    boolean onData = pushObserver.onData(i, c5422bq, i2, z);
                    if (onData) {
                        this.getWriter().rstStream(i, ErrorCode.CANCEL);
                    }
                    if (onData || z) {
                        synchronized (this) {
                            set = this.currentPushRequests;
                            set.remove(Integer.valueOf(i));
                        }
                        return -1L;
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void pushHeadersLater$okhttp(final int i, @NotNull final List<Header> list, final boolean z) {
        C6562gT0.p(list, "requestHeaders");
        TaskQueue taskQueue = this.pushQueue;
        taskQueue.schedule(new Task(this.connectionName + '[' + i + "] onHeaders", true) { // from class: okhttp3.internal.http2.Http2Connection$pushHeadersLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                PushObserver pushObserver;
                Set set;
                pushObserver = this.pushObserver;
                boolean onHeaders = pushObserver.onHeaders(i, list, z);
                if (onHeaders) {
                    try {
                        this.getWriter().rstStream(i, ErrorCode.CANCEL);
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
                if (onHeaders || z) {
                    synchronized (this) {
                        set = this.currentPushRequests;
                        set.remove(Integer.valueOf(i));
                    }
                    return -1L;
                }
                return -1L;
            }
        }, 0L);
    }

    public final void pushRequestLater$okhttp(final int i, @NotNull final List<Header> list) {
        Throwable th;
        C6562gT0.p(list, "requestHeaders");
        synchronized (this) {
            try {
                if (this.currentPushRequests.contains(Integer.valueOf(i))) {
                    try {
                        writeSynResetLater$okhttp(i, ErrorCode.PROTOCOL_ERROR);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                this.currentPushRequests.add(Integer.valueOf(i));
                TaskQueue taskQueue = this.pushQueue;
                taskQueue.schedule(new Task(this.connectionName + '[' + i + "] onRequest", true) { // from class: okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$execute$default$1
                    @Override // okhttp3.internal.concurrent.Task
                    public long runOnce() {
                        PushObserver pushObserver;
                        Set set;
                        pushObserver = this.pushObserver;
                        if (pushObserver.onRequest(i, list)) {
                            try {
                                this.getWriter().rstStream(i, ErrorCode.CANCEL);
                                synchronized (this) {
                                    set = this.currentPushRequests;
                                    set.remove(Integer.valueOf(i));
                                }
                                return -1L;
                            } catch (IOException unused) {
                                return -1L;
                            }
                        }
                        return -1L;
                    }
                }, 0L);
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public final void pushResetLater$okhttp(final int i, @NotNull final ErrorCode errorCode) {
        C6562gT0.p(errorCode, "errorCode");
        TaskQueue taskQueue = this.pushQueue;
        taskQueue.schedule(new Task(this.connectionName + '[' + i + "] onReset", true) { // from class: okhttp3.internal.http2.Http2Connection$pushResetLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                PushObserver pushObserver;
                Set set;
                pushObserver = this.pushObserver;
                pushObserver.onReset(i, errorCode);
                synchronized (this) {
                    set = this.currentPushRequests;
                    set.remove(Integer.valueOf(i));
                    C7458kA2 c7458kA2 = C7458kA2.a;
                }
                return -1L;
            }
        }, 0L);
    }

    @NotNull
    public final Http2Stream pushStream(int i, @NotNull List<Header> list, boolean z) throws IOException {
        C6562gT0.p(list, "requestHeaders");
        if (!this.client) {
            return newStream(i, list, z);
        }
        throw new IllegalStateException("Client cannot push requests.");
    }

    public final boolean pushedStream$okhttp(int i) {
        return i != 0 && (i & 1) == 0;
    }

    @Nullable
    public final synchronized Http2Stream removeStream$okhttp(int i) {
        Http2Stream remove;
        remove = this.streams.remove(Integer.valueOf(i));
        C6562gT0.n(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return remove;
    }

    public final void sendDegradedPingLater$okhttp() {
        synchronized (this) {
            long j = this.degradedPongsReceived;
            long j2 = this.degradedPingsSent;
            if (j < j2) {
                return;
            }
            this.degradedPingsSent = j2 + 1;
            this.degradedPongDeadlineNs = System.nanoTime() + 1000000000;
            C7458kA2 c7458kA2 = C7458kA2.a;
            TaskQueue taskQueue = this.writerQueue;
            taskQueue.schedule(new Task(this.connectionName + " ping", true) { // from class: okhttp3.internal.http2.Http2Connection$sendDegradedPingLater$$inlined$execute$default$1
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    this.writePing(false, 2, 0);
                    return -1L;
                }
            }, 0L);
        }
    }

    public final void setLastGoodStreamId$okhttp(int i) {
        this.lastGoodStreamId = i;
    }

    public final void setNextStreamId$okhttp(int i) {
        this.nextStreamId = i;
    }

    public final void setPeerSettings(@NotNull Settings settings) {
        C6562gT0.p(settings, "<set-?>");
        this.peerSettings = settings;
    }

    public final void setSettings(@NotNull Settings settings) throws IOException {
        C6562gT0.p(settings, RemoteConfigComponent.f388o);
        synchronized (this.writer) {
            synchronized (this) {
                if (!this.isShutdown) {
                    this.okHttpSettings.merge(settings);
                    C7458kA2 c7458kA2 = C7458kA2.a;
                } else {
                    throw new ConnectionShutdownException();
                }
            }
            this.writer.settings(settings);
        }
    }

    public final void shutdown(@NotNull ErrorCode errorCode) throws IOException {
        C6562gT0.p(errorCode, "statusCode");
        synchronized (this.writer) {
            RP1.f fVar = new RP1.f();
            synchronized (this) {
                if (this.isShutdown) {
                    return;
                }
                this.isShutdown = true;
                int i = this.lastGoodStreamId;
                fVar.X = i;
                C7458kA2 c7458kA2 = C7458kA2.a;
                this.writer.goAway(i, errorCode, Util.EMPTY_BYTE_ARRAY);
            }
        }
    }

    @InterfaceC8289nW0
    public final void start() throws IOException {
        start$default(this, false, null, 3, null);
    }

    public final synchronized void updateConnectionFlowControl$okhttp(long j) {
        long j2 = this.readBytesTotal + j;
        this.readBytesTotal = j2;
        long j3 = j2 - this.readBytesAcknowledged;
        if (j3 >= this.okHttpSettings.getInitialWindowSize() / 2) {
            writeWindowUpdateLater$okhttp(0, j3);
            this.readBytesAcknowledged += j3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0038, code lost:
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x003a, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.writer.maxDataLength());
        r6 = r2;
        r8.writeBytesTotal += r6;
        r4 = o.C7458kA2.a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void writeData(int i, boolean z, @Nullable C5422bq c5422bq, long j) throws IOException {
        int min;
        long j2;
        boolean z2;
        if (j == 0) {
            this.writer.data(z, i, c5422bq, 0);
            return;
        }
        loop0: while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j3 = this.writeBytesTotal;
                            long j4 = this.writeBytesMaximum;
                            if (j3 < j4) {
                                break;
                            } else if (!this.streams.containsKey(Integer.valueOf(i))) {
                                break loop0;
                            } else {
                                C6562gT0.n(this, "null cannot be cast to non-null type java.lang.Object");
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            j -= j2;
            Http2Writer http2Writer = this.writer;
            if (z && j == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            http2Writer.data(z2, i, c5422bq, min);
        }
    }

    public final void writeHeaders$okhttp(int i, boolean z, @NotNull List<Header> list) throws IOException {
        C6562gT0.p(list, "alternating");
        this.writer.headers(z, i, list);
    }

    public final void writePing(boolean z, int i, int i2) {
        try {
            this.writer.ping(z, i, i2);
        } catch (IOException e) {
            failConnection(e);
        }
    }

    public final void writePingAndAwaitPong() throws InterruptedException {
        writePing();
        awaitPong();
    }

    public final void writeSynReset$okhttp(int i, @NotNull ErrorCode errorCode) throws IOException {
        C6562gT0.p(errorCode, "statusCode");
        this.writer.rstStream(i, errorCode);
    }

    public final void writeSynResetLater$okhttp(final int i, @NotNull final ErrorCode errorCode) {
        C6562gT0.p(errorCode, "errorCode");
        TaskQueue taskQueue = this.writerQueue;
        taskQueue.schedule(new Task(this.connectionName + '[' + i + "] writeSynReset", true) { // from class: okhttp3.internal.http2.Http2Connection$writeSynResetLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    this.writeSynReset$okhttp(i, errorCode);
                    return -1L;
                } catch (IOException e) {
                    this.failConnection(e);
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void writeWindowUpdateLater$okhttp(final int i, final long j) {
        TaskQueue taskQueue = this.writerQueue;
        taskQueue.schedule(new Task(this.connectionName + '[' + i + "] windowUpdate", true) { // from class: okhttp3.internal.http2.Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    this.getWriter().windowUpdate(i, j);
                    return -1L;
                } catch (IOException e) {
                    this.failConnection(e);
                    return -1L;
                }
            }
        }, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x004d A[Catch: all -> 0x0043, TryCatch #1 {all -> 0x0043, blocks: (B:79:0x0027, B:81:0x002c, B:83:0x0034, B:90:0x0047, B:92:0x004d, B:93:0x0056, B:111:0x0082, B:112:0x0087), top: B:120:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x005b A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:94:0x0058, B:96:0x005b, B:99:0x0064, B:101:0x0068, B:106:0x0076, B:107:0x007d, B:113:0x0088, B:114:0x0089), top: B:119:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0064 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:94:0x0058, B:96:0x005b, B:99:0x0064, B:101:0x0068, B:106:0x0076, B:107:0x007d, B:113:0x0088, B:114:0x0089), top: B:119:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Http2Stream newStream(int i, List<Header> list, boolean z) throws IOException {
        Throwable th;
        boolean z2;
        boolean z3 = !z;
        synchronized (this.writer) {
            try {
                try {
                    synchronized (this) {
                        try {
                            if (this.nextStreamId > 1073741823) {
                                try {
                                    shutdown(ErrorCode.REFUSED_STREAM);
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        try {
                            if (!this.isShutdown) {
                                int i2 = this.nextStreamId;
                                this.nextStreamId = i2 + 2;
                                Http2Stream http2Stream = new Http2Stream(i2, this, z3, false, null);
                                if (z && this.writeBytesTotal < this.writeBytesMaximum && http2Stream.getWriteBytesTotal() < http2Stream.getWriteBytesMaximum()) {
                                    z2 = false;
                                    if (http2Stream.isOpen()) {
                                        this.streams.put(Integer.valueOf(i2), http2Stream);
                                    }
                                    C7458kA2 c7458kA2 = C7458kA2.a;
                                    if (i != 0) {
                                        this.writer.headers(z3, i2, list);
                                    } else if (!this.client) {
                                        this.writer.pushPromise(i, i2, list);
                                    } else {
                                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                                    }
                                    if (z2) {
                                        this.writer.flush();
                                    }
                                    return http2Stream;
                                }
                                z2 = true;
                                if (http2Stream.isOpen()) {
                                }
                                C7458kA2 c7458kA22 = C7458kA2.a;
                                if (i != 0) {
                                }
                                if (z2) {
                                }
                                return http2Stream;
                            }
                            throw new ConnectionShutdownException();
                        } catch (Throwable th4) {
                            th = th4;
                            th = th;
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                throw th;
            }
        }
    }

    @InterfaceC8289nW0
    public final void start(boolean z) throws IOException {
        start$default(this, z, null, 2, null);
    }

    @InterfaceC8289nW0
    public final void start(boolean z, @NotNull TaskRunner taskRunner) throws IOException {
        C6562gT0.p(taskRunner, "taskRunner");
        if (z) {
            this.writer.connectionPreface();
            this.writer.settings(this.okHttpSettings);
            int initialWindowSize = this.okHttpSettings.getInitialWindowSize();
            if (initialWindowSize != 65535) {
                this.writer.windowUpdate(0, initialWindowSize - 65535);
            }
        }
        taskRunner.newQueue().schedule(new TaskQueue$execute$1(this.connectionName, true, this.readerRunnable), 0L);
    }

    public final void writePing() throws InterruptedException {
        synchronized (this) {
            this.awaitPingsSent++;
        }
        writePing(false, 3, 1330343787);
    }
}
