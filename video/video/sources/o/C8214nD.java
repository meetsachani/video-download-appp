package o;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: o.nD  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8214nD implements Iterator<Class<?>> {
    public Iterator X = Collections.EMPTY_SET.iterator();
    public final /* synthetic */ Iterator Y;
    public final /* synthetic */ Set Z;

    public C8214nD(Iterator it, Set set) {
        this.Y = it;
        this.Z = set;
    }

    @Override // java.util.Iterator
    /* renamed from: b */
    public Class<?> next() {
        if (this.X.hasNext()) {
            Class<?> cls = (Class) this.X.next();
            this.Z.add(cls);
            return cls;
        }
        Class<?> cls2 = (Class) this.Y.next();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c(linkedHashSet, cls2);
        this.X = linkedHashSet.iterator();
        return cls2;
    }

    public final void c(Set<Class<?>> set, Class<?> cls) {
        Class<?>[] interfaces;
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (!this.Z.contains(cls2)) {
                set.add(cls2);
            }
            c(set, cls2);
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (!this.X.hasNext() && !this.Y.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
