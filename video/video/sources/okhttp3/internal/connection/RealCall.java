package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import o.C3526Lf;
import o.C3771Nr1;
import o.C3917Pf0;
import o.C6562gT0;
import o.C7458kA2;
import o.C9444sF;
import o.InterfaceC8303na2;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.CertificatePinner;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheInterceptor;
import okhttp3.internal.http.BridgeInterceptor;
import okhttp3.internal.http.CallServerInterceptor;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import okhttp3.internal.platform.Platform;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nRealCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,551:1\n1#2:552\n608#3,4:553\n615#3,4:557\n615#3,4:561\n608#3,4:565\n350#4,7:569\n*S KotlinDebug\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall\n*L\n269#1:553,4\n344#1:557,4\n348#1:561,4\n375#1:565,4\n378#1:569,7\n*E\n"})
/* loaded from: classes4.dex */
public final class RealCall implements Call {
    @Nullable
    private Object callStackTrace;
    private volatile boolean canceled;
    @NotNull
    private final OkHttpClient client;
    @Nullable
    private RealConnection connection;
    @NotNull
    private final RealConnectionPool connectionPool;
    @Nullable
    private volatile RealConnection connectionToCancel;
    @NotNull
    private final EventListener eventListener;
    @Nullable
    private volatile Exchange exchange;
    @Nullable
    private ExchangeFinder exchangeFinder;
    @NotNull
    private final AtomicBoolean executed;
    private boolean expectMoreExchanges;
    private final boolean forWebSocket;
    @Nullable
    private Exchange interceptorScopedExchange;
    @NotNull
    private final Request originalRequest;
    private boolean requestBodyOpen;
    private boolean responseBodyOpen;
    @NotNull
    private final RealCall$timeout$1 timeout;
    private boolean timeoutEarlyExit;

    @InterfaceC8303na2({"SMAP\nRealCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall$AsyncCall\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,551:1\n615#2,4:552\n409#2,9:556\n*S KotlinDebug\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall$AsyncCall\n*L\n494#1:552,4\n513#1:556,9\n*E\n"})
    /* loaded from: classes4.dex */
    public final class AsyncCall implements Runnable {
        @NotNull
        private volatile AtomicInteger callsPerHost;
        @NotNull
        private final Callback responseCallback;
        final /* synthetic */ RealCall this$0;

        public AsyncCall(@NotNull RealCall realCall, Callback callback) {
            C6562gT0.p(callback, "responseCallback");
            this.this$0 = realCall;
            this.responseCallback = callback;
            this.callsPerHost = new AtomicInteger(0);
        }

