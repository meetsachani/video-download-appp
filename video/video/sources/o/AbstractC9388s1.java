package o;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* renamed from: o.s1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC9388s1 extends AbstractC8405o0 implements List {
    public AbstractC9388s1() {
    }

    public void add(int i, Object obj) {
        e().add(i, obj);
    }

    public boolean addAll(int i, Collection collection) {
        return e().addAll(i, collection);
    }

    public List e() {
        return (List) d();
    }

    public Object get(int i) {
        return e().get(i);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return e().indexOf(obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return e().lastIndexOf(obj);
    }

    public ListIterator listIterator() {
        return e().listIterator();
    }

    public Object remove(int i) {
        return e().remove(i);
    }

    public Object set(int i, Object obj) {
        return e().set(i, obj);
    }

    public List subList(int i, int i2) {
        return e().subList(i, i2);
    }

    public AbstractC9388s1(List list) {
        super(list);
    }

    public ListIterator listIterator(int i) {
        return e().listIterator(i);
    }
}
