package com.google.android.gms.internal.ads;

import android.os.Handler;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzqa {
    @InterfaceC11300zs1
    public final Handler a;
    @InterfaceC11300zs1
    public final zzqb b;

    public zzqa(@InterfaceC11300zs1 Handler handler, @InterfaceC11300zs1 zzqb zzqbVar) {
        this.a = zzqbVar == null ? null : handler;
        this.b = zzqbVar;
    }

    public static /* synthetic */ void a(zzqa zzqaVar, zzia zziaVar) {
        String str = zzeu.a;
        zzqaVar.b.e(zziaVar);
    }

    public static /* synthetic */ void b(zzqa zzqaVar, String str) {
        String str2 = zzeu.a;
        zzqaVar.b.Q(str);
    }

    public static /* synthetic */ void c(zzqa zzqaVar, long j) {
        String str = zzeu.a;
        zzqaVar.b.t(j);
    }

    public static /* synthetic */ void d(zzqa zzqaVar, zzqc zzqcVar) {
        String str = zzeu.a;
        zzqaVar.b.i(zzqcVar);
    }

    public static /* synthetic */ void e(zzqa zzqaVar, int i, long j, long j2) {
        String str = zzeu.a;
        zzqaVar.b.b(i, j, j2);
    }

    public static /* synthetic */ void f(zzqa zzqaVar, Exception exc) {
        String str = zzeu.a;
        zzqaVar.b.c(exc);
    }

    public static /* synthetic */ void g(zzqa zzqaVar, Exception exc) {
        String str = zzeu.a;
        zzqaVar.b.a(exc);
    }

    public static /* synthetic */ void h(zzqa zzqaVar, zzz zzzVar, zzib zzibVar) {
        String str = zzeu.a;
        zzqaVar.b.h(zzzVar, zzibVar);
    }

    public static /* synthetic */ void i(zzqa zzqaVar, boolean z) {
        String str = zzeu.a;
        zzqaVar.b.a0(z);
    }

    public static /* synthetic */ void j(zzqa zzqaVar, zzqc zzqcVar) {
        String str = zzeu.a;
        zzqaVar.b.d(zzqcVar);
    }

    public static /* synthetic */ void k(zzqa zzqaVar, String str, long j, long j2) {
        String str2 = zzeu.a;
        zzqaVar.b.g(str, j, j2);
    }

    public static /* synthetic */ void l(zzqa zzqaVar, zzia zziaVar) {
        zziaVar.a();
        String str = zzeu.a;
        zzqaVar.b.f(zziaVar);
    }

    public final void m(final Exception exc) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpu
                @Override // java.lang.Runnable
                public final void run() {
                    zzqa.g(zzqa.this, exc);
                }
            });
        }
    }

    public final void n(final Exception exc) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpv
                @Override // java.lang.Runnable
                public final void run() {
                    zzqa.f(zzqa.this, exc);
                }
            });
        }
    }

    public final void o(final zzqc zzqcVar) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzps
                @Override // java.lang.Runnable
                public final void run() {
                    zzqa.j(zzqa.this, zzqcVar);
                }
            });
        }
    }

    public final void p(final zzqc zzqcVar) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpt
                @Override // java.lang.Runnable
                public final void run() {
                    zzqa.d(zzqa.this, zzqcVar);
                }
            });
        }
    }

    public final void q(final String str, final long j, final long j2) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpy
                @Override // java.lang.Runnable
                public final void run() {
                    zzqa.k(zzqa.this, str, j, j2);
                }
            });
        }
    }

    public final void r(final String str) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpz
                @Override // java.lang.Runnable
                public final void run() {
                    zzqa.b(zzqa.this, str);
                }
            });
        }
    }

    public final void s(final zzia zziaVar) {
        zziaVar.a();
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpp
                @Override // java.lang.Runnable
                public final void run() {
                    zzqa.l(zzqa.this, zziaVar);
                }
            });
        }
    }

    public final void t(final zzia zziaVar) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpo
                @Override // java.lang.Runnable
                public final void run() {
                    zzqa.a(zzqa.this, zziaVar);
                }
            });
        }
    }

    public final void u(final zzz zzzVar, @InterfaceC11300zs1 final zzib zzibVar) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpw
                @Override // java.lang.Runnable
                public final void run() {
                    zzqa.h(zzqa.this, zzzVar, zzibVar);
                }
            });
        }
    }

    public final void v(final long j) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpq
                @Override // java.lang.Runnable
                public final void run() {
                    zzqa.c(zzqa.this, j);
                }
            });
        }
    }

    public final void w(final boolean z) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpx
                @Override // java.lang.Runnable
                public final void run() {
                    zzqa.i(zzqa.this, z);
                }
            });
        }
    }

    public final void x(final int i, final long j, final long j2) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpr
                @Override // java.lang.Runnable
                public final void run() {
                    zzqa.e(zzqa.this, i, j, j2);
                }
            });
        }
    }
}
