package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.dynamic.ObjectWrapper;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zzbhb {
    public final zzbha a;

    @InterfaceC5056aJ2
    public zzbhb(zzbha zzbhaVar) {
        Context context;
        this.a = zzbhaVar;
        try {
            context = (Context) ObjectWrapper.o1(zzbhaVar.h());
        } catch (RemoteException | NullPointerException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            context = null;
        }
        if (context != null) {
            try {
                this.a.F0(ObjectWrapper.V3(new MediaView(context)));
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzo.e("", e2);
            }
        }
    }

    public final zzbha a() {
        return this.a;
    }

    @InterfaceC11300zs1
    public final String b() {
        try {
            return this.a.i();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            return null;
        }
    }
}
