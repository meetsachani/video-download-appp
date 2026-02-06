package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbpl;
import com.google.android.gms.internal.ads.zzbui;
import com.google.android.gms.internal.ads.zzbuk;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzk extends RemoteCreator {
    public zzbuk c;

    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (queryLocalInterface instanceof zzby) {
            return (zzby) queryLocalInterface;
        }
        return new zzby(iBinder);
    }

    @InterfaceC11300zs1
    public final zzbx c(Context context, zzr zzrVar, String str, zzbpl zzbplVar, int i) {
        zzbcv.a(context);
        if (((Boolean) zzbd.c().b(zzbcv.Xa)).booleanValue()) {
            try {
                IBinder r4 = ((zzby) com.google.android.gms.ads.internal.util.client.zzs.b(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzj
                    @Override // com.google.android.gms.ads.internal.util.client.zzq
                    public final Object b(Object obj) {
                        IBinder iBinder = (IBinder) obj;
                        if (iBinder == null) {
                            return null;
                        }
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                        if (queryLocalInterface instanceof zzby) {
                            return (zzby) queryLocalInterface;
                        }
                        return new zzby(iBinder);
                    }
                })).r4(ObjectWrapper.V3(context), zzrVar, str, zzbplVar, ModuleDescriptor.MODULE_VERSION, i);
                if (r4 == null) {
                    return null;
                }
                IInterface queryLocalInterface = r4.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                if (queryLocalInterface instanceof zzbx) {
                    return (zzbx) queryLocalInterface;
                }
                return new zzbv(r4);
            } catch (RemoteException e) {
                e = e;
                Throwable th = e;
                zzbuk c = zzbui.c(context);
                this.c = c;
                c.b(th, "AdManagerCreator.newAdManagerByDynamiteLoader");
                com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", th);
                return null;
            } catch (com.google.android.gms.ads.internal.util.client.zzr e2) {
                e = e2;
                Throwable th2 = e;
                zzbuk c2 = zzbui.c(context);
                this.c = c2;
                c2.b(th2, "AdManagerCreator.newAdManagerByDynamiteLoader");
                com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", th2);
                return null;
            } catch (NullPointerException e3) {
                e = e3;
                Throwable th22 = e;
                zzbuk c22 = zzbui.c(context);
                this.c = c22;
                c22.b(th22, "AdManagerCreator.newAdManagerByDynamiteLoader");
                com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", th22);
                return null;
            }
        }
        try {
            IBinder r42 = ((zzby) b(context)).r4(ObjectWrapper.V3(context), zzrVar, str, zzbplVar, ModuleDescriptor.MODULE_VERSION, i);
            if (r42 == null) {
                return null;
            }
            IInterface queryLocalInterface2 = r42.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface2 instanceof zzbx) {
                return (zzbx) queryLocalInterface2;
            }
            return new zzbv(r42);
        } catch (RemoteException e4) {
            e = e4;
            com.google.android.gms.ads.internal.util.client.zzo.c("Could not create remote AdManager.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e5) {
            e = e5;
            com.google.android.gms.ads.internal.util.client.zzo.c("Could not create remote AdManager.", e);
            return null;
        }
    }
}
