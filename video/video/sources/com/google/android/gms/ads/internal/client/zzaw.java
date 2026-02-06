package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbgj;
import com.google.android.gms.internal.ads.zzbgm;
import com.google.android.gms.internal.ads.zzbgn;
import com.google.android.gms.internal.ads.zzbic;
import com.google.android.gms.internal.ads.zzbui;
import com.google.android.gms.internal.ads.zzbuk;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaw extends zzba {
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ zzaz e;

    public zzaw(zzaz zzazVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.b = frameLayout;
        this.c = frameLayout2;
        this.d = context;
        this.e = zzazVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object a() {
        zzaz.v(this.d, "native_ad_view_delegate");
        return new zzfj();
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object b(zzco zzcoVar) throws RemoteException {
        return zzcoVar.T2(ObjectWrapper.V3(this.b), ObjectWrapper.V3(this.c));
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    @InterfaceC11300zs1
    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        zzbuk zzbukVar;
        zzbic zzbicVar;
        Context context = this.d;
        zzbcv.a(context);
        if (((Boolean) zzbd.c().b(zzbcv.Xa)).booleanValue()) {
            try {
                return zzbgj.W7(((zzbgn) com.google.android.gms.ads.internal.util.client.zzs.b(context, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzav
                    @Override // com.google.android.gms.ads.internal.util.client.zzq
                    public final Object b(Object obj) {
                        return zzbgm.W7((IBinder) obj);
                    }
                })).g4(ObjectWrapper.V3(context), ObjectWrapper.V3(this.b), ObjectWrapper.V3(this.c), ModuleDescriptor.MODULE_VERSION));
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e) {
                zzaz zzazVar = this.e;
                zzazVar.g = zzbui.c(this.d);
                zzbukVar = zzazVar.g;
                zzbukVar.b(e, "ClientApiBroker.createNativeAdViewDelegate");
                return null;
            }
        }
        zzaz zzazVar2 = this.e;
        Context context2 = this.d;
        FrameLayout frameLayout = this.b;
        FrameLayout frameLayout2 = this.c;
        zzbicVar = zzazVar2.d;
        return zzbicVar.c(context2, frameLayout, frameLayout2);
    }
}
