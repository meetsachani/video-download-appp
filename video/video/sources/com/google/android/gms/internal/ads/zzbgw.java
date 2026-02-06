package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzbgw extends zzayl implements zzbgx {
    public zzbgw() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                IObjectWrapper g = g();
                parcel2.writeNoException();
                zzaym.f(parcel2, g);
                return true;
            case 3:
                String k = k();
                parcel2.writeNoException();
                parcel2.writeString(k);
                return true;
            case 4:
                List m = m();
                parcel2.writeNoException();
                parcel2.writeList(m);
                return true;
            case 5:
                String i3 = i();
                parcel2.writeNoException();
                parcel2.writeString(i3);
                return true;
            case 6:
                zzbgg d = d();
                parcel2.writeNoException();
                zzaym.f(parcel2, d);
                return true;
            case 7:
                String j = j();
                parcel2.writeNoException();
                parcel2.writeString(j);
                return true;
            case 8:
                String h = h();
                parcel2.writeNoException();
                parcel2.writeString(h);
                return true;
            case 9:
                Bundle b = b();
                parcel2.writeNoException();
                zzaym.e(parcel2, b);
                return true;
            case 10:
                n();
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzea c = c();
                parcel2.writeNoException();
                zzaym.f(parcel2, c);
                return true;
            case 12:
                zzaym.c(parcel);
                B0((Bundle) zzaym.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                zzaym.c(parcel);
                boolean Z = Z((Bundle) zzaym.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(Z ? 1 : 0);
                return true;
            case 14:
                zzaym.c(parcel);
                x0((Bundle) zzaym.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                zzbfz f = f();
                parcel2.writeNoException();
                zzaym.f(parcel2, f);
                return true;
            case 16:
                IObjectWrapper e = e();
                parcel2.writeNoException();
                zzaym.f(parcel2, e);
                return true;
            case 17:
                String l = l();
                parcel2.writeNoException();
                parcel2.writeString(l);
                return true;
            default:
                return false;
        }
    }
}
