package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzdbp {
    public final Set a = new HashSet();
    public final Set b = new HashSet();
    public final Set c = new HashSet();
    public final Set d = new HashSet();
    public final Set e = new HashSet();
    public final Set f = new HashSet();
    public final Set g = new HashSet();
    public final Set h = new HashSet();
    public final Set i = new HashSet();
    public final Set j = new HashSet();
    public final Set k = new HashSet();
    public final Set l = new HashSet();
    public final Set m = new HashSet();
    public final Set n = new HashSet();

    /* renamed from: o  reason: collision with root package name */
    public zzezi f259o;

    public final zzdbp d(com.google.android.gms.ads.internal.client.zza zzaVar, Executor executor) {
        this.c.add(new zzddq(zzaVar, executor));
        return this;
    }

    public final zzdbp e(zzcvw zzcvwVar, Executor executor) {
        this.i.add(new zzddq(zzcvwVar, executor));
        return this;
    }

    public final zzdbp f(zzcwj zzcwjVar, Executor executor) {
        this.l.add(new zzddq(zzcwjVar, executor));
        return this;
    }

    public final zzdbp g(zzcwn zzcwnVar, Executor executor) {
        this.f.add(new zzddq(zzcwnVar, executor));
        return this;
    }

    public final zzdbp h(zzcvt zzcvtVar, Executor executor) {
        this.e.add(new zzddq(zzcvtVar, executor));
        return this;
    }

    public final zzdbp i(zzcxh zzcxhVar, Executor executor) {
        this.h.add(new zzddq(zzcxhVar, executor));
        return this;
    }

    public final zzdbp j(zzcxs zzcxsVar, Executor executor) {
        this.g.add(new zzddq(zzcxsVar, executor));
        return this;
    }

    public final zzdbp k(com.google.android.gms.ads.internal.overlay.zzr zzrVar, Executor executor) {
        this.n.add(new zzddq(zzrVar, executor));
        return this;
    }

    public final zzdbp l(zzcyf zzcyfVar, Executor executor) {
        this.m.add(new zzddq(zzcyfVar, executor));
        return this;
    }

    public final zzdbp m(zzcyv zzcyvVar, Executor executor) {
        this.b.add(new zzddq(zzcyvVar, executor));
        return this;
    }

    public final zzdbp n(AppEventListener appEventListener, Executor executor) {
        this.k.add(new zzddq(appEventListener, executor));
        return this;
    }

    public final zzdbp o(zzddy zzddyVar, Executor executor) {
        this.d.add(new zzddq(zzddyVar, executor));
        return this;
    }

    public final zzdbp p(zzezi zzeziVar) {
        this.f259o = zzeziVar;
        return this;
    }

    public final zzdbr q() {
        return new zzdbr(this, null);
    }
}
