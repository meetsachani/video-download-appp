package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import o.C10323vs;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzaal implements zzach {
    public final zzabl a;
    public final zzabq b;
    public final Queue c;
    @InterfaceC11300zs1
    public Surface d;
    public zzz e;
    public long f;
    public long g;
    public zzace h;
    public Executor i;
    public zzabi j;

    public zzaal(zzabl zzablVar, zzdg zzdgVar) {
        this.a = zzablVar;
        zzablVar.i(zzdgVar);
        this.b = new zzabq(new zzaaj(this, null), zzablVar);
        this.c = new ArrayDeque();
        this.e = new zzx().K();
        this.f = C10323vs.b;
        this.h = zzace.a;
        this.i = new Executor() { // from class: com.google.android.gms.internal.ads.zzaad
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
            }
        };
        this.j = new zzabi() { // from class: com.google.android.gms.internal.ads.zzaae
            @Override // com.google.android.gms.internal.ads.zzabi
            public final void c(long j, long j2, zzz zzzVar, MediaFormat mediaFormat) {
            }
        };
    }

    public static /* bridge */ /* synthetic */ zzace d(zzaal zzaalVar) {
        return zzaalVar.h;
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final void B() {
        this.b.f();
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final boolean Q() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final boolean R() {
        return this.b.g();
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final void S(float f) {
        this.a.l(f);
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final boolean T(zzz zzzVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final boolean U(boolean z) {
        return this.a.m(z);
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final void V(Surface surface, zzel zzelVar) {
        this.d = surface;
        this.a.k(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final void W(long j, long j2) throws zzacg {
        try {
            this.b.e(j, j2);
        } catch (zzik e) {
            throw new zzacg(e, this.e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final boolean X(long j, zzacf zzacfVar) {
        this.c.add(zzacfVar);
        this.b.b(j - this.g);
        this.i.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaaf
            @Override // java.lang.Runnable
            public final void run() {
                zzaal.this.h.b();
            }
        });
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final void Y(zzabi zzabiVar) {
        this.j = zzabiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final void Z(zzace zzaceVar, Executor executor) {
        this.h = zzaceVar;
        this.i = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final void a0(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final Surface b() {
        Surface surface = this.d;
        zzdc.b(surface);
        return surface;
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final void b0(int i, zzz zzzVar, long j, int i2, List list) {
        zzdc.f(list.isEmpty());
        zzz zzzVar2 = this.e;
        int i3 = zzzVar2.v;
        int i4 = zzzVar.v;
        if (i4 != i3 || zzzVar.w != zzzVar2.w) {
            this.b.d(i4, zzzVar.w);
        }
        float f = zzzVar.x;
        if (f != this.e.x) {
            this.a.j(f);
        }
        this.e = zzzVar;
        if (j != this.f) {
            this.b.c(i2, j);
            this.f = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final void c0(boolean z) {
        this.a.c(z);
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final void d0(int i) {
        this.a.h(i);
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final void e0(long j) {
        this.g = j;
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final void h() {
        this.a.b();
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final void i() {
        this.d = null;
        this.a.k(null);
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final void m() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final void n() {
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final void n0(boolean z) {
        if (z) {
            this.a.g();
        }
        this.b.a();
        this.c.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final void w() {
        this.a.e();
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final void y() {
        this.a.d();
    }
}
