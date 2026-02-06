package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbpl;
import com.google.android.gms.internal.ads.zzbui;
import com.google.android.gms.internal.ads.zzbuk;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzas extends zzba {
    public final /* synthetic */ Context b;
    public final /* synthetic */ zzbpl c;
    public final /* synthetic */ zzaz d;

    public zzas(zzaz zzazVar, Context context, zzbpl zzbplVar) {
        this.b = context;
        this.c = zzbplVar;
        this.d = zzazVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    @InterfaceC11300zs1
    public final /* bridge */ /* synthetic */ Object a() {
        zzaz.v(this.b, "ads_preloader");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object b(zzco zzcoVar) throws RemoteException {
        IObjectWrapper V3 = ObjectWrapper.V3(this.b);
        zzbpl zzbplVar = this.c;
        zzch q4 = zzcoVar.q4(V3, zzbplVar, ModuleDescriptor.MODULE_VERSION);
        q4.B1(zzbplVar);
        return q4;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    @InterfaceC11300zs1
    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        zzl zzlVar;
        zzbuk zzbukVar;
        zzch zzcfVar;
        Context context = this.b;
        IObjectWrapper V3 = ObjectWrapper.V3(context);
        zzbcv.a(context);
        if (((Boolean) zzbd.c().b(zzbcv.Xa)).booleanValue()) {
            try {
                zzbpl zzbplVar = this.c;
                IBinder r4 = ((zzci) com.google.android.gms.ads.internal.util.client.zzs.b(context, "com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzar
                    @Override // com.google.android.gms.ads.internal.util.client.zzq
                    public final Object b(Object obj) {
                        IBinder iBinder = (IBinder) obj;
                        if (iBinder == null) {
                            return null;
                        }
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
                        if (queryLocalInterface instanceof zzci) {
                            return (zzci) queryLocalInterface;
                        }
                        return new zzci(iBinder);
                    }
                })).r4(V3, zzbplVar, ModuleDescriptor.MODULE_VERSION);
                if (r4 == null) {
                    zzcfVar = null;
                } else {
                    IInterface queryLocalInterface = r4.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                    if (queryLocalInterface instanceof zzch) {
                        zzcfVar = (zzch) queryLocalInterface;
                    } else {
                        zzcfVar = new zzcf(r4);
                    }
                }
                zzcfVar.B1(zzbplVar);
                return zzcfVar;
            } catch (RemoteException e) {
                e = e;
                zzaz zzazVar = this.d;
                zzazVar.g = zzbui.c(this.b);
                zzbukVar = zzazVar.g;
                zzbukVar.b(e, "ClientApiBroker.getAdPreloader");
                return null;
            } catch (com.google.android.gms.ads.internal.util.client.zzr e2) {
                e = e2;
                zzaz zzazVar2 = this.d;
                zzazVar2.g = zzbui.c(this.b);
                zzbukVar = zzazVar2.g;
                zzbukVar.b(e, "ClientApiBroker.getAdPreloader");
                return null;
            } catch (NullPointerException e3) {
                e = e3;
                zzaz zzazVar22 = this.d;
                zzazVar22.g = zzbui.c(this.b);
                zzbukVar = zzazVar22.g;
                zzbukVar.b(e, "ClientApiBroker.getAdPreloader");
                return null;
            }
        }
        zzaz zzazVar3 = this.d;
        Context context2 = this.b;
        zzbpl zzbplVar2 = this.c;
        zzlVar = zzazVar3.h;
        return zzlVar.c(context2, zzbplVar2);
    }
}
