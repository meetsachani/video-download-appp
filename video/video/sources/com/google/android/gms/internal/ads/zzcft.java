package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcft extends FrameLayout implements zzcfb {
    public final zzcfb Y0;
    public final zzcbl Z0;
    public final AtomicBoolean a1;

    public zzcft(zzcfb zzcfbVar, @InterfaceC11300zs1 zzdsd zzdsdVar) {
        super(zzcfbVar.getContext());
        this.a1 = new AtomicBoolean();
        this.Y0 = zzcfbVar;
        this.Z0 = new zzcbl(zzcfbVar.h0(), this, this, zzdsdVar);
        addView((View) zzcfbVar);
    }

    public static /* synthetic */ void o1(zzcft zzcftVar, boolean z) {
        zzcfb zzcfbVar = zzcftVar.Y0;
        zzfrl zzfrlVar = com.google.android.gms.ads.internal.util.zzs.l;
        Objects.requireNonNull(zzcfbVar);
        zzfrlVar.post(new zzcfp(zzcfbVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzcbw
    public final void A(zzcgd zzcgdVar) {
        this.Y0.A(zzcgdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void A0(boolean z) {
        this.Y0.A0(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void B() {
        this.Y0.B();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void B0(String str, Predicate predicate) {
        this.Y0.B0(str, predicate);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void C(int i) {
        this.Z0.g(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void C0(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzcgo
    public final zzavl D() {
        return this.Y0.D();
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void D0(boolean z, long j) {
        this.Y0.D0(z, j);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void E(int i) {
        this.Y0.E(i);
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final void E0(zzayt zzaytVar) {
        this.Y0.E0(zzaytVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzces
    public final zzfbu F() {
        return this.Y0.F();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final boolean F0() {
        return this.Y0.F0();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    @InterfaceC11300zs1
    public final zzbfu G() {
        return this.Y0.G();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final boolean G0() {
        return this.Y0.G0();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzcgn
    public final zzcgv H() {
        return this.Y0.H();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzcge
    public final zzfbx I() {
        return this.Y0.I();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final com.google.android.gms.ads.internal.overlay.zzm J() {
        return this.Y0.J();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final com.google.android.gms.ads.internal.overlay.zzm K() {
        return this.Y0.K();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final boolean L() {
        return this.Y0.L();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void L0(boolean z) {
        this.Y0.L0(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final zzcgt M() {
        return ((zzcga) this.Y0).t1();
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final void M0() {
        this.Y0.M0();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final WebView N() {
        return (WebView) this.Y0;
    }

    @Override // com.google.android.gms.internal.ads.zzcgl
    public final void N0(boolean z, int i, String str, boolean z2, boolean z3) {
        this.Y0.N0(z, i, str, z2, z3);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final zzbah O() {
        return this.Y0.O();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final WebViewClient P() {
        return this.Y0.P();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void P0(Context context) {
        this.Y0.P0(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void Q(int i) {
        this.Y0.Q(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void Q0() {
        this.Y0.Q0();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void R(boolean z) {
        this.Y0.R(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final zzecy T() {
        return this.Y0.T();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzcgq
    public final View U() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void V() {
        this.Z0.e();
        this.Y0.V();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void V0(zzbah zzbahVar) {
        this.Y0.V0(zzbahVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void W() {
        zzeda d0;
        zzecy T;
        TextView textView = new TextView(getContext());
        com.google.android.gms.ads.internal.zzv.v();
        textView.setText(com.google.android.gms.ads.internal.util.zzs.f0());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.z5)).booleanValue() && (T = T()) != null) {
            T.a(textView);
        } else if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.y5)).booleanValue() && (d0 = d0()) != null && d0.b()) {
            com.google.android.gms.ads.internal.zzv.c().e(d0.a(), textView);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgl
    public final void W0(boolean z, int i, String str, String str2, boolean z2) {
        this.Y0.W0(z, i, str, str2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final String X() {
        return this.Y0.X();
    }

    @Override // com.google.android.gms.internal.ads.zzddy
    public final void X0() {
        zzcfb zzcfbVar = this.Y0;
        if (zzcfbVar != null) {
            zzcfbVar.X0();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void Y() {
        this.Y0.Y();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void Y0(zzfbu zzfbuVar, zzfbx zzfbxVar) {
        this.Y0.Y0(zzfbuVar, zzfbxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void Z() {
        setBackgroundColor(0);
        this.Y0.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void Z0(int i) {
        this.Y0.Z0(i);
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final void a(String str, JSONObject jSONObject) {
        this.Y0.a(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void a0(boolean z) {
        this.Y0.a0(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void a1(zzbfs zzbfsVar) {
        this.Y0.a1(zzbfsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgl
    public final void b(boolean z, int i, boolean z2) {
        this.Y0.b(z, i, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void b0() {
        this.Y0.b0();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void b1(zzcgv zzcgvVar) {
        this.Y0.b1(zzcgvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void c0() {
        this.Y0.c0();
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final void c1(String str, JSONObject jSONObject) {
        ((zzcga) this.Y0).u(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final boolean canGoBack() {
        return this.Y0.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final zzeda d0() {
        return this.Y0.d0();
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final void d1() {
        this.Y0.d1();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void destroy() {
        final zzecy T;
        final zzeda d0 = d0();
        if (d0 != null) {
            zzfrl zzfrlVar = com.google.android.gms.ads.internal.util.zzs.l;
            zzfrlVar.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfq
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.ads.internal.zzv.c().h(zzeda.this.a());
                }
            });
            zzcfb zzcfbVar = this.Y0;
            Objects.requireNonNull(zzcfbVar);
            zzfrlVar.postDelayed(new zzcfp(zzcfbVar), ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.x5)).intValue());
        } else if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.z5)).booleanValue() && (T = T()) != null) {
            com.google.android.gms.ads.internal.util.zzs.l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfr
                @Override // java.lang.Runnable
                public final void run() {
                    T.f(new zzcfs(zzcft.this));
                }
            });
        } else {
            this.Y0.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final int e() {
        return this.Y0.e();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void e0() {
        this.Y0.e0();
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final int g() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.g4)).booleanValue()) {
            return this.Y0.getMeasuredHeight();
        }
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void g0(boolean z) {
        this.Y0.g0(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void goBack() {
        this.Y0.goBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final int h() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.g4)).booleanValue()) {
            return this.Y0.getMeasuredWidth();
        }
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final Context h0() {
        return this.Y0.h0();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void h1(String str, String str2, @InterfaceC11300zs1 String str3) {
        this.Y0.h1(str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzcgi, com.google.android.gms.internal.ads.zzcbw
    @InterfaceC11300zs1
    public final Activity i() {
        return this.Y0.i();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final List i0() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != this.Y0) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void i1(String str, zzbjw zzbjwVar) {
        this.Y0.i1(str, zzbjwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzcbw
    public final com.google.android.gms.ads.internal.zza j() {
        return this.Y0.j();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final boolean j0() {
        return this.Y0.j0();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void j1(@InterfaceC11300zs1 zzecy zzecyVar) {
        this.Y0.j1(zzecyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final zzbdh k() {
        return this.Y0.k();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final boolean k0() {
        return this.Y0.k0();
    }

    @Override // com.google.android.gms.internal.ads.zzcgl
    public final void k1(String str, String str2, int i) {
        this.Y0.k1(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzcbw
    public final zzbdi l() {
        return this.Y0.l();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void l0() {
        this.Y0.l0();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void l1(boolean z) {
        this.Y0.l1(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void loadData(String str, String str2, String str3) {
        this.Y0.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.Y0.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void loadUrl(String str) {
        this.Y0.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzcgp, com.google.android.gms.internal.ads.zzcbw
    public final VersionInfoParcel m() {
        return this.Y0.m();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void m0(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.Y0.m0(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final zzcbl n() {
        return this.Z0;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void n0(boolean z) {
        this.Y0.n0(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcgl
    public final void n1(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z, boolean z2, String str) {
        this.Y0.n1(zzcVar, z, z2, str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void onPause() {
        this.Z0.f();
        this.Y0.onPause();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void onResume() {
        this.Y0.onResume();
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final zzcdi p0(String str) {
        return this.Y0.p0(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void p1(@InterfaceC11300zs1 zzbfu zzbfuVar) {
        this.Y0.p1(zzbfuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final void q(String str, Map map) {
        this.Y0.q(str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void q0(zzeda zzedaVar) {
        this.Y0.q0(zzedaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void q1(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.Y0.q1(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzcbw
    public final zzcgd r() {
        return this.Y0.r();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void r1(String str, zzbjw zzbjwVar) {
        this.Y0.r1(str, zzbjwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final String s() {
        return this.Y0.s();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final zzfct s0() {
        return this.Y0.s0();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void s1(boolean z) {
        this.Y0.s1(z);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcfb
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.Y0.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcfb
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.Y0.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.Y0.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.Y0.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.zzddy
    public final void t() {
        zzcfb zzcfbVar = this.Y0;
        if (zzcfbVar != null) {
            zzcfbVar.t();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final void u(String str, String str2) {
        this.Y0.u("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final InterfaceFutureC8411o11 u0() {
        return this.Y0.u0();
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final void w(String str) {
        ((zzcga) this.Y0).B1(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final boolean w0(boolean z, int i) {
        if (!this.a1.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.a1)).booleanValue()) {
            return false;
        }
        zzcfb zzcfbVar = this.Y0;
        if (zzcfbVar.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzcfbVar.getParent()).removeView((View) zzcfbVar);
        }
        zzcfbVar.w0(z, i);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final String x() {
        return this.Y0.x();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void y() {
        zzcfb zzcfbVar = this.Y0;
        if (zzcfbVar != null) {
            zzcfbVar.y();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void y0(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzcbw
    public final void z(String str, zzcdi zzcdiVar) {
        this.Y0.z(str, zzcdiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final boolean z0() {
        return this.a1.get();
    }
}
