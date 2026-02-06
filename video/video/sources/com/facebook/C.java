package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.C2372q;
import com.facebook.internal.C2379y;
import java.net.HttpURLConnection;
import java.util.Arrays;
import o.C6562gT0;
import o.C9516sY;
import o.InterfaceC4696Xf0;
import o.InterfaceC4793Yf0;
import o.InterfaceC5056aJ2;
import o.InterfaceC7058iW0;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@InterfaceC4793Yf0({@InterfaceC4696Xf0(reason = "Legacy migration", type = "KOTLIN_JVM_FIELD")})
/* loaded from: classes2.dex */
public final class C implements Parcelable {
    public static final int k1 = -1;
    public static final int l1 = -1;
    @NotNull
    public static final String m1 = "code";
    @NotNull
    public static final String n1 = "body";
    @NotNull
    public static final String o1 = "error";
    @NotNull
    public static final String p1 = "type";
    @NotNull
    public static final String q1 = "code";
    @NotNull
    public static final String r1 = "message";
    @NotNull
    public static final String s1 = "error_code";
    @NotNull
    public static final String t1 = "error_subcode";
    @NotNull
    public static final String u1 = "error_msg";
    @NotNull
    public static final String v1 = "error_reason";
    @NotNull
    public static final String w1 = "error_user_title";
    @NotNull
    public static final String x1 = "error_user_msg";
    @NotNull
    public static final String y1 = "is_transient";
    public final int X;
    public final int Y;
    @Nullable
    public final String Y0;
    public final int Z;
    @Nullable
    public final String Z0;
    @Nullable
    public final String a1;
    @Nullable
    public final JSONObject b1;
    @Nullable
    public final JSONObject c1;
    @Nullable
    public final Object d1;
    @Nullable
    public final HttpURLConnection e1;
    @Nullable
    public final String f1;
    @Nullable
    public C2416z g1;
    @NotNull
    public final a h1;
    @Nullable
    public final String i1;
    @NotNull
    public static final c j1 = new c(null);
    @NotNull
    public static final d z1 = new d(200, 299);
    @InterfaceC7058iW0
    @NotNull
    public static final Parcelable.Creator<C> CREATOR = new b();

