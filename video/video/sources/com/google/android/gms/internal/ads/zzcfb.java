package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import java.util.List;
import o.InterfaceC5940dy1;
import o.InterfaceFutureC8411o11;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public interface zzcfb extends com.google.android.gms.ads.internal.client.zza, zzddy, zzces, zzbmr, zzcge, zzcgi, zzbnd, zzayu, zzcgl, com.google.android.gms.ads.internal.zzn, zzcgo, zzcgp, zzcbw, zzcgq {
    @Override // com.google.android.gms.internal.ads.zzcbw
    void A(zzcgd zzcgdVar);

    void A0(boolean z);

    void B0(String str, Predicate predicate);

    @Override // com.google.android.gms.internal.ads.zzcgo
    zzavl D();

    void E(int i);

    @Override // com.google.android.gms.internal.ads.zzces
    zzfbu F();

    boolean F0();

    zzbfu G();

    boolean G0();

    @Override // com.google.android.gms.internal.ads.zzcgn
    zzcgv H();

    @Override // com.google.android.gms.internal.ads.zzcge
    zzfbx I();

    com.google.android.gms.ads.internal.overlay.zzm J();

    com.google.android.gms.ads.internal.overlay.zzm K();

    boolean L();

    void L0(boolean z);

    zzcgt M();

    WebView N();

    zzbah O();

    WebViewClient P();

    void P0(Context context);

    void R(boolean z);

    zzecy T();

    @Override // com.google.android.gms.internal.ads.zzcgq
    View U();

    void V();

    void V0(zzbah zzbahVar);

    void W();

    String X();

    void Y();

    void Y0(zzfbu zzfbuVar, zzfbx zzfbxVar);

    void Z();

    void Z0(int i);

    void a1(zzbfs zzbfsVar);

    void b0();

    void b1(zzcgv zzcgvVar);

    void c0();

    boolean canGoBack();

    zzeda d0();

    void destroy();

    void e0();

    void g0(boolean z);

    @Override // com.google.android.gms.internal.ads.zzcgi, com.google.android.gms.internal.ads.zzcbw
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    Context h0();

    void h1(String str, String str2, String str3);

    @Override // com.google.android.gms.internal.ads.zzcgi, com.google.android.gms.internal.ads.zzcbw
    Activity i();

    List i0();

    void i1(String str, zzbjw zzbjwVar);

    boolean isAttachedToWindow();

    @Override // com.google.android.gms.internal.ads.zzcbw
    com.google.android.gms.ads.internal.zza j();

    boolean j0();

    void j1(zzecy zzecyVar);

    boolean k0();

    @Override // com.google.android.gms.internal.ads.zzcbw
    zzbdi l();

    void l0();

    void l1(boolean z);

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    @Override // com.google.android.gms.internal.ads.zzcgp, com.google.android.gms.internal.ads.zzcbw
    VersionInfoParcel m();

    void m0(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    void measure(int i, int i2);

    void n0(boolean z);

    void onPause();

    void onResume();

    void p1(zzbfu zzbfuVar);

    void q0(zzeda zzedaVar);

    void q1(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    @Override // com.google.android.gms.internal.ads.zzcbw
    zzcgd r();

    void r1(String str, zzbjw zzbjwVar);

    zzfct s0();

    void s1(boolean z);

    @Override // com.google.android.gms.internal.ads.zzcbw
    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    InterfaceFutureC8411o11 u0();

    boolean w0(boolean z, int i);

    @Override // com.google.android.gms.internal.ads.zzcbw
    void z(String str, zzcdi zzcdiVar);

    boolean z0();
}
