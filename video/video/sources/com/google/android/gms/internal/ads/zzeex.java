package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzeex extends zzbwh implements zzcxd {
    public zzbwi X;
    public zzcxc Y;
    public zzdej Z;

    @Override // com.google.android.gms.internal.ads.zzbwi
    public final synchronized void E0(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwi zzbwiVar = this.X;
        if (zzbwiVar != null) {
            ((zzeic) zzbwiVar).Y0.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwi
    public final synchronized void H5(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwi zzbwiVar = this.X;
        if (zzbwiVar != null) {
            ((zzeic) zzbwiVar).Z.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwi
    public final synchronized void I7(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzdej zzdejVar = this.Z;
        if (zzdejVar != null) {
            Executor c = zzeid.c(((zzeia) zzdejVar).d);
            final zzedi zzediVar = ((zzeia) zzdejVar).c;
            final zzfbu zzfbuVar = ((zzeia) zzdejVar).b;
            final zzfcg zzfcgVar = ((zzeia) zzdejVar).a;
            final zzeia zzeiaVar = (zzeia) zzdejVar;
            c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehz
                @Override // java.lang.Runnable
                public final void run() {
                    zzeid zzeidVar = zzeia.this.d;
                    zzeid.e(zzfcgVar, zzfbuVar, zzediVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwi
    public final synchronized void M1(IObjectWrapper iObjectWrapper, zzbwj zzbwjVar) throws RemoteException {
        zzbwi zzbwiVar = this.X;
        if (zzbwiVar != null) {
            ((zzeic) zzbwiVar).Y0.N0(zzbwjVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwi
    public final synchronized void Q1(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwi zzbwiVar = this.X;
        if (zzbwiVar != null) {
            ((zzeic) zzbwiVar).Z.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwi
    public final synchronized void R0(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwi zzbwiVar = this.X;
        if (zzbwiVar != null) {
            zzbwiVar.R0(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwi
    public final synchronized void T4(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzdej zzdejVar = this.Z;
        if (zzdejVar != null) {
            zzedi zzediVar = ((zzeia) zzdejVar).c;
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Fail to initialize adapter ".concat(String.valueOf(zzediVar.a)));
        }
    }

    public final synchronized void X7(zzbwi zzbwiVar) {
        this.X = zzbwiVar;
    }

    public final synchronized void Y7(zzdej zzdejVar) {
        this.Z = zzdejVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwi
    public final synchronized void b3(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzcxc zzcxcVar = this.Y;
        if (zzcxcVar != null) {
            zzcxcVar.u(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwi
    public final synchronized void d0(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwi zzbwiVar = this.X;
        if (zzbwiVar != null) {
            ((zzeic) zzbwiVar).Y0.N0(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxd
    public final synchronized void g1(zzcxc zzcxcVar) {
        this.Y = zzcxcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwi
    public final synchronized void i1(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcxc zzcxcVar = this.Y;
        if (zzcxcVar != null) {
            zzcxcVar.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwi
    public final synchronized void s0(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwi zzbwiVar = this.X;
        if (zzbwiVar != null) {
            ((zzeic) zzbwiVar).X.r4();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwi
    public final synchronized void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwi zzbwiVar = this.X;
        if (zzbwiVar != null) {
            ((zzeic) zzbwiVar).Y.y();
        }
    }
}
