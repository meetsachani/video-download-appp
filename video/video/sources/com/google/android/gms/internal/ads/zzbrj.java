package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzbrj extends zzayl implements zzbrk {
    public zzbrj() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbrk W7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        if (queryLocalInterface instanceof zzbrk) {
            return (zzbrk) queryLocalInterface;
        }
        return new zzbri(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbrn zzbrnVar = null;
        zzbqv zzbqvVar = null;
        zzbre zzbreVar = null;
        zzbqy zzbqwVar = null;
        zzbrh zzbrhVar = null;
        zzbre zzbreVar2 = null;
        zzbrh zzbrhVar2 = null;
        zzbrb zzbrbVar = null;
        zzbqy zzbqwVar2 = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 5) {
                        if (i != 10) {
                            if (i != 11) {
                                switch (i) {
                                    case 13:
                                        String readString = parcel.readString();
                                        String readString2 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzaym.a(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                                        IObjectWrapper g1 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                                        IBinder readStrongBinder = parcel.readStrongBinder();
                                        if (readStrongBinder != null) {
                                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                            if (queryLocalInterface instanceof zzbqy) {
                                                zzbqwVar2 = (zzbqy) queryLocalInterface;
                                            } else {
                                                zzbqwVar2 = new zzbqw(readStrongBinder);
                                            }
                                        }
                                        zzbqy zzbqyVar = zzbqwVar2;
                                        zzaym.c(parcel);
                                        K6(readString, readString2, zzmVar, g1, zzbqyVar, zzbpq.W7(parcel.readStrongBinder()), (com.google.android.gms.ads.internal.client.zzr) zzaym.a(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR));
                                        parcel2.writeNoException();
                                        break;
                                    case 14:
                                        String readString3 = parcel.readString();
                                        String readString4 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzaym.a(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                                        IObjectWrapper g12 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                                        if (readStrongBinder2 != null) {
                                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                                            if (queryLocalInterface2 instanceof zzbrb) {
                                                zzbrbVar = (zzbrb) queryLocalInterface2;
                                            } else {
                                                zzbrbVar = new zzbqz(readStrongBinder2);
                                            }
                                        }
                                        zzbpr W7 = zzbpq.W7(parcel.readStrongBinder());
                                        zzaym.c(parcel);
                                        q2(readString3, readString4, zzmVar2, g12, zzbrbVar, W7);
                                        parcel2.writeNoException();
                                        break;
                                    case 15:
                                        IObjectWrapper g13 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                                        zzaym.c(parcel);
                                        boolean F0 = F0(g13);
                                        parcel2.writeNoException();
                                        parcel2.writeInt(F0 ? 1 : 0);
                                        break;
                                    case 16:
                                        String readString5 = parcel.readString();
                                        String readString6 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzm zzmVar3 = (com.google.android.gms.ads.internal.client.zzm) zzaym.a(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                                        IObjectWrapper g14 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                                        IBinder readStrongBinder3 = parcel.readStrongBinder();
                                        if (readStrongBinder3 != null) {
                                            IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                            if (queryLocalInterface3 instanceof zzbrh) {
                                                zzbrhVar2 = (zzbrh) queryLocalInterface3;
                                            } else {
                                                zzbrhVar2 = new zzbrf(readStrongBinder3);
                                            }
                                        }
                                        zzbpr W72 = zzbpq.W7(parcel.readStrongBinder());
                                        zzaym.c(parcel);
                                        w6(readString5, readString6, zzmVar3, g14, zzbrhVar2, W72);
                                        parcel2.writeNoException();
                                        break;
                                    case 17:
                                        IObjectWrapper g15 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                                        zzaym.c(parcel);
                                        boolean m4 = m4(g15);
                                        parcel2.writeNoException();
                                        parcel2.writeInt(m4 ? 1 : 0);
                                        break;
                                    case 18:
                                        String readString7 = parcel.readString();
                                        String readString8 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzm zzmVar4 = (com.google.android.gms.ads.internal.client.zzm) zzaym.a(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                                        IObjectWrapper g16 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                                        IBinder readStrongBinder4 = parcel.readStrongBinder();
                                        if (readStrongBinder4 != null) {
                                            IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                            if (queryLocalInterface4 instanceof zzbre) {
                                                zzbreVar2 = (zzbre) queryLocalInterface4;
                                            } else {
                                                zzbreVar2 = new zzbrc(readStrongBinder4);
                                            }
                                        }
                                        zzbpr W73 = zzbpq.W7(parcel.readStrongBinder());
                                        zzaym.c(parcel);
                                        P5(readString7, readString8, zzmVar4, g16, zzbreVar2, W73);
                                        parcel2.writeNoException();
                                        break;
                                    case 19:
                                        String readString9 = parcel.readString();
                                        zzaym.c(parcel);
                                        M0(readString9);
                                        parcel2.writeNoException();
                                        break;
                                    case 20:
                                        String readString10 = parcel.readString();
                                        String readString11 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzm zzmVar5 = (com.google.android.gms.ads.internal.client.zzm) zzaym.a(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                                        IObjectWrapper g17 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                                        IBinder readStrongBinder5 = parcel.readStrongBinder();
                                        if (readStrongBinder5 != null) {
                                            IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                            if (queryLocalInterface5 instanceof zzbrh) {
                                                zzbrhVar = (zzbrh) queryLocalInterface5;
                                            } else {
                                                zzbrhVar = new zzbrf(readStrongBinder5);
                                            }
                                        }
                                        zzbpr W74 = zzbpq.W7(parcel.readStrongBinder());
                                        zzaym.c(parcel);
                                        N2(readString10, readString11, zzmVar5, g17, zzbrhVar, W74);
                                        parcel2.writeNoException();
                                        break;
                                    case 21:
                                        String readString12 = parcel.readString();
                                        String readString13 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzm zzmVar6 = (com.google.android.gms.ads.internal.client.zzm) zzaym.a(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                                        IObjectWrapper g18 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                                        IBinder readStrongBinder6 = parcel.readStrongBinder();
                                        if (readStrongBinder6 != null) {
                                            IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                            if (queryLocalInterface6 instanceof zzbqy) {
                                                zzbqwVar = (zzbqy) queryLocalInterface6;
                                            } else {
                                                zzbqwVar = new zzbqw(readStrongBinder6);
                                            }
                                        }
                                        zzbqy zzbqyVar2 = zzbqwVar;
                                        zzaym.c(parcel);
                                        H7(readString12, readString13, zzmVar6, g18, zzbqyVar2, zzbpq.W7(parcel.readStrongBinder()), (com.google.android.gms.ads.internal.client.zzr) zzaym.a(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR));
                                        parcel2.writeNoException();
                                        break;
                                    case 22:
                                        String readString14 = parcel.readString();
                                        String readString15 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzm zzmVar7 = (com.google.android.gms.ads.internal.client.zzm) zzaym.a(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                                        IObjectWrapper g19 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                                        IBinder readStrongBinder7 = parcel.readStrongBinder();
                                        if (readStrongBinder7 != null) {
                                            IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                            if (queryLocalInterface7 instanceof zzbre) {
                                                zzbreVar = (zzbre) queryLocalInterface7;
                                            } else {
                                                zzbreVar = new zzbrc(readStrongBinder7);
                                            }
                                        }
                                        zzaym.c(parcel);
                                        w2(readString14, readString15, zzmVar7, g19, zzbreVar, zzbpq.W7(parcel.readStrongBinder()), (zzbfv) zzaym.a(parcel, zzbfv.CREATOR));
                                        parcel2.writeNoException();
                                        break;
                                    case 23:
                                        String readString16 = parcel.readString();
                                        String readString17 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzm zzmVar8 = (com.google.android.gms.ads.internal.client.zzm) zzaym.a(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                                        IObjectWrapper g110 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                                        IBinder readStrongBinder8 = parcel.readStrongBinder();
                                        if (readStrongBinder8 != null) {
                                            IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                                            if (queryLocalInterface8 instanceof zzbqv) {
                                                zzbqvVar = (zzbqv) queryLocalInterface8;
                                            } else {
                                                zzbqvVar = new zzbqt(readStrongBinder8);
                                            }
                                        }
                                        zzbpr W75 = zzbpq.W7(parcel.readStrongBinder());
                                        zzaym.c(parcel);
                                        t4(readString16, readString17, zzmVar8, g110, zzbqvVar, W75);
                                        parcel2.writeNoException();
                                        break;
                                    case 24:
                                        IObjectWrapper g111 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                                        zzaym.c(parcel);
                                        boolean O = O(g111);
                                        parcel2.writeNoException();
                                        parcel2.writeInt(O ? 1 : 0);
                                        break;
                                    default:
                                        return false;
                                }
                            } else {
                                parcel.createStringArray();
                                Bundle[] bundleArr = (Bundle[]) parcel.createTypedArray(Bundle.CREATOR);
                                zzaym.c(parcel);
                                parcel2.writeNoException();
                            }
                        } else {
                            IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                            zzaym.c(parcel);
                            parcel2.writeNoException();
                        }
                    } else {
                        com.google.android.gms.ads.internal.client.zzea d = d();
                        parcel2.writeNoException();
                        zzaym.f(parcel2, d);
                    }
                } else {
                    zzbrz g = g();
                    parcel2.writeNoException();
                    zzaym.e(parcel2, g);
                }
            } else {
                zzbrz e = e();
                parcel2.writeNoException();
                zzaym.e(parcel2, e);
            }
        } else {
            IObjectWrapper g112 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
            String readString18 = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) zzaym.a(parcel, creator);
            Bundle bundle2 = (Bundle) zzaym.a(parcel, creator);
            com.google.android.gms.ads.internal.client.zzr zzrVar = (com.google.android.gms.ads.internal.client.zzr) zzaym.a(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
            IBinder readStrongBinder9 = parcel.readStrongBinder();
            if (readStrongBinder9 != null) {
                IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                if (queryLocalInterface9 instanceof zzbrn) {
                    zzbrnVar = (zzbrn) queryLocalInterface9;
                } else {
                    zzbrnVar = new zzbrl(readStrongBinder9);
                }
            }
            zzaym.c(parcel);
            x5(g112, readString18, bundle, bundle2, zzrVar, zzbrnVar);
            parcel2.writeNoException();
        }
        return true;
    }
}
