package o;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import o.C10380w50;

/* renamed from: o.v50  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10134v50 extends AbstractSet {
    public final /* synthetic */ C10380w50 X;

    public C10134v50(C10380w50 c10380w50) {
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
        Object value = entry.getValue();
        K = this.X.K((Comparable) entry.getKey(), 0);
        if (K == null || !K.o(1).equals(value)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new C9891u50(this, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        C10380w50.b K;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object value = entry.getValue();
        K = this.X.K((Comparable) entry.getKey(), 0);
        if (K != null && K.o(1).equals(value)) {
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
