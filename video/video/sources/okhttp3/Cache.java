package okhttp3;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import o.AI0;
import o.AbstractC3011Fy0;
import o.AbstractC3501Ky0;
import o.B22;
import o.C10763xf2;
import o.C5033aE;
import o.C5422bq;
import o.C6562gT0;
import o.C7458kA2;
import o.C8222nF;
import o.C8319ne2;
import o.C8859ps;
import o.C9516sY;
import o.C9545sf2;
import o.C9604su1;
import o.EnumC9879u20;
import o.IR1;
import o.InterfaceC2579Bq;
import o.InterfaceC2677Cq;
import o.InterfaceC7072ia2;
import o.InterfaceC8046mW0;
import o.InterfaceC8303na2;
import o.InterfaceC9150r20;
import o.InterfaceC9511sW0;
import o.J82;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class Cache implements Closeable, Flushable {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;
    @NotNull
    private final DiskLruCache cache;
    private int hitCount;
    private int networkCount;
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;

    /* loaded from: classes4.dex */
    public static final class CacheResponseBody extends ResponseBody {
        @NotNull
        private final InterfaceC2677Cq bodySource;
        @Nullable
        private final String contentLength;
        @Nullable
        private final String contentType;
        @NotNull
        private final DiskLruCache.Snapshot snapshot;

        public CacheResponseBody(@NotNull DiskLruCache.Snapshot snapshot, @Nullable String str, @Nullable String str2) {
            C6562gT0.p(snapshot, "snapshot");
            this.snapshot = snapshot;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = C9604su1.e(new AbstractC3501Ky0(snapshot.getSource(1)) { // from class: okhttp3.Cache.CacheResponseBody.1
                @Override // o.AbstractC3501Ky0, o.InterfaceC7072ia2, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    this.getSnapshot().close();
                    super.close();
                }
            });
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            String str = this.contentLength;
            if (str == null) {
                return -1L;
            }
            return Util.toLongOrDefault(str, -1L);
        }

        @Override // okhttp3.ResponseBody
        @Nullable
        public MediaType contentType() {
            String str = this.contentType;
            if (str != null) {
                return MediaType.Companion.parse(str);
            }
            return null;
        }

        @NotNull
        public final DiskLruCache.Snapshot getSnapshot() {
            return this.snapshot;
        }

        @Override // okhttp3.ResponseBody
        @NotNull
        public InterfaceC2677Cq source() {
            return this.bodySource;
        }
    }

    @InterfaceC8303na2({"SMAP\nCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cache.kt\nokhttp3/Cache$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,788:1\n2624#2,3:789\n*S KotlinDebug\n*F\n+ 1 Cache.kt\nokhttp3/Cache$Companion\n*L\n729#1:789,3\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        private final Set<String> varyFields(Headers headers) {
            int size = headers.size();
            TreeSet treeSet = null;
            for (int i = 0; i < size; i++) {
                if (C9545sf2.c2(AI0.L0, headers.name(i), true)) {
                    String value = headers.value(i);
                    if (treeSet == null) {
                        treeSet = new TreeSet(C9545sf2.i2(C8319ne2.a));
                    }
                    for (String str : C10763xf2.n5(value, new char[]{','}, false, 0, 6, null)) {
                        treeSet.add(C10763xf2.b6(str).toString());
                    }
                }
            }
            if (treeSet == null) {
                return B22.k();
            }
            return treeSet;
        }

        public final boolean hasVaryAll(@NotNull Response response) {
            C6562gT0.p(response, "<this>");
            return varyFields(response.headers()).contains("*");
        }

        @InterfaceC9511sW0
        @NotNull
        public final String key(@NotNull HttpUrl httpUrl) {
            C6562gT0.p(httpUrl, "url");
            return C8859ps.Y0.l(httpUrl.toString()).T().A();
        }

        public final int readInt$okhttp(@NotNull InterfaceC2677Cq interfaceC2677Cq) throws IOException {
            C6562gT0.p(interfaceC2677Cq, "source");
            try {
                long a4 = interfaceC2677Cq.a4();
                String k2 = interfaceC2677Cq.k2();
                if (a4 >= 0 && a4 <= 2147483647L && k2.length() <= 0) {
                    return (int) a4;
                }
                throw new IOException("expected an int but was \"" + a4 + k2 + '\"');
            } catch (NumberFormatException e) {
                throw new IOException(e.getMessage());
            }
        }

        @NotNull
        public final Headers varyHeaders(@NotNull Response response) {
            C6562gT0.p(response, "<this>");
            Response networkResponse = response.networkResponse();
            C6562gT0.m(networkResponse);
            return varyHeaders(networkResponse.request().headers(), response.headers());
        }

        public final boolean varyMatches(@NotNull Response response, @NotNull Headers headers, @NotNull Request request) {
            C6562gT0.p(response, "cachedResponse");
            C6562gT0.p(headers, "cachedRequest");
            C6562gT0.p(request, "newRequest");
            Set<String> varyFields = varyFields(response.headers());
            if (varyFields != null && varyFields.isEmpty()) {
                return true;
            }
            for (String str : varyFields) {
                if (!C6562gT0.g(headers.values(str), request.headers(str))) {
                    return false;
                }
            }
            return true;
        }

        private Companion() {
        }

        private final Headers varyHeaders(Headers headers, Headers headers2) {
            Set<String> varyFields = varyFields(headers2);
            if (varyFields.isEmpty()) {
                return Util.EMPTY_HEADERS;
            }
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                String name = headers.name(i);
                if (varyFields.contains(name)) {
                    builder.add(name, headers.value(i));
                }
            }
            return builder.build();
        }
    }

    /* loaded from: classes4.dex */
    public final class RealCacheRequest implements CacheRequest {
        @NotNull
        private final J82 body;
        @NotNull
        private final J82 cacheOut;
        private boolean done;
        @NotNull
        private final DiskLruCache.Editor editor;
        final /* synthetic */ Cache this$0;

        public RealCacheRequest(@NotNull final Cache cache, DiskLruCache.Editor editor) {
            C6562gT0.p(editor, "editor");
            this.this$0 = cache;
            this.editor = editor;
            J82 newSink = editor.newSink(1);
            this.cacheOut = newSink;
            this.body = new AbstractC3011Fy0(newSink) { // from class: okhttp3.Cache.RealCacheRequest.1
                @Override // o.AbstractC3011Fy0, o.J82, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    Cache cache2 = Cache.this;
                    RealCacheRequest realCacheRequest = this;
                    synchronized (cache2) {
                        if (realCacheRequest.getDone()) {
                            return;
                        }
                        realCacheRequest.setDone(true);
                        cache2.setWriteSuccessCount$okhttp(cache2.getWriteSuccessCount$okhttp() + 1);
                        super.close();
                        this.editor.commit();
                    }
                }
            };
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public void abort() {
            Cache cache = this.this$0;
            synchronized (cache) {
                if (this.done) {
                    return;
                }
                this.done = true;
                cache.setWriteAbortCount$okhttp(cache.getWriteAbortCount$okhttp() + 1);
                Util.closeQuietly(this.cacheOut);
                try {
                    this.editor.abort();
                } catch (IOException unused) {
                }
            }
        }

        @Override // okhttp3.internal.cache.CacheRequest
        @NotNull
        public J82 body() {
            return this.body;
        }

        public final boolean getDone() {
            return this.done;
        }

        public final void setDone(boolean z) {
            this.done = z;
        }
    }

    public Cache(@NotNull File file, long j, @NotNull FileSystem fileSystem) {
        C6562gT0.p(file, "directory");
        C6562gT0.p(fileSystem, "fileSystem");
        this.cache = new DiskLruCache(fileSystem, file, VERSION, 2, j, TaskRunner.INSTANCE);
    }

    private final void abortQuietly(DiskLruCache.Editor editor) {
        if (editor != null) {
            try {
                editor.abort();
            } catch (IOException unused) {
            }
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String key(@NotNull HttpUrl httpUrl) {
        return Companion.key(httpUrl);
    }

    @InterfaceC8046mW0(name = "-deprecated_directory")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "directory", imports = {}))
    @NotNull
    /* renamed from: -deprecated_directory  reason: not valid java name */
    public final File m29deprecated_directory() {
        return this.cache.getDirectory();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.cache.close();
    }

    public final void delete() throws IOException {
        this.cache.delete();
    }

    @InterfaceC8046mW0(name = "directory")
    @NotNull
    public final File directory() {
        return this.cache.getDirectory();
    }

    public final void evictAll() throws IOException {
        this.cache.evictAll();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.cache.flush();
    }

    @Nullable
    public final Response get$okhttp(@NotNull Request request) {
        C6562gT0.p(request, "request");
        try {
            DiskLruCache.Snapshot snapshot = this.cache.get(Companion.key(request.url()));
            if (snapshot == null) {
                return null;
            }
            try {
                Entry entry = new Entry(snapshot.getSource(0));
                Response response = entry.response(snapshot);
                if (!entry.matches(request, response)) {
                    ResponseBody body = response.body();
                    if (body != null) {
                        Util.closeQuietly(body);
                    }
                    return null;
                }
                return response;
            } catch (IOException unused) {
                Util.closeQuietly(snapshot);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    @NotNull
    public final DiskLruCache getCache$okhttp() {
        return this.cache;
    }

    public final int getWriteAbortCount$okhttp() {
        return this.writeAbortCount;
    }

    public final int getWriteSuccessCount$okhttp() {
        return this.writeSuccessCount;
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public final void initialize() throws IOException {
        this.cache.initialize();
    }

    public final boolean isClosed() {
        return this.cache.isClosed();
    }

    public final long maxSize() {
        return this.cache.getMaxSize();
    }

    public final synchronized int networkCount() {
        return this.networkCount;
    }

    @Nullable
    public final CacheRequest put$okhttp(@NotNull Response response) {
        DiskLruCache.Editor editor;
        C6562gT0.p(response, "response");
        String method = response.request().method();
        if (HttpMethod.INSTANCE.invalidatesCache(response.request().method())) {
            try {
                remove$okhttp(response.request());
            } catch (IOException unused) {
            }
            return null;
        } else if (!C6562gT0.g(method, "GET")) {
            return null;
        } else {
            Companion companion = Companion;
            if (companion.hasVaryAll(response)) {
                return null;
            }
            Entry entry = new Entry(response);
            try {
                editor = DiskLruCache.edit$default(this.cache, companion.key(response.request().url()), 0L, 2, null);
                if (editor == null) {
                    return null;
                }
                try {
                    entry.writeTo(editor);
                    return new RealCacheRequest(this, editor);
                } catch (IOException unused2) {
                    abortQuietly(editor);
                    return null;
                }
            } catch (IOException unused3) {
                editor = null;
            }
        }
    }

    public final void remove$okhttp(@NotNull Request request) throws IOException {
        C6562gT0.p(request, "request");
        this.cache.remove(Companion.key(request.url()));
    }

    public final synchronized int requestCount() {
        return this.requestCount;
    }

    public final void setWriteAbortCount$okhttp(int i) {
        this.writeAbortCount = i;
    }

    public final void setWriteSuccessCount$okhttp(int i) {
        this.writeSuccessCount = i;
    }

    public final long size() throws IOException {
        return this.cache.size();
    }

    public final synchronized void trackConditionalCacheHit$okhttp() {
        this.hitCount++;
    }

    public final synchronized void trackResponse$okhttp(@NotNull CacheStrategy cacheStrategy) {
        try {
            C6562gT0.p(cacheStrategy, "cacheStrategy");
            this.requestCount++;
            if (cacheStrategy.getNetworkRequest() != null) {
                this.networkCount++;
            } else if (cacheStrategy.getCacheResponse() != null) {
                this.hitCount++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void update$okhttp(@NotNull Response response, @NotNull Response response2) {
        DiskLruCache.Editor editor;
        C6562gT0.p(response, "cached");
        C6562gT0.p(response2, "network");
        Entry entry = new Entry(response2);
        ResponseBody body = response.body();
        C6562gT0.n(body, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        try {
            editor = ((CacheResponseBody) body).getSnapshot().edit();
            if (editor == null) {
                return;
            }
            try {
                entry.writeTo(editor);
                editor.commit();
            } catch (IOException unused) {
                abortQuietly(editor);
            }
        } catch (IOException unused2) {
            editor = null;
        }
    }

    @NotNull
    public final Iterator<String> urls() throws IOException {
        return new Cache$urls$1(this);
    }

    public final synchronized int writeAbortCount() {
        return this.writeAbortCount;
    }

    public final synchronized int writeSuccessCount() {
        return this.writeSuccessCount;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Cache(@NotNull File file, long j) {
        this(file, j, FileSystem.SYSTEM);
        C6562gT0.p(file, "directory");
    }

    /* loaded from: classes4.dex */
    public static final class Entry {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        private static final String RECEIVED_MILLIS;
        @NotNull
        private static final String SENT_MILLIS;
        private final int code;
        @Nullable
        private final Handshake handshake;
        @NotNull
        private final String message;
        @NotNull
        private final Protocol protocol;
        private final long receivedResponseMillis;
        @NotNull
        private final String requestMethod;
        @NotNull
        private final Headers responseHeaders;
        private final long sentRequestMillis;
        @NotNull
        private final HttpUrl url;
        @NotNull
        private final Headers varyHeaders;

        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(C9516sY c9516sY) {
                this();
            }

            private Companion() {
            }
        }

        static {
            Platform.Companion companion;
            StringBuilder sb = new StringBuilder();
            sb.append(Platform.Companion.get().getPrefix());
            sb.append("-Sent-Millis");
            SENT_MILLIS = sb.toString();
            RECEIVED_MILLIS = companion.get().getPrefix() + "-Received-Millis";
        }

        public Entry(@NotNull InterfaceC7072ia2 interfaceC7072ia2) throws IOException {
            TlsVersion tlsVersion;
            C6562gT0.p(interfaceC7072ia2, "rawSource");
            try {
                InterfaceC2677Cq e = C9604su1.e(interfaceC7072ia2);
                String k2 = e.k2();
                HttpUrl parse = HttpUrl.Companion.parse(k2);
                if (parse != null) {
                    this.url = parse;
                    this.requestMethod = e.k2();
                    Headers.Builder builder = new Headers.Builder();
                    int readInt$okhttp = Cache.Companion.readInt$okhttp(e);
                    for (int i = 0; i < readInt$okhttp; i++) {
                        builder.addLenient$okhttp(e.k2());
                    }
                    this.varyHeaders = builder.build();
                    StatusLine parse2 = StatusLine.Companion.parse(e.k2());
                    this.protocol = parse2.protocol;
                    this.code = parse2.code;
                    this.message = parse2.message;
                    Headers.Builder builder2 = new Headers.Builder();
                    int readInt$okhttp2 = Cache.Companion.readInt$okhttp(e);
                    for (int i2 = 0; i2 < readInt$okhttp2; i2++) {
                        builder2.addLenient$okhttp(e.k2());
                    }
                    String str = SENT_MILLIS;
                    String str2 = builder2.get(str);
                    String str3 = RECEIVED_MILLIS;
                    String str4 = builder2.get(str3);
                    builder2.removeAll(str);
                    builder2.removeAll(str3);
                    this.sentRequestMillis = str2 != null ? Long.parseLong(str2) : 0L;
                    this.receivedResponseMillis = str4 != null ? Long.parseLong(str4) : 0L;
                    this.responseHeaders = builder2.build();
                    if (isHttps()) {
                        String k22 = e.k2();
                        if (k22.length() <= 0) {
                            CipherSuite forJavaName = CipherSuite.Companion.forJavaName(e.k2());
                            List<Certificate> readCertificateList = readCertificateList(e);
                            List<Certificate> readCertificateList2 = readCertificateList(e);
                            if (!e.M3()) {
                                tlsVersion = TlsVersion.Companion.forJavaName(e.k2());
                            } else {
                                tlsVersion = TlsVersion.SSL_3_0;
                            }
                            this.handshake = Handshake.Companion.get(tlsVersion, forJavaName, readCertificateList, readCertificateList2);
                        } else {
                            throw new IOException("expected \"\" but was \"" + k22 + '\"');
                        }
                    } else {
                        this.handshake = null;
                    }
                    C7458kA2 c7458kA2 = C7458kA2.a;
                    C5033aE.a(interfaceC7072ia2, null);
                    return;
                }
                IOException iOException = new IOException("Cache corruption for " + k2);
                Platform.Companion.get().log("cache corruption", 5, iOException);
                throw iOException;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    C5033aE.a(interfaceC7072ia2, th);
                    throw th2;
                }
            }
        }

        private final boolean isHttps() {
            return C6562gT0.g(this.url.scheme(), "https");
        }

        private final List<Certificate> readCertificateList(InterfaceC2677Cq interfaceC2677Cq) throws IOException {
            int readInt$okhttp = Cache.Companion.readInt$okhttp(interfaceC2677Cq);
            if (readInt$okhttp == -1) {
                return C8222nF.H();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(readInt$okhttp);
                for (int i = 0; i < readInt$okhttp; i++) {
                    String k2 = interfaceC2677Cq.k2();
                    C5422bq c5422bq = new C5422bq();
                    C8859ps h = C8859ps.Y0.h(k2);
                    if (h != null) {
                        c5422bq.K4(h);
                        arrayList.add(certificateFactory.generateCertificate(c5422bq.s0()));
                    } else {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        private final void writeCertList(InterfaceC2579Bq interfaceC2579Bq, List<? extends Certificate> list) throws IOException {
            try {
                interfaceC2579Bq.S2(list.size()).writeByte(10);
                for (Certificate certificate : list) {
                    byte[] encoded = certificate.getEncoded();
                    C8859ps.a aVar = C8859ps.Y0;
                    C6562gT0.o(encoded, "bytes");
                    interfaceC2579Bq.K1(C8859ps.a.p(aVar, encoded, 0, 0, 3, null).i()).writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final boolean matches(@NotNull Request request, @NotNull Response response) {
            C6562gT0.p(request, "request");
            C6562gT0.p(response, "response");
            if (C6562gT0.g(this.url, request.url()) && C6562gT0.g(this.requestMethod, request.method()) && Cache.Companion.varyMatches(response, this.varyHeaders, request)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final Response response(@NotNull DiskLruCache.Snapshot snapshot) {
            C6562gT0.p(snapshot, "snapshot");
            String str = this.responseHeaders.get("Content-Type");
            String str2 = this.responseHeaders.get("Content-Length");
            return new Response.Builder().request(new Request.Builder().url(this.url).method(this.requestMethod, null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(snapshot, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }

        public final void writeTo(@NotNull DiskLruCache.Editor editor) throws IOException {
            C6562gT0.p(editor, "editor");
            InterfaceC2579Bq d = C9604su1.d(editor.newSink(0));
            try {
                d.K1(this.url.toString()).writeByte(10);
                d.K1(this.requestMethod).writeByte(10);
                d.S2(this.varyHeaders.size()).writeByte(10);
                int size = this.varyHeaders.size();
                for (int i = 0; i < size; i++) {
                    d.K1(this.varyHeaders.name(i)).K1(": ").K1(this.varyHeaders.value(i)).writeByte(10);
                }
                d.K1(new StatusLine(this.protocol, this.code, this.message).toString()).writeByte(10);
                d.S2(this.responseHeaders.size() + 2).writeByte(10);
                int size2 = this.responseHeaders.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    d.K1(this.responseHeaders.name(i2)).K1(": ").K1(this.responseHeaders.value(i2)).writeByte(10);
                }
                d.K1(SENT_MILLIS).K1(": ").S2(this.sentRequestMillis).writeByte(10);
                d.K1(RECEIVED_MILLIS).K1(": ").S2(this.receivedResponseMillis).writeByte(10);
                if (isHttps()) {
                    d.writeByte(10);
                    Handshake handshake = this.handshake;
                    C6562gT0.m(handshake);
                    d.K1(handshake.cipherSuite().javaName()).writeByte(10);
                    writeCertList(d, this.handshake.peerCertificates());
                    writeCertList(d, this.handshake.localCertificates());
                    d.K1(this.handshake.tlsVersion().javaName()).writeByte(10);
                }
                C7458kA2 c7458kA2 = C7458kA2.a;
                C5033aE.a(d, null);
            } finally {
            }
        }

        public Entry(@NotNull Response response) {
            C6562gT0.p(response, "response");
            this.url = response.request().url();
            this.varyHeaders = Cache.Companion.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
            this.sentRequestMillis = response.sentRequestAtMillis();
            this.receivedResponseMillis = response.receivedResponseAtMillis();
        }
    }
}
