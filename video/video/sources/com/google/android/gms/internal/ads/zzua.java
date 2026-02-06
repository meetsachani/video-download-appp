package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public abstract class zzua implements zzvd {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final zzvl c = new zzvl();
    public final zzrw d = new zzrw();
    @InterfaceC11300zs1
    public Looper e;
    @InterfaceC11300zs1
    public zzbl f;
    @InterfaceC11300zs1
    public zzpc g;

    @Override // com.google.android.gms.internal.ads.zzvd
    public /* synthetic */ zzbl K() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    public final void a(zzvc zzvcVar) {
        ArrayList arrayList = this.a;
        arrayList.remove(zzvcVar);
        if (arrayList.isEmpty()) {
            this.e = null;
            this.f = null;
            this.g = null;
            this.b.clear();
            w();
            return;
        }
        i(zzvcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    public final void b(Handler handler, zzrx zzrxVar) {
        this.d.b(handler, zzrxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    public final void d(zzrx zzrxVar) {
        this.d.c(zzrxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    public final void e(zzvc zzvcVar) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(zzvcVar);
        if (isEmpty) {
            t();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    public final void f(zzvm zzvmVar) {
        this.c.i(zzvmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    public /* synthetic */ void g(zzap zzapVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    public final void h(zzvc zzvcVar, @InterfaceC11300zs1 zzhg zzhgVar, zzpc zzpcVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        boolean z = true;
        if (looper != null && looper != myLooper) {
            z = false;
        }
        zzdc.d(z);
        this.g = zzpcVar;
        zzbl zzblVar = this.f;
        this.a.add(zzvcVar);
        if (this.e == null) {
            this.e = myLooper;
            this.b.add(zzvcVar);
            u(zzhgVar);
        } else if (zzblVar != null) {
            e(zzvcVar);
            zzvcVar.a(this, zzblVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    public final void i(zzvc zzvcVar) {
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(zzvcVar);
        if (!isEmpty && hashSet.isEmpty()) {
            s();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    public final void l(Handler handler, zzvm zzvmVar) {
        this.c.b(handler, zzvmVar);
    }

    public final zzpc m() {
        zzpc zzpcVar = this.g;
        zzdc.b(zzpcVar);
        return zzpcVar;
    }

    public final zzrw n(@InterfaceC11300zs1 zzvb zzvbVar) {
        return this.d.a(0, zzvbVar);
    }

    public final zzrw o(int i, @InterfaceC11300zs1 zzvb zzvbVar) {
        return this.d.a(0, zzvbVar);
    }

    public final zzvl p(@InterfaceC11300zs1 zzvb zzvbVar) {
        return this.c.a(0, zzvbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    public /* synthetic */ boolean q() {
        return true;
    }

    public final zzvl r(int i, @InterfaceC11300zs1 zzvb zzvbVar) {
        return this.c.a(0, zzvbVar);
    }

    public void s() {
    }

    public void t() {
    }

    public abstract void u(@InterfaceC11300zs1 zzhg zzhgVar);

    public final void v(zzbl zzblVar) {
        this.f = zzblVar;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zzvc) arrayList.get(i)).a(this, zzblVar);
        }
    }

    public abstract void w();

    public final boolean x() {
        if (!this.b.isEmpty()) {
            return true;
        }
        return false;
    }
}
