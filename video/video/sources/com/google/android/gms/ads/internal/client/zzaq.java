package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbpl;
import com.google.android.gms.internal.ads.zzbui;
import com.google.android.gms.internal.ads.zzbuk;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaq extends zzba {
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ zzbpl d;
    public final /* synthetic */ zzaz e;

    public zzaq(zzaz zzazVar, Context context, String str, zzbpl zzbplVar) {
        this.b = context;
        this.c = str;
        this.d = zzbplVar;
        this.e = zzazVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object a() {
        zzaz.v(this.b, "native_ad");
        return new zzfe();
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object b(zzco zzcoVar) throws RemoteException {
        return zzcoVar.e2(ObjectWrapper.V3(this.b), this.c, this.d, ModuleDescriptor.MODULE_VERSION);
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    @InterfaceC11300zs1
    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        zzi zziVar;
        zzbuk zzbukVar;
        Context context = this.b;
        zzbcv.a(context);
        if (((Boolean) zzbd.c().b(zzbcv.Xa)).booleanValue()) {
            try {
                IBinder r4 = ((zzbu) com.google.android.gms.ads.internal.util.client.zzs.b(context, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzap
                    @Override // com.google.android.gms.ads.internal.util.client.zzq
                    public final Object b(Object obj) {
                        IBinder iBinder = (IBinder) obj;
                        if (iBinder == null) {
                            return null;
                        }
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                        if (queryLocalInterface instanceof zzbu) {
                            return (zzbu) queryLocalInterface;
                        }
                        return new zzbu(iBinder);
                    }
                })).r4(ObjectWrapper.V3(context), this.c, this.d, ModuleDescriptor.MODULE_VERSION);
                if (r4 == null) {
                    return null;
                }
                IInterface queryLocalInterface = r4.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                if (queryLocalInterface instanceof zzbt) {
                    return (zzbt) queryLocalInterface;
                }
                return new zzbr(r4);
            } catch (RemoteException e) {
                e = e;
                zzaz zzazVar = this.e;
                zzazVar.g = zzbui.c(this.b);
                zzbukVar = zzazVar.g;
                zzbukVar.b(e, "ClientApiBroker.createAdLoaderBuilder");
                return null;
            } catch (com.google.android.gms.ads.internal.util.client.zzr e2) {
                e = e2;
                zzaz zzazVar2 = this.e;
                zzazVar2.g = zzbui.c(this.b);
                zzbukVar = zzazVar2.g;
                zzbukVar.b(e, "ClientApiBroker.createAdLoaderBuilder");
                return null;
            } catch (NullPointerException e3) {
                e = e3;
                zzaz zzazVar22 = this.e;
                zzazVar22.g = zzbui.c(this.b);
                zzbukVar = zzazVar22.g;
                zzbukVar.b(e, "ClientApiBroker.createAdLoaderBuilder");
                return null;
            }
        }
        zzaz zzazVar3 = this.e;
        Context context2 = this.b;
        String str = this.c;
        zzbpl zzbplVar = this.d;
        zziVar = zzazVar3.b;
        return zziVar.c(context2, str, zzbplVar);
    }
}
