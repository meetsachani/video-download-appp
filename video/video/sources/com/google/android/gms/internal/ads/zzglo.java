package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
final class zzglo implements zzglq {
    public final AtomicBoolean a = new AtomicBoolean(false);

    public zzglo(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzglq
    public final boolean a() {
        return this.a.get();
    }
}
