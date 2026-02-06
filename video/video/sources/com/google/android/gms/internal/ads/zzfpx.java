package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zzfpx {
    @InterfaceC5056aJ2
    public final zzfqa a;
    @InterfaceC5056aJ2
    public final boolean b;

    public zzfpx(zzfqa zzfqaVar) {
        this.a = zzfqaVar;
        this.b = zzfqaVar != null;
    }

    public static zzfpx b(Context context, String str, String str2) {
        zzfqa zzfpyVar;
        try {
            try {
                try {
                    IBinder d = DynamiteModule.e(context, DynamiteModule.f, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (d == null) {
                        zzfpyVar = null;
                    } else {
                        IInterface queryLocalInterface = d.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        if (queryLocalInterface instanceof zzfqa) {
                            zzfpyVar = (zzfqa) queryLocalInterface;
                        } else {
                            zzfpyVar = new zzfpy(d);
                        }
                    }
                    zzfpyVar.o4(ObjectWrapper.V3(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzfpx(zzfpyVar);
                } catch (Exception e) {
                    throw new zzfoz(e);
                }
            } catch (Exception e2) {
                throw new zzfoz(e2);
            }
        } catch (RemoteException | zzfoz | NullPointerException | SecurityException unused) {
            Log.d("GASS", "Cannot dynamite load clearcut");
            return new zzfpx(new zzfqb());
        }
    }

    public static zzfpx c() {
        zzfqb zzfqbVar = new zzfqb();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfpx(zzfqbVar);
    }

    public final zzfpv a(byte[] bArr) {
        return new zzfpv(this, bArr, null);
    }
}
