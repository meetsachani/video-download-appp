package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class zzcyn implements Runnable {
    public final WeakReference X;

    @Override // java.lang.Runnable
    public final void run() {
        zzcyq zzcyqVar = (zzcyq) this.X.get();
        if (zzcyqVar != null) {
            zzcyqVar.g1(new zzdbn() { // from class: com.google.android.gms.internal.ads.zzcyl
                @Override // com.google.android.gms.internal.ads.zzdbn
                public final void b(Object obj) {
                    ((zzcyk) obj).a();
                }
            });
        }
    }
}
