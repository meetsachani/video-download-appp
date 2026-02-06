package okhttp3;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.net.Proxy;
import java.net.ProxySelector;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import o.C10662xF;
import o.C2730De2;
import o.C6562gT0;
import o.C9444sF;
import o.C9516sY;
import o.EnumC9879u20;
import o.HA0;
import o.IR1;
import o.InterfaceC8046mW0;
import o.InterfaceC8303na2;
import o.InterfaceC9150r20;
import o.WK;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.WebSocket;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nOkHttpClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1079:1\n2624#2,3:1080\n2624#2,3:1083\n1#3:1086\n*S KotlinDebug\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient\n*L\n225#1:1080,3\n255#1:1083,3\n*E\n"})
/* loaded from: classes4.dex */
public class OkHttpClient implements Cloneable, Call.Factory, WebSocket.Factory {
    @NotNull
    private final Authenticator authenticator;
    @Nullable
    private final Cache cache;
    private final int callTimeoutMillis;
    @Nullable
    private final CertificateChainCleaner certificateChainCleaner;
    @NotNull
    private final CertificatePinner certificatePinner;
    private final int connectTimeoutMillis;
    @NotNull
    private final ConnectionPool connectionPool;
    @NotNull
    private final List<ConnectionSpec> connectionSpecs;
    @NotNull
    private final CookieJar cookieJar;
    @NotNull
    private final Dispatcher dispatcher;
    @NotNull
    private final Dns dns;
    @NotNull
    private final EventListener.Factory eventListenerFactory;
    private final boolean followRedirects;
    private final boolean followSslRedirects;
    @NotNull
    private final HostnameVerifier hostnameVerifier;
    @NotNull
    private final List<Interceptor> interceptors;
    private final long minWebSocketMessageToCompress;
    @NotNull
    private final List<Interceptor> networkInterceptors;
    private final int pingIntervalMillis;
    @NotNull
    private final List<Protocol> protocols;
    @Nullable
    private final Proxy proxy;
    @NotNull
    private final Authenticator proxyAuthenticator;
    @NotNull
    private final ProxySelector proxySelector;
    private final int readTimeoutMillis;
    private final boolean retryOnConnectionFailure;
    @NotNull
    private final RouteDatabase routeDatabase;
    @NotNull
    private final SocketFactory socketFactory;
    @Nullable
    private final SSLSocketFactory sslSocketFactoryOrNull;
    private final int writeTimeoutMillis;
    @Nullable
    private final X509TrustManager x509TrustManager;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final List<Protocol> DEFAULT_PROTOCOLS = Util.immutableListOf(Protocol.HTTP_2, Protocol.HTTP_1_1);
    @NotNull
    private static final List<ConnectionSpec> DEFAULT_CONNECTION_SPECS = Util.immutableListOf(ConnectionSpec.MODERN_TLS, ConnectionSpec.CLEARTEXT);

