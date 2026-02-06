package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcmy implements zzgcu {
    public final /* synthetic */ String a;
    public final /* synthetic */ zzcmz b;

    public zzcmy(zzcmz zzcmzVar, String str) {
        this.a = str;
        this.b = zzcmzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
        zzfdb zzfdbVar;
        zzfjn zzfjnVar;
        zzfcg zzfcgVar;
        zzfbu zzfbuVar;
        List p0;
        String str = this.a;
        zzcmz zzcmzVar = this.b;
        zzfdbVar = zzcmzVar.c1;
        zzfjnVar = zzcmzVar.b1;
        zzfcgVar = zzcmzVar.Z0;
        zzfbuVar = zzcmzVar.a1;
        p0 = zzcmzVar.p0();
        zzfdbVar.a(zzfjnVar.e(zzfcgVar, zzfbuVar, false, str, null, p0), null);
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        zzfdb zzfdbVar;
        zzfjn zzfjnVar;
        zzfcg zzfcgVar;
        zzfbu zzfbuVar;
        List p0;
        zzcyd zzcydVar;
        zzcmz zzcmzVar = this.b;
        String str = this.a;
        String str2 = (String) obj;
        zzfdbVar = zzcmzVar.c1;
        zzfjnVar = zzcmzVar.b1;
        zzfcgVar = zzcmzVar.Z0;
        zzfbuVar = zzcmzVar.a1;
        p0 = zzcmzVar.p0();
        List e = zzfjnVar.e(zzfcgVar, zzfbuVar, false, str, str2, p0);
        zzcydVar = zzcmzVar.i1;
        zzfdbVar.a(e, zzcydVar);
    }
}
