package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzgzu implements zzhab {
    public final zzhab[] a;

    public zzgzu(zzhab... zzhabVarArr) {
        this.a = zzhabVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzhab
    public final zzhaa b(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzhab zzhabVar = this.a[i];
            if (zzhabVar.c(cls)) {
                return zzhabVar.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.zzhab
    public final boolean c(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.a[i].c(cls)) {
                return true;
            }
        }
        return false;
    }
}
