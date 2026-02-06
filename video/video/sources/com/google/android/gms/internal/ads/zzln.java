package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;
import o.C10323vs;
import o.InterfaceC11300zs1;
import o.OB;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzln {
    public static final zzvb u = new zzvb(new Object(), -1);
    public final zzbl a;
    public final zzvb b;
    public final long c;
    public final long d;
    public final int e;
    @InterfaceC11300zs1
    public final zzik f;
    public final boolean g;
    public final zzxe h;
    public final zzyy i;
    public final List j;
    public final zzvb k;
    public final boolean l;
    public final int m;
    public final int n;

    /* renamed from: o  reason: collision with root package name */
    public final zzbb f290o;
    public final boolean p = false;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;

    public zzln(zzbl zzblVar, zzvb zzvbVar, long j, long j2, int i, @InterfaceC11300zs1 zzik zzikVar, boolean z, zzxe zzxeVar, zzyy zzyyVar, List list, zzvb zzvbVar2, boolean z2, int i2, int i3, zzbb zzbbVar, long j3, long j4, long j5, long j6, boolean z3) {
        this.a = zzblVar;
        this.b = zzvbVar;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = zzikVar;
        this.g = z;
        this.h = zzxeVar;
        this.i = zzyyVar;
        this.j = list;
        this.k = zzvbVar2;
        this.l = z2;
        this.m = i2;
        this.n = i3;
        this.f290o = zzbbVar;
        this.q = j3;
        this.r = j4;
        this.s = j5;
        this.t = j6;
    }

    public static zzln h(zzyy zzyyVar) {
        zzbl zzblVar = zzbl.a;
        zzvb zzvbVar = u;
        return new zzln(zzblVar, zzvbVar, C10323vs.b, 0L, 1, null, false, zzxe.d, zzyyVar, zzfyc.F(), zzvbVar, false, 1, 0, zzbb.d, 0L, 0L, 0L, 0L, false);
    }

    public static zzvb i() {
        return u;
    }

    @OB
    public final zzln a(boolean z) {
        return new zzln(this.a, this.b, this.c, this.d, this.e, this.f, z, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.f290o, this.q, this.r, this.s, this.t, false);
    }

    @OB
    public final zzln b(zzvb zzvbVar) {
        return new zzln(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, zzvbVar, this.l, this.m, this.n, this.f290o, this.q, this.r, this.s, this.t, false);
    }

    @OB
    public final zzln c(zzvb zzvbVar, long j, long j2, long j3, long j4, zzxe zzxeVar, zzyy zzyyVar, List list) {
        zzvb zzvbVar2 = this.k;
        boolean z = this.l;
        int i = this.m;
        int i2 = this.n;
        zzbb zzbbVar = this.f290o;
        long j5 = this.q;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        return new zzln(this.a, zzvbVar, j2, j3, this.e, this.f, this.g, zzxeVar, zzyyVar, list, zzvbVar2, z, i, i2, zzbbVar, j5, j4, j, elapsedRealtime, false);
    }

    @OB
    public final zzln d(boolean z, int i, int i2) {
        return new zzln(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, i2, this.f290o, this.q, this.r, this.s, this.t, false);
    }

    @OB
    public final zzln e(@InterfaceC11300zs1 zzik zzikVar) {
        return new zzln(this.a, this.b, this.c, this.d, this.e, zzikVar, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.f290o, this.q, this.r, this.s, this.t, false);
    }

    @OB
    public final zzln f(int i) {
        return new zzln(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.f290o, this.q, this.r, this.s, this.t, false);
    }

    @OB
    public final zzln g(zzbl zzblVar) {
        return new zzln(zzblVar, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.f290o, this.q, this.r, this.s, this.t, false);
    }

    public final boolean j() {
        return this.e == 3 && this.l && this.n == 0;
    }
}
