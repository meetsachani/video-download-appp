package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzbti extends RemoteCreator {
    public zzbti() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (queryLocalInterface instanceof zzbto) {
            return (zzbto) queryLocalInterface;
        }
        return new zzbtm(iBinder);
    }

    @InterfaceC11300zs1
    public final zzbtl c(Activity activity) {
        try {
            IBinder zze = ((zzbto) b(activity)).zze(ObjectWrapper.V3(activity));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            if (queryLocalInterface instanceof zzbtl) {
                return (zzbtl) queryLocalInterface;
            }
            return new zzbtj(zze);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.h("Could not create remote AdOverlay.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.h("Could not create remote AdOverlay.", e2);
            return null;
        }
    }
}
