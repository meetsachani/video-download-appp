package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbpl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzao extends zzba {
    public final /* synthetic */ Context b;
    public final /* synthetic */ zzr c;
    public final /* synthetic */ String d;
    public final /* synthetic */ zzbpl e;
    public final /* synthetic */ zzaz f;

    public zzao(zzaz zzazVar, Context context, zzr zzrVar, String str, zzbpl zzbplVar) {
        this.b = context;
        this.c = zzrVar;
        this.d = str;
        this.e = zzbplVar;
        this.f = zzazVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object a() {
        zzaz.v(this.b, "interstitial");
        return new zzfg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object b(zzco zzcoVar) throws RemoteException {
        return zzcoVar.W4(ObjectWrapper.V3(this.b), this.c, this.d, this.e, ModuleDescriptor.MODULE_VERSION);
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        zzk zzkVar;
        zzkVar = this.f.a;
        return zzkVar.c(this.b, this.c, this.d, this.e, 2);
    }
}
