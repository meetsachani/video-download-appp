package o;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: o.gB2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6492gB2 extends AbstractList<String> implements InterfaceC6581gZ0, RandomAccess {
    public final InterfaceC6581gZ0 X;

    /* renamed from: o.gB2$a */
    /* loaded from: classes.dex */
    public class a implements ListIterator<String> {
        public ListIterator<String> X;
        public final /* synthetic */ int Y;

        public a(int i) {
            this.Y = i;
            this.X = C6492gB2.this.X.listIterator(i);
        }

        @Override // java.util.ListIterator
        /* renamed from: b */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: c */
        public String next() {
            return this.X.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: d */
        public String previous() {
            return this.X.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: e */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.X.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.X.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.X.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.X.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: o.gB2$b */
    /* loaded from: classes.dex */
    public class b implements Iterator<String> {
        public Iterator<String> X;

        public b() {
            this.X = C6492gB2.this.X.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public String next() {
            return this.X.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.X.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C6492gB2(InterfaceC6581gZ0 interfaceC6581gZ0) {
        this.X = interfaceC6581gZ0;
    }

    @Override // o.InterfaceC6581gZ0
    public void A2(int i, AbstractC8616os abstractC8616os) {
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC6581gZ0
    public List<?> D1() {
        return this.X.D1();
    }

    @Override // o.InterfaceC6581gZ0
    public void E3(AbstractC8616os abstractC8616os) {
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC6581gZ0
    public void E4(InterfaceC6581gZ0 interfaceC6581gZ0) {
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC6581gZ0
    public List<byte[]> O1() {
        return Collections.unmodifiableList(this.X.O1());
    }

    @Override // o.InterfaceC6581gZ0
    public void P(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e */
    public String get(int i) {
        return this.X.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // o.InterfaceC6581gZ0
    public void l4(int i, byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i) {
        return new a(i);
    }

    @Override // o.InterfaceC6581gZ0
    public byte[] m1(int i) {
        return this.X.m1(i);
    }

    @Override // o.InterfaceC6581gZ0
    public AbstractC8616os n2(int i) {
        return this.X.n2(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.X.size();
    }

    @Override // o.InterfaceC6581gZ0
    public boolean t1(Collection<byte[]> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC6581gZ0
    public boolean t4(Collection<? extends AbstractC8616os> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC5302bK1
    public List<AbstractC8616os> u2() {
        return Collections.unmodifiableList(this.X.u2());
    }

    @Override // o.InterfaceC6581gZ0
    public Object w5(int i) {
        return this.X.w5(i);
    }

    @Override // o.InterfaceC6581gZ0
    public InterfaceC6581gZ0 e5() {
        return this;
    }
}
