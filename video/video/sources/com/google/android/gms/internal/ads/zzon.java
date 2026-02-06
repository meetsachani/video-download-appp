package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzon {
    public final zzbj a;
    public zzfyc b = zzfyc.F();
    public zzfyf c = zzfyf.d();
    @InterfaceC11300zs1
    public zzvb d;
    public zzvb e;
    public zzvb f;

    public zzon(zzbj zzbjVar) {
        this.a = zzbjVar;
    }

    @InterfaceC11300zs1
    public static zzvb j(zzbh zzbhVar, zzfyc zzfycVar, @InterfaceC11300zs1 zzvb zzvbVar, zzbj zzbjVar) {
        Object f;
        zzbl p = zzbhVar.p();
        int e = zzbhVar.e();
        if (p.o()) {
            f = null;
        } else {
            f = p.f(e);
        }
        int i = -1;
        if (!zzbhVar.y() && !p.o()) {
            i = p.d(e, zzbjVar, false).c(zzeu.N(zzbhVar.l()));
        }
        int i2 = i;
        for (int i3 = 0; i3 < zzfycVar.size(); i3++) {
            zzvb zzvbVar2 = (zzvb) zzfycVar.get(i3);
            if (m(zzvbVar2, f, zzbhVar.y(), zzbhVar.c(), zzbhVar.f(), i2)) {
                return zzvbVar2;
            }
        }
        if (!zzfycVar.isEmpty() || zzvbVar == null || !m(zzvbVar, f, zzbhVar.y(), zzbhVar.c(), zzbhVar.f(), i2)) {
            return null;
        }
        return zzvbVar;
    }

    public static boolean m(zzvb zzvbVar, @InterfaceC11300zs1 Object obj, boolean z, int i, int i2, int i3) {
        if (!zzvbVar.a.equals(obj)) {
            return false;
        }
        if (z) {
            if (zzvbVar.b != i || zzvbVar.c != i2) {
                return false;
            }
            return true;
        } else if (zzvbVar.b != -1 || zzvbVar.e != i3) {
            return false;
        } else {
            return true;
        }
    }

    @InterfaceC11300zs1
    public final zzbl a(zzvb zzvbVar) {
        return (zzbl) this.c.get(zzvbVar);
    }

    @InterfaceC11300zs1
    public final zzvb b() {
        return this.d;
    }

    @InterfaceC11300zs1
    public final zzvb c() {
        Object next;
        Object obj;
        if (this.b.isEmpty()) {
            return null;
        }
        zzfyc zzfycVar = this.b;
        if (zzfycVar != null) {
            if (!zzfycVar.isEmpty()) {
                obj = zzfycVar.get(zzfycVar.size() - 1);
            } else {
                throw new NoSuchElementException();
            }
        } else {
            Iterator<E> it = zzfycVar.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        }
        return (zzvb) obj;
    }

    @InterfaceC11300zs1
    public final zzvb d() {
        return this.e;
    }

    @InterfaceC11300zs1
    public final zzvb e() {
        return this.f;
    }

    public final void g(zzbh zzbhVar) {
        this.d = j(zzbhVar, this.b, this.e, this.a);
    }

    public final void h(List list, @InterfaceC11300zs1 zzvb zzvbVar, zzbh zzbhVar) {
        this.b = zzfyc.B(list);
        if (!list.isEmpty()) {
            this.e = (zzvb) list.get(0);
            zzvbVar.getClass();
            this.f = zzvbVar;
        }
        if (this.d == null) {
            this.d = j(zzbhVar, this.b, this.e, this.a);
        }
        l(zzbhVar.p());
    }

    public final void i(zzbh zzbhVar) {
        this.d = j(zzbhVar, this.b, this.e, this.a);
        l(zzbhVar.p());
    }

    public final void k(zzfye zzfyeVar, @InterfaceC11300zs1 zzvb zzvbVar, zzbl zzblVar) {
        if (zzvbVar != null) {
            if (zzblVar.a(zzvbVar.a) != -1) {
                zzfyeVar.a(zzvbVar, zzblVar);
                return;
            }
            zzbl zzblVar2 = (zzbl) this.c.get(zzvbVar);
            if (zzblVar2 != null) {
                zzfyeVar.a(zzvbVar, zzblVar2);
            }
        }
    }

    public final void l(zzbl zzblVar) {
        zzfye zzfyeVar = new zzfye();
        if (this.b.isEmpty()) {
            k(zzfyeVar, this.e, zzblVar);
            if (!Objects.equals(this.f, this.e)) {
                k(zzfyeVar, this.f, zzblVar);
            }
            if (!Objects.equals(this.d, this.e) && !Objects.equals(this.d, this.f)) {
                k(zzfyeVar, this.d, zzblVar);
            }
        } else {
            for (int i = 0; i < this.b.size(); i++) {
                k(zzfyeVar, (zzvb) this.b.get(i), zzblVar);
            }
            if (!this.b.contains(this.d)) {
                k(zzfyeVar, this.d, zzblVar);
            }
        }
        this.c = zzfyeVar.c();
    }
}
