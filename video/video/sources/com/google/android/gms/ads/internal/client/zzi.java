package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbpl;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzi extends RemoteCreator {
    public zzi() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        if (queryLocalInterface instanceof zzbu) {
            return (zzbu) queryLocalInterface;
        }
        return new zzbu(iBinder);
    }

    @InterfaceC11300zs1
    public final zzbt c(Context context, String str, zzbpl zzbplVar) {
        try {
            IBinder r4 = ((zzbu) b(context)).r4(ObjectWrapper.V3(context), str, zzbplVar, ModuleDescriptor.MODULE_VERSION);
            if (r4 == null) {
                return null;
            }
            IInterface queryLocalInterface = r4.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (queryLocalInterface instanceof zzbt) {
                return (zzbt) queryLocalInterface;
            }
            return new zzbr(r4);
        } catch (RemoteException e) {
            e = e;
            com.google.android.gms.ads.internal.util.client.zzo.h("Could not create remote builder for AdLoader.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e2) {
            e = e2;
            com.google.android.gms.ads.internal.util.client.zzo.h("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }
}
