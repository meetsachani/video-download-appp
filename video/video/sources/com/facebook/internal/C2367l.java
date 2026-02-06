package com.facebook.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import com.facebook.C2416z;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookActivity;
import com.facebook.InterfaceC2407p;
import com.facebook.internal.C2379y;
import com.facebook.internal.Z;
import o.AbstractC5244b6;
import o.C6562gT0;
import o.C7458kA2;
import o.C9998uW1;
import o.H5;
import o.InterfaceC9511sW0;
import o.O5;
import o.RP1;
import o.X5;
import o.XE2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.facebook.internal.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2367l {
    @NotNull
    public static final C2367l a = new C2367l();

    /* renamed from: com.facebook.internal.l$a */
    /* loaded from: classes2.dex */
    public interface a {
        @Nullable
        Bundle a();

        @Nullable
        Bundle getParameters();
    }

    /* renamed from: com.facebook.internal.l$b */
    /* loaded from: classes2.dex */
    public static final class b extends O5<Intent, Pair<Integer, Intent>> {
        @Override // o.O5
        @NotNull
        /* renamed from: d */
        public Intent a(@NotNull Context context, @NotNull Intent intent) {
            C6562gT0.p(context, "context");
            C6562gT0.p(intent, "input");
            return intent;
        }

        @Override // o.O5
        @NotNull
        /* renamed from: e */
        public Pair<Integer, Intent> c(int i, @Nullable Intent intent) {
            Pair<Integer, Intent> create = Pair.create(Integer.valueOf(i), intent);
            C6562gT0.o(create, "create(resultCode, intent)");
            return create;
        }
    }

    @InterfaceC9511sW0
    public static final boolean b(@NotNull InterfaceC2365j interfaceC2365j) {
        C6562gT0.p(interfaceC2365j, XE2.g);
        if (e(interfaceC2365j).f() != -1) {
            return true;
        }
        return false;
    }

    @InterfaceC9511sW0
    public static final boolean c(@NotNull InterfaceC2365j interfaceC2365j) {
        C6562gT0.p(interfaceC2365j, XE2.g);
        if (a.d(interfaceC2365j) != null) {
            return true;
        }
        return false;
    }

    @InterfaceC9511sW0
    @NotNull
    public static final Z.f e(@NotNull InterfaceC2365j interfaceC2365j) {
        C6562gT0.p(interfaceC2365j, XE2.g);
        com.facebook.M m = com.facebook.M.a;
        String o2 = com.facebook.M.o();
        String g = interfaceC2365j.g();
        int[] f = a.f(o2, g, interfaceC2365j);
        Z z = Z.a;
        return Z.v(g, f);
    }

    @InterfaceC9511sW0
    public static final void g(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        C6562gT0.p(context, "context");
        C6562gT0.p(str, "eventName");
        C6562gT0.p(str2, "outcome");
        com.facebook.appevents.K k = new com.facebook.appevents.K(context);
        Bundle bundle = new Bundle();
        bundle.putString(C2356a.r, str2);
        k.m(str, bundle);
    }

    @InterfaceC9511sW0
    public static final void h(@NotNull C2357b c2357b, @NotNull Activity activity) {
        C6562gT0.p(c2357b, "appCall");
        C6562gT0.p(activity, androidx.appcompat.widget.b.r);
        activity.startActivityForResult(c2357b.f(), c2357b.e());
        c2357b.g();
    }

    @InterfaceC9511sW0
    public static final void i(@NotNull C2357b c2357b, @NotNull I i) {
        C6562gT0.p(c2357b, "appCall");
        C6562gT0.p(i, "fragmentWrapper");
        i.d(c2357b.f(), c2357b.e());
        c2357b.g();
    }

    @InterfaceC9511sW0
    public static final void j(@NotNull C2357b c2357b, @NotNull AbstractC5244b6 abstractC5244b6, @Nullable InterfaceC2407p interfaceC2407p) {
        C6562gT0.p(c2357b, "appCall");
        C6562gT0.p(abstractC5244b6, "registry");
        Intent f = c2357b.f();
        if (f == null) {
            return;
        }
        r(abstractC5244b6, interfaceC2407p, f, c2357b.e());
        c2357b.g();
    }

    @InterfaceC9511sW0
    public static final void k(@NotNull C2357b c2357b) {
        C6562gT0.p(c2357b, "appCall");
        o(c2357b, new C2416z("Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."));
    }

    @InterfaceC9511sW0
    public static final void l(@NotNull C2357b c2357b, @Nullable String str, @Nullable Bundle bundle) {
        C6562gT0.p(c2357b, "appCall");
        m0 m0Var = m0.a;
        com.facebook.M m = com.facebook.M.a;
        Context n = com.facebook.M.n();
        C2364i c2364i = C2364i.a;
        m0.h(n, C2364i.b());
        m0.k(com.facebook.M.n());
        Intent intent = new Intent(com.facebook.M.n(), CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.Y0, str);
        intent.putExtra(CustomTabMainActivity.Z0, bundle);
        intent.putExtra(CustomTabMainActivity.a1, C2364i.a());
        Z z = Z.a;
        Z.E(intent, c2357b.d().toString(), str, Z.y(), null);
        c2357b.i(intent);
    }

    @InterfaceC9511sW0
    public static final void m(@NotNull C2357b c2357b, @Nullable C2416z c2416z) {
        C6562gT0.p(c2357b, "appCall");
        if (c2416z == null) {
            return;
        }
        m0 m0Var = m0.a;
        com.facebook.M m = com.facebook.M.a;
        m0.i(com.facebook.M.n());
        Intent intent = new Intent();
        intent.setClass(com.facebook.M.n(), FacebookActivity.class);
        intent.setAction(FacebookActivity.B1);
        Z z = Z.a;
        Z.E(intent, c2357b.d().toString(), null, Z.y(), Z.i(c2416z));
        c2357b.i(intent);
    }

    @InterfaceC9511sW0
    public static final void n(@NotNull C2357b c2357b, @NotNull a aVar, @NotNull InterfaceC2365j interfaceC2365j) {
        Bundle a2;
        C6562gT0.p(c2357b, "appCall");
        C6562gT0.p(aVar, "parameterProvider");
        C6562gT0.p(interfaceC2365j, XE2.g);
        com.facebook.M m = com.facebook.M.a;
        Context n = com.facebook.M.n();
        String g = interfaceC2365j.g();
        Z.f e = e(interfaceC2365j);
        int f = e.f();
        if (f != -1) {
            Z z = Z.a;
            if (Z.D(f)) {
                a2 = aVar.getParameters();
            } else {
                a2 = aVar.a();
            }
            if (a2 == null) {
                a2 = new Bundle();
            }
            Intent l = Z.l(n, c2357b.d().toString(), g, e, a2);
            if (l != null) {
                c2357b.i(l);
                return;
            }
            throw new C2416z("Unable to create Intent; this likely means theFacebook app is not installed.");
        }
        throw new C2416z("Cannot present this dialog. This likely means that the Facebook app is not installed.");
    }

    @InterfaceC9511sW0
    public static final void o(@NotNull C2357b c2357b, @Nullable C2416z c2416z) {
        C6562gT0.p(c2357b, "appCall");
        m(c2357b, c2416z);
    }

    @InterfaceC9511sW0
    public static final void p(@NotNull C2357b c2357b, @Nullable String str, @Nullable Bundle bundle) {
        C6562gT0.p(c2357b, "appCall");
        m0 m0Var = m0.a;
        com.facebook.M m = com.facebook.M.a;
        m0.i(com.facebook.M.n());
        m0.k(com.facebook.M.n());
        Bundle bundle2 = new Bundle();
        bundle2.putString("action", str);
        bundle2.putBundle("params", bundle);
        Intent intent = new Intent();
        Z z = Z.a;
        Z.E(intent, c2357b.d().toString(), str, Z.y(), bundle2);
        intent.setClass(com.facebook.M.n(), FacebookActivity.class);
        intent.setAction(C2371p.K2);
        c2357b.i(intent);
    }

    @InterfaceC9511sW0
    public static final void q(@NotNull C2357b c2357b, @Nullable Bundle bundle, @NotNull InterfaceC2365j interfaceC2365j) {
        Uri g;
        C6562gT0.p(c2357b, "appCall");
        C6562gT0.p(interfaceC2365j, XE2.g);
        m0 m0Var = m0.a;
        com.facebook.M m = com.facebook.M.a;
        m0.i(com.facebook.M.n());
        m0.k(com.facebook.M.n());
        String name = interfaceC2365j.name();
        Uri d = a.d(interfaceC2365j);
        if (d != null) {
            Z z = Z.a;
            int y = Z.y();
            c0 c0Var = c0.a;
            String uuid = c2357b.d().toString();
            C6562gT0.o(uuid, "appCall.callId.toString()");
            Bundle l = c0.l(uuid, y, bundle);
            if (l != null) {
                if (d.isRelative()) {
                    l0 l0Var = l0.a;
                    g = l0.g(c0.b(), d.toString(), l);
                } else {
                    l0 l0Var2 = l0.a;
                    g = l0.g(d.getAuthority(), d.getPath(), l);
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("url", g.toString());
                bundle2.putBoolean(Z.e1, true);
                Intent intent = new Intent();
                Z.E(intent, c2357b.d().toString(), interfaceC2365j.g(), Z.y(), bundle2);
                intent.setClass(com.facebook.M.n(), FacebookActivity.class);
                intent.setAction(C2371p.K2);
                c2357b.i(intent);
                return;
            }
            throw new C2416z("Unable to fetch the app's key-hash");
        }
        throw new C2416z("Unable to fetch the Url for the DialogFeature : '" + name + '\'');
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, o.X5] */
    @InterfaceC9511sW0
    public static final void r(@NotNull AbstractC5244b6 abstractC5244b6, @Nullable final InterfaceC2407p interfaceC2407p, @NotNull Intent intent, final int i) {
        C6562gT0.p(abstractC5244b6, "registry");
        C6562gT0.p(intent, C9998uW1.R);
        final RP1.h hVar = new RP1.h();
        ?? n = abstractC5244b6.n(C6562gT0.C("facebook-dialog-request-", Integer.valueOf(i)), new b(), new H5() { // from class: com.facebook.internal.k
            @Override // o.H5
            public final void a(Object obj) {
                C2367l.s(InterfaceC2407p.this, i, hVar, (Pair) obj);
            }
        });
        hVar.X = n;
        if (n == 0) {
            return;
        }
        n.b(intent);
    }

    public static final void s(InterfaceC2407p interfaceC2407p, int i, RP1.h hVar, Pair pair) {
        C6562gT0.p(hVar, "$launcher");
        if (interfaceC2407p == null) {
            interfaceC2407p = new C2361f();
        }
        Object obj = pair.first;
        C6562gT0.o(obj, "result.first");
        interfaceC2407p.onActivityResult(i, ((Number) obj).intValue(), (Intent) pair.second);
        X5 x5 = (X5) hVar.X;
        if (x5 == null) {
            return;
        }
        synchronized (x5) {
            x5.d();
            hVar.X = null;
            C7458kA2 c7458kA2 = C7458kA2.a;
        }
    }

    public final Uri d(InterfaceC2365j interfaceC2365j) {
        String name = interfaceC2365j.name();
        String g = interfaceC2365j.g();
        com.facebook.M m = com.facebook.M.a;
        C2379y.b a2 = C2379y.z.a(com.facebook.M.o(), g, name);
        if (a2 != null) {
            return a2.b();
        }
        return null;
    }

    public final int[] f(String str, String str2, InterfaceC2365j interfaceC2365j) {
        int[] d;
        C2379y.b a2 = C2379y.z.a(str, str2, interfaceC2365j.name());
        if (a2 == null) {
            d = null;
        } else {
            d = a2.d();
        }
        return d == null ? new int[]{interfaceC2365j.e()} : d;
    }
}
