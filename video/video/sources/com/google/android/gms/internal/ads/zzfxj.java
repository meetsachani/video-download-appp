package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzfxj extends AbstractCollection {
    public final /* synthetic */ zzfxl X;

    public zzfxj(zzfxl zzfxlVar) {
        this.X = zzfxlVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.X.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzfxl zzfxlVar = this.X;
        Map r = zzfxlVar.r();
        if (r != null) {
            return r.values().iterator();
        }
        return new zzfxe(zzfxlVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.X.size();
    }
}
