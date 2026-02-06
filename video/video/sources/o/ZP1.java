package o;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import o.C5083aQ1;

/* loaded from: classes4.dex */
public class ZP1 extends AbstractCollection {
    public final /* synthetic */ C5083aQ1 X;

    public ZP1(C5083aQ1 c5083aQ1) {
        this.X = c5083aQ1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.X.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C5083aQ1.e(this.X, null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.X.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[0]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        ArrayList arrayList = new ArrayList(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList.toArray(objArr);
    }
}
