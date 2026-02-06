package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzvt extends zzuj {
    public static final zzap s;
    public final zzvd[] k;
    public final List l;
    public final zzbl[] m;
    public final ArrayList n;

    /* renamed from: o  reason: collision with root package name */
    public int f297o = -1;
    public long[][] p;
    @InterfaceC11300zs1
    public zzvq q;
    public final zzum r;

    static {
        zzad zzadVar = new zzad();
        zzadVar.a("MergingMediaSource");
        s = zzadVar.c();
    }

    public zzvt(boolean z, boolean z2, zzum zzumVar, zzvd... zzvdVarArr) {
        this.k = zzvdVarArr;
        this.r = zzumVar;
        this.n = new ArrayList(Arrays.asList(zzvdVarArr));
        this.l = new ArrayList(zzvdVarArr.length);
        int i = 0;
        while (true) {
            int length = zzvdVarArr.length;
            if (i < length) {
                this.l.add(new ArrayList());
                i++;
            } else {
                this.m = new zzbl[length];
                this.p = new long[0];
                new HashMap();
                zzfzi.a(8).b(2).c();
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuj, com.google.android.gms.internal.ads.zzvd
    public final void C() throws IOException {
        zzvq zzvqVar = this.q;
        if (zzvqVar == null) {
            super.C();
            return;
        }
        throw zzvqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzuj
    @InterfaceC11300zs1
    public final /* bridge */ /* synthetic */ zzvb D(Object obj, zzvb zzvbVar) {
        zzvb zzvbVar2;
        zzvb zzvbVar3;
        int intValue = ((Integer) obj).intValue();
        List list = this.l;
        List list2 = (List) list.get(intValue);
        for (int i = 0; i < list2.size(); i++) {
            zzvbVar2 = ((zzvr) list2.get(i)).a;
            if (zzvbVar2.equals(zzvbVar)) {
                zzvbVar3 = ((zzvr) ((List) list.get(0)).get(i)).a;
                return zzvbVar3;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    public final zzap O() {
        zzvd[] zzvdVarArr = this.k;
        if (zzvdVarArr.length > 0) {
            return zzvdVarArr[0].O();
        }
        return s;
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    public final void c(zzuz zzuzVar) {
        zzuz zzuzVar2;
        zzvp zzvpVar = (zzvp) zzuzVar;
        int i = 0;
        while (true) {
            zzvd[] zzvdVarArr = this.k;
            if (i < zzvdVarArr.length) {
                List list = (List) this.l.get(i);
                zzuz k = zzvpVar.k(i);
                int i2 = 0;
                while (true) {
                    if (i2 < list.size()) {
                        zzuzVar2 = ((zzvr) list.get(i2)).b;
                        if (zzuzVar2.equals(k)) {
                            list.remove(i2);
                            break;
                        }
                        i2++;
                    }
                }
                zzvdVarArr[i].c(zzvpVar.k(i));
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzua, com.google.android.gms.internal.ads.zzvd
    public final void g(zzap zzapVar) {
        this.k[0].g(zzapVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    public final zzuz k(zzvb zzvbVar, zzzg zzzgVar, long j) {
        zzbl[] zzblVarArr = this.m;
        zzvd[] zzvdVarArr = this.k;
        int length = zzvdVarArr.length;
        zzuz[] zzuzVarArr = new zzuz[length];
        int a = zzblVarArr[0].a(zzvbVar.a);
        for (int i = 0; i < length; i++) {
            zzvb a2 = zzvbVar.a(zzblVarArr[i].f(a));
            zzuzVarArr[i] = zzvdVarArr[i].k(a2, zzzgVar, j - this.p[a][i]);
            ((List) this.l.get(i)).add(new zzvr(a2, zzuzVarArr[i], null));
        }
        return new zzvp(this.r, this.p[a], zzuzVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzuj, com.google.android.gms.internal.ads.zzua
    public final void u(@InterfaceC11300zs1 zzhg zzhgVar) {
        super.u(zzhgVar);
        int i = 0;
        while (true) {
            zzvd[] zzvdVarArr = this.k;
            if (i < zzvdVarArr.length) {
                z(Integer.valueOf(i), zzvdVarArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuj, com.google.android.gms.internal.ads.zzua
    public final void w() {
        super.w();
        Arrays.fill(this.m, (Object) null);
        this.f297o = -1;
        this.q = null;
        ArrayList arrayList = this.n;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // com.google.android.gms.internal.ads.zzuj
    public final /* bridge */ /* synthetic */ void y(Object obj, zzvd zzvdVar, zzbl zzblVar) {
        int i;
        Integer num = (Integer) obj;
        if (this.q == null) {
            if (this.f297o == -1) {
                i = zzblVar.b();
                this.f297o = i;
            } else {
                int b = zzblVar.b();
                int i2 = this.f297o;
                if (b != i2) {
                    this.q = new zzvq(0);
                    return;
                }
                i = i2;
            }
            if (this.p.length == 0) {
                this.p = (long[][]) Array.newInstance(Long.TYPE, i, this.m.length);
            }
            ArrayList arrayList = this.n;
            arrayList.remove(zzvdVar);
            zzbl[] zzblVarArr = this.m;
            zzblVarArr[num.intValue()] = zzblVar;
            if (arrayList.isEmpty()) {
                v(zzblVarArr[0]);
            }
        }
    }
}
