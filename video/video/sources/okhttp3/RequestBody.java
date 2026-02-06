package okhttp3;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import o.C5033aE;
import o.C6562gT0;
import o.C8859ps;
import o.C9516sY;
import o.C9604su1;
import o.EnumC9879u20;
import o.HB;
import o.IR1;
import o.InterfaceC2579Bq;
import o.InterfaceC7072ia2;
import o.InterfaceC8046mW0;
import o.InterfaceC8289nW0;
import o.InterfaceC9150r20;
import o.InterfaceC9511sW0;
import okhttp3.MediaType;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public abstract class RequestBody {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, String str, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        @InterfaceC9150r20(level = EnumC9879u20.X, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @IR1(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @NotNull
        @InterfaceC9511sW0
        @InterfaceC8289nW0
        public final RequestBody create(@Nullable MediaType mediaType, @NotNull byte[] bArr) {
            C6562gT0.p(bArr, "content");
            return create$default(this, mediaType, bArr, 0, 0, 12, (Object) null);
        }

        private Companion() {
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, C8859ps c8859ps, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(c8859ps, mediaType);
        }

        @InterfaceC9150r20(level = EnumC9879u20.X, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @IR1(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @NotNull
        @InterfaceC9511sW0
        @InterfaceC8289nW0
        public final RequestBody create(@Nullable MediaType mediaType, @NotNull byte[] bArr, int i) {
            C6562gT0.p(bArr, "content");
            return create$default(this, mediaType, bArr, i, 0, 8, (Object) null);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                mediaType = null;
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return companion.create(bArr, mediaType, i, i2);
        }

        @NotNull
        @InterfaceC9511sW0
        @InterfaceC8046mW0(name = "create")
        @InterfaceC8289nW0
        public final RequestBody create(@NotNull byte[] bArr) {
            C6562gT0.p(bArr, "<this>");
            return create$default(this, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        }

        @NotNull
        @InterfaceC9511sW0
        @InterfaceC8046mW0(name = "create")
        @InterfaceC8289nW0
        public final RequestBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType) {
            C6562gT0.p(bArr, "<this>");
            return create$default(this, bArr, mediaType, 0, 0, 6, (Object) null);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, File file, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(file, mediaType);
        }

        @NotNull
        @InterfaceC9511sW0
        @InterfaceC8046mW0(name = "create")
        @InterfaceC8289nW0
        public final RequestBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType, int i) {
            C6562gT0.p(bArr, "<this>");
            return create$default(this, bArr, mediaType, i, 0, 4, (Object) null);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, MediaType mediaType, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                i = 0;
            }
            if ((i3 & 8) != 0) {
                i2 = bArr.length;
            }
            return companion.create(mediaType, bArr, i, i2);
        }

        @InterfaceC9511sW0
        @InterfaceC8046mW0(name = "create")
        @NotNull
        public final RequestBody create(@NotNull String str, @Nullable MediaType mediaType) {
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
            byte[] bytes = str.getBytes(charset);
            C6562gT0.o(bytes, "this as java.lang.String).getBytes(charset)");
            return create(bytes, mediaType, 0, bytes.length);
        }

        @InterfaceC9511sW0
        @InterfaceC8046mW0(name = "create")
        @NotNull
        public final RequestBody create(@NotNull final C8859ps c8859ps, @Nullable final MediaType mediaType) {
            C6562gT0.p(c8859ps, "<this>");
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$1
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return c8859ps.g0();
                }

                @Override // okhttp3.RequestBody
                @Nullable
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(@NotNull InterfaceC2579Bq interfaceC2579Bq) {
                    C6562gT0.p(interfaceC2579Bq, "sink");
                    interfaceC2579Bq.K4(c8859ps);
                }
            };
        }

        @NotNull
        @InterfaceC9511sW0
        @InterfaceC8046mW0(name = "create")
        @InterfaceC8289nW0
        public final RequestBody create(@NotNull final byte[] bArr, @Nullable final MediaType mediaType, final int i, final int i2) {
            C6562gT0.p(bArr, "<this>");
            Util.checkOffsetAndCount(bArr.length, i, i2);
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$2
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return i2;
                }

                @Override // okhttp3.RequestBody
                @Nullable
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(@NotNull InterfaceC2579Bq interfaceC2579Bq) {
                    C6562gT0.p(interfaceC2579Bq, "sink");
                    interfaceC2579Bq.write(bArr, i, i2);
                }
            };
        }

        @InterfaceC9511sW0
        @InterfaceC8046mW0(name = "create")
        @NotNull
        public final RequestBody create(@NotNull final File file, @Nullable final MediaType mediaType) {
            C6562gT0.p(file, "<this>");
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$asRequestBody$1
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return file.length();
                }

                @Override // okhttp3.RequestBody
                @Nullable
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(@NotNull InterfaceC2579Bq interfaceC2579Bq) {
                    C6562gT0.p(interfaceC2579Bq, "sink");
                    InterfaceC7072ia2 t = C9604su1.t(file);
                    try {
                        interfaceC2579Bq.Q1(t);
                        C5033aE.a(t, null);
                    } finally {
                    }
                }
            };
        }

        @InterfaceC9511sW0
        @InterfaceC9150r20(level = EnumC9879u20.X, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @IR1(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @NotNull
        public final RequestBody create(@Nullable MediaType mediaType, @NotNull String str) {
            C6562gT0.p(str, "content");
            return create(str, mediaType);
        }

        @InterfaceC9511sW0
        @InterfaceC9150r20(level = EnumC9879u20.X, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @IR1(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @NotNull
        public final RequestBody create(@Nullable MediaType mediaType, @NotNull C8859ps c8859ps) {
            C6562gT0.p(c8859ps, "content");
            return create(c8859ps, mediaType);
        }

        @InterfaceC9150r20(level = EnumC9879u20.X, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @IR1(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @NotNull
        @InterfaceC9511sW0
        @InterfaceC8289nW0
        public final RequestBody create(@Nullable MediaType mediaType, @NotNull byte[] bArr, int i, int i2) {
            C6562gT0.p(bArr, "content");
            return create(bArr, mediaType, i, i2);
        }

        @InterfaceC9511sW0
        @InterfaceC9150r20(level = EnumC9879u20.X, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @IR1(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
        @NotNull
        public final RequestBody create(@Nullable MediaType mediaType, @NotNull File file) {
            C6562gT0.p(file, "file");
            return create(file, mediaType);
        }
    }

    @InterfaceC9511sW0
    @InterfaceC8046mW0(name = "create")
    @NotNull
    public static final RequestBody create(@NotNull File file, @Nullable MediaType mediaType) {
        return Companion.create(file, mediaType);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    @Nullable
    public abstract MediaType contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(@NotNull InterfaceC2579Bq interfaceC2579Bq) throws IOException;

    @InterfaceC9511sW0
    @InterfaceC8046mW0(name = "create")
    @NotNull
    public static final RequestBody create(@NotNull String str, @Nullable MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    @InterfaceC9511sW0
    @InterfaceC8046mW0(name = "create")
    @NotNull
    public static final RequestBody create(@NotNull C8859ps c8859ps, @Nullable MediaType mediaType) {
        return Companion.create(c8859ps, mediaType);
    }

    @InterfaceC9511sW0
    @InterfaceC9150r20(level = EnumC9879u20.X, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @IR1(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
    @NotNull
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull File file) {
        return Companion.create(mediaType, file);
    }

    @InterfaceC9511sW0
    @InterfaceC9150r20(level = EnumC9879u20.X, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @IR1(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @NotNull
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull String str) {
        return Companion.create(mediaType, str);
    }

    @InterfaceC9511sW0
    @InterfaceC9150r20(level = EnumC9879u20.X, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @IR1(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @NotNull
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull C8859ps c8859ps) {
        return Companion.create(mediaType, c8859ps);
    }

    @InterfaceC9150r20(level = EnumC9879u20.X, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @IR1(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @NotNull
    @InterfaceC9511sW0
    @InterfaceC8289nW0
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    @InterfaceC9150r20(level = EnumC9879u20.X, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @IR1(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @NotNull
    @InterfaceC9511sW0
    @InterfaceC8289nW0
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull byte[] bArr, int i) {
        return Companion.create(mediaType, bArr, i);
    }

    @InterfaceC9150r20(level = EnumC9879u20.X, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @IR1(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @NotNull
    @InterfaceC9511sW0
    @InterfaceC8289nW0
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull byte[] bArr, int i, int i2) {
        return Companion.create(mediaType, bArr, i, i2);
    }

    @NotNull
    @InterfaceC9511sW0
    @InterfaceC8046mW0(name = "create")
    @InterfaceC8289nW0
    public static final RequestBody create(@NotNull byte[] bArr) {
        return Companion.create(bArr);
    }

    @NotNull
    @InterfaceC9511sW0
    @InterfaceC8046mW0(name = "create")
    @InterfaceC8289nW0
    public static final RequestBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }

    @NotNull
    @InterfaceC9511sW0
    @InterfaceC8046mW0(name = "create")
    @InterfaceC8289nW0
    public static final RequestBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType, int i) {
        return Companion.create(bArr, mediaType, i);
    }

    @NotNull
    @InterfaceC9511sW0
    @InterfaceC8046mW0(name = "create")
    @InterfaceC8289nW0
    public static final RequestBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType, int i, int i2) {
        return Companion.create(bArr, mediaType, i, i2);
    }
}
