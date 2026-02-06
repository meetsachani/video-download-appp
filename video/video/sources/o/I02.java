package o;

import java.util.AbstractCollection;
import java.util.Iterator;
import o.K02;

/* loaded from: classes4.dex */
public class I02 extends AbstractCollection {
    public final /* synthetic */ K02 X;

    public I02(K02 k02) {
        this.X = k02;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.X.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.X.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.X.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new K02.b(1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        if (obj == null) {
            K02.a aVar = this.X.X;
            do {
                aVar = aVar.Z;
                if (aVar == this.X.X) {
                    return false;
                }
            } while (aVar.getValue() != null);
            this.X.z(aVar.getKey());
            return true;
        }
        K02.a aVar2 = this.X.X;
        do {
            aVar2 = aVar2.Z;
            if (aVar2 == this.X.X) {
                return false;
            }
        } while (!obj.equals(aVar2.getValue()));
        this.X.z(aVar2.getKey());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.X.size();
    }
}
