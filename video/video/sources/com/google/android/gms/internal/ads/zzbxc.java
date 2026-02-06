package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzbxc {
    @InterfaceC11300zs1
    public static final zzbwq a(Context context, String str, zzbpl zzbplVar) {
        try {
            IBinder r4 = ((zzbwu) com.google.android.gms.ads.internal.util.client.zzs.b(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.internal.ads.zzbxb
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final Object b(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    if (queryLocalInterface instanceof zzbwu) {
                        return (zzbwu) queryLocalInterface;
                    }
                    return new zzbwu(iBinder);
                }
            })).r4(ObjectWrapper.V3(context), str, zzbplVar, ModuleDescriptor.MODULE_VERSION);
            if (r4 == null) {
                return null;
            }
            IInterface queryLocalInterface = r4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            if (queryLocalInterface instanceof zzbwq) {
                return (zzbwq) queryLocalInterface;
            }
            return new zzbwo(r4);
        } catch (RemoteException e) {
            e = e;
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e2) {
            e = e2;
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
            return null;
        }
    }
}
