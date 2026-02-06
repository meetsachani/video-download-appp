package com.facebook.gamingservices;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.C0376a;
import com.facebook.C2416z;
import com.facebook.InterfaceC2411u;
import com.facebook.internal.AbstractC2368m;
import com.facebook.internal.C2357b;
import com.facebook.internal.C2361f;
import com.facebook.internal.C2364i;
import com.facebook.internal.C2367l;
import com.facebook.internal.Z;
import com.facebook.internal.c0;
import java.util.List;
import o.C10169vE;
import o.C4946Zq2;
import o.C6562gT0;
import o.C8222nF;
import o.C9516sY;
import o.D32;
import o.InterfaceC4907Zh;
import o.WT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC4907Zh
/* loaded from: classes2.dex */
public final class J extends AbstractC2368m<String, d> {
    @NotNull
    public static final b l = new b(null);
    public static final int m = C2361f.c.TournamentJoinDialog.g();
    @NotNull
    public static final String n = "access_token";
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    public static final String f99o = "com.facebook.games.gaming_services.DEEPLINK";
    @NotNull
    public static final String p = "text/plain";
    @NotNull
    public static final String q = "join_tournament";
    @NotNull
    public static final String r = "error_message";
    @Nullable
    public String i;
    @Nullable
    public Number j;
    @Nullable
    public String k;

