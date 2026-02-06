package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzdhw extends zzbgc {
    public final zzdio X;
    public IObjectWrapper Y;

    public zzdhw(zzdio zzdioVar) {
        this.X = zzdioVar;
    }

    public static float W7(IObjectWrapper iObjectWrapper) {
        Drawable drawable;
        if (iObjectWrapper != null && (drawable = (Drawable) ObjectWrapper.o1(iObjectWrapper)) != null && drawable.getIntrinsicWidth() != -1 && drawable.getIntrinsicHeight() != -1) {
            return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final void D2(zzbho zzbhoVar) {
        zzdio zzdioVar = this.X;
        if (zzdioVar.W() instanceof zzcgd) {
            ((zzcgd) zzdioVar.W()).c8(zzbhoVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final float d() throws RemoteException {
        float f;
        zzdio zzdioVar = this.X;
        if (zzdioVar.O() != 0.0f) {
            return zzdioVar.O();
        }
        if (zzdioVar.W() != null) {
            try {
                return zzdioVar.W().d();
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.e("Remote exception getting video controller aspect ratio.", e);
                return 0.0f;
            }
        }
        IObjectWrapper iObjectWrapper = this.Y;
        if (iObjectWrapper != null) {
            return W7(iObjectWrapper);
        }
        zzbgg Z = zzdioVar.Z();
        if (Z == null) {
            return 0.0f;
        }
        if (Z.f() != -1 && Z.c() != -1) {
            f = Z.f() / Z.c();
        } else {
            f = 0.0f;
        }
        if (f == 0.0f) {
            return W7(Z.e());
        }
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final float e() throws RemoteException {
        zzdio zzdioVar = this.X;
        if (zzdioVar.W() != null) {
            return zzdioVar.W().e();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final float g() throws RemoteException {
        zzdio zzdioVar = this.X;
        if (zzdioVar.W() != null) {
            return zzdioVar.W().g();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    @InterfaceC11300zs1
    public final com.google.android.gms.ads.internal.client.zzea h() throws RemoteException {
        return this.X.W();
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    @InterfaceC11300zs1
    public final IObjectWrapper i() throws RemoteException {
        IObjectWrapper iObjectWrapper = this.Y;
        if (iObjectWrapper != null) {
            return iObjectWrapper;
        }
        zzbgg Z = this.X.Z();
        if (Z == null) {
            return null;
        }
        return Z.e();
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final boolean k() throws RemoteException {
        return this.X.G();
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final boolean l() throws RemoteException {
        if (this.X.W() != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final void s0(IObjectWrapper iObjectWrapper) {
        this.Y = iObjectWrapper;
    }
}
