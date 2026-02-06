package com.facebook.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.facebook.C2416z;
import com.facebook.CustomTabMainActivity;
import com.facebook.EnumC2354h;
import com.facebook.internal.C2363h;
import com.facebook.internal.C2364i;
import com.facebook.internal.Z;
import com.facebook.internal.c0;
import com.facebook.internal.l0;
import com.facebook.internal.m0;
import com.facebook.login.w;
import o.ActivityC4864Yy0;
import o.C6562gT0;
import o.C9516sY;
import o.C9545sf2;
import o.InterfaceC7058iW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.login.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2387d extends T {
    public static final int l1 = 1;
    public static final int m1 = 20;
    public static final int n1 = 4201;
    @NotNull
    public static final String o1 = "oauth";
    @InterfaceC7058iW0
    public static boolean p1;
    @Nullable
    public String f1;
    @Nullable
    public String g1;
    @NotNull
    public String h1;
    @NotNull
    public final String i1;
    @NotNull
    public final EnumC2354h j1;
    @NotNull
    public static final b k1 = new b(null);
    @InterfaceC7058iW0
    @NotNull
    public static final Parcelable.Creator<C2387d> CREATOR = new a();

    /* renamed from: com.facebook.login.d$a */
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<C2387d> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public C2387d createFromParcel(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "source");
            return new C2387d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public C2387d[] newArray(int i) {
            return new C2387d[i];
        }
    }

    /* renamed from: com.facebook.login.d$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        public b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2387d(@NotNull w wVar) {
        super(wVar);
        C6562gT0.p(wVar, A.s2);
        this.i1 = "custom_tab";
        this.j1 = EnumC2354h.CHROME_CUSTOM_TAB;
        l0 l0Var = l0.a;
        this.g1 = l0.t(20);
        p1 = false;
        C2364i c2364i = C2364i.a;
        this.h1 = C2364i.c(N());
    }

    public static final void P(C2387d c2387d, w.e eVar, Bundle bundle) {
        C6562gT0.p(c2387d, "this$0");
        C6562gT0.p(eVar, "$request");
        C6562gT0.p(bundle, "$values");
        try {
            c2387d.I(eVar, c2387d.u(eVar, bundle), null);
        } catch (C2416z e) {
            c2387d.I(eVar, null, e);
        }
    }

    @Override // com.facebook.login.T
    @Nullable
    public String C() {
        return "chrome_custom_tab";
    }

    @Override // com.facebook.login.T
    @NotNull
    public EnumC2354h D() {
        return this.j1;
    }

    public final String L() {
        String str = this.f1;
        if (str != null) {
            return str;
        }
        C2364i c2364i = C2364i.a;
        String a2 = C2364i.a();
        this.f1 = a2;
        return a2;
    }

    public final String N() {
        return super.n();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O(String str, final w.e eVar) {
        int i;
        if (str != null) {
            if (C9545sf2.J2(str, m0.g, false, 2, null) || C9545sf2.J2(str, super.n(), false, 2, null)) {
                Uri parse = Uri.parse(str);
                l0 l0Var = l0.a;
                final Bundle r0 = l0.r0(parse.getQuery());
                r0.putAll(l0.r0(parse.getFragment()));
                if (!R(r0)) {
                    super.I(eVar, null, new C2416z("Invalid state parameter"));
                    return;
                }
                String string = r0.getString("error");
                if (string == null) {
                    string = r0.getString("error_type");
                }
                String string2 = r0.getString(com.facebook.C.u1);
                if (string2 == null) {
                    string2 = r0.getString("error_message");
                }
                if (string2 == null) {
                    string2 = r0.getString(Z.Q0);
                }
                String string3 = r0.getString("error_code");
                if (string3 != null) {
                    try {
                        i = Integer.parseInt(string3);
                    } catch (NumberFormatException unused) {
                        i = -1;
                    }
                    l0 l0Var2 = l0.a;
                    if (!l0.f0(string) && l0.f0(string2) && i == -1) {
                        if (r0.containsKey("access_token")) {
                            super.I(eVar, r0, null);
                            return;
                        }
                        com.facebook.M m = com.facebook.M.a;
                        com.facebook.M.y().execute(new Runnable() { // from class: com.facebook.login.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                C2387d.P(C2387d.this, eVar, r0);
                            }
                        });
                        return;
                    } else if (string == null && (C6562gT0.g(string, "access_denied") || C6562gT0.g(string, "OAuthAccessDeniedException"))) {
                        super.I(eVar, null, new com.facebook.B());
                        return;
                    } else if (i != 4201) {
                        super.I(eVar, null, new com.facebook.B());
                        return;
                    } else {
                        super.I(eVar, null, new com.facebook.P(new com.facebook.C(i, string, string2), string2));
                        return;
                    }
                }
                i = -1;
                l0 l0Var22 = l0.a;
                if (!l0.f0(string)) {
                }
                if (string == null) {
                }
                if (i != 4201) {
                }
            }
        }
    }

    public final boolean R(Bundle bundle) {
        try {
            String string = bundle.getString("state");
            if (string == null) {
                return false;
            }
            return C6562gT0.g(new JSONObject(string).getString(C.A), this.g1);
        } catch (JSONException unused) {
            return false;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.I
    @NotNull
    public String m() {
        return this.i1;
    }

    @Override // com.facebook.login.I
    @NotNull
    public String n() {
        return this.h1;
    }

    @Override // com.facebook.login.I
    public boolean t(int i, int i2, @Nullable Intent intent) {
        if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.e1, false)) {
            return super.t(i, i2, intent);
        }
        if (i != 1) {
            return super.t(i, i2, intent);
        }
        w.e C = h().C();
        if (C == null) {
            return false;
        }
        String str = null;
        if (i2 == -1) {
            if (intent != null) {
                str = intent.getStringExtra(CustomTabMainActivity.b1);
            }
            O(str, C);
            return true;
        }
        super.I(C, null, new com.facebook.B());
        return false;
    }

    @Override // com.facebook.login.I
    public void v(@NotNull JSONObject jSONObject) throws JSONException {
        C6562gT0.p(jSONObject, "param");
        jSONObject.put(C.A, this.g1);
    }

    @Override // com.facebook.login.I, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        C6562gT0.p(parcel, "dest");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.g1);
    }

    @Override // com.facebook.login.I
    public int z(@NotNull w.e eVar) {
        C6562gT0.p(eVar, "request");
        w h = h();
        if (n().length() == 0) {
            return 0;
        }
        Bundle A = A(B(eVar), eVar);
        if (p1) {
            A.putString(c0.F, "1");
        }
        if (com.facebook.M.L) {
            if (eVar.w()) {
                C2388e.Y.c(com.facebook.internal.P.c.a("oauth", A));
            } else {
                C2388e.Y.c(C2363h.b.a("oauth", A));
            }
        }
        ActivityC4864Yy0 m = h.m();
        if (m == null) {
            return 0;
        }
        Intent intent = new Intent(m, CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.Y0, "oauth");
        intent.putExtra(CustomTabMainActivity.Z0, A);
        intent.putExtra(CustomTabMainActivity.a1, L());
        intent.putExtra(CustomTabMainActivity.c1, eVar.n().toString());
        Fragment u = h.u();
        if (u != null) {
            u.startActivityForResult(intent, 1);
        }
        return 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2387d(@NotNull Parcel parcel) {
        super(parcel);
        C6562gT0.p(parcel, "source");
        this.i1 = "custom_tab";
        this.j1 = EnumC2354h.CHROME_CUSTOM_TAB;
        this.g1 = parcel.readString();
        C2364i c2364i = C2364i.a;
        this.h1 = C2364i.c(N());
    }
}
