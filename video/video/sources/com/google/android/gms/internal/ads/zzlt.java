package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzlt extends zzhq {
    public static final /* synthetic */ int k = 0;
    public final int d;
    public final int e;
    public final int[] f;
    public final int[] g;
    public final zzbl[] h;
    public final Object[] i;
    public final HashMap j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzlt(Collection collection, zzww zzwwVar) {
        this(r0, r1, zzwwVar);
        zzbl[] zzblVarArr = new zzbl[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            zzblVarArr[i2] = ((zzlb) it.next()).a();
            i2++;
        }
        Object[] objArr = new Object[collection.size()];
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((zzlb) it2.next()).b();
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final int b() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final int c() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    public final int p(Object obj) {
        Integer num = (Integer) this.j.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    public final int q(int i) {
        return zzeu.x(this.f, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    public final int r(int i) {
        return zzeu.x(this.g, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    public final int s(int i) {
        return this.f[i];
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    public final int t(int i) {
        return this.g[i];
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    public final zzbl u(int i) {
        return this.h[i];
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    public final Object v(int i) {
        return this.i[i];
    }

    public final List y() {
        return Arrays.asList(this.h);
    }

    public final zzlt z(zzww zzwwVar) {
        zzbl[] zzblVarArr = this.h;
        zzbl[] zzblVarArr2 = new zzbl[zzblVarArr.length];
        for (int i = 0; i < zzblVarArr.length; i++) {
            zzblVarArr2[i] = new zzls(this, zzblVarArr[i]);
        }
        return new zzlt(zzblVarArr2, this.i, zzwwVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlt(zzbl[] zzblVarArr, Object[] objArr, zzww zzwwVar) {
        super(false, zzwwVar);
        int i = 0;
        this.h = zzblVarArr;
        int length = zzblVarArr.length;
        this.f = new int[length];
        this.g = new int[length];
        this.i = objArr;
        this.j = new HashMap();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < zzblVarArr.length) {
            zzbl zzblVar = zzblVarArr[i];
            this.h[i4] = zzblVar;
            this.g[i4] = i2;
            this.f[i4] = i3;
            i2 += zzblVar.c();
            i3 += this.h[i4].b();
            this.j.put(objArr[i4], Integer.valueOf(i4));
            i++;
            i4++;
        }
        this.d = i2;
        this.e = i3;
    }
}
