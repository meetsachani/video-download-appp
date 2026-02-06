package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.C2383l;
import java.io.IOException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import o.C10763xf2;
import o.C6562gT0;
import o.C8869pu1;
import o.C9516sY;
import o.InterfaceC7058iW0;
import o.InterfaceC8289nW0;
import o.InterfaceC9511sW0;
import o.UE;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2381j implements Parcelable {
    @NotNull
    public static final String b1 = "id_token";
    @NotNull
    public static final String c1 = "token_string";
    @NotNull
    public static final String d1 = "expected_nonce";
    @NotNull
    public static final String e1 = "header";
    @NotNull
    public static final String f1 = "claims";
    @NotNull
    public static final String g1 = "signature";
    @NotNull
    public final String X;
    @NotNull
    public final String Y;
    @NotNull
    public final C2383l Y0;
    @NotNull
    public final C2404m Z;
    @NotNull
    public final String Z0;
    @NotNull
    public static final b a1 = new b(null);
    @InterfaceC7058iW0
    @NotNull
    public static final Parcelable.Creator<C2381j> CREATOR = new a();

    /* renamed from: com.facebook.j$a */
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<C2381j> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public C2381j createFromParcel(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "source");
            return new C2381j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public C2381j[] newArray(int i) {
            return new C2381j[i];
        }
    }

    /* renamed from: com.facebook.j$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        @Nullable
        public final C2381j a() {
            return AuthenticationTokenManager.d.a().d();
        }

        @InterfaceC9511sW0
        public final void b(@Nullable C2381j c2381j) {
            AuthenticationTokenManager.d.a().h(c2381j);
        }

        public b() {
        }
    }

    @InterfaceC8289nW0
    public C2381j(@NotNull String str, @NotNull String str2) {
        C6562gT0.p(str, "token");
        C6562gT0.p(str2, "expectedNonce");
        com.facebook.internal.m0 m0Var = com.facebook.internal.m0.a;
        com.facebook.internal.m0.p(str, "token");
        com.facebook.internal.m0.p(str2, "expectedNonce");
        List o5 = C10763xf2.o5(str, new String[]{UE.h}, false, 0, 6, null);
        if (o5.size() == 3) {
            String str3 = (String) o5.get(0);
            String str4 = (String) o5.get(1);
            String str5 = (String) o5.get(2);
            this.X = str;
            this.Y = str2;
            C2404m c2404m = new C2404m(str3);
            this.Z = c2404m;
            this.Y0 = new C2383l(str4, str2);
            if (g(str3, str4, str5, c2404m.b())) {
                this.Z0 = str5;
                return;
            }
            throw new IllegalArgumentException("Invalid Signature");
        }
        throw new IllegalArgumentException("Invalid IdToken string");
    }

    @InterfaceC9511sW0
    @Nullable
    public static final C2381j b() {
        return a1.a();
    }

    @InterfaceC9511sW0
    public static final void h(@Nullable C2381j c2381j) {
        a1.b(c2381j);
    }

    @NotNull
    public final C2383l a() {
        return this.Y0;
    }

    @NotNull
    public final String c() {
        return this.Y;
    }

    @NotNull
    public final C2404m d() {
        return this.Z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final String e() {
        return this.Z0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2381j)) {
            return false;
        }
        C2381j c2381j = (C2381j) obj;
        if (C6562gT0.g(this.X, c2381j.X) && C6562gT0.g(this.Y, c2381j.Y) && C6562gT0.g(this.Z, c2381j.Z) && C6562gT0.g(this.Y0, c2381j.Y0) && C6562gT0.g(this.Z0, c2381j.Z0)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String f() {
        return this.X;
    }

    public final boolean g(String str, String str2, String str3, String str4) {
        try {
            C8869pu1 c8869pu1 = C8869pu1.a;
            String d = C8869pu1.d(str4);
            if (d == null) {
                return false;
            }
            PublicKey c = C8869pu1.c(d);
            return C8869pu1.f(c, str + '.' + str2, str3);
        } catch (IOException | InvalidKeySpecException unused) {
            return false;
        }
    }

    public int hashCode() {
        return ((((((((527 + this.X.hashCode()) * 31) + this.Y.hashCode()) * 31) + this.Z.hashCode()) * 31) + this.Y0.hashCode()) * 31) + this.Z0.hashCode();
    }

    @NotNull
    public final JSONObject k() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(c1, this.X);
        jSONObject.put(d1, this.Y);
        jSONObject.put(e1, this.Z.f());
        jSONObject.put(f1, this.Y0.C());
        jSONObject.put(g1, this.Z0);
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        C6562gT0.p(parcel, "dest");
        parcel.writeString(this.X);
        parcel.writeString(this.Y);
        parcel.writeParcelable(this.Z, i);
        parcel.writeParcelable(this.Y0, i);
        parcel.writeString(this.Z0);
    }

    public C2381j(@NotNull Parcel parcel) {
        C6562gT0.p(parcel, "parcel");
        String readString = parcel.readString();
        com.facebook.internal.m0 m0Var = com.facebook.internal.m0.a;
        this.X = com.facebook.internal.m0.t(readString, "token");
        this.Y = com.facebook.internal.m0.t(parcel.readString(), "expectedNonce");
        Parcelable readParcelable = parcel.readParcelable(C2404m.class.getClassLoader());
        if (readParcelable != null) {
            this.Z = (C2404m) readParcelable;
            Parcelable readParcelable2 = parcel.readParcelable(C2383l.class.getClassLoader());
            if (readParcelable2 != null) {
                this.Y0 = (C2383l) readParcelable2;
                this.Z0 = com.facebook.internal.m0.t(parcel.readString(), g1);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C2381j(@NotNull JSONObject jSONObject) throws JSONException {
        C6562gT0.p(jSONObject, "jsonObject");
        String string = jSONObject.getString(c1);
        C6562gT0.o(string, "jsonObject.getString(TOKEN_STRING_KEY)");
        this.X = string;
        String string2 = jSONObject.getString(d1);
        C6562gT0.o(string2, "jsonObject.getString(EXPECTED_NONCE_KEY)");
        this.Y = string2;
        String string3 = jSONObject.getString(g1);
        C6562gT0.o(string3, "jsonObject.getString(SIGNATURE_KEY)");
        this.Z0 = string3;
        JSONObject jSONObject2 = jSONObject.getJSONObject(e1);
        JSONObject jSONObject3 = jSONObject.getJSONObject(f1);
        C6562gT0.o(jSONObject2, "headerJSONObject");
        this.Z = new C2404m(jSONObject2);
        C2383l.b bVar = C2383l.p1;
        C6562gT0.o(jSONObject3, "claimsJSONObject");
        this.Y0 = bVar.a(jSONObject3);
    }
}
