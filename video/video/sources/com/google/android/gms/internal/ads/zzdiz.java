package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import o.C9654t62;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzdiz {
    public static final zzdiz h = new zzdiz(new zzdix());
    @InterfaceC11300zs1
    public final zzbhh a;
    @InterfaceC11300zs1
    public final zzbhe b;
    @InterfaceC11300zs1
    public final zzbhu c;
    @InterfaceC11300zs1
    public final zzbhr d;
    @InterfaceC11300zs1
    public final zzbmp e;
    public final C9654t62 f;
    public final C9654t62 g;

    @InterfaceC11300zs1
    public final zzbhe a() {
        return this.b;
    }

    @InterfaceC11300zs1
    public final zzbhh b() {
        return this.a;
    }

    @InterfaceC11300zs1
    public final zzbhk c(String str) {
        return (zzbhk) this.g.get(str);
    }

    @InterfaceC11300zs1
    public final zzbhn d(@InterfaceC11300zs1 String str) {
        if (str == null) {
            return null;
        }
        return (zzbhn) this.f.get(str);
    }

    @InterfaceC11300zs1
    public final zzbhr e() {
        return this.d;
    }

    @InterfaceC11300zs1
    public final zzbhu f() {
        return this.c;
    }

    @InterfaceC11300zs1
    public final zzbmp g() {
        return this.e;
    }

    public final ArrayList h() {
        C9654t62 c9654t62 = this.f;
        ArrayList arrayList = new ArrayList(c9654t62.size());
        for (int i = 0; i < c9654t62.size(); i++) {
            arrayList.add((String) c9654t62.g(i));
        }
        return arrayList;
    }

    public final ArrayList i() {
        ArrayList arrayList = new ArrayList();
        if (this.c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.b != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.f.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.e != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    public zzdiz(zzdix zzdixVar) {
        this.a = zzdixVar.a;
        this.b = zzdixVar.b;
        this.c = zzdixVar.c;
        this.f = new C9654t62(zzdixVar.f);
        this.g = new C9654t62(zzdixVar.g);
        this.d = zzdixVar.d;
        this.e = zzdixVar.e;
    }
}
