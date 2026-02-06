package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.List;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzfcp {
    @InterfaceC11300zs1
    public final com.google.android.gms.ads.internal.client.zzfw a;
    @InterfaceC11300zs1
    public final zzbmg b;
    @InterfaceC11300zs1
    public final zzekr c;
    public final com.google.android.gms.ads.internal.client.zzm d;
    public final com.google.android.gms.ads.internal.client.zzr e;
    public final String f;
    public final ArrayList g;
    public final ArrayList h;
    @InterfaceC11300zs1
    public final zzbfv i;
    public final com.google.android.gms.ads.internal.client.zzx j;
    public final int k;
    public final AdManagerAdViewOptions l;
    public final PublisherAdViewOptions m;
    @InterfaceC11300zs1
    public final com.google.android.gms.ads.internal.client.zzcl n;

    /* renamed from: o  reason: collision with root package name */
    public final zzfcc f280o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final Bundle s;
    @InterfaceC11300zs1
    public final com.google.android.gms.ads.internal.client.zzcp t;

    public /* synthetic */ zzfcp(zzfcn zzfcnVar, zzfco zzfcoVar) {
        com.google.android.gms.ads.internal.client.zzfw zzfwVar;
        zzbfv H;
        this.e = zzfcn.C(zzfcnVar);
        this.f = zzfcn.k(zzfcnVar);
        this.t = zzfcn.u(zzfcnVar);
        int i = zzfcn.A(zzfcnVar).X;
        long j = zzfcn.A(zzfcnVar).Y;
        Bundle bundle = zzfcn.A(zzfcnVar).Z;
        int i2 = zzfcn.A(zzfcnVar).Y0;
        List list = zzfcn.A(zzfcnVar).Z0;
        boolean z = zzfcn.A(zzfcnVar).a1;
        int i3 = zzfcn.A(zzfcnVar).b1;
        boolean z2 = true;
        if (!zzfcn.A(zzfcnVar).c1 && !zzfcn.r(zzfcnVar)) {
            z2 = false;
        }
        this.d = new com.google.android.gms.ads.internal.client.zzm(i, j, bundle, i2, list, z, i3, z2, zzfcn.A(zzfcnVar).d1, zzfcn.A(zzfcnVar).e1, zzfcn.A(zzfcnVar).f1, zzfcn.A(zzfcnVar).g1, zzfcn.A(zzfcnVar).h1, zzfcn.A(zzfcnVar).i1, zzfcn.A(zzfcnVar).j1, zzfcn.A(zzfcnVar).k1, zzfcn.A(zzfcnVar).l1, zzfcn.A(zzfcnVar).m1, zzfcn.A(zzfcnVar).n1, zzfcn.A(zzfcnVar).o1, zzfcn.A(zzfcnVar).p1, zzfcn.A(zzfcnVar).q1, com.google.android.gms.ads.internal.util.zzs.A(zzfcn.A(zzfcnVar).r1), zzfcn.A(zzfcnVar).s1, zzfcn.A(zzfcnVar).t1, zzfcn.A(zzfcnVar).u1);
        if (zzfcn.G(zzfcnVar) != null) {
            zzfwVar = zzfcn.G(zzfcnVar);
        } else if (zzfcn.H(zzfcnVar) != null) {
            zzfwVar = zzfcn.H(zzfcnVar).a1;
        } else {
            zzfwVar = null;
        }
        this.a = zzfwVar;
        this.g = zzfcn.m(zzfcnVar);
        this.h = zzfcn.n(zzfcnVar);
        if (zzfcn.m(zzfcnVar) == null) {
            H = null;
        } else if (zzfcn.H(zzfcnVar) == null) {
            H = new zzbfv(new NativeAdOptions.Builder().a());
        } else {
            H = zzfcn.H(zzfcnVar);
        }
        this.i = H;
        this.j = zzfcn.E(zzfcnVar);
        this.k = zzfcn.w(zzfcnVar);
        this.l = zzfcn.y(zzfcnVar);
        this.m = zzfcn.z(zzfcnVar);
        this.n = zzfcn.F(zzfcnVar);
        this.b = zzfcn.I(zzfcnVar);
        this.f280o = new zzfcc(zzfcn.K(zzfcnVar), null);
        this.p = zzfcn.o(zzfcnVar);
        this.q = zzfcn.p(zzfcnVar);
        this.c = zzfcn.J(zzfcnVar);
        this.r = zzfcn.q(zzfcnVar);
        this.s = zzfcn.x(zzfcnVar);
    }

    public final boolean a() {
        zzbcm zzbcmVar = zzbcv.x3;
        return this.f.matches((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar));
    }
}
