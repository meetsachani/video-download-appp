package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* loaded from: classes2.dex */
final class zzcmx implements zzgcu {
    public final /* synthetic */ zzcmz a;

    public zzcmx(zzcmz zzcmzVar) {
        this.a = zzcmzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        zzfdb zzfdbVar;
        zzfjn zzfjnVar;
        zzfcg zzfcgVar;
        zzfbu zzfbuVar;
        zzfbu zzfbuVar2;
        Context context;
        zzcmz zzcmzVar = this.a;
        String str = (String) obj;
        zzfdbVar = zzcmzVar.c1;
        zzfjnVar = zzcmzVar.b1;
        zzfcgVar = zzcmzVar.Z0;
        zzfbuVar = zzcmzVar.a1;
        zzfbuVar2 = zzcmzVar.a1;
        List e = zzfjnVar.e(zzfcgVar, zzfbuVar, false, "", str, zzfbuVar2.c);
        zzbzn t = com.google.android.gms.ads.internal.zzv.t();
        context = zzcmzVar.X;
        boolean a = t.a(context);
        int i = 1;
        if (true == a) {
            i = 2;
        }
        zzfdbVar.c(e, i);
    }
}
