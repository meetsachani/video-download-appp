package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzbpz extends zzayl implements zzbqa {
    public zzbpz() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public static zzbqa W7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        if (queryLocalInterface instanceof zzbqa) {
            return (zzbqa) queryLocalInterface;
        }
        return new zzbpy(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                String s = s();
                parcel2.writeNoException();
                parcel2.writeString(s);
                return true;
            case 3:
                List q = q();
                parcel2.writeNoException();
                parcel2.writeList(q);
                return true;
            case 4:
                String r = r();
                parcel2.writeNoException();
                parcel2.writeString(r);
                return true;
            case 5:
                zzbgg l = l();
                parcel2.writeNoException();
                zzaym.f(parcel2, l);
                return true;
            case 6:
                String x = x();
                parcel2.writeNoException();
                parcel2.writeString(x);
                return true;
            case 7:
                String o2 = o();
                parcel2.writeNoException();
                parcel2.writeString(o2);
                return true;
            case 8:
                double d = d();
                parcel2.writeNoException();
                parcel2.writeDouble(d);
                return true;
            case 9:
                String t = t();
                parcel2.writeNoException();
                parcel2.writeString(t);
                return true;
            case 10:
                String v = v();
                parcel2.writeNoException();
                parcel2.writeString(v);
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzea j = j();
                parcel2.writeNoException();
                zzaym.f(parcel2, j);
                return true;
            case 12:
                parcel2.writeNoException();
                zzaym.f(parcel2, null);
                return true;
            case 13:
                IObjectWrapper m = m();
                parcel2.writeNoException();
                zzaym.f(parcel2, m);
                return true;
            case 14:
                IObjectWrapper n = n();
                parcel2.writeNoException();
                zzaym.f(parcel2, n);
                return true;
            case 15:
                IObjectWrapper p = p();
                parcel2.writeNoException();
                zzaym.f(parcel2, p);
                return true;
            case 16:
                Bundle i3 = i();
                parcel2.writeNoException();
                zzaym.e(parcel2, i3);
                return true;
            case 17:
                boolean R = R();
                parcel2.writeNoException();
                int i4 = zzaym.b;
                parcel2.writeInt(R ? 1 : 0);
                return true;
            case 18:
                boolean L = L();
                parcel2.writeNoException();
                int i5 = zzaym.b;
                parcel2.writeInt(L ? 1 : 0);
                return true;
            case 19:
                y();
                parcel2.writeNoException();
                return true;
            case 20:
                IObjectWrapper g1 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                G4(g1);
                parcel2.writeNoException();
                return true;
            case 21:
                IObjectWrapper g12 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                IObjectWrapper g13 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                IObjectWrapper g14 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                g7(g12, g13, g14);
                parcel2.writeNoException();
                return true;
            case 22:
                IObjectWrapper g15 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                X5(g15);
                parcel2.writeNoException();
                return true;
            case 23:
                float e = e();
                parcel2.writeNoException();
                parcel2.writeFloat(e);
                return true;
            case 24:
                float h = h();
                parcel2.writeNoException();
                parcel2.writeFloat(h);
                return true;
            case 25:
                float g = g();
                parcel2.writeNoException();
                parcel2.writeFloat(g);
                return true;
            default:
                return false;
        }
    }
}
