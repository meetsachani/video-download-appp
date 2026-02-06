package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
public final class zzcsz implements zzdbl, zzcxh {
    public final Clock X;
    public final zzctb Y;
    public final String Y0;
    public final zzfcp Z;

    public zzcsz(Clock clock, zzctb zzctbVar, zzfcp zzfcpVar, String str) {
        this.X = clock;
        this.Y = zzctbVar;
        this.Z = zzfcpVar;
        this.Y0 = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdbl
    public final void a() {
        this.Y.e(this.Y0, this.X.b());
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void v() {
        Clock clock = this.X;
        this.Y.d(this.Z.f, this.Y0, clock.b());
    }
}
