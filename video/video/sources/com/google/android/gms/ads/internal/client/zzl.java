package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbpl;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
public final class zzl extends RemoteCreator {
    public zzl() {
        super("com.google.android.gms.ads.AdPreloaderRemoteCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
        if (queryLocalInterface instanceof zzci) {
            return (zzci) queryLocalInterface;
        }
        return new zzci(iBinder);
    }

    @InterfaceC10571ws1
    public final zzch c(Context context, zzbpl zzbplVar) {
        zzch zzcfVar;
        try {
            IBinder r4 = ((zzci) b(context)).r4(ObjectWrapper.V3(context), zzbplVar, ModuleDescriptor.MODULE_VERSION);
            if (r4 == null) {
                zzcfVar = null;
            } else {
                IInterface queryLocalInterface = r4.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                if (queryLocalInterface instanceof zzch) {
                    zzcfVar = (zzch) queryLocalInterface;
                } else {
                    zzcfVar = new zzcf(r4);
                }
            }
            zzcfVar.B1(zzbplVar);
            return zzcfVar;
        } catch (RemoteException e) {
            e = e;
            com.google.android.gms.ads.internal.util.client.zzo.h("Could not get remote AdPreloaderCreator.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e2) {
            e = e2;
            com.google.android.gms.ads.internal.util.client.zzo.h("Could not get remote AdPreloaderCreator.", e);
            return null;
        }
    }
}
