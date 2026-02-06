package com.google.android.gms.internal.ads;

import android.view.Surface;

/* loaded from: classes2.dex */
final class zzaap implements zzace {
    public final /* synthetic */ zzaau b;

    public zzaap(zzaau zzaauVar) {
        this.b = zzaauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void a() {
        Surface surface;
        zzaau zzaauVar = this.b;
        surface = zzaauVar.L2;
        if (surface != null) {
            zzaauVar.v1();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void c() {
        Surface surface;
        zzaau zzaauVar = this.b;
        surface = zzaauVar.L2;
        if (surface != null) {
            zzaauVar.h1(0, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void d(zzcd zzcdVar) {
    }
}
