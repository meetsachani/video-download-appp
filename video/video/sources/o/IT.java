package o;

import android.graphics.Bitmap;
import android.util.Base64;
import com.facebook.gamingservices.C2352n;
import java.io.ByteArrayOutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class IT {
    @NotNull
    public final String a;
    @NotNull
    public final KT b;
    @Nullable
    public final KT c;
    @Nullable
    public final String d;
    @Nullable
    public final LT e;
    @Nullable
    public final String f;

    public /* synthetic */ IT(String str, KT kt, KT kt2, String str2, LT lt, String str3, C9516sY c9516sY) {
        this(str, kt, kt2, str2, lt, str3);
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    @Nullable
    public final KT b() {
        return this.c;
    }

    @Nullable
    public final String c() {
        return this.f;
    }

    @Nullable
    public final String d() {
        return this.d;
    }

    @Nullable
    public final LT e() {
        return this.e;
    }

    @NotNull
    public final KT f() {
        return this.b;
    }

    @NotNull
    public final JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("context_token_id", this.a);
        jSONObject.put("text", this.b.g().toString());
        KT kt = this.c;
        if (kt != null) {
            jSONObject.put("cta", kt.g().toString());
        }
        String str = this.d;
        if (str != null) {
            jSONObject.put("image", str);
        }
        LT lt = this.e;
        if (lt != null) {
            jSONObject.put("media", lt.g().toString());
        }
        String str2 = this.f;
        if (str2 == null) {
            return jSONObject;
        }
        jSONObject.put("data", str2);
        return jSONObject;
    }

    public IT(String str, KT kt, KT kt2, String str2, LT lt, String str3) {
        this.a = str;
        this.b = kt;
        this.c = kt2;
        this.d = str2;
        this.e = lt;
        this.f = str3;
    }

    /* loaded from: classes2.dex */
    public static final class a {
        @Nullable
        public final String a;
        @NotNull
        public final KT b;
        @Nullable
        public final Bitmap c;
        @Nullable
        public final LT d;
        @Nullable
        public KT e;
        @Nullable
        public String f;

        public a(String str, KT kt, Bitmap bitmap, LT lt) {
            this.a = str;
            this.b = kt;
            this.c = bitmap;
            this.d = lt;
        }

        public final String a(Bitmap bitmap) {
            if (bitmap == null) {
                return null;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            return C6562gT0.C("data:image/png;base64,", Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2));
        }

        @NotNull
        public final IT b() {
            boolean z;
            LT lt = this.d;
            if (lt != null) {
                boolean z2 = false;
                if (lt.e() != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.d.f() != null) {
                    z2 = true;
                }
                if (!(z ^ z2)) {
                    throw new IllegalArgumentException("Invalid CustomUpdateMedia, please set either gif or video");
                }
            }
            String a = a(this.c);
            String str = this.a;
            if (str != null) {
                return new IT(str, this.b, this.e, a, this.d, this.f, null);
            }
            throw new IllegalArgumentException("parameter contextToken must not be null");
        }

        @Nullable
        public final KT c() {
            return this.e;
        }

        @Nullable
        public final String d() {
            return this.f;
        }

        @NotNull
        public final a e(@NotNull KT kt) {
            C6562gT0.p(kt, "cta");
            this.e = kt;
            return this;
        }

        @NotNull
        public final a f(@NotNull String str) {
            C6562gT0.p(str, "data");
            this.f = str;
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull C2352n c2352n, @NotNull KT kt, @NotNull Bitmap bitmap) {
            this(c2352n.f(), kt, bitmap, null);
            C6562gT0.p(c2352n, C9998uW1.p);
            C6562gT0.p(kt, "text");
            C6562gT0.p(bitmap, "image");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull C2352n c2352n, @NotNull KT kt, @NotNull LT lt) {
            this(c2352n.f(), kt, null, lt);
            C6562gT0.p(c2352n, C9998uW1.p);
            C6562gT0.p(kt, "text");
            C6562gT0.p(lt, "media");
        }
    }

    public /* synthetic */ IT(String str, KT kt, KT kt2, String str2, LT lt, String str3, int i, C9516sY c9516sY) {
        this(str, kt, (i & 4) != 0 ? null : kt2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : lt, (i & 32) != 0 ? null : str3);
    }
}
