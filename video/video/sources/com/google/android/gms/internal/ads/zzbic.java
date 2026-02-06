package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzbic extends RemoteCreator {
    public zzbic() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        if (queryLocalInterface instanceof zzbgn) {
            return (zzbgn) queryLocalInterface;
        }
        return new zzbgl(iBinder);
    }

    @InterfaceC11300zs1
    public final zzbgk c(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder g4 = ((zzbgn) b(context)).g4(ObjectWrapper.V3(context), ObjectWrapper.V3(frameLayout), ObjectWrapper.V3(frameLayout2), ModuleDescriptor.MODULE_VERSION);
            if (g4 == null) {
                return null;
            }
            IInterface queryLocalInterface = g4.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            if (queryLocalInterface instanceof zzbgk) {
                return (zzbgk) queryLocalInterface;
            }
            return new zzbgi(g4);
        } catch (RemoteException e) {
            e = e;
            com.google.android.gms.ads.internal.util.client.zzo.h("Could not create remote NativeAdViewDelegate.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e2) {
            e = e2;
            com.google.android.gms.ads.internal.util.client.zzo.h("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }
}
