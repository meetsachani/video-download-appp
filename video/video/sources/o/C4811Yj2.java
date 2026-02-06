package o;

import java.util.Comparator;
import java.util.SortedSet;

/* renamed from: o.Yj2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4811Yj2 extends C3349Jj2 implements SortedSet {
    private static final long serialVersionUID = 2775582861954500111L;

    public C4811Yj2(SortedSet sortedSet) {
        super(sortedSet);
    }

    public static SortedSet e(SortedSet sortedSet) {
        return new C4811Yj2(sortedSet);
    }

    @Override // java.util.SortedSet
    public Comparator comparator() {
        Comparator comparator;
        synchronized (this.Y) {
            comparator = f().comparator();
        }
        return comparator;
    }

    public SortedSet f() {
        return (SortedSet) this.X;
    }

    @Override // java.util.SortedSet
    public Object first() {
        Object first;
        synchronized (this.Y) {
            first = f().first();
        }
        return first;
    }

    @Override // java.util.SortedSet
    public SortedSet headSet(Object obj) {
        C4811Yj2 c4811Yj2;
        synchronized (this.Y) {
            c4811Yj2 = new C4811Yj2(f().headSet(obj), this.Y);
        }
        return c4811Yj2;
    }

    @Override // java.util.SortedSet
    public Object last() {
        Object last;
        synchronized (this.Y) {
            last = f().last();
        }
        return last;
    }

    @Override // java.util.SortedSet
    public SortedSet subSet(Object obj, Object obj2) {
        C4811Yj2 c4811Yj2;
        synchronized (this.Y) {
            c4811Yj2 = new C4811Yj2(f().subSet(obj, obj2), this.Y);
        }
        return c4811Yj2;
    }

    @Override // java.util.SortedSet
    public SortedSet tailSet(Object obj) {
        C4811Yj2 c4811Yj2;
        synchronized (this.Y) {
            c4811Yj2 = new C4811Yj2(f().tailSet(obj), this.Y);
        }
        return c4811Yj2;
    }

    public C4811Yj2(SortedSet sortedSet, Object obj) {
        super(sortedSet, obj);
    }
}
