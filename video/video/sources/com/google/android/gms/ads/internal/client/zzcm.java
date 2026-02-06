package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzayk;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzbgj;
import com.google.android.gms.internal.ads.zzbgk;
import com.google.android.gms.internal.ads.zzbgp;
import com.google.android.gms.internal.ads.zzbgq;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzbkx;
import com.google.android.gms.internal.ads.zzbky;
import com.google.android.gms.internal.ads.zzbpl;
import com.google.android.gms.internal.ads.zzbtd;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzbtk;
import com.google.android.gms.internal.ads.zzbtl;
import com.google.android.gms.internal.ads.zzbwa;
import com.google.android.gms.internal.ads.zzbwp;
import com.google.android.gms.internal.ads.zzbwq;
import com.google.android.gms.internal.ads.zzbyu;
import com.google.android.gms.internal.ads.zzbyv;

/* loaded from: classes2.dex */
public final class zzcm extends zzayk implements zzco {
    public zzcm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbte E2(IObjectWrapper iObjectWrapper, zzbpl zzbplVar, int i) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        zzaym.f(O0, zzbplVar);
        O0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel g1 = g1(15, O0);
        zzbte W7 = zzbtd.W7(g1.readStrongBinder());
        g1.recycle();
        return W7;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbwa I1(IObjectWrapper iObjectWrapper, zzbpl zzbplVar, int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcy L3(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzcy zzcwVar;
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        O0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel g1 = g1(9, O0);
        IBinder readStrongBinder = g1.readStrongBinder();
        if (readStrongBinder == null) {
            zzcwVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (queryLocalInterface instanceof zzcy) {
                zzcwVar = (zzcy) queryLocalInterface;
            } else {
                zzcwVar = new zzcw(readStrongBinder);
            }
        }
        g1.recycle();
        return zzcwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbky N3(IObjectWrapper iObjectWrapper, zzbpl zzbplVar, int i, zzbkv zzbkvVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        zzaym.f(O0, zzbplVar);
        O0.writeInt(ModuleDescriptor.MODULE_VERSION);
        zzaym.f(O0, zzbkvVar);
        Parcel g1 = g1(16, O0);
        zzbky W7 = zzbkx.W7(g1.readStrongBinder());
        g1.recycle();
        return W7;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbgq Q6(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        zzaym.f(O0, iObjectWrapper2);
        zzaym.f(O0, iObjectWrapper3);
        Parcel g1 = g1(11, O0);
        zzbgq W7 = zzbgp.W7(g1.readStrongBinder());
        g1.recycle();
        return W7;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbgk T2(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        zzaym.f(O0, iObjectWrapper2);
        Parcel g1 = g1(5, O0);
        zzbgk W7 = zzbgj.W7(g1.readStrongBinder());
        g1.recycle();
        return W7;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbx T5(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, zzbpl zzbplVar, int i) throws RemoteException {
        zzbx zzbvVar;
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        zzaym.d(O0, zzrVar);
        O0.writeString(str);
        zzaym.f(O0, zzbplVar);
        O0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel g1 = g1(13, O0);
        IBinder readStrongBinder = g1.readStrongBinder();
        if (readStrongBinder == null) {
            zzbvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzbx) {
                zzbvVar = (zzbx) queryLocalInterface;
            } else {
                zzbvVar = new zzbv(readStrongBinder);
            }
        }
        g1.recycle();
        return zzbvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbx W4(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, zzbpl zzbplVar, int i) throws RemoteException {
        zzbx zzbvVar;
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        zzaym.d(O0, zzrVar);
        O0.writeString(str);
        zzaym.f(O0, zzbplVar);
        O0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel g1 = g1(2, O0);
        IBinder readStrongBinder = g1.readStrongBinder();
        if (readStrongBinder == null) {
            zzbvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzbx) {
                zzbvVar = (zzbx) queryLocalInterface;
            } else {
                zzbvVar = new zzbv(readStrongBinder);
            }
        }
        g1.recycle();
        return zzbvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbtl d0(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        Parcel g1 = g1(8, O0);
        zzbtl W7 = zzbtk.W7(g1.readStrongBinder());
        g1.recycle();
        return W7;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbt e2(IObjectWrapper iObjectWrapper, String str, zzbpl zzbplVar, int i) throws RemoteException {
        zzbt zzbrVar;
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        O0.writeString(str);
        zzaym.f(O0, zzbplVar);
        O0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel g1 = g1(3, O0);
        IBinder readStrongBinder = g1.readStrongBinder();
        if (readStrongBinder == null) {
            zzbrVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (queryLocalInterface instanceof zzbt) {
                zzbrVar = (zzbt) queryLocalInterface;
            } else {
                zzbrVar = new zzbr(readStrongBinder);
            }
        }
        g1.recycle();
        return zzbrVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbx m2(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, int i) throws RemoteException {
        zzbx zzbvVar;
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        zzaym.d(O0, zzrVar);
        O0.writeString(str);
        O0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel g1 = g1(10, O0);
        IBinder readStrongBinder = g1.readStrongBinder();
        if (readStrongBinder == null) {
            zzbvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzbx) {
                zzbvVar = (zzbx) queryLocalInterface;
            } else {
                zzbvVar = new zzbv(readStrongBinder);
            }
        }
        g1.recycle();
        return zzbvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzch q4(IObjectWrapper iObjectWrapper, zzbpl zzbplVar, int i) throws RemoteException {
        zzch zzcfVar;
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        zzaym.f(O0, zzbplVar);
        O0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel g1 = g1(18, O0);
        IBinder readStrongBinder = g1.readStrongBinder();
        if (readStrongBinder == null) {
            zzcfVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            if (queryLocalInterface instanceof zzch) {
                zzcfVar = (zzch) queryLocalInterface;
            } else {
                zzcfVar = new zzcf(readStrongBinder);
            }
        }
        g1.recycle();
        return zzcfVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbx r5(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, zzbpl zzbplVar, int i) throws RemoteException {
        zzbx zzbvVar;
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        zzaym.d(O0, zzrVar);
        O0.writeString(str);
        zzaym.f(O0, zzbplVar);
        O0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel g1 = g1(1, O0);
        IBinder readStrongBinder = g1.readStrongBinder();
        if (readStrongBinder == null) {
            zzbvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzbx) {
                zzbvVar = (zzbx) queryLocalInterface;
            } else {
                zzbvVar = new zzbv(readStrongBinder);
            }
        }
        g1.recycle();
        return zzbvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbyv r7(IObjectWrapper iObjectWrapper, zzbpl zzbplVar, int i) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        zzaym.f(O0, zzbplVar);
        O0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel g1 = g1(14, O0);
        zzbyv W7 = zzbyu.W7(g1.readStrongBinder());
        g1.recycle();
        return W7;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbwq s3(IObjectWrapper iObjectWrapper, String str, zzbpl zzbplVar, int i) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        O0.writeString(str);
        zzaym.f(O0, zzbplVar);
        O0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel g1 = g1(12, O0);
        zzbwq W7 = zzbwp.W7(g1.readStrongBinder());
        g1.recycle();
        return W7;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzdt y3(IObjectWrapper iObjectWrapper, zzbpl zzbplVar, int i) throws RemoteException {
        zzdt zzdrVar;
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        zzaym.f(O0, zzbplVar);
        O0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel g1 = g1(17, O0);
        IBinder readStrongBinder = g1.readStrongBinder();
        if (readStrongBinder == null) {
            zzdrVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            if (queryLocalInterface instanceof zzdt) {
                zzdrVar = (zzdt) queryLocalInterface;
            } else {
                zzdrVar = new zzdr(readStrongBinder);
            }
        }
        g1.recycle();
        return zzdrVar;
    }
}
