package com.google.android.gms.internal.ads;

import java.util.Arrays;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzbs {
    public final int a;
    public final zzbm b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        String str = zzeu.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public zzbs(zzbm zzbmVar, boolean z, int[] iArr, boolean[] zArr) {
        boolean z2;
        int i = zzbmVar.a;
        this.a = i;
        boolean z3 = true;
        if (i == iArr.length && i == zArr.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzdc.d(z2);
        this.b = zzbmVar;
        this.c = (!z || i <= 1) ? false : z3;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final int a() {
        return this.b.c;
    }

    public final zzz b(int i) {
        return this.b.b(i);
    }

    public final boolean c() {
        for (boolean z : this.e) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(int i) {
        return this.e[i];
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbs.class == obj.getClass()) {
            zzbs zzbsVar = (zzbs) obj;
            if (this.c == zzbsVar.c && this.b.equals(zzbsVar.b) && Arrays.equals(this.d, zzbsVar.d) && Arrays.equals(this.e, zzbsVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31) + Arrays.hashCode(this.d)) * 31) + Arrays.hashCode(this.e);
    }
}
