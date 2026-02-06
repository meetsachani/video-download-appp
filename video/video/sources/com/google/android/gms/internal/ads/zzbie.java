package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbie extends zzbhj {
    public final /* synthetic */ zzbih X;

    public /* synthetic */ zzbie(zzbih zzbihVar, zzbig zzbigVar) {
        this.X = zzbihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhk
    public final void T3(zzbha zzbhaVar, String str) {
        com.google.android.gms.ads.formats.zzf zzfVar;
        com.google.android.gms.ads.formats.zzf zzfVar2;
        zzbhb f;
        zzbih zzbihVar = this.X;
        zzfVar = zzbihVar.b;
        if (zzfVar != null) {
            zzfVar2 = zzbihVar.b;
            f = zzbihVar.f(zzbhaVar);
            zzfVar2.b(f, str);
        }
    }
}
