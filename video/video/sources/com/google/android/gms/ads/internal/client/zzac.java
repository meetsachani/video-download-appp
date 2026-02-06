package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbti;
import com.google.android.gms.internal.ads.zzbtk;
import com.google.android.gms.internal.ads.zzbtn;
import com.google.android.gms.internal.ads.zzbto;
import com.google.android.gms.internal.ads.zzbui;
import com.google.android.gms.internal.ads.zzbuk;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzac extends zzba {
    public final /* synthetic */ Activity b;
    public final /* synthetic */ zzaz c;

    public zzac(zzaz zzazVar, Activity activity) {
        this.b = activity;
        this.c = zzazVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    @InterfaceC11300zs1
    public final /* bridge */ /* synthetic */ Object a() {
        zzaz.v(this.b, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object b(zzco zzcoVar) throws RemoteException {
        return zzcoVar.d0(ObjectWrapper.V3(this.b));
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    @InterfaceC11300zs1
    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        zzbuk zzbukVar;
        zzbti zzbtiVar;
        Activity activity = this.b;
        zzbcv.a(activity);
        if (((Boolean) zzbd.c().b(zzbcv.Xa)).booleanValue()) {
            try {
                return zzbtk.W7(((zzbto) com.google.android.gms.ads.internal.util.client.zzs.b(activity, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzab
                    @Override // com.google.android.gms.ads.internal.util.client.zzq
                    public final Object b(Object obj) {
                        return zzbtn.W7((IBinder) obj);
                    }
                })).zze(ObjectWrapper.V3(activity)));
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e) {
                zzaz zzazVar = this.c;
                zzazVar.g = zzbui.c(this.b.getApplicationContext());
                zzbukVar = zzazVar.g;
                zzbukVar.b(e, "ClientApiBroker.createAdOverlay");
                return null;
            }
        }
        zzaz zzazVar2 = this.c;
        Activity activity2 = this.b;
        zzbtiVar = zzazVar2.e;
        return zzbtiVar.c(activity2);
    }
}
