package o;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* renamed from: o.os2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8619os2 extends C8132ms2 implements List {
    private static final long serialVersionUID = 1077193035000013141L;

    /* renamed from: o.os2$a */
    /* loaded from: classes4.dex */
    public class a extends C9874u1 {
        public final /* synthetic */ C8619os2 Y;

        public a(C8619os2 c8619os2, ListIterator listIterator) {
            super(listIterator);
            this.Y = c8619os2;
        }

        @Override // o.C9874u1, java.util.ListIterator
        public void add(Object obj) {
            this.X.add(this.Y.f(obj));
        }

        @Override // o.C9874u1, java.util.ListIterator
        public void set(Object obj) {
            this.X.set(this.Y.f(obj));
        }
    }

    public C8619os2(List list, InterfaceC3189Hs2 interfaceC3189Hs2) {
        super(list, interfaceC3189Hs2);
    }

    public static List k(List list, InterfaceC3189Hs2 interfaceC3189Hs2) {
        return new C8619os2(list, interfaceC3189Hs2);
    }

    @Override // java.util.List
    public void add(int i, Object obj) {
        l().add(i, f(obj));
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        return l().addAll(i, h(collection));
    }

    @Override // java.util.List
    public Object get(int i) {
        return l().get(i);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return l().indexOf(obj);
    }

    public List l() {
        return (List) this.X;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return l().lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public Object remove(int i) {
        return l().remove(i);
    }

    @Override // java.util.List
    public Object set(int i, Object obj) {
        return l().set(i, f(obj));
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        return new C8619os2(l().subList(i, i2), this.Y);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        return new a(this, l().listIterator(i));
    }
}
