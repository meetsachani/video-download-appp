package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Comparator;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public class zzxn implements zzyq {
    public final zzbm a;
    public final int b;
    public final int[] c;
    public final zzz[] d;
    public int e;

    public zzxn(zzbm zzbmVar, int[] iArr, int i) {
        boolean z;
        int length = iArr.length;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        zzdc.f(z);
        zzbmVar.getClass();
        this.a = zzbmVar;
        this.b = length;
        this.d = new zzz[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.d[i2] = zzbmVar.b(iArr[i2]);
        }
        Arrays.sort(this.d, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxm
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzz) obj2).j - ((zzz) obj).j;
            }
        });
        this.c = new int[this.b];
        for (int i3 = 0; i3 < this.b; i3++) {
            this.c[i3] = zzbmVar.a(this.d[i3]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyv
    public final int A(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzyv
    public final int E(int i) {
        return this.c[i];
    }

    @Override // com.google.android.gms.internal.ads.zzyq
    public final zzz b() {
        return this.d[0];
    }

    @Override // com.google.android.gms.internal.ads.zzyv
    public final zzbm c() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzyq
    public final int e() {
        return this.c[0];
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzxn zzxnVar = (zzxn) obj;
            if (this.a.equals(zzxnVar.a) && Arrays.equals(this.c, zzxnVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzyv
    public final int h() {
        return this.c.length;
    }

    public final int hashCode() {
        int i = this.e;
        if (i == 0) {
            int identityHashCode = (System.identityHashCode(this.a) * 31) + Arrays.hashCode(this.c);
            this.e = identityHashCode;
            return identityHashCode;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzyv
    public final zzz u(int i) {
        return this.d[i];
    }
}
