package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzean implements zzcxh, zzcvw {
    public static int Y0;
    public static final Object Z = new Object();
    public final com.google.android.gms.ads.internal.util.zzg X;
    public final zzeax Y;

    public zzean(zzeax zzeaxVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.Y = zzeaxVar;
        this.X = zzgVar;
    }

    private final void a(boolean z) {
        int i;
        int intValue;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.s6)).booleanValue() && !this.X.M()) {
            Object obj = Z;
            synchronized (obj) {
                i = Y0;
                intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.t6)).intValue();
            }
            if (i < intValue) {
                this.Y.e(z);
                synchronized (obj) {
                    Y0++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void C0(com.google.android.gms.ads.internal.client.zze zzeVar) {
        a(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void v() {
        a(true);
    }
}
