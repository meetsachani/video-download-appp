package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzazi;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbph;
import java.util.concurrent.atomic.AtomicBoolean;
import o.InterfaceC10810xr1;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zzek {
    public final zzbph a;
    public final zzq b;
    public final AtomicBoolean c;
    public final VideoController d;
    @InterfaceC5056aJ2
    public final zzbc e;
    @InterfaceC11300zs1
    public zza f;
    public AdListener g;
    public AdSize[] h;
    @InterfaceC11300zs1
    public AppEventListener i;
    @InterfaceC11300zs1
    public zzbx j;
    public VideoOptions k;
    public String l;
    @InterfaceC10810xr1
    public final ViewGroup m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f179o;
    @InterfaceC11300zs1
    public OnPaidEventListener p;

    public zzek(ViewGroup viewGroup, int i) {
        this(viewGroup, null, false, zzq.a, null, i);
    }

    public static zzr d(Context context, AdSize[] adSizeArr, int i) {
        for (AdSize adSize : adSizeArr) {
            if (adSize.equals(AdSize.s)) {
                return new zzr("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
            }
        }
        zzr zzrVar = new zzr(context, adSizeArr);
        zzrVar.e1 = e(i);
        return zzrVar;
    }

    public static boolean e(int i) {
        return i == 1;
    }

    public final void A(@InterfaceC11300zs1 AppEventListener appEventListener) {
        zzazi zzaziVar;
        try {
            this.i = appEventListener;
            zzbx zzbxVar = this.j;
            if (zzbxVar != null) {
                if (appEventListener != null) {
                    zzaziVar = new zzazi(appEventListener);
                } else {
                    zzaziVar = null;
                }
                zzbxVar.P4(zzaziVar);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    public final void B(boolean z) {
        this.f179o = z;
        try {
            zzbx zzbxVar = this.j;
            if (zzbxVar != null) {
                zzbxVar.R7(z);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    public final void C(@InterfaceC11300zs1 OnPaidEventListener onPaidEventListener) {
        try {
            this.p = onPaidEventListener;
            zzbx zzbxVar = this.j;
            if (zzbxVar != null) {
                zzbxVar.m7(new zzfo(onPaidEventListener));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    public final void D(VideoOptions videoOptions) {
        zzfw zzfwVar;
        this.k = videoOptions;
        try {
            zzbx zzbxVar = this.j;
            if (zzbxVar != null) {
                if (videoOptions == null) {
                    zzfwVar = null;
                } else {
                    zzfwVar = new zzfw(videoOptions);
                }
                zzbxVar.v6(zzfwVar);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    public final boolean E(zzbx zzbxVar) {
        try {
            IObjectWrapper n = zzbxVar.n();
            if (n == null || ((View) ObjectWrapper.o1(n)).getParent() != null) {
                return false;
            }
            this.m.addView((View) ObjectWrapper.o1(n));
            this.j = zzbxVar;
            return true;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final boolean a() {
        try {
            zzbx zzbxVar = this.j;
            if (zzbxVar != null) {
                return zzbxVar.l0();
            }
            return false;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final boolean b() {
        try {
            zzbx zzbxVar = this.j;
            if (zzbxVar != null) {
                return zzbxVar.z0();
            }
            return false;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final AdSize[] c() {
        return this.h;
    }

    public final AdListener f() {
        return this.g;
    }

    @InterfaceC11300zs1
    public final AdSize g() {
        zzr g;
        try {
            zzbx zzbxVar = this.j;
            if (zzbxVar != null && (g = zzbxVar.g()) != null) {
                return com.google.android.gms.ads.zzc.c(g.Z0, g.Y, g.X);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
        AdSize[] adSizeArr = this.h;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    @InterfaceC11300zs1
    public final OnPaidEventListener h() {
        return this.p;
    }

    @InterfaceC11300zs1
    public final ResponseInfo i() {
        zzdx zzdxVar = null;
        try {
            zzbx zzbxVar = this.j;
            if (zzbxVar != null) {
                zzdxVar = zzbxVar.k();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
        return ResponseInfo.f(zzdxVar);
    }

    public final VideoController k() {
        return this.d;
    }

    public final VideoOptions l() {
        return this.k;
    }

    @InterfaceC11300zs1
    public final AppEventListener m() {
        return this.i;
    }

    @InterfaceC11300zs1
    public final zzea n() {
        zzbx zzbxVar = this.j;
        if (zzbxVar != null) {
            try {
                return zzbxVar.l();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
            }
        }
        return null;
    }

    public final String o() {
        zzbx zzbxVar;
        if (this.l == null && (zzbxVar = this.j) != null) {
            try {
                this.l = zzbxVar.x();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
            }
        }
        return this.l;
    }

    public final void q() {
        try {
            zzbx zzbxVar = this.j;
            if (zzbxVar != null) {
                zzbxVar.y();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    public final void r(zzeh zzehVar) {
        zzbx zzbxVar;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.j == null) {
                if (this.h != null && this.l != null) {
                    ViewGroup viewGroup = this.m;
                    Context context = viewGroup.getContext();
                    zzr d = d(context, this.h, this.n);
                    if ("search_v2".equals(d.X)) {
                        zzbxVar = (zzbx) new zzan(zzbb.a(), context, d, this.l).d(context, false);
                    } else {
                        zzbxVar = (zzbx) new zzal(zzbb.a(), context, d, this.l, this.a).d(context, false);
                    }
                    this.j = zzbxVar;
                    zzbxVar.n6(new zzg(this.e));
                    zza zzaVar = this.f;
                    if (zzaVar != null) {
                        this.j.y7(new zzb(zzaVar));
                    }
                    AppEventListener appEventListener = this.i;
                    if (appEventListener != null) {
                        this.j.P4(new zzazi(appEventListener));
                    }
                    if (this.k != null) {
                        this.j.v6(new zzfw(this.k));
                    }
                    this.j.m7(new zzfo(this.p));
                    this.j.R7(this.f179o);
                    zzbx zzbxVar2 = this.j;
                    if (zzbxVar2 != null) {
                        try {
                            final IObjectWrapper n = zzbxVar2.n();
                            if (n != null) {
                                if (((Boolean) zzbet.f.e()).booleanValue()) {
                                    if (((Boolean) zzbd.c().b(zzbcv.xb)).booleanValue()) {
                                        com.google.android.gms.ads.internal.util.client.zzf.b.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzei
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                zzek.this.m.addView((View) ObjectWrapper.o1(n));
                                            }
                                        });
                                    }
                                }
                                viewGroup.addView((View) ObjectWrapper.o1(n));
                            }
                        } catch (RemoteException e) {
                            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
                        }
                    }
                } else {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
            }
            zzehVar.o(currentTimeMillis);
            zzbx zzbxVar3 = this.j;
            if (zzbxVar3 != null) {
                zzbxVar3.C3(this.b.a(this.m.getContext(), zzehVar));
                return;
            }
            throw null;
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e2);
        }
    }

    public final void s() {
        try {
            zzbx zzbxVar = this.j;
            if (zzbxVar != null) {
                zzbxVar.C();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    public final void t() {
        if (!this.c.getAndSet(true)) {
            try {
                zzbx zzbxVar = this.j;
                if (zzbxVar != null) {
                    zzbxVar.L();
                }
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
            }
        }
    }

    public final void u() {
        try {
            zzbx zzbxVar = this.j;
            if (zzbxVar != null) {
                zzbxVar.R();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    public final void v(@InterfaceC11300zs1 zza zzaVar) {
        zzb zzbVar;
        try {
            this.f = zzaVar;
            zzbx zzbxVar = this.j;
            if (zzbxVar != null) {
                if (zzaVar != null) {
                    zzbVar = new zzb(zzaVar);
                } else {
                    zzbVar = null;
                }
                zzbxVar.y7(zzbVar);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    public final void w(AdListener adListener) {
        this.g = adListener;
        this.e.t(adListener);
    }

    public final void x(AdSize... adSizeArr) {
        if (this.h == null) {
            y(adSizeArr);
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    public final void y(AdSize... adSizeArr) {
        this.h = adSizeArr;
        try {
            zzbx zzbxVar = this.j;
            if (zzbxVar != null) {
                zzbxVar.z2(d(this.m.getContext(), this.h, this.n));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
        this.m.requestLayout();
    }

    public final void z(String str) {
        if (this.l == null) {
            this.l = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }

    public zzek(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, zzq.a, null, 0);
    }

    public zzek(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i) {
        this(viewGroup, attributeSet, z, zzq.a, null, i);
    }

    @InterfaceC5056aJ2
    public zzek(ViewGroup viewGroup, @InterfaceC11300zs1 AttributeSet attributeSet, boolean z, zzq zzqVar, @InterfaceC11300zs1 zzbx zzbxVar, int i) {
        zzr zzrVar;
        this.a = new zzbph();
        this.d = new VideoController();
        this.e = new zzej(this);
        this.m = viewGroup;
        this.b = zzqVar;
        this.j = null;
        this.c = new AtomicBoolean(false);
        this.n = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzz zzzVar = new zzz(context, attributeSet);
                this.h = zzzVar.b(z);
                this.l = zzzVar.a();
                if (viewGroup.isInEditMode()) {
                    com.google.android.gms.ads.internal.util.client.zzf b = zzbb.b();
                    AdSize adSize = this.h[0];
                    int i2 = this.n;
                    if (adSize.equals(AdSize.s)) {
                        zzrVar = new zzr("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
                    } else {
                        zzrVar = new zzr(context, adSize);
                        zzrVar.e1 = e(i2);
                    }
                    b.s(viewGroup, zzrVar, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                zzbb.b().r(viewGroup, new zzr(context, AdSize.k), e.getMessage(), e.getMessage());
            }
        }
    }
}
