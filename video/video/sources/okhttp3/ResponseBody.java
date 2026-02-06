package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import o.C4317Th1;
import o.C5033aE;
import o.C5422bq;
import o.C6562gT0;
import o.C7458kA2;
import o.C8859ps;
import o.C9516sY;
import o.EnumC9879u20;
import o.HA0;
import o.HB;
import o.IR1;
import o.InterfaceC2677Cq;
import o.InterfaceC8046mW0;
import o.InterfaceC8303na2;
import o.InterfaceC9150r20;
import o.InterfaceC9511sW0;
import o.UP0;
import okhttp3.MediaType;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nResponseBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseBody.kt\nokhttp3/ResponseBody\n*L\n1#1,321:1\n140#1,11:322\n140#1,11:333\n*S KotlinDebug\n*F\n+ 1 ResponseBody.kt\nokhttp3/ResponseBody\n*L\n124#1:322,11\n134#1:333,11\n*E\n"})
/* loaded from: classes4.dex */
public abstract class ResponseBody implements Closeable {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @Nullable
    private Reader reader;

    @InterfaceC8303na2({"SMAP\nResponseBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseBody.kt\nokhttp3/ResponseBody$BomAwareReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,321:1\n1#2:322\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class BomAwareReader extends Reader {
        @NotNull
        private final Charset charset;
        private boolean closed;
        @Nullable
        private Reader delegate;
        @NotNull
        private final InterfaceC2677Cq source;

        public BomAwareReader(@NotNull InterfaceC2677Cq interfaceC2677Cq, @NotNull Charset charset) {
            C6562gT0.p(interfaceC2677Cq, "source");
            C6562gT0.p(charset, C4317Th1.g);
            this.source = interfaceC2677Cq;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C7458kA2 c7458kA2;
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
                c7458kA2 = C7458kA2.a;
            } else {
                c7458kA2 = null;
            }
            if (c7458kA2 == null) {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(@NotNull char[] cArr, int i, int i2) throws IOException {
            C6562gT0.p(cArr, "cbuf");
            if (!this.closed) {
                Reader reader = this.delegate;
                if (reader == null) {
                    reader = new InputStreamReader(this.source.s0(), Util.readBomAsCharset(this.source, this.charset));
                    this.delegate = reader;
                }
                return reader.read(cArr, i, i2);
            }
            throw new IOException("Stream closed");
        }
    }

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        @InterfaceC9511sW0
        @InterfaceC8046mW0(name = "create")
        @NotNull
        public final ResponseBody create(@NotNull String str, @Nullable MediaType mediaType) {
            C6562gT0.p(str, "<this>");
            Charset charset = HB.b;
            if (mediaType != null) {
                Charset charset$default = MediaType.charset$default(mediaType, null, 1, null);
                if (charset$default == null) {
                    MediaType.Companion companion = MediaType.Companion;
                    mediaType = companion.parse(mediaType + "; charset=utf-8");
                } else {
                    charset = charset$default;
                }
            }
            C5422bq H4 = new C5422bq().H4(str, charset);
            return create(H4, mediaType, H4.size());
        }

        private Companion() {
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, C8859ps c8859ps, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(c8859ps, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, InterfaceC2677Cq interfaceC2677Cq, MediaType mediaType, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            if ((i & 2) != 0) {
                j = -1;
            }
            return companion.create(interfaceC2677Cq, mediaType, j);
        }

        @InterfaceC9511sW0
        @InterfaceC8046mW0(name = "create")
        @NotNull
        public final ResponseBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType) {
            C6562gT0.p(bArr, "<this>");
            return create(new C5422bq().write(bArr), mediaType, bArr.length);
        }

        @InterfaceC9511sW0
        @InterfaceC8046mW0(name = "create")
        @NotNull
        public final ResponseBody create(@NotNull C8859ps c8859ps, @Nullable MediaType mediaType) {
            C6562gT0.p(c8859ps, "<this>");
            return create(new C5422bq().K4(c8859ps), mediaType, c8859ps.g0());
        }

        @InterfaceC9511sW0
        @InterfaceC8046mW0(name = "create")
        @NotNull
        public final ResponseBody create(@NotNull final InterfaceC2677Cq interfaceC2677Cq, @Nullable final MediaType mediaType, final long j) {
            C6562gT0.p(interfaceC2677Cq, "<this>");
            return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // okhttp3.ResponseBody
                public long contentLength() {
                    return j;
                }

                @Override // okhttp3.ResponseBody
                @Nullable
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.ResponseBody
                @NotNull
                public InterfaceC2677Cq source() {
                    return interfaceC2677Cq;
                }
            };
        }

        @InterfaceC9511sW0
        @InterfaceC9150r20(level = EnumC9879u20.X, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @IR1(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @NotNull
        public final ResponseBody create(@Nullable MediaType mediaType, @NotNull String str) {
            C6562gT0.p(str, "content");
            return create(str, mediaType);
        }

        @InterfaceC9511sW0
        @InterfaceC9150r20(level = EnumC9879u20.X, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @IR1(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @NotNull
        public final ResponseBody create(@Nullable MediaType mediaType, @NotNull byte[] bArr) {
            C6562gT0.p(bArr, "content");
            return create(bArr, mediaType);
        }

        @InterfaceC9511sW0
        @InterfaceC9150r20(level = EnumC9879u20.X, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @IR1(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @NotNull
        public final ResponseBody create(@Nullable MediaType mediaType, @NotNull C8859ps c8859ps) {
            C6562gT0.p(c8859ps, "content");
            return create(c8859ps, mediaType);
        }

        @InterfaceC9511sW0
        @InterfaceC9150r20(level = EnumC9879u20.X, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @IR1(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
        @NotNull
        public final ResponseBody create(@Nullable MediaType mediaType, long j, @NotNull InterfaceC2677Cq interfaceC2677Cq) {
            C6562gT0.p(interfaceC2677Cq, "content");
            return create(interfaceC2677Cq, mediaType, j);
        }
    }

    private final Charset charset() {
        Charset charset;
        MediaType contentType = contentType();
        if (contentType != null && (charset = contentType.charset(HB.b)) != null) {
            return charset;
        }
        return HB.b;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.Object] */
    private final <T> T consumeSource(HA0<? super InterfaceC2677Cq, ? extends T> ha0, HA0<? super T, Integer> ha02) {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            InterfaceC2677Cq source = source();
            try {
                T invoke = ha0.invoke(source);
                UP0.d(1);
                C5033aE.a(source, null);
                UP0.c(1);
                int intValue = ha02.invoke(invoke).intValue();
                if (contentLength != -1 && contentLength != intValue) {
                    throw new IOException("Content-Length (" + contentLength + ") and stream length (" + intValue + ") disagree");
                }
                return invoke;
            } finally {
            }
        } else {
            throw new IOException("Cannot buffer entire body for content length: " + contentLength);
        }
    }

    @InterfaceC9511sW0
    @InterfaceC8046mW0(name = "create")
    @NotNull
    public static final ResponseBody create(@NotNull String str, @Nullable MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    @NotNull
    public final InputStream byteStream() {
        return source().s0();
    }

    @NotNull
    public final C8859ps byteString() throws IOException {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            InterfaceC2677Cq source = source();
            try {
                C8859ps G4 = source.G4();
                C5033aE.a(source, null);
                int g0 = G4.g0();
                if (contentLength != -1 && contentLength != g0) {
                    throw new IOException("Content-Length (" + contentLength + ") and stream length (" + g0 + ") disagree");
                }
                return G4;
            } finally {
            }
        } else {
            throw new IOException("Cannot buffer entire body for content length: " + contentLength);
        }
    }

    @NotNull
    public final byte[] bytes() throws IOException {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            InterfaceC2677Cq source = source();
            try {
                byte[] I3 = source.I3();
                C5033aE.a(source, null);
                int length = I3.length;
                if (contentLength != -1 && contentLength != length) {
                    throw new IOException("Content-Length (" + contentLength + ") and stream length (" + length + ") disagree");
                }
                return I3;
            } finally {
            }
        } else {
            throw new IOException("Cannot buffer entire body for content length: " + contentLength);
        }
    }

    @NotNull
    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader == null) {
            BomAwareReader bomAwareReader = new BomAwareReader(source(), charset());
            this.reader = bomAwareReader;
            return bomAwareReader;
        }
        return reader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.closeQuietly(source());
    }

    public abstract long contentLength();

    @Nullable
    public abstract MediaType contentType();

    @NotNull
    public abstract InterfaceC2677Cq source();

    @NotNull
    public final String string() throws IOException {
        InterfaceC2677Cq source = source();
        try {
            String y4 = source.y4(Util.readBomAsCharset(source, charset()));
            C5033aE.a(source, null);
            return y4;
        } finally {
        }
    }

    @InterfaceC9511sW0
    @InterfaceC8046mW0(name = "create")
    @NotNull
    public static final ResponseBody create(@NotNull InterfaceC2677Cq interfaceC2677Cq, @Nullable MediaType mediaType, long j) {
        return Companion.create(interfaceC2677Cq, mediaType, j);
    }

    @InterfaceC9511sW0
    @InterfaceC8046mW0(name = "create")
    @NotNull
    public static final ResponseBody create(@NotNull C8859ps c8859ps, @Nullable MediaType mediaType) {
        return Companion.create(c8859ps, mediaType);
    }

    @InterfaceC9511sW0
    @InterfaceC9150r20(level = EnumC9879u20.X, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @IR1(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
    @NotNull
    public static final ResponseBody create(@Nullable MediaType mediaType, long j, @NotNull InterfaceC2677Cq interfaceC2677Cq) {
        return Companion.create(mediaType, j, interfaceC2677Cq);
    }

    @InterfaceC9511sW0
    @InterfaceC9150r20(level = EnumC9879u20.X, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @IR1(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @NotNull
    public static final ResponseBody create(@Nullable MediaType mediaType, @NotNull String str) {
        return Companion.create(mediaType, str);
    }

    @InterfaceC9511sW0
    @InterfaceC9150r20(level = EnumC9879u20.X, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @IR1(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @NotNull
    public static final ResponseBody create(@Nullable MediaType mediaType, @NotNull C8859ps c8859ps) {
        return Companion.create(mediaType, c8859ps);
    }

    @InterfaceC9511sW0
    @InterfaceC9150r20(level = EnumC9879u20.X, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @IR1(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @NotNull
    public static final ResponseBody create(@Nullable MediaType mediaType, @NotNull byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    @InterfaceC9511sW0
    @InterfaceC8046mW0(name = "create")
    @NotNull
    public static final ResponseBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }
}
