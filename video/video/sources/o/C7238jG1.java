package o;

import java.util.Comparator;
import java.util.SortedMap;

/* renamed from: o.jG1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7238jG1 extends C5043aG1 implements SortedMap {
    private static final long serialVersionUID = 3359846175935304332L;

    public C7238jG1(SortedMap sortedMap, JF1 jf1, JF1 jf12) {
        super(sortedMap, jf1, jf12);
    }

    public static SortedMap e(SortedMap sortedMap, JF1 jf1, JF1 jf12) {
        return new C7238jG1(sortedMap, jf1, jf12);
    }

    @Override // java.util.SortedMap
    public Comparator comparator() {
        return f().comparator();
    }

    public SortedMap f() {
        return (SortedMap) this.X;
    }

    @Override // java.util.SortedMap
    public Object firstKey() {
        return f().firstKey();
    }

    @Override // java.util.SortedMap
    public SortedMap headMap(Object obj) {
        return new C7238jG1(f().headMap(obj), this.Y, this.Z);
    }

    @Override // java.util.SortedMap
    public Object lastKey() {
        return f().lastKey();
    }

    @Override // java.util.SortedMap
    public SortedMap subMap(Object obj, Object obj2) {
        return new C7238jG1(f().subMap(obj, obj2), this.Y, this.Z);
    }

    @Override // java.util.SortedMap
    public SortedMap tailMap(Object obj) {
        return new C7238jG1(f().tailMap(obj), this.Y, this.Z);
    }
}
