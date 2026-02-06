package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.InterfaceC5299bJ2;

/* loaded from: classes3.dex */
public final class zzh {
    @InterfaceC5299bJ2
    public final zzh a;
    @InterfaceC5299bJ2
    public zzbb b;
    @InterfaceC5299bJ2
    public Map<String, zzaq> c = new HashMap();
    @InterfaceC5299bJ2
    public Map<String, Boolean> d = new HashMap();

    public zzh(zzh zzhVar, zzbb zzbbVar) {
        this.a = zzhVar;
        this.b = zzbbVar;
    }

    public final zzaq a(zzaf zzafVar) {
        zzaq zzaqVar = zzaq.i;
        Iterator<Integer> J = zzafVar.J();
        while (J.hasNext()) {
            zzaqVar = this.b.a(this, zzafVar.l(J.next().intValue()));
            if (zzaqVar instanceof zzaj) {
                break;
            }
        }
        return zzaqVar;
    }

    public final zzaq b(zzaq zzaqVar) {
        return this.b.a(this, zzaqVar);
    }

    public final zzaq c(String str) {
        zzh zzhVar = this;
        while (!zzhVar.c.containsKey(str)) {
            zzhVar = zzhVar.a;
            if (zzhVar == null) {
                throw new IllegalArgumentException(String.format("%s is not defined", str));
            }
        }
        return zzhVar.c.get(str);
    }

    public final zzh d() {
        return new zzh(this, this.b);
    }

    public final void e(String str, zzaq zzaqVar) {
        if (!this.d.containsKey(str)) {
            if (zzaqVar == null) {
                this.c.remove(str);
            } else {
                this.c.put(str, zzaqVar);
            }
        }
    }

    public final void f(String str, zzaq zzaqVar) {
        e(str, zzaqVar);
        this.d.put(str, Boolean.TRUE);
    }

    public final boolean g(String str) {
        zzh zzhVar = this;
        while (!zzhVar.c.containsKey(str)) {
            zzhVar = zzhVar.a;
            if (zzhVar == null) {
                return false;
            }
        }
        return true;
    }

    public final void h(String str, zzaq zzaqVar) {
        zzh zzhVar;
        zzh zzhVar2 = this;
        while (!zzhVar2.c.containsKey(str) && (zzhVar = zzhVar2.a) != null && zzhVar.g(str)) {
            zzhVar2 = zzhVar2.a;
        }
        if (!zzhVar2.d.containsKey(str)) {
            if (zzaqVar == null) {
                zzhVar2.c.remove(str);
            } else {
                zzhVar2.c.put(str, zzaqVar);
            }
        }
    }
}
