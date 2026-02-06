package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbpl;
import com.google.android.gms.internal.ads.zzbyx;
import com.google.android.gms.internal.ads.zzbyy;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzag extends zzba {
    public final /* synthetic */ Context b;
    public final /* synthetic */ zzbpl c;

    public zzag(zzaz zzazVar, Context context, zzbpl zzbplVar) {
        this.b = context;
        this.c = zzbplVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    @InterfaceC11300zs1
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object b(zzco zzcoVar) throws RemoteException {
        return zzcoVar.r7(ObjectWrapper.V3(this.b), this.c, ModuleDescriptor.MODULE_VERSION);
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    @InterfaceC11300zs1
    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        Context context = this.b;
        try {
            return ((zzbyy) com.google.android.gms.ads.internal.util.client.zzs.b(context, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzaf
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final Object b(Object obj) {
                    return zzbyx.W7((IBinder) obj);
                }
            })).U0(ObjectWrapper.V3(context), this.c, ModuleDescriptor.MODULE_VERSION);
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException unused) {
            return null;
        }
    }
}
