package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes2.dex */
final class zzdyj implements zzcyv {
    public final Context X;
    public final zzbyj Y;

    public zzdyj(Context context, zzbyj zzbyjVar) {
        this.X = context;
        this.Y = zzbyjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void D0(zzbvl zzbvlVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void f0(zzfcg zzfcgVar) {
        String str = zzfcgVar.b.b.e;
        if (!TextUtils.isEmpty(str)) {
            zzbyj zzbyjVar = this.Y;
            Context context = this.X;
            zzbyjVar.m(context, zzfcgVar.a.a.d);
            zzbyjVar.i(context, str);
        }
    }
}
