package com.facebook.gamingservices;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.C0376a;
import com.facebook.C2416z;
import com.facebook.InterfaceC2411u;
import com.facebook.internal.AbstractC2368m;
import com.facebook.internal.C2357b;
import com.facebook.internal.C2361f;
import com.facebook.internal.Z;
import java.util.ArrayList;
import java.util.List;
import o.C10169vE;
import o.C5913dr2;
import o.C6562gT0;
import o.C9516sY;
import o.D32;
import o.InterfaceC4907Zh;
import o.WT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC4907Zh
/* loaded from: classes2.dex */
public final class L extends AbstractC2368m<E, d> {
    @NotNull
    public static final b k = new b(null);
    public static final int l = C2361f.c.TournamentShareDialog.g();
    @Nullable
    public Number i;
    @Nullable
    public A j;

    /* loaded from: classes2.dex */
    public final class a extends AbstractC2368m<E, d>.b {
        public final /* synthetic */ L c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(L l) {
            super(l);
            C6562gT0.p(l, "this$0");
            this.c = l;
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        /* renamed from: e */
        public boolean a(@Nullable E e, boolean z) {
            return true;
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        @NotNull
        /* renamed from: f */
        public C2357b b(@Nullable E e) {
            Uri d;
            C2357b m = this.c.m();
            C0376a i = C0376a.g1.i();
            if (i != null && !i.C()) {
                if (i.s() != null && !C6562gT0.g(com.facebook.M.P, i.s())) {
                    throw new C2416z("Attempted to share tournament without without gaming login");
                }
                Number A = this.c.A();
                if (A != null) {
                    if (e != null) {
                        d = C5913dr2.a.c(e, A, i.h());
                    } else {
                        A B = this.c.B();
                        if (B == null) {
                            d = null;
                        } else {
                            d = C5913dr2.a.d(B.X, A, i.h());
                        }
                    }
                    Intent intent = new Intent("android.intent.action.VIEW", d);
                    L l = this.c;
                    l.x(intent, l.q());
                    return m;
                }
                throw new C2416z("Attempted to share tournament without a score");
            }
            throw new C2416z("Attempted to share tournament with an invalid access token");
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
    public final class c extends AbstractC2368m<E, d>.b {
        public final /* synthetic */ L c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(L l) {
            super(l);
            C6562gT0.p(l, "this$0");
            this.c = l;
        }

        @Override // com.facebook.internal.AbstractC2368m.b
        /* renamed from: e */
        public boolean a(@Nullable E e, boolean z) {
            com.facebook.M m = com.facebook.M.a;
            PackageManager packageManager = com.facebook.M.n().getPackageManager();
            C6562gT0.o(packageManager, "getApplicationContext().packageManager");
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
        public C2357b b(@Nullable E e) {
            Bundle b;
            C0376a i = C0376a.g1.i();
            C2357b m = this.c.m();
            Intent intent = new Intent(J.f99o);
            intent.setType("text/plain");
            if (i != null && !i.C()) {
                if (i.s() != null && !C6562gT0.g(com.facebook.M.P, i.s())) {
                    throw new C2416z("Attempted to share tournament while user is not gaming logged in");
                }
                String h = i.h();
                Number A = this.c.A();
                if (A != null) {
                    if (e != null) {
                        b = C5913dr2.a.a(e, A, h);
                    } else {
                        A B = this.c.B();
                        if (B == null) {
                            b = null;
                        } else {
                            b = C5913dr2.a.b(B.X, A, h);
                        }
                    }
                    Z z = Z.a;
                    Z.E(intent, m.d().toString(), "", Z.G, b);
                    m.i(intent);
                    return m;
                }
                throw new C2416z("Attempted to share tournament without a score");
            }
            throw new C2416z("Attempted to share tournament with an invalid access token");
        }
    }

    /* loaded from: classes2.dex */
    public static final class d {
        @Nullable
        public String a;
        @Nullable
        public String b;

        public d(@NotNull Bundle bundle) {
            C6562gT0.p(bundle, "results");
            if (bundle.getString("request") != null) {
                this.a = bundle.getString("request");
            }
            this.b = bundle.getString("tournament_id");
        }

        @Nullable
        public final String a() {
            return this.a;
        }

        @Nullable
        public final String b() {
            return this.b;
        }

        public final void c(@Nullable String str) {
            this.a = str;
        }

        public final void d(@Nullable String str) {
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
                } else if (bundle.getString("tournament_id") != null) {
                    this.b.a(new d(bundle));
                    return;
                }
            }
            a(c2357b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(@NotNull Activity activity) {
        super(activity, l);
        C6562gT0.p(activity, androidx.appcompat.widget.b.r);
    }

    public static final boolean C(L l2, WT1 wt1, int i, Intent intent) {
        C6562gT0.p(l2, "this$0");
        D32 d32 = D32.a;
        return D32.q(l2.q(), i, intent, wt1);
    }

    @Nullable
    public final Number A() {
        return this.i;
    }

    @Nullable
    public final A B() {
        return this.j;
    }

    public final void D(@Nullable Number number) {
        this.i = number;
    }

    public final void E(@Nullable A a2) {
        this.j = a2;
    }

    public final void F(@NotNull Number number, @NotNull A a2) {
        C6562gT0.p(number, "score");
        C6562gT0.p(a2, "tournament");
        this.i = number;
        this.j = a2;
        w(null, AbstractC2368m.h);
    }

    public final void G(@NotNull Number number, @NotNull E e2) {
        C6562gT0.p(number, "score");
        C6562gT0.p(e2, "newTournamentConfig");
        this.i = number;
        w(e2, AbstractC2368m.h);
    }

    @Override // com.facebook.internal.AbstractC2368m
    /* renamed from: H */
    public void w(@Nullable E e2, @NotNull Object obj) {
        C6562gT0.p(obj, "mode");
        if (C10169vE.f()) {
            return;
        }
        super.w(e2, obj);
    }

    @Override // com.facebook.internal.AbstractC2368m
    @NotNull
    public C2357b m() {
        return new C2357b(q(), null, 2, null);
    }

    @Override // com.facebook.internal.AbstractC2368m
    @NotNull
    public List<AbstractC2368m<E, d>.b> p() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new c(this));
        arrayList.add(new a(this));
        return arrayList;
    }

    @Override // com.facebook.internal.AbstractC2368m
    public void s(@NotNull C2361f c2361f, @NotNull InterfaceC2411u<d> interfaceC2411u) {
        C6562gT0.p(c2361f, "callbackManager");
        C6562gT0.p(interfaceC2411u, "callback");
        final e eVar = new e(interfaceC2411u);
        c2361f.b(q(), new C2361f.a() { // from class: com.facebook.gamingservices.K
            @Override // com.facebook.internal.C2361f.a
            public final boolean a(int i, Intent intent) {
                boolean C;
                C = L.C(L.this, eVar, i, intent);
                return C;
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public L(@NotNull Fragment fragment) {
        this(new com.facebook.internal.I(fragment));
        C6562gT0.p(fragment, "fragment");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public L(@NotNull android.app.Fragment fragment) {
        this(new com.facebook.internal.I(fragment));
        C6562gT0.p(fragment, "fragment");
    }

    public L(com.facebook.internal.I i) {
        super(i, l);
    }
}
