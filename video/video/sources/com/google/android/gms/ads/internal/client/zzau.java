package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbui;
import com.google.android.gms.internal.ads.zzbuk;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzau extends zzba {
    public final /* synthetic */ Context b;
    public final /* synthetic */ zzaz c;

    public zzau(zzaz zzazVar, Context context) {
        this.b = context;
        this.c = zzazVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object a() {
        zzaz.v(this.b, "mobile_ads_settings");
        return new zzfi();
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object b(zzco zzcoVar) throws RemoteException {
        return zzcoVar.L3(ObjectWrapper.V3(this.b), ModuleDescriptor.MODULE_VERSION);
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    @InterfaceC11300zs1
    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        zzfa zzfaVar;
        zzbuk zzbukVar;
        Context context = this.b;
        zzbcv.a(context);
        if (((Boolean) zzbd.c().b(zzbcv.Xa)).booleanValue()) {
            try {
                IBinder r4 = ((zzcz) com.google.android.gms.ads.internal.util.client.zzs.b(context, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzat
                    @Override // com.google.android.gms.ads.internal.util.client.zzq
                    public final Object b(Object obj) {
                        IBinder iBinder = (IBinder) obj;
                        if (iBinder == null) {
                            return null;
                        }
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                        if (queryLocalInterface instanceof zzcz) {
                            return (zzcz) queryLocalInterface;
                        }
                        return new zzcz(iBinder);
                    }
                })).r4(ObjectWrapper.V3(context), ModuleDescriptor.MODULE_VERSION);
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
                zzaz zzazVar = this.c;
                zzazVar.g = zzbui.c(this.b);
                zzbukVar = zzazVar.g;
                zzbukVar.b(e, "ClientApiBroker.getMobileAdsSettingsManager");
                return null;
            } catch (com.google.android.gms.ads.internal.util.client.zzr e2) {
                e = e2;
                zzaz zzazVar2 = this.c;
                zzazVar2.g = zzbui.c(this.b);
                zzbukVar = zzazVar2.g;
                zzbukVar.b(e, "ClientApiBroker.getMobileAdsSettingsManager");
                return null;
            } catch (NullPointerException e3) {
                e = e3;
                zzaz zzazVar22 = this.c;
                zzazVar22.g = zzbui.c(this.b);
                zzbukVar = zzazVar22.g;
                zzbukVar.b(e, "ClientApiBroker.getMobileAdsSettingsManager");
                return null;
            }
        }
        zzaz zzazVar3 = this.c;
        Context context2 = this.b;
        zzfaVar = zzazVar3.c;
        return zzfaVar.c(context2);
    }
}
