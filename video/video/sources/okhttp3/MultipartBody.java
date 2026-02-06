package okhttp3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import o.AI0;
import o.C3307Iz;
import o.C5422bq;
import o.C6562gT0;
import o.C8859ps;
import o.C9516sY;
import o.EnumC9879u20;
import o.IR1;
import o.InterfaceC2579Bq;
import o.InterfaceC7058iW0;
import o.InterfaceC8046mW0;
import o.InterfaceC8289nW0;
import o.InterfaceC8303na2;
import o.InterfaceC9150r20;
import o.InterfaceC9511sW0;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class MultipartBody extends RequestBody {
    @InterfaceC7058iW0
    @NotNull
    public static final MediaType ALTERNATIVE;
    @NotNull
    private static final byte[] COLONSPACE;
    @NotNull
    private static final byte[] CRLF;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final byte[] DASHDASH;
    @InterfaceC7058iW0
    @NotNull
    public static final MediaType DIGEST;
    @InterfaceC7058iW0
    @NotNull
    public static final MediaType FORM;
    @InterfaceC7058iW0
    @NotNull
    public static final MediaType MIXED;
    @InterfaceC7058iW0
    @NotNull
    public static final MediaType PARALLEL;
    @NotNull
    private final C8859ps boundaryByteString;
    private long contentLength;
    @NotNull
    private final MediaType contentType;
    @NotNull
    private final List<Part> parts;
    @NotNull
    private final MediaType type;

    @InterfaceC8303na2({"SMAP\nMultipartBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartBody.kt\nokhttp3/MultipartBody$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,345:1\n1#2:346\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Builder {
        @NotNull
        private final C8859ps boundary;
        @NotNull
        private final List<Part> parts;
        @NotNull
        private MediaType type;

        @InterfaceC8289nW0
        public Builder() {
            this(null, 1, null);
        }

        @NotNull
        public final Builder addFormDataPart(@NotNull String str, @NotNull String str2) {
            C6562gT0.p(str, "name");
            C6562gT0.p(str2, "value");
            addPart(Part.Companion.createFormData(str, str2));
            return this;
        }

        @NotNull
        public final Builder addPart(@NotNull RequestBody requestBody) {
            C6562gT0.p(requestBody, "body");
            addPart(Part.Companion.create(requestBody));
            return this;
        }

        @NotNull
        public final MultipartBody build() {
            if (!this.parts.isEmpty()) {
                return new MultipartBody(this.boundary, this.type, Util.toImmutableList(this.parts));
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }

        @NotNull
        public final Builder setType(@NotNull MediaType mediaType) {
            C6562gT0.p(mediaType, "type");
            if (C6562gT0.g(mediaType.type(), "multipart")) {
                this.type = mediaType;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + mediaType).toString());
        }

        @InterfaceC8289nW0
        public Builder(@NotNull String str) {
            C6562gT0.p(str, "boundary");
            this.boundary = C8859ps.Y0.l(str);
            this.type = MultipartBody.MIXED;
            this.parts = new ArrayList();
        }

        @NotNull
        public final Builder addFormDataPart(@NotNull String str, @Nullable String str2, @NotNull RequestBody requestBody) {
            C6562gT0.p(str, "name");
            C6562gT0.p(requestBody, "body");
            addPart(Part.Companion.createFormData(str, str2, requestBody));
            return this;
        }

        @NotNull
        public final Builder addPart(@Nullable Headers headers, @NotNull RequestBody requestBody) {
            C6562gT0.p(requestBody, "body");
            addPart(Part.Companion.create(headers, requestBody));
            return this;
        }

        @NotNull
        public final Builder addPart(@NotNull Part part) {
            C6562gT0.p(part, "part");
            this.parts.add(part);
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Builder(String str, int i, C9516sY c9516sY) {
            this(str);
            if ((i & 1) != 0) {
                str = UUID.randomUUID().toString();
                C6562gT0.o(str, "randomUUID().toString()");
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        public final void appendQuotedString$okhttp(@NotNull StringBuilder sb, @NotNull String str) {
            C6562gT0.p(sb, "<this>");
            C6562gT0.p(str, "key");
            sb.append('\"');
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == '\n') {
                    sb.append("%0A");
                } else if (charAt == '\r') {
                    sb.append("%0D");
                } else if (charAt == '\"') {
                    sb.append("%22");
                } else {
                    sb.append(charAt);
                }
            }
            sb.append('\"');
        }

        private Companion() {
        }
    }

    /* loaded from: classes4.dex */
    public static final class Part {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        private final RequestBody body;
        @Nullable
        private final Headers headers;

        @InterfaceC8303na2({"SMAP\nMultipartBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartBody.kt\nokhttp3/MultipartBody$Part$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,345:1\n1#2:346\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(C9516sY c9516sY) {
                this();
            }

            @InterfaceC9511sW0
            @NotNull
            public final Part create(@NotNull RequestBody requestBody) {
                C6562gT0.p(requestBody, "body");
                return create(null, requestBody);
            }

            @InterfaceC9511sW0
            @NotNull
            public final Part createFormData(@NotNull String str, @NotNull String str2) {
                C6562gT0.p(str, "name");
                C6562gT0.p(str2, "value");
                return createFormData(str, null, RequestBody.Companion.create$default(RequestBody.Companion, str2, (MediaType) null, 1, (Object) null));
            }

            private Companion() {
            }

            @InterfaceC9511sW0
            @NotNull
            public final Part create(@Nullable Headers headers, @NotNull RequestBody requestBody) {
                C6562gT0.p(requestBody, "body");
                if ((headers != null ? headers.get("Content-Type") : null) == null) {
                    if ((headers != null ? headers.get("Content-Length") : null) == null) {
                        return new Part(headers, requestBody, null);
                    }
                    throw new IllegalArgumentException("Unexpected header: Content-Length");
                }
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            }

            @InterfaceC9511sW0
            @NotNull
            public final Part createFormData(@NotNull String str, @Nullable String str2, @NotNull RequestBody requestBody) {
                C6562gT0.p(str, "name");
                C6562gT0.p(requestBody, "body");
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                Companion companion = MultipartBody.Companion;
                companion.appendQuotedString$okhttp(sb, str);
                if (str2 != null) {
                    sb.append("; filename=");
                    companion.appendQuotedString$okhttp(sb, str2);
                }
                String sb2 = sb.toString();
                C6562gT0.o(sb2, "StringBuilder().apply(builderAction).toString()");
                return create(new Headers.Builder().addUnsafeNonAscii(AI0.a0, sb2).build(), requestBody);
            }
        }

        public /* synthetic */ Part(Headers headers, RequestBody requestBody, C9516sY c9516sY) {
            this(headers, requestBody);
        }

        @InterfaceC9511sW0
        @NotNull
        public static final Part create(@Nullable Headers headers, @NotNull RequestBody requestBody) {
            return Companion.create(headers, requestBody);
        }

        @InterfaceC9511sW0
        @NotNull
        public static final Part createFormData(@NotNull String str, @NotNull String str2) {
            return Companion.createFormData(str, str2);
        }

        @InterfaceC8046mW0(name = "-deprecated_body")
        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "body", imports = {}))
        @NotNull
        /* renamed from: -deprecated_body  reason: not valid java name */
        public final RequestBody m100deprecated_body() {
            return this.body;
        }

        @InterfaceC8046mW0(name = "-deprecated_headers")
        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "headers", imports = {}))
        @Nullable
        /* renamed from: -deprecated_headers  reason: not valid java name */
        public final Headers m101deprecated_headers() {
            return this.headers;
        }

        @InterfaceC8046mW0(name = "body")
        @NotNull
        public final RequestBody body() {
            return this.body;
        }

        @InterfaceC8046mW0(name = "headers")
        @Nullable
        public final Headers headers() {
            return this.headers;
        }

        private Part(Headers headers, RequestBody requestBody) {
            this.headers = headers;
            this.body = requestBody;
        }

        @InterfaceC9511sW0
        @NotNull
        public static final Part create(@NotNull RequestBody requestBody) {
            return Companion.create(requestBody);
        }

        @InterfaceC9511sW0
        @NotNull
        public static final Part createFormData(@NotNull String str, @Nullable String str2, @NotNull RequestBody requestBody) {
            return Companion.createFormData(str, str2, requestBody);
        }
    }

    static {
        MediaType.Companion companion = MediaType.Companion;
        MIXED = companion.get("multipart/mixed");
        ALTERNATIVE = companion.get("multipart/alternative");
        DIGEST = companion.get("multipart/digest");
        PARALLEL = companion.get("multipart/parallel");
        FORM = companion.get("multipart/form-data");
        COLONSPACE = new byte[]{58, 32};
        CRLF = new byte[]{13, 10};
        DASHDASH = new byte[]{C3307Iz.e0, C3307Iz.e0};
    }

    public MultipartBody(@NotNull C8859ps c8859ps, @NotNull MediaType mediaType, @NotNull List<Part> list) {
        C6562gT0.p(c8859ps, "boundaryByteString");
        C6562gT0.p(mediaType, "type");
        C6562gT0.p(list, "parts");
        this.boundaryByteString = c8859ps;
        this.type = mediaType;
        this.parts = list;
        MediaType.Companion companion = MediaType.Companion;
        this.contentType = companion.get(mediaType + "; boundary=" + boundary());
        this.contentLength = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long writeOrCountBytes(InterfaceC2579Bq interfaceC2579Bq, boolean z) throws IOException {
        C5422bq c5422bq;
        if (z) {
            interfaceC2579Bq = new C5422bq();
            c5422bq = interfaceC2579Bq;
        } else {
            c5422bq = 0;
        }
        int size = this.parts.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Part part = this.parts.get(i);
            Headers headers = part.headers();
            RequestBody body = part.body();
            C6562gT0.m(interfaceC2579Bq);
            interfaceC2579Bq.write(DASHDASH);
            interfaceC2579Bq.K4(this.boundaryByteString);
            interfaceC2579Bq.write(CRLF);
            if (headers != null) {
                int size2 = headers.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    interfaceC2579Bq.K1(headers.name(i2)).write(COLONSPACE).K1(headers.value(i2)).write(CRLF);
                }
            }
            MediaType contentType = body.contentType();
            if (contentType != null) {
                interfaceC2579Bq.K1("Content-Type: ").K1(contentType.toString()).write(CRLF);
            }
            long contentLength = body.contentLength();
            if (contentLength != -1) {
                interfaceC2579Bq.K1("Content-Length: ").S2(contentLength).write(CRLF);
            } else if (z) {
                C6562gT0.m(c5422bq);
                c5422bq.h();
                return -1L;
            }
            byte[] bArr = CRLF;
            interfaceC2579Bq.write(bArr);
            if (z) {
                j += contentLength;
            } else {
                body.writeTo(interfaceC2579Bq);
            }
            interfaceC2579Bq.write(bArr);
        }
        C6562gT0.m(interfaceC2579Bq);
        byte[] bArr2 = DASHDASH;
        interfaceC2579Bq.write(bArr2);
        interfaceC2579Bq.K4(this.boundaryByteString);
        interfaceC2579Bq.write(bArr2);
        interfaceC2579Bq.write(CRLF);
        if (z) {
            C6562gT0.m(c5422bq);
            long size3 = j + c5422bq.size();
            c5422bq.h();
            return size3;
        }
        return j;
    }

    @InterfaceC8046mW0(name = "-deprecated_boundary")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "boundary", imports = {}))
    @NotNull
    /* renamed from: -deprecated_boundary  reason: not valid java name */
    public final String m96deprecated_boundary() {
        return boundary();
    }

    @InterfaceC8046mW0(name = "-deprecated_parts")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "parts", imports = {}))
    @NotNull
    /* renamed from: -deprecated_parts  reason: not valid java name */
    public final List<Part> m97deprecated_parts() {
        return this.parts;
    }

    @InterfaceC8046mW0(name = "-deprecated_size")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "size", imports = {}))
    /* renamed from: -deprecated_size  reason: not valid java name */
    public final int m98deprecated_size() {
        return size();
    }

    @InterfaceC8046mW0(name = "-deprecated_type")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "type", imports = {}))
    @NotNull
    /* renamed from: -deprecated_type  reason: not valid java name */
    public final MediaType m99deprecated_type() {
        return this.type;
    }

    @InterfaceC8046mW0(name = "boundary")
    @NotNull
    public final String boundary() {
        return this.boundaryByteString.s0();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() throws IOException {
        long j = this.contentLength;
        if (j == -1) {
            long writeOrCountBytes = writeOrCountBytes(null, true);
            this.contentLength = writeOrCountBytes;
            return writeOrCountBytes;
        }
        return j;
    }

    @Override // okhttp3.RequestBody
    @NotNull
    public MediaType contentType() {
        return this.contentType;
    }

    @NotNull
    public final Part part(int i) {
        return this.parts.get(i);
    }

    @InterfaceC8046mW0(name = "parts")
    @NotNull
    public final List<Part> parts() {
        return this.parts;
    }

    @InterfaceC8046mW0(name = "size")
    public final int size() {
        return this.parts.size();
    }

    @InterfaceC8046mW0(name = "type")
    @NotNull
    public final MediaType type() {
        return this.type;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(@NotNull InterfaceC2579Bq interfaceC2579Bq) throws IOException {
        C6562gT0.p(interfaceC2579Bq, "sink");
        writeOrCountBytes(interfaceC2579Bq, false);
    }
}
