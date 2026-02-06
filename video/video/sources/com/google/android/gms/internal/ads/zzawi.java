package com.google.android.gms.internal.ads;

import android.view.View;
import com.facebook.a0;
import java.util.HashMap;
import java.util.Map;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
final class zzawi implements zzfpu {
    public final zzfnz a;
    public final zzfoo b;
    public final zzawv c;
    public final zzawh d;
    public final zzavr e;
    public final zzawx f;
    public final zzawp g;
    public final zzawg h;

    public zzawi(@InterfaceC5670cr1 zzfnz zzfnzVar, @InterfaceC5670cr1 zzfoo zzfooVar, @InterfaceC5670cr1 zzawv zzawvVar, @InterfaceC5670cr1 zzawh zzawhVar, @InterfaceC11300zs1 zzavr zzavrVar, @InterfaceC11300zs1 zzawx zzawxVar, @InterfaceC11300zs1 zzawp zzawpVar, @InterfaceC11300zs1 zzawg zzawgVar) {
        this.a = zzfnzVar;
        this.b = zzfooVar;
        this.c = zzawvVar;
        this.d = zzawhVar;
        this.e = zzavrVar;
        this.f = zzawxVar;
        this.g = zzawpVar;
        this.h = zzawgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpu
    public final Map a() {
        zzawv zzawvVar = this.c;
        Map e = e();
        e.put("lts", Long.valueOf(zzawvVar.a()));
        return e;
    }

    @Override // com.google.android.gms.internal.ads.zzfpu
    public final Map b() {
        return e();
    }

    @Override // com.google.android.gms.internal.ads.zzfpu
    public final Map c() {
        zzawg zzawgVar = this.h;
        Map e = e();
        if (zzawgVar != null) {
            e.put("vst", zzawgVar.a());
        }
        return e;
    }

    public final void d(View view) {
        this.c.d(view);
    }

    public final Map e() {
        HashMap hashMap = new HashMap();
        zzfnz zzfnzVar = this.a;
        zzath b = this.b.b();
        hashMap.put("v", zzfnzVar.d());
        hashMap.put("gms", Boolean.valueOf(zzfnzVar.g()));
        hashMap.put(a0.y, b.k3());
        hashMap.put("attts", Long.valueOf(b.j3().s2()));
        hashMap.put("att", b.j3().v2());
        hashMap.put("attkid", b.j3().w2());
        hashMap.put("up", Boolean.valueOf(this.d.a()));
        hashMap.put("t", new Throwable());
        zzawp zzawpVar = this.g;
        if (zzawpVar != null) {
            hashMap.put("tcq", Long.valueOf(zzawpVar.c()));
            hashMap.put("tpq", Long.valueOf(zzawpVar.g()));
            hashMap.put("tcv", Long.valueOf(zzawpVar.d()));
            hashMap.put("tpv", Long.valueOf(zzawpVar.h()));
            hashMap.put("tchv", Long.valueOf(zzawpVar.b()));
            hashMap.put("tphv", Long.valueOf(zzawpVar.f()));
            hashMap.put("tcc", Long.valueOf(zzawpVar.a()));
            hashMap.put("tpc", Long.valueOf(zzawpVar.e()));
            zzavr zzavrVar = this.e;
            if (zzavrVar != null) {
                hashMap.put("nt", Long.valueOf(zzavrVar.a()));
            }
            zzawx zzawxVar = this.f;
            if (zzawxVar != null) {
                hashMap.put("vs", Long.valueOf(zzawxVar.c()));
                hashMap.put("vf", Long.valueOf(zzawxVar.b()));
            }
        }
        return hashMap;
    }
}
