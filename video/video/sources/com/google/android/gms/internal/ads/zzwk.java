package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;
import o.C10323vs;
import o.InterfaceC11300zs1;
import o.InterfaceC8710pF0;

/* loaded from: classes2.dex */
public final class zzwk extends zzua implements zzwb {
    public final zzgf h;
    public final zzsb i;
    public final int j;
    public boolean k = true;
    public long l = C10323vs.b;
    public boolean m;
    public boolean n;
    @InterfaceC11300zs1

    /* renamed from: o  reason: collision with root package name */
    public zzhg f298o;
    @InterfaceC8710pF0("this")
    public zzap p;
    public final zzwh q;
    public final zzzk r;

    public /* synthetic */ zzwk(zzap zzapVar, zzgf zzgfVar, zzwh zzwhVar, zzsb zzsbVar, zzzk zzzkVar, int i, int i2, zzz zzzVar, zzfvu zzfvuVar, zzwj zzwjVar) {
        this.p = zzapVar;
        this.h = zzgfVar;
        this.q = zzwhVar;
        this.i = zzsbVar;
        this.r = zzzkVar;
        this.j = i;
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    public final void C() {
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    public final synchronized zzap O() {
        return this.p;
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    public final void c(zzuz zzuzVar) {
        ((zzwf) zzuzVar).A();
    }

    @Override // com.google.android.gms.internal.ads.zzua, com.google.android.gms.internal.ads.zzvd
    public final synchronized void g(zzap zzapVar) {
        this.p = zzapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final void j(long j, zzaem zzaemVar, boolean z) {
        if (j == C10323vs.b) {
            j = this.l;
        }
        boolean h = zzaemVar.h();
        if (!this.k && this.l == j && this.m == h && this.n == z) {
            return;
        }
        this.l = j;
        this.m = h;
        this.n = z;
        this.k = false;
        y();
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    public final zzuz k(zzvb zzvbVar, zzzg zzzgVar, long j) {
        zzgg a = this.h.a();
        zzhg zzhgVar = this.f298o;
        if (zzhgVar != null) {
            a.b(zzhgVar);
        }
        zzak zzakVar = O().b;
        zzakVar.getClass();
        Uri uri = zzakVar.a;
        zzwh zzwhVar = this.q;
        m();
        return new zzwf(uri, a, new zzud(zzwhVar.a), this.i, n(zzvbVar), this.r, p(zzvbVar), this, zzzgVar, null, this.j, 0, null, zzeu.N(C10323vs.b), null);
    }

    @Override // com.google.android.gms.internal.ads.zzua
    public final void u(@InterfaceC11300zs1 zzhg zzhgVar) {
        this.f298o = zzhgVar;
        Looper.myLooper().getClass();
        m();
        y();
    }

    @Override // com.google.android.gms.internal.ads.zzua
    public final void w() {
    }

    public final void y() {
        zzaj zzajVar;
        long j = this.l;
        boolean z = this.m;
        boolean z2 = this.n;
        zzap O = O();
        if (z2) {
            zzajVar = O.c;
        } else {
            zzajVar = null;
        }
        zzbl zzwxVar = new zzwx(C10323vs.b, C10323vs.b, C10323vs.b, j, j, 0L, 0L, z, false, false, null, O, zzajVar);
        if (this.k) {
            zzwxVar = new zzwg(this, zzwxVar);
        }
        v(zzwxVar);
    }
}
