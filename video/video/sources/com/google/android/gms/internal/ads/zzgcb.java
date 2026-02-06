package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
final class zzgcb extends zzgbz {
    private zzgcb() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgbz
    public final int a(zzgcd zzgcdVar) {
        int i;
        synchronized (zzgcdVar) {
            i = zzgcdVar.d1 - 1;
            zzgcdVar.d1 = i;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzgbz
    public final void b(zzgcd zzgcdVar, Set set, Set set2) {
        synchronized (zzgcdVar) {
            try {
                if (zzgcdVar.c1 == null) {
                    zzgcdVar.c1 = set2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ zzgcb(zzgcc zzgccVar) {
        super(null);
    }
}
