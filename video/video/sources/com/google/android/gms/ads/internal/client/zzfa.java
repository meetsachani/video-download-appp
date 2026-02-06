package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzfa extends RemoteCreator {
    public zzfa() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        if (queryLocalInterface instanceof zzcz) {
            return (zzcz) queryLocalInterface;
        }
        return new zzcz(iBinder);
    }

    @InterfaceC11300zs1
    public final zzcy c(Context context) {
        try {
            IBinder r4 = ((zzcz) b(context)).r4(ObjectWrapper.V3(context), ModuleDescriptor.MODULE_VERSION);
            if (r4 == null) {
                return null;
            }
            IInterface queryLocalInterface = r4.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (queryLocalInterface instanceof zzcy) {
                return (zzcy) queryLocalInterface;
            }
            return new zzcw(r4);
        } catch (RemoteException e) {
            e = e;
            com.google.android.gms.ads.internal.util.client.zzo.h("Could not get remote MobileAdsSettingManager.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e2) {
            e = e2;
            com.google.android.gms.ads.internal.util.client.zzo.h("Could not get remote MobileAdsSettingManager.", e);
            return null;
        }
    }
}
