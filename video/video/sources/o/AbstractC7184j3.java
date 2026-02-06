package o;

import java.util.Comparator;
import java.util.SortedMap;

/* renamed from: o.j3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7184j3 extends AbstractC9635t2 implements X92 {
    public AbstractC7184j3(X92 x92) {
        super(x92);
    }

    public X92 Z4() {
        return c().Z4();
    }

    public X92 c() {
        return (X92) this.X;
    }

    @Override // java.util.SortedMap
    public Comparator comparator() {
        return c().comparator();
    }

    public SortedMap headMap(Object obj) {
        return c().headMap(obj);
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return c().subMap(obj, obj2);
    }

    public SortedMap tailMap(Object obj) {
        return c().tailMap(obj);
    }
}
