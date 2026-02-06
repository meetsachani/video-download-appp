package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzbhz extends zzayl implements zzbia {
    public zzbhz() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbhx zzbhvVar;
        switch (i) {
            case 2:
                String r = r();
                parcel2.writeNoException();
                parcel2.writeString(r);
                return true;
            case 3:
                List t = t();
                parcel2.writeNoException();
                parcel2.writeList(t);
                return true;
            case 4:
                String p = p();
                parcel2.writeNoException();
                parcel2.writeString(p);
                return true;
            case 5:
                zzbgg k = k();
                parcel2.writeNoException();
                zzaym.f(parcel2, k);
                return true;
            case 6:
                String o2 = o();
                parcel2.writeNoException();
                parcel2.writeString(o2);
                return true;
            case 7:
                String n = n();
                parcel2.writeNoException();
                parcel2.writeString(n);
                return true;
            case 8:
                double d = d();
                parcel2.writeNoException();
                parcel2.writeDouble(d);
                return true;
            case 9:
                String v = v();
                parcel2.writeNoException();
                parcel2.writeString(v);
                return true;
            case 10:
                String s = s();
                parcel2.writeNoException();
                parcel2.writeString(s);
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzea h = h();
                parcel2.writeNoException();
                zzaym.f(parcel2, h);
                return true;
            case 12:
                String x = x();
                parcel2.writeNoException();
                parcel2.writeString(x);
                return true;
            case 13:
                y();
                parcel2.writeNoException();
                return true;
            case 14:
                zzbfz i3 = i();
                parcel2.writeNoException();
                zzaym.f(parcel2, i3);
                return true;
            case 15:
                zzaym.c(parcel);
                w4((Bundle) zzaym.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                zzaym.c(parcel);
                boolean o3 = o3((Bundle) zzaym.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(o3 ? 1 : 0);
                return true;
            case 17:
                zzaym.c(parcel);
                z5((Bundle) zzaym.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 18:
                IObjectWrapper m = m();
                parcel2.writeNoException();
                zzaym.f(parcel2, m);
                return true;
            case 19:
                IObjectWrapper l = l();
                parcel2.writeNoException();
                zzaym.f(parcel2, l);
                return true;
            case 20:
                Bundle e = e();
                parcel2.writeNoException();
                zzaym.e(parcel2, e);
                return true;
            case 21:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbhvVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    if (queryLocalInterface instanceof zzbhx) {
                        zzbhvVar = (zzbhx) queryLocalInterface;
                    } else {
                        zzbhvVar = new zzbhv(readStrongBinder);
                    }
                }
                zzaym.c(parcel);
                Z6(zzbhvVar);
                parcel2.writeNoException();
                return true;
            case 22:
                B();
                parcel2.writeNoException();
                return true;
            case 23:
                List q = q();
                parcel2.writeNoException();
                parcel2.writeList(q);
                return true;
            case 24:
                boolean D = D();
                parcel2.writeNoException();
                int i4 = zzaym.b;
                parcel2.writeInt(D ? 1 : 0);
                return true;
            case 25:
                com.google.android.gms.ads.internal.client.zzdg W7 = com.google.android.gms.ads.internal.client.zzdf.W7(parcel.readStrongBinder());
                zzaym.c(parcel);
                J2(W7);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.ads.internal.client.zzdc W72 = com.google.android.gms.ads.internal.client.zzdb.W7(parcel.readStrongBinder());
                zzaym.c(parcel);
                y4(W72);
                parcel2.writeNoException();
                return true;
            case 27:
                F();
                parcel2.writeNoException();
                return true;
            case 28:
                L();
                parcel2.writeNoException();
                return true;
            case 29:
                zzbgd j = j();
                parcel2.writeNoException();
                zzaym.f(parcel2, j);
                return true;
            case 30:
                boolean P = P();
                parcel2.writeNoException();
                int i5 = zzaym.b;
                parcel2.writeInt(P ? 1 : 0);
                return true;
            case 31:
                com.google.android.gms.ads.internal.client.zzdx g = g();
                parcel2.writeNoException();
                zzaym.f(parcel2, g);
                return true;
            case 32:
                com.google.android.gms.ads.internal.client.zzdq W73 = com.google.android.gms.ads.internal.client.zzdp.W7(parcel.readStrongBinder());
                zzaym.c(parcel);
                p5(W73);
                parcel2.writeNoException();
                return true;
            case 33:
                zzaym.c(parcel);
                f6((Bundle) zzaym.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
