package okhttp3.internal.connection;

import com.facebook.login.C;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import o.AI0;
import o.C3771Nr1;
import o.C6562gT0;
import o.C7819lf2;
import o.C9516sY;
import o.C9545sf2;
import o.C9604su1;
import o.InterfaceC2579Bq;
import o.InterfaceC2677Cq;
import o.InterfaceC8303na2;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.ConnectionSpec;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nRealConnection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealConnection.kt\nokhttp3/internal/connection/RealConnection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,765:1\n1#2:766\n608#3,4:767\n608#3,4:774\n615#3,4:778\n1747#4,3:771\n*S KotlinDebug\n*F\n+ 1 RealConnection.kt\nokhttp3/internal/connection/RealConnection\n*L\n529#1:767,4\n582#1:774,4\n648#1:778,4\n574#1:771,3\n*E\n"})
/* loaded from: classes4.dex */
public final class RealConnection extends Http2Connection.Listener implements Connection {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final long IDLE_CONNECTION_HEALTHY_NS = 10000000000L;
    private static final int MAX_TUNNEL_ATTEMPTS = 21;
    @NotNull
    private static final String NPE_THROW_WITH_NULL = "throw with null exception";
    private int allocationLimit;
    @NotNull
    private final List<Reference<RealCall>> calls;
    @NotNull
    private final RealConnectionPool connectionPool;
    @Nullable
    private Handshake handshake;
    @Nullable
    private Http2Connection http2Connection;
    private long idleAtNs;
    private boolean noCoalescedConnections;
    private boolean noNewExchanges;
    @Nullable
    private Protocol protocol;
    @Nullable
    private Socket rawSocket;
    private int refusedStreamCount;
    @NotNull
    private final Route route;
    private int routeFailureCount;
    @Nullable
    private InterfaceC2579Bq sink;
    @Nullable
    private Socket socket;
    @Nullable
    private InterfaceC2677Cq source;
    private int successCount;

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        @NotNull
        public final RealConnection newTestConnection(@NotNull RealConnectionPool realConnectionPool, @NotNull Route route, @NotNull Socket socket, long j) {
            C6562gT0.p(realConnectionPool, "connectionPool");
            C6562gT0.p(route, "route");
            C6562gT0.p(socket, "socket");
            RealConnection realConnection = new RealConnection(realConnectionPool, route);
            realConnection.socket = socket;
            realConnection.setIdleAtNs$okhttp(j);
            return realConnection;
        }

