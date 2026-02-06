package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes2.dex */
final class zzfxo extends zzfxr {
    public zzfxo() {
        super(null);
    }

    public static final zzfxr j(int i) {
        zzfxr zzfxrVar;
        zzfxr zzfxrVar2;
        zzfxr zzfxrVar3;
        if (i < 0) {
            zzfxrVar3 = zzfxr.b;
            return zzfxrVar3;
        } else if (i > 0) {
            zzfxrVar2 = zzfxr.c;
            return zzfxrVar2;
        } else {
            zzfxrVar = zzfxr.a;
            return zzfxrVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfxr
    public final int a() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfxr
    public final zzfxr b(int i, int i2) {
        return j(Integer.compare(i, i2));
    }

    @Override // com.google.android.gms.internal.ads.zzfxr
    public final zzfxr c(Object obj, Object obj2, Comparator comparator) {
        return j(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzfxr
    public final zzfxr d(boolean z, boolean z2) {
        return j(Boolean.compare(z, z2));
    }

    @Override // com.google.android.gms.internal.ads.zzfxr
    public final zzfxr e(boolean z, boolean z2) {
        return j(Boolean.compare(z2, z));
    }
}
