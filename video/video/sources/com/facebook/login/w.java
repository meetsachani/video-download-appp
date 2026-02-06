package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.facebook.C0376a;
import com.facebook.C2381j;
import com.facebook.C2416z;
import com.facebook.CustomTabMainActivity;
import com.facebook.common.b;
import com.facebook.internal.C2361f;
import com.facebook.internal.l0;
import com.facebook.internal.m0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import o.ActivityC4864Yy0;
import o.C4820Ym;
import o.C6562gT0;
import o.C8926q81;
import o.C9516sY;
import o.HT1;
import o.I3;
import o.InterfaceC7058iW0;
import o.InterfaceC8289nW0;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@HT1({HT1.a.Y})
/* loaded from: classes2.dex */
public class w implements Parcelable {
    @Nullable
    public I[] X;
    public int Y;
    @Nullable
    public d Y0;
    @Nullable
    public Fragment Z;
    @Nullable
    public a Z0;
    public boolean a1;
    @Nullable
    public e b1;
    @Nullable
    public Map<String, String> c1;
    @Nullable
    public Map<String, String> d1;
    @Nullable
    public C e1;
    public int f1;
    public int g1;
    @NotNull
    public static final c h1 = new c(null);
    @InterfaceC7058iW0
    @NotNull
    public static final Parcelable.Creator<w> CREATOR = new b();

    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void b();
    }

    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<w> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public w createFromParcel(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "source");
            return new w(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public w[] newArray(int i) {
            return new w[i];
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        @NotNull
        public final String a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("init", System.currentTimeMillis());
            } catch (JSONException unused) {
            }
            String jSONObject2 = jSONObject.toString();
            C6562gT0.o(jSONObject2, "e2e.toString()");
            return jSONObject2;
        }

        @InterfaceC9511sW0
        public final int b() {
            return C2361f.c.Login.g();
        }

        public c() {
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a(@NotNull f fVar);
    }

    /* loaded from: classes2.dex */
    public static final class e implements Parcelable {
        @NotNull
        public final v X;
        @NotNull
        public Set<String> Y;
        @NotNull
        public final String Y0;
        @NotNull
        public final EnumC2389f Z;
        @NotNull
        public String Z0;
        public boolean a1;
        @Nullable
        public String b1;
        @NotNull
        public String c1;
        @Nullable
        public String d1;
        @Nullable
        public String e1;
        public boolean f1;
        @NotNull
        public final L g1;
        public boolean h1;
        public boolean i1;
        @NotNull
        public final String j1;
        @Nullable
        public final String k1;
        @Nullable
        public final String l1;
        @Nullable
        public final EnumC2385b m1;
        @NotNull
        public static final b n1 = new b(null);
        @InterfaceC7058iW0
        @NotNull
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* renamed from: a */
            public e createFromParcel(@NotNull Parcel parcel) {
                C6562gT0.p(parcel, "source");
                return new e(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* renamed from: b */
            public e[] newArray(int i) {
                return new e[i];
            }
        }

        /* loaded from: classes2.dex */
        public static final class b {
            public /* synthetic */ b(C9516sY c9516sY) {
                this();
            }

            public b() {
            }
        }

        public /* synthetic */ e(Parcel parcel, C9516sY c9516sY) {
            this(parcel);
        }

        public final void A(@Nullable String str) {
            this.d1 = str;
        }

        public final void B(@Nullable String str) {
            this.b1 = str;
        }

        public final void C(boolean z) {
            this.h1 = z;
        }

        public final void D(@Nullable String str) {
            this.e1 = str;
        }

        public final void E(@NotNull Set<String> set) {
            C6562gT0.p(set, "<set-?>");
            this.Y = set;
        }

        public final void I(boolean z) {
            this.a1 = z;
        }

        public final void J(boolean z) {
            this.f1 = z;
        }

        public final void K(boolean z) {
            this.i1 = z;
        }

        public final boolean L() {
            return this.i1;
        }

        @NotNull
        public final String a() {
            return this.Y0;
        }

        @NotNull
        public final String b() {
            return this.Z0;
        }

        @NotNull
        public final String c() {
            return this.c1;
        }

        @Nullable
        public final String d() {
            return this.l1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Nullable
        public final EnumC2385b e() {
            return this.m1;
        }

        @Nullable
        public final String f() {
            return this.k1;
        }

        @NotNull
        public final EnumC2389f g() {
            return this.Z;
        }

        @Nullable
        public final String h() {
            return this.d1;
        }

        @Nullable
        public final String k() {
            return this.b1;
        }

        @NotNull
        public final v m() {
            return this.X;
        }

        @NotNull
        public final L n() {
            return this.g1;
        }

        @Nullable
        public final String o() {
            return this.e1;
        }

        @NotNull
        public final String q() {
            return this.j1;
        }

        @NotNull
        public final Set<String> s() {
            return this.Y;
        }

        public final boolean t() {
            return this.f1;
        }

        public final boolean u() {
            for (String str : this.Y) {
                if (G.j.h(str)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean v() {
            return this.h1;
        }

        public final boolean w() {
            if (this.g1 == L.INSTAGRAM) {
                return true;
            }
            return false;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            String name;
            C6562gT0.p(parcel, "dest");
            parcel.writeString(this.X.name());
            parcel.writeStringList(new ArrayList(this.Y));
            parcel.writeString(this.Z.name());
            parcel.writeString(this.Y0);
            parcel.writeString(this.Z0);
            parcel.writeByte(this.a1 ? (byte) 1 : (byte) 0);
            parcel.writeString(this.b1);
            parcel.writeString(this.c1);
            parcel.writeString(this.d1);
            parcel.writeString(this.e1);
            parcel.writeByte(this.f1 ? (byte) 1 : (byte) 0);
            parcel.writeString(this.g1.name());
            parcel.writeByte(this.h1 ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.i1 ? (byte) 1 : (byte) 0);
            parcel.writeString(this.j1);
            parcel.writeString(this.k1);
            parcel.writeString(this.l1);
            EnumC2385b enumC2385b = this.m1;
            if (enumC2385b == null) {
                name = null;
            } else {
                name = enumC2385b.name();
            }
            parcel.writeString(name);
        }

        public final boolean x() {
            return this.a1;
        }

        public final void y(@NotNull String str) {
            C6562gT0.p(str, "<set-?>");
            this.Z0 = str;
        }

        public final void z(@NotNull String str) {
            C6562gT0.p(str, "<set-?>");
            this.c1 = str;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @InterfaceC8289nW0
        public e(@NotNull v vVar, @Nullable Set<String> set, @NotNull EnumC2389f enumC2389f, @NotNull String str, @NotNull String str2, @NotNull String str3) {
            this(vVar, set, enumC2389f, str, str2, str3, null, null, null, null, null, 1984, null);
            C6562gT0.p(vVar, "loginBehavior");
            C6562gT0.p(enumC2389f, "defaultAudience");
            C6562gT0.p(str, "authType");
            C6562gT0.p(str2, "applicationId");
            C6562gT0.p(str3, "authId");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @InterfaceC8289nW0
        public e(@NotNull v vVar, @Nullable Set<String> set, @NotNull EnumC2389f enumC2389f, @NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable L l) {
            this(vVar, set, enumC2389f, str, str2, str3, l, null, null, null, null, 1920, null);
            C6562gT0.p(vVar, "loginBehavior");
            C6562gT0.p(enumC2389f, "defaultAudience");
            C6562gT0.p(str, "authType");
            C6562gT0.p(str2, "applicationId");
            C6562gT0.p(str3, "authId");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @InterfaceC8289nW0
        public e(@NotNull v vVar, @Nullable Set<String> set, @NotNull EnumC2389f enumC2389f, @NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable L l, @Nullable String str4) {
            this(vVar, set, enumC2389f, str, str2, str3, l, str4, null, null, null, C4820Ym.b.f, null);
            C6562gT0.p(vVar, "loginBehavior");
            C6562gT0.p(enumC2389f, "defaultAudience");
            C6562gT0.p(str, "authType");
            C6562gT0.p(str2, "applicationId");
            C6562gT0.p(str3, "authId");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @InterfaceC8289nW0
        public e(@NotNull v vVar, @Nullable Set<String> set, @NotNull EnumC2389f enumC2389f, @NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable L l, @Nullable String str4, @Nullable String str5) {
            this(vVar, set, enumC2389f, str, str2, str3, l, str4, str5, null, null, I3.g, null);
            C6562gT0.p(vVar, "loginBehavior");
            C6562gT0.p(enumC2389f, "defaultAudience");
            C6562gT0.p(str, "authType");
            C6562gT0.p(str2, "applicationId");
            C6562gT0.p(str3, "authId");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @InterfaceC8289nW0
        public e(@NotNull v vVar, @Nullable Set<String> set, @NotNull EnumC2389f enumC2389f, @NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable L l, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
            this(vVar, set, enumC2389f, str, str2, str3, l, str4, str5, str6, null, 1024, null);
            C6562gT0.p(vVar, "loginBehavior");
            C6562gT0.p(enumC2389f, "defaultAudience");
            C6562gT0.p(str, "authType");
            C6562gT0.p(str2, "applicationId");
            C6562gT0.p(str3, "authId");
        }

        public /* synthetic */ e(v vVar, Set set, EnumC2389f enumC2389f, String str, String str2, String str3, L l, String str4, String str5, String str6, EnumC2385b enumC2385b, int i, C9516sY c9516sY) {
            EnumC2385b enumC2385b2;
            e eVar;
            v vVar2;
            Set set2;
            EnumC2389f enumC2389f2;
            String str7;
            String str8;
            String str9;
            L l2 = (i & 64) != 0 ? L.FACEBOOK : l;
            String str10 = (i & 128) != 0 ? null : str4;
            String str11 = (i & 256) != 0 ? null : str5;
            String str12 = (i & 512) != 0 ? null : str6;
            if ((i & 1024) != 0) {
                enumC2385b2 = null;
                vVar2 = vVar;
                set2 = set;
                enumC2389f2 = enumC2389f;
                str7 = str;
                str8 = str2;
                str9 = str3;
                eVar = this;
            } else {
                enumC2385b2 = enumC2385b;
                eVar = this;
                vVar2 = vVar;
                set2 = set;
                enumC2389f2 = enumC2389f;
                str7 = str;
                str8 = str2;
                str9 = str3;
            }
            new e(vVar2, set2, enumC2389f2, str7, str8, str9, l2, str10, str11, str12, enumC2385b2);
        }

        @InterfaceC8289nW0
        public e(@NotNull v vVar, @Nullable Set<String> set, @NotNull EnumC2389f enumC2389f, @NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable L l, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable EnumC2385b enumC2385b) {
            C6562gT0.p(vVar, "loginBehavior");
            C6562gT0.p(enumC2389f, "defaultAudience");
            C6562gT0.p(str, "authType");
            C6562gT0.p(str2, "applicationId");
            C6562gT0.p(str3, "authId");
            this.X = vVar;
            this.Y = set == null ? new HashSet<>() : set;
            this.Z = enumC2389f;
            this.c1 = str;
            this.Y0 = str2;
            this.Z0 = str3;
            this.g1 = l == null ? L.FACEBOOK : l;
            if (str4 != null && str4.length() != 0) {
                this.j1 = str4;
            } else {
                String uuid = UUID.randomUUID().toString();
                C6562gT0.o(uuid, "randomUUID().toString()");
                this.j1 = uuid;
            }
            this.k1 = str5;
            this.l1 = str6;
            this.m1 = enumC2385b;
        }

        public e(Parcel parcel) {
            EnumC2389f enumC2389f;
            L l;
            m0 m0Var = m0.a;
            this.X = v.valueOf(m0.t(parcel.readString(), "loginBehavior"));
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.Y = new HashSet(arrayList);
            String readString = parcel.readString();
            if (readString != null) {
                enumC2389f = EnumC2389f.valueOf(readString);
            } else {
                enumC2389f = EnumC2389f.NONE;
            }
            this.Z = enumC2389f;
            this.Y0 = m0.t(parcel.readString(), "applicationId");
            this.Z0 = m0.t(parcel.readString(), "authId");
            this.a1 = parcel.readByte() != 0;
            this.b1 = parcel.readString();
            this.c1 = m0.t(parcel.readString(), "authType");
            this.d1 = parcel.readString();
            this.e1 = parcel.readString();
            this.f1 = parcel.readByte() != 0;
            String readString2 = parcel.readString();
            if (readString2 != null) {
                l = L.valueOf(readString2);
            } else {
                l = L.FACEBOOK;
            }
            this.g1 = l;
            this.h1 = parcel.readByte() != 0;
            this.i1 = parcel.readByte() != 0;
            this.j1 = m0.t(parcel.readString(), "nonce");
            this.k1 = parcel.readString();
            this.l1 = parcel.readString();
            String readString3 = parcel.readString();
            this.m1 = readString3 == null ? null : EnumC2385b.valueOf(readString3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f implements Parcelable {
        @InterfaceC7058iW0
        @NotNull
        public final a X;
        @InterfaceC7058iW0
        @Nullable
        public final C0376a Y;
        @InterfaceC7058iW0
        @Nullable
        public final String Y0;
        @InterfaceC7058iW0
        @Nullable
        public final C2381j Z;
        @InterfaceC7058iW0
        @Nullable
        public final String Z0;
        @InterfaceC7058iW0
        @Nullable
        public final e a1;
        @InterfaceC7058iW0
        @Nullable
        public Map<String, String> b1;
        @InterfaceC7058iW0
        @Nullable
        public Map<String, String> c1;
        @NotNull
        public static final c d1 = new c(null);
        @InterfaceC7058iW0
        @NotNull
        public static final Parcelable.Creator<f> CREATOR = new b();

        /* loaded from: classes2.dex */
        public enum a {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");
            
            @NotNull
            public final String X;

            a(String str) {
                this.X = str;
            }

            /* renamed from: values  reason: to resolve conflict with enum method */
            public static a[] valuesCustom() {
                a[] valuesCustom = values();
                return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
            }

            @NotNull
            public final String g() {
                return this.X;
            }
        }

        /* loaded from: classes2.dex */
        public static final class b implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* renamed from: a */
            public f createFromParcel(@NotNull Parcel parcel) {
                C6562gT0.p(parcel, "source");
                return new f(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* renamed from: b */
            public f[] newArray(int i) {
                return new f[i];
            }
        }

        /* loaded from: classes2.dex */
        public static final class c {
            public /* synthetic */ c(C9516sY c9516sY) {
                this();
            }

            public static /* synthetic */ f e(c cVar, e eVar, String str, String str2, String str3, int i, Object obj) {
                if ((i & 8) != 0) {
                    str3 = null;
                }
                return cVar.d(eVar, str, str2, str3);
            }

            @InterfaceC9511sW0
            @NotNull
            public final f a(@Nullable e eVar, @Nullable String str) {
                return new f(eVar, a.CANCEL, null, str, null);
            }

            @InterfaceC9511sW0
            @NotNull
            public final f b(@Nullable e eVar, @Nullable C0376a c0376a, @Nullable C2381j c2381j) {
                return new f(eVar, a.SUCCESS, c0376a, c2381j, null, null);
            }

            @InterfaceC9511sW0
            @InterfaceC8289nW0
            @NotNull
            public final f c(@Nullable e eVar, @Nullable String str, @Nullable String str2) {
                return e(this, eVar, str, str2, null, 8, null);
            }

            @InterfaceC9511sW0
            @InterfaceC8289nW0
            @NotNull
            public final f d(@Nullable e eVar, @Nullable String str, @Nullable String str2, @Nullable String str3) {
                ArrayList arrayList = new ArrayList();
                if (str != null) {
                    arrayList.add(str);
                }
                if (str2 != null) {
                    arrayList.add(str2);
                }
                return new f(eVar, a.ERROR, null, TextUtils.join(": ", arrayList), str3);
            }

            @InterfaceC9511sW0
            @NotNull
            public final f f(@Nullable e eVar, @NotNull C0376a c0376a) {
                C6562gT0.p(c0376a, "token");
                return new f(eVar, a.SUCCESS, c0376a, null, null);
            }

            public c() {
            }
        }

        public /* synthetic */ f(Parcel parcel, C9516sY c9516sY) {
            this(parcel);
        }

        @InterfaceC9511sW0
        @NotNull
        public static final f a(@Nullable e eVar, @Nullable String str) {
            return d1.a(eVar, str);
        }

        @InterfaceC9511sW0
        @NotNull
        public static final f b(@Nullable e eVar, @Nullable C0376a c0376a, @Nullable C2381j c2381j) {
            return d1.b(eVar, c0376a, c2381j);
        }

        @InterfaceC9511sW0
        @InterfaceC8289nW0
        @NotNull
        public static final f c(@Nullable e eVar, @Nullable String str, @Nullable String str2) {
            return d1.c(eVar, str, str2);
        }

        @InterfaceC9511sW0
        @InterfaceC8289nW0
        @NotNull
        public static final f d(@Nullable e eVar, @Nullable String str, @Nullable String str2, @Nullable String str3) {
            return d1.d(eVar, str, str2, str3);
        }

        @InterfaceC9511sW0
        @NotNull
        public static final f e(@Nullable e eVar, @NotNull C0376a c0376a) {
            return d1.f(eVar, c0376a);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            C6562gT0.p(parcel, "dest");
            parcel.writeString(this.X.name());
            parcel.writeParcelable(this.Y, i);
            parcel.writeParcelable(this.Z, i);
            parcel.writeString(this.Y0);
            parcel.writeString(this.Z0);
            parcel.writeParcelable(this.a1, i);
            l0 l0Var = l0.a;
            l0.W0(parcel, this.b1);
            l0.W0(parcel, this.c1);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public f(@Nullable e eVar, @NotNull a aVar, @Nullable C0376a c0376a, @Nullable String str, @Nullable String str2) {
            this(eVar, aVar, c0376a, null, str, str2);
            C6562gT0.p(aVar, "code");
        }

        public f(@Nullable e eVar, @NotNull a aVar, @Nullable C0376a c0376a, @Nullable C2381j c2381j, @Nullable String str, @Nullable String str2) {
            C6562gT0.p(aVar, "code");
            this.a1 = eVar;
            this.Y = c0376a;
            this.Z = c2381j;
            this.Y0 = str;
            this.X = aVar;
            this.Z0 = str2;
        }

        public f(Parcel parcel) {
            String readString = parcel.readString();
            this.X = a.valueOf(readString == null ? "error" : readString);
            this.Y = (C0376a) parcel.readParcelable(C0376a.class.getClassLoader());
            this.Z = (C2381j) parcel.readParcelable(C2381j.class.getClassLoader());
            this.Y0 = parcel.readString();
            this.Z0 = parcel.readString();
            this.a1 = (e) parcel.readParcelable(e.class.getClassLoader());
            l0 l0Var = l0.a;
            this.b1 = l0.w0(parcel);
            this.c1 = l0.w0(parcel);
        }
    }

    public w(@NotNull Fragment fragment) {
        C6562gT0.p(fragment, "fragment");
        this.Y = -1;
        S(fragment);
    }

    @InterfaceC9511sW0
    public static final int A() {
        return h1.b();
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String s() {
        return h1.a();
    }

    @Nullable
    public final d B() {
        return this.Y0;
    }

    @Nullable
    public final e C() {
        return this.b1;
    }

    public final void D(String str, f fVar, Map<String, String> map) {
        E(str, fVar.X.g(), fVar.Y0, fVar.Z0, map);
    }

    public final void E(String str, String str2, String str3, String str4, Map<String, String> map) {
        e eVar = this.b1;
        String str5 = C.f;
        if (eVar == null) {
            y().y(C.f, "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
            return;
        }
        C y = y();
        String b2 = eVar.b();
        if (eVar.v()) {
            str5 = C.f129o;
        }
        y.d(b2, str, str2, str3, str4, map, str5);
    }

    public final void I() {
        a aVar = this.Z0;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    public final void J() {
        a aVar = this.Z0;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    public final void K(f fVar) {
        d dVar = this.Y0;
        if (dVar == null) {
            return;
        }
        dVar.a(fVar);
    }

    public final boolean L(int i, int i2, @Nullable Intent intent) {
        this.f1++;
        if (this.b1 != null) {
            if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.e1, false)) {
                c0();
                return false;
            }
            I q = q();
            if (q != null && (!q.y() || intent != null || this.f1 >= this.g1)) {
                return q.t(i, i2, intent);
            }
        }
        return false;
    }

    public final void N(@Nullable a aVar) {
        this.Z0 = aVar;
    }

    public final void O(boolean z) {
        this.a1 = z;
    }

    public final void P(int i) {
        this.Y = i;
    }

    public final void R(@Nullable Map<String, String> map) {
        this.d1 = map;
    }

    public final void S(@Nullable Fragment fragment) {
        if (this.Z == null) {
            this.Z = fragment;
            return;
        }
        throw new C2416z("Can't set fragment once it is already set.");
    }

    public final void T(@Nullable I[] iArr) {
        this.X = iArr;
    }

    public final void W(@Nullable Map<String, String> map) {
        this.c1 = map;
    }

    public final void X(@Nullable d dVar) {
        this.Y0 = dVar;
    }

    public final void Y(@Nullable e eVar) {
        this.b1 = eVar;
    }

    public final void Z(@Nullable e eVar) {
        if (!x()) {
            c(eVar);
        }
    }

    public final void a(@NotNull String str, @NotNull String str2, boolean z) {
        C6562gT0.p(str, "key");
        C6562gT0.p(str2, "value");
        Map<String, String> map = this.d1;
        if (map == null) {
            map = new HashMap<>();
        }
        if (this.d1 == null) {
            this.d1 = map;
        }
        if (map.containsKey(str) && z) {
            str2 = ((Object) map.get(str)) + ',' + str2;
        }
        map.put(str, str2);
    }

    public final boolean a0() {
        String str;
        String str2;
        I q = q();
        if (q == null) {
            return false;
        }
        if (q.s() && !e()) {
            b(C.C, "1", false);
            return false;
        }
        e eVar = this.b1;
        if (eVar == null) {
            return false;
        }
        int z = q.z(eVar);
        this.f1 = 0;
        if (z > 0) {
            C y = y();
            String b2 = eVar.b();
            String m = q.m();
            if (eVar.v()) {
                str2 = C.n;
            } else {
                str2 = C.e;
            }
            y.j(b2, m, str2);
            this.g1 = z;
        } else {
            C y2 = y();
            String b3 = eVar.b();
            String m2 = q.m();
            if (eVar.v()) {
                str = C.p;
            } else {
                str = C.g;
            }
            y2.g(b3, m2, str);
            b(C.D, q.m(), true);
        }
        if (z <= 0) {
            return false;
        }
        return true;
    }

    public final void b(String str, String str2, boolean z) {
        Map<String, String> map = this.c1;
        if (map == null) {
            map = new HashMap<>();
        }
        if (this.c1 == null) {
            this.c1 = map;
        }
        if (map.containsKey(str) && z) {
            str2 = ((Object) map.get(str)) + ',' + str2;
        }
        map.put(str, str2);
    }

    public final void c(@Nullable e eVar) {
        if (eVar != null) {
            if (this.b1 == null) {
                if (C0376a.g1.k() && !e()) {
                    return;
                }
                this.b1 = eVar;
                this.X = w(eVar);
                c0();
                return;
            }
            throw new C2416z("Attempted to authorize while a request is pending.");
        }
    }

    public final void c0() {
        w wVar;
        I q = q();
        if (q != null) {
            wVar = this;
            wVar.E(q.m(), C.h, null, null, q.k());
        } else {
            wVar = this;
        }
        I[] iArr = wVar.X;
        while (iArr != null) {
            int i = wVar.Y;
            if (i >= iArr.length - 1) {
                break;
            }
            wVar.Y = i + 1;
            if (a0()) {
                return;
            }
        }
        if (wVar.b1 != null) {
            k();
        }
    }

    public final void d() {
        I q = q();
        if (q == null) {
            return;
        }
        q.b();
    }

    public final void d0(@NotNull f fVar) {
        f b2;
        C6562gT0.p(fVar, "pendingResult");
        if (fVar.Y != null) {
            C0376a i = C0376a.g1.i();
            C0376a c0376a = fVar.Y;
            if (i != null) {
                try {
                    if (C6562gT0.g(i.y(), c0376a.y())) {
                        b2 = f.d1.b(this.b1, fVar.Y, fVar.Z);
                        g(b2);
                        return;
                    }
                } catch (Exception e2) {
                    g(f.c.e(f.d1, this.b1, "Caught exception", e2.getMessage(), null, 8, null));
                    return;
                }
            }
            b2 = f.c.e(f.d1, this.b1, "User logged in as different Facebook user.", null, null, 8, null);
            g(b2);
            return;
        }
        throw new C2416z("Can't validate without a token");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean e() {
        String string;
        if (this.a1) {
            return true;
        }
        if (f("android.permission.INTERNET") != 0) {
            ActivityC4864Yy0 m = m();
            String str = null;
            if (m == null) {
                string = null;
            } else {
                string = m.getString(b.l.E);
            }
            if (m != null) {
                str = m.getString(b.l.D);
            }
            g(f.c.e(f.d1, this.b1, string, str, null, 8, null));
            return false;
        }
        this.a1 = true;
        return true;
    }

    public final int f(@NotNull String str) {
        C6562gT0.p(str, "permission");
        ActivityC4864Yy0 m = m();
        if (m == null) {
            return -1;
        }
        return m.checkCallingOrSelfPermission(str);
    }

    public final void g(@NotNull f fVar) {
        C6562gT0.p(fVar, "outcome");
        I q = q();
        if (q != null) {
            D(q.m(), fVar, q.k());
        }
        Map<String, String> map = this.c1;
        if (map != null) {
            fVar.b1 = map;
        }
        Map<String, String> map2 = this.d1;
        if (map2 != null) {
            fVar.c1 = map2;
        }
        this.X = null;
        this.Y = -1;
        this.b1 = null;
        this.c1 = null;
        this.f1 = 0;
        this.g1 = 0;
        K(fVar);
    }

    public final void h(@NotNull f fVar) {
        C6562gT0.p(fVar, "outcome");
        if (fVar.Y != null && C0376a.g1.k()) {
            d0(fVar);
        } else {
            g(fVar);
        }
    }

    public final void k() {
        g(f.c.e(f.d1, this.b1, "Login attempt failed.", null, null, 8, null));
    }

    @Nullable
    public final ActivityC4864Yy0 m() {
        Fragment fragment = this.Z;
        if (fragment == null) {
            return null;
        }
        return fragment.o();
    }

    @Nullable
    public final a n() {
        return this.Z0;
    }

    public final boolean o() {
        return this.a1;
    }

    @Nullable
    public final I q() {
        I[] iArr;
        int i = this.Y;
        if (i < 0 || (iArr = this.X) == null) {
            return null;
        }
        return iArr[i];
    }

    @Nullable
    public final Map<String, String> t() {
        return this.d1;
    }

    @Nullable
    public final Fragment u() {
        return this.Z;
    }

    @Nullable
    public final I[] v() {
        return this.X;
    }

    @Nullable
    public I[] w(@NotNull e eVar) {
        C6562gT0.p(eVar, "request");
        ArrayList arrayList = new ArrayList();
        v m = eVar.m();
        if (eVar.w()) {
            if (!com.facebook.M.N && m.l()) {
                arrayList.add(new C2402t(this));
            }
        } else {
            if (m.j()) {
                arrayList.add(new C2401s(this));
            }
            if (!com.facebook.M.N && m.m()) {
                arrayList.add(new C2403u(this));
            }
        }
        if (m.g()) {
            arrayList.add(new C2387d(this));
        }
        if (m.n()) {
            arrayList.add(new U(this));
        }
        if (!eVar.w() && m.h()) {
            arrayList.add(new C2398o(this));
        }
        Object[] array = arrayList.toArray(new I[0]);
        if (array != null) {
            return (I[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        C6562gT0.p(parcel, "dest");
        parcel.writeParcelableArray(this.X, i);
        parcel.writeInt(this.Y);
        parcel.writeParcelable(this.b1, i);
        l0 l0Var = l0.a;
        l0.W0(parcel, this.c1);
        l0.W0(parcel, this.d1);
    }

    public final boolean x() {
        if (this.b1 != null && this.Y >= 0) {
            return true;
        }
        return false;
    }

    public final C y() {
        String a2;
        String a3;
        C c2 = this.e1;
        if (c2 != null) {
            String b2 = c2.b();
            e eVar = this.b1;
            if (eVar == null) {
                a3 = null;
            } else {
                a3 = eVar.a();
            }
            if (C6562gT0.g(b2, a3)) {
                return c2;
            }
        }
        Context m = m();
        if (m == null) {
            com.facebook.M m2 = com.facebook.M.a;
            m = com.facebook.M.n();
        }
        e eVar2 = this.b1;
        if (eVar2 == null) {
            com.facebook.M m3 = com.facebook.M.a;
            a2 = com.facebook.M.o();
        } else {
            a2 = eVar2.a();
        }
        C c3 = new C(m, a2);
        this.e1 = c3;
        return c3;
    }

    @Nullable
    public final Map<String, String> z() {
        return this.c1;
    }

    public w(@NotNull Parcel parcel) {
        C6562gT0.p(parcel, "source");
        this.Y = -1;
        Parcelable[] readParcelableArray = parcel.readParcelableArray(I.class.getClassLoader());
        readParcelableArray = readParcelableArray == null ? new Parcelable[0] : readParcelableArray;
        ArrayList arrayList = new ArrayList();
        int length = readParcelableArray.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Parcelable parcelable = readParcelableArray[i];
            I i2 = parcelable instanceof I ? (I) parcelable : null;
            if (i2 != null) {
                i2.w(this);
            }
            if (i2 != null) {
                arrayList.add(i2);
            }
            i++;
        }
        Object[] array = arrayList.toArray(new I[0]);
        if (array != null) {
            this.X = (I[]) array;
            this.Y = parcel.readInt();
            this.b1 = (e) parcel.readParcelable(e.class.getClassLoader());
            l0 l0Var = l0.a;
            Map<String, String> w0 = l0.w0(parcel);
            this.c1 = w0 == null ? null : C8926q81.J0(w0);
            Map<String, String> w02 = l0.w0(parcel);
            this.d1 = w02 != null ? C8926q81.J0(w02) : null;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
