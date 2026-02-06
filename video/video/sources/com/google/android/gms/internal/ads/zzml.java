package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes2.dex */
public final class zzml {
    public final zzv a;
    public final SparseArray b;

    public zzml(zzv zzvVar, SparseArray sparseArray) {
        this.a = zzvVar;
        SparseArray sparseArray2 = new SparseArray(zzvVar.b());
        for (int i = 0; i < zzvVar.b(); i++) {
            int a = zzvVar.a(i);
            zzmk zzmkVar = (zzmk) sparseArray.get(a);
            zzmkVar.getClass();
            sparseArray2.append(a, zzmkVar);
        }
        this.b = sparseArray2;
    }

    public final int a(int i) {
        return this.a.a(i);
    }

    public final int b() {
        return this.a.b();
    }

    public final zzmk c(int i) {
        zzmk zzmkVar = (zzmk) this.b.get(i);
        zzmkVar.getClass();
        return zzmkVar;
    }

    public final boolean d(int i) {
        return this.a.c(i);
    }
}
