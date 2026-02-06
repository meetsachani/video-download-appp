package com.facebook;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.a0;
import com.facebook.internal.l0;
import com.google.firebase.crashlytics.internal.metadata.MetaDataStore;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import o.C6562gT0;
import o.C6566gU0;
import o.C8222nF;
import o.C9516sY;
import o.C9998uW1;
import o.InterfaceC7058iW0;
import o.InterfaceC8289nW0;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0376a implements Parcelable {
    @NotNull
    public static final String A1 = "application_id";
    @InterfaceC7058iW0
    @NotNull
    public static final Parcelable.Creator<C0376a> CREATOR;
    @NotNull
    public static final d g1 = new d(null);
    @NotNull
    public static final String h1 = "access_token";
    @NotNull
    public static final String i1 = "expires_in";
    @NotNull
    public static final String j1 = "user_id";
    @NotNull
    public static final String k1 = "data_access_expiration_time";
    @NotNull
    public static final String l1 = "graph_domain";
    @NotNull
    public static final String m1 = "facebook";
    @NotNull
    public static final Date n1;
    @NotNull
    public static final Date o1;
    @NotNull
    public static final Date p1;
    @NotNull
    public static final EnumC2354h q1;
    public static final int r1 = 1;
    @NotNull
    public static final String s1 = "version";
    @NotNull
    public static final String t1 = "expires_at";
    @NotNull
    public static final String u1 = "permissions";
    @NotNull
    public static final String v1 = "declined_permissions";
    @NotNull
    public static final String w1 = "expired_permissions";
    @NotNull
    public static final String x1 = "token";
    @NotNull
    public static final String y1 = "source";
    @NotNull
    public static final String z1 = "last_refresh";
    @NotNull
    public final Date X;
    @NotNull
    public final Set<String> Y;
    @NotNull
    public final Set<String> Y0;
    @NotNull
    public final Set<String> Z;
    @NotNull
    public final String Z0;
    @NotNull
    public final EnumC2354h a1;
    @NotNull
    public final Date b1;
    @NotNull
    public final String c1;
    @NotNull
    public final String d1;
    @NotNull
    public final Date e1;
    @Nullable
    public final String f1;

    /* renamed from: com.facebook.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0067a {
        void b(@Nullable C2416z c2416z);

        void c(@Nullable C0376a c0376a);
    }

    /* renamed from: com.facebook.a$b */
    /* loaded from: classes2.dex */
    public interface b {
        void a(@Nullable C2416z c2416z);

        void b(@Nullable C0376a c0376a);
    }

    /* renamed from: com.facebook.a$c */
    /* loaded from: classes2.dex */
    public static final class c implements Parcelable.Creator<C0376a> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public C0376a createFromParcel(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "source");
            return new C0376a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public C0376a[] newArray(int i) {
            return new C0376a[i];
        }
    }

    /* renamed from: com.facebook.a$d */
    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: com.facebook.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0068a implements l0.a {
            public final /* synthetic */ Bundle a;
            public final /* synthetic */ InterfaceC0067a b;
            public final /* synthetic */ String c;

            public C0068a(Bundle bundle, InterfaceC0067a interfaceC0067a, String str) {
                this.a = bundle;
                this.b = interfaceC0067a;
                this.c = str;
            }

            @Override // com.facebook.internal.l0.a
            public void a(@Nullable JSONObject jSONObject) {
                String string;
                if (jSONObject == null) {
                    string = null;
                } else {
                    try {
                        string = jSONObject.getString("id");
                    } catch (Exception unused) {
                        this.b.b(new C2416z("Unable to generate access token due to missing user id"));
                        return;
                    }
                }
                if (string != null) {
                    this.a.putString("user_id", string);
                    this.b.c(C0376a.g1.c(null, this.a, EnumC2354h.FACEBOOK_APPLICATION_WEB, new Date(), this.c));
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }

            @Override // com.facebook.internal.l0.a
            public void b(@Nullable C2416z c2416z) {
                this.b.b(c2416z);
            }
        }

        public /* synthetic */ d(C9516sY c9516sY) {
            this();
        }

        @NotNull
        public final C0376a b(@NotNull C0376a c0376a) {
            C6562gT0.p(c0376a, "current");
            return new C0376a(c0376a.x(), c0376a.h(), c0376a.y(), c0376a.u(), c0376a.n(), c0376a.o(), c0376a.w(), new Date(), new Date(), c0376a.m(), null, 1024, null);
        }

        public final C0376a c(List<String> list, Bundle bundle, EnumC2354h enumC2354h, Date date, String str) {
            String string;
            String string2 = bundle.getString("access_token");
            if (string2 == null) {
                return null;
            }
            com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
            Date y = com.facebook.internal.l0.y(bundle, C0376a.i1, date);
            if (y == null || (string = bundle.getString("user_id")) == null) {
                return null;
            }
            return new C0376a(string2, str, string, list, null, null, enumC2354h, y, new Date(), com.facebook.internal.l0.y(bundle, C0376a.k1, new Date(0L)), null, 1024, null);
        }

        @InterfaceC9511sW0
        @NotNull
        public final C0376a d(@NotNull JSONObject jSONObject) throws JSONException {
            Collection j0;
            C6562gT0.p(jSONObject, "jsonObject");
            if (jSONObject.getInt("version") <= 1) {
                String string = jSONObject.getString("token");
                Date date = new Date(jSONObject.getLong("expires_at"));
                JSONArray jSONArray = jSONObject.getJSONArray("permissions");
                JSONArray jSONArray2 = jSONObject.getJSONArray(C0376a.v1);
                JSONArray optJSONArray = jSONObject.optJSONArray(C0376a.w1);
                Date date2 = new Date(jSONObject.getLong(C0376a.z1));
                String string2 = jSONObject.getString("source");
                C6562gT0.o(string2, "jsonObject.getString(SOURCE_KEY)");
                EnumC2354h valueOf = EnumC2354h.valueOf(string2);
                String string3 = jSONObject.getString(C0376a.A1);
                String string4 = jSONObject.getString("user_id");
                Date date3 = new Date(jSONObject.optLong(C0376a.k1, 0L));
                String optString = jSONObject.optString("graph_domain", null);
                C6562gT0.o(string, "token");
                C6562gT0.o(string3, "applicationId");
                C6562gT0.o(string4, MetaDataStore.c);
                com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                C6562gT0.o(jSONArray, "permissionsArray");
                List<String> j02 = com.facebook.internal.l0.j0(jSONArray);
                C6562gT0.o(jSONArray2, "declinedPermissionsArray");
                List<String> j03 = com.facebook.internal.l0.j0(jSONArray2);
                if (optJSONArray == null) {
                    j0 = new ArrayList();
                } else {
                    j0 = com.facebook.internal.l0.j0(optJSONArray);
                }
                return new C0376a(string, string3, string4, j02, j03, j0, valueOf, date, date2, date3, optString);
            }
            throw new C2416z("Unknown AccessToken serialization format.");
        }

        @InterfaceC9511sW0
        @Nullable
        public final C0376a e(@NotNull Bundle bundle) {
            String string;
            C6562gT0.p(bundle, "bundle");
            List<String> j = j(bundle, a0.h);
            List<String> j2 = j(bundle, a0.i);
            List<String> j3 = j(bundle, a0.j);
            a0.a aVar = a0.c;
            String a = aVar.a(bundle);
            com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
            if (com.facebook.internal.l0.f0(a)) {
                M m = M.a;
                a = M.o();
            }
            String str = a;
            String i = aVar.i(bundle);
            if (i == null) {
                return null;
            }
            JSONObject f = com.facebook.internal.l0.f(i);
            if (f == null) {
                string = null;
            } else {
                try {
                    string = f.getString("id");
                } catch (JSONException unused) {
                    return null;
                }
            }
            if (str == null || string == null) {
                return null;
            }
            return new C0376a(i, str, string, j, j2, j3, aVar.h(bundle), aVar.c(bundle), aVar.e(bundle), null, null, 1024, null);
        }

        @InterfaceC9511sW0
        public final void f(@NotNull Intent intent, @NotNull String str, @NotNull InterfaceC0067a interfaceC0067a) {
            C6562gT0.p(intent, C9998uW1.R);
            C6562gT0.p(str, "applicationId");
            C6562gT0.p(interfaceC0067a, "accessTokenCallback");
            if (intent.getExtras() == null) {
                interfaceC0067a.b(new C2416z("No extras found on intent"));
                return;
            }
            Bundle bundle = new Bundle(intent.getExtras());
            String string = bundle.getString("access_token");
            if (string != null && string.length() != 0) {
                String string2 = bundle.getString("user_id");
                if (string2 != null && string2.length() != 0) {
                    interfaceC0067a.c(c(null, bundle, EnumC2354h.FACEBOOK_APPLICATION_WEB, new Date(), str));
                    return;
                }
                com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                com.facebook.internal.l0.H(string, new C0068a(bundle, interfaceC0067a, str));
                return;
            }
            interfaceC0067a.b(new C2416z("No access token found on intent"));
        }

        @InterfaceC9511sW0
        @SuppressLint({"FieldGetter"})
        @Nullable
        public final C0376a g(@NotNull C0376a c0376a, @NotNull Bundle bundle) {
            C6562gT0.p(c0376a, "current");
            C6562gT0.p(bundle, "bundle");
            if (c0376a.w() != EnumC2354h.FACEBOOK_APPLICATION_WEB && c0376a.w() != EnumC2354h.FACEBOOK_APPLICATION_NATIVE && c0376a.w() != EnumC2354h.FACEBOOK_APPLICATION_SERVICE) {
                throw new C2416z(C6562gT0.C("Invalid token source: ", c0376a.w()));
            }
            com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
            Date y = com.facebook.internal.l0.y(bundle, C0376a.i1, new Date(0L));
            String string = bundle.getString("access_token");
            if (string == null) {
                return null;
            }
            String string2 = bundle.getString("graph_domain");
            Date y2 = com.facebook.internal.l0.y(bundle, C0376a.k1, new Date(0L));
            if (com.facebook.internal.l0.f0(string)) {
                return null;
            }
            return new C0376a(string, c0376a.h(), c0376a.y(), c0376a.u(), c0376a.n(), c0376a.o(), c0376a.w(), y, new Date(), y2, string2);
        }

        @InterfaceC9511sW0
        public final void h() {
            C0376a i = C2338g.f.e().i();
            if (i != null) {
                p(b(i));
            }
        }

        @InterfaceC9511sW0
        @Nullable
        public final C0376a i() {
            return C2338g.f.e().i();
        }

        @InterfaceC9511sW0
        @NotNull
        public final List<String> j(@NotNull Bundle bundle, @Nullable String str) {
            C6562gT0.p(bundle, "bundle");
            ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
            if (stringArrayList == null) {
                return C8222nF.H();
            }
            List<String> unmodifiableList = Collections.unmodifiableList(new ArrayList(stringArrayList));
            C6562gT0.o(unmodifiableList, "{\n            Collections.unmodifiableList(ArrayList(originalPermissions))\n          }");
            return unmodifiableList;
        }

        @InterfaceC9511sW0
        public final boolean k() {
            C0376a i = C2338g.f.e().i();
            if (i != null && !i.C()) {
                return true;
            }
            return false;
        }

        @InterfaceC9511sW0
        public final boolean l() {
            C0376a i = C2338g.f.e().i();
            if (i != null && !i.B()) {
                return true;
            }
            return false;
        }

        @InterfaceC9511sW0
        public final boolean m() {
            C0376a i = C2338g.f.e().i();
            if (i != null && !i.C() && i.D()) {
                return true;
            }
            return false;
        }

        @InterfaceC9511sW0
        public final void n() {
            C2338g.f.e().l(null);
        }

        @InterfaceC9511sW0
        public final void o(@Nullable b bVar) {
            C2338g.f.e().l(bVar);
        }

        @InterfaceC9511sW0
        public final void p(@Nullable C0376a c0376a) {
            C2338g.f.e().s(c0376a);
        }

        public d() {
        }
    }

    /* renamed from: com.facebook.a$e */
    /* loaded from: classes2.dex */
    public /* synthetic */ class e {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC2354h.valuesCustom().length];
            iArr[EnumC2354h.FACEBOOK_APPLICATION_WEB.ordinal()] = 1;
            iArr[EnumC2354h.CHROME_CUSTOM_TAB.ordinal()] = 2;
            iArr[EnumC2354h.WEB_VIEW.ordinal()] = 3;
            a = iArr;
        }
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        n1 = date;
        o1 = date;
        p1 = new Date();
        q1 = EnumC2354h.FACEBOOK_APPLICATION_WEB;
        CREATOR = new c();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC8289nW0
    public C0376a(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Collection<String> collection, @Nullable Collection<String> collection2, @Nullable Collection<String> collection3, @Nullable EnumC2354h enumC2354h, @Nullable Date date, @Nullable Date date2, @Nullable Date date3) {
        this(str, str2, str3, collection, collection2, collection3, enumC2354h, date, date2, date3, null, 1024, null);
        C6562gT0.p(str, C9998uW1.m);
        C6562gT0.p(str2, "applicationId");
        C6562gT0.p(str3, MetaDataStore.c);
    }

    @InterfaceC9511sW0
    public static final boolean A() {
        return g1.l();
    }

    @InterfaceC9511sW0
    public static final boolean E() {
        return g1.m();
    }

    @InterfaceC9511sW0
    public static final void I() {
        g1.n();
    }

    @InterfaceC9511sW0
    public static final void J(@Nullable b bVar) {
        g1.o(bVar);
    }

    @InterfaceC9511sW0
    public static final void K(@Nullable C0376a c0376a) {
        g1.p(c0376a);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final C0376a c(@NotNull JSONObject jSONObject) throws JSONException {
        return g1.d(jSONObject);
    }

    @InterfaceC9511sW0
    @Nullable
    public static final C0376a d(@NotNull Bundle bundle) {
        return g1.e(bundle);
    }

    @InterfaceC9511sW0
    public static final void e(@NotNull Intent intent, @NotNull String str, @NotNull InterfaceC0067a interfaceC0067a) {
        g1.f(intent, str, interfaceC0067a);
    }

    @InterfaceC9511sW0
    @SuppressLint({"FieldGetter"})
    @Nullable
    public static final C0376a f(@NotNull C0376a c0376a, @NotNull Bundle bundle) {
        return g1.g(c0376a, bundle);
    }

    @InterfaceC9511sW0
    public static final void g() {
        g1.h();
    }

    @InterfaceC9511sW0
    @Nullable
    public static final C0376a k() {
        return g1.i();
    }

    @InterfaceC9511sW0
    @NotNull
    public static final List<String> v(@NotNull Bundle bundle, @Nullable String str) {
        return g1.j(bundle, str);
    }

    @InterfaceC9511sW0
    public static final boolean z() {
        return g1.k();
    }

    public final boolean B() {
        return new Date().after(this.e1);
    }

    public final boolean C() {
        return new Date().after(this.X);
    }

    public final boolean D() {
        String str = this.f1;
        if (str != null && str.equals(M.O)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final JSONObject L() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.Z0);
        jSONObject.put("expires_at", this.X.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.Y));
        jSONObject.put(v1, new JSONArray((Collection) this.Z));
        jSONObject.put(w1, new JSONArray((Collection) this.Y0));
        jSONObject.put(z1, this.b1.getTime());
        jSONObject.put("source", this.a1.name());
        jSONObject.put(A1, this.c1);
        jSONObject.put("user_id", this.d1);
        jSONObject.put(k1, this.e1.getTime());
        String str = this.f1;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    public final String N() {
        M m = M.a;
        if (M.P(b0.INCLUDE_ACCESS_TOKENS)) {
            return this.Z0;
        }
        return "ACCESS_TOKEN_REMOVED";
    }

    public final void a(StringBuilder sb) {
        sb.append(" permissions:");
        sb.append(C6566gU0.f);
        sb.append(TextUtils.join(C6566gU0.h, this.Y));
        sb.append(C6566gU0.g);
    }

    public final EnumC2354h b(EnumC2354h enumC2354h, String str) {
        if (str != null && str.equals(M.O)) {
            int i = e.a[enumC2354h.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return enumC2354h;
                    }
                    return EnumC2354h.INSTAGRAM_WEB_VIEW;
                }
                return EnumC2354h.INSTAGRAM_CUSTOM_CHROME_TAB;
            }
            return EnumC2354h.INSTAGRAM_APPLICATION_WEB;
        }
        return enumC2354h;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        boolean g;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0376a)) {
            return false;
        }
        C0376a c0376a = (C0376a) obj;
        if (C6562gT0.g(this.X, c0376a.X) && C6562gT0.g(this.Y, c0376a.Y) && C6562gT0.g(this.Z, c0376a.Z) && C6562gT0.g(this.Y0, c0376a.Y0) && C6562gT0.g(this.Z0, c0376a.Z0) && this.a1 == c0376a.a1 && C6562gT0.g(this.b1, c0376a.b1) && C6562gT0.g(this.c1, c0376a.c1) && C6562gT0.g(this.d1, c0376a.d1) && C6562gT0.g(this.e1, c0376a.e1)) {
            String str = this.f1;
            String str2 = c0376a.f1;
            if (str == null) {
                if (str2 == null) {
                    g = true;
                } else {
                    g = false;
                }
            } else {
                g = C6562gT0.g(str, str2);
            }
            if (g) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final String h() {
        return this.c1;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((((((((((((((((((527 + this.X.hashCode()) * 31) + this.Y.hashCode()) * 31) + this.Z.hashCode()) * 31) + this.Y0.hashCode()) * 31) + this.Z0.hashCode()) * 31) + this.a1.hashCode()) * 31) + this.b1.hashCode()) * 31) + this.c1.hashCode()) * 31) + this.d1.hashCode()) * 31) + this.e1.hashCode()) * 31;
        String str = this.f1;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @NotNull
    public final Date m() {
        return this.e1;
    }

    @NotNull
    public final Set<String> n() {
        return this.Z;
    }

    @NotNull
    public final Set<String> o() {
        return this.Y0;
    }

    @NotNull
    public final Date q() {
        return this.X;
    }

    @Nullable
    public final String s() {
        return this.f1;
    }

    @NotNull
    public final Date t() {
        return this.b1;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{AccessToken");
        sb.append(" token:");
        sb.append(N());
        a(sb);
        sb.append("}");
        String sb2 = sb.toString();
        C6562gT0.o(sb2, "builder.toString()");
        return sb2;
    }

    @NotNull
    public final Set<String> u() {
        return this.Y;
    }

    @NotNull
    public final EnumC2354h w() {
        return this.a1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        C6562gT0.p(parcel, "dest");
        parcel.writeLong(this.X.getTime());
        parcel.writeStringList(new ArrayList(this.Y));
        parcel.writeStringList(new ArrayList(this.Z));
        parcel.writeStringList(new ArrayList(this.Y0));
        parcel.writeString(this.Z0);
        parcel.writeString(this.a1.name());
        parcel.writeLong(this.b1.getTime());
        parcel.writeString(this.c1);
        parcel.writeString(this.d1);
        parcel.writeLong(this.e1.getTime());
        parcel.writeString(this.f1);
    }

    @NotNull
    public final String x() {
        return this.Z0;
    }

    @NotNull
    public final String y() {
        return this.d1;
    }

    public /* synthetic */ C0376a(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, EnumC2354h enumC2354h, Date date, Date date2, Date date3, String str4, int i, C9516sY c9516sY) {
        this(str, str2, str3, collection, collection2, collection3, enumC2354h, date, date2, date3, (i & 1024) != 0 ? m1 : str4);
    }

    @InterfaceC8289nW0
    public C0376a(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Collection<String> collection, @Nullable Collection<String> collection2, @Nullable Collection<String> collection3, @Nullable EnumC2354h enumC2354h, @Nullable Date date, @Nullable Date date2, @Nullable Date date3, @Nullable String str4) {
        C6562gT0.p(str, C9998uW1.m);
        C6562gT0.p(str2, "applicationId");
        C6562gT0.p(str3, MetaDataStore.c);
        com.facebook.internal.m0 m0Var = com.facebook.internal.m0.a;
        com.facebook.internal.m0.p(str, C9998uW1.m);
        com.facebook.internal.m0.p(str2, "applicationId");
        com.facebook.internal.m0.p(str3, MetaDataStore.c);
        this.X = date == null ? o1 : date;
        Set<String> unmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        C6562gT0.o(unmodifiableSet, "unmodifiableSet(if (permissions != null) HashSet(permissions) else HashSet())");
        this.Y = unmodifiableSet;
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        C6562gT0.o(unmodifiableSet2, "unmodifiableSet(\n            if (declinedPermissions != null) HashSet(declinedPermissions) else HashSet())");
        this.Z = unmodifiableSet2;
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        C6562gT0.o(unmodifiableSet3, "unmodifiableSet(\n            if (expiredPermissions != null) HashSet(expiredPermissions) else HashSet())");
        this.Y0 = unmodifiableSet3;
        this.Z0 = str;
        this.a1 = b(enumC2354h == null ? q1 : enumC2354h, str4);
        this.b1 = date2 == null ? p1 : date2;
        this.c1 = str2;
        this.d1 = str3;
        this.e1 = (date3 == null || date3.getTime() == 0) ? o1 : date3;
        this.f1 = str4 == null ? m1 : str4;
    }

    public C0376a(@NotNull Parcel parcel) {
        EnumC2354h enumC2354h;
        C6562gT0.p(parcel, "parcel");
        this.X = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        C6562gT0.o(unmodifiableSet, "unmodifiableSet(HashSet(permissionsList))");
        this.Y = unmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        C6562gT0.o(unmodifiableSet2, "unmodifiableSet(HashSet(permissionsList))");
        this.Z = unmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        C6562gT0.o(unmodifiableSet3, "unmodifiableSet(HashSet(permissionsList))");
        this.Y0 = unmodifiableSet3;
        String readString = parcel.readString();
        com.facebook.internal.m0 m0Var = com.facebook.internal.m0.a;
        this.Z0 = com.facebook.internal.m0.t(readString, "token");
        String readString2 = parcel.readString();
        if (readString2 != null) {
            enumC2354h = EnumC2354h.valueOf(readString2);
        } else {
            enumC2354h = q1;
        }
        this.a1 = enumC2354h;
        this.b1 = new Date(parcel.readLong());
        this.c1 = com.facebook.internal.m0.t(parcel.readString(), "applicationId");
        this.d1 = com.facebook.internal.m0.t(parcel.readString(), MetaDataStore.c);
        this.e1 = new Date(parcel.readLong());
        this.f1 = parcel.readString();
    }
}
