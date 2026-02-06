package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.util.Clock;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zzbzr implements zzazn {
    public final com.google.android.gms.ads.internal.util.zzg Y;
    @InterfaceC5056aJ2
    public final zzbzo Y0;
    public final Object X = new Object();
    @InterfaceC5056aJ2
    public final HashSet Z0 = new HashSet();
    @InterfaceC5056aJ2
    public final HashSet a1 = new HashSet();
    public boolean b1 = false;
    public final zzbzp Z = new zzbzp();

    public zzbzr(String str, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.Y0 = new zzbzo(str, zzgVar);
        this.Y = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzazn
    public final void O0(boolean z) {
        long a = com.google.android.gms.ads.internal.zzv.d().a();
        if (z) {
            com.google.android.gms.ads.internal.util.zzg zzgVar = this.Y;
            if (a - zzgVar.f() > ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.h1)).longValue()) {
                this.Y0.d = -1;
            } else {
                this.Y0.d = zzgVar.c();
            }
            this.b1 = true;
            return;
        }
        com.google.android.gms.ads.internal.util.zzg zzgVar2 = this.Y;
        zzgVar2.m0(a);
        zzgVar2.c0(this.Y0.d);
    }

    public final int a() {
        int a;
        synchronized (this.X) {
            a = this.Y0.a();
        }
        return a;
    }

    public final zzbzg b(Clock clock, String str) {
        return new zzbzg(clock, this, this.Z.a(), str);
    }

    public final String c() {
        return this.Z.b();
    }

    public final void d(zzbzg zzbzgVar) {
        synchronized (this.X) {
            this.Z0.add(zzbzgVar);
        }
    }

    public final void e() {
        synchronized (this.X) {
            this.Y0.c();
        }
    }

    public final void f() {
        synchronized (this.X) {
            this.Y0.d();
        }
    }

    public final void g() {
        synchronized (this.X) {
            this.Y0.e();
        }
    }

    public final void h() {
        synchronized (this.X) {
            this.Y0.f();
        }
    }

    public final void i(com.google.android.gms.ads.internal.client.zzm zzmVar, long j) {
        synchronized (this.X) {
            this.Y0.g(zzmVar, j);
        }
    }

    public final void j() {
        synchronized (this.X) {
            this.Y0.h();
        }
    }

    public final void k(HashSet hashSet) {
        synchronized (this.X) {
            this.Z0.addAll(hashSet);
        }
    }

    public final boolean l() {
        return this.b1;
    }

    public final Bundle m(Context context, zzfdw zzfdwVar) {
        HashSet hashSet = new HashSet();
        synchronized (this.X) {
            HashSet hashSet2 = this.Z0;
            hashSet.addAll(hashSet2);
            hashSet2.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle(FirebaseMessaging.r, this.Y0.b(context, this.Z.b()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.a1.iterator();
        if (!it.hasNext()) {
            bundle.putBundle("slots", bundle2);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                arrayList.add(((zzbzg) it2.next()).a());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            zzfdwVar.b(hashSet);
            return bundle;
        }
        zzbzq zzbzqVar = (zzbzq) it.next();
        throw null;
    }
}
