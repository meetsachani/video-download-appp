package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcak implements zzgcu {
    public final /* synthetic */ zzcam a;

    public zzcak(zzcam zzcamVar) {
        this.a = zzcamVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
        AtomicInteger atomicInteger;
        atomicInteger = this.a.b;
        atomicInteger.set(-1);
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void c(@InterfaceC11300zs1 Object obj) {
        AtomicInteger atomicInteger;
        atomicInteger = this.a.b;
        atomicInteger.set(1);
    }
}