    @InterfaceC8303na2({"SMAP\nOkHttpClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1079:1\n1#2:1080\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Builder {
        @NotNull
        private Authenticator authenticator;
        @Nullable
        private Cache cache;
        private int callTimeout;
        @Nullable
        private CertificateChainCleaner certificateChainCleaner;
        @NotNull
        private CertificatePinner certificatePinner;
        private int connectTimeout;
        @NotNull
        private ConnectionPool connectionPool;
        @NotNull
        private List<ConnectionSpec> connectionSpecs;
        @NotNull
        private CookieJar cookieJar;
        @NotNull
        private Dispatcher dispatcher;
        @NotNull
        private Dns dns;
        @NotNull
        private EventListener.Factory eventListenerFactory;
        private boolean followRedirects;
        private boolean followSslRedirects;
        @NotNull
        private HostnameVerifier hostnameVerifier;
        @NotNull
        private final List<Interceptor> interceptors;
        private long minWebSocketMessageToCompress;
        @NotNull
        private final List<Interceptor> networkInterceptors;
        private int pingInterval;
        @NotNull
        private List<? extends Protocol> protocols;
        @Nullable
        private Proxy proxy;
        @NotNull
        private Authenticator proxyAuthenticator;
        @Nullable
        private ProxySelector proxySelector;
        private int readTimeout;
        private boolean retryOnConnectionFailure;
        @Nullable
        private RouteDatabase routeDatabase;
        @NotNull
        private SocketFactory socketFactory;
        @Nullable
        private SSLSocketFactory sslSocketFactoryOrNull;
        private int writeTimeout;
        @Nullable
        private X509TrustManager x509TrustManagerOrNull;

        public Builder() {
            this.dispatcher = new Dispatcher();
            this.connectionPool = new ConnectionPool();
            this.interceptors = new ArrayList();
            this.networkInterceptors = new ArrayList();
            this.eventListenerFactory = Util.asFactory(EventListener.NONE);
            this.retryOnConnectionFailure = true;
            Authenticator authenticator = Authenticator.NONE;
            this.authenticator = authenticator;
            this.followRedirects = true;
            this.followSslRedirects = true;
            this.cookieJar = CookieJar.NO_COOKIES;
            this.dns = Dns.SYSTEM;
            this.proxyAuthenticator = authenticator;
            SocketFactory socketFactory = SocketFactory.getDefault();
            C6562gT0.o(socketFactory, "getDefault()");
            this.socketFactory = socketFactory;
            Companion companion = OkHttpClient.Companion;
            this.connectionSpecs = companion.getDEFAULT_CONNECTION_SPECS$okhttp();
            this.protocols = companion.getDEFAULT_PROTOCOLS$okhttp();
            this.hostnameVerifier = OkHostnameVerifier.INSTANCE;
            this.certificatePinner = CertificatePinner.DEFAULT;
            this.connectTimeout = 10000;
            this.readTimeout = 10000;
            this.writeTimeout = 10000;
            this.minWebSocketMessageToCompress = 1024L;
        }

        @InterfaceC8046mW0(name = "-addInterceptor")
        @NotNull
        /* renamed from: -addInterceptor  reason: not valid java name */
        public final Builder m128addInterceptor(@NotNull final HA0<? super Interceptor.Chain, Response> ha0) {
            C6562gT0.p(ha0, "block");
            return addInterceptor(new Interceptor() { // from class: okhttp3.OkHttpClient$Builder$addInterceptor$2
                @Override // okhttp3.Interceptor
                @NotNull
                public final Response intercept(@NotNull Interceptor.Chain chain) {
                    C6562gT0.p(chain, "chain");
                    return ha0.invoke(chain);
                }
            });
        }

        @InterfaceC8046mW0(name = "-addNetworkInterceptor")
        @NotNull
        /* renamed from: -addNetworkInterceptor  reason: not valid java name */
        public final Builder m129addNetworkInterceptor(@NotNull final HA0<? super Interceptor.Chain, Response> ha0) {
            C6562gT0.p(ha0, "block");
            return addNetworkInterceptor(new Interceptor() { // from class: okhttp3.OkHttpClient$Builder$addNetworkInterceptor$2
                @Override // okhttp3.Interceptor
                @NotNull
                public final Response intercept(@NotNull Interceptor.Chain chain) {
                    C6562gT0.p(chain, "chain");
                    return ha0.invoke(chain);
                }
            });
        }

        @NotNull
        public final Builder addInterceptor(@NotNull Interceptor interceptor) {
            C6562gT0.p(interceptor, "interceptor");
            this.interceptors.add(interceptor);
            return this;
        }

        @NotNull
        public final Builder addNetworkInterceptor(@NotNull Interceptor interceptor) {
            C6562gT0.p(interceptor, "interceptor");
            this.networkInterceptors.add(interceptor);
            return this;
        }

        @NotNull
        public final Builder authenticator(@NotNull Authenticator authenticator) {
            C6562gT0.p(authenticator, "authenticator");
            this.authenticator = authenticator;
            return this;
        }

        @NotNull
        public final OkHttpClient build() {
            return new OkHttpClient(this);
        }

        @NotNull
        public final Builder cache(@Nullable Cache cache) {
            this.cache = cache;
            return this;
        }

        @NotNull
        public final Builder callTimeout(long j, @NotNull TimeUnit timeUnit) {
            C6562gT0.p(timeUnit, "unit");
            this.callTimeout = Util.checkDuration("timeout", j, timeUnit);
            return this;
        }

        @NotNull
        public final Builder certificatePinner(@NotNull CertificatePinner certificatePinner) {
            C6562gT0.p(certificatePinner, "certificatePinner");
            if (!C6562gT0.g(certificatePinner, this.certificatePinner)) {
                this.routeDatabase = null;
            }
            this.certificatePinner = certificatePinner;
            return this;
        }

        @NotNull
        public final Builder connectTimeout(long j, @NotNull TimeUnit timeUnit) {
            C6562gT0.p(timeUnit, "unit");
            this.connectTimeout = Util.checkDuration("timeout", j, timeUnit);
            return this;
        }

        @NotNull
        public final Builder connectionPool(@NotNull ConnectionPool connectionPool) {
            C6562gT0.p(connectionPool, "connectionPool");
            this.connectionPool = connectionPool;
            return this;
        }

        @NotNull
        public final Builder connectionSpecs(@NotNull List<ConnectionSpec> list) {
            C6562gT0.p(list, "connectionSpecs");
            if (!C6562gT0.g(list, this.connectionSpecs)) {
                this.routeDatabase = null;
            }
            this.connectionSpecs = Util.toImmutableList(list);
            return this;
        }

        @NotNull
        public final Builder cookieJar(@NotNull CookieJar cookieJar) {
            C6562gT0.p(cookieJar, "cookieJar");
            this.cookieJar = cookieJar;
            return this;
        }

        @NotNull
        public final Builder dispatcher(@NotNull Dispatcher dispatcher) {
            C6562gT0.p(dispatcher, "dispatcher");
            this.dispatcher = dispatcher;
            return this;
        }

        @NotNull
        public final Builder dns(@NotNull Dns dns) {
            C6562gT0.p(dns, C2730De2.k);
            if (!C6562gT0.g(dns, this.dns)) {
                this.routeDatabase = null;
            }
            this.dns = dns;
            return this;
        }

        @NotNull
        public final Builder eventListener(@NotNull EventListener eventListener) {
            C6562gT0.p(eventListener, "eventListener");
            this.eventListenerFactory = Util.asFactory(eventListener);
            return this;
        }

        @NotNull
        public final Builder eventListenerFactory(@NotNull EventListener.Factory factory) {
            C6562gT0.p(factory, "eventListenerFactory");
            this.eventListenerFactory = factory;
            return this;
        }

        @NotNull
        public final Builder followRedirects(boolean z) {
            this.followRedirects = z;
            return this;
        }

        @NotNull
        public final Builder followSslRedirects(boolean z) {
            this.followSslRedirects = z;
            return this;
        }

        @NotNull
        public final Authenticator getAuthenticator$okhttp() {
            return this.authenticator;
        }

        @Nullable
        public final Cache getCache$okhttp() {
            return this.cache;
        }

        public final int getCallTimeout$okhttp() {
            return this.callTimeout;
        }

        @Nullable
        public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
            return this.certificateChainCleaner;
        }

        @NotNull
        public final CertificatePinner getCertificatePinner$okhttp() {
            return this.certificatePinner;
        }

        public final int getConnectTimeout$okhttp() {
            return this.connectTimeout;
        }

        @NotNull
        public final ConnectionPool getConnectionPool$okhttp() {
            return this.connectionPool;
        }

        @NotNull
        public final List<ConnectionSpec> getConnectionSpecs$okhttp() {
            return this.connectionSpecs;
        }

        @NotNull
        public final CookieJar getCookieJar$okhttp() {
            return this.cookieJar;
        }

        @NotNull
        public final Dispatcher getDispatcher$okhttp() {
            return this.dispatcher;
        }

        @NotNull
        public final Dns getDns$okhttp() {
            return this.dns;
        }

        @NotNull
        public final EventListener.Factory getEventListenerFactory$okhttp() {
            return this.eventListenerFactory;
        }

        public final boolean getFollowRedirects$okhttp() {
            return this.followRedirects;
        }

        public final boolean getFollowSslRedirects$okhttp() {
            return this.followSslRedirects;
        }

        @NotNull
        public final HostnameVerifier getHostnameVerifier$okhttp() {
            return this.hostnameVerifier;
        }

        @NotNull
        public final List<Interceptor> getInterceptors$okhttp() {
            return this.interceptors;
        }

        public final long getMinWebSocketMessageToCompress$okhttp() {
            return this.minWebSocketMessageToCompress;
        }

        @NotNull
        public final List<Interceptor> getNetworkInterceptors$okhttp() {
            return this.networkInterceptors;
        }

        public final int getPingInterval$okhttp() {
            return this.pingInterval;
        }

        @NotNull
        public final List<Protocol> getProtocols$okhttp() {
            return this.protocols;
        }

        @Nullable
        public final Proxy getProxy$okhttp() {
            return this.proxy;
        }

        @NotNull
        public final Authenticator getProxyAuthenticator$okhttp() {
            return this.proxyAuthenticator;
        }

        @Nullable
        public final ProxySelector getProxySelector$okhttp() {
            return this.proxySelector;
        }

        public final int getReadTimeout$okhttp() {
            return this.readTimeout;
        }

        public final boolean getRetryOnConnectionFailure$okhttp() {
            return this.retryOnConnectionFailure;
        }

        @Nullable
        public final RouteDatabase getRouteDatabase$okhttp() {
            return this.routeDatabase;
        }

        @NotNull
        public final SocketFactory getSocketFactory$okhttp() {
            return this.socketFactory;
        }

        @Nullable
        public final SSLSocketFactory getSslSocketFactoryOrNull$okhttp() {
            return this.sslSocketFactoryOrNull;
        }

        public final int getWriteTimeout$okhttp() {
            return this.writeTimeout;
        }

        @Nullable
        public final X509TrustManager getX509TrustManagerOrNull$okhttp() {
            return this.x509TrustManagerOrNull;
        }

        @NotNull
        public final Builder hostnameVerifier(@NotNull HostnameVerifier hostnameVerifier) {
            C6562gT0.p(hostnameVerifier, "hostnameVerifier");
            if (!C6562gT0.g(hostnameVerifier, this.hostnameVerifier)) {
                this.routeDatabase = null;
            }
            this.hostnameVerifier = hostnameVerifier;
            return this;
        }

        @NotNull
        public final List<Interceptor> interceptors() {
            return this.interceptors;
        }

        @NotNull
        public final Builder minWebSocketMessageToCompress(long j) {
            if (j >= 0) {
                this.minWebSocketMessageToCompress = j;
                return this;
            }
            throw new IllegalArgumentException(("minWebSocketMessageToCompress must be positive: " + j).toString());
        }

        @NotNull
        public final List<Interceptor> networkInterceptors() {
            return this.networkInterceptors;
        }

        @NotNull
        public final Builder pingInterval(long j, @NotNull TimeUnit timeUnit) {
            C6562gT0.p(timeUnit, "unit");
            this.pingInterval = Util.checkDuration("interval", j, timeUnit);
            return this;
        }

        @NotNull
        public final Builder protocols(@NotNull List<? extends Protocol> list) {
            C6562gT0.p(list, "protocols");
            List b6 = C10662xF.b6(list);
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!b6.contains(protocol) && !b6.contains(Protocol.HTTP_1_1)) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + b6).toString());
            } else if (b6.contains(protocol) && b6.size() > 1) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + b6).toString());
            } else if (!b6.contains(Protocol.HTTP_1_0)) {
                C6562gT0.n(b6, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Protocol?>");
                if (!b6.contains(null)) {
                    b6.remove(Protocol.SPDY_3);
                    if (!C6562gT0.g(b6, this.protocols)) {
                        this.routeDatabase = null;
                    }
                    List<? extends Protocol> unmodifiableList = Collections.unmodifiableList(b6);
                    C6562gT0.o(unmodifiableList, "unmodifiableList(protocolsCopy)");
                    this.protocols = unmodifiableList;
                    return this;
                }
                throw new IllegalArgumentException("protocols must not contain null");
            } else {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + b6).toString());
            }
        }

        @NotNull
        public final Builder proxy(@Nullable Proxy proxy) {
            if (!C6562gT0.g(proxy, this.proxy)) {
                this.routeDatabase = null;
            }
            this.proxy = proxy;
            return this;
        }

        @NotNull
        public final Builder proxyAuthenticator(@NotNull Authenticator authenticator) {
            C6562gT0.p(authenticator, "proxyAuthenticator");
            if (!C6562gT0.g(authenticator, this.proxyAuthenticator)) {
                this.routeDatabase = null;
            }
            this.proxyAuthenticator = authenticator;
            return this;
        }

        @NotNull
        public final Builder proxySelector(@NotNull ProxySelector proxySelector) {
            C6562gT0.p(proxySelector, "proxySelector");
            if (!C6562gT0.g(proxySelector, this.proxySelector)) {
                this.routeDatabase = null;
            }
            this.proxySelector = proxySelector;
            return this;
        }

        @NotNull
        public final Builder readTimeout(long j, @NotNull TimeUnit timeUnit) {
            C6562gT0.p(timeUnit, "unit");
            this.readTimeout = Util.checkDuration("timeout", j, timeUnit);
            return this;
        }

        @NotNull
        public final Builder retryOnConnectionFailure(boolean z) {
            this.retryOnConnectionFailure = z;
            return this;
        }

        public final void setAuthenticator$okhttp(@NotNull Authenticator authenticator) {
            C6562gT0.p(authenticator, "<set-?>");
            this.authenticator = authenticator;
        }

        public final void setCache$okhttp(@Nullable Cache cache) {
            this.cache = cache;
        }

        public final void setCallTimeout$okhttp(int i) {
            this.callTimeout = i;
        }

        public final void setCertificateChainCleaner$okhttp(@Nullable CertificateChainCleaner certificateChainCleaner) {
            this.certificateChainCleaner = certificateChainCleaner;
        }

        public final void setCertificatePinner$okhttp(@NotNull CertificatePinner certificatePinner) {
            C6562gT0.p(certificatePinner, "<set-?>");
            this.certificatePinner = certificatePinner;
        }

        public final void setConnectTimeout$okhttp(int i) {
            this.connectTimeout = i;
        }

        public final void setConnectionPool$okhttp(@NotNull ConnectionPool connectionPool) {
            C6562gT0.p(connectionPool, "<set-?>");
            this.connectionPool = connectionPool;
        }

        public final void setConnectionSpecs$okhttp(@NotNull List<ConnectionSpec> list) {
            C6562gT0.p(list, "<set-?>");
            this.connectionSpecs = list;
        }

        public final void setCookieJar$okhttp(@NotNull CookieJar cookieJar) {
            C6562gT0.p(cookieJar, "<set-?>");
            this.cookieJar = cookieJar;
        }

        public final void setDispatcher$okhttp(@NotNull Dispatcher dispatcher) {
            C6562gT0.p(dispatcher, "<set-?>");
            this.dispatcher = dispatcher;
        }

        public final void setDns$okhttp(@NotNull Dns dns) {
            C6562gT0.p(dns, "<set-?>");
            this.dns = dns;
        }

        public final void setEventListenerFactory$okhttp(@NotNull EventListener.Factory factory) {
            C6562gT0.p(factory, "<set-?>");
            this.eventListenerFactory = factory;
        }

        public final void setFollowRedirects$okhttp(boolean z) {
            this.followRedirects = z;
        }

        public final void setFollowSslRedirects$okhttp(boolean z) {
            this.followSslRedirects = z;
        }

        public final void setHostnameVerifier$okhttp(@NotNull HostnameVerifier hostnameVerifier) {
            C6562gT0.p(hostnameVerifier, "<set-?>");
            this.hostnameVerifier = hostnameVerifier;
        }

        public final void setMinWebSocketMessageToCompress$okhttp(long j) {
            this.minWebSocketMessageToCompress = j;
        }

        public final void setPingInterval$okhttp(int i) {
            this.pingInterval = i;
        }

        public final void setProtocols$okhttp(@NotNull List<? extends Protocol> list) {
            C6562gT0.p(list, "<set-?>");
            this.protocols = list;
        }

        public final void setProxy$okhttp(@Nullable Proxy proxy) {
            this.proxy = proxy;
        }

        public final void setProxyAuthenticator$okhttp(@NotNull Authenticator authenticator) {
            C6562gT0.p(authenticator, "<set-?>");
            this.proxyAuthenticator = authenticator;
        }

        public final void setProxySelector$okhttp(@Nullable ProxySelector proxySelector) {
            this.proxySelector = proxySelector;
        }

        public final void setReadTimeout$okhttp(int i) {
            this.readTimeout = i;
        }

        public final void setRetryOnConnectionFailure$okhttp(boolean z) {
            this.retryOnConnectionFailure = z;
        }

        public final void setRouteDatabase$okhttp(@Nullable RouteDatabase routeDatabase) {
            this.routeDatabase = routeDatabase;
        }

        public final void setSocketFactory$okhttp(@NotNull SocketFactory socketFactory) {
            C6562gT0.p(socketFactory, "<set-?>");
            this.socketFactory = socketFactory;
        }

        public final void setSslSocketFactoryOrNull$okhttp(@Nullable SSLSocketFactory sSLSocketFactory) {
            this.sslSocketFactoryOrNull = sSLSocketFactory;
        }

        public final void setWriteTimeout$okhttp(int i) {
            this.writeTimeout = i;
        }

        public final void setX509TrustManagerOrNull$okhttp(@Nullable X509TrustManager x509TrustManager) {
            this.x509TrustManagerOrNull = x509TrustManager;
        }

        @NotNull
        public final Builder socketFactory(@NotNull SocketFactory socketFactory) {
            C6562gT0.p(socketFactory, "socketFactory");
            if (!(socketFactory instanceof SSLSocketFactory)) {
                if (!C6562gT0.g(socketFactory, this.socketFactory)) {
                    this.routeDatabase = null;
                }
                this.socketFactory = socketFactory;
                return this;
            }
            throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory");
        }

        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Use the sslSocketFactory overload that accepts a X509TrustManager.")
        @NotNull
        public final Builder sslSocketFactory(@NotNull SSLSocketFactory sSLSocketFactory) {
            C6562gT0.p(sSLSocketFactory, "sslSocketFactory");
            if (!C6562gT0.g(sSLSocketFactory, this.sslSocketFactoryOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sSLSocketFactory;
            Platform.Companion companion = Platform.Companion;
            X509TrustManager trustManager = companion.get().trustManager(sSLSocketFactory);
            if (trustManager != null) {
                this.x509TrustManagerOrNull = trustManager;
                Platform platform = companion.get();
                X509TrustManager x509TrustManager = this.x509TrustManagerOrNull;
                C6562gT0.m(x509TrustManager);
                this.certificateChainCleaner = platform.buildCertificateChainCleaner(x509TrustManager);
                return this;
            }
            throw new IllegalStateException("Unable to extract the trust manager on " + companion.get() + ", sslSocketFactory is " + sSLSocketFactory.getClass());
        }

        @NotNull
        public final Builder writeTimeout(long j, @NotNull TimeUnit timeUnit) {
            C6562gT0.p(timeUnit, "unit");
            this.writeTimeout = Util.checkDuration("timeout", j, timeUnit);
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder callTimeout(@NotNull Duration duration) {
            C6562gT0.p(duration, "duration");
            callTimeout(WK.a(duration), TimeUnit.MILLISECONDS);
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder connectTimeout(@NotNull Duration duration) {
            C6562gT0.p(duration, "duration");
            connectTimeout(WK.a(duration), TimeUnit.MILLISECONDS);
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder pingInterval(@NotNull Duration duration) {
            C6562gT0.p(duration, "duration");
            pingInterval(WK.a(duration), TimeUnit.MILLISECONDS);
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder readTimeout(@NotNull Duration duration) {
            C6562gT0.p(duration, "duration");
            readTimeout(WK.a(duration), TimeUnit.MILLISECONDS);
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder writeTimeout(@NotNull Duration duration) {
            C6562gT0.p(duration, "duration");
            writeTimeout(WK.a(duration), TimeUnit.MILLISECONDS);
            return this;
        }

        @NotNull
        public final Builder sslSocketFactory(@NotNull SSLSocketFactory sSLSocketFactory, @NotNull X509TrustManager x509TrustManager) {
            C6562gT0.p(sSLSocketFactory, "sslSocketFactory");
            C6562gT0.p(x509TrustManager, "trustManager");
            if (!C6562gT0.g(sSLSocketFactory, this.sslSocketFactoryOrNull) || !C6562gT0.g(x509TrustManager, this.x509TrustManagerOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sSLSocketFactory;
            this.certificateChainCleaner = CertificateChainCleaner.Companion.get(x509TrustManager);
            this.x509TrustManagerOrNull = x509TrustManager;
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull OkHttpClient okHttpClient) {
            this();
            C6562gT0.p(okHttpClient, "okHttpClient");
            this.dispatcher = okHttpClient.dispatcher();
            this.connectionPool = okHttpClient.connectionPool();
            C9444sF.q0(this.interceptors, okHttpClient.interceptors());
            C9444sF.q0(this.networkInterceptors, okHttpClient.networkInterceptors());
            this.eventListenerFactory = okHttpClient.eventListenerFactory();
            this.retryOnConnectionFailure = okHttpClient.retryOnConnectionFailure();
            this.authenticator = okHttpClient.authenticator();
            this.followRedirects = okHttpClient.followRedirects();
            this.followSslRedirects = okHttpClient.followSslRedirects();
            this.cookieJar = okHttpClient.cookieJar();
            this.cache = okHttpClient.cache();
            this.dns = okHttpClient.dns();
            this.proxy = okHttpClient.proxy();
            this.proxySelector = okHttpClient.proxySelector();
            this.proxyAuthenticator = okHttpClient.proxyAuthenticator();
            this.socketFactory = okHttpClient.socketFactory();
            this.sslSocketFactoryOrNull = okHttpClient.sslSocketFactoryOrNull;
            this.x509TrustManagerOrNull = okHttpClient.x509TrustManager();
            this.connectionSpecs = okHttpClient.connectionSpecs();
            this.protocols = okHttpClient.protocols();
            this.hostnameVerifier = okHttpClient.hostnameVerifier();
            this.certificatePinner = okHttpClient.certificatePinner();
            this.certificateChainCleaner = okHttpClient.certificateChainCleaner();
            this.callTimeout = okHttpClient.callTimeoutMillis();
            this.connectTimeout = okHttpClient.connectTimeoutMillis();
            this.readTimeout = okHttpClient.readTimeoutMillis();
            this.writeTimeout = okHttpClient.writeTimeoutMillis();
            this.pingInterval = okHttpClient.pingIntervalMillis();
            this.minWebSocketMessageToCompress = okHttpClient.minWebSocketMessageToCompress();
            this.routeDatabase = okHttpClient.getRouteDatabase();
        }
    }

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        @NotNull
        public final List<ConnectionSpec> getDEFAULT_CONNECTION_SPECS$okhttp() {
            return OkHttpClient.DEFAULT_CONNECTION_SPECS;
        }

        @NotNull
        public final List<Protocol> getDEFAULT_PROTOCOLS$okhttp() {
            return OkHttpClient.DEFAULT_PROTOCOLS;
        }

        private Companion() {
        }
    }

    public OkHttpClient(@NotNull Builder builder) {
        ProxySelector proxySelector$okhttp;
        C6562gT0.p(builder, "builder");
        this.dispatcher = builder.getDispatcher$okhttp();
        this.connectionPool = builder.getConnectionPool$okhttp();
        this.interceptors = Util.toImmutableList(builder.getInterceptors$okhttp());
        this.networkInterceptors = Util.toImmutableList(builder.getNetworkInterceptors$okhttp());
        this.eventListenerFactory = builder.getEventListenerFactory$okhttp();
        this.retryOnConnectionFailure = builder.getRetryOnConnectionFailure$okhttp();
        this.authenticator = builder.getAuthenticator$okhttp();
        this.followRedirects = builder.getFollowRedirects$okhttp();
        this.followSslRedirects = builder.getFollowSslRedirects$okhttp();
        this.cookieJar = builder.getCookieJar$okhttp();
        this.cache = builder.getCache$okhttp();
        this.dns = builder.getDns$okhttp();
        this.proxy = builder.getProxy$okhttp();
        if (builder.getProxy$okhttp() != null) {
            proxySelector$okhttp = NullProxySelector.INSTANCE;
        } else {
            proxySelector$okhttp = builder.getProxySelector$okhttp();
            proxySelector$okhttp = proxySelector$okhttp == null ? ProxySelector.getDefault() : proxySelector$okhttp;
            if (proxySelector$okhttp == null) {
                proxySelector$okhttp = NullProxySelector.INSTANCE;
            }
        }
        this.proxySelector = proxySelector$okhttp;
        this.proxyAuthenticator = builder.getProxyAuthenticator$okhttp();
        this.socketFactory = builder.getSocketFactory$okhttp();
        List<ConnectionSpec> connectionSpecs$okhttp = builder.getConnectionSpecs$okhttp();
        this.connectionSpecs = connectionSpecs$okhttp;
        this.protocols = builder.getProtocols$okhttp();
        this.hostnameVerifier = builder.getHostnameVerifier$okhttp();
        this.callTimeoutMillis = builder.getCallTimeout$okhttp();
        this.connectTimeoutMillis = builder.getConnectTimeout$okhttp();
        this.readTimeoutMillis = builder.getReadTimeout$okhttp();
        this.writeTimeoutMillis = builder.getWriteTimeout$okhttp();
        this.pingIntervalMillis = builder.getPingInterval$okhttp();
        this.minWebSocketMessageToCompress = builder.getMinWebSocketMessageToCompress$okhttp();
        RouteDatabase routeDatabase$okhttp = builder.getRouteDatabase$okhttp();
        this.routeDatabase = routeDatabase$okhttp == null ? new RouteDatabase() : routeDatabase$okhttp;
        List<ConnectionSpec> list = connectionSpecs$okhttp;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (ConnectionSpec connectionSpec : list) {
                if (connectionSpec.isTls()) {
                    if (builder.getSslSocketFactoryOrNull$okhttp() != null) {
                        this.sslSocketFactoryOrNull = builder.getSslSocketFactoryOrNull$okhttp();
                        CertificateChainCleaner certificateChainCleaner$okhttp = builder.getCertificateChainCleaner$okhttp();
                        C6562gT0.m(certificateChainCleaner$okhttp);
                        this.certificateChainCleaner = certificateChainCleaner$okhttp;
                        X509TrustManager x509TrustManagerOrNull$okhttp = builder.getX509TrustManagerOrNull$okhttp();
                        C6562gT0.m(x509TrustManagerOrNull$okhttp);
                        this.x509TrustManager = x509TrustManagerOrNull$okhttp;
                        CertificatePinner certificatePinner$okhttp = builder.getCertificatePinner$okhttp();
                        C6562gT0.m(certificateChainCleaner$okhttp);
                        this.certificatePinner = certificatePinner$okhttp.withCertificateChainCleaner$okhttp(certificateChainCleaner$okhttp);
                    } else {
                        Platform.Companion companion = Platform.Companion;
                        X509TrustManager platformTrustManager = companion.get().platformTrustManager();
                        this.x509TrustManager = platformTrustManager;
                        Platform platform = companion.get();
                        C6562gT0.m(platformTrustManager);
                        this.sslSocketFactoryOrNull = platform.newSslSocketFactory(platformTrustManager);
                        CertificateChainCleaner.Companion companion2 = CertificateChainCleaner.Companion;
                        C6562gT0.m(platformTrustManager);
                        CertificateChainCleaner certificateChainCleaner = companion2.get(platformTrustManager);
                        this.certificateChainCleaner = certificateChainCleaner;
                        CertificatePinner certificatePinner$okhttp2 = builder.getCertificatePinner$okhttp();
                        C6562gT0.m(certificateChainCleaner);
                        this.certificatePinner = certificatePinner$okhttp2.withCertificateChainCleaner$okhttp(certificateChainCleaner);
                    }
                    verifyClientState();
                }
            }
        }
        this.sslSocketFactoryOrNull = null;
        this.certificateChainCleaner = null;
        this.x509TrustManager = null;
        this.certificatePinner = CertificatePinner.DEFAULT;
        verifyClientState();
    }

    private final void verifyClientState() {
        List<Interceptor> list = this.interceptors;
        C6562gT0.n(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
            List<Interceptor> list2 = this.networkInterceptors;
            C6562gT0.n(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
            if (!list2.contains(null)) {
                List<ConnectionSpec> list3 = this.connectionSpecs;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    for (ConnectionSpec connectionSpec : list3) {
                        if (connectionSpec.isTls()) {
                            if (this.sslSocketFactoryOrNull != null) {
                                if (this.certificateChainCleaner != null) {
                                    if (this.x509TrustManager == null) {
                                        throw new IllegalStateException("x509TrustManager == null");
                                    }
                                    return;
                                }
                                throw new IllegalStateException("certificateChainCleaner == null");
                            }
                            throw new IllegalStateException("sslSocketFactory == null");
                        }
                    }
                }
                if (this.sslSocketFactoryOrNull == null) {
                    if (this.certificateChainCleaner == null) {
                        if (this.x509TrustManager == null) {
                            if (C6562gT0.g(this.certificatePinner, CertificatePinner.DEFAULT)) {
                                return;
                            }
                            throw new IllegalStateException("Check failed.");
                        }
                        throw new IllegalStateException("Check failed.");
                    }
                    throw new IllegalStateException("Check failed.");
                }
                throw new IllegalStateException("Check failed.");
            }
            throw new IllegalStateException(("Null network interceptor: " + this.networkInterceptors).toString());
        }
        throw new IllegalStateException(("Null interceptor: " + this.interceptors).toString());
    }

    @InterfaceC8046mW0(name = "-deprecated_authenticator")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "authenticator", imports = {}))
    @NotNull
    /* renamed from: -deprecated_authenticator  reason: not valid java name */
    public final Authenticator m102deprecated_authenticator() {
        return this.authenticator;
    }

    @InterfaceC8046mW0(name = "-deprecated_cache")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "cache", imports = {}))
    @Nullable
    /* renamed from: -deprecated_cache  reason: not valid java name */
    public final Cache m103deprecated_cache() {
        return this.cache;
    }

    @InterfaceC8046mW0(name = "-deprecated_callTimeoutMillis")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "callTimeoutMillis", imports = {}))
    /* renamed from: -deprecated_callTimeoutMillis  reason: not valid java name */
    public final int m104deprecated_callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    @InterfaceC8046mW0(name = "-deprecated_certificatePinner")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "certificatePinner", imports = {}))
    @NotNull
    /* renamed from: -deprecated_certificatePinner  reason: not valid java name */
    public final CertificatePinner m105deprecated_certificatePinner() {
        return this.certificatePinner;
    }

    @InterfaceC8046mW0(name = "-deprecated_connectTimeoutMillis")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "connectTimeoutMillis", imports = {}))
    /* renamed from: -deprecated_connectTimeoutMillis  reason: not valid java name */
    public final int m106deprecated_connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @InterfaceC8046mW0(name = "-deprecated_connectionPool")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "connectionPool", imports = {}))
    @NotNull
    /* renamed from: -deprecated_connectionPool  reason: not valid java name */
    public final ConnectionPool m107deprecated_connectionPool() {
        return this.connectionPool;
    }

    @InterfaceC8046mW0(name = "-deprecated_connectionSpecs")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "connectionSpecs", imports = {}))
    @NotNull
    /* renamed from: -deprecated_connectionSpecs  reason: not valid java name */
    public final List<ConnectionSpec> m108deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    @InterfaceC8046mW0(name = "-deprecated_cookieJar")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "cookieJar", imports = {}))
    @NotNull
    /* renamed from: -deprecated_cookieJar  reason: not valid java name */
    public final CookieJar m109deprecated_cookieJar() {
        return this.cookieJar;
    }

    @InterfaceC8046mW0(name = "-deprecated_dispatcher")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "dispatcher", imports = {}))
    @NotNull
    /* renamed from: -deprecated_dispatcher  reason: not valid java name */
    public final Dispatcher m110deprecated_dispatcher() {
        return this.dispatcher;
    }

    @InterfaceC8046mW0(name = "-deprecated_dns")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = C2730De2.k, imports = {}))
    @NotNull
    /* renamed from: -deprecated_dns  reason: not valid java name */
    public final Dns m111deprecated_dns() {
        return this.dns;
    }

    @InterfaceC8046mW0(name = "-deprecated_eventListenerFactory")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "eventListenerFactory", imports = {}))
    @NotNull
    /* renamed from: -deprecated_eventListenerFactory  reason: not valid java name */
    public final EventListener.Factory m112deprecated_eventListenerFactory() {
        return this.eventListenerFactory;
    }

    @InterfaceC8046mW0(name = "-deprecated_followRedirects")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "followRedirects", imports = {}))
    /* renamed from: -deprecated_followRedirects  reason: not valid java name */
    public final boolean m113deprecated_followRedirects() {
        return this.followRedirects;
    }

    @InterfaceC8046mW0(name = "-deprecated_followSslRedirects")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "followSslRedirects", imports = {}))
    /* renamed from: -deprecated_followSslRedirects  reason: not valid java name */
    public final boolean m114deprecated_followSslRedirects() {
        return this.followSslRedirects;
    }

    @InterfaceC8046mW0(name = "-deprecated_hostnameVerifier")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "hostnameVerifier", imports = {}))
    @NotNull
    /* renamed from: -deprecated_hostnameVerifier  reason: not valid java name */
    public final HostnameVerifier m115deprecated_hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @InterfaceC8046mW0(name = "-deprecated_interceptors")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "interceptors", imports = {}))
    @NotNull
    /* renamed from: -deprecated_interceptors  reason: not valid java name */
    public final List<Interceptor> m116deprecated_interceptors() {
        return this.interceptors;
    }

    @InterfaceC8046mW0(name = "-deprecated_networkInterceptors")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "networkInterceptors", imports = {}))
    @NotNull
    /* renamed from: -deprecated_networkInterceptors  reason: not valid java name */
    public final List<Interceptor> m117deprecated_networkInterceptors() {
        return this.networkInterceptors;
    }

    @InterfaceC8046mW0(name = "-deprecated_pingIntervalMillis")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "pingIntervalMillis", imports = {}))
    /* renamed from: -deprecated_pingIntervalMillis  reason: not valid java name */
    public final int m118deprecated_pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    @InterfaceC8046mW0(name = "-deprecated_protocols")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "protocols", imports = {}))
    @NotNull
    /* renamed from: -deprecated_protocols  reason: not valid java name */
    public final List<Protocol> m119deprecated_protocols() {
        return this.protocols;
    }

    @InterfaceC8046mW0(name = "-deprecated_proxy")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "proxy", imports = {}))
    @Nullable
    /* renamed from: -deprecated_proxy  reason: not valid java name */
    public final Proxy m120deprecated_proxy() {
        return this.proxy;
    }

    @InterfaceC8046mW0(name = "-deprecated_proxyAuthenticator")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "proxyAuthenticator", imports = {}))
    @NotNull
    /* renamed from: -deprecated_proxyAuthenticator  reason: not valid java name */
    public final Authenticator m121deprecated_proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @InterfaceC8046mW0(name = "-deprecated_proxySelector")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "proxySelector", imports = {}))
    @NotNull
    /* renamed from: -deprecated_proxySelector  reason: not valid java name */
    public final ProxySelector m122deprecated_proxySelector() {
        return this.proxySelector;
    }

    @InterfaceC8046mW0(name = "-deprecated_readTimeoutMillis")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "readTimeoutMillis", imports = {}))
    /* renamed from: -deprecated_readTimeoutMillis  reason: not valid java name */
    public final int m123deprecated_readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @InterfaceC8046mW0(name = "-deprecated_retryOnConnectionFailure")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "retryOnConnectionFailure", imports = {}))
    /* renamed from: -deprecated_retryOnConnectionFailure  reason: not valid java name */
    public final boolean m124deprecated_retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    @InterfaceC8046mW0(name = "-deprecated_socketFactory")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "socketFactory", imports = {}))
    @NotNull
    /* renamed from: -deprecated_socketFactory  reason: not valid java name */
    public final SocketFactory m125deprecated_socketFactory() {
        return this.socketFactory;
    }

    @InterfaceC8046mW0(name = "-deprecated_sslSocketFactory")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "sslSocketFactory", imports = {}))
    @NotNull
    /* renamed from: -deprecated_sslSocketFactory  reason: not valid java name */
    public final SSLSocketFactory m126deprecated_sslSocketFactory() {
        return sslSocketFactory();
    }

    @InterfaceC8046mW0(name = "-deprecated_writeTimeoutMillis")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "writeTimeoutMillis", imports = {}))
    /* renamed from: -deprecated_writeTimeoutMillis  reason: not valid java name */
    public final int m127deprecated_writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    @InterfaceC8046mW0(name = "authenticator")
    @NotNull
    public final Authenticator authenticator() {
        return this.authenticator;
    }

    @InterfaceC8046mW0(name = "cache")
    @Nullable
    public final Cache cache() {
        return this.cache;
    }

    @InterfaceC8046mW0(name = "callTimeoutMillis")
    public final int callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    @InterfaceC8046mW0(name = "certificateChainCleaner")
    @Nullable
    public final CertificateChainCleaner certificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    @InterfaceC8046mW0(name = "certificatePinner")
    @NotNull
    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    @NotNull
    public Object clone() {
        return super.clone();
    }

    @InterfaceC8046mW0(name = "connectTimeoutMillis")
    public final int connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @InterfaceC8046mW0(name = "connectionPool")
    @NotNull
    public final ConnectionPool connectionPool() {
        return this.connectionPool;
    }

    @InterfaceC8046mW0(name = "connectionSpecs")
    @NotNull
    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    @InterfaceC8046mW0(name = "cookieJar")
    @NotNull
    public final CookieJar cookieJar() {
        return this.cookieJar;
    }

    @InterfaceC8046mW0(name = "dispatcher")
    @NotNull
    public final Dispatcher dispatcher() {
        return this.dispatcher;
    }

    @InterfaceC8046mW0(name = C2730De2.k)
    @NotNull
    public final Dns dns() {
        return this.dns;
    }

    @InterfaceC8046mW0(name = "eventListenerFactory")
    @NotNull
    public final EventListener.Factory eventListenerFactory() {
        return this.eventListenerFactory;
    }

    @InterfaceC8046mW0(name = "followRedirects")
    public final boolean followRedirects() {
        return this.followRedirects;
    }

    @InterfaceC8046mW0(name = "followSslRedirects")
    public final boolean followSslRedirects() {
        return this.followSslRedirects;
    }

    @NotNull
    public final RouteDatabase getRouteDatabase() {
        return this.routeDatabase;
    }

    @InterfaceC8046mW0(name = "hostnameVerifier")
    @NotNull
    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @InterfaceC8046mW0(name = "interceptors")
    @NotNull
    public final List<Interceptor> interceptors() {
        return this.interceptors;
    }

    @InterfaceC8046mW0(name = "minWebSocketMessageToCompress")
    public final long minWebSocketMessageToCompress() {
        return this.minWebSocketMessageToCompress;
    }

    @InterfaceC8046mW0(name = "networkInterceptors")
    @NotNull
    public final List<Interceptor> networkInterceptors() {
        return this.networkInterceptors;
    }

    @NotNull
    public Builder newBuilder() {
        return new Builder(this);
    }

    @Override // okhttp3.Call.Factory
    @NotNull
    public Call newCall(@NotNull Request request) {
        C6562gT0.p(request, "request");
        return new RealCall(this, request, false);
    }

    @Override // okhttp3.WebSocket.Factory
    @NotNull
    public WebSocket newWebSocket(@NotNull Request request, @NotNull WebSocketListener webSocketListener) {
        C6562gT0.p(request, "request");
        C6562gT0.p(webSocketListener, ServiceSpecificExtraArgs.CastExtraArgs.a);
        RealWebSocket realWebSocket = new RealWebSocket(TaskRunner.INSTANCE, request, webSocketListener, new Random(), this.pingIntervalMillis, null, this.minWebSocketMessageToCompress);
        realWebSocket.connect(this);
        return realWebSocket;
    }

    @InterfaceC8046mW0(name = "pingIntervalMillis")
    public final int pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    @InterfaceC8046mW0(name = "protocols")
    @NotNull
    public final List<Protocol> protocols() {
        return this.protocols;
    }

    @InterfaceC8046mW0(name = "proxy")
    @Nullable
    public final Proxy proxy() {
        return this.proxy;
    }

    @InterfaceC8046mW0(name = "proxyAuthenticator")
    @NotNull
    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @InterfaceC8046mW0(name = "proxySelector")
    @NotNull
    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    @InterfaceC8046mW0(name = "readTimeoutMillis")
    public final int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @InterfaceC8046mW0(name = "retryOnConnectionFailure")
    public final boolean retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    @InterfaceC8046mW0(name = "socketFactory")
    @NotNull
    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    @InterfaceC8046mW0(name = "sslSocketFactory")
    @NotNull
    public final SSLSocketFactory sslSocketFactory() {
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactoryOrNull;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    @InterfaceC8046mW0(name = "writeTimeoutMillis")
    public final int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    @InterfaceC8046mW0(name = "x509TrustManager")
    @Nullable
    public final X509TrustManager x509TrustManager() {
        return this.x509TrustManager;
    }

    public OkHttpClient() {
        this(new Builder());
    }
}
