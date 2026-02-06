package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbt;
import com.google.android.gms.internal.ads.zzbcm;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbim;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbsp;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzbtk;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfo;
import com.google.android.gms.internal.ads.zzcgr;
import com.google.android.gms.internal.ads.zzcgt;
import com.google.android.gms.internal.ads.zzcgv;
import com.google.android.gms.internal.ads.zzcwg;
import com.google.android.gms.internal.ads.zzddy;
import com.google.android.gms.internal.ads.zzdsc;
import com.google.android.gms.internal.ads.zzdsd;
import com.google.android.gms.internal.ads.zzecf;
import com.google.android.gms.internal.ads.zzecg;
import com.google.android.gms.internal.ads.zzecy;
import com.google.android.gms.internal.ads.zzeda;
import com.google.android.gms.internal.ads.zzfrl;
import com.google.android.gms.internal.ads.zzfvt;
import java.util.Collections;
import o.C9260rT2;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public class zzm extends zzbtk implements zzah {
    @InterfaceC5056aJ2
    public static final int r1 = Color.argb(0, 0, 0, 0);
    public final Activity X;
    @InterfaceC11300zs1
    @InterfaceC5056aJ2
    public AdOverlayInfoParcel Y;
    @InterfaceC5056aJ2
    public zzi Y0;
    @InterfaceC5056aJ2
    public zzcfb Z;
    @InterfaceC5056aJ2
    public zzu Z0;
    @InterfaceC5056aJ2
    public FrameLayout b1;
    @InterfaceC5056aJ2
    public WebChromeClient.CustomViewCallback c1;
    @InterfaceC5056aJ2
    public zzh f1;
    public Runnable j1;
    public boolean k1;
    public boolean l1;
    public Toolbar p1;
    @InterfaceC5056aJ2
    public boolean a1 = false;
    @InterfaceC5056aJ2
    public boolean d1 = false;
    @InterfaceC5056aJ2
    public boolean e1 = false;
    @InterfaceC5056aJ2
    public boolean g1 = false;
    @InterfaceC5056aJ2
    public int q1 = 1;
    public final Object h1 = new Object();
    public final View.OnClickListener i1 = new zzf(this);
    public boolean m1 = false;
    public boolean n1 = false;
    public boolean o1 = true;

    public zzm(Activity activity) {
        this.X = activity;
    }

    public static final void e8(@InterfaceC11300zs1 zzeda zzedaVar, @InterfaceC11300zs1 View view) {
        if (zzedaVar != null && view != null) {
            if (!((Boolean) zzbd.c().b(zzbcv.y5)).booleanValue() || !zzedaVar.b()) {
                com.google.android.gms.ads.internal.zzv.c().i(zzedaVar.a(), view);
            }
        }
    }

    public final void C() {
        this.f1.removeView(this.Z0);
        g8(true);
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void G5(int i, int i2, Intent intent) {
        zzdsd d;
        AdOverlayInfoParcel adOverlayInfoParcel;
        if (i == 236) {
            zzbcm zzbcmVar = zzbcv.qd;
            if (((Boolean) zzbd.c().b(zzbcmVar)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zze.k("Callback from intent launch with requestCode: 236 and resultCode: " + i2);
                zzcfb zzcfbVar = this.Z;
                if (zzcfbVar != null && zzcfbVar.M() != null && (d = zzcfbVar.M().d()) != null && (adOverlayInfoParcel = this.Y) != null && ((Boolean) zzbd.c().b(zzbcmVar)).booleanValue()) {
                    zzdsc a = d.a();
                    a.b("action", "hilca");
                    a.b("gqi", zzfvt.c(adOverlayInfoParcel.l1));
                    StringBuilder sb = new StringBuilder();
                    sb.append(i2);
                    a.b("hilr", sb.toString());
                    if (i2 == -1 && intent != null) {
                        String stringExtra = intent.getStringExtra("callerPackage");
                        String stringExtra2 = intent.getStringExtra("loadingStage");
                        if (stringExtra != null) {
                            a.b("hilcp", stringExtra);
                        }
                        if (stringExtra2 != null) {
                            a.b("hills", stringExtra2);
                        }
                    }
                    a.i();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void K2(int i, String[] strArr, int[] iArr) {
        zzm zzmVar;
        if (i == 12345) {
            Activity activity = this.X;
            zzecf e = zzecg.e();
            e.a(activity);
            if (this.Y.f1 == 5) {
                zzmVar = this;
            } else {
                zzmVar = null;
            }
            e.b(zzmVar);
            try {
                this.Y.q1.v2(strArr, iArr, ObjectWrapper.V3(e.e()));
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final boolean P() {
        this.q1 = 1;
        if (this.Z == null) {
            return true;
        }
        if (((Boolean) zzbd.c().b(zzbcv.j9)).booleanValue() && this.Z.canGoBack()) {
            this.Z.goBack();
            return false;
        }
        boolean G0 = this.Z.G0();
        if (!G0) {
            this.Z.q("onbackblocked", Collections.EMPTY_MAP);
        }
        return G0;
    }

    public final void U() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzr zzrVar;
        if (this.X.isFinishing() && !this.m1) {
            this.m1 = true;
            zzcfb zzcfbVar = this.Z;
            if (zzcfbVar != null) {
                zzcfbVar.Z0(this.q1 - 1);
                synchronized (this.h1) {
                    try {
                        if (!this.k1 && this.Z.k0()) {
                            if (((Boolean) zzbd.c().b(zzbcv.k5)).booleanValue() && !this.n1 && (adOverlayInfoParcel = this.Y) != null && (zzrVar = adOverlayInfoParcel.Z) != null) {
                                zzrVar.V3();
                            }
                            Runnable runnable = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzd
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzm.this.c();
                                }
                            };
                            this.j1 = runnable;
                            com.google.android.gms.ads.internal.util.zzs.l.postDelayed(runnable, ((Long) zzbd.c().b(zzbcv.k1)).longValue());
                            return;
                        }
                    } finally {
                    }
                }
            }
            c();
        }
    }

    public final void X7(int i) {
        Activity activity = this.X;
        if (activity.getApplicationInfo().targetSdkVersion >= ((Integer) zzbd.c().b(zzbcv.h6)).intValue()) {
            if (activity.getApplicationInfo().targetSdkVersion <= ((Integer) zzbd.c().b(zzbcv.i6)).intValue()) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= ((Integer) zzbd.c().b(zzbcv.j6)).intValue()) {
                    if (i2 <= ((Integer) zzbd.c().b(zzbcv.k6)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            activity.setRequestedOrientation(i);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzv.t().w(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void Y7(boolean z) {
        if (z) {
            this.f1.setBackgroundColor(0);
        } else {
            this.f1.setBackgroundColor(-16777216);
        }
    }

    public final void Z7(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        Activity activity = this.X;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.b1 = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.b1.addView(view, -1, -1);
        activity.setContentView(this.b1);
        this.l1 = true;
        this.c1 = customViewCallback;
        this.a1 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c2  */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a8(boolean z) throws zzg {
        zzcgt zzcgtVar;
        boolean z2;
        boolean z3;
        zzcgv zzcgvVar;
        String str;
        com.google.android.gms.ads.internal.zza zzaVar;
        Resources.Theme theme;
        com.google.android.gms.ads.internal.zzb zzbVar;
        ?? r2;
        zzcfb zzcfbVar;
        if (!this.l1) {
            this.X.requestWindowFeature(1);
        }
        Activity activity = this.X;
        Window window = activity.getWindow();
        if (window != null) {
            zzcfb zzcfbVar2 = this.Y.Y0;
            if (zzcfbVar2 != null) {
                zzcgtVar = zzcfbVar2.M();
            } else {
                zzcgtVar = null;
            }
            if (zzcgtVar != null && zzcgtVar.i0()) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.g1 = false;
            if (z2) {
                int i = this.Y.e1;
                if (i == 6) {
                    if (activity.getResources().getConfiguration().orientation == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    this.g1 = z3;
                } else if (i == 7) {
                    if (activity.getResources().getConfiguration().orientation == 2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    this.g1 = z3;
                }
                int i2 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.b("Delay onShow to next orientation change: " + z3);
                X7(this.Y.e1);
                window.setFlags(16777216, 16777216);
                com.google.android.gms.ads.internal.util.client.zzo.b("Hardware acceleration on the AdActivity window enabled.");
                if (this.e1) {
                    this.f1.setBackgroundColor(-16777216);
                } else {
                    this.f1.setBackgroundColor(r1);
                }
                activity.setContentView(this.f1);
                this.l1 = true;
                if (!z) {
                    try {
                        com.google.android.gms.ads.internal.zzv.b();
                        zzcfb zzcfbVar3 = this.Y.Y0;
                        if (zzcfbVar3 != null) {
                            zzcgvVar = zzcfbVar3.H();
                        } else {
                            zzcgvVar = null;
                        }
                        zzcfb zzcfbVar4 = this.Y.Y0;
                        if (zzcfbVar4 != null) {
                            str = zzcfbVar4.X();
                        } else {
                            str = null;
                        }
                        AdOverlayInfoParcel adOverlayInfoParcel = this.Y;
                        VersionInfoParcel versionInfoParcel = adOverlayInfoParcel.h1;
                        zzcfb zzcfbVar5 = adOverlayInfoParcel.Y0;
                        if (zzcfbVar5 != null) {
                            zzaVar = zzcfbVar5.j();
                        } else {
                            zzaVar = null;
                        }
                        String str2 = str;
                        theme = null;
                        boolean z4 = false;
                        zzcfb a = zzcfo.a(activity, zzcgvVar, str2, true, z2, null, null, versionInfoParcel, null, null, zzaVar, zzbbt.a(), null, null, null, null, null);
                        this.Z = a;
                        zzcgt M = a.M();
                        AdOverlayInfoParcel adOverlayInfoParcel2 = this.Y;
                        zzbim zzbimVar = adOverlayInfoParcel2.k1;
                        zzbio zzbioVar = adOverlayInfoParcel2.Z0;
                        zzad zzadVar = adOverlayInfoParcel2.d1;
                        zzcfb zzcfbVar6 = adOverlayInfoParcel2.Y0;
                        if (zzcfbVar6 != null) {
                            zzbVar = zzcfbVar6.M().f();
                        } else {
                            zzbVar = null;
                        }
                        M.e1(null, zzbimVar, null, zzbioVar, zzadVar, true, null, zzbVar, null, null, null, null, null, null, null, null, null, null, null);
                        this.Z.M().f1(new zzcgr() { // from class: com.google.android.gms.ads.internal.overlay.zze
                            @Override // com.google.android.gms.internal.ads.zzcgr
                            public final void a(boolean z5, int i3, String str3, String str4) {
                                zzcfb zzcfbVar7 = zzm.this.Z;
                                if (zzcfbVar7 != null) {
                                    zzcfbVar7.c0();
                                }
                            }
                        });
                        AdOverlayInfoParcel adOverlayInfoParcel3 = this.Y;
                        String str3 = adOverlayInfoParcel3.g1;
                        if (str3 != null) {
                            this.Z.loadUrl(str3);
                        } else {
                            String str4 = adOverlayInfoParcel3.c1;
                            if (str4 != null) {
                                this.Z.loadDataWithBaseURL(adOverlayInfoParcel3.a1, str4, "text/html", "UTF-8", null);
                            } else {
                                throw new zzg("No URL or HTML to display in ad overlay.");
                            }
                        }
                        zzcfb zzcfbVar7 = this.Y.Y0;
                        r2 = z4;
                        if (zzcfbVar7 != null) {
                            zzcfbVar7.m0(this);
                            r2 = z4;
                        }
                    } catch (Exception e) {
                        com.google.android.gms.ads.internal.util.client.zzo.e("Error obtaining webview.", e);
                        throw new zzg("Could not obtain webview for the overlay.", e);
                    }
                } else {
                    theme = null;
                    r2 = 0;
                    zzcfb zzcfbVar8 = this.Y.Y0;
                    this.Z = zzcfbVar8;
                    zzcfbVar8.P0(this.X);
                }
                if (this.Y.r1) {
                    CookieManager.getInstance().setAcceptThirdPartyCookies(this.Z.N(), r2);
                }
                this.Z.q1(this);
                zzcfbVar = this.Y.Y0;
                if (zzcfbVar != null) {
                    e8(zzcfbVar.d0(), this.f1);
                }
                if (this.Y.f1 != 5) {
                    ViewParent parent = this.Z.getParent();
                    if (parent != null && (parent instanceof ViewGroup)) {
                        ((ViewGroup) parent).removeView(this.Z.U());
                    }
                    if (this.e1) {
                        this.Z.Z();
                    }
                    if (this.Y.r1) {
                        Toolbar toolbar = new Toolbar(this.X);
                        this.p1 = toolbar;
                        toolbar.setId(View.generateViewId());
                        this.Z.U().setId(View.generateViewId());
                        this.p1.setBackgroundColor(-12303292);
                        this.p1.setVisibility(r2);
                        try {
                            this.p1.setNavigationIcon(com.google.android.gms.ads.internal.zzv.t().f().getDrawable(R.drawable.admob_close_button_white_cross, theme));
                        } catch (Resources.NotFoundException | NullPointerException e2) {
                            com.google.android.gms.ads.internal.util.zze.l("Error obtaining close icon.", e2);
                        }
                        this.p1.setNavigationOnClickListener(this.i1);
                        this.p1.setTitleMarginStart(r2);
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                        layoutParams.addRule(10);
                        this.f1.addView(this.p1, layoutParams);
                        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                        layoutParams2.addRule(3, this.p1.getId());
                        layoutParams2.addRule(12);
                        this.f1.addView(this.Z.U(), layoutParams2);
                        c8(this.p1);
                    } else {
                        this.f1.addView(this.Z.U(), -1, -1);
                    }
                }
                if (!z && !this.g1) {
                    d();
                }
                if (this.Y.f1 == 5) {
                    g8(z2);
                    if (this.Z.F0()) {
                        h8(z2, true);
                        return;
                    }
                    return;
                }
                Activity activity2 = this.X;
                zzecf e3 = zzecg.e();
                e3.a(activity2);
                e3.b(this);
                e3.c(this.Y.l1);
                e3.d(this.Y.m1);
                try {
                    f8(e3.e());
                    return;
                } catch (RemoteException | zzg e4) {
                    throw new zzg(e4.getMessage(), e4);
                }
            }
            z3 = false;
            int i22 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.b("Delay onShow to next orientation change: " + z3);
            X7(this.Y.e1);
            window.setFlags(16777216, 16777216);
            com.google.android.gms.ads.internal.util.client.zzo.b("Hardware acceleration on the AdActivity window enabled.");
            if (this.e1) {
            }
            activity.setContentView(this.f1);
            this.l1 = true;
            if (!z) {
            }
            if (this.Y.r1) {
            }
            this.Z.q1(this);
            zzcfbVar = this.Y.Y0;
            if (zzcfbVar != null) {
            }
            if (this.Y.f1 != 5) {
            }
            if (!z) {
                d();
            }
            if (this.Y.f1 == 5) {
            }
        } else {
            throw new zzg("Invalid activity, no window available.");
        }
    }

    public final void b() {
        this.q1 = 3;
        Activity activity = this.X;
        activity.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.Y;
        if (adOverlayInfoParcel != null && adOverlayInfoParcel.f1 == 5) {
            activity.overridePendingTransition(0, 0);
            zzcfb zzcfbVar = this.Z;
            if (zzcfbVar != null) {
                zzcfbVar.q1(null);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void b0(IObjectWrapper iObjectWrapper) {
        d8((Configuration) ObjectWrapper.o1(iObjectWrapper));
    }

    public final void b8(String str) {
        Toolbar toolbar = this.p1;
        if (toolbar != null) {
            toolbar.setSubtitle(str);
        }
    }

    @InterfaceC5056aJ2
    public final void c() {
        zzcfb zzcfbVar;
        zzr zzrVar;
        if (!this.n1) {
            this.n1 = true;
            zzcfb zzcfbVar2 = this.Z;
            if (zzcfbVar2 != null) {
                this.f1.removeView(zzcfbVar2.U());
                zzi zziVar = this.Y0;
                if (zziVar != null) {
                    this.Z.P0(zziVar.d);
                    this.Z.l1(false);
                    if (((Boolean) zzbd.c().b(zzbcv.Vc)).booleanValue() && this.Z.getParent() != null) {
                        ((ViewGroup) this.Z.getParent()).removeView(this.Z.U());
                    }
                    ViewGroup viewGroup = this.Y0.c;
                    View U = this.Z.U();
                    zzi zziVar2 = this.Y0;
                    viewGroup.addView(U, zziVar2.a, zziVar2.b);
                    this.Y0 = null;
                } else {
                    Activity activity = this.X;
                    if (activity.getApplicationContext() != null) {
                        this.Z.P0(activity.getApplicationContext());
                    }
                }
                this.Z = null;
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.Y;
            if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.Z) != null) {
                zzrVar.h5(this.q1);
            }
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.Y;
            if (adOverlayInfoParcel2 != null && (zzcfbVar = adOverlayInfoParcel2.Y0) != null) {
                e8(zzcfbVar.d0(), this.Y.Y0.U());
            }
        }
    }

    public final void c8(View view) {
        zzeda d0;
        zzecy T;
        zzcfb zzcfbVar = this.Z;
        if (zzcfbVar != null) {
            if (((Boolean) zzbd.c().b(zzbcv.z5)).booleanValue() && (T = zzcfbVar.T()) != null) {
                T.a(view);
            } else if (((Boolean) zzbd.c().b(zzbcv.y5)).booleanValue() && (d0 = zzcfbVar.d0()) != null && d0.b()) {
                com.google.android.gms.ads.internal.zzv.c().e(d0.a(), view);
            }
        }
    }

    public final void d() {
        this.Z.c0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(com.google.android.gms.internal.ads.zzbcv.U0)).booleanValue() != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(com.google.android.gms.internal.ads.zzbcv.T0)).booleanValue() != false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d8(Configuration configuration) {
        boolean z;
        com.google.android.gms.ads.internal.zzl zzlVar;
        int i;
        com.google.android.gms.ads.internal.zzl zzlVar2;
        AdOverlayInfoParcel adOverlayInfoParcel = this.Y;
        boolean z2 = true;
        boolean z3 = false;
        if (adOverlayInfoParcel != null && (zzlVar2 = adOverlayInfoParcel.j1) != null && zzlVar2.Y) {
            z = true;
        } else {
            z = false;
        }
        Activity activity = this.X;
        boolean d = com.google.android.gms.ads.internal.zzv.w().d(activity, configuration);
        if (this.e1 && !z) {
        }
        if (d) {
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.Y;
        if (adOverlayInfoParcel2 != null && (zzlVar = adOverlayInfoParcel2.j1) != null && zzlVar.b1) {
            z3 = true;
        }
        Window window = activity.getWindow();
        if (((Boolean) zzbd.c().b(zzbcv.r1)).booleanValue()) {
            View decorView = window.getDecorView();
            if (z2) {
                if (z3) {
                    i = 5894;
                } else {
                    i = 5380;
                }
            } else {
                i = 256;
            }
            decorView.setSystemUiVisibility(i);
        } else if (z2) {
            window.addFlags(1024);
            window.clearFlags(2048);
            if (z3) {
                window.getDecorView().setSystemUiVisibility(4098);
            }
        } else {
            window.addFlags(2048);
            window.clearFlags(1024);
        }
    }

    public final void f() {
        this.f1.Z0 = true;
    }

    public final void f8(zzecg zzecgVar) throws zzg, RemoteException {
        zzbte zzbteVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.Y;
        if (adOverlayInfoParcel != null && (zzbteVar = adOverlayInfoParcel.q1) != null) {
            zzbteVar.Z0(ObjectWrapper.V3(zzecgVar));
            return;
        }
        throw new zzg("noioou");
    }

    public final void g() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.Y;
        if (adOverlayInfoParcel != null && this.a1) {
            X7(adOverlayInfoParcel.e1);
        }
        if (this.b1 != null) {
            this.X.setContentView(this.f1);
            this.l1 = true;
            this.b1.removeAllViews();
            this.b1 = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.c1;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.c1 = null;
        }
        this.a1 = false;
    }

    public final void g8(boolean z) {
        boolean z2;
        int i;
        int i2;
        if (this.Y.r1) {
            return;
        }
        int intValue = ((Integer) zzbd.c().b(zzbcv.p5)).intValue();
        int i3 = 0;
        if (((Boolean) zzbd.c().b(zzbcv.n1)).booleanValue() || z) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzt zztVar = new zzt();
        zztVar.d = 50;
        if (true != z2) {
            i = 0;
        } else {
            i = intValue;
        }
        zztVar.a = i;
        if (true != z2) {
            i3 = intValue;
        }
        zztVar.b = i3;
        zztVar.c = intValue;
        this.Z0 = new zzu(this.X, zztVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        if (true != z2) {
            i2 = 9;
        } else {
            i2 = 11;
        }
        layoutParams.addRule(i2);
        h8(z, this.Y.b1);
        this.f1.addView(this.Z0, layoutParams);
        c8(this.Z0);
    }

    public final void h0() {
        synchronized (this.h1) {
            try {
                this.k1 = true;
                Runnable runnable = this.j1;
                if (runnable != null) {
                    zzfrl zzfrlVar = com.google.android.gms.ads.internal.util.zzs.l;
                    zzfrlVar.removeCallbacks(runnable);
                    zzfrlVar.post(this.j1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void h1(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.d1);
    }

    public final void h8(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzl zzlVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzl zzlVar2;
        boolean z5 = true;
        if (((Boolean) zzbd.c().b(zzbcv.l1)).booleanValue() && (adOverlayInfoParcel2 = this.Y) != null && (zzlVar2 = adOverlayInfoParcel2.j1) != null && zzlVar2.c1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (((Boolean) zzbd.c().b(zzbcv.m1)).booleanValue() && (adOverlayInfoParcel = this.Y) != null && (zzlVar = adOverlayInfoParcel.j1) != null && zzlVar.d1) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z && z2 && z3 && !z4) {
            new zzbsp(this.Z, "useCustomClose").c("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzu zzuVar = this.Z0;
        if (zzuVar != null) {
            if (!z4 && (!z2 || z3)) {
                z5 = false;
            }
            zzuVar.b(z5);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void i() {
        this.q1 = 1;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzah
    public final void j() {
        this.q1 = 2;
        this.X.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void m() {
        zzcfb zzcfbVar = this.Z;
        if (zzcfbVar != null) {
            try {
                this.f1.removeView(zzcfbVar.U());
            } catch (NullPointerException unused) {
            }
        }
        U();
    }

    public final void n() {
        if (this.g1) {
            this.g1 = false;
            d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008d A[Catch: zzg -> 0x0037, TryCatch #0 {zzg -> 0x0037, blocks: (B:12:0x001b, B:14:0x0029, B:16:0x002d, B:18:0x0033, B:21:0x003a, B:22:0x0043, B:24:0x004e, B:25:0x0050, B:27:0x0056, B:28:0x0062, B:30:0x0069, B:36:0x0076, B:38:0x007a, B:40:0x007f, B:43:0x008d, B:45:0x0091, B:47:0x0097, B:48:0x009a, B:50:0x00a0, B:51:0x00a3, B:53:0x00a9, B:55:0x00ad, B:56:0x00b0, B:58:0x00b6, B:59:0x00b9, B:66:0x00e4, B:68:0x00e8, B:69:0x00ef, B:70:0x00f0, B:72:0x00f4, B:74:0x0101, B:33:0x0070, B:35:0x0074, B:41:0x0089, B:76:0x0105, B:77:0x010c), top: B:80:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0101 A[Catch: zzg -> 0x0037, TryCatch #0 {zzg -> 0x0037, blocks: (B:12:0x001b, B:14:0x0029, B:16:0x002d, B:18:0x0033, B:21:0x003a, B:22:0x0043, B:24:0x004e, B:25:0x0050, B:27:0x0056, B:28:0x0062, B:30:0x0069, B:36:0x0076, B:38:0x007a, B:40:0x007f, B:43:0x008d, B:45:0x0091, B:47:0x0097, B:48:0x009a, B:50:0x00a0, B:51:0x00a3, B:53:0x00a9, B:55:0x00ad, B:56:0x00b0, B:58:0x00b6, B:59:0x00b9, B:66:0x00e4, B:68:0x00e8, B:69:0x00ef, B:70:0x00f0, B:72:0x00f4, B:74:0x0101, B:33:0x0070, B:35:0x0074, B:41:0x0089, B:76:0x0105, B:77:0x010c), top: B:80:0x001b }] */
    @Override // com.google.android.gms.internal.ads.zzbtl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void n3(Bundle bundle) {
        boolean z;
        int i;
        if (!this.l1) {
            this.X.requestWindowFeature(1);
        }
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        } else {
            z = false;
        }
        this.d1 = z;
        try {
            Activity activity = this.X;
            AdOverlayInfoParcel m0 = AdOverlayInfoParcel.m0(activity.getIntent());
            this.Y = m0;
            if (m0 != null) {
                if (m0.r1) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        C9260rT2.a(activity, true);
                    } else {
                        activity.getWindow().addFlags(524288);
                    }
                }
                if (this.Y.h1.Z > 7500000) {
                    this.q1 = 4;
                }
                if (activity.getIntent() != null) {
                    this.o1 = activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
                }
                AdOverlayInfoParcel adOverlayInfoParcel = this.Y;
                com.google.android.gms.ads.internal.zzl zzlVar = adOverlayInfoParcel.j1;
                if (zzlVar != null) {
                    boolean z2 = zzlVar.X;
                    this.e1 = z2;
                    if (z2) {
                        if (adOverlayInfoParcel.f1 != 5 && zzlVar.a1 != -1) {
                            new zzk(this, null).b();
                        }
                    }
                    if (bundle == null) {
                        if (this.o1) {
                            zzcwg zzcwgVar = this.Y.o1;
                            if (zzcwgVar != null) {
                                zzcwgVar.b();
                            }
                            zzr zzrVar = this.Y.Z;
                            if (zzrVar != null) {
                                zzrVar.r4();
                            }
                        }
                        AdOverlayInfoParcel adOverlayInfoParcel2 = this.Y;
                        if (adOverlayInfoParcel2.f1 != 1) {
                            com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel2.Y;
                            if (zzaVar != null) {
                                zzaVar.y();
                            }
                            zzddy zzddyVar = this.Y.p1;
                            if (zzddyVar != null) {
                                zzddyVar.X0();
                            }
                        }
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel3 = this.Y;
                    zzh zzhVar = new zzh(activity, adOverlayInfoParcel3.i1, adOverlayInfoParcel3.h1.X, adOverlayInfoParcel3.n1);
                    this.f1 = zzhVar;
                    zzhVar.setId(1000);
                    com.google.android.gms.ads.internal.zzv.w().j(activity);
                    AdOverlayInfoParcel adOverlayInfoParcel4 = this.Y;
                    i = adOverlayInfoParcel4.f1;
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 5) {
                                    a8(false);
                                    return;
                                }
                                throw new zzg("Could not determine ad overlay type.");
                            }
                            a8(true);
                            return;
                        }
                        this.Y0 = new zzi(adOverlayInfoParcel4.Y0);
                        a8(false);
                        return;
                    }
                    a8(false);
                } else if (adOverlayInfoParcel.f1 == 5) {
                    this.e1 = true;
                    if (adOverlayInfoParcel.f1 != 5) {
                        new zzk(this, null).b();
                    }
                    if (bundle == null) {
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel32 = this.Y;
                    zzh zzhVar2 = new zzh(activity, adOverlayInfoParcel32.i1, adOverlayInfoParcel32.h1.X, adOverlayInfoParcel32.n1);
                    this.f1 = zzhVar2;
                    zzhVar2.setId(1000);
                    com.google.android.gms.ads.internal.zzv.w().j(activity);
                    AdOverlayInfoParcel adOverlayInfoParcel42 = this.Y;
                    i = adOverlayInfoParcel42.f1;
                    if (i != 1) {
                    }
                } else {
                    this.e1 = false;
                    if (bundle == null) {
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel322 = this.Y;
                    zzh zzhVar22 = new zzh(activity, adOverlayInfoParcel322.i1, adOverlayInfoParcel322.h1.X, adOverlayInfoParcel322.n1);
                    this.f1 = zzhVar22;
                    zzhVar22.setId(1000);
                    com.google.android.gms.ads.internal.zzv.w().j(activity);
                    AdOverlayInfoParcel adOverlayInfoParcel422 = this.Y;
                    i = adOverlayInfoParcel422.f1;
                    if (i != 1) {
                    }
                }
            } else {
                throw new zzg("Could not get info for ad overlay.");
            }
        } catch (zzg e) {
            String message = e.getMessage();
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g(message);
            this.q1 = 4;
            this.X.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void p() {
        zzr zzrVar;
        g();
        AdOverlayInfoParcel adOverlayInfoParcel = this.Y;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.Z) != null) {
            zzrVar.S7();
        }
        if (!((Boolean) zzbd.c().b(zzbcv.m5)).booleanValue() && this.Z != null && (!this.X.isFinishing() || this.Y0 == null)) {
            this.Z.onPause();
        }
        U();
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void q() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.Y;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.Z) != null) {
            zzrVar.o1();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void r() {
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void t() {
        if (((Boolean) zzbd.c().b(zzbcv.m5)).booleanValue() && this.Z != null && (!this.X.isFinishing() || this.Y0 == null)) {
            this.Z.onPause();
        }
        U();
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void v() {
        if (((Boolean) zzbd.c().b(zzbcv.m5)).booleanValue()) {
            zzcfb zzcfbVar = this.Z;
            if (zzcfbVar != null && !zzcfbVar.L()) {
                this.Z.onResume();
                return;
            }
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("The webview does not exist. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void x() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.Y;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.Z) != null) {
            zzrVar.s7();
        }
        d8(this.X.getResources().getConfiguration());
        if (!((Boolean) zzbd.c().b(zzbcv.m5)).booleanValue()) {
            zzcfb zzcfbVar = this.Z;
            if (zzcfbVar != null && !zzcfbVar.L()) {
                this.Z.onResume();
                return;
            }
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("The webview does not exist. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void y() {
        this.l1 = true;
    }
}
