package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;
import java.util.Objects;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzyc extends zzbr {
    public static final zzyc W = new zzyc(new zzyb());
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;
    public final boolean R;
    public final boolean S;
    public final boolean T;
    public final SparseArray U;
    public final SparseBooleanArray V;

    static {
        String str = zzeu.a;
        Integer.toString(1000, 36);
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(1012, 36);
        Integer.toString(1013, 36);
        Integer.toString(1014, 36);
        Integer.toString(1015, 36);
        Integer.toString(1016, 36);
        Integer.toString(1017, 36);
        Integer.toString(1018, 36);
    }

    public final zzyb c() {
        return new zzyb(this, null);
    }

    @InterfaceC11300zs1
    @Deprecated
    public final zzyd d(int i, zzxe zzxeVar) {
        Map map = (Map) this.U.get(i);
        if (map != null) {
            return (zzyd) map.get(zzxeVar);
        }
        return null;
    }

    public final boolean e(int i) {
        return this.V.get(i);
    }

    @Override // com.google.android.gms.internal.ads.zzbr
    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzyc.class == obj.getClass()) {
            zzyc zzycVar = (zzyc) obj;
            if (super.equals(zzycVar) && this.F == zzycVar.F && this.H == zzycVar.H && this.J == zzycVar.J && this.O == zzycVar.O && this.P == zzycVar.P && this.Q == zzycVar.Q && this.S == zzycVar.S) {
                SparseBooleanArray sparseBooleanArray = this.V;
                SparseBooleanArray sparseBooleanArray2 = zzycVar.V;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                                break;
                            }
                            i++;
                        } else {
                            SparseArray sparseArray = this.U;
                            SparseArray sparseArray2 = zzycVar.U;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i2);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                zzxe zzxeVar = (zzxe) entry.getKey();
                                                if (map2.containsKey(zzxeVar)) {
                                                    if (!Objects.equals(entry.getValue(), map2.get(zzxeVar))) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Deprecated
    public final boolean f(int i, zzxe zzxeVar) {
        Map map = (Map) this.U.get(i);
        if (map != null && map.containsKey(zzxeVar)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbr
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.F ? 1 : 0)) * 961) + (this.H ? 1 : 0)) * 961) + (this.J ? 1 : 0)) * 28629151) + (this.O ? 1 : 0)) * 31) + (this.P ? 1 : 0)) * 31) + (this.Q ? 1 : 0)) * 961) + (this.S ? 1 : 0)) * 31;
    }

    public zzyc(zzyb zzybVar) {
        super(zzybVar);
        this.F = zzyb.z(zzybVar);
        this.G = false;
        this.H = zzyb.v(zzybVar);
        this.I = false;
        this.J = zzyb.x(zzybVar);
        this.K = false;
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = zzyb.E(zzybVar);
        this.P = zzyb.w(zzybVar);
        this.Q = zzyb.y(zzybVar);
        this.R = false;
        this.S = zzyb.F(zzybVar);
        this.T = false;
        this.U = zzyb.A(zzybVar);
        this.V = zzyb.B(zzybVar);
    }
}