    /* loaded from: classes2.dex */
    public final class a extends AbstractC2368m<String, d>.b {
        public final /* synthetic */ J c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(J j) {
            super(j);
            C6562gT0.p(j, "this$0");
            this.c = j;
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        /* renamed from: e */
        public boolean a(@Nullable String str, boolean z) {
            C2364i c2364i = C2364i.a;
            if (C2364i.a() != null) {
                return true;
            }
            return false;
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        @NotNull
        /* renamed from: f */
        public C2357b b(@Nullable String str) {
            String h;
            C2357b m = this.c.m();
            C0376a i = C0376a.g1.i();
            Bundle bundle = new Bundle();
            Bundle bundle2 = new Bundle();
            String str2 = null;
            if (i == null) {
                h = null;
            } else {
                h = i.h();
            }
            if (h == null) {
                com.facebook.M m2 = com.facebook.M.a;
                h = com.facebook.M.o();
            }
            bundle.putString("app_id", h);
            bundle.putString("payload", bundle2.toString());
            if (i != null) {
                i.x();
            }
            if (i != null) {
                str2 = i.x();
            }
            bundle.putString("access_token", str2);
            C2364i c2364i = C2364i.a;
            bundle.putString(c0.w, C2364i.b());
            C2367l c2367l = C2367l.a;
            C2367l.l(m, J.q, bundle);
            return m;
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

    /* loaded from: classes2.dex */
    public final class c extends AbstractC2368m<String, d>.b {
        public final /* synthetic */ J c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(J j) {
            super(j);
            C6562gT0.p(j, "this$0");
            this.c = j;
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        /* renamed from: e */
        public boolean a(@Nullable String str, boolean z) {
            com.facebook.M m = com.facebook.M.a;
            PackageManager packageManager = com.facebook.M.n().getPackageManager();
            C6562gT0.o(packageManager, "FacebookSdk.getApplicationContext().packageManager");
            Intent intent = new Intent(J.f99o);
            intent.setType("text/plain");
            if (intent.resolveActivity(packageManager) != null) {
                return true;
            }
            return false;
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        @NotNull
        /* renamed from: f */
        public C2357b b(@Nullable String str) {
            C0376a i = C0376a.g1.i();
            C2357b m = this.c.m();
            Intent intent = new Intent(J.f99o);
            intent.setType("text/plain");
            if (i != null && !i.C()) {
                if (i.s() != null && !C6562gT0.g(com.facebook.M.P, i.s())) {
                    throw new C2416z("Attempted to present TournamentJoinDialog while user is not gaming logged in");
                }
                Bundle b = C4946Zq2.a.b(i.h(), this.c.i, this.c.k);
                Z z = Z.a;
                Z.E(intent, m.d().toString(), "", Z.G, b);
                m.i(intent);
                return m;
            }
            throw new C2416z("Attempted to present TournamentJoinDialog with an invalid access token");
        }
    }

    /* loaded from: classes2.dex */
    public static final class d {
        @Nullable
        public String a;
        @Nullable
        public String b;
        @Nullable
        public String c;

        public d(@NotNull Bundle bundle) {
            C6562gT0.p(bundle, "results");
            if (bundle.getString("request") != null) {
                this.a = bundle.getString("request");
            }
            this.b = bundle.getString("tournament_id");
            this.c = bundle.getString("payload");
        }

        @Nullable
        public final String a() {
            return this.c;
        }

        @Nullable
        public final String b() {
            return this.a;
        }

        @Nullable
        public final String c() {
            return this.b;
        }

        public final void d(@Nullable String str) {
            this.c = str;
        }

        public final void e(@Nullable String str) {
            this.a = str;
        }

        public final void f(@Nullable String str) {
            this.b = str;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends WT1 {
        public final /* synthetic */ InterfaceC2411u<d> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC2411u<d> interfaceC2411u) {
            super(interfaceC2411u);
            this.b = interfaceC2411u;
        }

        @Override // o.WT1
        public void c(@NotNull C2357b c2357b, @Nullable Bundle bundle) {
            C6562gT0.p(c2357b, "appCall");
            if (bundle != null) {
                if (bundle.getString("error_message") != null) {
                    this.b.b(new C2416z(bundle.getString("error_message")));
                    return;
                } else if (bundle.getString("payload") != null) {
                    this.b.a(new d(bundle));
                    return;
                }
            }
            a(c2357b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(@NotNull Activity activity) {
        super(activity, m);
        C6562gT0.p(activity, androidx.appcompat.widget.b.r);
    }

    public static final boolean C(J j, WT1 wt1, int i, Intent intent) {
        C6562gT0.p(j, "this$0");
        C6562gT0.p(wt1, "$resultProcessor");
        D32 d32 = D32.a;
        return D32.q(j.q(), i, intent, wt1);
    }

    @Override // com.facebook.internal.AbstractC2368m, com.facebook.InterfaceC2413w
    /* renamed from: B */
    public boolean g(@Nullable String str) {
        if (C10169vE.f()) {
            return false;
        }
        if (new c(this).a(str, true)) {
            return true;
        }
        return new a(this).a(str, true);
    }

    public final void D(@Nullable String str, @Nullable String str2) {
        this.i = str;
        this.k = str2;
        super.w(str, AbstractC2368m.h);
    }

    @Override // com.facebook.internal.AbstractC2368m
    /* renamed from: E */
    public void w(@Nullable String str, @NotNull Object obj) {
        C6562gT0.p(obj, "mode");
        if (C10169vE.f()) {
            return;
        }
        super.w(str, obj);
    }

    @Override // com.facebook.internal.AbstractC2368m
    @NotNull
    public C2357b m() {
        return new C2357b(q(), null, 2, null);
    }

    @Override // com.facebook.internal.AbstractC2368m
    @NotNull
    public List<AbstractC2368m<String, d>.b> p() {
        return C8222nF.O(new c(this), new a(this));
    }

    @Override // com.facebook.internal.AbstractC2368m
    public void s(@NotNull C2361f c2361f, @NotNull InterfaceC2411u<d> interfaceC2411u) {
        C6562gT0.p(c2361f, "callbackManager");
        C6562gT0.p(interfaceC2411u, "callback");
        final e eVar = new e(interfaceC2411u);
        c2361f.b(q(), new C2361f.a() { // from class: com.facebook.gamingservices.I
            @Override // com.facebook.internal.C2361f.a
            public final boolean a(int i, Intent intent) {
                boolean C;
                C = J.C(J.this, eVar, i, intent);
                return C;
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public J(@NotNull Fragment fragment) {
        this(new com.facebook.internal.I(fragment));
        C6562gT0.p(fragment, "fragment");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public J(@NotNull android.app.Fragment fragment) {
        this(new com.facebook.internal.I(fragment));
        C6562gT0.p(fragment, "fragment");
    }

    public J(com.facebook.internal.I i) {
        super(i, m);
    }
}
