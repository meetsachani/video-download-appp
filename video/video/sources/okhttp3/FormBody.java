package okhttp3;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import o.C5422bq;
import o.C6562gT0;
import o.C9516sY;
import o.EnumC9879u20;
import o.IR1;
import o.InterfaceC2579Bq;
import o.InterfaceC8046mW0;
import o.InterfaceC8289nW0;
import o.InterfaceC9150r20;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class FormBody extends RequestBody {
    @NotNull
    private final List<String> encodedNames;
    @NotNull
    private final List<String> encodedValues;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final MediaType CONTENT_TYPE = MediaType.Companion.get("application/x-www-form-urlencoded");

    /* loaded from: classes4.dex */
    public static final class Builder {
        @Nullable
        private final Charset charset;
        @NotNull
        private final List<String> names;
        @NotNull
        private final List<String> values;

        @InterfaceC8289nW0
        public Builder() {
            this(null, 1, null);
        }

        @NotNull
        public final Builder add(@NotNull String str, @NotNull String str2) {
            C6562gT0.p(str, "name");
            C6562gT0.p(str2, "value");
            HttpUrl.Companion companion = HttpUrl.Companion;
            this.names.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.FORM_ENCODE_SET, false, false, true, false, this.charset, 91, null));
            this.values.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.FORM_ENCODE_SET, false, false, true, false, this.charset, 91, null));
            return this;
        }

        @NotNull
        public final Builder addEncoded(@NotNull String str, @NotNull String str2) {
            C6562gT0.p(str, "name");
            C6562gT0.p(str2, "value");
            HttpUrl.Companion companion = HttpUrl.Companion;
            this.names.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.FORM_ENCODE_SET, true, false, true, false, this.charset, 83, null));
            this.values.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.FORM_ENCODE_SET, true, false, true, false, this.charset, 83, null));
            return this;
        }

        @NotNull
        public final FormBody build() {
            return new FormBody(this.names, this.values);
        }

        @InterfaceC8289nW0
        public Builder(@Nullable Charset charset) {
            this.charset = charset;
            this.names = new ArrayList();
            this.values = new ArrayList();
        }

        public /* synthetic */ Builder(Charset charset, int i, C9516sY c9516sY) {
            this((i & 1) != 0 ? null : charset);
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

    public FormBody(@NotNull List<String> list, @NotNull List<String> list2) {
        C6562gT0.p(list, "encodedNames");
        C6562gT0.p(list2, "encodedValues");
        this.encodedNames = Util.toImmutableList(list);
        this.encodedValues = Util.toImmutableList(list2);
    }

    private final long writeOrCountBytes(InterfaceC2579Bq interfaceC2579Bq, boolean z) {
        C5422bq B;
        if (z) {
            B = new C5422bq();
        } else {
            C6562gT0.m(interfaceC2579Bq);
            B = interfaceC2579Bq.B();
        }
        int size = this.encodedNames.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                B.writeByte(38);
            }
            B.K1(this.encodedNames.get(i));
            B.writeByte(61);
            B.K1(this.encodedValues.get(i));
        }
        if (z) {
            long size2 = B.size();
            B.h();
            return size2;
        }
        return 0L;
    }

    @InterfaceC8046mW0(name = "-deprecated_size")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "size", imports = {}))
    /* renamed from: -deprecated_size  reason: not valid java name */
    public final int m58deprecated_size() {
        return size();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return writeOrCountBytes(null, true);
    }

    @Override // okhttp3.RequestBody
    @NotNull
    public MediaType contentType() {
        return CONTENT_TYPE;
    }

    @NotNull
    public final String encodedName(int i) {
        return this.encodedNames.get(i);
    }

    @NotNull
    public final String encodedValue(int i) {
        return this.encodedValues.get(i);
    }

    @NotNull
    public final String name(int i) {
        return HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, encodedName(i), 0, 0, true, 3, null);
    }

    @InterfaceC8046mW0(name = "size")
    public final int size() {
        return this.encodedNames.size();
    }

    @NotNull
    public final String value(int i) {
        return HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, encodedValue(i), 0, 0, true, 3, null);
    }

    @Override // okhttp3.RequestBody
    public void writeTo(@NotNull InterfaceC2579Bq interfaceC2579Bq) throws IOException {
        C6562gT0.p(interfaceC2579Bq, "sink");
        writeOrCountBytes(interfaceC2579Bq, false);
    }
}
