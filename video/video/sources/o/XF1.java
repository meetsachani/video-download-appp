package o;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes4.dex */
public class XF1 extends WF1 implements List {
    private static final long serialVersionUID = -5722039223898659102L;

    /* loaded from: classes4.dex */
    public class a extends C9874u1 {
        public final /* synthetic */ XF1 Y;

        public a(XF1 xf1, ListIterator listIterator) {
            super(listIterator);
            this.Y = xf1;
        }

        @Override // o.C9874u1, java.util.ListIterator
        public void add(Object obj) {
            this.Y.f(obj);
            this.X.add(obj);
        }

        @Override // o.C9874u1, java.util.ListIterator
        public void set(Object obj) {
            this.Y.f(obj);
            this.X.set(obj);
        }
    }

    public XF1(List list, JF1 jf1) {
        super(list, jf1);
    }

    public static List j(List list, JF1 jf1) {
        return new XF1(list, jf1);
    }

    @Override // java.util.List
    public void add(int i, Object obj) {
        f(obj);
        k().add(i, obj);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        for (Object obj : collection) {
            f(obj);
        }
        return k().addAll(i, collection);
    }

    @Override // java.util.List
    public Object get(int i) {
        return k().get(i);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return k().indexOf(obj);
    }

    public List k() {
        return (List) d();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return k().lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public Object remove(int i) {
        return k().remove(i);
    }

    @Override // java.util.List
    public Object set(int i, Object obj) {
        f(obj);
        return k().set(i, obj);
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        return new XF1(k().subList(i, i2), this.Y);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        return new a(this, k().listIterator(i));
    }
}
