package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.C6562gT0;
import o.C6797hR0;
import o.C8319ne2;
import o.C9516sY;
import o.HB;
import o.InterfaceC5056aJ2;
import o.InterfaceC7058iW0;
import o.InterfaceC8289nW0;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2383l implements Parcelable {
    @NotNull
    public static final String A1 = "middle_name";
    @NotNull
    public static final String B1 = "family_name";
    @NotNull
    public static final String C1 = "email";
    @NotNull
    public static final String D1 = "picture";
    @NotNull
    public static final String E1 = "user_friends";
    @NotNull
    public static final String F1 = "user_birthday";
    @NotNull
    public static final String G1 = "user_age_range";
    @NotNull
    public static final String H1 = "user_hometown";
    @NotNull
    public static final String I1 = "user_gender";
    @NotNull
    public static final String J1 = "user_link";
    @NotNull
    public static final String K1 = "user_location";
    public static final long q1 = 600000;
    @NotNull
    public static final String r1 = "jti";
    @NotNull
    public static final String s1 = "iss";
    @NotNull
    public static final String t1 = "aud";
    @NotNull
    public static final String u1 = "nonce";
    @NotNull
    public static final String v1 = "exp";
    @NotNull
    public static final String w1 = "iat";
    @NotNull
    public static final String x1 = "sub";
    @NotNull
    public static final String y1 = "name";
    @NotNull
    public static final String z1 = "given_name";
    @NotNull
    public final String X;
    @NotNull
    public final String Y;
    @NotNull
    public final String Y0;
    @NotNull
    public final String Z;
    public final long Z0;
    public final long a1;
    @NotNull
    public final String b1;
    @Nullable
    public final String c1;
    @Nullable
    public final String d1;
    @Nullable
    public final String e1;
    @Nullable
    public final String f1;
    @Nullable
    public final String g1;
    @Nullable
    public final String h1;
    @Nullable
    public final Set<String> i1;
    @Nullable
    public final String j1;
    @Nullable
    public final Map<String, Integer> k1;
    @Nullable
    public final Map<String, String> l1;
    @Nullable
    public final Map<String, String> m1;
    @Nullable
    public final String n1;
    @Nullable
    public final String o1;
    @NotNull
    public static final b p1 = new b(null);
    @InterfaceC7058iW0
    @NotNull
    public static final Parcelable.Creator<C2383l> CREATOR = new a();

    /* renamed from: com.facebook.l$a */
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<C2383l> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public C2383l createFromParcel(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "source");
            return new C2383l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public C2383l[] newArray(int i) {
            return new C2383l[i];
        }
    }

    /* renamed from: com.facebook.l$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        @NotNull
        public final C2383l a(@NotNull JSONObject jSONObject) throws JSONException {
            List<String> j0;
            Map<String, Object> o2;
            Map<String, String> p;
            C6562gT0.p(jSONObject, "jsonObject");
            String string = jSONObject.getString(C2383l.r1);
            String string2 = jSONObject.getString(C2383l.s1);
            String string3 = jSONObject.getString(C2383l.t1);
            String string4 = jSONObject.getString("nonce");
            long j = jSONObject.getLong(C2383l.v1);
            long j2 = jSONObject.getLong(C2383l.w1);
            String string5 = jSONObject.getString(C2383l.x1);
            String b = b(jSONObject, "name");
            String b2 = b(jSONObject, C2383l.z1);
            String b3 = b(jSONObject, "middle_name");
            String b4 = b(jSONObject, C2383l.B1);
            String b5 = b(jSONObject, "email");
            String b6 = b(jSONObject, "picture");
            JSONArray optJSONArray = jSONObject.optJSONArray(C2383l.E1);
            String b7 = b(jSONObject, C2383l.F1);
            JSONObject optJSONObject = jSONObject.optJSONObject(C2383l.G1);
            JSONObject optJSONObject2 = jSONObject.optJSONObject(C2383l.H1);
            JSONObject optJSONObject3 = jSONObject.optJSONObject(C2383l.K1);
            String b8 = b(jSONObject, C2383l.I1);
            String b9 = b(jSONObject, C2383l.J1);
            C6562gT0.o(string, C2383l.r1);
            C6562gT0.o(string2, C2383l.s1);
            C6562gT0.o(string3, C2383l.t1);
            C6562gT0.o(string4, "nonce");
            C6562gT0.o(string5, C2383l.x1);
            Map<String, String> map = null;
            if (optJSONArray == null) {
                j0 = null;
            } else {
                com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                j0 = com.facebook.internal.l0.j0(optJSONArray);
            }
            List<String> list = j0;
            if (optJSONObject == null) {
                o2 = null;
            } else {
                com.facebook.internal.l0 l0Var2 = com.facebook.internal.l0.a;
                o2 = com.facebook.internal.l0.o(optJSONObject);
            }
            if (optJSONObject2 == null) {
                p = null;
            } else {
                com.facebook.internal.l0 l0Var3 = com.facebook.internal.l0.a;
                p = com.facebook.internal.l0.p(optJSONObject2);
            }
            if (optJSONObject3 != null) {
                com.facebook.internal.l0 l0Var4 = com.facebook.internal.l0.a;
                map = com.facebook.internal.l0.p(optJSONObject3);
            }
            return new C2383l(string, string2, string3, string4, j, j2, string5, b, b2, b3, b4, b5, b6, list, b7, o2, p, map, b8, b9);
        }

        @Nullable
        public final String b(@NotNull JSONObject jSONObject, @NotNull String str) {
            C6562gT0.p(jSONObject, "<this>");
            C6562gT0.p(str, "name");
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            return null;
        }

        public b() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC5056aJ2(otherwise = 2)
    @InterfaceC8289nW0
    public C2383l(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, long j2, @NotNull String str5) {
        this(str, str2, str3, str4, j, j2, str5, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048448, null);
        C6562gT0.p(str, r1);
        C6562gT0.p(str2, s1);
        C6562gT0.p(str3, t1);
        C6562gT0.p(str4, "nonce");
        C6562gT0.p(str5, x1);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final C2383l a(@NotNull JSONObject jSONObject) throws JSONException {
        return p1.a(jSONObject);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        if (o.C6562gT0.g(new java.net.URL(r2).getHost(), "www.facebook.com") == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return false;
        }
        String optString = jSONObject.optString(r1);
        C6562gT0.o(optString, r1);
        if (optString.length() == 0) {
            return false;
        }
        try {
            String optString2 = jSONObject.optString(s1);
            C6562gT0.o(optString2, s1);
            if (optString2.length() != 0) {
                if (!C6562gT0.g(new URL(optString2).getHost(), M.Q)) {
                }
                String optString3 = jSONObject.optString(t1);
                C6562gT0.o(optString3, t1);
                if (optString3.length() != 0) {
                    M m = M.a;
                    if (C6562gT0.g(optString3, M.o())) {
                        long j = 1000;
                        if (new Date().after(new Date(jSONObject.optLong(v1) * j))) {
                            return false;
                        }
                        if (new Date().after(new Date((jSONObject.optLong(w1) * j) + 600000))) {
                            return false;
                        }
                        String optString4 = jSONObject.optString(x1);
                        C6562gT0.o(optString4, x1);
                        if (optString4.length() == 0) {
                            return false;
                        }
                        String optString5 = jSONObject.optString("nonce");
                        C6562gT0.o(optString5, "nonce");
                        if (optString5.length() == 0 || !C6562gT0.g(optString5, str)) {
                            return false;
                        }
                        return true;
                    }
                }
                return false;
            }
            return false;
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    @InterfaceC5056aJ2(otherwise = 2)
    @NotNull
    public final String B() {
        String c2383l = toString();
        Charset charset = HB.b;
        if (c2383l != null) {
            byte[] bytes = c2383l.getBytes(charset);
            C6562gT0.o(bytes, "(this as java.lang.String).getBytes(charset)");
            String encodeToString = Base64.encodeToString(bytes, 8);
            C6562gT0.o(encodeToString, "encodeToString(claimsJsonString.toByteArray(), Base64.URL_SAFE)");
            return encodeToString;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    @InterfaceC5056aJ2(otherwise = 2)
    @NotNull
    public final JSONObject C() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(r1, this.X);
        jSONObject.put(s1, this.Y);
        jSONObject.put(t1, this.Z);
        jSONObject.put("nonce", this.Y0);
        jSONObject.put(v1, this.Z0);
        jSONObject.put(w1, this.a1);
        String str = this.b1;
        if (str != null) {
            jSONObject.put(x1, str);
        }
        String str2 = this.c1;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        String str3 = this.d1;
        if (str3 != null) {
            jSONObject.put(z1, str3);
        }
        String str4 = this.e1;
        if (str4 != null) {
            jSONObject.put("middle_name", str4);
        }
        String str5 = this.f1;
        if (str5 != null) {
            jSONObject.put(B1, str5);
        }
        String str6 = this.g1;
        if (str6 != null) {
            jSONObject.put("email", str6);
        }
        String str7 = this.h1;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        if (this.i1 != null) {
            jSONObject.put(E1, new JSONArray((Collection) this.i1));
        }
        String str8 = this.j1;
        if (str8 != null) {
            jSONObject.put(F1, str8);
        }
        if (this.k1 != null) {
            jSONObject.put(G1, new JSONObject(this.k1));
        }
        if (this.l1 != null) {
            jSONObject.put(H1, new JSONObject(this.l1));
        }
        if (this.m1 != null) {
            jSONObject.put(K1, new JSONObject(this.m1));
        }
        String str9 = this.n1;
        if (str9 != null) {
            jSONObject.put(I1, str9);
        }
        String str10 = this.o1;
        if (str10 != null) {
            jSONObject.put(J1, str10);
        }
        return jSONObject;
    }

    @NotNull
    public final String b() {
        return this.Z;
    }

    @Nullable
    public final String c() {
        return this.g1;
    }

    public final long d() {
        return this.Z0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String e() {
        return this.f1;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2383l)) {
            return false;
        }
        C2383l c2383l = (C2383l) obj;
        if (C6562gT0.g(this.X, c2383l.X) && C6562gT0.g(this.Y, c2383l.Y) && C6562gT0.g(this.Z, c2383l.Z) && C6562gT0.g(this.Y0, c2383l.Y0) && this.Z0 == c2383l.Z0 && this.a1 == c2383l.a1 && C6562gT0.g(this.b1, c2383l.b1) && C6562gT0.g(this.c1, c2383l.c1) && C6562gT0.g(this.d1, c2383l.d1) && C6562gT0.g(this.e1, c2383l.e1) && C6562gT0.g(this.f1, c2383l.f1) && C6562gT0.g(this.g1, c2383l.g1) && C6562gT0.g(this.h1, c2383l.h1) && C6562gT0.g(this.i1, c2383l.i1) && C6562gT0.g(this.j1, c2383l.j1) && C6562gT0.g(this.k1, c2383l.k1) && C6562gT0.g(this.l1, c2383l.l1) && C6562gT0.g(this.m1, c2383l.m1) && C6562gT0.g(this.n1, c2383l.n1) && C6562gT0.g(this.o1, c2383l.o1)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final String f() {
        return this.d1;
    }

    public final long g() {
        return this.a1;
    }

    @NotNull
    public final String h() {
        return this.Y;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13 = (((((((((((((527 + this.X.hashCode()) * 31) + this.Y.hashCode()) * 31) + this.Z.hashCode()) * 31) + this.Y0.hashCode()) * 31) + Long.hashCode(this.Z0)) * 31) + Long.hashCode(this.a1)) * 31) + this.b1.hashCode()) * 31;
        String str = this.c1;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode13 + hashCode) * 31;
        String str2 = this.d1;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.e1;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.f1;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this.g1;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str6 = this.h1;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        Set<String> set = this.i1;
        if (set == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = set.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        String str7 = this.j1;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        Map<String, Integer> map = this.k1;
        if (map == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = map.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        Map<String, String> map2 = this.l1;
        if (map2 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = map2.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        Map<String, String> map3 = this.m1;
        if (map3 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = map3.hashCode();
        }
        int i12 = (i11 + hashCode11) * 31;
        String str8 = this.n1;
        if (str8 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str8.hashCode();
        }
        int i13 = (i12 + hashCode12) * 31;
        String str9 = this.o1;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return i13 + i;
    }

    @NotNull
    public final String k() {
        return this.X;
    }

    @Nullable
    public final String m() {
        return this.e1;
    }

    @Nullable
    public final String n() {
        return this.c1;
    }

    @NotNull
    public final String o() {
        return this.Y0;
    }

    @Nullable
    public final String q() {
        return this.h1;
    }

    @NotNull
    public final String s() {
        return this.b1;
    }

    @Nullable
    public final Map<String, Integer> t() {
        return this.k1;
    }

    @NotNull
    public String toString() {
        String jSONObject = C().toString();
        C6562gT0.o(jSONObject, "claimsJsonObject.toString()");
        return jSONObject;
    }

    @Nullable
    public final String u() {
        return this.j1;
    }

    @Nullable
    public final Set<String> v() {
        return this.i1;
    }

    @Nullable
    public final String w() {
        return this.n1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        C6562gT0.p(parcel, "dest");
        parcel.writeString(this.X);
        parcel.writeString(this.Y);
        parcel.writeString(this.Z);
        parcel.writeString(this.Y0);
        parcel.writeLong(this.Z0);
        parcel.writeLong(this.a1);
        parcel.writeString(this.b1);
        parcel.writeString(this.c1);
        parcel.writeString(this.d1);
        parcel.writeString(this.e1);
        parcel.writeString(this.f1);
        parcel.writeString(this.g1);
        parcel.writeString(this.h1);
        if (this.i1 == null) {
            parcel.writeStringList(null);
        } else {
            parcel.writeStringList(new ArrayList(this.i1));
        }
        parcel.writeString(this.j1);
        parcel.writeMap(this.k1);
        parcel.writeMap(this.l1);
        parcel.writeMap(this.m1);
        parcel.writeString(this.n1);
        parcel.writeString(this.o1);
    }

    @Nullable
    public final Map<String, String> x() {
        return this.l1;
    }

    @Nullable
    public final String y() {
        return this.o1;
    }

    @Nullable
    public final Map<String, String> z() {
        return this.m1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC5056aJ2(otherwise = 2)
    @InterfaceC8289nW0
    public C2383l(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, long j2, @NotNull String str5, @Nullable String str6) {
        this(str, str2, str3, str4, j, j2, str5, str6, null, null, null, null, null, null, null, null, null, null, null, null, 1048320, null);
        C6562gT0.p(str, r1);
        C6562gT0.p(str2, s1);
        C6562gT0.p(str3, t1);
        C6562gT0.p(str4, "nonce");
        C6562gT0.p(str5, x1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC5056aJ2(otherwise = 2)
    @InterfaceC8289nW0
    public C2383l(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, long j2, @NotNull String str5, @Nullable String str6, @Nullable String str7) {
        this(str, str2, str3, str4, j, j2, str5, str6, str7, null, null, null, null, null, null, null, null, null, null, null, 1048064, null);
        C6562gT0.p(str, r1);
        C6562gT0.p(str2, s1);
        C6562gT0.p(str3, t1);
        C6562gT0.p(str4, "nonce");
        C6562gT0.p(str5, x1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC5056aJ2(otherwise = 2)
    @InterfaceC8289nW0
    public C2383l(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, long j2, @NotNull String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this(str, str2, str3, str4, j, j2, str5, str6, str7, str8, null, null, null, null, null, null, null, null, null, null, 1047552, null);
        C6562gT0.p(str, r1);
        C6562gT0.p(str2, s1);
        C6562gT0.p(str3, t1);
        C6562gT0.p(str4, "nonce");
        C6562gT0.p(str5, x1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC5056aJ2(otherwise = 2)
    @InterfaceC8289nW0
    public C2383l(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, long j2, @NotNull String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        this(str, str2, str3, str4, j, j2, str5, str6, str7, str8, str9, null, null, null, null, null, null, null, null, null, 1046528, null);
        C6562gT0.p(str, r1);
        C6562gT0.p(str2, s1);
        C6562gT0.p(str3, t1);
        C6562gT0.p(str4, "nonce");
        C6562gT0.p(str5, x1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC5056aJ2(otherwise = 2)
    @InterfaceC8289nW0
    public C2383l(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, long j2, @NotNull String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
        this(str, str2, str3, str4, j, j2, str5, str6, str7, str8, str9, str10, null, null, null, null, null, null, null, null, 1044480, null);
        C6562gT0.p(str, r1);
        C6562gT0.p(str2, s1);
        C6562gT0.p(str3, t1);
        C6562gT0.p(str4, "nonce");
        C6562gT0.p(str5, x1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC5056aJ2(otherwise = 2)
    @InterfaceC8289nW0
    public C2383l(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, long j2, @NotNull String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11) {
        this(str, str2, str3, str4, j, j2, str5, str6, str7, str8, str9, str10, str11, null, null, null, null, null, null, null, 1040384, null);
        C6562gT0.p(str, r1);
        C6562gT0.p(str2, s1);
        C6562gT0.p(str3, t1);
        C6562gT0.p(str4, "nonce");
        C6562gT0.p(str5, x1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC5056aJ2(otherwise = 2)
    @InterfaceC8289nW0
    public C2383l(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, long j2, @NotNull String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Collection<String> collection) {
        this(str, str2, str3, str4, j, j2, str5, str6, str7, str8, str9, str10, str11, collection, null, null, null, null, null, null, 1032192, null);
        C6562gT0.p(str, r1);
        C6562gT0.p(str2, s1);
        C6562gT0.p(str3, t1);
        C6562gT0.p(str4, "nonce");
        C6562gT0.p(str5, x1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC5056aJ2(otherwise = 2)
    @InterfaceC8289nW0
    public C2383l(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, long j2, @NotNull String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Collection<String> collection, @Nullable String str12) {
        this(str, str2, str3, str4, j, j2, str5, str6, str7, str8, str9, str10, str11, collection, str12, null, null, null, null, null, 1015808, null);
        C6562gT0.p(str, r1);
        C6562gT0.p(str2, s1);
        C6562gT0.p(str3, t1);
        C6562gT0.p(str4, "nonce");
        C6562gT0.p(str5, x1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC5056aJ2(otherwise = 2)
    @InterfaceC8289nW0
    public C2383l(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, long j2, @NotNull String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Collection<String> collection, @Nullable String str12, @Nullable Map<String, Integer> map) {
        this(str, str2, str3, str4, j, j2, str5, str6, str7, str8, str9, str10, str11, collection, str12, map, null, null, null, null, 983040, null);
        C6562gT0.p(str, r1);
        C6562gT0.p(str2, s1);
        C6562gT0.p(str3, t1);
        C6562gT0.p(str4, "nonce");
        C6562gT0.p(str5, x1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC5056aJ2(otherwise = 2)
    @InterfaceC8289nW0
    public C2383l(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, long j2, @NotNull String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Collection<String> collection, @Nullable String str12, @Nullable Map<String, Integer> map, @Nullable Map<String, String> map2) {
        this(str, str2, str3, str4, j, j2, str5, str6, str7, str8, str9, str10, str11, collection, str12, map, map2, null, null, null, 917504, null);
        C6562gT0.p(str, r1);
        C6562gT0.p(str2, s1);
        C6562gT0.p(str3, t1);
        C6562gT0.p(str4, "nonce");
        C6562gT0.p(str5, x1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC5056aJ2(otherwise = 2)
    @InterfaceC8289nW0
    public C2383l(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, long j2, @NotNull String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Collection<String> collection, @Nullable String str12, @Nullable Map<String, Integer> map, @Nullable Map<String, String> map2, @Nullable Map<String, String> map3) {
        this(str, str2, str3, str4, j, j2, str5, str6, str7, str8, str9, str10, str11, collection, str12, map, map2, map3, null, null, 786432, null);
        C6562gT0.p(str, r1);
        C6562gT0.p(str2, s1);
        C6562gT0.p(str3, t1);
        C6562gT0.p(str4, "nonce");
        C6562gT0.p(str5, x1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC5056aJ2(otherwise = 2)
    @InterfaceC8289nW0
    public C2383l(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, long j2, @NotNull String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Collection<String> collection, @Nullable String str12, @Nullable Map<String, Integer> map, @Nullable Map<String, String> map2, @Nullable Map<String, String> map3, @Nullable String str13) {
        this(str, str2, str3, str4, j, j2, str5, str6, str7, str8, str9, str10, str11, collection, str12, map, map2, map3, str13, null, 524288, null);
        C6562gT0.p(str, r1);
        C6562gT0.p(str2, s1);
        C6562gT0.p(str3, t1);
        C6562gT0.p(str4, "nonce");
        C6562gT0.p(str5, x1);
    }

    @InterfaceC8289nW0
    public C2383l(@NotNull String str, @NotNull String str2) {
        Set<String> unmodifiableSet;
        Map<String, Integer> unmodifiableMap;
        Map<String, String> unmodifiableMap2;
        C6562gT0.p(str, "encodedClaims");
        C6562gT0.p(str2, "expectedNonce");
        com.facebook.internal.m0 m0Var = com.facebook.internal.m0.a;
        com.facebook.internal.m0.p(str, "encodedClaims");
        byte[] decode = Base64.decode(str, 8);
        C6562gT0.o(decode, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decode, HB.b));
        if (A(jSONObject, str2)) {
            String string = jSONObject.getString(r1);
            C6562gT0.o(string, "jsonObj.getString(JSON_KEY_JIT)");
            this.X = string;
            String string2 = jSONObject.getString(s1);
            C6562gT0.o(string2, "jsonObj.getString(JSON_KEY_ISS)");
            this.Y = string2;
            String string3 = jSONObject.getString(t1);
            C6562gT0.o(string3, "jsonObj.getString(JSON_KEY_AUD)");
            this.Z = string3;
            String string4 = jSONObject.getString("nonce");
            C6562gT0.o(string4, "jsonObj.getString(JSON_KEY_NONCE)");
            this.Y0 = string4;
            this.Z0 = jSONObject.getLong(v1);
            this.a1 = jSONObject.getLong(w1);
            String string5 = jSONObject.getString(x1);
            C6562gT0.o(string5, "jsonObj.getString(JSON_KEY_SUB)");
            this.b1 = string5;
            b bVar = p1;
            this.c1 = bVar.b(jSONObject, "name");
            this.d1 = bVar.b(jSONObject, z1);
            this.e1 = bVar.b(jSONObject, "middle_name");
            this.f1 = bVar.b(jSONObject, B1);
            this.g1 = bVar.b(jSONObject, "email");
            this.h1 = bVar.b(jSONObject, "picture");
            JSONArray optJSONArray = jSONObject.optJSONArray(E1);
            Map<String, String> map = null;
            if (optJSONArray == null) {
                unmodifiableSet = null;
            } else {
                com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                unmodifiableSet = Collections.unmodifiableSet(com.facebook.internal.l0.i0(optJSONArray));
            }
            this.i1 = unmodifiableSet;
            this.j1 = bVar.b(jSONObject, F1);
            JSONObject optJSONObject = jSONObject.optJSONObject(G1);
            if (optJSONObject == null) {
                unmodifiableMap = null;
            } else {
                com.facebook.internal.l0 l0Var2 = com.facebook.internal.l0.a;
                unmodifiableMap = Collections.unmodifiableMap(com.facebook.internal.l0.o(optJSONObject));
            }
            this.k1 = unmodifiableMap;
            JSONObject optJSONObject2 = jSONObject.optJSONObject(H1);
            if (optJSONObject2 == null) {
                unmodifiableMap2 = null;
            } else {
                com.facebook.internal.l0 l0Var3 = com.facebook.internal.l0.a;
                unmodifiableMap2 = Collections.unmodifiableMap(com.facebook.internal.l0.p(optJSONObject2));
            }
            this.l1 = unmodifiableMap2;
            JSONObject optJSONObject3 = jSONObject.optJSONObject(K1);
            if (optJSONObject3 != null) {
                com.facebook.internal.l0 l0Var4 = com.facebook.internal.l0.a;
                map = Collections.unmodifiableMap(com.facebook.internal.l0.p(optJSONObject3));
            }
            this.m1 = map;
            this.n1 = bVar.b(jSONObject, I1);
            this.o1 = bVar.b(jSONObject, J1);
            return;
        }
        throw new IllegalArgumentException("Invalid claims");
    }

    public /* synthetic */ C2383l(String str, String str2, String str3, String str4, long j, long j2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Collection collection, String str12, Map map, Map map2, Map map3, String str13, String str14, int i, C9516sY c9516sY) {
        this(str, str2, str3, str4, j, j2, str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : str11, (i & 8192) != 0 ? null : collection, (i & 16384) != 0 ? null : str12, (32768 & i) != 0 ? null : map, (65536 & i) != 0 ? null : map2, (131072 & i) != 0 ? null : map3, (262144 & i) != 0 ? null : str13, (i & 524288) != 0 ? null : str14);
    }

    @InterfaceC5056aJ2(otherwise = 2)
    @InterfaceC8289nW0
    public C2383l(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, long j2, @NotNull String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Collection<String> collection, @Nullable String str12, @Nullable Map<String, Integer> map, @Nullable Map<String, String> map2, @Nullable Map<String, String> map3, @Nullable String str13, @Nullable String str14) {
        C6562gT0.p(str, r1);
        C6562gT0.p(str2, s1);
        C6562gT0.p(str3, t1);
        C6562gT0.p(str4, "nonce");
        C6562gT0.p(str5, x1);
        com.facebook.internal.m0 m0Var = com.facebook.internal.m0.a;
        com.facebook.internal.m0.p(str, r1);
        com.facebook.internal.m0.p(str2, s1);
        com.facebook.internal.m0.p(str3, t1);
        com.facebook.internal.m0.p(str4, "nonce");
        com.facebook.internal.m0.p(str5, x1);
        this.X = str;
        this.Y = str2;
        this.Z = str3;
        this.Y0 = str4;
        this.Z0 = j;
        this.a1 = j2;
        this.b1 = str5;
        this.c1 = str6;
        this.d1 = str7;
        this.e1 = str8;
        this.f1 = str9;
        this.g1 = str10;
        this.h1 = str11;
        this.i1 = collection != null ? Collections.unmodifiableSet(new HashSet(collection)) : null;
        this.j1 = str12;
        this.k1 = map != null ? Collections.unmodifiableMap(new HashMap(map)) : null;
        this.l1 = map2 != null ? Collections.unmodifiableMap(new HashMap(map2)) : null;
        this.m1 = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
        this.n1 = str13;
        this.o1 = str14;
    }

    public C2383l(@NotNull Parcel parcel) {
        C6562gT0.p(parcel, "parcel");
        String readString = parcel.readString();
        com.facebook.internal.m0 m0Var = com.facebook.internal.m0.a;
        this.X = com.facebook.internal.m0.t(readString, r1);
        this.Y = com.facebook.internal.m0.t(parcel.readString(), s1);
        this.Z = com.facebook.internal.m0.t(parcel.readString(), t1);
        this.Y0 = com.facebook.internal.m0.t(parcel.readString(), "nonce");
        this.Z0 = parcel.readLong();
        this.a1 = parcel.readLong();
        this.b1 = com.facebook.internal.m0.t(parcel.readString(), x1);
        this.c1 = parcel.readString();
        this.d1 = parcel.readString();
        this.e1 = parcel.readString();
        this.f1 = parcel.readString();
        this.g1 = parcel.readString();
        this.h1 = parcel.readString();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        this.i1 = createStringArrayList != null ? Collections.unmodifiableSet(new HashSet(createStringArrayList)) : null;
        this.j1 = parcel.readString();
        HashMap readHashMap = parcel.readHashMap(C6797hR0.a.getClass().getClassLoader());
        readHashMap = readHashMap == null ? null : readHashMap;
        this.k1 = readHashMap != null ? Collections.unmodifiableMap(readHashMap) : null;
        C8319ne2 c8319ne2 = C8319ne2.a;
        HashMap readHashMap2 = parcel.readHashMap(c8319ne2.getClass().getClassLoader());
        readHashMap2 = readHashMap2 == null ? null : readHashMap2;
        this.l1 = readHashMap2 != null ? Collections.unmodifiableMap(readHashMap2) : null;
        HashMap readHashMap3 = parcel.readHashMap(c8319ne2.getClass().getClassLoader());
        readHashMap3 = readHashMap3 == null ? null : readHashMap3;
        this.m1 = readHashMap3 != null ? Collections.unmodifiableMap(readHashMap3) : null;
        this.n1 = parcel.readString();
        this.o1 = parcel.readString();
    }
}
