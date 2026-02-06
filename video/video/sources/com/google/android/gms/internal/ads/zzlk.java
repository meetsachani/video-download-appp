package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
final class zzlk implements zzlb {
    public final zzuw a;
    public int d;
    public boolean e;
    public final List c = new ArrayList();
    public final Object b = new Object();

    public zzlk(zzvd zzvdVar, boolean z) {
        this.a = new zzuw(zzvdVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final zzbl a() {
        return this.a.H();
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final Object b() {
        return this.b;
    }

    public final void c(int i) {
        this.d = i;
        this.e = false;
        this.c.clear();
    }
}
