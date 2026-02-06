package o;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import o.C10380w50;

/* renamed from: o.l50  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7679l50 extends AbstractSet {
    public final /* synthetic */ C10380w50 X;

    public C7679l50(C10380w50 c10380w50) {
        this.X = c10380w50;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.X.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        C10380w50.b K;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        K = this.X.K((Comparable) entry.getValue(), 1);
        if (K == null || !K.o(0).equals(key)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new C7436k50(this, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        C10380w50.b K;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        K = this.X.K((Comparable) entry.getValue(), 1);
        if (K != null && K.o(0).equals(key)) {
            this.X.r(K);
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.X.size();
    }
}
