package o;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;

/* renamed from: o.Ds2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2786Ds2 extends C9597ss2 implements SortedMap {
    private static final long serialVersionUID = -8751771676410385778L;

    public C2786Ds2(SortedMap sortedMap, InterfaceC3189Hs2 interfaceC3189Hs2, InterfaceC3189Hs2 interfaceC3189Hs22) {
        super(sortedMap, interfaceC3189Hs2, interfaceC3189Hs22);
    }

    public static SortedMap i(SortedMap sortedMap, InterfaceC3189Hs2 interfaceC3189Hs2, InterfaceC3189Hs2 interfaceC3189Hs22) {
        return new C2786Ds2(sortedMap, interfaceC3189Hs2, interfaceC3189Hs22);
    }

    public static SortedMap j(SortedMap sortedMap, InterfaceC3189Hs2 interfaceC3189Hs2, InterfaceC3189Hs2 interfaceC3189Hs22) {
        C2786Ds2 c2786Ds2 = new C2786Ds2(sortedMap, interfaceC3189Hs2, interfaceC3189Hs22);
        if (sortedMap.size() > 0) {
            Map f = c2786Ds2.f(sortedMap);
            c2786Ds2.clear();
            c2786Ds2.V().putAll(f);
        }
        return c2786Ds2;
    }

    @Override // java.util.SortedMap
    public Comparator comparator() {
        return k().comparator();
    }

    @Override // java.util.SortedMap
    public Object firstKey() {
        return k().firstKey();
    }

    @Override // java.util.SortedMap
    public SortedMap headMap(Object obj) {
        return new C2786Ds2(k().headMap(obj), this.Y, this.Z);
    }

    public SortedMap k() {
        return (SortedMap) this.X;
    }

    @Override // java.util.SortedMap
    public Object lastKey() {
        return k().lastKey();
    }

    @Override // java.util.SortedMap
    public SortedMap subMap(Object obj, Object obj2) {
        return new C2786Ds2(k().subMap(obj, obj2), this.Y, this.Z);
    }

    @Override // java.util.SortedMap
    public SortedMap tailMap(Object obj) {
        return new C2786Ds2(k().tailMap(obj), this.Y, this.Z);
    }
}
