package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbfo {
    public final Context a;

    public zzbfo(Context context) {
        this.a = context;
    }

    public final void a(zzbup zzbupVar) {
        try {
            ((zzbfp) com.google.android.gms.ads.internal.util.client.zzs.b(this.a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.internal.ads.zzbfn
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final Object b(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                    if (queryLocalInterface instanceof zzbfp) {
                        return (zzbfp) queryLocalInterface;
                    }
                    return new zzbfp(iBinder);
                }
            })).r4(zzbupVar);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.g("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e.getMessage())));
        } catch (com.google.android.gms.ads.internal.util.client.zzr e2) {
            com.google.android.gms.ads.internal.util.client.zzo.g("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e2.getMessage())));
        }
    }
}
