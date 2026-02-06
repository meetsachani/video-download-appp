package o;

import java.util.Comparator;
import java.util.SortedSet;

/* renamed from: o.Fs2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2993Fs2 extends C11301zs2 implements SortedSet {
    private static final long serialVersionUID = -1675486811351124386L;

    public C2993Fs2(SortedSet sortedSet, InterfaceC3189Hs2 interfaceC3189Hs2) {
        super(sortedSet, interfaceC3189Hs2);
    }

    public static SortedSet j(SortedSet sortedSet, InterfaceC3189Hs2 interfaceC3189Hs2) {
        return new C2993Fs2(sortedSet, interfaceC3189Hs2);
    }

    @Override // java.util.SortedSet
    public Comparator comparator() {
        return k().comparator();
    }

    @Override // java.util.SortedSet
    public Object first() {
        return k().first();
    }

    @Override // java.util.SortedSet
    public SortedSet headSet(Object obj) {
        return new C2993Fs2(k().headSet(obj), this.Y);
    }

    public SortedSet k() {
        return (SortedSet) this.X;
    }

    @Override // java.util.SortedSet
    public Object last() {
        return k().last();
    }

    @Override // java.util.SortedSet
    public SortedSet subSet(Object obj, Object obj2) {
        return new C2993Fs2(k().subSet(obj, obj2), this.Y);
    }

    @Override // java.util.SortedSet
    public SortedSet tailSet(Object obj) {
        return new C2993Fs2(k().tailSet(obj), this.Y);
    }
}
