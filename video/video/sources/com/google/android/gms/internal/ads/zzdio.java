package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collections;
import java.util.List;
import o.C9654t62;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzdio {
    public int a;
    @InterfaceC11300zs1
    public com.google.android.gms.ads.internal.client.zzea b;
    @InterfaceC11300zs1
    public zzbfz c;
    @InterfaceC11300zs1
    public View d;
    @InterfaceC11300zs1
    public List e;
    @InterfaceC11300zs1
    public com.google.android.gms.ads.internal.client.zzev g;
    @InterfaceC11300zs1
    public Bundle h;
    @InterfaceC11300zs1
    public zzcfb i;
    @InterfaceC11300zs1
    public zzcfb j;
    @InterfaceC11300zs1
    public zzcfb k;
    @InterfaceC11300zs1
    public zzeda l;
    @InterfaceC11300zs1
    public InterfaceFutureC8411o11 m;
    @InterfaceC11300zs1
    public zzcaf n;
    @InterfaceC11300zs1

    /* renamed from: o  reason: collision with root package name */
    public View f266o;
    @InterfaceC11300zs1
    public View p;
    @InterfaceC11300zs1
    public IObjectWrapper q;
    public double r;
    @InterfaceC11300zs1
    public zzbgg s;
    @InterfaceC11300zs1
    public zzbgg t;
    @InterfaceC11300zs1
    public String u;
    public float x;
    @InterfaceC11300zs1
    public String y;
    public final C9654t62 v = new C9654t62();
    public final C9654t62 w = new C9654t62();
    public List f = Collections.EMPTY_LIST;

    @InterfaceC11300zs1
    public static zzdio H(zzbpw zzbpwVar) {
        zzdio zzdioVar;
        zzdin L;
        zzbfz h5;
        View view;
        String p;
        List V7;
        String m;
        Bundle e;
        String n;
        View view2;
        IObjectWrapper l;
        String r;
        String o2;
        double d;
        zzbgg B5;
        try {
            L = L(zzbpwVar.r4(), null);
            h5 = zzbpwVar.h5();
            view = (View) N(zzbpwVar.s7());
            p = zzbpwVar.p();
            V7 = zzbpwVar.V7();
            m = zzbpwVar.m();
            e = zzbpwVar.e();
            n = zzbpwVar.n();
            view2 = (View) N(zzbpwVar.S7());
            l = zzbpwVar.l();
            r = zzbpwVar.r();
            o2 = zzbpwVar.o();
            d = zzbpwVar.d();
            B5 = zzbpwVar.B5();
            zzdioVar = null;
        } catch (RemoteException e2) {
            e = e2;
            zzdioVar = null;
        }
        try {
            zzdio zzdioVar2 = new zzdio();
            zzdioVar2.a = 2;
            zzdioVar2.b = L;
            zzdioVar2.c = h5;
            zzdioVar2.d = view;
            zzdioVar2.z("headline", p);
            zzdioVar2.e = V7;
            zzdioVar2.z("body", m);
            zzdioVar2.h = e;
            zzdioVar2.z("call_to_action", n);
            zzdioVar2.f266o = view2;
            zzdioVar2.q = l;
            zzdioVar2.z("store", r);
            zzdioVar2.z(FirebaseAnalytics.Param.B, o2);
            zzdioVar2.r = d;
            zzdioVar2.s = B5;
            return zzdioVar2;
        } catch (RemoteException e3) {
            e = e3;
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.h("Failed to get native ad from app install ad mapper", e);
            return zzdioVar;
        }
    }

    @InterfaceC11300zs1
    public static zzdio I(zzbpx zzbpxVar) {
        try {
            zzdin L = L(zzbpxVar.r4(), null);
            zzbfz h5 = zzbpxVar.h5();
            String p = zzbpxVar.p();
            List V7 = zzbpxVar.V7();
            String m = zzbpxVar.m();
            Bundle d = zzbpxVar.d();
            String n = zzbpxVar.n();
            IObjectWrapper S7 = zzbpxVar.S7();
            String l = zzbpxVar.l();
            zzbgg B5 = zzbpxVar.B5();
            zzdio zzdioVar = new zzdio();
            zzdioVar.a = 1;
            zzdioVar.b = L;
            zzdioVar.c = h5;
            zzdioVar.d = (View) N(zzbpxVar.i());
            zzdioVar.z("headline", p);
            zzdioVar.e = V7;
            zzdioVar.z("body", m);
            zzdioVar.h = d;
            zzdioVar.z("call_to_action", n);
            zzdioVar.f266o = (View) N(zzbpxVar.s7());
            zzdioVar.q = S7;
            zzdioVar.z("advertiser", l);
            zzdioVar.t = B5;
            return zzdioVar;
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.h("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    @InterfaceC11300zs1
    public static zzdio J(zzbpw zzbpwVar) {
        try {
            return M(L(zzbpwVar.r4(), null), zzbpwVar.h5(), (View) N(zzbpwVar.s7()), zzbpwVar.p(), zzbpwVar.V7(), zzbpwVar.m(), zzbpwVar.e(), zzbpwVar.n(), (View) N(zzbpwVar.S7()), zzbpwVar.l(), zzbpwVar.r(), zzbpwVar.o(), zzbpwVar.d(), zzbpwVar.B5(), null, 0.0f);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.h("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    @InterfaceC11300zs1
    public static zzdio K(zzbpx zzbpxVar) {
        try {
            return M(L(zzbpxVar.r4(), null), zzbpxVar.h5(), (View) N(zzbpxVar.i()), zzbpxVar.p(), zzbpxVar.V7(), zzbpxVar.m(), zzbpxVar.d(), zzbpxVar.n(), (View) N(zzbpxVar.s7()), zzbpxVar.S7(), null, null, -1.0d, zzbpxVar.B5(), zzbpxVar.l(), 0.0f);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.h("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    @InterfaceC11300zs1
    public static zzdin L(@InterfaceC11300zs1 com.google.android.gms.ads.internal.client.zzea zzeaVar, @InterfaceC11300zs1 zzbqa zzbqaVar) {
        if (zzeaVar == null) {
            return null;
        }
        return new zzdin(zzeaVar, zzbqaVar);
    }

    public static zzdio M(@InterfaceC11300zs1 com.google.android.gms.ads.internal.client.zzea zzeaVar, zzbfz zzbfzVar, @InterfaceC11300zs1 View view, String str, List list, String str2, Bundle bundle, String str3, @InterfaceC11300zs1 View view2, IObjectWrapper iObjectWrapper, @InterfaceC11300zs1 String str4, @InterfaceC11300zs1 String str5, double d, zzbgg zzbggVar, @InterfaceC11300zs1 String str6, float f) {
        zzdio zzdioVar = new zzdio();
        zzdioVar.a = 6;
        zzdioVar.b = zzeaVar;
        zzdioVar.c = zzbfzVar;
        zzdioVar.d = view;
        zzdioVar.z("headline", str);
        zzdioVar.e = list;
        zzdioVar.z("body", str2);
        zzdioVar.h = bundle;
        zzdioVar.z("call_to_action", str3);
        zzdioVar.f266o = view2;
        zzdioVar.q = iObjectWrapper;
        zzdioVar.z("store", str4);
        zzdioVar.z(FirebaseAnalytics.Param.B, str5);
        zzdioVar.r = d;
        zzdioVar.s = zzbggVar;
        zzdioVar.z("advertiser", str6);
        zzdioVar.r(f);
        return zzdioVar;
    }

    @InterfaceC11300zs1
    public static Object N(@InterfaceC11300zs1 IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.o1(iObjectWrapper);
    }

    @InterfaceC11300zs1
    public static zzdio g0(zzbqa zzbqaVar) {
        try {
            return M(L(zzbqaVar.j(), zzbqaVar), zzbqaVar.k(), (View) N(zzbqaVar.m()), zzbqaVar.s(), zzbqaVar.q(), zzbqaVar.r(), zzbqaVar.i(), zzbqaVar.x(), (View) N(zzbqaVar.n()), zzbqaVar.p(), zzbqaVar.t(), zzbqaVar.v(), zzbqaVar.d(), zzbqaVar.l(), zzbqaVar.o(), zzbqaVar.e());
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.h("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public final synchronized double A() {
        return this.r;
    }

    public final synchronized void B(int i) {
        this.a = i;
    }

    public final synchronized void C(com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        this.b = zzeaVar;
    }

    public final synchronized void D(View view) {
        this.f266o = view;
    }

    public final synchronized void E(zzcfb zzcfbVar) {
        this.i = zzcfbVar;
    }

    public final synchronized void F(View view) {
        this.p = view;
    }

    public final synchronized boolean G() {
        return this.j != null;
    }

    public final synchronized float O() {
        return this.x;
    }

    public final synchronized int P() {
        return this.a;
    }

    public final synchronized Bundle Q() {
        try {
            if (this.h == null) {
                this.h = new Bundle();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.h;
    }

    @InterfaceC11300zs1
    public final synchronized View R() {
        return this.d;
    }

    @InterfaceC11300zs1
    public final synchronized View S() {
        return this.f266o;
    }

    @InterfaceC11300zs1
    public final synchronized View T() {
        return this.p;
    }

    @InterfaceC11300zs1
    public final synchronized C9654t62 U() {
        return this.v;
    }

    public final synchronized C9654t62 V() {
        return this.w;
    }

    @InterfaceC11300zs1
    public final synchronized com.google.android.gms.ads.internal.client.zzea W() {
        return this.b;
    }

    @InterfaceC11300zs1
    public final synchronized com.google.android.gms.ads.internal.client.zzev X() {
        return this.g;
    }

    @InterfaceC11300zs1
    public final synchronized zzbfz Y() {
        return this.c;
    }

    @InterfaceC11300zs1
    public final zzbgg Z() {
        List list = this.e;
        if (list != null && !list.isEmpty()) {
            Object obj = this.e.get(0);
            if (obj instanceof IBinder) {
                return zzbgf.W7((IBinder) obj);
            }
            return null;
        }
        return null;
    }

    @InterfaceC11300zs1
    public final synchronized String a() {
        return this.u;
    }

    @InterfaceC11300zs1
    public final synchronized zzbgg a0() {
        return this.s;
    }

    @InterfaceC11300zs1
    public final synchronized String b() {
        return f("headline");
    }

    @InterfaceC11300zs1
    public final synchronized zzbgg b0() {
        return this.t;
    }

    @InterfaceC11300zs1
    public final synchronized String c() {
        return this.y;
    }

    @InterfaceC11300zs1
    public final synchronized zzcaf c0() {
        return this.n;
    }

    @InterfaceC11300zs1
    public final synchronized String d() {
        return f(FirebaseAnalytics.Param.B);
    }

    @InterfaceC11300zs1
    public final synchronized zzcfb d0() {
        return this.j;
    }

    @InterfaceC11300zs1
    public final synchronized String e() {
        return f("store");
    }

    @InterfaceC11300zs1
    public final synchronized zzcfb e0() {
        return this.k;
    }

    @InterfaceC11300zs1
    public final synchronized String f(String str) {
        return (String) this.w.get(str);
    }

    @InterfaceC11300zs1
    public final synchronized zzcfb f0() {
        return this.i;
    }

    @InterfaceC11300zs1
    public final synchronized List g() {
        return this.e;
    }

    public final synchronized List h() {
        return this.f;
    }

    @InterfaceC11300zs1
    public final synchronized zzeda h0() {
        return this.l;
    }

    public final synchronized void i() {
        try {
            zzcfb zzcfbVar = this.i;
            if (zzcfbVar != null) {
                zzcfbVar.destroy();
                this.i = null;
            }
            zzcfb zzcfbVar2 = this.j;
            if (zzcfbVar2 != null) {
                zzcfbVar2.destroy();
                this.j = null;
            }
            zzcfb zzcfbVar3 = this.k;
            if (zzcfbVar3 != null) {
                zzcfbVar3.destroy();
                this.k = null;
            }
            InterfaceFutureC8411o11 interfaceFutureC8411o11 = this.m;
            if (interfaceFutureC8411o11 != null) {
                interfaceFutureC8411o11.cancel(false);
                this.m = null;
            }
            zzcaf zzcafVar = this.n;
            if (zzcafVar != null) {
                zzcafVar.cancel(false);
                this.n = null;
            }
            this.l = null;
            this.v.clear();
            this.w.clear();
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.h = null;
            this.f266o = null;
            this.p = null;
            this.q = null;
            this.s = null;
            this.t = null;
            this.u = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @InterfaceC11300zs1
    public final synchronized IObjectWrapper i0() {
        return this.q;
    }

    public final synchronized void j(zzbfz zzbfzVar) {
        this.c = zzbfzVar;
    }

    @InterfaceC11300zs1
    public final synchronized InterfaceFutureC8411o11 j0() {
        return this.m;
    }

    public final synchronized void k(String str) {
        this.u = str;
    }

    @InterfaceC11300zs1
    public final synchronized String k0() {
        return f("advertiser");
    }

    public final synchronized void l(@InterfaceC11300zs1 com.google.android.gms.ads.internal.client.zzev zzevVar) {
        this.g = zzevVar;
    }

    @InterfaceC11300zs1
    public final synchronized String l0() {
        return f("body");
    }

    public final synchronized void m(zzbgg zzbggVar) {
        this.s = zzbggVar;
    }

    @InterfaceC11300zs1
    public final synchronized String m0() {
        return f("call_to_action");
    }

    public final synchronized void n(String str, zzbft zzbftVar) {
        if (zzbftVar == null) {
            this.v.remove(str);
        } else {
            this.v.put(str, zzbftVar);
        }
    }

    public final synchronized void o(zzcfb zzcfbVar) {
        this.j = zzcfbVar;
    }

    public final synchronized void p(List list) {
        this.e = list;
    }

    public final synchronized void q(zzbgg zzbggVar) {
        this.t = zzbggVar;
    }

    public final synchronized void r(float f) {
        this.x = f;
    }

    public final synchronized void s(List list) {
        this.f = list;
    }

    public final synchronized void t(zzcfb zzcfbVar) {
        this.k = zzcfbVar;
    }

    public final synchronized void u(InterfaceFutureC8411o11 interfaceFutureC8411o11) {
        this.m = interfaceFutureC8411o11;
    }

    public final synchronized void v(@InterfaceC11300zs1 String str) {
        this.y = str;
    }

    public final synchronized void w(zzeda zzedaVar) {
        this.l = zzedaVar;
    }

    public final synchronized void x(zzcaf zzcafVar) {
        this.n = zzcafVar;
    }

    public final synchronized void y(double d) {
        this.r = d;
    }

    public final synchronized void z(String str, @InterfaceC11300zs1 String str2) {
        if (str2 == null) {
            this.w.remove(str);
        } else {
            this.w.put(str, str2);
        }
    }
}
