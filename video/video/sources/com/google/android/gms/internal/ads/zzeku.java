package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import o.InterfaceC5940dy1;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public final class zzeku implements zzcyf {
    public final AtomicReference X = new AtomicReference();

    public final void a(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.X.set(zzdqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcyf
    public final void h(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzeyz.a(this.X, new zzeyy() { // from class: com.google.android.gms.internal.ads.zzekt
            @Override // com.google.android.gms.internal.ads.zzeyy
            public final void b(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzdq) obj).a7(zztVar);
            }
        });
    }
}
