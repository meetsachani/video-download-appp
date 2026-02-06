package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbgp;
import com.google.android.gms.internal.ads.zzbgs;
import com.google.android.gms.internal.ads.zzbgt;
import com.google.android.gms.internal.ads.zzbid;
import com.google.android.gms.internal.ads.zzbui;
import com.google.android.gms.internal.ads.zzbuk;
import java.util.HashMap;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzay extends zzba {
    public final /* synthetic */ View b;
    public final /* synthetic */ HashMap c;
    public final /* synthetic */ HashMap d;
    public final /* synthetic */ zzaz e;

    public zzay(zzaz zzazVar, View view, HashMap hashMap, HashMap hashMap2) {
        this.b = view;
        this.c = hashMap;
        this.d = hashMap2;
        this.e = zzazVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object a() {
        zzaz.v(this.b.getContext(), "native_ad_view_holder_delegate");
        return new zzfk();
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object b(zzco zzcoVar) throws RemoteException {
        HashMap hashMap = this.d;
        return zzcoVar.Q6(ObjectWrapper.V3(this.b), ObjectWrapper.V3(this.c), ObjectWrapper.V3(hashMap));
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    @InterfaceC11300zs1
    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        zzbuk zzbukVar;
        zzbid zzbidVar;
        View view = this.b;
        zzbcv.a(view.getContext());
        if (((Boolean) zzbd.c().b(zzbcv.Xa)).booleanValue()) {
            try {
                return zzbgp.W7(((zzbgt) com.google.android.gms.ads.internal.util.client.zzs.b(view.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzax
                    @Override // com.google.android.gms.ads.internal.util.client.zzq
                    public final Object b(Object obj) {
                        return zzbgs.W7((IBinder) obj);
                    }
                })).G1(ObjectWrapper.V3(view), ObjectWrapper.V3(this.c), ObjectWrapper.V3(this.d)));
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e) {
                zzaz zzazVar = this.e;
                zzazVar.g = zzbui.c(this.b.getContext());
                zzbukVar = zzazVar.g;
                zzbukVar.b(e, "ClientApiBroker.createNativeAdViewHolderDelegate");
                return null;
            }
        }
        zzaz zzazVar2 = this.e;
        View view2 = this.b;
        HashMap hashMap = this.c;
        HashMap hashMap2 = this.d;
        zzbidVar = zzazVar2.f;
        return zzbidVar.c(view2, hashMap, hashMap2);
    }
}
