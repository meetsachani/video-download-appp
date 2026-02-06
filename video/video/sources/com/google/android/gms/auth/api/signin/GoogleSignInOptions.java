package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.api.signin.internal.HashAccumulator;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AccountType;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "GoogleSignInOptionsCreator")
/* loaded from: classes2.dex */
public class GoogleSignInOptions extends AbstractSafeParcelable implements Api.ApiOptions.Optional, ReflectedParcelable {
    @InterfaceC5670cr1
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;
    @InterfaceC5670cr1
    public static final GoogleSignInOptions g1;
    @InterfaceC5670cr1
    public static final GoogleSignInOptions h1;
    @VisibleForTesting
    @InterfaceC5670cr1
    public static final Scope i1 = new Scope(Scopes.a);
    @VisibleForTesting
    @InterfaceC5670cr1
    public static final Scope j1 = new Scope("email");
    @VisibleForTesting
    @InterfaceC5670cr1
    public static final Scope k1 = new Scope("openid");
    @VisibleForTesting
    @InterfaceC5670cr1
    public static final Scope l1;
    @VisibleForTesting
    @InterfaceC5670cr1
    public static final Scope m1;
    public static Comparator<Scope> n1;
    @SafeParcelable.VersionField(id = 1)
    public final int X;
    @SafeParcelable.Field(getter = "getScopes", id = 2)
    public final ArrayList<Scope> Y;
    @SafeParcelable.Field(getter = "isIdTokenRequested", id = 4)
    public boolean Y0;
    @InterfaceC11300zs1
    @SafeParcelable.Field(getter = "getAccount", id = 3)
    public Account Z;
    @SafeParcelable.Field(getter = "isServerAuthCodeRequested", id = 5)
    public final boolean Z0;
    @SafeParcelable.Field(getter = "isForceCodeForRefreshToken", id = 6)
    public final boolean a1;
    @InterfaceC11300zs1
    @SafeParcelable.Field(getter = "getServerClientId", id = 7)
    public String b1;
    @InterfaceC11300zs1
    @SafeParcelable.Field(getter = "getHostedDomain", id = 8)
    public String c1;
    @SafeParcelable.Field(getter = "getExtensions", id = 9)
    public ArrayList<GoogleSignInOptionsExtensionParcelable> d1;
    @InterfaceC11300zs1
    @SafeParcelable.Field(getter = "getLogSessionId", id = 10)
    public String e1;
    public Map<Integer, GoogleSignInOptionsExtensionParcelable> f1;

    static {
        Scope scope = new Scope(Scopes.i);
        l1 = scope;
        m1 = new Scope(Scopes.h);
        Builder builder = new Builder();
        builder.d();
        builder.f();
        g1 = builder.b();
        Builder builder2 = new Builder();
        builder2.g(scope, new Scope[0]);
        h1 = builder2.b();
        CREATOR = new zae();
        n1 = new zac();
    }

