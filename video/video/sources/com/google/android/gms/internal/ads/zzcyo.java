package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class zzcyo implements Runnable {
    public final WeakReference X;

    @Override // java.lang.Runnable
    public final void run() {
        zzcyq zzcyqVar = (zzcyq) this.X.get();
        if (zzcyqVar != null) {
            zzcyqVar.g1(new zzdbn() { // from class: com.google.android.gms.internal.ads.zzcym
                @Override // com.google.android.gms.internal.ads.zzdbn
                public final void b(Object obj) {
                    ((zzcyk) obj).b();
                }
            });
        }
    }
}
