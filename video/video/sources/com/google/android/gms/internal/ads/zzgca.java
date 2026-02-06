package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o.P2;

/* loaded from: classes2.dex */
final class zzgca extends zzgbz {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(zzgcd.class, Set.class, "c1");
    public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(zzgcd.class, "d1");

    private zzgca() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgbz
    public final int a(zzgcd zzgcdVar) {
        return b.decrementAndGet(zzgcdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgbz
    public final void b(zzgcd zzgcdVar, Set set, Set set2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        while (!P2.a(atomicReferenceFieldUpdater, zzgcdVar, null, set2) && atomicReferenceFieldUpdater.get(zzgcdVar) == null) {
        }
    }

    public /* synthetic */ zzgca(zzgcc zzgccVar) {
        super(null);
    }
}
