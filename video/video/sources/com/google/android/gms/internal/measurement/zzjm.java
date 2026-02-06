package com.google.android.gms.internal.measurement;

import java.util.Map;

/* loaded from: classes3.dex */
final class zzjm<K> implements Map.Entry<K, Object> {
    public Map.Entry<K, zzjj> X;

    public final zzjj a() {
        return this.X.getValue();
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.X.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.X.getValue() == null) {
            return null;
        }
        return zzjj.e();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof zzkj) {
            return this.X.getValue().a((zzkj) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public zzjm(Map.Entry<K, zzjj> entry) {
        this.X = entry;
    }
}
