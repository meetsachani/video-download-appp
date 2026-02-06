package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import o.C10856y22;

@InterfaceC10420wF0(emulated = true, serializable = true)
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public final class B01<K, V> extends C01<K, V> {
    public static final int e1 = 16;
    public static final int f1 = 2;
    @InterfaceC5299bJ2
    public static final double g1 = 1.0d;
    @InterfaceC11149zF0
    private static final long serialVersionUID = 1;
    @InterfaceC5299bJ2
    public transient int c1;
    public transient b<K, V> d1;

    /* loaded from: classes3.dex */
    public class a implements Iterator<Map.Entry<K, V>> {
        public b<K, V> X;
        @MB
        public b<K, V> Y;

        public a() {
            this.X = B01.this.d1.b();
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                b<K, V> bVar = this.X;
                this.Y = bVar;
                this.X = bVar.b();
                return bVar;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.X != B01.this.d1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z;
            if (this.Y != null) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.h0(z, "no calls to next() since the last call to remove()");
            B01.this.remove(this.Y.getKey(), this.Y.getValue());
            this.Y = null;
        }
    }

    @InterfaceC5299bJ2
    /* loaded from: classes3.dex */
    public static final class b<K, V> extends VN0<K, V> implements d<K, V> {
        @MB
        public b<K, V> Y0;
        public final int Z;
        @MB
        public d<K, V> Z0;
        @MB
        public d<K, V> a1;
        @MB
        public b<K, V> b1;
        @MB
        public b<K, V> c1;

        public b(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 V v, int i, @MB b<K, V> bVar) {
            super(k, v);
            this.Z = i;
            this.Y0 = bVar;
        }

        public static <K, V> b<K, V> g() {
            return new b<>(null, null, 0, null);
        }

        public b<K, V> a() {
            b<K, V> bVar = this.b1;
            Objects.requireNonNull(bVar);
            return bVar;
        }

        public b<K, V> b() {
            b<K, V> bVar = this.c1;
            Objects.requireNonNull(bVar);
            return bVar;
        }

        public boolean c(@MB Object obj, int i) {
            if (this.Z == i && C2593Bt1.a(getValue(), obj)) {
                return true;
            }
            return false;
        }

        @Override // o.B01.d
        public void d(d<K, V> dVar) {
            this.a1 = dVar;
        }

        @Override // o.B01.d
        public d<K, V> e() {
            d<K, V> dVar = this.Z0;
            Objects.requireNonNull(dVar);
            return dVar;
        }

        @Override // o.B01.d
        public d<K, V> f() {
            d<K, V> dVar = this.a1;
            Objects.requireNonNull(dVar);
            return dVar;
        }

        @Override // o.B01.d
        public void h(d<K, V> dVar) {
            this.Z0 = dVar;
        }

        public void i(b<K, V> bVar) {
            this.b1 = bVar;
        }

        public void j(b<K, V> bVar) {
            this.c1 = bVar;
        }
    }

    @InterfaceC5299bJ2
    /* loaded from: classes3.dex */
    public final class c extends C10856y22.k<V> implements d<K, V> {
        @InterfaceC7894ly1
        public final K X;
        @InterfaceC5299bJ2
        public b<K, V>[] Y;
        public int Z = 0;
        public int Y0 = 0;
        public d<K, V> Z0 = this;
        public d<K, V> a1 = this;

        /* loaded from: classes3.dex */
        public class a implements Iterator<V> {
            public d<K, V> X;
            @MB
            public b<K, V> Y;
            public int Z;

            public a() {
                this.X = c.this.Z0;
                this.Z = c.this.Y0;
            }

            public final void b() {
                if (c.this.Y0 == this.Z) {
                    return;
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                b();
                if (this.X != c.this) {
                    return true;
                }
                return false;
            }

            @Override // java.util.Iterator
            @InterfaceC7894ly1
            public V next() {
                if (hasNext()) {
                    b<K, V> bVar = (b) this.X;
                    V value = bVar.getValue();
                    this.Y = bVar;
                    this.X = bVar.f();
                    return value;
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                boolean z;
                b();
                if (this.Y != null) {
                    z = true;
                } else {
                    z = false;
                }
                C10664xF1.h0(z, "no calls to next() since the last call to remove()");
                c.this.remove(this.Y.getValue());
                this.Z = c.this.Y0;
                this.Y = null;
            }
        }

        public c(@InterfaceC7894ly1 K k, int i) {
            this.X = k;
            this.Y = new b[EG0.a(i, 1.0d)];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(@InterfaceC7894ly1 V v) {
            int d = EG0.d(v);
            int k = k() & d;
            b<K, V> bVar = this.Y[k];
            for (b<K, V> bVar2 = bVar; bVar2 != null; bVar2 = bVar2.Y0) {
                if (bVar2.c(v, d)) {
                    return false;
                }
            }
            b<K, V> bVar3 = new b<>(this.X, v, d, bVar);
            B01.V(this.a1, bVar3);
            B01.V(bVar3, this);
            B01.T(B01.this.d1.a(), bVar3);
            B01.T(bVar3, B01.this.d1);
            this.Y[k] = bVar3;
            this.Z++;
            this.Y0++;
            l();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Arrays.fill(this.Y, (Object) null);
            this.Z = 0;
            for (d<K, V> dVar = this.Z0; dVar != this; dVar = dVar.f()) {
                B01.R((b) dVar);
            }
            B01.V(this, this);
            this.Y0++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@MB Object obj) {
            int d = EG0.d(obj);
            for (b<K, V> bVar = this.Y[k() & d]; bVar != null; bVar = bVar.Y0) {
                if (bVar.c(obj, d)) {
                    return true;
                }
            }
            return false;
        }

        @Override // o.B01.d
        public void d(d<K, V> dVar) {
            this.Z0 = dVar;
        }

        @Override // o.B01.d
        public d<K, V> e() {
            return this.a1;
        }

        @Override // o.B01.d
        public d<K, V> f() {
            return this.Z0;
        }

        @Override // o.B01.d
        public void h(d<K, V> dVar) {
            this.a1 = dVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<V> iterator() {
            return new a();
        }

        public final int k() {
            return this.Y.length - 1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void l() {
            if (EG0.b(this.Z, this.Y.length, 1.0d)) {
                int length = this.Y.length * 2;
                b<K, V>[] bVarArr = new b[length];
                this.Y = bVarArr;
                int i = length - 1;
                for (d dVar = (d<K, V>) this.Z0; dVar != this; dVar = (d<K, V>) dVar.f()) {
                    b<K, V> bVar = (b) dVar;
                    int i2 = bVar.Z & i;
                    bVar.Y0 = bVarArr[i2];
                    bVarArr[i2] = bVar;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @InterfaceC6181ey
        public boolean remove(@MB Object obj) {
            int d = EG0.d(obj);
            int k = k() & d;
            b<K, V> bVar = null;
            for (b<K, V> bVar2 = this.Y[k]; bVar2 != null; bVar2 = bVar2.Y0) {
                if (bVar2.c(obj, d)) {
                    if (bVar == null) {
                        this.Y[k] = bVar2.Y0;
                    } else {
                        bVar.Y0 = bVar2.Y0;
                    }
                    B01.S(bVar2);
                    B01.R(bVar2);
                    this.Z--;
                    this.Y0++;
                    return true;
                }
                bVar = bVar2;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.Z;
        }
    }

    /* loaded from: classes3.dex */
    public interface d<K, V> {
        void d(d<K, V> dVar);

        d<K, V> e();

        d<K, V> f();

        void h(d<K, V> dVar);
    }

    public B01(int i, int i2) {
        super(C7469kD1.f(i));
        this.c1 = 2;
        C5037aF.b(i2, "expectedValuesPerKey");
        this.c1 = i2;
        b<K, V> g = b.g();
        this.d1 = g;
        T(g, g);
    }

    public static <K, V> B01<K, V> N() {
        return new B01<>(16, 2);
    }

    public static <K, V> B01<K, V> O(int i, int i2) {
        return new B01<>(C7935m81.o(i), C7935m81.o(i2));
    }

    public static <K, V> B01<K, V> P(InterfaceC10058um1<? extends K, ? extends V> interfaceC10058um1) {
        B01<K, V> O = O(interfaceC10058um1.keySet().size(), 2);
        O.B0(interfaceC10058um1);
        return O;
    }

    public static <K, V> void R(b<K, V> bVar) {
        T(bVar.a(), bVar.b());
    }

    public static <K, V> void S(d<K, V> dVar) {
        V(dVar.e(), dVar.f());
    }

    public static <K, V> void T(b<K, V> bVar, b<K, V> bVar2) {
        bVar.j(bVar2);
        bVar2.i(bVar);
    }

    public static <K, V> void V(d<K, V> dVar, d<K, V> dVar2) {
        dVar.d(dVar2);
        dVar2.h(dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC11149zF0
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        b<K, V> g = b.g();
        this.d1 = g;
        T(g, g);
        this.c1 = 2;
        int readInt = objectInputStream.readInt();
        Map f = C7469kD1.f(12);
        for (int i = 0; i < readInt; i++) {
            Object readObject = objectInputStream.readObject();
            f.put(readObject, u(readObject));
        }
        int readInt2 = objectInputStream.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            Object readObject2 = objectInputStream.readObject();
            Object readObject3 = objectInputStream.readObject();
            Collection collection = (Collection) f.get(readObject2);
            Objects.requireNonNull(collection);
            collection.add(readObject3);
        }
        B(f);
    }

    @InterfaceC11149zF0
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(keySet().size());
        for (K k : keySet()) {
            objectOutputStream.writeObject(k);
        }
        objectOutputStream.writeInt(size());
        for (Map.Entry<K, V> entry : r()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    @InterfaceC6181ey
    public /* bridge */ /* synthetic */ boolean B0(InterfaceC10058um1 interfaceC10058um1) {
        return super.B0(interfaceC10058um1);
    }

    @Override // o.AbstractC5232b3, o.F1
    /* renamed from: F */
    public Set<V> t() {
        return C7469kD1.g(this.c1);
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    public /* bridge */ /* synthetic */ InterfaceC2467Am1 Q() {
        return super.Q();
    }

    @Override // o.F1, o.InterfaceC10058um1
    public void clear() {
        super.clear();
        b<K, V> bVar = this.d1;
        T(bVar, bVar);
    }

    @Override // o.F1, o.InterfaceC10058um1
    public /* bridge */ /* synthetic */ boolean containsKey(@MB Object obj) {
        return super.containsKey(obj);
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    public /* bridge */ /* synthetic */ boolean containsValue(@MB Object obj) {
        return super.containsValue(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    @InterfaceC6181ey
    public /* bridge */ /* synthetic */ boolean e0(@InterfaceC7894ly1 Object obj, Iterable iterable) {
        return super.e0(obj, iterable);
    }

    @Override // o.AbstractC5232b3, o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    public /* bridge */ /* synthetic */ boolean equals(@MB Object obj) {
        return super.equals(obj);
    }

    @Override // o.F1, o.AbstractC6939i2
    public Iterator<Map.Entry<K, V>> f() {
        return new a();
    }

    @Override // o.F1, o.AbstractC6939i2
    public Iterator<V> g() {
        return C7935m81.O0(f());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC5232b3, o.F1, o.InterfaceC10058um1, o.InterfaceC8660p22
    public /* bridge */ /* synthetic */ Set get(@InterfaceC7894ly1 Object obj) {
        return super.get((B01<K, V>) obj);
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // o.AbstractC5232b3, o.F1, o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    public /* bridge */ /* synthetic */ Set i(@MB Object obj) {
        return super.i(obj);
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC5232b3, o.F1, o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    public /* bridge */ /* synthetic */ Collection j(@InterfaceC7894ly1 Object obj, Iterable iterable) {
        return j((B01<K, V>) obj, iterable);
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    public Set<K> keySet() {
        return super.keySet();
    }

    @Override // o.AbstractC5232b3, o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    public /* bridge */ /* synthetic */ Map l() {
        return super.l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC5232b3, o.F1, o.AbstractC6939i2, o.InterfaceC10058um1
    @InterfaceC6181ey
    public /* bridge */ /* synthetic */ boolean put(@InterfaceC7894ly1 Object obj, @InterfaceC7894ly1 Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    public /* bridge */ /* synthetic */ boolean q5(@MB Object obj, @MB Object obj2) {
        return super.q5(obj, obj2);
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    @InterfaceC6181ey
    public /* bridge */ /* synthetic */ boolean remove(@MB Object obj, @MB Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // o.F1, o.InterfaceC10058um1
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // o.AbstractC6939i2
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // o.F1
    public Collection<V> u(@InterfaceC7894ly1 K k) {
        return new c(k, this.c1);
    }

    @Override // o.F1, o.AbstractC6939i2, o.InterfaceC10058um1
    public Collection<V> values() {
        return super.values();
    }

    @Override // o.AbstractC5232b3, o.F1, o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    public Set<V> j(@InterfaceC7894ly1 K k, Iterable<? extends V> iterable) {
        return super.j((B01<K, V>) k, (Iterable) iterable);
    }

    @Override // o.AbstractC5232b3, o.F1, o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    public Set<Map.Entry<K, V>> r() {
        return super.r();
    }
}
