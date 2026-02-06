package o;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* renamed from: o.Oj2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3838Oj2 extends C3349Jj2 implements List {
    private static final long serialVersionUID = -1403835447328619437L;

    public C3838Oj2(List list) {
        super(list);
    }

    public static List e(List list) {
        return new C3838Oj2(list);
    }

    @Override // java.util.List
    public void add(int i, Object obj) {
        synchronized (this.Y) {
            f().add(i, obj);
        }
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        boolean addAll;
        synchronized (this.Y) {
            addAll = f().addAll(i, collection);
        }
        return addAll;
    }

    public List f() {
        return (List) this.X;
    }

    @Override // java.util.List
    public Object get(int i) {
        Object obj;
        synchronized (this.Y) {
            obj = f().get(i);
        }
        return obj;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        int indexOf;
        synchronized (this.Y) {
            indexOf = f().indexOf(obj);
        }
        return indexOf;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        int lastIndexOf;
        synchronized (this.Y) {
            lastIndexOf = f().lastIndexOf(obj);
        }
        return lastIndexOf;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return f().listIterator();
    }

    @Override // java.util.List
    public Object remove(int i) {
        Object remove;
        synchronized (this.Y) {
            remove = f().remove(i);
        }
        return remove;
    }

    @Override // java.util.List
    public Object set(int i, Object obj) {
        Object obj2;
        synchronized (this.Y) {
            obj2 = f().set(i, obj);
        }
        return obj2;
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        C3838Oj2 c3838Oj2;
        synchronized (this.Y) {
            c3838Oj2 = new C3838Oj2(f().subList(i, i2), this.Y);
        }
        return c3838Oj2;
    }

    public C3838Oj2(List list, Object obj) {
        super(list, obj);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        return f().listIterator(i);
    }
}
