package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzbsu extends NativeAd {
    public final zzbia a;
    @InterfaceC11300zs1
    public final zzbst c;
    @InterfaceC11300zs1
    public final NativeAd.AdChoicesInfo d;
    public final List b = new ArrayList();
    public final List e = new ArrayList();

    /* JADX WARN: Can't wrap try/catch for region: R(17:1|2|3|(2:5|(5:8|(1:10)(1:17)|(3:12|13|14)(1:16)|15|6))|19|20|(2:22|(5:25|(1:27)(1:34)|(3:29|30|31)(1:33)|32|23))|36|37|(7:39|40|41|42|(2:44|45)|47|48)|53|40|41|42|(0)|47|48) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a9, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00aa, code lost:
        com.google.android.gms.ads.internal.util.client.zzo.e("", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009c A[Catch: RemoteException -> 0x00a9, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x00a9, blocks: (B:42:0x0094, B:44:0x009c), top: B:50:0x0094 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzbsu(zzbia zzbiaVar) {
        zzbst zzbstVar;
        zzbgg k;
        com.google.android.gms.ads.internal.client.zzdg zzdgVar;
        zzbgg zzbggVar;
        this.a = zzbiaVar;
        zzbsr zzbsrVar = null;
        try {
            List t = zzbiaVar.t();
            if (t != null) {
                for (Object obj : t) {
                    if (obj instanceof IBinder) {
                        zzbggVar = zzbgf.W7((IBinder) obj);
                    } else {
                        zzbggVar = null;
                    }
                    if (zzbggVar != null) {
                        this.b.add(new zzbst(zzbggVar));
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
            k = this.a.k();
        } catch (RemoteException e3) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e3);
        }
        if (k != null) {
            zzbstVar = new zzbst(k);
            this.c = zzbstVar;
            if (this.a.i() != null) {
                zzbsrVar = new zzbsr(this.a.i());
            }
            this.d = zzbsrVar;
        }
        zzbstVar = null;
        this.c = zzbstVar;
        if (this.a.i() != null) {
        }
        this.d = zzbsrVar;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void A(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.a.Z6(new zzbtb(unconfirmedClickListener));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("Failed to setUnconfirmedClickListener", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    @InterfaceC11300zs1
    public final /* bridge */ /* synthetic */ Object B() {
        try {
            return this.a.m();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void a() {
        try {
            this.a.B();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("Failed to cancelUnconfirmedClick", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void b() {
        try {
            this.a.y();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void c() {
        try {
            this.a.F();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    @InterfaceC11300zs1
    public final NativeAd.AdChoicesInfo d() {
        return this.d;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    @InterfaceC11300zs1
    public final String e() {
        try {
            return this.a.n();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    @InterfaceC11300zs1
    public final String f() {
        try {
            return this.a.p();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    @InterfaceC11300zs1
    public final String g() {
        try {
            return this.a.o();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final Bundle h() {
        try {
            Bundle e = this.a.e();
            if (e != null) {
                return e;
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e2);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    @InterfaceC11300zs1
    public final String i() {
        try {
            return this.a.r();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    @InterfaceC11300zs1
    public final NativeAd.Image j() {
        return this.c;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final List<NativeAd.Image> k() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    @InterfaceC11300zs1
    public final MediaContent l() {
        try {
            zzbia zzbiaVar = this.a;
            if (zzbiaVar.j() != null) {
                return new com.google.android.gms.ads.internal.client.zzez(zzbiaVar.j(), null);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final List<MuteThisAdReason> m() {
        return this.e;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    @InterfaceC11300zs1
    public final String n() {
        try {
            return this.a.s();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    @InterfaceC11300zs1
    public final ResponseInfo o() {
        com.google.android.gms.ads.internal.client.zzdx zzdxVar;
        try {
            zzdxVar = this.a.g();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            zzdxVar = null;
        }
        return ResponseInfo.f(zzdxVar);
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    @InterfaceC11300zs1
    public final Double p() {
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

    @Override // com.google.android.gms.ads.nativead.NativeAd
    @InterfaceC11300zs1
    public final String q() {
        try {
            return this.a.v();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean r() {
        try {
            return this.a.P();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void recordEvent(Bundle bundle) {
        try {
            this.a.f6(bundle);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("Failed to record native event", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean s() {
        try {
            return this.a.D();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void t(MuteThisAdReason muteThisAdReason) {
        try {
            try {
                if (this.a.D()) {
                    if (muteThisAdReason == null) {
                        this.a.J2(null);
                        return;
                    } else if (muteThisAdReason instanceof com.google.android.gms.ads.internal.client.zzdh) {
                        this.a.J2(((com.google.android.gms.ads.internal.client.zzdh) muteThisAdReason).a());
                        return;
                    } else {
                        com.google.android.gms.ads.internal.util.client.zzo.d("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
                        return;
                    }
                }
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            }
            com.google.android.gms.ads.internal.util.client.zzo.d("Ad is not custom mute enabled");
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void u(Bundle bundle) {
        try {
            this.a.w4(bundle);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void v() {
        try {
            this.a.L();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean w(Bundle bundle) {
        try {
            return this.a.o3(bundle);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void x(Bundle bundle) {
        try {
            this.a.z5(bundle);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void y(MuteThisAdListener muteThisAdListener) {
        try {
            this.a.y4(new com.google.android.gms.ads.internal.client.zzdd(muteThisAdListener));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void z(@InterfaceC11300zs1 OnPaidEventListener onPaidEventListener) {
        try {
            this.a.p5(new com.google.android.gms.ads.internal.client.zzfo(onPaidEventListener));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("Failed to setOnPaidEventListener", e);
        }
    }
}
