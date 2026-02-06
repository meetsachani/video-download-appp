package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzanz implements zzans {
    public final zzej a = new zzej(new byte[4], 4);
    public final /* synthetic */ zzaob b;

    public zzanz(zzaob zzaobVar) {
        this.b = zzaobVar;
    }

    @Override // com.google.android.gms.internal.ads.zzans
    public final void a(zzer zzerVar, zzadq zzadqVar, zzaof zzaofVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzans
    public final void b(zzek zzekVar) {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        SparseArray sparseArray3;
        int i;
        if (zzekVar.G() == 0 && (zzekVar.G() & 128) != 0) {
            zzekVar.m(6);
            int u = zzekVar.u() / 4;
            for (int i2 = 0; i2 < u; i2++) {
                zzej zzejVar = this.a;
                zzekVar.g(zzejVar, 4);
                int d = zzejVar.d(16);
                zzejVar.n(3);
                if (d == 0) {
                    zzejVar.n(13);
                } else {
                    int d2 = zzejVar.d(13);
                    zzaob zzaobVar = this.b;
                    sparseArray2 = zzaobVar.g;
                    if (sparseArray2.get(d2) == null) {
                        sparseArray3 = zzaobVar.g;
                        sparseArray3.put(d2, new zzant(new zzaoa(zzaobVar, d2)));
                        i = zzaobVar.m;
                        zzaobVar.m = i + 1;
                    }
                }
            }
            sparseArray = this.b.g;
            sparseArray.remove(0);
        }
    }
}
