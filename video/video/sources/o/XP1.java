package o;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import o.C5083aQ1;

/* loaded from: classes4.dex */
public class XP1 extends AbstractSet {
    public final /* synthetic */ C5083aQ1 X;

    public XP1(C5083aQ1 c5083aQ1) {
        this.X = c5083aQ1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.X.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        C5083aQ1.a i;
        if (obj == null || !(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        i = this.X.i(entry.getKey());
        if (i == null || !entry.equals(i)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new C5083aQ1.b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        boolean contains = contains(obj);
        if (contains) {
            this.X.remove(((Map.Entry) obj).getKey());
        }
        return contains;
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
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            C5083aQ1.a aVar = (C5083aQ1.a) it.next();
            arrayList.add(new DZ(aVar.getKey(), aVar.getValue()));
        }
        return arrayList.toArray(objArr);
    }
}
