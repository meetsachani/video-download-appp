package o;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: o.p3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8661p3 extends AbstractC4989a3 implements SortedSet {
    public AbstractC8661p3() {
    }

    @Override // java.util.SortedSet
    public Comparator comparator() {
        return f().comparator();
    }

    public SortedSet f() {
        return (SortedSet) d();
    }

    @Override // java.util.SortedSet
    public Object first() {
        return f().first();
    }

    public SortedSet headSet(Object obj) {
        return f().headSet(obj);
    }

    @Override // java.util.SortedSet
    public Object last() {
        return f().last();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return f().subSet(obj, obj2);
    }

    public SortedSet tailSet(Object obj) {
        return f().tailSet(obj);
    }

    public AbstractC8661p3(Set set) {
        super(set);
    }
}
