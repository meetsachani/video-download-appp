package o;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: o.p50  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8670p50 extends AbstractCollection {
    public final /* synthetic */ C10380w50 X;

    public C8670p50(C10380w50 c10380w50) {
        this.X = c10380w50;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.X.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.X.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C8426o50(this, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        int i;
        int i2;
        i = this.X.Y;
        this.X.l0(obj);
        i2 = this.X.Y;
        if (i2 != i) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        boolean z = false;
        for (Object obj : collection) {
            if (this.X.l0(obj) != null) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.X.size();
    }
}
