package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.List;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzbib extends UnifiedNativeAd {
    public final zzbia a;
    public final zzbgh c;
    public final List b = new ArrayList();
    public final VideoController d = new VideoController();
    public final List e = new ArrayList();

    public zzbib(zzbia zzbiaVar) {
        com.google.android.gms.ads.internal.client.zzdg zzdgVar;
        zzbgg zzbggVar;
        IBinder iBinder;
        this.a = zzbiaVar;
        zzbgh zzbghVar = null;
        try {
            List t = zzbiaVar.t();
            if (t != null) {
                for (Object obj : t) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        zzbggVar = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        if (queryLocalInterface instanceof zzbgg) {
                            zzbggVar = (zzbgg) queryLocalInterface;
                        } else {
                            zzbggVar = new zzbge(iBinder);
                        }
                    }
                    if (zzbggVar != null) {
                        this.b.add(new zzbgh(zzbggVar));
                    }
                }
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
        }
        try {
            List q = this.a.q();
            if (q != null) {
                for (Object obj2 : q) {
                    if (obj2 instanceof IBinder) {
                        zzdgVar = com.google.android.gms.ads.internal.client.zzdf.W7((IBinder) obj2);
                    } else {
                        zzdgVar = null;
                    }
                    if (zzdgVar != null) {
                        this.e.add(new com.google.android.gms.ads.internal.client.zzdh(zzdgVar));
                    }
                }
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e2);
        }
        try {
            zzbgg k = this.a.k();
            if (k != null) {
                zzbghVar = new zzbgh(k);
            }
        } catch (RemoteException e3) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e3);
        }
        this.c = zzbghVar;
        try {
            if (this.a.i() != null) {
                new zzbga(this.a.i());
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e4);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void a(Bundle bundle) {
        try {
            this.a.w4(bundle);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean b(Bundle bundle) {
        try {
            return this.a.o3(bundle);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void c(Bundle bundle) {
        try {
            this.a.z5(bundle);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final VideoController d() {
        try {
            zzbia zzbiaVar = this.a;
            if (zzbiaVar.h() != null) {
                this.d.m(zzbiaVar.h());
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("Exception occurred while getting video controller", e);
        }
        return this.d;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final NativeAd.Image e() {
        return this.c;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    @InterfaceC11300zs1
    public final Double f() {
        try {
            double d = this.a.d();
            if (d == -1.0d) {
                return null;
            }
            return Double.valueOf(d);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    @InterfaceC11300zs1
    public final Object g() {
        try {
            IObjectWrapper l = this.a.l();
            if (l != null) {
                return ObjectWrapper.o1(l);
            }
            return null;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    @InterfaceC11300zs1
    public final String h() {
        try {
            return this.a.n();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    @InterfaceC11300zs1
    public final String i() {
        try {
            return this.a.p();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    @InterfaceC11300zs1
    public final String j() {
        try {
            return this.a.o();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    @InterfaceC11300zs1
    public final String k() {
        try {
            return this.a.r();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    @InterfaceC11300zs1
    public final String l() {
        try {
            return this.a.s();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    @InterfaceC11300zs1
    public final String m() {
        try {
            return this.a.v();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List n() {
        return this.b;
    }
}
