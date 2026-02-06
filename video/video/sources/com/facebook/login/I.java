package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.facebook.C0376a;
import com.facebook.C2381j;
import com.facebook.C2416z;
import com.facebook.EnumC2354h;
import com.facebook.Y;
import com.facebook.internal.C2356a;
import com.facebook.internal.Z;
import com.facebook.internal.l0;
import com.facebook.login.w;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import o.C10763xf2;
import o.C6562gT0;
import o.C8222nF;
import o.C8926q81;
import o.C9516sY;
import o.HB;
import o.InterfaceC5056aJ2;
import o.InterfaceC9511sW0;
import o.UE;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@InterfaceC5056aJ2(otherwise = 3)
/* loaded from: classes2.dex */
public abstract class I implements Parcelable {
    @NotNull
    public static final String Y0 = "User canceled log in.";
    @NotNull
    public static final a Z = new a(null);
    @NotNull
    public static final String Z0 = "Authorization response does not contain the signed_request";
    @NotNull
    public static final String a1 = "Failed to retrieve user_id from signed_request";
    @Nullable
    public Map<String, String> X;
    public w Y;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        @Nullable
        public final C0376a a(@NotNull Bundle bundle, @Nullable EnumC2354h enumC2354h, @NotNull String str) {
            String string;
            C6562gT0.p(bundle, "bundle");
            C6562gT0.p(str, "applicationId");
            l0 l0Var = l0.a;
            Date y = l0.y(bundle, Z.z0, new Date(0L));
            ArrayList<String> stringArrayList = bundle.getStringArrayList(Z.q0);
            String string2 = bundle.getString(Z.y0);
            Date y2 = l0.y(bundle, Z.A0, new Date(0L));
            if (string2 == null || string2.length() == 0 || (string = bundle.getString(Z.t0)) == null || string.length() == 0) {
                return null;
            }
            return new C0376a(string2, str, string, stringArrayList, null, null, enumC2354h, y, new Date(), y2, bundle.getString("graph_domain"));
        }

