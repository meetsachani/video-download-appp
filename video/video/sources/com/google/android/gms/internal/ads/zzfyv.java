package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes2.dex */
abstract class zzfyv extends zzgab {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        d().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object a = zzfyz.a(d(), key);
            if (zzfuz.a(a, entry.getValue())) {
                if (a == null && !d().containsKey(key)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public abstract Map d();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return d().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (contains(obj) && (obj instanceof Map.Entry)) {
            return d().keySet().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgab, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            if (collection != null) {
                return zzgae.e(this, collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            return zzgae.f(this, collection.iterator());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgab, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i;
        try {
            if (collection != null) {
                return super.retainAll(collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                zzfwz.a(size, "expectedSize");
                i = size + 1;
            } else if (size < 1073741824) {
                i = (int) Math.ceil(size / 0.75d);
            } else {
                i = Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i);
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return d().keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return d().size();
    }
}
