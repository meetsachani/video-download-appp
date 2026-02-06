package o;

import java.util.Comparator;
import java.util.SortedSet;

/* renamed from: o.lG1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7724lG1 extends C6256fG1 implements SortedSet {
    private static final long serialVersionUID = -9110948148132275052L;

    public C7724lG1(SortedSet sortedSet, JF1 jf1) {
        super(sortedSet, jf1);
    }

    public static SortedSet j(SortedSet sortedSet, JF1 jf1) {
        return new C7724lG1(sortedSet, jf1);
    }

    private SortedSet k() {
        return (SortedSet) d();
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
        return new C7724lG1(k().headSet(obj), this.Y);
    }

    @Override // java.util.SortedSet
    public Object last() {
        return k().last();
    }

    @Override // java.util.SortedSet
    public SortedSet subSet(Object obj, Object obj2) {
        return new C7724lG1(k().subSet(obj, obj2), this.Y);
    }

    @Override // java.util.SortedSet
    public SortedSet tailSet(Object obj) {
        return new C7724lG1(k().tailSet(obj), this.Y);
    }
}