        private Companion() {
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealConnection(@NotNull RealConnectionPool realConnectionPool, @NotNull Route route) {
        C6562gT0.p(realConnectionPool, "connectionPool");
        C6562gT0.p(route, "route");
        this.connectionPool = realConnectionPool;
        this.route = route;
        this.allocationLimit = 1;
        this.calls = new ArrayList();
        this.idleAtNs = Long.MAX_VALUE;
    }

    private final boolean certificateSupportHost(HttpUrl httpUrl, Handshake handshake) {
        List<Certificate> peerCertificates = handshake.peerCertificates();
        if (!peerCertificates.isEmpty()) {
            OkHostnameVerifier okHostnameVerifier = OkHostnameVerifier.INSTANCE;
            String host = httpUrl.host();
            Certificate certificate = peerCertificates.get(0);
            C6562gT0.n(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            if (okHostnameVerifier.verify(host, (X509Certificate) certificate)) {
                return true;
            }
        }
        return false;
    }

    private final void connectSocket(int i, int i2, Call call, EventListener eventListener) throws IOException {
        int i3;
        Socket createSocket;
        Proxy proxy = this.route.proxy();
        Address address = this.route.address();
        Proxy.Type type = proxy.type();
        if (type == null) {
            i3 = -1;
        } else {
            i3 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        }
        if (i3 != 1 && i3 != 2) {
            createSocket = new Socket(proxy);
        } else {
            createSocket = address.socketFactory().createSocket();
            C6562gT0.m(createSocket);
        }
        this.rawSocket = createSocket;
        eventListener.connectStart(call, this.route.socketAddress(), proxy);
        createSocket.setSoTimeout(i2);
        try {
            Platform.Companion.get().connectSocket(createSocket, this.route.socketAddress(), i);
            try {
                this.source = C9604su1.e(C9604su1.v(createSocket));
                this.sink = C9604su1.d(C9604su1.q(createSocket));
            } catch (NullPointerException e) {
                if (!C6562gT0.g(e.getMessage(), NPE_THROW_WITH_NULL)) {
                    return;
                }
                throw new IOException(e);
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.route.socketAddress());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    private final void connectTls(ConnectionSpecSelector connectionSpecSelector) throws IOException {
        Protocol protocol;
        Address address = this.route.address();
        SSLSocketFactory sslSocketFactory = address.sslSocketFactory();
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            C6562gT0.m(sslSocketFactory);
            Socket createSocket = sslSocketFactory.createSocket(this.rawSocket, address.url().host(), address.url().port(), true);
            C6562gT0.n(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                ConnectionSpec configureSecureSocket = connectionSpecSelector.configureSecureSocket(sSLSocket2);
                if (configureSecureSocket.supportsTlsExtensions()) {
                    Platform.Companion.get().configureTlsExtensions(sSLSocket2, address.url().host(), address.protocols());
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                Handshake.Companion companion = Handshake.Companion;
                C6562gT0.o(session, "sslSocketSession");
                Handshake handshake = companion.get(session);
                HostnameVerifier hostnameVerifier = address.hostnameVerifier();
                C6562gT0.m(hostnameVerifier);
                if (!hostnameVerifier.verify(address.url().host(), session)) {
                    List<Certificate> peerCertificates = handshake.peerCertificates();
                    if (!peerCertificates.isEmpty()) {
                        Certificate certificate = peerCertificates.get(0);
                        C6562gT0.n(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                        X509Certificate x509Certificate = (X509Certificate) certificate;
                        throw new SSLPeerUnverifiedException(C7819lf2.x("\n              |Hostname " + address.url().host() + " not verified:\n              |    certificate: " + CertificatePinner.Companion.pin(x509Certificate) + "\n              |    DN: " + x509Certificate.getSubjectDN().getName() + "\n              |    subjectAltNames: " + OkHostnameVerifier.INSTANCE.allSubjectAltNames(x509Certificate) + "\n              ", null, 1, null));
                    }
                    throw new SSLPeerUnverifiedException("Hostname " + address.url().host() + " not verified (no certificates)");
                }
                CertificatePinner certificatePinner = address.certificatePinner();
                C6562gT0.m(certificatePinner);
                this.handshake = new Handshake(handshake.tlsVersion(), handshake.cipherSuite(), handshake.localCertificates(), new RealConnection$connectTls$1(certificatePinner, handshake, address));
                certificatePinner.check$okhttp(address.url().host(), new RealConnection$connectTls$2(this));
                if (configureSecureSocket.supportsTlsExtensions()) {
                    str = Platform.Companion.get().getSelectedProtocol(sSLSocket2);
                }
                this.socket = sSLSocket2;
                this.source = C9604su1.e(C9604su1.v(sSLSocket2));
                this.sink = C9604su1.d(C9604su1.q(sSLSocket2));
                if (str != null) {
                    protocol = Protocol.Companion.get(str);
                } else {
                    protocol = Protocol.HTTP_1_1;
                }
                this.protocol = protocol;
                Platform.Companion.get().afterHandshake(sSLSocket2);
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    Platform.Companion.get().afterHandshake(sSLSocket);
                }
                if (sSLSocket != null) {
                    Util.closeQuietly((Socket) sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final void connectTunnel(int i, int i2, int i3, Call call, EventListener eventListener) throws IOException {
        Request createTunnelRequest = createTunnelRequest();
        HttpUrl url = createTunnelRequest.url();
        for (int i4 = 0; i4 < 21; i4++) {
            connectSocket(i, i2, call, eventListener);
            createTunnelRequest = createTunnel(i2, i3, createTunnelRequest, url);
            if (createTunnelRequest != null) {
                Socket socket = this.rawSocket;
                if (socket != null) {
                    Util.closeQuietly(socket);
                }
                this.rawSocket = null;
                this.sink = null;
                this.source = null;
                eventListener.connectEnd(call, this.route.socketAddress(), this.route.proxy(), null);
            } else {
                return;
            }
        }
    }

    private final Request createTunnel(int i, int i2, Request request, HttpUrl httpUrl) throws IOException {
        String str = "CONNECT " + Util.toHostHeader(httpUrl, true) + " HTTP/1.1";
        while (true) {
            InterfaceC2677Cq interfaceC2677Cq = this.source;
            C6562gT0.m(interfaceC2677Cq);
            InterfaceC2579Bq interfaceC2579Bq = this.sink;
            C6562gT0.m(interfaceC2579Bq);
            Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(null, this, interfaceC2677Cq, interfaceC2579Bq);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            interfaceC2677Cq.timeout().timeout(i, timeUnit);
            interfaceC2579Bq.timeout().timeout(i2, timeUnit);
            http1ExchangeCodec.writeRequest(request.headers(), str);
            http1ExchangeCodec.finishRequest();
            Response.Builder readResponseHeaders = http1ExchangeCodec.readResponseHeaders(false);
            C6562gT0.m(readResponseHeaders);
            Response build = readResponseHeaders.request(request).build();
            http1ExchangeCodec.skipConnectBody(build);
            int code = build.code();
            if (code != 200) {
                if (code == 407) {
                    Request authenticate = this.route.address().proxyAuthenticator().authenticate(this.route, build);
                    if (authenticate != null) {
                        if (C9545sf2.c2("close", Response.header$default(build, "Connection", null, 2, null), true)) {
                            return authenticate;
                        }
                        request = authenticate;
                    } else {
                        throw new IOException("Failed to authenticate with proxy");
                    }
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + build.code());
                }
            } else if (interfaceC2677Cq.B().M3() && interfaceC2579Bq.B().M3()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    private final Request createTunnelRequest() throws IOException {
        Request build = new Request.Builder().url(this.route.address().url()).method("CONNECT", null).header(AI0.w, Util.toHostHeader(this.route.address().url(), true)).header("Proxy-Connection", AI0.u0).header("User-Agent", Util.userAgent).build();
        Request authenticate = this.route.address().proxyAuthenticator().authenticate(this.route, new Response.Builder().request(build).protocol(Protocol.HTTP_1_1).code(407).message("Preemptive Authenticate").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(-1L).header("Proxy-Authenticate", "OkHttp-Preemptive").build());
        if (authenticate == null) {
            return build;
        }
        return authenticate;
    }

    private final void establishProtocol(ConnectionSpecSelector connectionSpecSelector, int i, Call call, EventListener eventListener) throws IOException {
        if (this.route.address().sslSocketFactory() == null) {
            List<Protocol> protocols = this.route.address().protocols();
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (protocols.contains(protocol)) {
                this.socket = this.rawSocket;
                this.protocol = protocol;
                startHttp2(i);
                return;
            }
            this.socket = this.rawSocket;
            this.protocol = Protocol.HTTP_1_1;
            return;
        }
        eventListener.secureConnectStart(call);
        connectTls(connectionSpecSelector);
        eventListener.secureConnectEnd(call, this.handshake);
        if (this.protocol == Protocol.HTTP_2) {
            startHttp2(i);
        }
    }

    private final boolean routeMatchesAny(List<Route> list) {
        List<Route> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (Route route : list2) {
            Proxy.Type type = route.proxy().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.route.proxy().type() == type2 && C6562gT0.g(this.route.socketAddress(), route.socketAddress())) {
                return true;
            }
        }
        return false;
    }

    private final void startHttp2(int i) throws IOException {
        Socket socket = this.socket;
        C6562gT0.m(socket);
        InterfaceC2677Cq interfaceC2677Cq = this.source;
        C6562gT0.m(interfaceC2677Cq);
        InterfaceC2579Bq interfaceC2579Bq = this.sink;
        C6562gT0.m(interfaceC2579Bq);
        socket.setSoTimeout(0);
        Http2Connection build = new Http2Connection.Builder(true, TaskRunner.INSTANCE).socket(socket, this.route.address().url().host(), interfaceC2677Cq, interfaceC2579Bq).listener(this).pingIntervalMillis(i).build();
        this.http2Connection = build;
        this.allocationLimit = Http2Connection.Companion.getDEFAULT_SETTINGS().getMaxConcurrentStreams();
        Http2Connection.start$default(build, false, null, 3, null);
    }

    private final boolean supportsUrl(HttpUrl httpUrl) {
        Handshake handshake;
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        HttpUrl url = this.route.address().url();
        if (httpUrl.port() != url.port()) {
            return false;
        }
        if (C6562gT0.g(httpUrl.host(), url.host())) {
            return true;
        }
        if (!this.noCoalescedConnections && (handshake = this.handshake) != null) {
            C6562gT0.m(handshake);
            if (certificateSupportHost(httpUrl, handshake)) {
                return true;
            }
        }
        return false;
    }

    public final void cancel() {
        Socket socket = this.rawSocket;
        if (socket != null) {
            Util.closeQuietly(socket);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void connect(int i, int i2, int i3, int i4, boolean z, @NotNull Call call, @NotNull EventListener eventListener) {
        Socket socket;
        Socket socket2;
        Call call2 = call;
        EventListener eventListener2 = eventListener;
        C6562gT0.p(call2, C3771Nr1.E0);
        C6562gT0.p(eventListener2, "eventListener");
        if (this.protocol == null) {
            List<ConnectionSpec> connectionSpecs = this.route.address().connectionSpecs();
            ConnectionSpecSelector connectionSpecSelector = new ConnectionSpecSelector(connectionSpecs);
            if (this.route.address().sslSocketFactory() == null) {
                if (connectionSpecs.contains(ConnectionSpec.CLEARTEXT)) {
                    String host = this.route.address().url().host();
                    if (!Platform.Companion.get().isCleartextTrafficPermitted(host)) {
                        throw new RouteException(new UnknownServiceException("CLEARTEXT communication to " + host + " not permitted by network security policy"));
                    }
                } else {
                    throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
                }
            } else if (this.route.address().protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
                throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
            }
            RouteException routeException = null;
            while (true) {
                try {
                    if (this.route.requiresTunnel()) {
                        EventListener eventListener3 = eventListener2;
                        Call call3 = call2;
                        try {
                            connectTunnel(i, i2, i3, call3, eventListener3);
                            call2 = call3;
                            eventListener2 = eventListener3;
                            try {
                                if (this.rawSocket == null) {
                                    break;
                                }
                            } catch (IOException e) {
                                e = e;
                                IOException iOException = e;
                                socket = this.socket;
                                if (socket != null) {
                                }
                                socket2 = this.rawSocket;
                                if (socket2 != null) {
                                }
                                this.socket = null;
                                this.rawSocket = null;
                                this.source = null;
                                this.sink = null;
                                this.handshake = null;
                                this.protocol = null;
                                this.http2Connection = null;
                                this.allocationLimit = 1;
                                eventListener2.connectFailed(call2, this.route.socketAddress(), this.route.proxy(), null, iOException);
                                if (routeException != null) {
                                }
                                if (z) {
                                    break;
                                }
                                break;
                                throw routeException;
                            }
                        } catch (IOException e2) {
                            e = e2;
                            call2 = call3;
                            eventListener2 = eventListener3;
                        }
                    } else {
                        connectSocket(i, i2, call2, eventListener2);
                    }
                    try {
                        establishProtocol(connectionSpecSelector, i4, call2, eventListener2);
                        eventListener2.connectEnd(call2, this.route.socketAddress(), this.route.proxy(), this.protocol);
                        break;
                    } catch (IOException e3) {
                        e = e3;
                        IOException iOException2 = e;
                        socket = this.socket;
                        if (socket != null) {
                            Util.closeQuietly(socket);
                        }
                        socket2 = this.rawSocket;
                        if (socket2 != null) {
                            Util.closeQuietly(socket2);
                        }
                        this.socket = null;
                        this.rawSocket = null;
                        this.source = null;
                        this.sink = null;
                        this.handshake = null;
                        this.protocol = null;
                        this.http2Connection = null;
                        this.allocationLimit = 1;
                        eventListener2.connectFailed(call2, this.route.socketAddress(), this.route.proxy(), null, iOException2);
                        if (routeException != null) {
                            routeException = new RouteException(iOException2);
                        } else {
                            routeException.addConnectException(iOException2);
                        }
                        if (z && connectionSpecSelector.connectionFailed(iOException2)) {
                            call2 = call;
                            eventListener2 = eventListener;
                        } else {
                            throw routeException;
                        }
                    }
                } catch (IOException e4) {
                    e = e4;
                }
                call2 = call;
                eventListener2 = eventListener;
            }
            if (this.route.requiresTunnel() && this.rawSocket == null) {
                throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
            }
            this.idleAtNs = System.nanoTime();
            return;
        }
        throw new IllegalStateException("already connected");
    }

    public final void connectFailed$okhttp(@NotNull OkHttpClient okHttpClient, @NotNull Route route, @NotNull IOException iOException) {
        C6562gT0.p(okHttpClient, "client");
        C6562gT0.p(route, "failedRoute");
        C6562gT0.p(iOException, C.L);
        if (route.proxy().type() != Proxy.Type.DIRECT) {
            Address address = route.address();
            address.proxySelector().connectFailed(address.url().uri(), route.proxy().address(), iOException);
        }
        okHttpClient.getRouteDatabase().failed(route);
    }

    @NotNull
    public final List<Reference<RealCall>> getCalls() {
        return this.calls;
    }

    @NotNull
    public final RealConnectionPool getConnectionPool() {
        return this.connectionPool;
    }

    public final long getIdleAtNs$okhttp() {
        return this.idleAtNs;
    }

    public final boolean getNoNewExchanges() {
        return this.noNewExchanges;
    }

    public final int getRouteFailureCount$okhttp() {
        return this.routeFailureCount;
    }

    @Override // okhttp3.Connection
    @Nullable
    public Handshake handshake() {
        return this.handshake;
    }

    public final synchronized void incrementSuccessCount$okhttp() {
        this.successCount++;
    }

    public final boolean isEligible$okhttp(@NotNull Address address, @Nullable List<Route> list) {
        C6562gT0.p(address, "address");
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        } else if (this.calls.size() >= this.allocationLimit || this.noNewExchanges || !this.route.address().equalsNonHost$okhttp(address)) {
            return false;
        } else {
            if (C6562gT0.g(address.url().host(), route().address().url().host())) {
                return true;
            }
            if (this.http2Connection == null || list == null || !routeMatchesAny(list) || address.hostnameVerifier() != OkHostnameVerifier.INSTANCE || !supportsUrl(address.url())) {
                return false;
            }
            try {
                CertificatePinner certificatePinner = address.certificatePinner();
                C6562gT0.m(certificatePinner);
                String host = address.url().host();
                Handshake handshake = handshake();
                C6562gT0.m(handshake);
                certificatePinner.check(host, handshake.peerCertificates());
                return true;
            } catch (SSLPeerUnverifiedException unused) {
                return false;
            }
        }
    }

    public final boolean isHealthy(boolean z) {
        long j;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        long nanoTime = System.nanoTime();
        Socket socket = this.rawSocket;
        C6562gT0.m(socket);
        Socket socket2 = this.socket;
        C6562gT0.m(socket2);
        InterfaceC2677Cq interfaceC2677Cq = this.source;
        C6562gT0.m(interfaceC2677Cq);
        if (!socket.isClosed() && !socket2.isClosed() && !socket2.isInputShutdown() && !socket2.isOutputShutdown()) {
            Http2Connection http2Connection = this.http2Connection;
            if (http2Connection != null) {
                return http2Connection.isHealthy(nanoTime);
            }
            synchronized (this) {
                j = nanoTime - this.idleAtNs;
            }
            if (j >= IDLE_CONNECTION_HEALTHY_NS && z) {
                return Util.isHealthy(socket2, interfaceC2677Cq);
            }
            return true;
        }
        return false;
    }

    public final boolean isMultiplexed$okhttp() {
        if (this.http2Connection != null) {
            return true;
        }
        return false;
    }

    @NotNull
    public final ExchangeCodec newCodec$okhttp(@NotNull OkHttpClient okHttpClient, @NotNull RealInterceptorChain realInterceptorChain) throws SocketException {
        C6562gT0.p(okHttpClient, "client");
        C6562gT0.p(realInterceptorChain, "chain");
        Socket socket = this.socket;
        C6562gT0.m(socket);
        InterfaceC2677Cq interfaceC2677Cq = this.source;
        C6562gT0.m(interfaceC2677Cq);
        InterfaceC2579Bq interfaceC2579Bq = this.sink;
        C6562gT0.m(interfaceC2579Bq);
        Http2Connection http2Connection = this.http2Connection;
        if (http2Connection != null) {
            return new Http2ExchangeCodec(okHttpClient, this, realInterceptorChain, http2Connection);
        }
        socket.setSoTimeout(realInterceptorChain.readTimeoutMillis());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        interfaceC2677Cq.timeout().timeout(realInterceptorChain.getReadTimeoutMillis$okhttp(), timeUnit);
        interfaceC2579Bq.timeout().timeout(realInterceptorChain.getWriteTimeoutMillis$okhttp(), timeUnit);
        return new Http1ExchangeCodec(okHttpClient, this, interfaceC2677Cq, interfaceC2579Bq);
    }

    @NotNull
    public final RealWebSocket.Streams newWebSocketStreams$okhttp(@NotNull final Exchange exchange) throws SocketException {
        C6562gT0.p(exchange, "exchange");
        Socket socket = this.socket;
        C6562gT0.m(socket);
        final InterfaceC2677Cq interfaceC2677Cq = this.source;
        C6562gT0.m(interfaceC2677Cq);
        final InterfaceC2579Bq interfaceC2579Bq = this.sink;
        C6562gT0.m(interfaceC2579Bq);
        socket.setSoTimeout(0);
        noNewExchanges$okhttp();
        return new RealWebSocket.Streams(interfaceC2677Cq, interfaceC2579Bq) { // from class: okhttp3.internal.connection.RealConnection$newWebSocketStreams$1
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                exchange.bodyComplete(-1L, true, true, null);
            }
        };
    }

    public final synchronized void noCoalescedConnections$okhttp() {
        this.noCoalescedConnections = true;
    }

    public final synchronized void noNewExchanges$okhttp() {
        this.noNewExchanges = true;
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public synchronized void onSettings(@NotNull Http2Connection http2Connection, @NotNull Settings settings) {
        C6562gT0.p(http2Connection, "connection");
        C6562gT0.p(settings, RemoteConfigComponent.f388o);
        this.allocationLimit = settings.getMaxConcurrentStreams();
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void onStream(@NotNull Http2Stream http2Stream) throws IOException {
        C6562gT0.p(http2Stream, "stream");
        http2Stream.close(ErrorCode.REFUSED_STREAM, null);
    }

    @Override // okhttp3.Connection
    @NotNull
    public Protocol protocol() {
        Protocol protocol = this.protocol;
        C6562gT0.m(protocol);
        return protocol;
    }

    @Override // okhttp3.Connection
    @NotNull
    public Route route() {
        return this.route;
    }

    public final void setIdleAtNs$okhttp(long j) {
        this.idleAtNs = j;
    }

    public final void setNoNewExchanges(boolean z) {
        this.noNewExchanges = z;
    }

    public final void setRouteFailureCount$okhttp(int i) {
        this.routeFailureCount = i;
    }

    @Override // okhttp3.Connection
    @NotNull
    public Socket socket() {
        Socket socket = this.socket;
        C6562gT0.m(socket);
        return socket;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.route.address().url().host());
        sb.append(':');
        sb.append(this.route.address().url().port());
        sb.append(", proxy=");
        sb.append(this.route.proxy());
        sb.append(" hostAddress=");
        sb.append(this.route.socketAddress());
        sb.append(" cipherSuite=");
        Handshake handshake = this.handshake;
        sb.append((handshake == null || (r1 = handshake.cipherSuite()) == null) ? "none" : "none");
        sb.append(" protocol=");
        sb.append(this.protocol);
        sb.append('}');
        return sb.toString();
    }

    public final synchronized void trackFailure$okhttp(@NotNull RealCall realCall, @Nullable IOException iOException) {
        try {
            C6562gT0.p(realCall, C3771Nr1.E0);
            if (iOException instanceof StreamResetException) {
                if (((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
                    int i = this.refusedStreamCount + 1;
                    this.refusedStreamCount = i;
                    if (i > 1) {
                        this.noNewExchanges = true;
                        this.routeFailureCount++;
                    }
                } else if (((StreamResetException) iOException).errorCode != ErrorCode.CANCEL || !realCall.isCanceled()) {
                    this.noNewExchanges = true;
                    this.routeFailureCount++;
                }
            } else if (!isMultiplexed$okhttp() || (iOException instanceof ConnectionShutdownException)) {
                this.noNewExchanges = true;
                if (this.successCount == 0) {
                    if (iOException != null) {
                        connectFailed$okhttp(realCall.getClient(), this.route, iOException);
                    }
                    this.routeFailureCount++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
