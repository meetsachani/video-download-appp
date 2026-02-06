package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzfxf extends AbstractSet {
    public final /* synthetic */ zzfxl X;

    public zzfxf(zzfxl zzfxlVar) {
        this.X = zzfxlVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.X.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int D;
        zzfxl zzfxlVar = this.X;
        Map r = zzfxlVar.r();
        if (r != null) {
            return r.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            D = zzfxlVar.D(entry.getKey());
            if (D != -1 && zzfuz.a(zzfxl.n(zzfxlVar, D), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzfxl zzfxlVar = this.X;
        Map r = zzfxlVar.r();
        if (r != null) {
            return r.entrySet().iterator();
        }
        return new zzfxd(zzfxlVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int C;
        int[] a;
        Object[] b;
        Object[] c;
        int i;
        zzfxl zzfxlVar = this.X;
        Map r = zzfxlVar.r();
        if (r != null) {
            return r.entrySet().remove(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (!zzfxlVar.y()) {
                C = zzfxlVar.C();
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object m = zzfxl.m(zzfxlVar);
                a = zzfxlVar.a();
                b = zzfxlVar.b();
                c = zzfxlVar.c();
                int b2 = zzfxm.b(key, value, C, m, a, b, c);
                if (b2 != -1) {
                    zzfxlVar.x(b2, C);
                    i = zzfxlVar.a1;
                    zzfxlVar.a1 = i - 1;
                    zzfxlVar.v();
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.X.size();
    }
}
