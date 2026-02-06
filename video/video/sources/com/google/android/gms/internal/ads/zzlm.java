package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.C3144Hh1;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzlm {
    public final zzpc a;
    public final zzll e;
    public final zzmj h;
    public final zzdq i;
    public boolean j;
    @InterfaceC11300zs1
    public zzhg k;
    public zzww l = new zzww(0);
    public final IdentityHashMap c = new IdentityHashMap();
    public final Map d = new HashMap();
    public final List b = new ArrayList();
    public final HashMap f = new HashMap();
    public final Set g = new HashSet();

    public zzlm(zzll zzllVar, zzmj zzmjVar, zzdq zzdqVar, zzpc zzpcVar) {
        this.a = zzpcVar;
        this.e = zzllVar;
        this.h = zzmjVar;
        this.i = zzdqVar;
    }

    public final int a() {
        return this.b.size();
    }

    public final zzbl b() {
        List list = this.b;
        if (!list.isEmpty()) {
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                zzlk zzlkVar = (zzlk) list.get(i2);
                zzlkVar.d = i;
                i += zzlkVar.a.H().c();
            }
            return new zzlt(list, this.l);
        }
        return zzbl.a;
    }

    public final zzbl c(int i, int i2, List list) {
        boolean z;
        boolean z2 = true;
        if (i >= 0 && i <= i2 && i2 <= a()) {
            z = true;
        } else {
            z = false;
        }
        zzdc.d(z);
        if (list.size() != i2 - i) {
            z2 = false;
        }
        zzdc.d(z2);
        for (int i3 = i; i3 < i2; i3++) {
            ((zzlk) this.b.get(i3)).a.g((zzap) list.get(i3 - i));
        }
        return b();
    }

    public final void g(@InterfaceC11300zs1 zzhg zzhgVar) {
        zzdc.f(!this.j);
        this.k = zzhgVar;
        int i = 0;
        while (true) {
            List list = this.b;
            if (i < list.size()) {
                zzlk zzlkVar = (zzlk) list.get(i);
                v(zzlkVar);
                this.g.add(zzlkVar);
                i++;
            } else {
                this.j = true;
                return;
            }
        }
    }

    public final void h() {
        for (zzlj zzljVar : this.f.values()) {
            try {
                zzljVar.a.a(zzljVar.b);
            } catch (RuntimeException e) {
                zzdx.d(C3144Hh1.m, "Failed to release child source.", e);
            }
            zzvd zzvdVar = zzljVar.a;
            zzli zzliVar = zzljVar.c;
            zzvdVar.f(zzliVar);
            zzvdVar.d(zzliVar);
        }
        this.f.clear();
        this.g.clear();
        this.j = false;
    }

    public final void i(zzuz zzuzVar) {
        IdentityHashMap identityHashMap = this.c;
        zzlk zzlkVar = (zzlk) identityHashMap.remove(zzuzVar);
        zzlkVar.getClass();
        zzlkVar.a.c(zzuzVar);
        zzlkVar.c.remove(((zzut) zzuzVar).X);
        if (!identityHashMap.isEmpty()) {
            t();
        }
        u(zzlkVar);
    }

    public final boolean j() {
        return this.j;
    }

    public final zzbl k(int i, List list, zzww zzwwVar) {
        if (!list.isEmpty()) {
            this.l = zzwwVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                zzlk zzlkVar = (zzlk) list.get(i2 - i);
                if (i2 > 0) {
                    zzlk zzlkVar2 = (zzlk) this.b.get(i2 - 1);
                    zzlkVar.c(zzlkVar2.d + zzlkVar2.a.H().c());
                } else {
                    zzlkVar.c(0);
                }
                r(i2, zzlkVar.a.H().c());
                this.b.add(i2, zzlkVar);
                this.d.put(zzlkVar.b, zzlkVar);
                if (this.j) {
                    v(zzlkVar);
                    if (this.c.isEmpty()) {
                        this.g.add(zzlkVar);
                    } else {
                        s(zzlkVar);
                    }
                }
            }
        }
        return b();
    }

    public final zzbl l(int i, int i2, int i3, zzww zzwwVar) {
        boolean z;
        if (a() >= 0) {
            z = true;
        } else {
            z = false;
        }
        zzdc.d(z);
        this.l = null;
        return b();
    }

    public final zzbl m(int i, int i2, zzww zzwwVar) {
        boolean z = false;
        if (i >= 0 && i <= i2 && i2 <= a()) {
            z = true;
        }
        zzdc.d(z);
        this.l = zzwwVar;
        w(i, i2);
        return b();
    }

    public final zzbl n(List list, zzww zzwwVar) {
        List list2 = this.b;
        w(0, list2.size());
        return k(list2.size(), list, zzwwVar);
    }

    public final zzbl o(zzww zzwwVar) {
        int a = a();
        if (zzwwVar.c() != a) {
            zzwwVar = zzwwVar.f().g(0, a);
        }
        this.l = zzwwVar;
        return b();
    }

    public final zzuz p(zzvb zzvbVar, zzzg zzzgVar, long j) {
        int i = zzlt.k;
        Pair pair = (Pair) zzvbVar.a;
        Object obj = pair.first;
        zzvb a = zzvbVar.a(pair.second);
        zzlk zzlkVar = (zzlk) this.d.get(obj);
        zzlkVar.getClass();
        this.g.add(zzlkVar);
        zzlj zzljVar = (zzlj) this.f.get(zzlkVar);
        if (zzljVar != null) {
            zzljVar.a.e(zzljVar.b);
        }
        zzlkVar.c.add(a);
        zzut k = zzlkVar.a.k(a, zzzgVar, j);
        this.c.put(k, zzlkVar);
        t();
        return k;
    }

    public final zzww q() {
        return this.l;
    }

    public final void r(int i, int i2) {
        while (true) {
            List list = this.b;
            if (i < list.size()) {
                ((zzlk) list.get(i)).d += i2;
                i++;
            } else {
                return;
            }
        }
    }

    public final void s(zzlk zzlkVar) {
        zzlj zzljVar = (zzlj) this.f.get(zzlkVar);
        if (zzljVar != null) {
            zzljVar.a.i(zzljVar.b);
        }
    }

    public final void t() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            zzlk zzlkVar = (zzlk) it.next();
            if (zzlkVar.c.isEmpty()) {
                s(zzlkVar);
                it.remove();
            }
        }
    }

    public final void u(zzlk zzlkVar) {
        if (zzlkVar.e && zzlkVar.c.isEmpty()) {
            zzlj zzljVar = (zzlj) this.f.remove(zzlkVar);
            zzljVar.getClass();
            zzvd zzvdVar = zzljVar.a;
            zzvdVar.a(zzljVar.b);
            zzli zzliVar = zzljVar.c;
            zzvdVar.f(zzliVar);
            zzvdVar.d(zzliVar);
            this.g.remove(zzlkVar);
        }
    }

    public final void v(zzlk zzlkVar) {
        zzuw zzuwVar = zzlkVar.a;
        zzvc zzvcVar = new zzvc() { // from class: com.google.android.gms.internal.ads.zzlc
            @Override // com.google.android.gms.internal.ads.zzvc
            public final void a(zzvd zzvdVar, zzbl zzblVar) {
                zzlm.this.e.j();
            }
        };
        zzli zzliVar = new zzli(this, zzlkVar);
        this.f.put(zzlkVar, new zzlj(zzuwVar, zzvcVar, zzliVar));
        zzuwVar.l(new Handler(zzeu.U(), null), zzliVar);
        zzuwVar.b(new Handler(zzeu.U(), null), zzliVar);
        zzuwVar.h(zzvcVar, this.k, this.a);
    }

    public final void w(int i, int i2) {
        while (true) {
            i2--;
            if (i2 >= i) {
                zzlk zzlkVar = (zzlk) this.b.remove(i2);
                this.d.remove(zzlkVar.b);
                r(i2, -zzlkVar.a.H().c());
                zzlkVar.e = true;
                if (this.j) {
                    u(zzlkVar);
                }
            } else {
                return;
            }
        }
    }
}
