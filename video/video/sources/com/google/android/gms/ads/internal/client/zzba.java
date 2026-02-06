package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbeq;
import com.google.android.gms.internal.ads.zzbfe;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzba {
    @InterfaceC11300zs1
    public static final zzco a;

    static {
        zzco zzcmVar;
        zzco zzcoVar = null;
        try {
            Object newInstance = zzaz.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(null).newInstance(null);
            if (!(newInstance instanceof IBinder)) {
                com.google.android.gms.ads.internal.util.client.zzo.g("ClientApi class is not an instance of IBinder.");
            } else {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    if (queryLocalInterface instanceof zzco) {
                        zzcmVar = (zzco) queryLocalInterface;
                    } else {
                        zzcmVar = new zzcm(iBinder);
                    }
                    zzcoVar = zzcmVar;
                }
            }
        } catch (Exception unused) {
            com.google.android.gms.ads.internal.util.client.zzo.g("Failed to instantiate ClientApi class.");
        }
        a = zzcoVar;
    }

    @InterfaceC5670cr1
    public abstract Object a();

    @InterfaceC11300zs1
    public abstract Object b(zzco zzcoVar) throws RemoteException;

    @InterfaceC11300zs1
    public abstract Object c() throws RemoteException;

    public final Object d(Context context, boolean z) {
        boolean z2;
        boolean z3;
        Object e;
        if (!z) {
            zzbb.b();
            if (!com.google.android.gms.ads.internal.util.client.zzf.y(context, GooglePlayServicesUtilLight.a)) {
                com.google.android.gms.ads.internal.util.client.zzo.b("Google Play Services is not available.");
                z = true;
            }
        }
        boolean z4 = false;
        if (DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) > DynamiteModule.c(context, ModuleDescriptor.MODULE_ID)) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z5 = !z2;
        zzbcv.a(context);
        if (((Boolean) zzbeq.a.e()).booleanValue()) {
            z3 = false;
        } else if (((Boolean) zzbeq.b.e()).booleanValue()) {
            z3 = true;
            z4 = true;
        } else {
            z4 = z | z5;
            z3 = false;
        }
        if (z4) {
            e = e();
            if (e == null && !z3) {
                e = f();
            }
        } else {
            Object f = f();
            if (f == null) {
                if (zzbb.e().nextInt(((Long) zzbfe.a.e()).intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    zzbb.b().t(context, zzbb.c().X, "gmob-apps", bundle, true);
                }
            }
            e = f == null ? e() : f;
        }
        if (e == null) {
            return a();
        }
        return e;
    }

    @InterfaceC11300zs1
    public final Object e() {
        zzco zzcoVar = a;
        if (zzcoVar != null) {
            try {
                return b(zzcoVar);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.h("Cannot invoke local loader using ClientApi class.", e);
                return null;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzo.g("ClientApi class cannot be loaded.");
        return null;
    }

    @InterfaceC11300zs1
    public final Object f() {
        try {
            return c();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.h("Cannot invoke remote loader.", e);
            return null;
        }
    }
}
