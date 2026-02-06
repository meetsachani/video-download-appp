package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import o.AD1;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class zzavd implements zzavg {
    @InterfaceC11300zs1
    public static zzavd m1;
    public final Context X;
    public final zzfpk Y;
    public final zzfpt Y0;
    public final zzfpr Z;
    public final zzawi Z0;
    public final zzfnx a1;
    public final Executor b1;
    public final zzfpq c1;
    public final zzawx e1;
    @InterfaceC11300zs1
    public final zzawp f1;
    @InterfaceC11300zs1
    public final zzawg g1;
    public volatile boolean j1;
    public volatile boolean k1;
    public final int l1;
    @InterfaceC5056aJ2
    public volatile long h1 = 0;
    public final Object i1 = new Object();
    public final CountDownLatch d1 = new CountDownLatch(1);

    @InterfaceC5056aJ2
    public zzavd(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 zzfnx zzfnxVar, @InterfaceC5670cr1 zzfpk zzfpkVar, @InterfaceC5670cr1 zzfpr zzfprVar, @InterfaceC5670cr1 zzfpt zzfptVar, @InterfaceC5670cr1 zzawi zzawiVar, @InterfaceC5670cr1 Executor executor, @InterfaceC5670cr1 zzfns zzfnsVar, int i, @InterfaceC11300zs1 zzawx zzawxVar, @InterfaceC11300zs1 zzawp zzawpVar, @InterfaceC11300zs1 zzawg zzawgVar) {
        this.k1 = false;
        this.X = context;
        this.a1 = zzfnxVar;
        this.Y = zzfpkVar;
        this.Z = zzfprVar;
        this.Y0 = zzfptVar;
        this.Z0 = zzawiVar;
        this.b1 = executor;
        this.l1 = i;
        this.e1 = zzawxVar;
        this.f1 = zzawpVar;
        this.g1 = zzawgVar;
        this.k1 = false;
        this.c1 = new zzavb(this, zzfnsVar);
    }

    public static synchronized zzavd j(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 zzaro zzaroVar, boolean z) {
        zzavd s;
        synchronized (zzavd.class) {
            zzfny c = zzfnz.c();
            c.a(zzaroVar.w2());
            c.g(zzaroVar.i());
            s = s(context, Executors.newCachedThreadPool(), c.h(), z);
        }
        return s;
    }

    public static /* bridge */ /* synthetic */ void n(zzavd zzavdVar) {
        String str;
        String str2;
        int length;
        boolean a;
        long currentTimeMillis = System.currentTimeMillis();
        zzfpj u = zzavdVar.u(1);
        if (u != null) {
            String A2 = u.a().A2();
            str2 = u.a().z2();
            str = A2;
        } else {
            str = null;
            str2 = null;
        }
        try {
            try {
                Context context = zzavdVar.X;
                int i = zzavdVar.l1;
                zzfnx zzfnxVar = zzavdVar.a1;
                zzfpo a2 = zzfoh.a(context, 1, i, str, str2, "1", zzfnxVar);
                byte[] bArr = a2.Y;
                if (bArr != null && (length = bArr.length) != 0) {
                    try {
                        zzayg t2 = zzayg.t2(zzgxk.U(bArr, 0, length), zzgyc.a());
                        if (!t2.u2().A2().isEmpty() && !t2.u2().z2().isEmpty() && t2.v2().d().length != 0) {
                            zzfpj u2 = zzavdVar.u(1);
                            if (u2 != null) {
                                zzayj a3 = u2.a();
                                if (t2.u2().A2().equals(a3.A2())) {
                                    if (!t2.u2().z2().equals(a3.z2())) {
                                    }
                                }
                            }
                            zzfpq zzfpqVar = zzavdVar.c1;
                            int i2 = a2.Z;
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.D2)).booleanValue()) {
                                if (i2 == 3) {
                                    a = zzavdVar.Z.a(t2);
                                } else {
                                    if (i2 == 4) {
                                        a = zzavdVar.Z.b(t2, zzfpqVar);
                                    }
                                    zzavdVar.a1.d(4009, System.currentTimeMillis() - currentTimeMillis);
                                }
                            } else {
                                a = zzavdVar.Y.a(t2, zzfpqVar);
                            }
                            if (a) {
                                zzfpj u3 = zzavdVar.u(1);
                                if (u3 != null) {
                                    if (zzavdVar.Y0.c(u3)) {
                                        zzavdVar.k1 = true;
                                    }
                                    zzavdVar.h1 = System.currentTimeMillis() / 1000;
                                }
                            }
                            zzavdVar.a1.d(4009, System.currentTimeMillis() - currentTimeMillis);
                        }
                        zzavdVar.a1.d(5010, System.currentTimeMillis() - currentTimeMillis);
                    } catch (NullPointerException unused) {
                        zzavdVar.a1.d(2030, System.currentTimeMillis() - currentTimeMillis);
                    }
                } else {
                    zzfnxVar.d(5009, System.currentTimeMillis() - currentTimeMillis);
                }
            } catch (Throwable th) {
                zzavdVar.d1.countDown();
                throw th;
            }
        } catch (zzgzh e) {
            zzavdVar.a1.c(AD1.q1, System.currentTimeMillis() - currentTimeMillis, e);
        }
        zzavdVar.d1.countDown();
    }

    public static synchronized zzavd s(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Executor executor, zzfnz zzfnzVar, boolean z) {
        zzavd zzavdVar;
        zzavr zzavrVar;
        zzawx zzawxVar;
        zzawp zzawpVar;
        synchronized (zzavd.class) {
            try {
                if (m1 == null) {
                    zzfnx a = zzfnx.a(context, executor, z);
                    zzawg zzawgVar = null;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.G3)).booleanValue()) {
                        zzavrVar = zzavr.c(context);
                    } else {
                        zzavrVar = null;
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.H3)).booleanValue()) {
                        zzawxVar = zzawx.d(context, executor);
                    } else {
                        zzawxVar = null;
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.V2)).booleanValue()) {
                        zzawpVar = new zzawp();
                    } else {
                        zzawpVar = null;
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.d3)).booleanValue()) {
                        zzawgVar = new zzawg();
                    }
                    zzawg zzawgVar2 = zzawgVar;
                    zzfoo c = zzfoo.c(context, executor, a, zzfnzVar);
                    zzawh zzawhVar = new zzawh(context);
                    zzawi zzawiVar = new zzawi(zzfnzVar, c, new zzawv(context, zzawhVar), zzawhVar, zzavrVar, zzawxVar, zzawpVar, zzawgVar2);
                    int b = zzfox.b(context, a);
                    zzfns zzfnsVar = new zzfns();
                    zzavd zzavdVar2 = new zzavd(context, a, new zzfpk(context, b), new zzfpr(context, b, new zzava(a), ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.F2)).booleanValue()), new zzfpt(context, zzawiVar, a, zzfnsVar, false), zzawiVar, executor, zzfnsVar, b, zzawxVar, zzawpVar, zzawgVar2);
                    m1 = zzavdVar2;
                    zzavdVar2.o();
                    m1.p();
                }
                zzavdVar = m1;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzavdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzavg
    public final String a(Context context) {
        t();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.V2)).booleanValue()) {
            this.f1.j();
        }
        p();
        zzfoa a = this.Y0.a();
        if (a != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String c = a.c(context, null);
            this.a1.f(AD1.u1, System.currentTimeMillis() - currentTimeMillis, c, null);
            return c;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzavg
    public final void b(@InterfaceC11300zs1 View view) {
        this.Z0.d(view);
    }

    @Override // com.google.android.gms.internal.ads.zzavg
    public final String c(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzavg
    public final void d(int i, int i2, int i3) {
        DisplayMetrics displayMetrics;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.mc)).booleanValue() && (displayMetrics = this.X.getResources().getDisplayMetrics()) != null) {
            float f = i;
            float f2 = displayMetrics.density;
            float f3 = i2;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, f * f2, f3 * f2, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            e(obtain);
            obtain.recycle();
            float f4 = displayMetrics.density;
            MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 2, f * f4, f3 * f4, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            e(obtain2);
            obtain2.recycle();
            float f5 = displayMetrics.density;
            MotionEvent obtain3 = MotionEvent.obtain(0L, i3, 1, f * f5, f3 * f5, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            e(obtain3);
            obtain3.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavg
    public final void e(@InterfaceC11300zs1 MotionEvent motionEvent) {
        zzfoa a = this.Y0.a();
        if (a != null) {
            try {
                a.a(null, motionEvent);
            } catch (zzfps e) {
                this.a1.c(e.a(), -1L, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavg
    public final void f(StackTraceElement[] stackTraceElementArr) {
        zzawg zzawgVar = this.g1;
        if (zzawgVar != null) {
            zzawgVar.b(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavg
    public final String g(Context context, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 View view) {
        return h(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzavg
    public final String h(Context context, String str, @InterfaceC11300zs1 View view, @InterfaceC11300zs1 Activity activity) {
        t();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.V2)).booleanValue()) {
            this.f1.i();
        }
        p();
        zzfoa a = this.Y0.a();
        if (a != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String d = a.d(context, null, str, view, activity);
            this.a1.f(5000, System.currentTimeMillis() - currentTimeMillis, d, null);
            return d;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzavg
    public final String i(Context context, @InterfaceC11300zs1 View view, @InterfaceC11300zs1 Activity activity) {
        t();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.V2)).booleanValue()) {
            this.f1.k(context, view);
        }
        p();
        zzfoa a = this.Y0.a();
        if (a != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String b = a.b(context, null, view, activity);
            this.a1.f(AD1.v1, System.currentTimeMillis() - currentTimeMillis, b, null);
            return b;
        }
        return "";
    }

    public final synchronized void o() {
        long currentTimeMillis = System.currentTimeMillis();
        zzfpj u = u(1);
        if (u != null) {
            if (this.Y0.c(u)) {
                this.k1 = true;
                this.d1.countDown();
                return;
            }
            return;
        }
        this.a1.d(4013, System.currentTimeMillis() - currentTimeMillis);
    }

    public final void p() {
        if (!this.j1) {
            synchronized (this.i1) {
                try {
                    if (!this.j1) {
                        if ((System.currentTimeMillis() / 1000) - this.h1 < 3600) {
                            return;
                        }
                        zzfpj b = this.Y0.b();
                        if ((b == null || b.d(3600L)) && zzfox.a(this.l1)) {
                            this.b1.execute(new zzavc(this));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final synchronized boolean r() {
        return this.k1;
    }

    public final void t() {
        zzawx zzawxVar = this.e1;
        if (zzawxVar != null) {
            zzawxVar.h();
        }
    }

    public final zzfpj u(int i) {
        if (!zzfox.a(this.l1)) {
            return null;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.D2)).booleanValue()) {
            return this.Z.c(1);
        }
        return this.Y.c(1);
    }
}
