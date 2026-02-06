package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzayl;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzbap;
import com.google.android.gms.internal.ads.zzbaq;
import com.google.android.gms.internal.ads.zzbdp;
import com.google.android.gms.internal.ads.zzbdq;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbtu;
import com.google.android.gms.internal.ads.zzbtw;
import com.google.android.gms.internal.ads.zzbtx;
import com.google.android.gms.internal.ads.zzbwc;
import com.google.android.gms.internal.ads.zzbwd;

/* loaded from: classes2.dex */
public abstract class zzbw extends zzayl implements zzbx {
    public zzbw() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzbx W7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        if (queryLocalInterface instanceof zzbx) {
            return (zzbx) queryLocalInterface;
        }
        return new zzbv(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbk zzbkVar = null;
        zzcs zzcsVar = null;
        zzbn zzbnVar = null;
        zzdq zzdqVar = null;
        zzcb zzcbVar = null;
        zzcp zzcpVar = null;
        zzbh zzbhVar = null;
        zzcl zzclVar = null;
        switch (i) {
            case 1:
                IObjectWrapper n = n();
                parcel2.writeNoException();
                zzaym.f(parcel2, n);
                return true;
            case 2:
                y();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean c0 = c0();
                parcel2.writeNoException();
                int i3 = zzaym.b;
                parcel2.writeInt(c0 ? 1 : 0);
                return true;
            case 4:
                zzaym.c(parcel);
                boolean C3 = C3((zzm) zzaym.a(parcel, zzm.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(C3 ? 1 : 0);
                return true;
            case 5:
                C();
                parcel2.writeNoException();
                return true;
            case 6:
                R();
                parcel2.writeNoException();
                return true;
            case 7:
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
                n6(zzbkVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    if (queryLocalInterface2 instanceof zzcl) {
                        zzclVar = (zzcl) queryLocalInterface2;
                    } else {
                        zzclVar = new zzcj(readStrongBinder2);
                    }
                }
                zzaym.c(parcel);
                P4(zzclVar);
                parcel2.writeNoException();
                return true;
            case 9:
                V();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                L();
                parcel2.writeNoException();
                return true;
            case 12:
                zzr g = g();
                parcel2.writeNoException();
                zzaym.e(parcel2, g);
                return true;
            case 13:
                zzaym.c(parcel);
                z2((zzr) zzaym.a(parcel, zzr.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                zzbtu W7 = zzbtt.W7(parcel.readStrongBinder());
                zzaym.c(parcel);
                c7(W7);
                parcel2.writeNoException();
                return true;
            case 15:
                zzbtx W72 = zzbtw.W7(parcel.readStrongBinder());
                String readString = parcel.readString();
                zzaym.c(parcel);
                G3(W72, readString);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String s = s();
                parcel2.writeNoException();
                parcel2.writeString(s);
                return true;
            case 19:
                zzbdq W73 = zzbdp.W7(parcel.readStrongBinder());
                zzaym.c(parcel);
                C1(W73);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    if (queryLocalInterface3 instanceof zzbh) {
                        zzbhVar = (zzbh) queryLocalInterface3;
                    } else {
                        zzbhVar = new zzbf(readStrongBinder3);
                    }
                }
                zzaym.c(parcel);
                y7(zzbhVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if (queryLocalInterface4 instanceof zzcp) {
                        zzcpVar = (zzcp) queryLocalInterface4;
                    } else {
                        zzcpVar = new zzcp(readStrongBinder4);
                    }
                }
                zzaym.c(parcel);
                o6(zzcpVar);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean g2 = zzaym.g(parcel);
                zzaym.c(parcel);
                R7(g2);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean z0 = z0();
                parcel2.writeNoException();
                int i4 = zzaym.b;
                parcel2.writeInt(z0 ? 1 : 0);
                return true;
            case 24:
                zzbwd W74 = zzbwc.W7(parcel.readStrongBinder());
                zzaym.c(parcel);
                J1(W74);
                parcel2.writeNoException();
                return true;
            case 25:
                String readString2 = parcel.readString();
                zzaym.c(parcel);
                R5(readString2);
                parcel2.writeNoException();
                return true;
            case 26:
                zzea l = l();
                parcel2.writeNoException();
                zzaym.f(parcel2, l);
                return true;
            case 29:
                zzaym.c(parcel);
                v6((zzfw) zzaym.a(parcel, zzfw.CREATOR));
                parcel2.writeNoException();
                return true;
            case 30:
                zzaym.c(parcel);
                L2((zzee) zzaym.a(parcel, zzee.CREATOR));
                parcel2.writeNoException();
                return true;
            case 31:
                String x = x();
                parcel2.writeNoException();
                parcel2.writeString(x);
                return true;
            case 32:
                zzcl j = j();
                parcel2.writeNoException();
                zzaym.f(parcel2, j);
                return true;
            case 33:
                zzbk i5 = i();
                parcel2.writeNoException();
                zzaym.f(parcel2, i5);
                return true;
            case 34:
                boolean g3 = zzaym.g(parcel);
                zzaym.c(parcel);
                i7(g3);
                parcel2.writeNoException();
                return true;
            case 35:
                String v = v();
                parcel2.writeNoException();
                parcel2.writeString(v);
                return true;
            case 36:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    if (queryLocalInterface5 instanceof zzcb) {
                        zzcbVar = (zzcb) queryLocalInterface5;
                    } else {
                        zzcbVar = new zzbz(readStrongBinder5);
                    }
                }
                zzaym.c(parcel);
                M3(zzcbVar);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle f = f();
                parcel2.writeNoException();
                zzaym.e(parcel2, f);
                return true;
            case 38:
                String readString3 = parcel.readString();
                zzaym.c(parcel);
                D4(readString3);
                parcel2.writeNoException();
                return true;
            case 39:
                zzaym.c(parcel);
                A5((zzx) zzaym.a(parcel, zzx.CREATOR));
                parcel2.writeNoException();
                return true;
            case 40:
                zzbaq W75 = zzbap.W7(parcel.readStrongBinder());
                zzaym.c(parcel);
                k7(W75);
                parcel2.writeNoException();
                return true;
            case 41:
                zzdx k = k();
                parcel2.writeNoException();
                zzaym.f(parcel2, k);
                return true;
            case 42:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    if (queryLocalInterface6 instanceof zzdq) {
                        zzdqVar = (zzdq) queryLocalInterface6;
                    } else {
                        zzdqVar = new zzdo(readStrongBinder6);
                    }
                }
                zzaym.c(parcel);
                m7(zzdqVar);
                parcel2.writeNoException();
                return true;
            case 43:
                zzm zzmVar = (zzm) zzaym.a(parcel, zzm.CREATOR);
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    if (queryLocalInterface7 instanceof zzbn) {
                        zzbnVar = (zzbn) queryLocalInterface7;
                    } else {
                        zzbnVar = new zzbl(readStrongBinder7);
                    }
                }
                zzaym.c(parcel);
                b2(zzmVar, zzbnVar);
                parcel2.writeNoException();
                return true;
            case 44:
                IObjectWrapper g1 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                Q5(g1);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    if (queryLocalInterface8 instanceof zzcs) {
                        zzcsVar = (zzcs) queryLocalInterface8;
                    } else {
                        zzcsVar = new zzcq(readStrongBinder8);
                    }
                }
                zzaym.c(parcel);
                T1(zzcsVar);
                parcel2.writeNoException();
                return true;
            case 46:
                boolean l0 = l0();
                parcel2.writeNoException();
                int i6 = zzaym.b;
                parcel2.writeInt(l0 ? 1 : 0);
                return true;
        }
    }
}
