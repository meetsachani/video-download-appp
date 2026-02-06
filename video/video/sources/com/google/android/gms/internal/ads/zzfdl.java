package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;
import o.InterfaceC5056aJ2;
import o.InterfaceC8710pF0;

/* loaded from: classes2.dex */
public final class zzfdl {
    @InterfaceC8710pF0("LiteSdkInfoRetriever.class")
    public static zzfdl d;
    public final Context a;
    public final com.google.android.gms.ads.internal.client.zzcv b;
    public final AtomicReference c = new AtomicReference();

    @InterfaceC5056aJ2
    public zzfdl(Context context, com.google.android.gms.ads.internal.client.zzcv zzcvVar) {
        this.a = context;
        this.b = zzcvVar;
    }

    @InterfaceC5056aJ2
    public static com.google.android.gms.ads.internal.client.zzcv a(Context context) {
        try {
            return com.google.android.gms.ads.internal.client.zzcu.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Failed to retrieve lite SDK info.", e);
            return null;
        }
    }

    public static zzfdl d(Context context) {
        synchronized (zzfdl.class) {
            try {
                zzfdl zzfdlVar = d;
                if (zzfdlVar != null) {
                    return zzfdlVar;
                }
                Context applicationContext = context.getApplicationContext();
                long longValue = ((Long) zzbew.b.e()).longValue();
                com.google.android.gms.ads.internal.client.zzcv zzcvVar = null;
                if (longValue > 0 && longValue <= 251815200) {
                    zzcvVar = a(applicationContext);
                }
                zzfdl zzfdlVar2 = new zzfdl(applicationContext, zzcvVar);
                d = zzfdlVar2;
                return zzfdlVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzbpl b() {
        return (zzbpl) this.c.get();
    }

    public final VersionInfoParcel c(int i, boolean z, int i2) {
        com.google.android.gms.ads.internal.client.zzex g;
        com.google.android.gms.ads.internal.zzv.v();
        boolean f = com.google.android.gms.ads.internal.util.zzs.f(this.a);
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(ModuleDescriptor.MODULE_VERSION, i2, true, f);
        if (((Boolean) zzbew.c.e()).booleanValue() && (g = g()) != null) {
            return new VersionInfoParcel(ModuleDescriptor.MODULE_VERSION, g.m0(), true, f);
        }
        return versionInfoParcel;
    }

    public final String e() {
        com.google.android.gms.ads.internal.client.zzex g = g();
        if (g != null) {
            return g.B0();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(zzbpl zzbplVar) {
        zzbpl adapterCreator;
        if (((Boolean) zzbew.a.e()).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzcv zzcvVar = this.b;
            if (zzcvVar != null) {
                try {
                    adapterCreator = zzcvVar.getAdapterCreator();
                } catch (RemoteException unused) {
                }
                AtomicReference atomicReference = this.c;
                if (adapterCreator != null) {
                    zzbplVar = adapterCreator;
                }
                zzfdk.a(atomicReference, null, zzbplVar);
                return;
            }
            adapterCreator = null;
            AtomicReference atomicReference2 = this.c;
            if (adapterCreator != null) {
            }
            zzfdk.a(atomicReference2, null, zzbplVar);
            return;
        }
        zzfdk.a(this.c, null, zzbplVar);
    }

    public final com.google.android.gms.ads.internal.client.zzex g() {
        com.google.android.gms.ads.internal.client.zzcv zzcvVar = this.b;
        if (zzcvVar != null) {
            try {
                return zzcvVar.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }
}
