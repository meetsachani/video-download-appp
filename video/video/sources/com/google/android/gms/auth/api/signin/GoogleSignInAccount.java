package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AccountType;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import o.C3228Ie;
import o.C9998uW1;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "GoogleSignInAccountCreator")
/* loaded from: classes2.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    @InterfaceC5670cr1
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new zab();
    @VisibleForTesting
    @InterfaceC5670cr1
    public static Clock i1 = DefaultClock.d();
    @SafeParcelable.VersionField(id = 1)
    public final int X;
    @InterfaceC11300zs1
    @SafeParcelable.Field(getter = "getId", id = 2)
    public String Y;
    @InterfaceC11300zs1
    @SafeParcelable.Field(getter = "getEmail", id = 4)
    public String Y0;
    @InterfaceC11300zs1
    @SafeParcelable.Field(getter = "getIdToken", id = 3)
    public String Z;
    @InterfaceC11300zs1
    @SafeParcelable.Field(getter = "getDisplayName", id = 5)
    public String Z0;
    @InterfaceC11300zs1
    @SafeParcelable.Field(getter = "getPhotoUrl", id = 6)
    public Uri a1;
    @InterfaceC11300zs1
    @SafeParcelable.Field(getter = "getServerAuthCode", id = 7)
    public String b1;
    @SafeParcelable.Field(getter = "getExpirationTimeSecs", id = 8)
    public long c1;
    @SafeParcelable.Field(getter = "getObfuscatedIdentifier", id = 9)
    public String d1;
    @SafeParcelable.Field(id = 10)
    public List<Scope> e1;
    @InterfaceC11300zs1
    @SafeParcelable.Field(getter = "getGivenName", id = 11)
    public String f1;
    @InterfaceC11300zs1
    @SafeParcelable.Field(getter = "getFamilyName", id = 12)
    public String g1;
    public Set<Scope> h1 = new HashSet();

    @SafeParcelable.Constructor
    public GoogleSignInAccount(@SafeParcelable.Param(id = 1) int i, @InterfaceC11300zs1 @SafeParcelable.Param(id = 2) String str, @InterfaceC11300zs1 @SafeParcelable.Param(id = 3) String str2, @InterfaceC11300zs1 @SafeParcelable.Param(id = 4) String str3, @InterfaceC11300zs1 @SafeParcelable.Param(id = 5) String str4, @InterfaceC11300zs1 @SafeParcelable.Param(id = 6) Uri uri, @InterfaceC11300zs1 @SafeParcelable.Param(id = 7) String str5, @SafeParcelable.Param(id = 8) long j, @SafeParcelable.Param(id = 9) String str6, @SafeParcelable.Param(id = 10) List<Scope> list, @InterfaceC11300zs1 @SafeParcelable.Param(id = 11) String str7, @InterfaceC11300zs1 @SafeParcelable.Param(id = 12) String str8) {
        this.X = i;
        this.Y = str;
        this.Z = str2;
        this.Y0 = str3;
        this.Z0 = str4;
        this.a1 = uri;
        this.b1 = str5;
        this.c1 = j;
        this.d1 = str6;
        this.e1 = list;
        this.f1 = str7;
        this.g1 = str8;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static GoogleSignInAccount B0(@InterfaceC5670cr1 Account account) {
        return l2(account, new C3228Ie());
    }

    @InterfaceC5670cr1
    public static GoogleSignInAccount M1(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2, @InterfaceC11300zs1 String str3, @InterfaceC11300zs1 String str4, @InterfaceC11300zs1 String str5, @InterfaceC11300zs1 String str6, @InterfaceC11300zs1 Uri uri, @InterfaceC11300zs1 Long l, @InterfaceC5670cr1 String str7, @InterfaceC5670cr1 Set<Scope> set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l.longValue(), Preconditions.l(str7), new ArrayList((Collection) Preconditions.r(set)), str5, str6);
    }

    @InterfaceC11300zs1
    public static GoogleSignInAccount T1(@InterfaceC11300zs1 String str) throws JSONException {
        Uri uri;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(optString)) {
            uri = Uri.parse(optString);
        } else {
            uri = null;
        }
        long parseLong = Long.parseLong(jSONObject.getString(C9998uW1.t));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString2 = jSONObject.optString("id");
        if (jSONObject.has("tokenId")) {
            str2 = jSONObject.optString("tokenId");
        } else {
            str2 = null;
        }
        if (jSONObject.has("email")) {
            str3 = jSONObject.optString("email");
        } else {
            str3 = null;
        }
        if (jSONObject.has(FileProvider.k1)) {
            str4 = jSONObject.optString(FileProvider.k1);
        } else {
            str4 = null;
        }
        if (jSONObject.has("givenName")) {
            str5 = jSONObject.optString("givenName");
        } else {
            str5 = null;
        }
        if (jSONObject.has("familyName")) {
            str6 = jSONObject.optString("familyName");
        } else {
            str6 = null;
        }
        GoogleSignInAccount M1 = M1(optString2, str2, str3, str4, str5, str6, uri, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        if (jSONObject.has("serverAuthCode")) {
            str7 = jSONObject.optString("serverAuthCode");
        }
        M1.b1 = str7;
        return M1;
    }

    public static GoogleSignInAccount l2(Account account, Set<Scope> set) {
        return M1(null, null, account.name, null, null, null, null, 0L, account.name, set);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static GoogleSignInAccount m0() {
        return l2(new Account("<<default account>>", AccountType.a), new HashSet());
    }

    @InterfaceC11300zs1
    public String E0() {
        return this.Z0;
    }

    @InterfaceC11300zs1
    public String G0() {
        return this.Y0;
    }

    @InterfaceC11300zs1
    public String H0() {
        return this.g1;
    }

    @InterfaceC11300zs1
    public String I0() {
        return this.f1;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public GoogleSignInAccount I1(@InterfaceC5670cr1 Scope... scopeArr) {
        if (scopeArr != null) {
            Collections.addAll(this.h1, scopeArr);
        }
        return this;
    }

    @InterfaceC5670cr1
    public Set<Scope> O0() {
        return new HashSet(this.e1);
    }

    @InterfaceC11300zs1
    public String S0() {
        return this.Y;
    }

    @InterfaceC11300zs1
    public String U0() {
        return this.Z;
    }

    @InterfaceC11300zs1
    public Uri V0() {
        return this.a1;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public Set<Scope> Z0() {
        HashSet hashSet = new HashSet(this.e1);
        hashSet.addAll(this.h1);
        return hashSet;
    }

    @InterfaceC5670cr1
    public final String c2() {
        return this.d1;
    }

    @InterfaceC11300zs1
    public String e1() {
        return this.b1;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.d1.equals(this.d1) || !googleSignInAccount.Z0().equals(Z0())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.d1.hashCode() + 527) * 31) + Z0().hashCode();
    }

    @InterfaceC5670cr1
    public final String i2() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (S0() != null) {
                jSONObject.put("id", S0());
            }
            if (U0() != null) {
                jSONObject.put("tokenId", U0());
            }
            if (G0() != null) {
                jSONObject.put("email", G0());
            }
            if (E0() != null) {
                jSONObject.put(FileProvider.k1, E0());
            }
            if (I0() != null) {
                jSONObject.put("givenName", I0());
            }
            if (H0() != null) {
                jSONObject.put("familyName", H0());
            }
            Uri V0 = V0();
            if (V0 != null) {
                jSONObject.put("photoUrl", V0.toString());
            }
            if (e1() != null) {
                jSONObject.put("serverAuthCode", e1());
            }
            jSONObject.put(C9998uW1.t, this.c1);
            jSONObject.put("obfuscatedIdentifier", this.d1);
            JSONArray jSONArray = new JSONArray();
            List<Scope> list = this.e1;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: com.google.android.gms.auth.api.signin.zaa
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                    return ((Scope) obj).m0().compareTo(((Scope) obj2).m0());
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.m0());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @InterfaceC11300zs1
    public Account l0() {
        String str = this.Y0;
        if (str == null) {
            return null;
        }
        return new Account(str, AccountType.a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, this.X);
        SafeParcelWriter.Y(parcel, 2, S0(), false);
        SafeParcelWriter.Y(parcel, 3, U0(), false);
        SafeParcelWriter.Y(parcel, 4, G0(), false);
        SafeParcelWriter.Y(parcel, 5, E0(), false);
        SafeParcelWriter.S(parcel, 6, V0(), i, false);
        SafeParcelWriter.Y(parcel, 7, e1(), false);
        SafeParcelWriter.K(parcel, 8, this.c1);
        SafeParcelWriter.Y(parcel, 9, this.d1, false);
        SafeParcelWriter.d0(parcel, 10, this.e1, false);
        SafeParcelWriter.Y(parcel, 11, I0(), false);
        SafeParcelWriter.Y(parcel, 12, H0(), false);
        SafeParcelWriter.b(parcel, a);
    }

    @KeepForSdk
    public boolean x1() {
        if (i1.a() / 1000 >= this.c1 - 300) {
            return true;
        }
        return false;
    }
}