        @InterfaceC9511sW0
        @Nullable
        public final C0376a b(@Nullable Collection<String> collection, @NotNull Bundle bundle, @Nullable EnumC2354h enumC2354h, @NotNull String str) throws C2416z {
            Collection<String> collection2;
            ArrayList arrayList;
            ArrayList arrayList2;
            C6562gT0.p(bundle, "bundle");
            C6562gT0.p(str, "applicationId");
            l0 l0Var = l0.a;
            Date y = l0.y(bundle, C0376a.i1, new Date());
            String string = bundle.getString("access_token");
            if (string == null) {
                return null;
            }
            Date y2 = l0.y(bundle, C0376a.k1, new Date(0L));
            String string2 = bundle.getString("granted_scopes");
            if (string2 != null && string2.length() > 0) {
                Object[] array = C10763xf2.o5(string2, new String[]{","}, false, 0, 6, null).toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    collection2 = C8222nF.s(Arrays.copyOf(strArr, strArr.length));
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                collection2 = collection;
            }
            String string3 = bundle.getString("denied_scopes");
            if (string3 != null && string3.length() > 0) {
                Object[] array2 = C10763xf2.o5(string3, new String[]{","}, false, 0, 6, null).toArray(new String[0]);
                if (array2 != null) {
                    String[] strArr2 = (String[]) array2;
                    arrayList = C8222nF.s(Arrays.copyOf(strArr2, strArr2.length));
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                arrayList = null;
            }
            String string4 = bundle.getString("expired_scopes");
            if (string4 != null && string4.length() > 0) {
                Object[] array3 = C10763xf2.o5(string4, new String[]{","}, false, 0, 6, null).toArray(new String[0]);
                if (array3 != null) {
                    String[] strArr3 = (String[]) array3;
                    arrayList2 = C8222nF.s(Arrays.copyOf(strArr3, strArr3.length));
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                arrayList2 = null;
            }
            if (l0.f0(string)) {
                return null;
            }
            return new C0376a(string, str, e(bundle.getString("signed_request")), collection2, arrayList, arrayList2, enumC2354h, y, new Date(), y2, bundle.getString("graph_domain"));
        }

        @InterfaceC9511sW0
        @Nullable
        public final C2381j c(@NotNull Bundle bundle, @Nullable String str) throws C2416z {
            C6562gT0.p(bundle, "bundle");
            String string = bundle.getString(Z.B0);
            if (string != null && string.length() != 0 && str != null && str.length() != 0) {
                try {
                    return new C2381j(string, str);
                } catch (Exception e) {
                    throw new C2416z(e.getMessage());
                }
            }
            return null;
        }

        @InterfaceC9511sW0
        @Nullable
        public final C2381j d(@NotNull Bundle bundle, @Nullable String str) throws C2416z {
            C6562gT0.p(bundle, "bundle");
            String string = bundle.getString("id_token");
            if (string != null && string.length() != 0 && str != null && str.length() != 0) {
                try {
                    return new C2381j(string, str);
                } catch (Exception e) {
                    throw new C2416z(e.getMessage(), e);
                }
            }
            return null;
        }

        @InterfaceC9511sW0
        @NotNull
        public final String e(@Nullable String str) throws C2416z {
            Object[] array;
            if (str != null && str.length() != 0) {
                try {
                    array = C10763xf2.o5(str, new String[]{UE.h}, false, 0, 6, null).toArray(new String[0]);
                } catch (UnsupportedEncodingException | JSONException unused) {
                }
                if (array != null) {
                    String[] strArr = (String[]) array;
                    if (strArr.length == 2) {
                        byte[] decode = Base64.decode(strArr[1], 0);
                        C6562gT0.o(decode, "data");
                        String string = new JSONObject(new String(decode, HB.b)).getString("user_id");
                        C6562gT0.o(string, "jsonObject.getString(\"user_id\")");
                        return string;
                    }
                    throw new C2416z(I.a1);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new C2416z(I.Z0);
        }

        public a() {
        }
    }

    public I(@NotNull w wVar) {
        C6562gT0.p(wVar, A.s2);
        w(wVar);
    }

    @InterfaceC9511sW0
    @Nullable
    public static final C0376a c(@NotNull Bundle bundle, @Nullable EnumC2354h enumC2354h, @NotNull String str) {
        return Z.a(bundle, enumC2354h, str);
    }

    @InterfaceC9511sW0
    @Nullable
    public static final C0376a d(@Nullable Collection<String> collection, @NotNull Bundle bundle, @Nullable EnumC2354h enumC2354h, @NotNull String str) throws C2416z {
        return Z.b(collection, bundle, enumC2354h, str);
    }

    @InterfaceC9511sW0
    @Nullable
    public static final C2381j e(@NotNull Bundle bundle, @Nullable String str) throws C2416z {
        return Z.c(bundle, str);
    }

    @InterfaceC9511sW0
    @Nullable
    public static final C2381j f(@NotNull Bundle bundle, @Nullable String str) throws C2416z {
        return Z.d(bundle, str);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String o(@Nullable String str) throws C2416z {
        return Z.e(str);
    }

    public void a(@Nullable String str, @Nullable Object obj) {
        String obj2;
        if (this.X == null) {
            this.X = new HashMap();
        }
        Map<String, String> map = this.X;
        if (map == null) {
            return;
        }
        if (obj == null) {
            obj2 = null;
        } else {
            obj2 = obj.toString();
        }
        map.put(str, obj2);
    }

    public void b() {
    }

    @NotNull
    public String g(@NotNull String str) {
        C6562gT0.p(str, "authId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C.t, str);
            jSONObject.put(C.w, m());
            v(jSONObject);
        } catch (JSONException e) {
            Log.w("LoginMethodHandler", C6562gT0.C("Error creating client state json: ", e.getMessage()));
        }
        String jSONObject2 = jSONObject.toString();
        C6562gT0.o(jSONObject2, "param.toString()");
        return jSONObject2;
    }

    @NotNull
    public final w h() {
        w wVar = this.Y;
        if (wVar != null) {
            return wVar;
        }
        C6562gT0.S(A.s2);
        throw null;
    }

    @Nullable
    public final Map<String, String> k() {
        return this.X;
    }

    @NotNull
    public abstract String m();

    @NotNull
    public String n() {
        StringBuilder sb = new StringBuilder();
        sb.append("fb");
        com.facebook.M m = com.facebook.M.a;
        sb.append(com.facebook.M.o());
        sb.append("://authorize/");
        return sb.toString();
    }

    public void q(@Nullable String str) {
        String a2;
        w.e C = h().C();
        if (C == null) {
            a2 = null;
        } else {
            a2 = C.a();
        }
        if (a2 == null) {
            com.facebook.M m = com.facebook.M.a;
            a2 = com.facebook.M.o();
        }
        com.facebook.appevents.K k = new com.facebook.appevents.K(h().m(), a2);
        Bundle bundle = new Bundle();
        bundle.putString(C2356a.k, str);
        bundle.putLong(C2356a.l, System.currentTimeMillis());
        bundle.putString("app_id", a2);
        k.n(C2356a.d, null, bundle);
    }

    public boolean s() {
        return false;
    }

    public boolean t(int i, int i2, @Nullable Intent intent) {
        return false;
    }

    @NotNull
    public Bundle u(@NotNull w.e eVar, @NotNull Bundle bundle) throws C2416z {
        com.facebook.S a2;
        C6562gT0.p(eVar, "request");
        C6562gT0.p(bundle, androidx.lifecycle.p.g);
        String string = bundle.getString("code");
        l0 l0Var = l0.a;
        if (!l0.f0(string)) {
            String str = null;
            if (string == null) {
                a2 = null;
            } else {
                P p = P.a;
                String n = n();
                String f = eVar.f();
                if (f == null) {
                    f = "";
                }
                a2 = P.a(string, n, f);
            }
            if (a2 != null) {
                Y l = a2.l();
                com.facebook.C g = l.g();
                if (g == null) {
                    try {
                        JSONObject i = l.i();
                        if (i != null) {
                            str = i.getString("access_token");
                        }
                        if (i != null && !l0.f0(str)) {
                            bundle.putString("access_token", str);
                            if (i.has("id_token")) {
                                bundle.putString("id_token", i.getString("id_token"));
                                return bundle;
                            }
                            return bundle;
                        }
                        throw new C2416z("No access token found from result");
                    } catch (JSONException e) {
                        throw new C2416z(C6562gT0.C("Fail to process code exchange response: ", e.getMessage()));
                    }
                }
                throw new com.facebook.P(g, g.h());
            }
            throw new C2416z("Failed to create code exchange request");
        }
        throw new C2416z("No code param found from the request");
    }

    public void v(@NotNull JSONObject jSONObject) throws JSONException {
        C6562gT0.p(jSONObject, "param");
    }

    public final void w(@NotNull w wVar) {
        C6562gT0.p(wVar, "<set-?>");
        this.Y = wVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        C6562gT0.p(parcel, "dest");
        l0 l0Var = l0.a;
        l0.X0(parcel, this.X);
    }

    public final void x(@Nullable Map<String, String> map) {
        this.X = map;
    }

    public boolean y() {
        return false;
    }

    public abstract int z(@NotNull w.e eVar);

    public I(@NotNull Parcel parcel) {
        C6562gT0.p(parcel, "source");
        l0 l0Var = l0.a;
        Map<String, String> y0 = l0.y0(parcel);
        this.X = y0 == null ? null : C8926q81.J0(y0);
    }
}
