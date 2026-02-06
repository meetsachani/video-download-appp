package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
public final class zzcmr implements zzcvw {
    public final zzfbx X;
    public final zzfcg Y;
    public final zzfjr Y0;
    public final zzfjn Z;

    public zzcmr(zzfcg zzfcgVar, zzfjr zzfjrVar, zzfjn zzfjnVar) {
        this.Y = zzfcgVar;
        this.Y0 = zzfjrVar;
        this.Z = zzfjnVar;
        this.X = zzfcgVar.b.b;
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void C0(com.google.android.gms.ads.internal.client.zze zzeVar) {
        List list = this.X.a;
        this.Y0.e(this.Z.d(this.Y, null, list), null);
    }
}
