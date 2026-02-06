package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzacb {
    @InterfaceC11300zs1
    public final Handler a;
    @InterfaceC11300zs1
    public final zzacc b;

    public zzacb(@InterfaceC11300zs1 Handler handler, @InterfaceC11300zs1 zzacc zzaccVar) {
        if (zzaccVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.a = handler;
        this.b = zzaccVar;
    }

    public static /* synthetic */ void a(zzacb zzacbVar, Exception exc) {
        String str = zzeu.a;
        zzacbVar.b.T0(exc);
    }

    public static /* synthetic */ void b(zzacb zzacbVar, String str) {
        String str2 = zzeu.a;
        zzacbVar.b.M0(str);
    }

    public static /* synthetic */ void c(zzacb zzacbVar, long j, int i) {
        String str = zzeu.a;
        zzacbVar.b.N0(j, i);
    }

    public static /* synthetic */ void d(zzacb zzacbVar, int i, long j) {
        String str = zzeu.a;
        zzacbVar.b.U0(i, j);
    }

    public static /* synthetic */ void e(zzacb zzacbVar, zzcd zzcdVar) {
        String str = zzeu.a;
        zzacbVar.b.O0(zzcdVar);
    }

    public static /* synthetic */ void f(zzacb zzacbVar, zzia zziaVar) {
        zziaVar.a();
        String str = zzeu.a;
        zzacbVar.b.V0(zziaVar);
    }

    public static /* synthetic */ void g(zzacb zzacbVar, zzz zzzVar, zzib zzibVar) {
        String str = zzeu.a;
        zzacbVar.b.Q0(zzzVar, zzibVar);
    }

    public static /* synthetic */ void h(zzacb zzacbVar, Object obj, long j) {
        String str = zzeu.a;
        zzacbVar.b.S0(obj, j);
    }

    public static /* synthetic */ void i(zzacb zzacbVar, zzia zziaVar) {
        String str = zzeu.a;
        zzacbVar.b.P0(zziaVar);
    }

    public static /* synthetic */ void j(zzacb zzacbVar, String str, long j, long j2) {
        String str2 = zzeu.a;
        zzacbVar.b.R0(str, j, j2);
    }

    public final void k(final String str, final long j, final long j2) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabr
                @Override // java.lang.Runnable
                public final void run() {
                    zzacb.j(zzacb.this, str, j, j2);
                }
            });
        }
    }

    public final void l(final String str) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaca
                @Override // java.lang.Runnable
                public final void run() {
                    zzacb.b(zzacb.this, str);
                }
            });
        }
    }

    public final void m(final zzia zziaVar) {
        zziaVar.a();
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabz
                @Override // java.lang.Runnable
                public final void run() {
                    zzacb.f(zzacb.this, zziaVar);
                }
            });
        }
    }

    public final void n(final int i, final long j) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabt
                @Override // java.lang.Runnable
                public final void run() {
                    zzacb.d(zzacb.this, i, j);
                }
            });
        }
    }

    public final void o(final zzia zziaVar) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabx
                @Override // java.lang.Runnable
                public final void run() {
                    zzacb.i(zzacb.this, zziaVar);
                }
            });
        }
    }

    public final void p(final zzz zzzVar, @InterfaceC11300zs1 final zzib zzibVar) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaby
                @Override // java.lang.Runnable
                public final void run() {
                    zzacb.g(zzacb.this, zzzVar, zzibVar);
                }
            });
        }
    }

    public final void q(final Object obj) {
        Handler handler = this.a;
        if (handler != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabu
                @Override // java.lang.Runnable
                public final void run() {
                    zzacb.h(zzacb.this, obj, elapsedRealtime);
                }
            });
        }
    }

    public final void r(final long j, final int i) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabv
                @Override // java.lang.Runnable
                public final void run() {
                    zzacb.c(zzacb.this, j, i);
                }
            });
        }
    }

    public final void s(final Exception exc) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabw
                @Override // java.lang.Runnable
                public final void run() {
                    zzacb.a(zzacb.this, exc);
                }
            });
        }
    }

    public final void t(final zzcd zzcdVar) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabs
                @Override // java.lang.Runnable
                public final void run() {
                    zzacb.e(zzacb.this, zzcdVar);
                }
            });
        }
    }
}
