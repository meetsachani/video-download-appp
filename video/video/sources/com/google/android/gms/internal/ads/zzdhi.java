package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import java.lang.ref.WeakReference;
import java.util.Map;
import o.C5738d80;
import o.C9998uW1;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5940dy1;
import org.json.JSONException;
import org.json.JSONObject;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public final class zzdhi implements zzdiw {
    public com.google.android.gms.ads.internal.client.zzdc C;
    public final zzcyd D;
    public final zzdjq E;
    @InterfaceC11300zs1
    public final com.google.android.gms.ads.internal.zzb F;
    public final Context a;
    public final zzdiz b;
    public final JSONObject c;
    public final zzdns d;
    public final zzdio e;
    public final zzavl f;
    public final zzcwl g;
    public final zzcvr h;
    public final zzddw i;
    public final zzfbu j;
    public final VersionInfoParcel k;
    public final zzfcp l;
    public final zzcnk m;
    public final zzdju n;

    /* renamed from: o */
    public final Clock f262o;
    public final zzdds p;
    public final zzfjr q;
    public final zzdpi r;
    public final zzfhn s;
    public final zzece t;
    public boolean v;
    public boolean u = false;
    public boolean w = false;
    public boolean x = false;
    public Point y = new Point();
    public Point z = new Point();
    public long A = 0;
    public long B = 0;

    public zzdhi(Context context, zzdiz zzdizVar, JSONObject jSONObject, zzdns zzdnsVar, zzdio zzdioVar, zzavl zzavlVar, zzcwl zzcwlVar, zzcvr zzcvrVar, zzddw zzddwVar, zzfbu zzfbuVar, VersionInfoParcel versionInfoParcel, zzfcp zzfcpVar, zzcnk zzcnkVar, zzdju zzdjuVar, Clock clock, zzdds zzddsVar, zzfjr zzfjrVar, zzfhn zzfhnVar, zzece zzeceVar, zzdpi zzdpiVar, zzdjq zzdjqVar, zzcyd zzcydVar, @InterfaceC11300zs1 com.google.android.gms.ads.internal.zzb zzbVar, @InterfaceC11300zs1 zzbxv zzbxvVar) {
        this.a = context;
        this.b = zzdizVar;
        this.c = jSONObject;
        this.d = zzdnsVar;
        this.e = zzdioVar;
        this.f = zzavlVar;
        this.g = zzcwlVar;
        this.h = zzcvrVar;
        this.i = zzddwVar;
        this.j = zzfbuVar;
        this.k = versionInfoParcel;
        this.l = zzfcpVar;
        this.m = zzcnkVar;
        this.n = zzdjuVar;
        this.f262o = clock;
        this.p = zzddsVar;
        this.q = zzfjrVar;
        this.s = zzfhnVar;
        this.t = zzeceVar;
        this.r = zzdpiVar;
        this.E = zzdjqVar;
        this.D = zzcydVar;
        this.F = zzbVar;
    }

    public final boolean A() {
        return this.c.optBoolean("allow_custom_click_gesture", false);
    }

    public final boolean B(@InterfaceC11300zs1 JSONObject jSONObject, @InterfaceC11300zs1 JSONObject jSONObject2, @InterfaceC11300zs1 JSONObject jSONObject3, @InterfaceC11300zs1 JSONObject jSONObject4, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 JSONObject jSONObject5, boolean z, @InterfaceC11300zs1 View view) {
        JSONException jSONException;
        JSONObject jSONObject6;
        zzdns zzdnsVar;
        try {
            jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.O3)).booleanValue()) {
                try {
                    jSONObject6.put("view_signals", str);
                } catch (JSONException e) {
                    jSONException = e;
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.e("Unable to create impression JSON.", jSONException);
                    return false;
                }
            }
            jSONObject6.put("policy_validator_enabled", z);
            jSONObject6.put("screen", com.google.android.gms.ads.internal.util.zzbv.f(this.a));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.T8)).booleanValue()) {
                this.d.l("/clickRecorded", new zzdhe(this, null));
            } else {
                this.d.l("/logScionEvent", new zzdhd(this, null));
            }
            zzdnsVar = this.d;
            zzdnsVar.l("/nativeImpression", new zzdhf(this, view, null));
        } catch (JSONException e2) {
            e = e2;
        }
        try {
            zzdnsVar.l("/nativeImpressionFlowControl", new zzdhg(this, this.q, this.j.x0, this.s, null));
            zzcad.a(zzdnsVar.g("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (!this.u) {
                zzfbu zzfbuVar = this.j;
                this.u = com.google.android.gms.ads.internal.zzv.y().n(this.a, this.k.X, zzfbuVar.C.toString(), this.l.f);
                return true;
            }
            return true;
        } catch (JSONException e3) {
            e = e3;
            jSONException = e;
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Unable to create impression JSON.", jSONException);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void B0(@InterfaceC11300zs1 Bundle bundle) {
        String str;
        if (bundle == null) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.b("Click data is null. No click is reported.");
        } else if (!z("click_reporting")) {
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.d("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            if (bundle2 != null) {
                str = bundle2.getString("asset_id");
            } else {
                str = null;
            }
            I(null, null, null, null, null, str, null, com.google.android.gms.ads.internal.client.zzbb.b().q(bundle, null), false, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final boolean F() {
        if (a() != 0) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Pb)).booleanValue()) {
                return this.l.i.e1;
            }
            return true;
        }
        return true;
    }

    @InterfaceC5056aJ2
    public final void I(@InterfaceC11300zs1 View view, @InterfaceC11300zs1 JSONObject jSONObject, @InterfaceC11300zs1 JSONObject jSONObject2, @InterfaceC11300zs1 JSONObject jSONObject3, @InterfaceC11300zs1 JSONObject jSONObject4, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 JSONObject jSONObject5, @InterfaceC11300zs1 JSONObject jSONObject6, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        String str2;
        try {
            y();
            JSONObject jSONObject7 = new JSONObject();
            JSONObject jSONObject8 = this.c;
            jSONObject7.put("ad", jSONObject8);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            zzdiz zzdizVar = this.b;
            zzdio zzdioVar = this.e;
            boolean z6 = false;
            if (zzdizVar.c(zzdioVar.a()) != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            jSONObject7.put("has_custom_click_handler", z3);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("asset_id", str);
            jSONObject9.put(C9998uW1.b0, zzdioVar.P());
            jSONObject9.put("view_aware_api_used", z);
            zzbfv zzbfvVar = this.l.i;
            if (zzbfvVar != null && zzbfvVar.b1) {
                z4 = true;
            } else {
                z4 = false;
            }
            jSONObject9.put("custom_mute_requested", z4);
            if (!zzdioVar.h().isEmpty() && zzdioVar.X() != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            jSONObject9.put("custom_mute_enabled", z5);
            if (this.n.a() != null && jSONObject8.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject9.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject9.put("timestamp", this.f262o.a());
            if (this.x && A()) {
                jSONObject9.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject9.put("is_custom_click_gesture", true);
            }
            if (zzdizVar.c(zzdioVar.a()) != null) {
                z6 = true;
            }
            jSONObject9.put("has_custom_click_handler", z6);
            String str3 = null;
            try {
                JSONObject optJSONObject = jSONObject8.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                str2 = this.f.c().g(this.a, optJSONObject.optString("click_string"), view);
            } catch (Exception e) {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.e("Exception obtaining click signals", e);
                str2 = null;
            }
            jSONObject9.put("click_signals", str2);
            jSONObject9.put("open_chrome_custom_tab", true);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.X8)).booleanValue() && PlatformVersion.q()) {
                jSONObject9.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Y8)).booleanValue() && PlatformVersion.q()) {
                jSONObject9.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject9);
            JSONObject jSONObject10 = new JSONObject();
            long a = this.f262o.a();
            jSONObject10.put("time_from_last_touch_down", a - this.A);
            jSONObject10.put("time_from_last_touch", a - this.B);
            jSONObject7.put("touch_signal", jSONObject10);
            if (this.j.b()) {
                JSONObject jSONObject11 = (JSONObject) this.c.get("tracking_urls_and_actions");
                if (jSONObject11 != null) {
                    str3 = jSONObject11.getString("gws_query_id");
                }
                if (str3 != null) {
                    this.t.f8(str3, this.e);
                }
            }
            zzcad.a(this.d.g("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Unable to create click JSON.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final int a() {
        zzbfv zzbfvVar = this.l.i;
        if (zzbfvVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Pb)).booleanValue()) {
                return zzbfvVar.d1;
            }
            return 0;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void b(View view, @InterfaceC11300zs1 Map map, @InterfaceC11300zs1 Map map2, @InterfaceC11300zs1 ImageView.ScaleType scaleType) {
        Context context = this.a;
        JSONObject d = com.google.android.gms.ads.internal.util.zzbv.d(context, map, map2, view, scaleType);
        JSONObject h = com.google.android.gms.ads.internal.util.zzbv.h(context, view);
        JSONObject g = com.google.android.gms.ads.internal.util.zzbv.g(view);
        JSONObject e = com.google.android.gms.ads.internal.util.zzbv.e(context, view);
        boolean i = com.google.android.gms.ads.internal.util.zzbv.i(context, this.j);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.c);
            jSONObject.put("asset_view_signal", d);
            jSONObject.put("ad_view_signal", h);
            jSONObject.put("scroll_view_signal", g);
            jSONObject.put("lock_screen_signal", e);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.O3)).booleanValue()) {
                jSONObject.put("view_signals", v(view));
            }
            jSONObject.put("policy_validator_enabled", i);
            jSONObject.put("screen", com.google.android.gms.ads.internal.util.zzbv.f(context));
            zzcad.a(this.d.g("google.afma.nativeAds.handleNativeAdSignalsLogging", jSONObject), "Error during performing handleNativeAdSignalsLogging");
        } catch (JSONException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Unable to create native ad signals logging JSON.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void c(zzbhx zzbhxVar) {
        if (!this.c.optBoolean("custom_one_point_five_click_enabled", false)) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        this.n.c(zzbhxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void d(@InterfaceC11300zs1 View view, @InterfaceC11300zs1 Map map, @InterfaceC11300zs1 Map map2, @InterfaceC11300zs1 ImageView.ScaleType scaleType) {
        Context context = this.a;
        B(com.google.android.gms.ads.internal.util.zzbv.h(context, view), com.google.android.gms.ads.internal.util.zzbv.d(context, map, map2, view, scaleType), com.google.android.gms.ads.internal.util.zzbv.g(view), com.google.android.gms.ads.internal.util.zzbv.e(context, view), v(view), null, com.google.android.gms.ads.internal.util.zzbv.i(context, this.j), view);
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void e(@InterfaceC11300zs1 View view, @InterfaceC11300zs1 View view2, @InterfaceC11300zs1 Map map, @InterfaceC11300zs1 Map map2, boolean z, @InterfaceC11300zs1 ImageView.ScaleType scaleType, int i) {
        Point point;
        Point point2;
        JSONObject jSONObject;
        JSONObject jSONObject2 = this.c;
        boolean z2 = false;
        if (jSONObject2.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Pb)).booleanValue()) {
                z2 = true;
            }
        }
        if (!z2) {
            if (!this.x) {
                int i2 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.b("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!A()) {
                int i3 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.b("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        Context context = this.a;
        JSONObject d = com.google.android.gms.ads.internal.util.zzbv.d(context, map, map2, view2, scaleType);
        JSONObject h = com.google.android.gms.ads.internal.util.zzbv.h(context, view2);
        boolean z3 = z2;
        JSONObject g = com.google.android.gms.ads.internal.util.zzbv.g(view2);
        JSONObject e = com.google.android.gms.ads.internal.util.zzbv.e(context, view2);
        String x = x(view, map);
        JSONObject c = com.google.android.gms.ads.internal.util.zzbv.c(x, context, this.z, this.y);
        if (z3) {
            try {
                point = this.z;
                point2 = this.y;
                try {
                    jSONObject = new JSONObject();
                } catch (Exception e2) {
                    e = e2;
                    jSONObject = null;
                }
            } catch (JSONException e3) {
                int i4 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.e("Error occurred while adding CustomClickGestureSignals to adJson.", e3);
                com.google.android.gms.ads.internal.zzv.t().x(e3, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
            try {
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                if (point != null) {
                    jSONObject3.put("x", point.x);
                    jSONObject3.put(C5738d80.b, point.y);
                }
                if (point2 != null) {
                    jSONObject4.put("x", point2.x);
                    jSONObject4.put(C5738d80.b, point2.y);
                }
                jSONObject.put("start_point", jSONObject3);
                jSONObject.put("end_point", jSONObject4);
                jSONObject.put("duration_ms", i);
            } catch (Exception e4) {
                e = e4;
                int i5 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.e("Error occurred while grabbing custom click gesture signals.", e);
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
                I(view2, h, d, g, e, x, c, null, z, true);
            }
            jSONObject2.put("custom_click_gesture_signal", jSONObject);
        }
        I(view2, h, d, g, e, x, c, null, z, true);
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void e0(String str) {
        I(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void f(com.google.android.gms.ads.internal.client.zzdc zzdcVar) {
        this.C = zzdcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void g(@InterfaceC11300zs1 View view, @InterfaceC11300zs1 Map map) {
        this.y = new Point();
        this.z = new Point();
        if (view != null) {
            this.p.t1(view);
        }
        this.v = false;
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void h(View view, @InterfaceC11300zs1 Map map, @InterfaceC11300zs1 Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.y = new Point();
        this.z = new Point();
        if (!this.v) {
            this.p.n1(view);
            this.v = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.m.c(this);
        boolean j = com.google.android.gms.ads.internal.util.zzbv.j(this.k.Z);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    if (j) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            for (Map.Entry entry2 : map2.entrySet()) {
                View view3 = (View) ((WeakReference) entry2.getValue()).get();
                if (view3 != null) {
                    if (j) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final boolean h0() {
        return A();
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void i() {
        try {
            com.google.android.gms.ads.internal.client.zzdc zzdcVar = this.C;
            if (zzdcVar != null) {
                zzdcVar.d();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void j() {
        if (!this.c.optBoolean("custom_one_point_five_click_enabled", false)) {
            return;
        }
        this.n.b();
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void k() {
        this.d.i();
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final boolean l(Bundle bundle) {
        if (!z("impression_reporting")) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.d("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        String str = null;
        JSONObject q = com.google.android.gms.ads.internal.client.zzbb.b().q(bundle, null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Lb)).booleanValue()) {
            str = v(null);
        }
        return B(null, null, null, null, str, q, false, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void m(@InterfaceC11300zs1 Bundle bundle) {
        if (bundle == null) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.b("Touch event data is null. No touch event is reported.");
        } else if (!z("touch_reporting")) {
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.d("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
        } else {
            int i3 = bundle.getInt("duration_ms");
            this.f.c().d((int) bundle.getFloat("x"), (int) bundle.getFloat(C5738d80.b), i3);
            y();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void n(@InterfaceC11300zs1 View view, MotionEvent motionEvent, @InterfaceC11300zs1 View view2) {
        this.y = com.google.android.gms.ads.internal.util.zzbv.a(motionEvent, view2);
        long a = this.f262o.a();
        this.B = a;
        if (motionEvent.getAction() == 0) {
            this.r.b(motionEvent);
            this.A = a;
            this.z = this.y;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.y;
        obtain.setLocation(point.x, point.y);
        this.f.d(obtain);
        obtain.recycle();
        y();
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void o(View view, @InterfaceC11300zs1 View view2, @InterfaceC11300zs1 Map map, @InterfaceC11300zs1 Map map2, boolean z, @InterfaceC11300zs1 ImageView.ScaleType scaleType) {
        View view3;
        Context context = this.a;
        JSONObject d = com.google.android.gms.ads.internal.util.zzbv.d(context, map, map2, view2, scaleType);
        JSONObject h = com.google.android.gms.ads.internal.util.zzbv.h(context, view2);
        JSONObject g = com.google.android.gms.ads.internal.util.zzbv.g(view2);
        JSONObject e = com.google.android.gms.ads.internal.util.zzbv.e(context, view2);
        String x = x(view, map);
        JSONObject c = com.google.android.gms.ads.internal.util.zzbv.c(x, context, this.z, this.y);
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.V3)).booleanValue()) {
            view3 = view2;
        } else {
            view3 = view;
        }
        I(view3, h, d, g, e, x, c, null, z, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    @InterfaceC11300zs1
    public final JSONObject p(@InterfaceC11300zs1 View view, @InterfaceC11300zs1 Map map, @InterfaceC11300zs1 Map map2, @InterfaceC11300zs1 ImageView.ScaleType scaleType) {
        JSONObject u = u(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.x && A()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (u != null) {
                jSONObject.put("nas", u);
            }
            return jSONObject;
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Unable to create native click meta data JSON.", e);
            return jSONObject;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void q(View view) {
        if (!this.c.optBoolean("custom_one_point_five_click_enabled", false)) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzdju zzdjuVar = this.n;
        if (view == null) {
            return;
        }
        view.setOnClickListener(zzdjuVar);
        view.setClickable(true);
        zzdjuVar.b1 = new WeakReference(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void r(@InterfaceC11300zs1 com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        try {
            if (this.w) {
                return;
            }
            if (zzdgVar == null) {
                zzdio zzdioVar = this.e;
                if (zzdioVar.X() != null) {
                    this.w = true;
                    this.q.d(zzdioVar.X().e(), this.j.x0, this.s, null);
                    i();
                    return;
                }
            }
            this.w = true;
            this.q.d(zzdgVar.e(), this.j.x0, this.s, null);
            i();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void s() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.c);
            zzcad.a(this.d.g("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void t() {
        B(null, null, null, null, null, null, false, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    @InterfaceC11300zs1
    public final JSONObject u(@InterfaceC11300zs1 View view, @InterfaceC11300zs1 Map map, @InterfaceC11300zs1 Map map2, @InterfaceC11300zs1 ImageView.ScaleType scaleType) {
        Context context = this.a;
        JSONObject d = com.google.android.gms.ads.internal.util.zzbv.d(context, map, map2, view, scaleType);
        JSONObject h = com.google.android.gms.ads.internal.util.zzbv.h(context, view);
        JSONObject g = com.google.android.gms.ads.internal.util.zzbv.g(view);
        JSONObject e = com.google.android.gms.ads.internal.util.zzbv.e(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", d);
            jSONObject.put("ad_view_signal", h);
            jSONObject.put("scroll_view_signal", g);
            jSONObject.put("lock_screen_signal", e);
            return jSONObject;
        } catch (JSONException e2) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Unable to create native ad view signals JSON.", e2);
            return null;
        }
    }

    @InterfaceC11300zs1
    public final String v(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.O3)).booleanValue()) {
            return null;
        }
        try {
            return this.f.c().i(this.a, view, null);
        } catch (Exception unused) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.d("Exception getting data.");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void w() {
        this.x = true;
    }

    @InterfaceC11300zs1
    public final String x(@InterfaceC11300zs1 View view, @InterfaceC11300zs1 Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int P = this.e.P();
        if (P != 1) {
            if (P != 2) {
                if (P != 6) {
                    return null;
                }
                return "3099";
            }
            return "2099";
        }
        return "1099";
    }

    public final void y() {
        com.google.android.gms.ads.internal.zzb zzbVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Hd)).booleanValue() && (zzbVar = this.F) != null) {
            zzbVar.a();
        }
    }

    public final boolean z(String str) {
        JSONObject optJSONObject = this.c.optJSONObject("allow_pub_event_reporting");
        if (optJSONObject == null || !optJSONObject.optBoolean(str, false)) {
            return false;
        }
        return true;
    }
}
