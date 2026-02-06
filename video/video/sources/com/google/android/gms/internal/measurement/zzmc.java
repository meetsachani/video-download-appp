package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes3.dex */
final class zzmc extends zzma<zzlz, zzlz> {
    public static void t(Object obj, zzlz zzlzVar) {
        ((zzix) obj).zzb = zzlzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final /* synthetic */ int a(zzlz zzlzVar) {
        return zzlzVar.a();
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final /* synthetic */ zzlz b() {
        return zzlz.l();
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final /* synthetic */ zzlz c(zzlz zzlzVar, zzlz zzlzVar2) {
        zzlz zzlzVar3 = zzlzVar;
        zzlz zzlzVar4 = zzlzVar2;
        if (zzlz.k().equals(zzlzVar4)) {
            return zzlzVar3;
        }
        if (zzlz.k().equals(zzlzVar3)) {
            return zzlz.c(zzlzVar3, zzlzVar4);
        }
        return zzlzVar3.b(zzlzVar4);
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final /* synthetic */ void d(zzlz zzlzVar, int i, int i2) {
        zzlzVar.e((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final /* synthetic */ void e(zzlz zzlzVar, int i, long j) {
        zzlzVar.e((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final /* synthetic */ void f(zzlz zzlzVar, int i, zzhm zzhmVar) {
        zzlzVar.e((i << 3) | 2, zzhmVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final /* synthetic */ void g(zzlz zzlzVar, int i, zzlz zzlzVar2) {
        zzlzVar.e((i << 3) | 3, zzlzVar2);
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final /* synthetic */ void h(zzlz zzlzVar, zzmw zzmwVar) throws IOException {
        zzlzVar.g(zzmwVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final boolean i(zzlc zzlcVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final /* synthetic */ int k(zzlz zzlzVar) {
        return zzlzVar.i();
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final /* synthetic */ void l(zzlz zzlzVar, int i, long j) {
        zzlzVar.e(i << 3, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final /* synthetic */ void m(zzlz zzlzVar, zzmw zzmwVar) throws IOException {
        zzlzVar.j(zzmwVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final /* synthetic */ void n(Object obj, zzlz zzlzVar) {
        t(obj, zzlzVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final /* synthetic */ zzlz o(Object obj) {
        zzlz zzlzVar = ((zzix) obj).zzb;
        if (zzlzVar == zzlz.k()) {
            zzlz l = zzlz.l();
            t(obj, l);
            return l;
        }
        return zzlzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final /* synthetic */ void p(Object obj, zzlz zzlzVar) {
        t(obj, zzlzVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final /* synthetic */ zzlz q(Object obj) {
        return ((zzix) obj).zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final /* synthetic */ zzlz r(zzlz zzlzVar) {
        zzlz zzlzVar2 = zzlzVar;
        zzlzVar2.m();
        return zzlzVar2;
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final void s(Object obj) {
        ((zzix) obj).zzb.m();
    }
}
