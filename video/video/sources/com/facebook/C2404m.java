package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.nio.charset.Charset;
import o.C6562gT0;
import o.C9516sY;
import o.HB;
import o.InterfaceC5056aJ2;
import o.InterfaceC7058iW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2404m implements Parcelable {
    @NotNull
    public final String X;
    @NotNull
    public final String Y;
    @NotNull
    public final String Z;
    @NotNull
    public static final b Y0 = new b(null);
    @InterfaceC7058iW0
    @NotNull
    public static final Parcelable.Creator<C2404m> CREATOR = new a();

    /* renamed from: com.facebook.m$a */
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<C2404m> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public C2404m createFromParcel(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "source");
            return new C2404m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public C2404m[] newArray(int i) {
            return new C2404m[i];
        }
    }

    /* renamed from: com.facebook.m$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        public b() {
        }
    }

    public C2404m(@NotNull String str) {
        C6562gT0.p(str, "encodedHeaderString");
        if (d(str)) {
            byte[] decode = Base64.decode(str, 0);
            C6562gT0.o(decode, "decodedBytes");
            JSONObject jSONObject = new JSONObject(new String(decode, HB.b));
            String string = jSONObject.getString("alg");
            C6562gT0.o(string, "jsonObj.getString(\"alg\")");
            this.X = string;
            String string2 = jSONObject.getString("typ");
            C6562gT0.o(string2, "jsonObj.getString(\"typ\")");
            this.Y = string2;
            String string3 = jSONObject.getString("kid");
            C6562gT0.o(string3, "jsonObj.getString(\"kid\")");
            this.Z = string3;
            return;
        }
        throw new IllegalArgumentException("Invalid Header");
    }

    @NotNull
    public final String a() {
        return this.X;
    }

    @NotNull
    public final String b() {
        return this.Z;
    }

    @NotNull
    public final String c() {
        return this.Y;
    }

    public final boolean d(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        com.facebook.internal.m0 m0Var = com.facebook.internal.m0.a;
        com.facebook.internal.m0.p(str, "encodedHeaderString");
        byte[] decode = Base64.decode(str, 0);
        C6562gT0.o(decode, "decodedBytes");
        try {
            JSONObject jSONObject = new JSONObject(new String(decode, HB.b));
            String optString = jSONObject.optString("alg");
            C6562gT0.o(optString, "alg");
            if (optString.length() > 0 && C6562gT0.g(optString, "RS256")) {
                z = true;
            } else {
                z = false;
            }
            String optString2 = jSONObject.optString("kid");
            C6562gT0.o(optString2, "jsonObj.optString(\"kid\")");
            if (optString2.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String optString3 = jSONObject.optString("typ");
            C6562gT0.o(optString3, "jsonObj.optString(\"typ\")");
            if (optString3.length() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
        } catch (JSONException unused) {
        }
        if (!z || !z2 || !z3) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @InterfaceC5056aJ2(otherwise = 2)
    @NotNull
    public final String e() {
        String c2404m = toString();
        Charset charset = HB.b;
        if (c2404m != null) {
            byte[] bytes = c2404m.getBytes(charset);
            C6562gT0.o(bytes, "(this as java.lang.String).getBytes(charset)");
            String encodeToString = Base64.encodeToString(bytes, 0);
            C6562gT0.o(encodeToString, "encodeToString(claimsJsonString.toByteArray(), Base64.DEFAULT)");
            return encodeToString;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2404m)) {
            return false;
        }
        C2404m c2404m = (C2404m) obj;
        if (C6562gT0.g(this.X, c2404m.X) && C6562gT0.g(this.Y, c2404m.Y) && C6562gT0.g(this.Z, c2404m.Z)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.X);
        jSONObject.put("typ", this.Y);
        jSONObject.put("kid", this.Z);
        return jSONObject;
    }

    public int hashCode() {
        return ((((527 + this.X.hashCode()) * 31) + this.Y.hashCode()) * 31) + this.Z.hashCode();
    }

    @NotNull
    public String toString() {
        String jSONObject = f().toString();
        C6562gT0.o(jSONObject, "headerJsonObject.toString()");
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        C6562gT0.p(parcel, "dest");
        parcel.writeString(this.X);
        parcel.writeString(this.Y);
        parcel.writeString(this.Z);
    }

    public C2404m(@NotNull Parcel parcel) {
        C6562gT0.p(parcel, "parcel");
        String readString = parcel.readString();
        com.facebook.internal.m0 m0Var = com.facebook.internal.m0.a;
        this.X = com.facebook.internal.m0.t(readString, "alg");
        this.Y = com.facebook.internal.m0.t(parcel.readString(), "typ");
        this.Z = com.facebook.internal.m0.t(parcel.readString(), "kid");
    }

    public C2404m(@NotNull JSONObject jSONObject) throws JSONException {
        C6562gT0.p(jSONObject, "jsonObject");
        String string = jSONObject.getString("alg");
        C6562gT0.o(string, "jsonObject.getString(\"alg\")");
        this.X = string;
        String string2 = jSONObject.getString("typ");
        C6562gT0.o(string2, "jsonObject.getString(\"typ\")");
        this.Y = string2;
        String string3 = jSONObject.getString("kid");
        C6562gT0.o(string3, "jsonObject.getString(\"kid\")");
        this.Z = string3;
    }

    @InterfaceC5056aJ2(otherwise = 2)
    public C2404m(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        C6562gT0.p(str, "alg");
        C6562gT0.p(str2, "typ");
        C6562gT0.p(str3, "kid");
        this.X = str;
        this.Y = str2;
        this.Z = str3;
    }
}
