package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzwl implements zzza {
    public long a;
    public long b;
    @InterfaceC11300zs1
    public zzyz c;
    @InterfaceC11300zs1
    public zzwl d;

    public zzwl(long j, int i) {
        d(j, 65536);
    }

    public final int a(long j) {
        long j2 = j - this.a;
        int i = this.c.b;
        return (int) j2;
    }

    public final zzwl b() {
        this.c = null;
        zzwl zzwlVar = this.d;
        this.d = null;
        return zzwlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzza
    public final zzyz c() {
        zzyz zzyzVar = this.c;
        zzyzVar.getClass();
        return zzyzVar;
    }

    public final void d(long j, int i) {
        boolean z;
        if (this.c == null) {
            z = true;
        } else {
            z = false;
        }
        zzdc.f(z);
        this.a = j;
        this.b = j + 65536;
    }

    @Override // com.google.android.gms.internal.ads.zzza
    @InterfaceC11300zs1
    public final zzza f() {
        zzwl zzwlVar = this.d;
        if (zzwlVar == null || zzwlVar.c == null) {
            return null;
        }
        return zzwlVar;
    }
}
