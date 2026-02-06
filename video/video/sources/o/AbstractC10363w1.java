package o;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: o.w1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC10363w1<K, V> extends AbstractC6441g2<K, V> implements InterfaceC7664l11<K, V> {

    /* renamed from: o.w1$b */
    /* loaded from: classes4.dex */
    public class b extends AbstractC6441g2<K, V>.i implements List<V> {
        public b(K k) {
            super(k);
        }

        @Override // java.util.List
        public void add(int i, V v) {
            List<V> d = d();
            if (d == null) {
                d = AbstractC10363w1.this.b();
                AbstractC10363w1.this.e().put(this.X, d);
            }
            d.add(i, v);
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends V> collection) {
            List<V> d = d();
            if (d == null) {
                List<V> b = AbstractC10363w1.this.b();
                boolean addAll = b.addAll(i, collection);
                if (addAll) {
                    AbstractC10363w1.this.e().put(this.X, b);
                }
                return addAll;
            }
            return d.addAll(i, collection);
        }

        @Override // o.AbstractC6441g2.i
        /* renamed from: e */
        public List<V> d() {
            return AbstractC10363w1.this.e().get(this.X);
        }

        @Override // java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            List<V> d = d();
            if (d == null) {
                return Collections.EMPTY_LIST.equals(obj);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            return C6694h11.g(d, (List) obj);
        }

        @Override // java.util.List
        public V get(int i) {
            return (V) C6694h11.b(d()).get(i);
        }

        @Override // java.util.Collection, java.util.List
        public int hashCode() {
            return C6694h11.d(d());
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return C6694h11.b(d()).indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return C6694h11.b(d()).lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            return new a(this.X);
        }

        @Override // java.util.List
        public V remove(int i) {
            List b = C6694h11.b(d());
            V v = (V) b.remove(i);
            if (b.isEmpty()) {
                AbstractC10363w1.this.remove((Object) this.X);
            }
            return v;
        }

        @Override // java.util.List
        public V set(int i, V v) {
            return (V) C6694h11.b(d()).set(i, v);
        }

        @Override // java.util.List
        public List<V> subList(int i, int i2) {
            return C6694h11.b(d()).subList(i, i2);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i) {
            return new a(this.X, i);
        }
    }

    public AbstractC10363w1() {
    }

    @Override // o.AbstractC6441g2
    public Map<K, List<V>> e() {
        return super.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC6441g2, o.InterfaceC7846lm1, o.InterfaceC10613x22
    public /* bridge */ /* synthetic */ Collection get(Object obj) {
        return get((AbstractC10363w1<K, V>) obj);
    }

    @Override // o.AbstractC6441g2
    /* renamed from: h */
    public abstract List<V> b();

    @Override // o.AbstractC6441g2
    /* renamed from: i */
    public List<V> g(K k) {
        return new b(k);
    }

    public AbstractC10363w1(Map<K, ? extends List<V>> map) {
        super(map);
    }

    @Override // o.AbstractC6441g2, o.InterfaceC7846lm1, o.InterfaceC10613x22
    public List<V> get(K k) {
        return g(k);
    }

    @Override // o.AbstractC6441g2, o.InterfaceC7846lm1, o.InterfaceC10613x22
    public List<V> remove(Object obj) {
        return C6694h11.b(e().remove(obj));
    }

    /* renamed from: o.w1$a */
    /* loaded from: classes4.dex */
    public class a implements ListIterator<V> {
        public final K X;
        public List<V> Y;
        public ListIterator<V> Z;

        public a(K k) {
            this.X = k;
            List<V> b = C6694h11.b(AbstractC10363w1.this.e().get(k));
            this.Y = b;
            this.Z = b.listIterator();
        }

        @Override // java.util.ListIterator
        public void add(V v) {
            if (AbstractC10363w1.this.e().get(this.X) == null) {
                List<V> b = AbstractC10363w1.this.b();
                AbstractC10363w1.this.e().put(this.X, b);
                this.Y = b;
                this.Z = b.listIterator();
            }
            this.Z.add(v);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.Z.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.Z.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public V next() {
            return this.Z.next();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.Z.nextIndex();
        }

        @Override // java.util.ListIterator
        public V previous() {
            return this.Z.previous();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.Z.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.Z.remove();
            if (this.Y.isEmpty()) {
                AbstractC10363w1.this.e().remove(this.X);
            }
        }

        @Override // java.util.ListIterator
        public void set(V v) {
            this.Z.set(v);
        }

        public a(K k, int i) {
            this.X = k;
            List<V> b = C6694h11.b(AbstractC10363w1.this.e().get(k));
            this.Y = b;
            this.Z = b.listIterator(i);
        }
    }
}
