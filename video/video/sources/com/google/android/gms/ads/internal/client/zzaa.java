package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbpl;
import com.google.android.gms.internal.ads.zzbxc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaa extends zzba {
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ zzbpl d;

    public zzaa(zzaz zzazVar, Context context, String str, zzbpl zzbplVar) {
        this.b = context;
        this.c = str;
        this.d = zzbplVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object a() {
        zzaz.v(this.b, "rewarded");
        return new zzfm();
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object b(zzco zzcoVar) throws RemoteException {
        return zzcoVar.s3(ObjectWrapper.V3(this.b), this.c, this.d, ModuleDescriptor.MODULE_VERSION);
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        return zzbxc.a(this.b, this.c, this.d);
    }
}
