package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class zzcyd extends zzdbo implements zzcwn, zzcxs {
    public final zzfbu Y;
    public final zzfcg Y0;
    public final AtomicBoolean Z;

    public zzcyd(Set set, zzfbu zzfbuVar, zzfcg zzfcgVar) {
        super(set);
        this.Z = new AtomicBoolean();
        this.Y = zzfbuVar;
        this.Y0 = zzfcgVar;
    }

    private final void b() {
        final com.google.android.gms.ads.internal.client.zzt zztVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.c8)).booleanValue() && this.Z.compareAndSet(false, true) && (zztVar = this.Y.e0) != null && zztVar.X == 3) {
            g1(new zzdbn() { // from class: com.google.android.gms.internal.ads.zzcyb
                @Override // com.google.android.gms.internal.ads.zzdbn
                public final void b(Object obj) {
                    ((zzcyf) obj).h(com.google.android.gms.ads.internal.client.zzt.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxs
    public final void g() {
        if (this.Y.b == 1) {
            b();
        }
    }

    public final void n1(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        if (com.google.android.gms.ads.nonagon.signalgeneration.zzaa.f(this.Y0) && this.Y.B0) {
            g1(new zzdbn() { // from class: com.google.android.gms.internal.ads.zzcyc
                @Override // com.google.android.gms.internal.ads.zzdbn
                public final void b(Object obj) {
                    ((zzcyf) obj).h(com.google.android.gms.ads.internal.client.zzt.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void s() {
        int i = this.Y.b;
        if (i != 2 && i != 5 && i != 4 && i != 6 && i != 7) {
            return;
        }
        b();
    }
}
