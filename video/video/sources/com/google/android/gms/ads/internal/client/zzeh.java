package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.zzfnq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzeh {
    public final String a;
    public final List b;
    public final Set c;
    public final Bundle d;
    public final String e;
    public final String f;
    public final int g;
    public final Set h;
    public final Bundle i;
    public final Set j;
    public final boolean k;
    public final String l;
    public final int m;
    public long n = 0;

    public zzeh(zzeg zzegVar, @InterfaceC11300zs1 zzfnq zzfnqVar) {
        String str;
        List list;
        HashSet hashSet;
        Bundle bundle;
        HashMap hashMap;
        String str2;
        String str3;
        int i;
        HashSet hashSet2;
        Bundle bundle2;
        HashSet hashSet3;
        boolean z;
        String str4;
        int i2;
        str = zzegVar.g;
        this.a = str;
        list = zzegVar.h;
        this.b = list;
        hashSet = zzegVar.a;
        this.c = Collections.unmodifiableSet(hashSet);
        bundle = zzegVar.b;
        this.d = bundle;
        hashMap = zzegVar.c;
        Collections.unmodifiableMap(hashMap);
        str2 = zzegVar.i;
        this.e = str2;
        str3 = zzegVar.j;
        this.f = str3;
        i = zzegVar.k;
        this.g = i;
        hashSet2 = zzegVar.d;
        this.h = Collections.unmodifiableSet(hashSet2);
        bundle2 = zzegVar.e;
        this.i = bundle2;
        hashSet3 = zzegVar.f;
        this.j = Collections.unmodifiableSet(hashSet3);
        z = zzegVar.l;
        this.k = z;
        str4 = zzegVar.m;
        this.l = str4;
        i2 = zzegVar.n;
        this.m = i2;
    }

    public final int a() {
        return this.m;
    }

    public final int b() {
        return this.g;
    }

    public final long c() {
        return this.n;
    }

    @InterfaceC11300zs1
    public final Bundle d(Class cls) {
        Bundle bundle = this.d.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null) {
            return bundle.getBundle(cls.getName());
        }
        return null;
    }

    public final Bundle e() {
        return this.i;
    }

    @InterfaceC11300zs1
    public final Bundle f(Class cls) {
        return this.d.getBundle(cls.getName());
    }

    public final Bundle g() {
        return this.d;
    }

    @InterfaceC11300zs1
    public final String h() {
        return this.l;
    }

    public final String i() {
        return this.a;
    }

    public final String j() {
        return this.e;
    }

    public final String k() {
        return this.f;
    }

    public final List l() {
        return new ArrayList(this.b);
    }

    public final Set m() {
        return this.j;
    }

    public final Set n() {
        return this.c;
    }

    public final void o(long j) {
        this.n = j;
    }

    @Deprecated
    public final boolean p() {
        return this.k;
    }

    public final boolean q(Context context) {
        RequestConfiguration g = zzet.j().g();
        zzbb.b();
        Set set = this.h;
        String E = com.google.android.gms.ads.internal.util.client.zzf.E(context);
        if (!set.contains(E) && !g.e().contains(E)) {
            return false;
        }
        return true;
    }
}
