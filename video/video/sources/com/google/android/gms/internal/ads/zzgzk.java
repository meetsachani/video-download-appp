package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
final class zzgzk implements Map.Entry {
    public final Map.Entry X;

    public final zzgzn a() {
        return (zzgzn) this.X.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.X.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((zzgzn) this.X.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof zzhad) {
            return ((zzgzn) this.X.getValue()).c((zzhad) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
