package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Looper;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zzbca;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzfrl;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import o.C3197Hv;
import o.C6273fK2;
import o.C6528gK2;
import o.C9811tl1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5940dy1;
import o.InterfaceFutureC8411o11;
import o.JT;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC5056aJ2
@InterfaceC5940dy1
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class zzcga extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcfb {
    public static final /* synthetic */ int X1 = 0;
    public boolean A1;
    public zzbfu B1;
    public zzbfs C1;
    public zzbah D1;
    public int E1;
    public int F1;
    public zzbdh G1;
    public final zzbdh H1;
    public zzbdh I1;
    public final zzbdi J1;
    public int K1;
    public com.google.android.gms.ads.internal.overlay.zzm L1;
    public boolean M1;
    public final com.google.android.gms.ads.internal.util.zzck N1;
    public int O1;
    public int P1;
    public int Q1;
    public int R1;
    public int S1;
    public Map T1;
    public final WindowManager U1;
    public final zzbbt V1;
    public boolean W1;
    public final zzcgu Y0;
    public final zzavl Z0;
    public final zzfct a1;
    public final zzbec b1;
    public final VersionInfoParcel c1;
    public com.google.android.gms.ads.internal.zzn d1;
    public final com.google.android.gms.ads.internal.zza e1;
    public final DisplayMetrics f1;
    public final float g1;
    public zzfbu h1;
    public zzfbx i1;
    public boolean j1;
    public boolean k1;
    public zzcfj l1;
    public com.google.android.gms.ads.internal.overlay.zzm m1;
    public zzeda n1;
    public zzecy o1;
    public zzcgv p1;
    public final String q1;
    public boolean r1;
    public boolean s1;
    public boolean t1;
    public boolean u1;
    public Boolean v1;
    public boolean w1;
    public final String x1;
    public zzcgd y1;
    public boolean z1;

    @InterfaceC5056aJ2
    public zzcga(zzcgu zzcguVar, zzcgv zzcgvVar, String str, boolean z, boolean z2, zzavl zzavlVar, zzbec zzbecVar, VersionInfoParcel versionInfoParcel, zzbdk zzbdkVar, com.google.android.gms.ads.internal.zzn zznVar, com.google.android.gms.ads.internal.zza zzaVar, zzbbt zzbbtVar, zzfbu zzfbuVar, zzfbx zzfbxVar, zzfct zzfctVar) {
        super(zzcguVar);
        zzfbx zzfbxVar2;
        this.j1 = false;
        this.k1 = false;
        this.w1 = true;
        this.x1 = "";
        this.O1 = -1;
        this.P1 = -1;
        this.Q1 = -1;
        this.R1 = -1;
        this.S1 = -1;
        this.Y0 = zzcguVar;
        this.p1 = zzcgvVar;
        this.q1 = str;
        this.t1 = z;
        this.Z0 = zzavlVar;
        this.a1 = zzfctVar;
        this.b1 = zzbecVar;
        this.c1 = versionInfoParcel;
        this.d1 = zznVar;
        this.e1 = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.U1 = windowManager;
        com.google.android.gms.ads.internal.zzv.v();
        DisplayMetrics a0 = com.google.android.gms.ads.internal.util.zzs.a0(windowManager);
        this.f1 = a0;
        this.g1 = a0.density;
        this.V1 = zzbbtVar;
        this.h1 = zzfbuVar;
        this.i1 = zzfbxVar;
        this.N1 = new com.google.android.gms.ads.internal.util.zzck(zzcguVar.a(), this, this, null);
        this.W1 = false;
        setBackgroundColor(0);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Sb)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        final WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Rb)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.td)).booleanValue()) {
            settings.setGeolocationEnabled(false);
        }
        settings.setUserAgentString(com.google.android.gms.ads.internal.zzv.v().I(zzcguVar, versionInfoParcel.X));
        com.google.android.gms.ads.internal.zzv.v();
        final Context context = getContext();
        com.google.android.gms.ads.internal.util.zzcd.a(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfrl zzfrlVar = zzs.l;
                String absolutePath = context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings = settings;
                webSettings.setDatabasePath(absolutePath);
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Z0)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        F1();
        addJavascriptInterface(new zzcgh(this, new zzcgg(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        N1();
        zzbdi zzbdiVar = new zzbdi(new zzbdk(true, "make_wv", this.q1));
        this.J1 = zzbdiVar;
        zzbdiVar.a().c(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.c2)).booleanValue() && (zzfbxVar2 = this.i1) != null && zzfbxVar2.b != null) {
            zzbdiVar.a().d("gqi", this.i1.b);
        }
        zzbdiVar.a();
        zzbdh f = zzbdk.f();
        this.H1 = f;
        zzbdiVar.b("native:view_create", f);
        this.I1 = null;
        this.G1 = null;
        com.google.android.gms.ads.internal.util.zzcg.a().b(zzcguVar);
        com.google.android.gms.ads.internal.zzv.t().u();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzcbw
    public final synchronized void A(zzcgd zzcgdVar) {
        if (this.y1 != null) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.d("Attempt to create multiple AdWebViewVideoControllers.");
            return;
        }
        this.y1 = zzcgdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized void A0(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar;
        int i = this.E1;
        int i2 = 1;
        if (true != z) {
            i2 = -1;
        }
        int i3 = i + i2;
        this.E1 = i3;
        if (i3 <= 0 && (zzmVar = this.m1) != null) {
            zzmVar.h0();
        }
    }

    public final synchronized void A1(String str, ValueCallback valueCallback) {
        if (!L()) {
            evaluateJavascript(str, null);
            return;
        }
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.g("#004 The webview is destroyed. Ignoring action.");
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final synchronized void B() {
        zzbfs zzbfsVar = this.C1;
        if (zzbfsVar != null) {
            final zzdmt zzdmtVar = (zzdmt) zzbfsVar;
            com.google.android.gms.ads.internal.util.zzs.l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdmr
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdmt.this.f();
                    } catch (RemoteException e) {
                        int i = com.google.android.gms.ads.internal.util.zze.b;
                        com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void B0(String str, Predicate predicate) {
        zzcfj zzcfjVar = this.l1;
        if (zzcfjVar != null) {
            zzcfjVar.h(str, predicate);
        }
    }

    public final void B1(String str) {
        if (PlatformVersion.h()) {
            if (u1() == null) {
                O1();
            }
            if (u1().booleanValue()) {
                A1(str, null);
                return;
            } else {
                C1("javascript:".concat(str));
                return;
            }
        }
        C1("javascript:".concat(str));
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void C(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void C0(int i) {
    }

    public final synchronized void C1(String str) {
        if (!L()) {
            loadUrl(str);
            return;
        }
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.g("#004 The webview is destroyed. Ignoring action.");
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzcgo
    public final zzavl D() {
        return this.Z0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void D0(boolean z, long j) {
        String str;
        HashMap hashMap = new HashMap(2);
        if (true != z) {
            str = "0";
        } else {
            str = "1";
        }
        hashMap.put("success", str);
        hashMap.put("duration", Long.toString(j));
        q("onCacheAccessComplete", hashMap);
    }

    @InterfaceC5056aJ2
    public final void D1(Boolean bool) {
        synchronized (this) {
            this.v1 = bool;
        }
        com.google.android.gms.ads.internal.zzv.t().z(bool);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized void E(int i) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.m1;
        if (zzmVar != null) {
            zzmVar.X7(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final void E0(zzayt zzaytVar) {
        boolean z;
        synchronized (this) {
            z = zzaytVar.j;
            this.z1 = z;
        }
        I1(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
        if (r10.S1 != r9) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a3, code lost:
        if (r10.S1 != r9) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean E1() {
        int i;
        int i2;
        boolean z = false;
        if (this.l1.i0() || this.l1.q()) {
            com.google.android.gms.ads.internal.client.zzbb.b();
            DisplayMetrics displayMetrics = this.f1;
            int B = com.google.android.gms.ads.internal.util.client.zzf.B(displayMetrics, displayMetrics.widthPixels);
            com.google.android.gms.ads.internal.client.zzbb.b();
            int B2 = com.google.android.gms.ads.internal.util.client.zzf.B(displayMetrics, displayMetrics.heightPixels);
            Activity a = this.Y0.a();
            if (a != null && a.getWindow() != null) {
                com.google.android.gms.ads.internal.zzv.v();
                int[] r = com.google.android.gms.ads.internal.util.zzs.r(a);
                com.google.android.gms.ads.internal.client.zzbb.b();
                i = com.google.android.gms.ads.internal.util.client.zzf.B(displayMetrics, r[0]);
                com.google.android.gms.ads.internal.client.zzbb.b();
                i2 = com.google.android.gms.ads.internal.util.client.zzf.B(displayMetrics, r[1]);
            } else {
                i = B;
                i2 = B2;
            }
            com.google.android.gms.ads.internal.zzv.v();
            int rotation = this.U1.getDefaultDisplay().getRotation();
            if (this.P1 == B && this.O1 == B2 && this.Q1 == i && this.R1 == i2) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.h0)).booleanValue()) {
                }
            }
            if (this.P1 == B && this.O1 == B2) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.h0)).booleanValue()) {
                }
                this.P1 = B;
                this.O1 = B2;
                this.Q1 = i;
                this.R1 = i2;
                this.S1 = rotation;
                new zzbsp(this, "").e(B, B2, i, i2, displayMetrics.density, rotation);
                return z;
            }
            z = true;
            this.P1 = B;
            this.O1 = B2;
            this.Q1 = i;
            this.R1 = i2;
            this.S1 = rotation;
            new zzbsp(this, "").e(B, B2, i, i2, displayMetrics.density, rotation);
            return z;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzces
    public final zzfbu F() {
        return this.h1;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized boolean F0() {
        return this.r1;
    }

    public final synchronized void F1() {
        zzfbu zzfbuVar = this.h1;
        if (zzfbuVar != null && zzfbuVar.m0) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.b("Disabling hardware acceleration on an overlay.");
            H1();
            return;
        }
        if (!this.t1 && !this.p1.i()) {
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.b("Enabling hardware acceleration on an AdView.");
            J1();
            return;
        }
        int i3 = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.b("Enabling hardware acceleration on an overlay.");
        J1();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized zzbfu G() {
        return this.B1;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized boolean G0() {
        return this.w1;
    }

    public final synchronized void G1() {
        if (!this.M1) {
            this.M1 = true;
            com.google.android.gms.ads.internal.zzv.t().s();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzcgn
    public final synchronized zzcgv H() {
        return this.p1;
    }

    public final synchronized void H1() {
        try {
            if (!this.u1) {
                setLayerType(1, null);
            }
            this.u1 = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzcge
    public final zzfbx I() {
        return this.i1;
    }

    public final void I1(boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        if (true != z) {
            str = "0";
        } else {
            str = "1";
        }
        hashMap.put("isVisible", str);
        q("onAdVisibilityChanged", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm J() {
        return this.m1;
    }

    public final synchronized void J1() {
        try {
            if (this.u1) {
                setLayerType(0, null);
            }
            this.u1 = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm K() {
        return this.L1;
    }

    public final synchronized void K1(String str) {
        try {
            com.google.android.gms.ads.internal.util.zzs.l.post(new Runnable("about:blank") { // from class: com.google.android.gms.internal.ads.zzcfv
                public final /* synthetic */ String Y = "about:blank";

                @Override // java.lang.Runnable
                public final void run() {
                    zzcga zzcgaVar = zzcga.this;
                    String str2 = this.Y;
                    super/*android.webkit.WebView*/.loadUrl("about:blank");
                }
            });
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzv.t().x(th, "AdWebViewImpl.loadUrlUnsafe");
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.h("Could not call loadUrl in destroy(). ", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized boolean L() {
        return this.s1;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized void L0(boolean z) {
        this.w1 = z;
    }

    public final void L1() {
        zzbdc.a(this.J1.a(), this.H1, "aeh2");
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final /* synthetic */ zzcgt M() {
        return this.l1;
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void M0() {
        com.google.android.gms.ads.internal.zzn zznVar = this.d1;
        if (zznVar != null) {
            zznVar.M0();
        }
    }

    public final synchronized void M1() {
        try {
            Map map = this.T1;
            if (map != null) {
                for (zzcdi zzcdiVar : map.values()) {
                    zzcdiVar.g();
                }
            }
            this.T1 = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final WebView N() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcgl
    public final void N0(boolean z, int i, String str, boolean z2, boolean z3) {
        this.l1.a(z, i, str, z2, z3);
    }

    public final void N1() {
        zzbdi zzbdiVar = this.J1;
        if (zzbdiVar != null) {
            zzbdk a = zzbdiVar.a();
            zzbda h = com.google.android.gms.ads.internal.zzv.t().h();
            if (h != null) {
                h.f(a);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized zzbah O() {
        return this.D1;
    }

    public final synchronized void O1() {
        Boolean m = com.google.android.gms.ads.internal.zzv.t().m();
        this.v1 = m;
        if (m == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                D1(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                D1(Boolean.FALSE);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final WebViewClient P() {
        return this.l1;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void P0(Context context) {
        zzcgu zzcguVar = this.Y0;
        zzcguVar.setBaseContext(context);
        this.N1.e(zzcguVar.a());
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final synchronized void Q(int i) {
        this.K1 = i;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void Q0() {
        com.google.android.gms.ads.internal.overlay.zzm J = J();
        if (J != null) {
            J.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void R(boolean z) {
        this.l1.E0(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized zzecy T() {
        return this.o1;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzcgq
    public final View U() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized void V() {
        com.google.android.gms.ads.internal.util.zze.k("Destroying WebView!");
        G1();
        com.google.android.gms.ads.internal.util.zzs.l.post(new zzcfz(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized void V0(zzbah zzbahVar) {
        this.D1 = zzbahVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void W() {
        com.google.android.gms.ads.internal.util.zze.k("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.zzcgl
    public final void W0(boolean z, int i, String str, String str2, boolean z2) {
        this.l1.c1(z, i, str, str2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized String X() {
        return this.q1;
    }

    @Override // com.google.android.gms.internal.ads.zzddy
    public final void X0() {
        zzcfj zzcfjVar = this.l1;
        if (zzcfjVar != null) {
            zzcfjVar.X0();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void Y() {
        if (this.I1 == null) {
            zzbdi zzbdiVar = this.J1;
            zzbdiVar.a();
            zzbdh f = zzbdk.f();
            this.I1 = f;
            zzbdiVar.b("native:view_load", f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void Y0(zzfbu zzfbuVar, zzfbx zzfbxVar) {
        this.h1 = zzfbuVar;
        this.i1 = zzfbxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void Z() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void Z0(int i) {
        if (i == 0) {
            zzbdi zzbdiVar = this.J1;
            zzbdc.a(zzbdiVar.a(), this.H1, "aebb2");
        }
        L1();
        zzbdi zzbdiVar2 = this.J1;
        zzbdiVar2.a();
        zzbdiVar2.a().d("close_type", String.valueOf(i));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.c1.X);
        q("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final void a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        String sb2 = sb.toString();
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.b("Dispatching AFMA event: ".concat(sb2));
        B1(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void a0(boolean z) {
        this.l1.c(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized void a1(zzbfs zzbfsVar) {
        this.C1 = zzbfsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgl
    public final void b(boolean z, int i, boolean z2) {
        this.l1.Q0(z, i, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void b0() {
        this.N1.b();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized void b1(zzcgv zzcgvVar) {
        this.p1 = zzcgvVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void c0() {
        if (this.G1 == null) {
            zzbdi zzbdiVar = this.J1;
            zzbdc.a(zzbdiVar.a(), this.H1, "aes2");
            zzbdiVar.a();
            zzbdh f = zzbdk.f();
            this.G1 = f;
            zzbdiVar.b("native:view_show", f);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.c1.X);
        q("onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final void c1(String str, JSONObject jSONObject) {
        u(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized zzeda d0() {
        return this.n1;
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void d1() {
        com.google.android.gms.ads.internal.zzn zznVar = this.d1;
        if (zznVar != null) {
            zznVar.d1();
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfb
    public final synchronized void destroy() {
        try {
            N1();
            this.N1.a();
            com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.m1;
            if (zzmVar != null) {
                zzmVar.b();
                this.m1.m();
                this.m1 = null;
            }
            this.n1 = null;
            this.o1 = null;
            this.l1.D0();
            this.D1 = null;
            this.d1 = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.s1) {
                return;
            }
            com.google.android.gms.ads.internal.zzv.a().h(this);
            M1();
            this.s1 = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.cb)).booleanValue()) {
                Activity a = this.Y0.a();
                if (a != null && a.isDestroyed()) {
                    com.google.android.gms.ads.internal.util.zze.k("Destroying the WebView immediately...");
                    V();
                    return;
                }
                com.google.android.gms.ads.internal.util.zze.k("Initiating WebView self destruct sequence in 3...");
                com.google.android.gms.ads.internal.util.zze.k("Loading blank page in WebView, 2...");
                K1("about:blank");
                return;
            }
            com.google.android.gms.ads.internal.util.zze.k("Destroying the WebView immediately...");
            V();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final synchronized int e() {
        return this.K1;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void e0() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(com.google.android.gms.ads.internal.zzv.x().e()));
        hashMap.put("app_volume", String.valueOf(com.google.android.gms.ads.internal.zzv.x().a()));
        hashMap.put("device_volume", String.valueOf(com.google.android.gms.ads.internal.util.zzab.b(getContext())));
        q("volume", hashMap);
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(final String str, final ValueCallback valueCallback) {
        if (L()) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.i("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.db)).booleanValue() && Looper.getMainLooper().getThread() != Thread.currentThread()) {
            zzcaa.f.f0(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfu
                @Override // java.lang.Runnable
                public final void run() {
                    super/*android.webkit.WebView*/.evaluateJavascript(str, valueCallback);
                }
            });
        } else {
            super.evaluateJavascript(str, valueCallback);
        }
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.s1) {
                    this.l1.D0();
                    com.google.android.gms.ads.internal.zzv.a().h(this);
                    M1();
                    G1();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final int g() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void g0(boolean z) {
        this.W1 = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final int h() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final Context h0() {
        return this.Y0.b();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized void h1(String str, String str2, String str3) {
        Throwable th;
        String str4;
        try {
            try {
                if (!L()) {
                    String str5 = (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.e0);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        try {
                            jSONObject.put("version", str5);
                            jSONObject.put("sdk", "Google Mobile Ads");
                            jSONObject.put(RemoteConfigConstants.RequestFieldKey.e0, "12.4.51-000");
                            str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                        } catch (JSONException e) {
                            int i = com.google.android.gms.ads.internal.util.zze.b;
                            com.google.android.gms.ads.internal.util.client.zzo.h("Unable to build MRAID_ENV", e);
                            str4 = null;
                        }
                        super.loadDataWithBaseURL(str, zzcgm.b(str2, str4), "text/html", "UTF-8", null);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                int i2 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.g("#004 The webview is destroyed. Ignoring action.");
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzcgi, com.google.android.gms.internal.ads.zzcbw
    public final Activity i() {
        return this.Y0.a();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final List i0() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void i1(String str, zzbjw zzbjwVar) {
        zzcfj zzcfjVar = this.l1;
        if (zzcfjVar != null) {
            zzcfjVar.g(str, zzbjwVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzcbw
    public final com.google.android.gms.ads.internal.zza j() {
        return this.e1;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized boolean j0() {
        return this.t1;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized void j1(zzecy zzecyVar) {
        this.o1 = zzecyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final zzbdh k() {
        return this.H1;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized boolean k0() {
        return this.E1 > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcgl
    public final void k1(String str, String str2, int i) {
        this.l1.N0(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzcbw
    public final zzbdi l() {
        return this.J1;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void l0() {
        L1();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.c1.X);
        q("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized void l1(boolean z) {
        String str;
        try {
            boolean z2 = this.t1;
            this.t1 = z;
            F1();
            if (z != z2) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.f0)).booleanValue()) {
                    if (!this.p1.i()) {
                    }
                }
                zzbsp zzbspVar = new zzbsp(this, "");
                if (true != z) {
                    str = JT.d;
                } else {
                    str = "expanded";
                }
                zzbspVar.g(str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfb
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!L()) {
            super.loadData(str, str2, str3);
            return;
        }
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.g("#004 The webview is destroyed. Ignoring action.");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfb
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        try {
            try {
                if (!L()) {
                    super.loadDataWithBaseURL(str, str2, str3, str4, str5);
                    return;
                }
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.g("#004 The webview is destroyed. Ignoring action.");
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfb
    public final synchronized void loadUrl(final String str) {
        if (!L()) {
            com.google.android.gms.ads.internal.util.zzs.l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfx
                @Override // java.lang.Runnable
                public final void run() {
                    super/*android.webkit.WebView*/.loadUrl(str);
                }
            });
            return;
        }
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.g("#004 The webview is destroyed. Ignoring action.");
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzcgp, com.google.android.gms.internal.ads.zzcbw
    public final VersionInfoParcel m() {
        return this.c1;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized void m0(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.L1 = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final zzcbl n() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized void n0(boolean z) {
        if (z) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.m1;
        if (zzmVar != null) {
            zzmVar.Y7(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgl
    public final void n1(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z, boolean z2, String str) {
        this.l1.M0(zzcVar, z, z2, str);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            if (!L()) {
                this.N1.c();
            }
            if (this.W1) {
                onResume();
                this.W1 = false;
            }
            boolean z = this.z1;
            zzcfj zzcfjVar = this.l1;
            if (zzcfjVar != null && zzcfjVar.q()) {
                if (!this.A1) {
                    this.l1.w();
                    this.l1.S();
                    this.A1 = true;
                }
                E1();
                z = true;
            }
            I1(z);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        zzcfj zzcfjVar;
        synchronized (this) {
            try {
                if (!L()) {
                    this.N1.d();
                }
                super.onDetachedFromWindow();
                if (this.A1 && (zzcfjVar = this.l1) != null && zzcfjVar.q() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    this.l1.w();
                    this.l1.S();
                    this.A1 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        I1(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.rb)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            com.google.android.gms.ads.internal.zzv.v();
            com.google.android.gms.ads.internal.util.zzs.u(getContext(), intent);
        } catch (ActivityNotFoundException e) {
            String str5 = "Couldn't find an Activity to view url/mimetype: " + str + " / " + str4;
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.b(str5);
            com.google.android.gms.ads.internal.zzv.t().x(e, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (L()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue <= 0.0f || canScrollVertically(-1)) {
                if (axisValue >= 0.0f || canScrollVertically(1)) {
                    if (axisValue2 <= 0.0f || canScrollHorizontally(-1)) {
                        if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean E1 = E1();
        com.google.android.gms.ads.internal.overlay.zzm J = J();
        if (J != null && E1) {
            J.n();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01c0 A[Catch: all -> 0x000d, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:10:0x0010, B:12:0x0016, B:14:0x001a, B:17:0x0024, B:19:0x002c, B:22:0x0031, B:24:0x0039, B:26:0x004b, B:29:0x0050, B:31:0x0057, B:35:0x0061, B:38:0x0066, B:41:0x0077, B:49:0x008f, B:43:0x007e, B:46:0x0083, B:52:0x009c, B:54:0x00a4, B:56:0x00b6, B:59:0x00bb, B:61:0x00d7, B:63:0x00df, B:62:0x00db, B:66:0x00e4, B:68:0x00ec, B:71:0x00f7, B:80:0x011b, B:82:0x0122, B:86:0x0129, B:88:0x013b, B:90:0x0149, B:94:0x0156, B:97:0x015b, B:99:0x01a8, B:100:0x01ac, B:102:0x01b3, B:107:0x01c0, B:109:0x01c6, B:110:0x01c9, B:112:0x01cd, B:113:0x01d6, B:116:0x01e1), top: B:121:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013b A[Catch: all -> 0x000d, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:10:0x0010, B:12:0x0016, B:14:0x001a, B:17:0x0024, B:19:0x002c, B:22:0x0031, B:24:0x0039, B:26:0x004b, B:29:0x0050, B:31:0x0057, B:35:0x0061, B:38:0x0066, B:41:0x0077, B:49:0x008f, B:43:0x007e, B:46:0x0083, B:52:0x009c, B:54:0x00a4, B:56:0x00b6, B:59:0x00bb, B:61:0x00d7, B:63:0x00df, B:62:0x00db, B:66:0x00e4, B:68:0x00ec, B:71:0x00f7, B:80:0x011b, B:82:0x0122, B:86:0x0129, B:88:0x013b, B:90:0x0149, B:94:0x0156, B:97:0x015b, B:99:0x01a8, B:100:0x01ac, B:102:0x01b3, B:107:0x01c0, B:109:0x01c6, B:110:0x01c9, B:112:0x01cd, B:113:0x01d6, B:116:0x01e1), top: B:121:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015b A[Catch: all -> 0x000d, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:10:0x0010, B:12:0x0016, B:14:0x001a, B:17:0x0024, B:19:0x002c, B:22:0x0031, B:24:0x0039, B:26:0x004b, B:29:0x0050, B:31:0x0057, B:35:0x0061, B:38:0x0066, B:41:0x0077, B:49:0x008f, B:43:0x007e, B:46:0x0083, B:52:0x009c, B:54:0x00a4, B:56:0x00b6, B:59:0x00bb, B:61:0x00d7, B:63:0x00df, B:62:0x00db, B:66:0x00e4, B:68:0x00ec, B:71:0x00f7, B:80:0x011b, B:82:0x0122, B:86:0x0129, B:88:0x013b, B:90:0x0149, B:94:0x0156, B:97:0x015b, B:99:0x01a8, B:100:0x01ac, B:102:0x01b3, B:107:0x01c0, B:109:0x01c6, B:110:0x01c9, B:112:0x01cd, B:113:0x01d6, B:116:0x01e1), top: B:121:0x0001 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    @SuppressLint({"DrawAllocation"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void onMeasure(int i, int i2) {
        int i3;
        zzcgv zzcgvVar;
        boolean z;
        boolean z2;
        int size;
        float f;
        int i4;
        int i5;
        int i6 = 0;
        if (L()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.t1 && !this.p1.f()) {
            if (this.p1.h()) {
                super.onMeasure(i, i2);
                return;
            } else if (this.p1.j()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.f4)).booleanValue()) {
                    super.onMeasure(i, i2);
                    return;
                }
                zzcgd r = r();
                if (r != null) {
                    f = r.d();
                } else {
                    f = 0.0f;
                }
                if (f == 0.0f) {
                    super.onMeasure(i, i2);
                    return;
                }
                int size2 = View.MeasureSpec.getSize(i);
                int size3 = View.MeasureSpec.getSize(i2);
                float f2 = size3 * f;
                int i7 = (int) (size2 / f);
                if (size3 == 0) {
                    if (i7 != 0) {
                        i5 = (int) (i7 * f);
                        i6 = size2;
                        i4 = i7;
                        setMeasuredDimension(Math.min(i5, i6), Math.min(i7, i4));
                        return;
                    }
                    size3 = 0;
                }
                int i8 = (int) f2;
                if (size2 == 0) {
                    if (i8 != 0) {
                        i7 = (int) (i8 / f);
                        i4 = size3;
                        i5 = i8;
                        i6 = i5;
                        setMeasuredDimension(Math.min(i5, i6), Math.min(i7, i4));
                        return;
                    }
                } else {
                    i6 = size2;
                }
                i4 = size3;
                i5 = i8;
                setMeasuredDimension(Math.min(i5, i6), Math.min(i7, i4));
                return;
            } else if (this.p1.g()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.k4)).booleanValue()) {
                    super.onMeasure(i, i2);
                    return;
                }
                r1("/contentHeight", new zzcfy(this));
                B1("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                float f3 = this.f1.density;
                int size4 = View.MeasureSpec.getSize(i);
                int i9 = this.F1;
                if (i9 != -1) {
                    size = (int) (i9 * f3);
                } else {
                    size = View.MeasureSpec.getSize(i2);
                }
                setMeasuredDimension(size4, size);
                return;
            } else if (this.p1.i()) {
                DisplayMetrics displayMetrics = this.f1;
                setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
                return;
            } else {
                int mode = View.MeasureSpec.getMode(i);
                int size5 = View.MeasureSpec.getSize(i);
                int mode2 = View.MeasureSpec.getMode(i2);
                int size6 = View.MeasureSpec.getSize(i2);
                int i10 = Integer.MAX_VALUE;
                if (mode != Integer.MIN_VALUE && mode != 1073741824) {
                    i3 = Integer.MAX_VALUE;
                    if (mode2 != Integer.MIN_VALUE || mode2 == 1073741824) {
                        i10 = size6;
                    }
                    zzcgvVar = this.p1;
                    if (zzcgvVar.c <= i3 || zzcgvVar.b > i10) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.J5)).booleanValue()) {
                        zzcgv zzcgvVar2 = this.p1;
                        float f4 = this.g1;
                        if (zzcgvVar2.c / f4 <= i3 / f4 && zzcgvVar2.b / f4 <= i10 / f4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z &= z2;
                    }
                    if (!z) {
                        zzcgv zzcgvVar3 = this.p1;
                        float f5 = this.g1;
                        String str = "Not enough space to show ad. Needs " + ((int) (zzcgvVar3.c / f5)) + "x" + ((int) (zzcgvVar3.b / f5)) + " dp, but only has " + ((int) (size5 / f5)) + "x" + ((int) (size6 / f5)) + " dp.";
                        int i11 = com.google.android.gms.ads.internal.util.zze.b;
                        com.google.android.gms.ads.internal.util.client.zzo.g(str);
                        if (getVisibility() != 8) {
                            setVisibility(4);
                        }
                        setMeasuredDimension(0, 0);
                        if (!this.j1) {
                            this.V1.c(C3197Hv.e1);
                            this.j1 = true;
                            return;
                        }
                        return;
                    }
                    if (getVisibility() != 8) {
                        setVisibility(0);
                    }
                    if (!this.k1) {
                        this.V1.c(C3197Hv.f1);
                        this.k1 = true;
                    }
                    zzcgv zzcgvVar4 = this.p1;
                    setMeasuredDimension(zzcgvVar4.c, zzcgvVar4.b);
                    return;
                }
                i3 = size5;
                if (mode2 != Integer.MIN_VALUE) {
                }
                i10 = size6;
                zzcgvVar = this.p1;
                if (zzcgvVar.c <= i3) {
                }
                z = true;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.J5)).booleanValue()) {
                }
                if (!z) {
                }
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfb
    public final void onPause() {
        if (!L()) {
            try {
                super.onPause();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Qc)).booleanValue() && C6528gK2.a("MUTE_AUDIO")) {
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.b("Muting webview");
                    C6273fK2.x(this, true);
                }
            } catch (Exception e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.e("Could not pause webview.", e);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Tc)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzv.t().x(e, "AdWebViewImpl.onPause");
                }
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfb
    public final void onResume() {
        if (!L()) {
            try {
                super.onResume();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Qc)).booleanValue() && C6528gK2.a("MUTE_AUDIO")) {
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.b("Unmuting webview");
                    C6273fK2.x(this, false);
                }
            } catch (Exception e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.e("Could not resume webview.", e);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Tc)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzv.t().x(e, "AdWebViewImpl.onResume");
                }
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.N3)).booleanValue() && this.l1.k()) {
            z = true;
        } else {
            z = false;
        }
        if ((this.l1.q() && !this.l1.n()) || z) {
            synchronized (this) {
                try {
                    zzbfu zzbfuVar = this.B1;
                    if (zzbfuVar != null) {
                        zzbfuVar.d(motionEvent);
                    }
                } finally {
                }
            }
        } else {
            zzavl zzavlVar = this.Z0;
            if (zzavlVar != null) {
                zzavlVar.d(motionEvent);
            }
            zzbec zzbecVar = this.b1;
            if (zzbecVar != null) {
                zzbecVar.b(motionEvent);
            }
        }
        if (L()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final synchronized zzcdi p0(String str) {
        Map map = this.T1;
        if (map == null) {
            return null;
        }
        return (zzcdi) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized void p1(zzbfu zzbfuVar) {
        this.B1 = zzbfuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final void q(String str, Map map) {
        try {
            a(str, com.google.android.gms.ads.internal.client.zzbb.b().p(map));
        } catch (JSONException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized void q0(zzeda zzedaVar) {
        this.n1 = zzedaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized void q1(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.m1 = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzcbw
    public final synchronized zzcgd r() {
        return this.y1;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void r1(String str, zzbjw zzbjwVar) {
        zzcfj zzcfjVar = this.l1;
        if (zzcfjVar != null) {
            zzcfjVar.b(str, zzbjwVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final synchronized String s() {
        return this.x1;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final zzfct s0() {
        return this.a1;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized void s1(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.m1;
        if (zzmVar != null) {
            zzmVar.h8(this.l1.i0(), z);
        } else {
            this.r1 = z;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfb
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzcfj) {
            this.l1 = (zzcfj) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (L()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Could not stop loading webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddy
    public final void t() {
        zzcfj zzcfjVar = this.l1;
        if (zzcfjVar != null) {
            zzcfjVar.t();
        }
    }

    public final zzcfj t1() {
        return this.l1;
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final void u(String str, String str2) {
        B1(str + C9811tl1.c + str2 + ");");
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final InterfaceFutureC8411o11 u0() {
        zzbec zzbecVar = this.b1;
        if (zzbecVar == null) {
            return zzgcy.h(null);
        }
        return zzbecVar.a();
    }

    @InterfaceC5056aJ2
    public final synchronized Boolean u1() {
        return this.v1;
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final void w(String str) {
        B1(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final boolean w0(final boolean z, final int i) {
        destroy();
        zzbbs zzbbsVar = new zzbbs() { // from class: com.google.android.gms.internal.ads.zzcfw
            @Override // com.google.android.gms.internal.ads.zzbbs
            public final void a(zzbca.zzt.zza zzaVar) {
                int i2 = zzcga.X1;
                zzbca.zzbl.zza w2 = zzbca.zzbl.w2();
                boolean e = w2.e();
                boolean z2 = z;
                if (e != z2) {
                    w2.a2(z2);
                }
                w2.b2(i);
                zzaVar.B2(w2.V1());
            }
        };
        zzbbt zzbbtVar = this.V1;
        zzbbtVar.b(zzbbsVar);
        zzbbtVar.c(10003);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final synchronized String x() {
        zzfbx zzfbxVar = this.i1;
        if (zzfbxVar != null) {
            return zzfbxVar.b;
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void y() {
        zzcfj zzcfjVar = this.l1;
        if (zzcfjVar != null) {
            zzcfjVar.y();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void y0(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzcbw
    public final synchronized void z(String str, zzcdi zzcdiVar) {
        try {
            if (this.T1 == null) {
                this.T1 = new HashMap();
            }
            this.T1.put(str, zzcdiVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final boolean z0() {
        return false;
    }
}
