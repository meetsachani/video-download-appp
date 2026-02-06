package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
final class zzazl implements Runnable {
    public final /* synthetic */ zzazm X;

    public zzazl(zzazm zzazmVar) {
        this.X = zzazmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        boolean z2;
        List<zzazn> list;
        zzazm zzazmVar = this.X;
        obj = zzazmVar.Z;
        synchronized (obj) {
            z = zzazmVar.Y0;
            if (z) {
                z2 = zzazmVar.Z0;
                if (z2) {
                    zzazmVar.Y0 = false;
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.b("App went background");
                    list = zzazmVar.a1;
                    for (zzazn zzaznVar : list) {
                        try {
                            zzaznVar.O0(false);
                        } catch (Exception e) {
                            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
                        }
                    }
                }
            }
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.b("App is still foreground");
        }
    }
}
