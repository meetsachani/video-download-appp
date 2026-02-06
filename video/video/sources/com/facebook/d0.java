package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.facebook.C0376a;
import com.facebook.internal.l0;
import o.C6562gT0;
import o.C9516sY;
import o.InterfaceC7058iW0;
import o.InterfaceC8289nW0;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d0 implements Parcelable {
    @NotNull
    public static final String e1 = "id";
    @NotNull
    public static final String f1 = "first_name";
    @NotNull
    public static final String g1 = "middle_name";
    @NotNull
    public static final String h1 = "last_name";
    @NotNull
    public static final String i1 = "name";
    @NotNull
    public static final String j1 = "link_uri";
    @NotNull
    public static final String k1 = "picture_uri";
    @Nullable
    public final String X;
    @Nullable
    public final String Y;
    @Nullable
    public final String Y0;
    @Nullable
    public final String Z;
    @Nullable
    public final String Z0;
    @Nullable
    public final Uri a1;
    @Nullable
    public final Uri b1;
    @NotNull
    public static final b c1 = new b(null);
    public static final String d1 = d0.class.getSimpleName();
    @InterfaceC7058iW0
    @NotNull
    public static final Parcelable.Creator<d0> CREATOR = new a();

    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<d0> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public d0 createFromParcel(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "source");
            return new d0(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public d0[] newArray(int i) {
            return new d0[i];
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* loaded from: classes2.dex */
        public static final class a implements l0.a {
            @Override // com.facebook.internal.l0.a
            public void a(@Nullable JSONObject jSONObject) {
                String optString;
                Uri uri;
                Uri uri2 = null;
                if (jSONObject == null) {
                    optString = null;
                } else {
                    optString = jSONObject.optString("id");
                }
                if (optString == null) {
                    Log.w(d0.d1, "No user ID returned on Me request");
                    return;
                }
                String optString2 = jSONObject.optString("link");
                String optString3 = jSONObject.optString("profile_picture", null);
                String optString4 = jSONObject.optString(d0.f1);
                String optString5 = jSONObject.optString("middle_name");
                String optString6 = jSONObject.optString(d0.h1);
                String optString7 = jSONObject.optString("name");
                if (optString2 != null) {
                    uri = Uri.parse(optString2);
                } else {
                    uri = null;
                }
                if (optString3 != null) {
                    uri2 = Uri.parse(optString3);
                }
                d0.c1.c(new d0(optString, optString4, optString5, optString6, optString7, uri, uri2));
            }

            @Override // com.facebook.internal.l0.a
            public void b(@Nullable C2416z c2416z) {
                Log.e(d0.d1, C6562gT0.C("Got unexpected exception: ", c2416z));
            }
        }

        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        public final void a() {
            C0376a.d dVar = C0376a.g1;
            C0376a i = dVar.i();
            if (i == null) {
                return;
            }
            if (!dVar.k()) {
                c(null);
                return;
            }
            com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
            com.facebook.internal.l0.H(i.x(), new a());
        }

        @InterfaceC9511sW0
        @Nullable
        public final d0 b() {
            return f0.d.a().c();
        }

        @InterfaceC9511sW0
        public final void c(@Nullable d0 d0Var) {
            f0.d.a().g(d0Var);
        }

        public b() {
        }
    }

    public /* synthetic */ d0(Parcel parcel, C9516sY c9516sY) {
        this(parcel);
    }

    @InterfaceC9511sW0
    public static final void b() {
        c1.a();
    }

    @InterfaceC9511sW0
    @Nullable
    public static final d0 c() {
        return c1.b();
    }

    @InterfaceC9511sW0
    public static final void o(@Nullable d0 d0Var) {
        c1.c(d0Var);
    }

    @Nullable
    public final String d() {
        return this.Y;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String e() {
        return this.X;
    }

    public boolean equals(@Nullable Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        Uri uri2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        String str5 = this.X;
        if (((str5 == null && ((d0) obj).X == null) || C6562gT0.g(str5, ((d0) obj).X)) && ((((str = this.Y) == null && ((d0) obj).Y == null) || C6562gT0.g(str, ((d0) obj).Y)) && ((((str2 = this.Z) == null && ((d0) obj).Z == null) || C6562gT0.g(str2, ((d0) obj).Z)) && ((((str3 = this.Y0) == null && ((d0) obj).Y0 == null) || C6562gT0.g(str3, ((d0) obj).Y0)) && ((((str4 = this.Z0) == null && ((d0) obj).Z0 == null) || C6562gT0.g(str4, ((d0) obj).Z0)) && ((((uri = this.a1) == null && ((d0) obj).a1 == null) || C6562gT0.g(uri, ((d0) obj).a1)) && (((uri2 = this.b1) == null && ((d0) obj).b1 == null) || C6562gT0.g(uri2, ((d0) obj).b1)))))))) {
            return true;
        }
        return false;
    }

    @Nullable
    public final String f() {
        return this.Y0;
    }

    @Nullable
    public final Uri g() {
        return this.a1;
    }

    @Nullable
    public final String h() {
        return this.Z;
    }

    public int hashCode() {
        int i;
        String str = this.X;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i2 = 527 + i;
        String str2 = this.Y;
        if (str2 != null) {
            i2 = (i2 * 31) + str2.hashCode();
        }
        String str3 = this.Z;
        if (str3 != null) {
            i2 = (i2 * 31) + str3.hashCode();
        }
        String str4 = this.Y0;
        if (str4 != null) {
            i2 = (i2 * 31) + str4.hashCode();
        }
        String str5 = this.Z0;
        if (str5 != null) {
            i2 = (i2 * 31) + str5.hashCode();
        }
        Uri uri = this.a1;
        if (uri != null) {
            i2 = (i2 * 31) + uri.hashCode();
        }
        Uri uri2 = this.b1;
        if (uri2 != null) {
            return (i2 * 31) + uri2.hashCode();
        }
        return i2;
    }

    @Nullable
    public final String k() {
        return this.Z0;
    }

    @Nullable
    public final Uri m() {
        return this.b1;
    }

    @NotNull
    public final Uri n(int i, int i2) {
        String str;
        Uri uri = this.b1;
        if (uri != null) {
            return uri;
        }
        C0376a.d dVar = C0376a.g1;
        if (dVar.k()) {
            C0376a i3 = dVar.i();
            if (i3 == null) {
                str = null;
            } else {
                str = i3.x();
            }
        } else {
            str = "";
        }
        return com.facebook.internal.M.f.b(this.X, i, i2, str);
    }

    @Nullable
    public final JSONObject q() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.X);
            jSONObject.put(f1, this.Y);
            jSONObject.put("middle_name", this.Z);
            jSONObject.put(h1, this.Y0);
            jSONObject.put("name", this.Z0);
            Uri uri = this.a1;
            if (uri != null) {
                jSONObject.put(j1, uri.toString());
            }
            Uri uri2 = this.b1;
            if (uri2 != null) {
                jSONObject.put(k1, uri2.toString());
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        String uri;
        C6562gT0.p(parcel, "dest");
        parcel.writeString(this.X);
        parcel.writeString(this.Y);
        parcel.writeString(this.Z);
        parcel.writeString(this.Y0);
        parcel.writeString(this.Z0);
        Uri uri2 = this.a1;
        String str = null;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        parcel.writeString(uri);
        Uri uri3 = this.b1;
        if (uri3 != null) {
            str = uri3.toString();
        }
        parcel.writeString(str);
    }

    @InterfaceC8289nW0
    public d0(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Uri uri) {
        this(str, str2, str3, str4, str5, uri, null, 64, null);
    }

    public /* synthetic */ d0(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2, int i, C9516sY c9516sY) {
        this(str, str2, str3, str4, str5, uri, (i & 64) != 0 ? null : uri2);
    }

    @InterfaceC8289nW0
    public d0(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Uri uri, @Nullable Uri uri2) {
        com.facebook.internal.m0 m0Var = com.facebook.internal.m0.a;
        com.facebook.internal.m0.t(str, "id");
        this.X = str;
        this.Y = str2;
        this.Z = str3;
        this.Y0 = str4;
        this.Z0 = str5;
        this.a1 = uri;
        this.b1 = uri2;
    }

    public d0(@NotNull JSONObject jSONObject) {
        C6562gT0.p(jSONObject, "jsonObject");
        this.X = jSONObject.optString("id", null);
        this.Y = jSONObject.optString(f1, null);
        this.Z = jSONObject.optString("middle_name", null);
        this.Y0 = jSONObject.optString(h1, null);
        this.Z0 = jSONObject.optString("name", null);
        String optString = jSONObject.optString(j1, null);
        this.a1 = optString == null ? null : Uri.parse(optString);
        String optString2 = jSONObject.optString(k1, null);
        this.b1 = optString2 != null ? Uri.parse(optString2) : null;
    }

    public d0(Parcel parcel) {
        this.X = parcel.readString();
        this.Y = parcel.readString();
        this.Z = parcel.readString();
        this.Y0 = parcel.readString();
        this.Z0 = parcel.readString();
        String readString = parcel.readString();
        this.a1 = readString == null ? null : Uri.parse(readString);
        String readString2 = parcel.readString();
        this.b1 = readString2 != null ? Uri.parse(readString2) : null;
    }
}