    /* loaded from: classes2.dex */
    public enum a {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<C> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public C createFromParcel(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "parcel");
            return new C(parcel, (C9516sY) null);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public C[] newArray(int i) {
            return new C[i];
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        @Nullable
        public final C a(@NotNull JSONObject jSONObject, @Nullable Object obj, @Nullable HttpURLConnection httpURLConnection) {
            String str;
            JSONObject jSONObject2;
            String optString;
            int optInt;
            String str2;
            Object obj2;
            boolean z;
            String str3;
            String str4;
            String optString2;
            int optInt2;
            String optString3;
            C6562gT0.p(jSONObject, "singleResult");
            try {
                if (jSONObject.has("code")) {
                    int i = jSONObject.getInt("code");
                    com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                    Object P = com.facebook.internal.l0.P(jSONObject, "body", Y.k);
                    if (P == null || !(P instanceof JSONObject)) {
                        str = "body";
                    } else {
                        boolean z2 = true;
                        boolean z3 = false;
                        int i2 = -1;
                        if (((JSONObject) P).has("error")) {
                            JSONObject jSONObject3 = (JSONObject) com.facebook.internal.l0.P((JSONObject) P, "error", null);
                            if (jSONObject3 == null) {
                                optString2 = null;
                            } else {
                                optString2 = jSONObject3.optString("type", null);
                            }
                            if (jSONObject3 == null) {
                                optString = null;
                            } else {
                                optString = jSONObject3.optString("message", null);
                            }
                            if (jSONObject3 == null) {
                                optInt2 = -1;
                            } else {
                                optInt2 = jSONObject3.optInt("code", -1);
                            }
                            if (jSONObject3 != null) {
                                i2 = jSONObject3.optInt("error_subcode", -1);
                            }
                            if (jSONObject3 == null) {
                                str4 = null;
                            } else {
                                str4 = jSONObject3.optString(C.x1, null);
                            }
                            if (jSONObject3 == null) {
                                optString3 = null;
                            } else {
                                optString3 = jSONObject3.optString(C.w1, null);
                            }
                            if (jSONObject3 != null) {
                                z3 = jSONObject3.optBoolean(C.y1, false);
                            }
                            str = "body";
                            optInt = i2;
                            i2 = optInt2;
                            str2 = optString2;
                            obj2 = P;
                            str3 = optString3;
                            z = z3;
                        } else {
                            if (!((JSONObject) P).has("error_code") && !((JSONObject) P).has(C.u1) && !((JSONObject) P).has(C.v1)) {
                                str = "body";
                                obj2 = P;
                                z2 = false;
                                z = false;
                                optInt = -1;
                                str2 = null;
                                str3 = null;
                                optString = null;
                                str4 = null;
                            }
                            String optString4 = ((JSONObject) P).optString(C.v1, null);
                            optString = ((JSONObject) P).optString(C.u1, null);
                            i2 = ((JSONObject) P).optInt("error_code", -1);
                            str = "body";
                            optInt = ((JSONObject) P).optInt("error_subcode", -1);
                            str2 = optString4;
                            obj2 = P;
                            z = false;
                            str3 = null;
                            str4 = null;
                        }
                        if (z2) {
                            return new C(i, i2, optInt, str2, optString, str3, str4, (JSONObject) obj2, jSONObject, obj, httpURLConnection, null, z, null);
                        }
                    }
                    if (!c().a(i)) {
                        if (jSONObject.has(str)) {
                            jSONObject2 = (JSONObject) com.facebook.internal.l0.P(jSONObject, str, Y.k);
                        } else {
                            jSONObject2 = null;
                        }
                        return new C(i, -1, -1, null, null, null, null, jSONObject2, jSONObject, obj, httpURLConnection, null, false, null);
                    }
                }
            } catch (JSONException unused) {
            }
            return null;
        }

        @InterfaceC9511sW0
        @NotNull
        public final synchronized C2372q b() {
            com.facebook.internal.C c = com.facebook.internal.C.a;
            M m = M.a;
            C2379y f = com.facebook.internal.C.f(M.o());
            if (f == null) {
                return C2372q.g.b();
            }
            return f.f();
        }

        @NotNull
        public final d c() {
            return C.z1;
        }

        public c() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class d {
        public final int a;
        public final int b;

        public d(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean a(int i) {
            int i2 = this.a;
            if (i > this.b || i2 > i) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ C(int i, int i2, int i3, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, C2416z c2416z, boolean z, C9516sY c9516sY) {
        this(i, i2, i3, str, str2, str3, str4, jSONObject, jSONObject2, obj, httpURLConnection, c2416z, z);
    }

    @InterfaceC9511sW0
    @Nullable
    public static final C b(@NotNull JSONObject jSONObject, @Nullable Object obj, @Nullable HttpURLConnection httpURLConnection) {
        return j1.a(jSONObject, obj, httpURLConnection);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final synchronized C2372q f() {
        C2372q b2;
        synchronized (C.class) {
            b2 = j1.b();
        }
        return b2;
    }

    @Nullable
    public final Object c() {
        return this.d1;
    }

    @NotNull
    public final a d() {
        return this.h1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final HttpURLConnection e() {
        return this.e1;
    }

    public final int g() {
        return this.Y;
    }

    @Nullable
    public final String h() {
        String str = this.f1;
        if (str == null) {
            C2416z c2416z = this.g1;
            if (c2416z == null) {
                return null;
            }
            return c2416z.getLocalizedMessage();
        }
        return str;
    }

    @Nullable
    public final String k() {
        return this.i1;
    }

    @Nullable
    public final String m() {
        return this.Y0;
    }

    @Nullable
    public final String n() {
        return this.a1;
    }

    @Nullable
    public final String o() {
        return this.Z0;
    }

    @Nullable
    public final C2416z q() {
        return this.g1;
    }

    @Nullable
    public final JSONObject s() {
        return this.c1;
    }

    @Nullable
    public final JSONObject t() {
        return this.b1;
    }

    @NotNull
    public String toString() {
        String str = "{HttpStatus: " + this.X + ", errorCode: " + this.Y + ", subErrorCode: " + this.Z + ", errorType: " + this.Y0 + ", errorMessage: " + h() + "}";
        C6562gT0.o(str, "StringBuilder(\"{HttpStatus: \")\n        .append(requestStatusCode)\n        .append(\", errorCode: \")\n        .append(errorCode)\n        .append(\", subErrorCode: \")\n        .append(subErrorCode)\n        .append(\", errorType: \")\n        .append(errorType)\n        .append(\", errorMessage: \")\n        .append(errorMessage)\n        .append(\"}\")\n        .toString()");
        return str;
    }

    public final int u() {
        return this.X;
    }

    public final int v() {
        return this.Z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        C6562gT0.p(parcel, "out");
        parcel.writeInt(this.X);
        parcel.writeInt(this.Y);
        parcel.writeInt(this.Z);
        parcel.writeString(this.Y0);
        parcel.writeString(h());
        parcel.writeString(this.Z0);
        parcel.writeString(this.a1);
    }

    public /* synthetic */ C(Parcel parcel, C9516sY c9516sY) {
        this(parcel);
    }

    public C(int i, int i2, int i3, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, C2416z c2416z, boolean z) {
        a c2;
        this.X = i;
        this.Y = i2;
        this.Z = i3;
        this.Y0 = str;
        this.Z0 = str3;
        this.a1 = str4;
        this.b1 = jSONObject;
        this.c1 = jSONObject2;
        this.d1 = obj;
        this.e1 = httpURLConnection;
        this.f1 = str2;
        if (c2416z != null) {
            this.g1 = c2416z;
            c2 = a.OTHER;
        } else {
            this.g1 = new P(this, h());
            c2 = j1.b().c(i2, i3, z);
        }
        this.h1 = c2;
        this.i1 = j1.b().h(c2);
    }

    @InterfaceC5056aJ2(otherwise = 4)
    public C(@Nullable HttpURLConnection httpURLConnection, @Nullable Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, null, null, httpURLConnection, exc instanceof C2416z ? (C2416z) exc : new C2416z(exc), false);
    }

    public C(int i, @Nullable String str, @Nullable String str2) {
        this(-1, i, -1, str, str2, null, null, null, null, null, null, null, false);
    }

    public C(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, null, null, null, null, false);
    }
}
