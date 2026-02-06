package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzbvz extends zzayl implements zzbwa {
    public zzbvz() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                zzbwd zzbwdVar = null;
                zzbvy zzbvyVar = null;
                if (i != 3) {
                    if (i != 34) {
                        switch (i) {
                            case 5:
                                boolean s = s();
                                parcel2.writeNoException();
                                int i3 = zzaym.b;
                                parcel2.writeInt(s ? 1 : 0);
                                break;
                            case 6:
                                h();
                                parcel2.writeNoException();
                                break;
                            case 7:
                                j();
                                parcel2.writeNoException();
                                break;
                            case 8:
                                d();
                                parcel2.writeNoException();
                                break;
                            case 9:
                                IObjectWrapper g1 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                                zzaym.c(parcel);
                                i1(g1);
                                parcel2.writeNoException();
                                break;
                            case 10:
                                IObjectWrapper g12 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                                zzaym.c(parcel);
                                b0(g12);
                                parcel2.writeNoException();
                                break;
                            case 11:
                                IObjectWrapper g13 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                                zzaym.c(parcel);
                                R0(g13);
                                parcel2.writeNoException();
                                break;
                            case 12:
                                String f = f();
                                parcel2.writeNoException();
                                parcel2.writeString(f);
                                break;
                            case 13:
                                String readString = parcel.readString();
                                zzaym.c(parcel);
                                a3(readString);
                                parcel2.writeNoException();
                                break;
                            case 14:
                                com.google.android.gms.ads.internal.client.zzcb W7 = com.google.android.gms.ads.internal.client.zzca.W7(parcel.readStrongBinder());
                                zzaym.c(parcel);
                                S1(W7);
                                parcel2.writeNoException();
                                break;
                            case 15:
                                Bundle b = b();
                                parcel2.writeNoException();
                                zzaym.e(parcel2, b);
                                break;
                            case 16:
                                IBinder readStrongBinder = parcel.readStrongBinder();
                                if (readStrongBinder != null) {
                                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                                    if (queryLocalInterface instanceof zzbvy) {
                                        zzbvyVar = (zzbvy) queryLocalInterface;
                                    } else {
                                        zzbvyVar = new zzbvy(readStrongBinder);
                                    }
                                }
                                zzaym.c(parcel);
                                g5(zzbvyVar);
                                parcel2.writeNoException();
                                break;
                            case 17:
                                parcel.readString();
                                zzaym.c(parcel);
                                parcel2.writeNoException();
                                break;
                            case 18:
                                IObjectWrapper g14 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                                zzaym.c(parcel);
                                O(g14);
                                parcel2.writeNoException();
                                break;
                            case 19:
                                String readString2 = parcel.readString();
                                zzaym.c(parcel);
                                X2(readString2);
                                parcel2.writeNoException();
                                break;
                            case 20:
                                boolean v = v();
                                parcel2.writeNoException();
                                int i4 = zzaym.b;
                                parcel2.writeInt(v ? 1 : 0);
                                break;
                            case 21:
                                com.google.android.gms.ads.internal.client.zzdx c = c();
                                parcel2.writeNoException();
                                zzaym.f(parcel2, c);
                                break;
                            default:
                                return false;
                        }
                    } else {
                        boolean g = zzaym.g(parcel);
                        zzaym.c(parcel);
                        a0(g);
                        parcel2.writeNoException();
                    }
                } else {
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                        if (queryLocalInterface2 instanceof zzbwd) {
                            zzbwdVar = (zzbwd) queryLocalInterface2;
                        } else {
                            zzbwdVar = new zzbwb(readStrongBinder2);
                        }
                    }
                    zzaym.c(parcel);
                    e4(zzbwdVar);
                    parcel2.writeNoException();
                }
            } else {
                r();
                parcel2.writeNoException();
            }
        } else {
            zzaym.c(parcel);
            x6((zzbwe) zzaym.a(parcel, zzbwe.CREATOR));
            parcel2.writeNoException();
        }
        return true;
    }
}
