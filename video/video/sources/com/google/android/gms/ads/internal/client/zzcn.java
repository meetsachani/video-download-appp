package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzayl;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzbgk;
import com.google.android.gms.internal.ads.zzbgq;
import com.google.android.gms.internal.ads.zzbku;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzbky;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbpl;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzbtl;
import com.google.android.gms.internal.ads.zzbwa;
import com.google.android.gms.internal.ads.zzbwq;
import com.google.android.gms.internal.ads.zzbyv;

/* loaded from: classes2.dex */
public abstract class zzcn extends zzayl implements zzco {
    public zzcn() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                IObjectWrapper g1 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzr zzrVar = (zzr) zzaym.a(parcel, zzr.CREATOR);
                String readString = parcel.readString();
                zzbpl W7 = zzbpk.W7(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzaym.c(parcel);
                zzbx r5 = r5(g1, zzrVar, readString, W7, readInt);
                parcel2.writeNoException();
                zzaym.f(parcel2, r5);
                return true;
            case 2:
                IObjectWrapper g12 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzr zzrVar2 = (zzr) zzaym.a(parcel, zzr.CREATOR);
                String readString2 = parcel.readString();
                zzbpl W72 = zzbpk.W7(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzaym.c(parcel);
                zzbx W4 = W4(g12, zzrVar2, readString2, W72, readInt2);
                parcel2.writeNoException();
                zzaym.f(parcel2, W4);
                return true;
            case 3:
                IObjectWrapper g13 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                zzbpl W73 = zzbpk.W7(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                zzaym.c(parcel);
                zzbt e2 = e2(g13, readString3, W73, readInt3);
                parcel2.writeNoException();
                zzaym.f(parcel2, e2);
                return true;
            case 4:
                IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                parcel2.writeNoException();
                zzaym.f(parcel2, null);
                return true;
            case 5:
                IObjectWrapper g14 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                IObjectWrapper g15 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                zzbgk T2 = T2(g14, g15);
                parcel2.writeNoException();
                zzaym.f(parcel2, T2);
                return true;
            case 6:
                IObjectWrapper g16 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzbpl W74 = zzbpk.W7(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                zzaym.c(parcel);
                zzbwa I1 = I1(g16, W74, readInt4);
                parcel2.writeNoException();
                zzaym.f(parcel2, I1);
                return true;
            case 7:
                IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                parcel2.writeNoException();
                zzaym.f(parcel2, null);
                return true;
            case 8:
                IObjectWrapper g17 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                zzbtl d0 = d0(g17);
                parcel2.writeNoException();
                zzaym.f(parcel2, d0);
                return true;
            case 9:
                IObjectWrapper g18 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                zzaym.c(parcel);
                zzcy L3 = L3(g18, readInt5);
                parcel2.writeNoException();
                zzaym.f(parcel2, L3);
                return true;
            case 10:
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                zzaym.c(parcel);
                zzbx m2 = m2(IObjectWrapper.Stub.g1(parcel.readStrongBinder()), (zzr) zzaym.a(parcel, zzr.CREATOR), readString4, readInt6);
                parcel2.writeNoException();
                zzaym.f(parcel2, m2);
                return true;
            case 11:
                IObjectWrapper g19 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                IObjectWrapper g110 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                IObjectWrapper g111 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                zzbgq Q6 = Q6(g19, g110, g111);
                parcel2.writeNoException();
                zzaym.f(parcel2, Q6);
                return true;
            case 12:
                IObjectWrapper g112 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                zzbpl W75 = zzbpk.W7(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                zzaym.c(parcel);
                zzbwq s3 = s3(g112, readString5, W75, readInt7);
                parcel2.writeNoException();
                zzaym.f(parcel2, s3);
                return true;
            case 13:
                IObjectWrapper g113 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzr zzrVar3 = (zzr) zzaym.a(parcel, zzr.CREATOR);
                String readString6 = parcel.readString();
                zzbpl W76 = zzbpk.W7(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                zzaym.c(parcel);
                zzbx T5 = T5(g113, zzrVar3, readString6, W76, readInt8);
                parcel2.writeNoException();
                zzaym.f(parcel2, T5);
                return true;
            case 14:
                IObjectWrapper g114 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzbpl W77 = zzbpk.W7(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                zzaym.c(parcel);
                zzbyv r7 = r7(g114, W77, readInt9);
                parcel2.writeNoException();
                zzaym.f(parcel2, r7);
                return true;
            case 15:
                IObjectWrapper g115 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzbpl W78 = zzbpk.W7(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                zzaym.c(parcel);
                zzbte E2 = E2(g115, W78, readInt10);
                parcel2.writeNoException();
                zzaym.f(parcel2, E2);
                return true;
            case 16:
                IObjectWrapper g116 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzbpl W79 = zzbpk.W7(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                zzbkv W710 = zzbku.W7(parcel.readStrongBinder());
                zzaym.c(parcel);
                zzbky N3 = N3(g116, W79, readInt11, W710);
                parcel2.writeNoException();
                zzaym.f(parcel2, N3);
                return true;
            case 17:
                IObjectWrapper g117 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzbpl W711 = zzbpk.W7(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                zzaym.c(parcel);
                zzdt y3 = y3(g117, W711, readInt12);
                parcel2.writeNoException();
                zzaym.f(parcel2, y3);
                return true;
            case 18:
                IObjectWrapper g118 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzbpl W712 = zzbpk.W7(parcel.readStrongBinder());
                int readInt13 = parcel.readInt();
                zzaym.c(parcel);
                zzch q4 = q4(g118, W712, readInt13);
                parcel2.writeNoException();
                zzaym.f(parcel2, q4);
                return true;
            default:
                return false;
        }
    }
}
