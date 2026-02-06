package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.C2416z;
import com.facebook.EnumC2354h;
import com.facebook.internal.Z;
import com.facebook.internal.a0;
import com.facebook.internal.l0;
import com.facebook.login.I;
import com.facebook.login.w;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import o.B22;
import o.C6562gT0;
import o.C8222nF;
import o.C9516sY;
import o.InterfaceC7058iW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.login.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2401s extends I {
    @Nullable
    public C2400q b1;
    @NotNull
    public final String c1;
    @NotNull
    public static final b d1 = new b(null);
    @InterfaceC7058iW0
    @NotNull
    public static final Parcelable.Creator<C2401s> CREATOR = new a();

    /* renamed from: com.facebook.login.s$a */
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<C2401s> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public C2401s createFromParcel(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "source");
            return new C2401s(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public C2401s[] newArray(int i) {
            return new C2401s[i];
        }
    }

    /* renamed from: com.facebook.login.s$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        public b() {
        }
    }

    /* renamed from: com.facebook.login.s$c */
    /* loaded from: classes2.dex */
    public static final class c implements l0.a {
        public final /* synthetic */ Bundle a;
        public final /* synthetic */ C2401s b;
        public final /* synthetic */ w.e c;

        public c(Bundle bundle, C2401s c2401s, w.e eVar) {
            this.a = bundle;
            this.b = c2401s;
            this.c = eVar;
        }

        @Override // com.facebook.internal.l0.a
        public void a(@Nullable JSONObject jSONObject) {
            String string;
            try {
                Bundle bundle = this.a;
                if (jSONObject == null) {
                    string = null;
                } else {
                    string = jSONObject.getString("id");
                }
                bundle.putString(Z.t0, string);
                this.b.D(this.c, this.a);
            } catch (JSONException e) {
                this.b.h().g(w.f.c.e(w.f.d1, this.b.h().C(), "Caught exception", e.getMessage(), null, 8, null));
            }
        }

        @Override // com.facebook.internal.l0.a
        public void b(@Nullable C2416z c2416z) {
            String message;
            w h = this.b.h();
            w.f.c cVar = w.f.d1;
            w.e C = this.b.h().C();
            if (c2416z == null) {
                message = null;
            } else {
                message = c2416z.getMessage();
            }
            h.g(w.f.c.e(cVar, C, "Caught exception", message, null, 8, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2401s(@NotNull w wVar) {
        super(wVar);
        C6562gT0.p(wVar, A.s2);
        this.c1 = "get_token";
    }

    public static final void E(C2401s c2401s, w.e eVar, Bundle bundle) {
        C6562gT0.p(c2401s, "this$0");
        C6562gT0.p(eVar, "$request");
        c2401s.C(eVar, bundle);
    }

    public final void B(@NotNull w.e eVar, @NotNull Bundle bundle) {
        C6562gT0.p(eVar, "request");
        C6562gT0.p(bundle, "result");
        String string = bundle.getString(Z.t0);
        if (string != null && string.length() != 0) {
            D(eVar, bundle);
            return;
        }
        h().I();
        String string2 = bundle.getString(Z.y0);
        if (string2 != null) {
            l0 l0Var = l0.a;
            l0.H(string2, new c(bundle, this, eVar));
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void C(@NotNull w.e eVar, @Nullable Bundle bundle) {
        C6562gT0.p(eVar, "request");
        C2400q c2400q = this.b1;
        if (c2400q != null) {
            c2400q.h(null);
        }
        this.b1 = null;
        h().J();
        if (bundle != null) {
            List stringArrayList = bundle.getStringArrayList(Z.q0);
            if (stringArrayList == null) {
                stringArrayList = C8222nF.H();
            }
            Set<String> s = eVar.s();
            if (s == null) {
                s = B22.k();
            }
            String string = bundle.getString(Z.B0);
            if (s.contains("openid") && (string == null || string.length() == 0)) {
                h().c0();
                return;
            } else if (stringArrayList.containsAll(s)) {
                B(eVar, bundle);
                return;
            } else {
                HashSet hashSet = new HashSet();
                for (String str : s) {
                    if (!stringArrayList.contains(str)) {
                        hashSet.add(str);
                    }
                }
                if (!hashSet.isEmpty()) {
                    a(C.E, TextUtils.join(",", hashSet));
                }
                eVar.E(hashSet);
            }
        }
        h().c0();
    }

    public final void D(@NotNull w.e eVar, @NotNull Bundle bundle) {
        w.f e;
        C6562gT0.p(eVar, "request");
        C6562gT0.p(bundle, "result");
        try {
            I.a aVar = I.Z;
            e = w.f.d1.b(eVar, aVar.a(bundle, EnumC2354h.FACEBOOK_APPLICATION_SERVICE, eVar.a()), aVar.c(bundle, eVar.q()));
        } catch (C2416z e2) {
            e = w.f.c.e(w.f.d1, h().C(), null, e2.getMessage(), null, 8, null);
        }
        h().h(e);
    }

    @Override // com.facebook.login.I
    public void b() {
        C2400q c2400q = this.b1;
        if (c2400q == null) {
            return;
        }
        c2400q.b();
        c2400q.h(null);
        this.b1 = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.I
    @NotNull
    public String m() {
        return this.c1;
    }

    @Override // com.facebook.login.I
    public int z(@NotNull final w.e eVar) {
        C6562gT0.p(eVar, "request");
        Context m = h().m();
        if (m == null) {
            com.facebook.M m2 = com.facebook.M.a;
            m = com.facebook.M.n();
        }
        C2400q c2400q = new C2400q(m, eVar);
        this.b1 = c2400q;
        if (C6562gT0.g(Boolean.valueOf(c2400q.i()), Boolean.FALSE)) {
            return 0;
        }
        h().I();
        a0.b bVar = new a0.b() { // from class: com.facebook.login.r
            @Override // com.facebook.internal.a0.b
            public final void a(Bundle bundle) {
                C2401s.E(C2401s.this, eVar, bundle);
            }
        };
        C2400q c2400q2 = this.b1;
        if (c2400q2 != null) {
            c2400q2.h(bVar);
            return 1;
        }
        return 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2401s(@NotNull Parcel parcel) {
        super(parcel);
        C6562gT0.p(parcel, "source");
        this.c1 = "get_token";
    }
}
