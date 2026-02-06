package o;

import java.util.Comparator;
import java.util.SortedMap;

/* renamed from: o.dZ0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5841dZ0 extends C5356bZ0 implements SortedMap {
    private static final long serialVersionUID = 2715322183617658933L;

    public C5841dZ0(SortedMap sortedMap, InterfaceC5399bk0 interfaceC5399bk0) {
        super(sortedMap, interfaceC5399bk0);
    }

    public static SortedMap c(SortedMap sortedMap, InterfaceC5399bk0 interfaceC5399bk0) {
        return new C5841dZ0(sortedMap, interfaceC5399bk0);
    }

    public static SortedMap d(SortedMap sortedMap, InterfaceC3189Hs2 interfaceC3189Hs2) {
        return new C5841dZ0(sortedMap, interfaceC3189Hs2);
    }

    @Override // java.util.SortedMap
    public Comparator comparator() {
        return e().comparator();
    }

    public SortedMap e() {
        return (SortedMap) this.X;
    }

    @Override // java.util.SortedMap
    public Object firstKey() {
        return e().firstKey();
    }

    @Override // java.util.SortedMap
    public SortedMap headMap(Object obj) {
        return new C5841dZ0(e().headMap(obj), this.Y);
    }

    @Override // java.util.SortedMap
    public Object lastKey() {
        return e().lastKey();
    }

    @Override // java.util.SortedMap
    public SortedMap subMap(Object obj, Object obj2) {
        return new C5841dZ0(e().subMap(obj, obj2), this.Y);
    }

    @Override // java.util.SortedMap
    public SortedMap tailMap(Object obj) {
        return new C5841dZ0(e().tailMap(obj), this.Y);
    }

    public C5841dZ0(SortedMap sortedMap, InterfaceC3189Hs2 interfaceC3189Hs2) {
        super(sortedMap, interfaceC3189Hs2);
    }
}
