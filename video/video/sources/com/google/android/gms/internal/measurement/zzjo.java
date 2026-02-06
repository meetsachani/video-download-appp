package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzjo<K> implements Iterator<Map.Entry<K, Object>> {
    public Iterator<Map.Entry<K, Object>> X;

    public zzjo(Iterator<Map.Entry<K, Object>> it) {
        this.X = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.X.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.X.next();
        if (next.getValue() instanceof zzjj) {
            return new zzjm(next);
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.X.remove();
    }
}
