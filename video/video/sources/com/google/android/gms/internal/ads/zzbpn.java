package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class zzbpn extends zzayl implements zzbpo {
    public zzbpn() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbpr zzbppVar;
        zzbpr zzbppVar2;
        zzbpr zzbppVar3;
        zzbpr zzbprVar;
        zzbpr zzbppVar4;
        zzbpr zzbprVar2;
        zzbpr zzbppVar5;
        zzbpr zzbppVar6;
        zzbpr zzbppVar7;
        zzbpr zzbppVar8;
        zzbpr zzbprVar3 = null;
        switch (i) {
            case 1:
                IObjectWrapper g1 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar = (com.google.android.gms.ads.internal.client.zzr) zzaym.a(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzaym.a(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbppVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface instanceof zzbpr) {
                        zzbppVar = (zzbpr) queryLocalInterface;
                    } else {
                        zzbppVar = new zzbpp(readStrongBinder);
                    }
                }
                zzaym.c(parcel);
                s6(g1, zzrVar, zzmVar, readString, zzbppVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper n = n();
                parcel2.writeNoException();
                zzaym.f(parcel2, n);
                return true;
            case 3:
                IObjectWrapper g12 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzaym.a(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    zzbppVar2 = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface2 instanceof zzbpr) {
                        zzbppVar2 = (zzbpr) queryLocalInterface2;
                    } else {
                        zzbppVar2 = new zzbpp(readStrongBinder2);
                    }
                }
                zzaym.c(parcel);
                t6(g12, zzmVar2, readString2, zzbppVar2);
                parcel2.writeNoException();
                return true;
            case 4:
                D();
                parcel2.writeNoException();
                return true;
            case 5:
                p();
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper g13 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar2 = (com.google.android.gms.ads.internal.client.zzr) zzaym.a(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar3 = (com.google.android.gms.ads.internal.client.zzm) zzaym.a(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 == null) {
                    zzbprVar = null;
                } else {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface3 instanceof zzbpr) {
                        zzbppVar3 = (zzbpr) queryLocalInterface3;
                    } else {
                        zzbppVar3 = new zzbpp(readStrongBinder3);
                    }
                    zzbprVar = zzbppVar3;
                }
                zzaym.c(parcel);
                c2(g13, zzrVar2, zzmVar3, readString3, readString4, zzbprVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper g14 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar4 = (com.google.android.gms.ads.internal.client.zzm) zzaym.a(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 == null) {
                    zzbprVar2 = null;
                } else {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface4 instanceof zzbpr) {
                        zzbppVar4 = (zzbpr) queryLocalInterface4;
                    } else {
                        zzbppVar4 = new zzbpp(readStrongBinder4);
                    }
                    zzbprVar2 = zzbppVar4;
                }
                zzaym.c(parcel);
                U7(g14, zzmVar4, readString5, readString6, zzbprVar2);
                parcel2.writeNoException();
                return true;
            case 8:
                h0();
                parcel2.writeNoException();
                return true;
            case 9:
                U();
                parcel2.writeNoException();
                return true;
            case 10:
                String readString7 = parcel.readString();
                zzbwi W7 = zzbwh.W7(parcel.readStrongBinder());
                String readString8 = parcel.readString();
                zzaym.c(parcel);
                j2(IObjectWrapper.Stub.g1(parcel.readStrongBinder()), (com.google.android.gms.ads.internal.client.zzm) zzaym.a(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR), readString7, W7, readString8);
                parcel2.writeNoException();
                return true;
            case 11:
                String readString9 = parcel.readString();
                zzaym.c(parcel);
                w3((com.google.android.gms.ads.internal.client.zzm) zzaym.a(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR), readString9);
                parcel2.writeNoException();
                return true;
            case 12:
                J();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean M = M();
                parcel2.writeNoException();
                int i3 = zzaym.b;
                parcel2.writeInt(M ? 1 : 0);
                return true;
            case 14:
                IObjectWrapper g15 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar5 = (com.google.android.gms.ads.internal.client.zzm) zzaym.a(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 == null) {
                    zzbppVar5 = null;
                } else {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface5 instanceof zzbpr) {
                        zzbppVar5 = (zzbpr) queryLocalInterface5;
                    } else {
                        zzbppVar5 = new zzbpp(readStrongBinder5);
                    }
                }
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                zzaym.c(parcel);
                M4(g15, zzmVar5, readString10, readString11, zzbppVar5, (zzbfv) zzaym.a(parcel, zzbfv.CREATOR), createStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                zzaym.f(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                zzaym.f(parcel2, null);
                return true;
            case 17:
                Bundle d = d();
                parcel2.writeNoException();
                zzaym.e(parcel2, d);
                return true;
            case 18:
                Bundle e = e();
                parcel2.writeNoException();
                zzaym.e(parcel2, e);
                return true;
            case 19:
                Bundle g = g();
                parcel2.writeNoException();
                zzaym.e(parcel2, g);
                return true;
            case 20:
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                zzaym.c(parcel);
                d2((com.google.android.gms.ads.internal.client.zzm) zzaym.a(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR), readString12, readString13);
                parcel2.writeNoException();
                return true;
            case 21:
                IObjectWrapper g16 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                A4(g16);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                int i4 = zzaym.b;
                parcel2.writeInt(0);
                return true;
            case 23:
                IObjectWrapper g17 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzbwi W72 = zzbwh.W7(parcel.readStrongBinder());
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                zzaym.c(parcel);
                S3(g17, W72, createStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                zzbha i5 = i();
                parcel2.writeNoException();
                zzaym.f(parcel2, i5);
                return true;
            case 25:
                boolean g2 = zzaym.g(parcel);
                zzaym.c(parcel);
                I0(g2);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.ads.internal.client.zzea h = h();
                parcel2.writeNoException();
                zzaym.f(parcel2, h);
                return true;
            case 27:
                zzbqa k = k();
                parcel2.writeNoException();
                zzaym.f(parcel2, k);
                return true;
            case 28:
                IObjectWrapper g18 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar6 = (com.google.android.gms.ads.internal.client.zzm) zzaym.a(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString14 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 == null) {
                    zzbppVar6 = null;
                } else {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface6 instanceof zzbpr) {
                        zzbppVar6 = (zzbpr) queryLocalInterface6;
                    } else {
                        zzbppVar6 = new zzbpp(readStrongBinder6);
                    }
                }
                zzaym.c(parcel);
                B6(g18, zzmVar6, readString14, zzbppVar6);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                IObjectWrapper g19 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                o7(g19);
                parcel2.writeNoException();
                return true;
            case 31:
                IObjectWrapper g110 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzbly W73 = zzblx.W7(parcel.readStrongBinder());
                ArrayList createTypedArrayList = parcel.createTypedArrayList(zzbme.CREATOR);
                zzaym.c(parcel);
                k4(g110, W73, createTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                IObjectWrapper g111 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar7 = (com.google.android.gms.ads.internal.client.zzm) zzaym.a(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString15 = parcel.readString();
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 == null) {
                    zzbppVar7 = null;
                } else {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface7 instanceof zzbpr) {
                        zzbppVar7 = (zzbpr) queryLocalInterface7;
                    } else {
                        zzbppVar7 = new zzbpp(readStrongBinder7);
                    }
                }
                zzaym.c(parcel);
                I5(g111, zzmVar7, readString15, zzbppVar7);
                parcel2.writeNoException();
                return true;
            case 33:
                zzbrz l = l();
                parcel2.writeNoException();
                zzaym.e(parcel2, l);
                return true;
            case 34:
                zzbrz m = m();
                parcel2.writeNoException();
                zzaym.e(parcel2, m);
                return true;
            case 35:
                IObjectWrapper g112 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar3 = (com.google.android.gms.ads.internal.client.zzr) zzaym.a(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar8 = (com.google.android.gms.ads.internal.client.zzm) zzaym.a(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 == null) {
                    zzbppVar8 = null;
                } else {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface8 instanceof zzbpr) {
                        zzbppVar8 = (zzbpr) queryLocalInterface8;
                    } else {
                        zzbppVar8 = new zzbpp(readStrongBinder8);
                    }
                }
                zzaym.c(parcel);
                F1(g112, zzrVar3, zzmVar8, readString16, readString17, zzbppVar8);
                parcel2.writeNoException();
                return true;
            case 36:
                zzbpu j = j();
                parcel2.writeNoException();
                zzaym.f(parcel2, j);
                return true;
            case 37:
                IObjectWrapper g113 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                Q7(g113);
                parcel2.writeNoException();
                return true;
            case 38:
                IObjectWrapper g114 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar9 = (com.google.android.gms.ads.internal.client.zzm) zzaym.a(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString18 = parcel.readString();
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface9 instanceof zzbpr) {
                        zzbprVar3 = (zzbpr) queryLocalInterface9;
                    } else {
                        zzbprVar3 = new zzbpp(readStrongBinder9);
                    }
                }
                zzaym.c(parcel);
                M6(g114, zzmVar9, readString18, zzbprVar3);
                parcel2.writeNoException();
                return true;
            case 39:
                IObjectWrapper g115 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                J6(g115);
                parcel2.writeNoException();
                return true;
        }
    }
}
