package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzfxh extends AbstractSet {
    public final /* synthetic */ zzfxl X;

    public zzfxh(zzfxl zzfxlVar) {
        this.X = zzfxlVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.X.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.X.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzfxl zzfxlVar = this.X;
        Map r = zzfxlVar.r();
        if (r != null) {
            return r.keySet().iterator();
        }
        return new zzfxc(zzfxlVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object F;
        Object obj2;
        zzfxl zzfxlVar = this.X;
        Map r = zzfxlVar.r();
        if (r == null) {
            F = zzfxlVar.F(obj);
            obj2 = zzfxl.e1;
            if (F == obj2) {
                return false;
            }
            return true;
        }
        return r.keySet().remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.X.size();
    }
}
