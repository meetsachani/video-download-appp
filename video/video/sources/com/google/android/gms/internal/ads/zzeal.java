package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzeal {
    public final zzeah a;
    public final zzgdj b;

    public zzeal(zzeah zzeahVar, zzgdj zzgdjVar) {
        this.a = zzeahVar;
        this.b = zzgdjVar;
    }

    public final void a(zzffx zzffxVar) {
        final zzeah zzeahVar = this.a;
        Objects.requireNonNull(zzeahVar);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzeaj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeah.this.getWritableDatabase();
            }
        };
        zzgdj zzgdjVar = this.b;
        zzgcy.r(zzgdjVar.I2(callable), new zzeak(this, zzffxVar), zzgdjVar);
    }
}