    @InterfaceC11300zs1
    public static GoogleSignInOptions V0(@InterfaceC11300zs1 String str) throws JSONException {
        String str2;
        Account account;
        String str3;
        String str4 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        if (jSONObject.has("accountName")) {
            str2 = jSONObject.optString("accountName");
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            account = new Account(str2, AccountType.a);
        } else {
            account = null;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z = jSONObject.getBoolean("idTokenRequested");
        boolean z2 = jSONObject.getBoolean("serverAuthRequested");
        boolean z3 = jSONObject.getBoolean("forceCodeForRefreshToken");
        if (jSONObject.has("serverClientId")) {
            str3 = jSONObject.optString("serverClientId");
        } else {
            str3 = null;
        }
        if (jSONObject.has("hostedDomain")) {
            str4 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList, account, z, z2, z3, str3, str4, new HashMap(), (String) null);
    }

    public static Map<Integer, GoogleSignInOptionsExtensionParcelable> t2(@InterfaceC11300zs1 List<GoogleSignInOptionsExtensionParcelable> list) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            for (GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable : list) {
                hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.getType()), googleSignInOptionsExtensionParcelable);
            }
        }
        return hashMap;
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public String B0() {
        return this.e1;
    }

    @InterfaceC5670cr1
    public Scope[] E0() {
        ArrayList<Scope> arrayList = this.Y;
        return (Scope[]) arrayList.toArray(new Scope[arrayList.size()]);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public ArrayList<Scope> G0() {
        return new ArrayList<>(this.Y);
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public String H0() {
        return this.b1;
    }

    @KeepForSdk
    public boolean I0() {
        return this.a1;
    }

    @InterfaceC5670cr1
    public final String I1() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.Y, n1);
            Iterator<Scope> it = this.Y.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().m0());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.Z;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.Y0);
            jSONObject.put("forceCodeForRefreshToken", this.a1);
            jSONObject.put("serverAuthRequested", this.Z0);
            if (!TextUtils.isEmpty(this.b1)) {
                jSONObject.put("serverClientId", this.b1);
            }
            if (!TextUtils.isEmpty(this.c1)) {
                jSONObject.put("hostedDomain", this.c1);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @KeepForSdk
    public boolean O0() {
        return this.Y0;
    }

    @KeepForSdk
    public boolean S0() {
        return this.Z0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
        if (r1.equals(r4.l0()) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            if (this.d1.size() <= 0 && googleSignInOptions.d1.size() <= 0 && this.Y.size() == googleSignInOptions.G0().size() && this.Y.containsAll(googleSignInOptions.G0())) {
                Account account = this.Z;
                if (account == null) {
                    if (googleSignInOptions.l0() == null) {
                    }
                }
                if (TextUtils.isEmpty(this.b1)) {
                    if (TextUtils.isEmpty(googleSignInOptions.H0())) {
                    }
                } else if (!this.b1.equals(googleSignInOptions.H0())) {
                }
                if (this.a1 == googleSignInOptions.I0() && this.Y0 == googleSignInOptions.O0() && this.Z0 == googleSignInOptions.S0()) {
                    if (TextUtils.equals(this.e1, googleSignInOptions.B0())) {
                        return true;
                    }
                }
            }
        } catch (ClassCastException unused) {
        }
        return false;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.Y;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(arrayList2.get(i).m0());
        }
        Collections.sort(arrayList);
        HashAccumulator hashAccumulator = new HashAccumulator();
        hashAccumulator.a(arrayList);
        hashAccumulator.a(this.Z);
        hashAccumulator.a(this.b1);
        hashAccumulator.c(this.a1);
        hashAccumulator.c(this.Y0);
        hashAccumulator.c(this.Z0);
        hashAccumulator.a(this.e1);
        return hashAccumulator.b();
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public Account l0() {
        return this.Z;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public ArrayList<GoogleSignInOptionsExtensionParcelable> m0() {
        return this.d1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, this.X);
        SafeParcelWriter.d0(parcel, 2, G0(), false);
        SafeParcelWriter.S(parcel, 3, l0(), i, false);
        SafeParcelWriter.g(parcel, 4, O0());
        SafeParcelWriter.g(parcel, 5, S0());
        SafeParcelWriter.g(parcel, 6, I0());
        SafeParcelWriter.Y(parcel, 7, H0(), false);
        SafeParcelWriter.Y(parcel, 8, this.c1, false);
        SafeParcelWriter.d0(parcel, 9, m0(), false);
        SafeParcelWriter.Y(parcel, 10, B0(), false);
        SafeParcelWriter.b(parcel, a);
    }

    /* loaded from: classes2.dex */
    public static final class Builder {
        public Set<Scope> a;
        public boolean b;
        public boolean c;
        public boolean d;
        @InterfaceC11300zs1
        public String e;
        @InterfaceC11300zs1
        public Account f;
        @InterfaceC11300zs1
        public String g;
        public Map<Integer, GoogleSignInOptionsExtensionParcelable> h;
        @InterfaceC11300zs1
        public String i;

        public Builder() {
            this.a = new HashSet();
            this.h = new HashMap();
        }

        @InterfaceC5670cr1
        public Builder a(@InterfaceC5670cr1 GoogleSignInOptionsExtension googleSignInOptionsExtension) {
            if (!this.h.containsKey(Integer.valueOf(googleSignInOptionsExtension.f()))) {
                List<Scope> g = googleSignInOptionsExtension.g();
                if (g != null) {
                    this.a.addAll(g);
                }
                this.h.put(Integer.valueOf(googleSignInOptionsExtension.f()), new GoogleSignInOptionsExtensionParcelable(googleSignInOptionsExtension));
                return this;
            }
            throw new IllegalStateException("Only one extension per type may be added");
        }

        @InterfaceC5670cr1
        public GoogleSignInOptions b() {
            if (this.a.contains(GoogleSignInOptions.m1)) {
                Set<Scope> set = this.a;
                Scope scope = GoogleSignInOptions.l1;
                if (set.contains(scope)) {
                    this.a.remove(scope);
                }
            }
            if (this.d && (this.f == null || !this.a.isEmpty())) {
                d();
            }
            return new GoogleSignInOptions(new ArrayList(this.a), this.f, this.d, this.b, this.c, this.e, this.g, this.h, this.i);
        }

        @InterfaceC5670cr1
        public Builder c() {
            this.a.add(GoogleSignInOptions.j1);
            return this;
        }

        @InterfaceC5670cr1
        public Builder d() {
            this.a.add(GoogleSignInOptions.k1);
            return this;
        }

        @InterfaceC5670cr1
        public Builder e(@InterfaceC5670cr1 String str) {
            this.d = true;
            m(str);
            this.e = str;
            return this;
        }

        @InterfaceC5670cr1
        public Builder f() {
            this.a.add(GoogleSignInOptions.i1);
            return this;
        }

        @InterfaceC5670cr1
        public Builder g(@InterfaceC5670cr1 Scope scope, @InterfaceC5670cr1 Scope... scopeArr) {
            this.a.add(scope);
            this.a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        @InterfaceC5670cr1
        public Builder h(@InterfaceC5670cr1 String str) {
            i(str, false);
            return this;
        }

        @InterfaceC5670cr1
        public Builder i(@InterfaceC5670cr1 String str, boolean z) {
            this.b = true;
            m(str);
            this.e = str;
            this.c = z;
            return this;
        }

        @InterfaceC5670cr1
        public Builder j(@InterfaceC5670cr1 String str) {
            this.f = new Account(Preconditions.l(str), AccountType.a);
            return this;
        }

        @InterfaceC5670cr1
        public Builder k(@InterfaceC5670cr1 String str) {
            this.g = Preconditions.l(str);
            return this;
        }

        @InterfaceC5670cr1
        @KeepForSdk
        public Builder l(@InterfaceC5670cr1 String str) {
            this.i = str;
            return this;
        }

        public final String m(String str) {
            Preconditions.l(str);
            String str2 = this.e;
            boolean z = true;
            if (str2 != null && !str2.equals(str)) {
                z = false;
            }
            Preconditions.b(z, "two different server client ids provided");
            return str;
        }

        public Builder(@InterfaceC5670cr1 GoogleSignInOptions googleSignInOptions) {
            this.a = new HashSet();
            this.h = new HashMap();
            Preconditions.r(googleSignInOptions);
            this.a = new HashSet(googleSignInOptions.Y);
            this.b = googleSignInOptions.Z0;
            this.c = googleSignInOptions.a1;
            this.d = googleSignInOptions.Y0;
            this.e = googleSignInOptions.b1;
            this.f = googleSignInOptions.Z;
            this.g = googleSignInOptions.c1;
            this.h = GoogleSignInOptions.t2(googleSignInOptions.d1);
            this.i = googleSignInOptions.e1;
        }
    }

    @SafeParcelable.Constructor
    public GoogleSignInOptions(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) ArrayList<Scope> arrayList, @InterfaceC11300zs1 @SafeParcelable.Param(id = 3) Account account, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) boolean z2, @SafeParcelable.Param(id = 6) boolean z3, @InterfaceC11300zs1 @SafeParcelable.Param(id = 7) String str, @InterfaceC11300zs1 @SafeParcelable.Param(id = 8) String str2, @SafeParcelable.Param(id = 9) ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList2, @InterfaceC11300zs1 @SafeParcelable.Param(id = 10) String str3) {
        this(i, arrayList, account, z, z2, z3, str, str2, t2(arrayList2), str3);
    }

    public GoogleSignInOptions(int i, ArrayList<Scope> arrayList, @InterfaceC11300zs1 Account account, boolean z, boolean z2, boolean z3, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2, Map<Integer, GoogleSignInOptionsExtensionParcelable> map, @InterfaceC11300zs1 String str3) {
        this.X = i;
        this.Y = arrayList;
        this.Z = account;
        this.Y0 = z;
        this.Z0 = z2;
        this.a1 = z3;
        this.b1 = str;
        this.c1 = str2;
        this.d1 = new ArrayList<>(map.values());
        this.f1 = map;
        this.e1 = str3;
    }
}
