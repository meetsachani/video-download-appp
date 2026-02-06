package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzyb extends zzbq {
    public final SparseArray A;
    public final SparseBooleanArray B;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public zzyb() {
        this.A = new SparseArray();
        this.B = new SparseBooleanArray();
        this.t = true;
        this.u = true;
        this.v = true;
        this.w = true;
        this.x = true;
        this.y = true;
        this.z = true;
    }

    public final zzyb C(zzbr zzbrVar) {
        super.j(zzbrVar);
        return this;
    }

    public final zzyb D(int i, boolean z) {
        SparseBooleanArray sparseBooleanArray = this.B;
        if (sparseBooleanArray.get(i) == z) {
            return this;
        }
        if (z) {
            sparseBooleanArray.put(i, true);
            return this;
        }
        sparseBooleanArray.delete(i);
        return this;
    }

    public /* synthetic */ zzyb(zzyc zzycVar, zzyn zzynVar) {
        super(zzycVar);
        SparseArray sparseArray;
        SparseBooleanArray sparseBooleanArray;
        this.t = zzycVar.F;
        this.u = zzycVar.H;
        this.v = zzycVar.J;
        this.w = zzycVar.O;
        this.x = zzycVar.P;
        this.y = zzycVar.Q;
        this.z = zzycVar.S;
        sparseArray = zzycVar.U;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.A = sparseArray2;
        sparseBooleanArray = zzycVar.V;
        this.B = sparseBooleanArray.clone();
    }
}
