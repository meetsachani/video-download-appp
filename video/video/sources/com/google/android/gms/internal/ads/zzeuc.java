package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzeuc implements zzetu {
    public final int a;
    public final int b;

    public zzeuc(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* synthetic */ void b(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        int i;
        Bundle bundle = ((zzcuv) obj).a;
        int i2 = this.a;
        if (i2 != -1 && (i = this.b) != -1) {
            bundle.putInt("sessions_without_flags", i2);
            bundle.putInt("crashes_without_flags", i);
            int i3 = com.google.android.gms.ads.internal.client.zzbb.g;
            if (com.google.android.gms.ads.internal.client.zzbd.c().e()) {
                bundle.putBoolean("did_reset", true);
            }
        }
    }
}
