package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.C2416z;
import com.facebook.EnumC2354h;
import com.facebook.internal.C2371p;
import com.facebook.internal.c0;
import com.facebook.internal.l0;
import com.facebook.internal.q0;
import com.facebook.login.w;
import com.google.firebase.crashlytics.internal.analytics.BreadcrumbAnalyticsEventReceiver;
import o.ActivityC4864Yy0;
import o.C6562gT0;
import o.C9516sY;
import o.HT1;
import o.InterfaceC7058iW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@HT1({HT1.a.Y})
/* loaded from: classes2.dex */
public class U extends T {
    @NotNull
    public static final String k1 = "oauth";
    @Nullable
    public q0 f1;
    @Nullable
    public String g1;
    @NotNull
    public final String h1;
    @NotNull
    public final EnumC2354h i1;
    @NotNull
    public static final c j1 = new c(null);
    @InterfaceC7058iW0
    @NotNull
    public static final Parcelable.Creator<U> CREATOR = new b();

    /* loaded from: classes2.dex */
    public final class a extends q0.a {
        @NotNull
        public String h;
        @NotNull
        public v i;
        @NotNull
        public L j;
        public boolean k;
        public boolean l;
        public String m;
        public String n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ U f141o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull U u, @NotNull Context context, @NotNull String str, Bundle bundle) {
            super(context, str, "oauth", bundle);
            C6562gT0.p(u, "this$0");
            C6562gT0.p(context, "context");
            C6562gT0.p(str, "applicationId");
            C6562gT0.p(bundle, BreadcrumbAnalyticsEventReceiver.c);
            this.f141o = u;
            this.h = c0.Q;
            this.i = v.NATIVE_WITH_FALLBACK;
            this.j = L.FACEBOOK;
        }

        @Override // com.facebook.internal.q0.a
        @NotNull
        public q0 a() {
            String str;
            Bundle f = f();
            if (f != null) {
                f.putString(c0.w, this.h);
                f.putString("client_id", c());
                f.putString("e2e", k());
                if (this.j == L.INSTAGRAM) {
                    str = c0.M;
                } else {
                    str = c0.N;
                }
                f.putString(c0.x, str);
                f.putString(c0.y, "true");
                f.putString(c0.h, j());
                f.putString("login_behavior", this.i.name());
                if (this.k) {
                    f.putString(c0.J, this.j.toString());
                }
                if (this.l) {
                    f.putString(c0.K, "true");
                }
                q0.b bVar = q0.h1;
                Context d = d();
                if (d != null) {
                    return bVar.d(d, "oauth", f, g(), this.j, e());
                }
                throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Bundle");
        }

        @NotNull
        public final String j() {
            String str = this.n;
            if (str != null) {
                return str;
            }
            C6562gT0.S("authType");
            throw null;
        }

        @NotNull
        public final String k() {
            String str = this.m;
            if (str != null) {
                return str;
            }
            C6562gT0.S("e2e");
            throw null;
        }

        @NotNull
        public final a l(@NotNull String str) {
            C6562gT0.p(str, "authType");
            m(str);
            return this;
        }

        public final void m(@NotNull String str) {
            C6562gT0.p(str, "<set-?>");
            this.n = str;
        }

        @NotNull
        public final a n(@NotNull String str) {
            C6562gT0.p(str, "e2e");
            o(str);
            return this;
        }

        public final void o(@NotNull String str) {
            C6562gT0.p(str, "<set-?>");
            this.m = str;
        }

        @NotNull
        public final a p(boolean z) {
            this.k = z;
            return this;
        }

        @NotNull
        public final a q(boolean z) {
            String str;
            if (z) {
                str = c0.R;
            } else {
                str = c0.Q;
            }
            this.h = str;
            return this;
        }

        @NotNull
        public final a r(boolean z) {
            return this;
        }

        @NotNull
        public final a s(@NotNull v vVar) {
            C6562gT0.p(vVar, "loginBehavior");
            this.i = vVar;
            return this;
        }

        @NotNull
        public final a t(@NotNull L l) {
            C6562gT0.p(l, "targetApp");
            this.j = l;
            return this;
        }

        @NotNull
        public final a u(boolean z) {
            this.l = z;
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<U> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public U createFromParcel(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "source");
            return new U(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public U[] newArray(int i) {
            return new U[i];
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(C9516sY c9516sY) {
            this();
        }

        public c() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements q0.e {
        public final /* synthetic */ w.e b;

        public d(w.e eVar) {
            this.b = eVar;
        }

        @Override // com.facebook.internal.q0.e
        public void a(@Nullable Bundle bundle, @Nullable C2416z c2416z) {
            U.this.N(this.b, bundle, c2416z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(@NotNull w wVar) {
        super(wVar);
        C6562gT0.p(wVar, A.s2);
        this.h1 = "web_view";
        this.i1 = EnumC2354h.WEB_VIEW;
    }

    @Override // com.facebook.login.T
    @NotNull
    public EnumC2354h D() {
        return this.i1;
    }

    @Nullable
    public final String K() {
        return this.g1;
    }

    @Nullable
    public final q0 L() {
        return this.f1;
    }

    public final void N(@NotNull w.e eVar, @Nullable Bundle bundle, @Nullable C2416z c2416z) {
        C6562gT0.p(eVar, "request");
        super.I(eVar, bundle, c2416z);
    }

    public final void O(@Nullable String str) {
        this.g1 = str;
    }

    public final void P(@Nullable q0 q0Var) {
        this.f1 = q0Var;
    }

    @Override // com.facebook.login.I
    public void b() {
        q0 q0Var = this.f1;
        if (q0Var != null) {
            if (q0Var != null) {
                q0Var.cancel();
            }
            this.f1 = null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.I
    @NotNull
    public String m() {
        return this.h1;
    }

    @Override // com.facebook.login.I
    public boolean s() {
        return true;
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
        Bundle B = B(eVar);
        d dVar = new d(eVar);
        String a2 = w.h1.a();
        this.g1 = a2;
        a("e2e", a2);
        ActivityC4864Yy0 m = h().m();
        if (m == null) {
            return 0;
        }
        l0 l0Var = l0.a;
        boolean Z = l0.Z(m);
        a aVar = new a(this, m, eVar.a(), B);
        String str = this.g1;
        if (str != null) {
            this.f1 = aVar.n(str).q(Z).l(eVar.c()).s(eVar.m()).t(eVar.n()).p(eVar.v()).u(eVar.L()).h(dVar).a();
            C2371p c2371p = new C2371p();
            c2371p.s2(true);
            c2371p.m3(this.f1);
            c2371p.c3(m.W0(), C2371p.K2);
            return 1;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(@NotNull Parcel parcel) {
        super(parcel);
        C6562gT0.p(parcel, "source");
        this.h1 = "web_view";
        this.i1 = EnumC2354h.WEB_VIEW;
        this.g1 = parcel.readString();
    }
}
