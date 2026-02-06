package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzayl;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzbfv;
import com.google.android.gms.internal.ads.zzbhd;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbhg;
import com.google.android.gms.internal.ads.zzbhh;
import com.google.android.gms.internal.ads.zzbhj;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzbhm;
import com.google.android.gms.internal.ads.zzbhn;
import com.google.android.gms.internal.ads.zzbhq;
import com.google.android.gms.internal.ads.zzbht;
import com.google.android.gms.internal.ads.zzbhu;
import com.google.android.gms.internal.ads.zzbmg;
import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzbmp;

/* loaded from: classes2.dex */
public abstract class zzbs extends zzayl implements zzbt {
    public zzbs() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbk zzbkVar = null;
        zzcp zzcpVar = null;
        switch (i) {
            case 1:
                zzbq d = d();
                parcel2.writeNoException();
                zzaym.f(parcel2, d);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    if (queryLocalInterface instanceof zzbk) {
                        zzbkVar = (zzbk) queryLocalInterface;
                    } else {
                        zzbkVar = new zzbi(readStrongBinder);
                    }
                }
                zzaym.c(parcel);
                K3(zzbkVar);
                parcel2.writeNoException();
                return true;
            case 3:
                zzbhe W7 = zzbhd.W7(parcel.readStrongBinder());
                zzaym.c(parcel);
                B2(W7);
                parcel2.writeNoException();
                return true;
            case 4:
                zzbhh W72 = zzbhg.W7(parcel.readStrongBinder());
                zzaym.c(parcel);
                p7(W72);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                zzbhn W73 = zzbhm.W7(parcel.readStrongBinder());
                zzbhk W74 = zzbhj.W7(parcel.readStrongBinder());
                zzaym.c(parcel);
                Y3(readString, W73, W74);
                parcel2.writeNoException();
                return true;
            case 6:
                zzaym.c(parcel);
                M2((zzbfv) zzaym.a(parcel, zzbfv.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if (queryLocalInterface2 instanceof zzcp) {
                        zzcpVar = (zzcp) queryLocalInterface2;
                    } else {
                        zzcpVar = new zzcp(readStrongBinder2);
                    }
                }
                zzaym.c(parcel);
                E7(zzcpVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zzaym.c(parcel);
                n7(zzbhq.W7(parcel.readStrongBinder()), (zzr) zzaym.a(parcel, zzr.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                zzaym.c(parcel);
                L7((PublisherAdViewOptions) zzaym.a(parcel, PublisherAdViewOptions.CREATOR));
                parcel2.writeNoException();
                return true;
            case 10:
                zzbhu W75 = zzbht.W7(parcel.readStrongBinder());
                zzaym.c(parcel);
                q7(W75);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzaym.c(parcel);
                v4((zzbmg) zzaym.a(parcel, zzbmg.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                zzbmp W76 = zzbmo.W7(parcel.readStrongBinder());
                zzaym.c(parcel);
                W2(W76);
                parcel2.writeNoException();
                return true;
            case 15:
                zzaym.c(parcel);
                N7((AdManagerAdViewOptions) zzaym.a(parcel, AdManagerAdViewOptions.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
