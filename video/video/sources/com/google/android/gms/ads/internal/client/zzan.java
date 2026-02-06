package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzan extends zzba {
    public final /* synthetic */ Context b;
    public final /* synthetic */ zzr c;
    public final /* synthetic */ String d;
    public final /* synthetic */ zzaz e;

    public zzan(zzaz zzazVar, Context context, zzr zzrVar, String str) {
        this.b = context;
        this.c = zzrVar;
        this.d = str;
        this.e = zzazVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object a() {
        zzaz.v(this.b, "search");
        return new zzfg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object b(zzco zzcoVar) throws RemoteException {
        return zzcoVar.m2(ObjectWrapper.V3(this.b), this.c, this.d, ModuleDescriptor.MODULE_VERSION);
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        zzk zzkVar;
        zzkVar = this.e.a;
        return zzkVar.c(this.b, this.c, this.d, null, 3);
    }
}
