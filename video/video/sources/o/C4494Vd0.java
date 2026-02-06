package o;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;

/* renamed from: o.Vd0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4494Vd0 implements Iterator {
    public Collection X;
    public Enumeration Y;
    public Object Z;

    public C4494Vd0() {
        this(null, null);
    }

    public Enumeration b() {
        return this.Y;
    }

    public void c(Enumeration enumeration) {
        this.Y = enumeration;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.Y.hasMoreElements();
    }

    @Override // java.util.Iterator
    public Object next() {
        Object nextElement = this.Y.nextElement();
        this.Z = nextElement;
        return nextElement;
    }

    @Override // java.util.Iterator
    public void remove() {
        Collection collection = this.X;
        if (collection != null) {
            Object obj = this.Z;
            if (obj != null) {
                collection.remove(obj);
                return;
            }
            throw new IllegalStateException("next() must have been called for remove() to function");
        }
        throw new UnsupportedOperationException("No Collection associated with this Iterator");
    }

    public C4494Vd0(Enumeration enumeration) {
        this(enumeration, null);
    }

    public C4494Vd0(Enumeration enumeration, Collection collection) {
        this.Y = enumeration;
        this.X = collection;
        this.Z = null;
    }
}
