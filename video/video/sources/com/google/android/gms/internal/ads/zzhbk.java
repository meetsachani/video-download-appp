package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzhbk extends zzhbi {
    @Override // com.google.android.gms.internal.ads.zzhbi
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        zzgys zzgysVar = (zzgys) obj;
        zzhbj zzhbjVar = zzgysVar.zzt;
        if (zzhbjVar == zzhbj.c()) {
            zzhbj f = zzhbj.f();
            zzgysVar.zzt = f;
            return f;
        }
        return zzhbjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbi
    public final /* synthetic */ Object b() {
        return zzhbj.f();
    }

    @Override // com.google.android.gms.internal.ads.zzhbi
    public final /* synthetic */ Object c(Object obj) {
        zzhbj zzhbjVar = (zzhbj) obj;
        zzhbjVar.h();
        return zzhbjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbi
    public final /* bridge */ /* synthetic */ void d(Object obj, int i, int i2) {
        ((zzhbj) obj).j((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.internal.ads.zzhbi
    public final /* bridge */ /* synthetic */ void e(Object obj, int i, long j) {
        ((zzhbj) obj).j((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzhbi
    public final /* bridge */ /* synthetic */ void f(Object obj, int i, Object obj2) {
        ((zzhbj) obj).j((i << 3) | 3, (zzhbj) obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzhbi
    public final /* bridge */ /* synthetic */ void g(Object obj, int i, zzgxk zzgxkVar) {
        ((zzhbj) obj).j((i << 3) | 2, zzgxkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbi
    public final /* bridge */ /* synthetic */ void h(Object obj, int i, long j) {
        ((zzhbj) obj).j(i << 3, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzhbi
    public final void i(Object obj) {
        ((zzgys) obj).zzt.h();
    }

    @Override // com.google.android.gms.internal.ads.zzhbi
    public final /* synthetic */ void j(Object obj, Object obj2) {
        ((zzgys) obj).zzt = (zzhbj) obj2;
    }
}
