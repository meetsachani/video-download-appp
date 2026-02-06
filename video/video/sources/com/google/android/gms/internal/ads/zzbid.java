package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import java.util.HashMap;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzbid extends RemoteCreator {
    public zzbid() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        if (queryLocalInterface instanceof zzbgt) {
            return (zzbgt) queryLocalInterface;
        }
        return new zzbgr(iBinder);
    }

    @InterfaceC11300zs1
    public final zzbgq c(View view, HashMap hashMap, HashMap hashMap2) {
        try {
            IBinder G1 = ((zzbgt) b(view.getContext())).G1(ObjectWrapper.V3(view), ObjectWrapper.V3(hashMap), ObjectWrapper.V3(hashMap2));
            if (G1 == null) {
                return null;
            }
            IInterface queryLocalInterface = G1.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            if (queryLocalInterface instanceof zzbgq) {
                return (zzbgq) queryLocalInterface;
            }
            return new zzbgo(G1);
        } catch (RemoteException e) {
            e = e;
            com.google.android.gms.ads.internal.util.client.zzo.h("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e2) {
            e = e2;
            com.google.android.gms.ads.internal.util.client.zzo.h("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        }
    }
}