        public final void executeOn(@NotNull ExecutorService executorService) {
            C6562gT0.p(executorService, "executorService");
            Dispatcher dispatcher = this.this$0.getClient().dispatcher();
            if (Util.assertionsEnabled && Thread.holdsLock(dispatcher)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + dispatcher);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    this.this$0.noMoreExchanges$okhttp(interruptedIOException);
                    this.responseCallback.onFailure(this.this$0, interruptedIOException);
                    this.this$0.getClient().dispatcher().finished$okhttp(this);
                }
            } catch (Throwable th) {
                this.this$0.getClient().dispatcher().finished$okhttp(this);
                throw th;
            }
        }

        @NotNull
        public final RealCall getCall() {
            return this.this$0;
        }

        @NotNull
        public final AtomicInteger getCallsPerHost() {
            return this.callsPerHost;
        }

        @NotNull
        public final String getHost() {
            return this.this$0.getOriginalRequest().url().host();
        }

        @NotNull
        public final Request getRequest() {
            return this.this$0.getOriginalRequest();
        }

        public final void reuseCallsPerHostFrom(@NotNull AsyncCall asyncCall) {
            C6562gT0.p(asyncCall, "other");
            this.callsPerHost = asyncCall.callsPerHost;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            Throwable th;
            IOException e;
            Dispatcher dispatcher;
            RealCall realCall = this.this$0;
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            currentThread.setName("OkHttp " + this.this$0.redactedUrl$okhttp());
            try {
                realCall.timeout.enter();
                try {
                    z = true;
                } catch (IOException e2) {
                    z = false;
                    e = e2;
                } catch (Throwable th2) {
                    z = false;
                    th = th2;
                }
                try {
                    this.responseCallback.onResponse(realCall, realCall.getResponseWithInterceptorChain$okhttp());
                    dispatcher = realCall.getClient().dispatcher();
                } catch (IOException e3) {
                    e = e3;
                    if (z) {
                        Platform.Companion.get().log("Callback failure for " + realCall.toLoggableString(), 4, e);
                    } else {
                        this.responseCallback.onFailure(realCall, e);
                    }
                    dispatcher = realCall.getClient().dispatcher();
                    dispatcher.finished$okhttp(this);
                } catch (Throwable th3) {
                    th = th3;
                    realCall.cancel();
                    if (!z) {
                        IOException iOException = new IOException("canceled due to " + th);
                        C3917Pf0.a(iOException, th);
                        this.responseCallback.onFailure(realCall, iOException);
                    }
                    throw th;
                }
                dispatcher.finished$okhttp(this);
            } finally {
                currentThread.setName(name);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class CallReference extends WeakReference<RealCall> {
        @Nullable
        private final Object callStackTrace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CallReference(@NotNull RealCall realCall, @Nullable Object obj) {
            super(realCall);
            C6562gT0.p(realCall, "referent");
            this.callStackTrace = obj;
        }

        @Nullable
        public final Object getCallStackTrace() {
            return this.callStackTrace;
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [o.mp2, okhttp3.internal.connection.RealCall$timeout$1] */
    public RealCall(@NotNull OkHttpClient okHttpClient, @NotNull Request request, boolean z) {
        C6562gT0.p(okHttpClient, "client");
        C6562gT0.p(request, "originalRequest");
        this.client = okHttpClient;
        this.originalRequest = request;
        this.forWebSocket = z;
        this.connectionPool = okHttpClient.connectionPool().getDelegate$okhttp();
        this.eventListener = okHttpClient.eventListenerFactory().create(this);
        ?? r4 = new C3526Lf() { // from class: okhttp3.internal.connection.RealCall$timeout$1
            @Override // o.C3526Lf
            public void timedOut() {
                RealCall.this.cancel();
            }
        };
        r4.timeout(okHttpClient.callTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.timeout = r4;
        this.executed = new AtomicBoolean();
        this.expectMoreExchanges = true;
    }

    private final <E extends IOException> E callDone(E e) {
        Socket releaseConnectionNoEvents$okhttp;
        boolean z = Util.assertionsEnabled;
        if (z && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        RealConnection realConnection = this.connection;
        if (realConnection != null) {
            if (z && Thread.holdsLock(realConnection)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + realConnection);
            }
            synchronized (realConnection) {
                releaseConnectionNoEvents$okhttp = releaseConnectionNoEvents$okhttp();
            }
            if (this.connection == null) {
                if (releaseConnectionNoEvents$okhttp != null) {
                    Util.closeQuietly(releaseConnectionNoEvents$okhttp);
                }
                this.eventListener.connectionReleased(this, realConnection);
            } else if (releaseConnectionNoEvents$okhttp != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        E e2 = (E) timeoutExit(e);
        if (e != null) {
            EventListener eventListener = this.eventListener;
            C6562gT0.m(e2);
            eventListener.callFailed(this, e2);
            return e2;
        }
        this.eventListener.callEnd(this);
        return e2;
    }

    private final void callStart() {
        this.callStackTrace = Platform.Companion.get().getStackTraceForCloseable("response.body().close()");
        this.eventListener.callStart(this);
    }

    private final Address createAddress(HttpUrl httpUrl) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        CertificatePinner certificatePinner;
        if (httpUrl.isHttps()) {
            sSLSocketFactory = this.client.sslSocketFactory();
            hostnameVerifier = this.client.hostnameVerifier();
            certificatePinner = this.client.certificatePinner();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new Address(httpUrl.host(), httpUrl.port(), this.client.dns(), this.client.socketFactory(), sSLSocketFactory, hostnameVerifier, certificatePinner, this.client.proxyAuthenticator(), this.client.proxy(), this.client.protocols(), this.client.connectionSpecs(), this.client.proxySelector());
    }

    private final <E extends IOException> E timeoutExit(E e) {
        if (this.timeoutEarlyExit || !exit()) {
            return e;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (e != null) {
            interruptedIOException.initCause(e);
        }
        return interruptedIOException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String toLoggableString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (isCanceled()) {
            str = "canceled ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.forWebSocket) {
            str2 = "web socket";
        } else {
            str2 = C3771Nr1.E0;
        }
        sb.append(str2);
        sb.append(" to ");
        sb.append(redactedUrl$okhttp());
        return sb.toString();
    }

    public final void acquireConnectionNoEvents(@NotNull RealConnection realConnection) {
        C6562gT0.p(realConnection, "connection");
        if (Util.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
        } else if (this.connection == null) {
            this.connection = realConnection;
            realConnection.getCalls().add(new CallReference(this, this.callStackTrace));
        } else {
            throw new IllegalStateException("Check failed.");
        }
    }

    @Override // okhttp3.Call
    public void cancel() {
        if (this.canceled) {
            return;
        }
        this.canceled = true;
        Exchange exchange = this.exchange;
        if (exchange != null) {
            exchange.cancel();
        }
        RealConnection realConnection = this.connectionToCancel;
        if (realConnection != null) {
            realConnection.cancel();
        }
        this.eventListener.canceled(this);
    }

    @Override // okhttp3.Call
    public void enqueue(@NotNull Callback callback) {
        C6562gT0.p(callback, "responseCallback");
        if (this.executed.compareAndSet(false, true)) {
            callStart();
            this.client.dispatcher().enqueue$okhttp(new AsyncCall(this, callback));
            return;
        }
        throw new IllegalStateException("Already Executed");
    }

    public final void enterNetworkInterceptorExchange(@NotNull Request request, boolean z) {
        C6562gT0.p(request, "request");
        if (this.interceptorScopedExchange == null) {
            synchronized (this) {
                if (!this.responseBodyOpen) {
                    if (!this.requestBodyOpen) {
                        C7458kA2 c7458kA2 = C7458kA2.a;
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                } else {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                }
            }
            if (z) {
                this.exchangeFinder = new ExchangeFinder(this.connectionPool, createAddress(request.url()), this, this.eventListener);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // okhttp3.Call
    @NotNull
    public Response execute() {
        if (this.executed.compareAndSet(false, true)) {
            enter();
            callStart();
            try {
                this.client.dispatcher().executed$okhttp(this);
                return getResponseWithInterceptorChain$okhttp();
            } finally {
                this.client.dispatcher().finished$okhttp(this);
            }
        }
        throw new IllegalStateException("Already Executed");
    }

    public final void exitNetworkInterceptorExchange$okhttp(boolean z) {
        Exchange exchange;
        synchronized (this) {
            if (this.expectMoreExchanges) {
                C7458kA2 c7458kA2 = C7458kA2.a;
            } else {
                throw new IllegalStateException("released");
            }
        }
        if (z && (exchange = this.exchange) != null) {
            exchange.detachWithViolence();
        }
        this.interceptorScopedExchange = null;
    }

    @NotNull
    public final OkHttpClient getClient() {
        return this.client;
    }

    @Nullable
    public final RealConnection getConnection() {
        return this.connection;
    }

    @Nullable
    public final RealConnection getConnectionToCancel() {
        return this.connectionToCancel;
    }

    @NotNull
    public final EventListener getEventListener$okhttp() {
        return this.eventListener;
    }

    public final boolean getForWebSocket() {
        return this.forWebSocket;
    }

    @Nullable
    public final Exchange getInterceptorScopedExchange$okhttp() {
        return this.interceptorScopedExchange;
    }

    @NotNull
    public final Request getOriginalRequest() {
        return this.originalRequest;
    }

    @NotNull
    public final Response getResponseWithInterceptorChain$okhttp() throws IOException {
        ArrayList arrayList = new ArrayList();
        C9444sF.q0(arrayList, this.client.interceptors());
        arrayList.add(new RetryAndFollowUpInterceptor(this.client));
        arrayList.add(new BridgeInterceptor(this.client.cookieJar()));
        arrayList.add(new CacheInterceptor(this.client.cache()));
        arrayList.add(ConnectInterceptor.INSTANCE);
        if (!this.forWebSocket) {
            C9444sF.q0(arrayList, this.client.networkInterceptors());
        }
        arrayList.add(new CallServerInterceptor(this.forWebSocket));
        boolean z = false;
        try {
            try {
                Response proceed = new RealInterceptorChain(this, arrayList, 0, null, this.originalRequest, this.client.connectTimeoutMillis(), this.client.readTimeoutMillis(), this.client.writeTimeoutMillis()).proceed(this.originalRequest);
                if (!isCanceled()) {
                    noMoreExchanges$okhttp(null);
                    return proceed;
                }
                Util.closeQuietly(proceed);
                throw new IOException("Canceled");
            } catch (IOException e) {
                z = true;
                IOException noMoreExchanges$okhttp = noMoreExchanges$okhttp(e);
                C6562gT0.n(noMoreExchanges$okhttp, "null cannot be cast to non-null type kotlin.Throwable");
                throw noMoreExchanges$okhttp;
            }
        } catch (Throwable th) {
            if (!z) {
                noMoreExchanges$okhttp(null);
            }
            throw th;
        }
    }

    @NotNull
    public final Exchange initExchange$okhttp(@NotNull RealInterceptorChain realInterceptorChain) {
        C6562gT0.p(realInterceptorChain, "chain");
        synchronized (this) {
            if (this.expectMoreExchanges) {
                if (!this.responseBodyOpen) {
                    if (!this.requestBodyOpen) {
                        C7458kA2 c7458kA2 = C7458kA2.a;
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            } else {
                throw new IllegalStateException("released");
            }
        }
        ExchangeFinder exchangeFinder = this.exchangeFinder;
        C6562gT0.m(exchangeFinder);
        Exchange exchange = new Exchange(this, this.eventListener, exchangeFinder, exchangeFinder.find(this.client, realInterceptorChain));
        this.interceptorScopedExchange = exchange;
        this.exchange = exchange;
        synchronized (this) {
            this.requestBodyOpen = true;
            this.responseBodyOpen = true;
        }
        if (!this.canceled) {
            return exchange;
        }
        throw new IOException("Canceled");
    }

    @Override // okhttp3.Call
    public boolean isCanceled() {
        return this.canceled;
    }

    @Override // okhttp3.Call
    public boolean isExecuted() {
        return this.executed.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0021 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001b), top: B:46:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0025 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001b), top: B:46:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <E extends IOException> E messageDone$okhttp(@NotNull Exchange exchange, boolean z, boolean z2, E e) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C6562gT0.p(exchange, "exchange");
        if (C6562gT0.g(exchange, this.exchange)) {
            synchronized (this) {
                z3 = false;
                if (z) {
                    try {
                        if (!this.requestBodyOpen) {
                        }
                        if (z) {
                            this.requestBodyOpen = false;
                        }
                        if (z2) {
                            this.responseBodyOpen = false;
                        }
                        z5 = this.requestBodyOpen;
                        if (z5 && !this.responseBodyOpen) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (!z5 && !this.responseBodyOpen && !this.expectMoreExchanges) {
                            z3 = true;
                        }
                        z4 = z3;
                        z3 = z6;
                        C7458kA2 c7458kA2 = C7458kA2.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!z2 || !this.responseBodyOpen) {
                    z4 = false;
                    C7458kA2 c7458kA22 = C7458kA2.a;
                }
                if (z) {
                }
                if (z2) {
                }
                z5 = this.requestBodyOpen;
                if (z5) {
                }
                z6 = false;
                if (!z5) {
                    z3 = true;
                }
                z4 = z3;
                z3 = z6;
                C7458kA2 c7458kA222 = C7458kA2.a;
            }
            if (z3) {
                this.exchange = null;
                RealConnection realConnection = this.connection;
                if (realConnection != null) {
                    realConnection.incrementSuccessCount$okhttp();
                }
            }
            if (z4) {
                return (E) callDone(e);
            }
        }
        return e;
    }

    @Nullable
    public final IOException noMoreExchanges$okhttp(@Nullable IOException iOException) {
        boolean z;
        synchronized (this) {
            try {
                z = false;
                if (this.expectMoreExchanges) {
                    this.expectMoreExchanges = false;
                    if (!this.requestBodyOpen && !this.responseBodyOpen) {
                        z = true;
                    }
                }
                C7458kA2 c7458kA2 = C7458kA2.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            return callDone(iOException);
        }
        return iOException;
    }

    @NotNull
    public final String redactedUrl$okhttp() {
        return this.originalRequest.url().redact();
    }

    @Nullable
    public final Socket releaseConnectionNoEvents$okhttp() {
        RealConnection realConnection = this.connection;
        C6562gT0.m(realConnection);
        if (Util.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
        }
        List<Reference<RealCall>> calls = realConnection.getCalls();
        Iterator<Reference<RealCall>> it = calls.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (C6562gT0.g(it.next().get(), this)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i != -1) {
            calls.remove(i);
            this.connection = null;
            if (calls.isEmpty()) {
                realConnection.setIdleAtNs$okhttp(System.nanoTime());
                if (this.connectionPool.connectionBecameIdle(realConnection)) {
                    return realConnection.socket();
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // okhttp3.Call
    @NotNull
    public Request request() {
        return this.originalRequest;
    }

    public final boolean retryAfterFailure() {
        ExchangeFinder exchangeFinder = this.exchangeFinder;
        C6562gT0.m(exchangeFinder);
        return exchangeFinder.retryAfterFailure();
    }

    public final void setConnectionToCancel(@Nullable RealConnection realConnection) {
        this.connectionToCancel = realConnection;
    }

    public final void timeoutEarlyExit() {
        if (!this.timeoutEarlyExit) {
            this.timeoutEarlyExit = true;
            exit();
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // okhttp3.Call
    @NotNull
    public C3526Lf timeout() {
        return this.timeout;
    }

    @Override // okhttp3.Call
    @NotNull
    public RealCall clone() {
        return new RealCall(this.client, this.originalRequest, this.forWebSocket);
    }
}
