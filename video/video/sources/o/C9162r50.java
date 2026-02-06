package o;

import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: o.r50  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9162r50 extends AbstractSet {
    public final /* synthetic */ C10380w50 X;

    public C9162r50(C10380w50 c10380w50) {
        this.X = c10380w50;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.X.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.X.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new C8913q50(this, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int i;
        int i2;
        i = this.X.Y;
        this.X.remove(obj);
        i2 = this.X.Y;
        if (i2 != i) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.X.size();
    }
}
