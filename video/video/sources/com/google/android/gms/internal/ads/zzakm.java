package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes2.dex */
public final class zzakm implements zzadq {
    public final zzadq X;
    public final zzakj Y;
    public boolean Y0;
    public final SparseArray Z = new SparseArray();

    public zzakm(zzadq zzadqVar, zzakj zzakjVar) {
        this.X = zzadqVar;
        this.Y = zzakjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final void N() {
        this.X.N();
        if (this.Y0) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = this.Z;
                if (i < sparseArray.size()) {
                    ((zzako) sparseArray.valueAt(i)).i(true);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final zzaet O(int i, int i2) {
        if (i2 != 3) {
            this.Y0 = true;
            return this.X.O(i, i2);
        }
        SparseArray sparseArray = this.Z;
        zzako zzakoVar = (zzako) sparseArray.get(i);
        if (zzakoVar != null) {
            return zzakoVar;
        }
        zzako zzakoVar2 = new zzako(this.X.O(i, 3), this.Y);
        sparseArray.put(i, zzakoVar2);
        return zzakoVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final void P(zzaem zzaemVar) {
        this.X.P(zzaemVar);
    }
}
