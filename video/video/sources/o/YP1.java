package o;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
import o.C5083aQ1;

/* loaded from: classes4.dex */
public class YP1 extends AbstractSet {
    public final /* synthetic */ C5083aQ1 X;

    public YP1(C5083aQ1 c5083aQ1) {
        this.X = c5083aQ1;
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
        return new C5083aQ1.c(this.X, null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (this.X.remove(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.X.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return toArray(new Object[0]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        ArrayList arrayList = new ArrayList(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList.toArray(objArr);
    }
}
