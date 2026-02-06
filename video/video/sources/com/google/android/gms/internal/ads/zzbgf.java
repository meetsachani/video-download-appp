package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzbgf extends zzayl implements zzbgg {
    public zzbgf() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static zzbgg W7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        if (queryLocalInterface instanceof zzbgg) {
            return (zzbgg) queryLocalInterface;
        }
        return new zzbge(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return false;
                        }
                        int c = c();
                        parcel2.writeNoException();
                        parcel2.writeInt(c);
                    } else {
                        int f = f();
                        parcel2.writeNoException();
                        parcel2.writeInt(f);
                    }
                } else {
                    double b = b();
                    parcel2.writeNoException();
                    parcel2.writeDouble(b);
                }
            } else {
                Uri d = d();
                parcel2.writeNoException();
                zzaym.e(parcel2, d);
            }
        } else {
            IObjectWrapper e = e();
            parcel2.writeNoException();
            zzaym.f(parcel2, e);
        }
        return true;
    }
}
