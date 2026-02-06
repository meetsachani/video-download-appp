package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import o.C2531Be;
import o.InterfaceC10251va;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;
import o.UE;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdij extends zzcqx {
    public static final zzfyc H = zzfyc.L("3010", "3008", "1005", "1009", "2011", "2007");
    public final zzavl A;
    public final VersionInfoParcel B;
    public final Context C;
    public final zzdil D;
    public final zzeku E;
    public final Map F;
    public final List G;
    public final Executor j;
    public final zzdio k;
    public final zzdiw l;
    public final zzdjo m;
    public final zzdit n;

    /* renamed from: o  reason: collision with root package name */
    public final zzdiz f264o;
    public final zzhfp p;
    public final zzhfp q;
    public final zzhfp r;
    public final zzhfp s;
    public final zzhfp t;
    @InterfaceC11300zs1
    public zzdkm u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public final zzbyf z;

    public zzdij(zzcqw zzcqwVar, Executor executor, zzdio zzdioVar, zzdiw zzdiwVar, zzdjo zzdjoVar, zzdit zzditVar, zzdiz zzdizVar, zzhfp zzhfpVar, zzhfp zzhfpVar2, zzhfp zzhfpVar3, zzhfp zzhfpVar4, zzhfp zzhfpVar5, zzbyf zzbyfVar, zzavl zzavlVar, VersionInfoParcel versionInfoParcel, Context context, zzdil zzdilVar, zzeku zzekuVar, zzayw zzaywVar) {
        super(zzcqwVar);
        this.j = executor;
        this.k = zzdioVar;
        this.l = zzdiwVar;
        this.m = zzdjoVar;
        this.n = zzditVar;
        this.f264o = zzdizVar;
        this.p = zzhfpVar;
        this.q = zzhfpVar2;
        this.r = zzhfpVar3;
        this.s = zzhfpVar4;
        this.t = zzhfpVar5;
        this.z = zzbyfVar;
        this.A = zzavlVar;
        this.B = versionInfoParcel;
        this.C = context;
        this.D = zzdilVar;
        this.E = zzekuVar;
        this.F = new HashMap();
        this.G = new ArrayList();
    }

    public static boolean H(View view) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Ta)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.v();
            long d0 = com.google.android.gms.ads.internal.util.zzs.d0(view);
            if (view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point())) {
                if (d0 >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Ua)).intValue()) {
                    return true;
                }
            }
            return false;
        } else if (!view.isShown() || !view.getGlobalVisibleRect(new Rect(), new Point())) {
            return false;
        } else {
            return true;
        }
    }

    public static /* synthetic */ void a0(zzdij zzdijVar, boolean z) {
        zzdkm zzdkmVar = zzdijVar.u;
        if (zzdkmVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.b("Ad should be associated with an ad view before calling recordCustomClickGesture()");
            return;
        }
        zzdijVar.l.e(null, zzdkmVar.e(), zzdijVar.u.l(), zzdijVar.u.m(), z, zzdijVar.L(), 0);
    }

    public static /* synthetic */ void b0(zzdij zzdijVar) {
        try {
            zzdio zzdioVar = zzdijVar.k;
            int P = zzdioVar.P();
            if (P != 1) {
                if (P != 2) {
                    if (P != 3) {
                        if (P != 6) {
                            if (P != 7) {
                                int i = com.google.android.gms.ads.internal.util.zze.b;
                                com.google.android.gms.ads.internal.util.client.zzo.d("Wrong native template id!");
                                return;
                            }
                            zzbmp g = zzdijVar.f264o.g();
                            if (g != null) {
                                g.K5((zzbmj) zzdijVar.s.b());
                                return;
                            }
                            return;
                        }
                        zzbhu f = zzdijVar.f264o.f();
                        if (f != null) {
                            zzdijVar.M("Google", true);
                            f.j5((zzbia) zzdijVar.r.b());
                            return;
                        }
                        return;
                    }
                    zzbhn d = zzdijVar.f264o.d(zzdioVar.a());
                    if (d != null) {
                        if (zzdioVar.f0() != null) {
                            zzdijVar.V("Google", true);
                        }
                        d.c4((zzbha) zzdijVar.t.b());
                        return;
                    }
                    return;
                }
                zzbhe a = zzdijVar.f264o.a();
                if (a != null) {
                    zzdijVar.M("Google", true);
                    a.K1((zzbgv) zzdijVar.q.b());
                    return;
                }
                return;
            }
            zzbhh b = zzdijVar.f264o.b();
            if (b != null) {
                zzdijVar.M("Google", true);
                b.x7((zzbgx) zzdijVar.p.b());
            }
        } catch (RemoteException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("RemoteException when notifyAdLoad is called", e);
        }
    }

    public static /* synthetic */ void c0(zzdij zzdijVar, View view, boolean z, int i) {
        zzdkm zzdkmVar = zzdijVar.u;
        if (zzdkmVar == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.b("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            return;
        }
        zzdijVar.l.e(view, zzdkmVar.e(), zzdijVar.u.l(), zzdijVar.u.m(), z, zzdijVar.L(), i);
    }

    public static /* synthetic */ void d0(zzdij zzdijVar) {
        zzdijVar.l.k();
        zzdijVar.k.i();
    }

    public final synchronized void A(zzbhx zzbhxVar) {
        this.l.c(zzbhxVar);
    }

    public final synchronized void B(final zzdkm zzdkmVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.U1)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdhy
                @Override // java.lang.Runnable
                public final void run() {
                    zzdij.this.Q(zzdkmVar);
                }
            });
        } else {
            Q(zzdkmVar);
        }
    }

    public final synchronized void C(final zzdkm zzdkmVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.U1)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdhz
                @Override // java.lang.Runnable
                public final void run() {
                    zzdij.this.R(zzdkmVar);
                }
            });
        } else {
            R(zzdkmVar);
        }
    }

    public final boolean D() {
        return this.n.e();
    }

    public final synchronized boolean E() {
        return this.l.F();
    }

    public final synchronized boolean F() {
        return this.l.h0();
    }

    public final boolean G() {
        return this.n.d();
    }

    public final synchronized boolean I(Bundle bundle) {
        if (this.w) {
            return true;
        }
        boolean l = this.l.l(bundle);
        this.w = l;
        return l;
    }

    public final synchronized int J() {
        return this.l.a();
    }

    @InterfaceC11300zs1
    public final synchronized View K(Map map) {
        if (map != null) {
            zzfyc zzfycVar = H;
            int size = zzfycVar.size();
            int i = 0;
            while (i < size) {
                WeakReference weakReference = (WeakReference) map.get((String) zzfycVar.get(i));
                i++;
                if (weakReference != null) {
                    return (View) weakReference.get();
                }
            }
        }
        return null;
    }

    @InterfaceC11300zs1
    public final synchronized ImageView.ScaleType L() {
        zzdkm zzdkmVar = this.u;
        if (zzdkmVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.b("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        IObjectWrapper j = zzdkmVar.j();
        if (j != null) {
            return (ImageView.ScaleType) ObjectWrapper.o1(j);
        }
        return zzdjo.k;
    }

    public final void M(String str, boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.D5)).booleanValue()) {
            InterfaceFutureC8411o11 j0 = this.k.j0();
            if (j0 == null) {
                return;
            }
            zzgcy.r(j0, new zzdih(this, "Google", true), this.j);
            return;
        }
        V("Google", true);
    }

    public final synchronized void N(View view, Map map, Map map2) {
        View K;
        Rect rect;
        if (!this.x && (K = K(map)) != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Ed)).booleanValue()) {
                Rect rect2 = new Rect();
                if (K.getGlobalVisibleRect(rect2, new Point()) && K.getHeight() == rect2.height() && K.getWidth() == rect2.width()) {
                    this.l.b(view, map, map2, L());
                    this.x = true;
                }
            } else if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Fd)).booleanValue()) {
                if (H(K)) {
                    this.l.b(view, map, map2, L());
                    this.x = true;
                }
            } else {
                zzbcm zzbcmVar = zzbcv.Gd;
                if (((Float) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).floatValue() > 0.0d) {
                    double floatValue = ((Float) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).floatValue();
                    if (K.getGlobalVisibleRect(new Rect(), new Point())) {
                        if (rect.height() * rect.width() >= K.getHeight() * K.getWidth() * (floatValue / 100.0d)) {
                            this.l.b(view, map, map2, L());
                            this.x = true;
                        }
                    }
                }
            }
        }
    }

    public final synchronized void O(View view, Map map, Map map2) {
        this.m.d(this.u);
        this.l.d(view, map, map2, L());
        this.w = true;
    }

    public final void P(View view, @InterfaceC11300zs1 zzeda zzedaVar) {
        zzcfb e0 = this.k.e0();
        if (this.n.d() && zzedaVar != null && e0 != null && view != null) {
            com.google.android.gms.ads.internal.zzv.c().i(zzedaVar.a(), view);
        }
    }

    public final synchronized void Q(zzdkm zzdkmVar) {
        Iterator<String> keys;
        WeakReference weakReference;
        View view;
        zzavg c;
        try {
            if (!this.v) {
                this.u = zzdkmVar;
                this.m.e(zzdkmVar);
                this.l.h(zzdkmVar.e(), zzdkmVar.m(), zzdkmVar.n(), zzdkmVar, zzdkmVar);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.T2)).booleanValue() && (c = this.A.c()) != null) {
                    c.b(zzdkmVar.e());
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.W1)).booleanValue()) {
                    zzfbu zzfbuVar = this.b;
                    if (zzfbuVar.k0 && (keys = zzfbuVar.j0.keys()) != null) {
                        while (keys.hasNext()) {
                            String next = keys.next();
                            zzdkm zzdkmVar2 = this.u;
                            if (zzdkmVar2 == null) {
                                weakReference = null;
                            } else {
                                weakReference = (WeakReference) zzdkmVar2.l().get(next);
                            }
                            this.F.put(next, Boolean.FALSE);
                            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                                zzayv zzayvVar = new zzayv(this.C, view);
                                this.G.add(zzayvVar);
                                zzayvVar.d(new zzdig(this, next));
                            }
                        }
                    }
                }
                if (zzdkmVar.i() != null) {
                    zzdkmVar.i().d(this.z);
                }
            }
        } finally {
        }
    }

    public final void R(zzdkm zzdkmVar) {
        this.l.g(zzdkmVar.e(), zzdkmVar.l());
        if (zzdkmVar.h() != null) {
            zzdkmVar.h().setClickable(false);
            zzdkmVar.h().removeAllViews();
        }
        if (zzdkmVar.i() != null) {
            zzdkmVar.i().e(this.z);
        }
        this.u = null;
    }

    public final zzdil S() {
        return this.D;
    }

    @InterfaceC11300zs1
    public final zzeda V(String str, boolean z) {
        boolean z2;
        String str2;
        zzecw zzecwVar;
        zzecx zzecxVar;
        String str3;
        zzdit zzditVar = this.n;
        if (zzditVar.d() && !TextUtils.isEmpty(str)) {
            zzdio zzdioVar = this.k;
            zzcfb e0 = zzdioVar.e0();
            zzcfb f0 = zzdioVar.f0();
            if (e0 == null && f0 == null) {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.g("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            zzditVar.a();
            int c = zzditVar.a().c();
            int i2 = c - 1;
            boolean z3 = false;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (c != 1) {
                        if (c != 2) {
                            str3 = "UNKNOWN";
                        } else {
                            str3 = "DISPLAY";
                        }
                    } else {
                        str3 = "VIDEO";
                    }
                    int i3 = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.g("Unknown omid media type: " + str3 + ". Not initializing Omid.");
                    return null;
                } else if (e0 != null) {
                    z2 = false;
                    z3 = true;
                } else {
                    int i4 = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.g("Omid media type was display but there was no display webview.");
                    return null;
                }
            } else if (f0 != null) {
                z2 = true;
            } else {
                int i5 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.g("Omid media type was video but there was no video webview.");
            }
            if (z3) {
                str2 = null;
            } else {
                str2 = "javascript";
                e0 = f0;
            }
            if (e0 != null) {
                if (!com.google.android.gms.ads.internal.zzv.c().f(this.C)) {
                    int i6 = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.g("Failed to initialize omid in InternalNativeAd");
                    return null;
                }
                VersionInfoParcel versionInfoParcel = this.B;
                String str4 = versionInfoParcel.Y + UE.h + versionInfoParcel.Z;
                if (z2) {
                    zzecwVar = zzecw.VIDEO;
                    zzecxVar = zzecx.DEFINED_BY_JAVASCRIPT;
                } else {
                    zzecwVar = zzecw.NATIVE_DISPLAY;
                    if (zzdioVar.P() == 3) {
                        zzecxVar = zzecx.UNSPECIFIED;
                    } else {
                        zzecxVar = zzecx.ONE_PIXEL;
                    }
                }
                zzeda b = com.google.android.gms.ads.internal.zzv.c().b(str4, e0.N(), "", "javascript", str2, str, zzecxVar, zzecwVar, this.b.l0);
                if (b == null) {
                    int i7 = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.g("Failed to create omid session in InternalNativeAd");
                    return null;
                }
                zzdioVar.w(b);
                e0.q0(b);
                if (z2) {
                    zzflb a = b.a();
                    if (f0 != null) {
                        com.google.android.gms.ads.internal.zzv.c().i(a, f0.U());
                    }
                    this.y = true;
                }
                if (z) {
                    com.google.android.gms.ads.internal.zzv.c().c(b.a());
                    e0.q("onSdkLoaded", new C2531Be());
                }
                return b;
            }
            int i8 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Webview is null in InternalNativeAd");
            return null;
        }
        return null;
    }

    public final String W() {
        return this.n.b();
    }

    public final synchronized JSONObject Y(View view, Map map, Map map2) {
        return this.l.u(view, map, map2, L());
    }

    public final synchronized JSONObject Z(View view, Map map, Map map2) {
        return this.l.p(view, map, map2, L());
    }

    @Override // com.google.android.gms.internal.ads.zzcqx
    public final synchronized void a() {
        this.v = true;
        this.j.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdie
            @Override // java.lang.Runnable
            public final void run() {
                zzdij.d0(zzdij.this);
            }
        });
        super.a();
    }

    @Override // com.google.android.gms.internal.ads.zzcqx
    @InterfaceC10251va
    public final void b() {
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzdia
            @Override // java.lang.Runnable
            public final void run() {
                zzdij.b0(zzdij.this);
            }
        };
        Executor executor = this.j;
        executor.execute(runnable);
        if (this.k.P() != 7) {
            final zzdiw zzdiwVar = this.l;
            Objects.requireNonNull(zzdiwVar);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdib
                @Override // java.lang.Runnable
                public final void run() {
                    zzdiw.this.s();
                }
            });
        }
        super.b();
    }

    public final void h0(View view) {
        zzeda h0 = this.k.h0();
        if (this.n.d() && h0 != null && view != null) {
            com.google.android.gms.ads.internal.zzv.c().e(h0.a(), view);
        }
    }

    public final synchronized void i() {
        this.l.j();
    }

    public final synchronized void j(View view, Map map, Map map2, boolean z) {
        if (this.w) {
            N(view, map, map2);
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.W1)).booleanValue() && this.b.k0) {
            Map map3 = this.F;
            for (String str : map3.keySet()) {
                if (!((Boolean) map3.get(str)).booleanValue()) {
                    break;
                }
            }
        }
        if (!z) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.h4)).booleanValue() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    View view2 = (View) ((WeakReference) entry.getValue()).get();
                    if (view2 != null && H(view2)) {
                        O(view, map, map2);
                        return;
                    }
                }
            }
            return;
        }
        O(view, map, map2);
        N(view, map, map2);
    }

    public final synchronized void k(@InterfaceC11300zs1 com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.l.r(zzdgVar);
    }

    public final synchronized void l(View view, View view2, Map map, Map map2, boolean z) {
        zzcfb f0;
        this.m.c(this.u);
        this.l.o(view, view2, map, map2, z, L());
        if (this.y) {
            zzdio zzdioVar = this.k;
            if (zzdioVar.f0() != null && (f0 = zzdioVar.f0()) != null) {
                f0.q("onSdkAdUserInteractionClick", new C2531Be());
            }
        }
    }

    public final synchronized void m(@InterfaceC11300zs1 final View view, final int i) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Pb)).booleanValue()) {
            return;
        }
        zzdkm zzdkmVar = this.u;
        if (zzdkmVar == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.b("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            return;
        }
        final boolean z = zzdkmVar instanceof zzdji;
        this.j.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdid
            @Override // java.lang.Runnable
            public final void run() {
                zzdij.c0(zzdij.this, view, z, i);
            }
        });
    }

    public final synchronized void n(String str) {
        this.l.e0(str);
    }

    public final synchronized void o(Bundle bundle) {
        this.l.B0(bundle);
    }

    public final synchronized void p() {
        zzdkm zzdkmVar = this.u;
        if (zzdkmVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.b("Ad should be associated with an ad view before calling recordCustomClickGesture()");
            return;
        }
        final boolean z = zzdkmVar instanceof zzdji;
        this.j.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdif
            @Override // java.lang.Runnable
            public final void run() {
                zzdij.a0(zzdij.this, z);
            }
        });
    }

    public final void q(Bundle bundle) {
        final zzcfb f0 = this.k.f0();
        if (f0 == null) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.d("Video webview is null");
            return;
        }
        try {
            final JSONObject jSONObject = new JSONObject();
            for (String str : bundle.keySet()) {
                jSONObject.put(str, bundle.get(str));
            }
            this.j.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdic
                @Override // java.lang.Runnable
                public final void run() {
                    zzfyc zzfycVar = zzdij.H;
                    zzcfb.this.a("onVideoEvent", jSONObject);
                }
            });
        } catch (JSONException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Error reading event signals", e);
        }
    }

    public final synchronized void s() {
        if (this.w) {
            return;
        }
        this.l.t();
    }

    public final void t(View view) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.D5)).booleanValue()) {
            zzdio zzdioVar = this.k;
            if (zzdioVar.P() != 3) {
                zzcaf c0 = zzdioVar.c0();
                if (c0 == null) {
                    return;
                }
                zzgcy.r(c0, new zzdii(this, view), this.j);
                return;
            }
        }
        P(view, this.k.h0());
    }

    public final synchronized void u(View view, MotionEvent motionEvent, View view2) {
        this.l.n(view, motionEvent, view2);
    }

    public final synchronized void v(Bundle bundle) {
        this.l.m(bundle);
    }

    public final synchronized void w(View view) {
        this.l.q(view);
    }

    public final synchronized void x() {
        this.l.w();
    }

    public final synchronized void y(com.google.android.gms.ads.internal.client.zzdc zzdcVar) {
        this.l.f(zzdcVar);
    }

    public final synchronized void z(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.E.a(zzdqVar);
    }
}
