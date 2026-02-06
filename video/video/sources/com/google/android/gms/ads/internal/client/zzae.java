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
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzae extends zzba {
    public final /* synthetic */ Context b;
    public final /* synthetic */ zzbpl c;

    public zzae(zzaz zzazVar, Context context, zzbpl zzbplVar) {
        this.b = context;
        this.c = zzbplVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    @InterfaceC11300zs1
    public final /* bridge */ /* synthetic */ Object a() {
        zzaz.v(this.b, "out_of_context_tester");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    @InterfaceC11300zs1
    public final /* bridge */ /* synthetic */ Object b(zzco zzcoVar) throws RemoteException {
        Context context = this.b;
        IObjectWrapper V3 = ObjectWrapper.V3(context);
        zzbcv.a(context);
        if (((Boolean) zzbd.c().b(zzbcv.I9)).booleanValue()) {
            return zzcoVar.y3(V3, this.c, ModuleDescriptor.MODULE_VERSION);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    @InterfaceC11300zs1
    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        Context context = this.b;
        IObjectWrapper V3 = ObjectWrapper.V3(context);
        zzbcv.a(context);
        if (((Boolean) zzbd.c().b(zzbcv.I9)).booleanValue()) {
            try {
                return ((zzdu) com.google.android.gms.ads.internal.util.client.zzs.b(context, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzad
                    @Override // com.google.android.gms.ads.internal.util.client.zzq
                    public final Object b(Object obj) {
                        IBinder iBinder = (IBinder) obj;
                        if (iBinder == null) {
                            return null;
                        }
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                        if (queryLocalInterface instanceof zzdu) {
                            return (zzdu) queryLocalInterface;
                        }
                        return new zzdu(iBinder);
                    }
                })).r4(V3, this.c, ModuleDescriptor.MODULE_VERSION);
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e) {
                zzbui.c(this.b).b(e, "ClientApiBroker.getOutOfContextTester");
            }
        }
        return null;
    }
}
