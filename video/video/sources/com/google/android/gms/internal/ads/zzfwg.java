package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzfwg extends zzfyv {
    public final /* synthetic */ zzfwi X;

    public zzfwg(zzfwi zzfwiVar) {
        this.X = zzfwiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfyv, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return zzfxb.a(this.X.Y0.entrySet(), obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final Map d() {
        return this.X;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzfwh(this.X);
    }

    @Override // com.google.android.gms.internal.ads.zzfyv, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        zzfwi zzfwiVar = this.X;
        zzfwv.r(zzfwiVar.Z0, entry.getKey());
        return true;
    }
}
