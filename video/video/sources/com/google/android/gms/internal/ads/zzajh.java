package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzajh {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final zzz g;
    public final int h;
    @InterfaceC11300zs1
    public final long[] i;
    @InterfaceC11300zs1
    public final long[] j;
    public final int k;
    @InterfaceC11300zs1
    public final zzaji[] l;

    public zzajh(int i, int i2, long j, long j2, long j3, long j4, zzz zzzVar, int i3, @InterfaceC11300zs1 zzaji[] zzajiVarArr, int i4, @InterfaceC11300zs1 long[] jArr, @InterfaceC11300zs1 long[] jArr2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = zzzVar;
        this.h = i3;
        this.l = zzajiVarArr;
        this.k = i4;
        this.i = jArr;
        this.j = jArr2;
    }

    public final zzajh a(zzz zzzVar) {
        return new zzajh(this.a, this.b, this.c, this.d, this.e, this.f, zzzVar, this.h, this.l, this.k, this.i, this.j);
    }

    @InterfaceC11300zs1
    public final zzaji b(int i) {
        return this.l[i];
    }
}
