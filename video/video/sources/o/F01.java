package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import o.C10547wm1;
import o.C10856y22;

@InterfaceC10420wF0(emulated = true, serializable = true)
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public class F01<K, V> extends AbstractC6939i2<K, V> implements V01<K, V>, Serializable {
    @InterfaceC11149zF0
    private static final long serialVersionUID = 0;
    @MB
    public transient g<K, V> a1;
    @MB
    public transient g<K, V> b1;
    public transient Map<K, f<K, V>> c1;
    public transient int d1;
    public transient int e1;

    /* loaded from: classes3.dex */
    public class a extends AbstractSequentialList<V> {
        public final /* synthetic */ Object X;

        public a(Object obj) {
            this.X = obj;
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<V> listIterator(int i) {
            return new i(this.X, i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            f fVar = (f) F01.this.c1.get(this.X);
            if (fVar == null) {
                return 0;
            }
            return fVar.c;
        }
    }

    /* loaded from: classes3.dex */
    public class b extends AbstractSequentialList<Map.Entry<K, V>> {
        public b() {
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<Map.Entry<K, V>> listIterator(int i) {
            return new h(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return F01.this.d1;
        }
    }

    /* loaded from: classes3.dex */
    public class c extends C10856y22.k<K> {
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@MB Object obj) {
            return F01.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new e(F01.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@MB Object obj) {
            return !F01.this.i(obj).isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return F01.this.c1.size();
        }
    }

    /* loaded from: classes3.dex */
    public class d extends AbstractSequentialList<V> {

        /* loaded from: classes3.dex */
        public class a extends AbstractC9105qs2<Map.Entry<K, V>, V> {
            public final /* synthetic */ h Y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, ListIterator listIterator, h hVar) {
                super(listIterator);
                this.Y = hVar;
            }

            @Override // o.AbstractC8375ns2
            @InterfaceC7894ly1
            /* renamed from: d */
            public V b(Map.Entry<K, V> entry) {
                return entry.getValue();
            }

            @Override // o.AbstractC9105qs2, java.util.ListIterator
            public void set(@InterfaceC7894ly1 V v) {
                this.Y.g(v);
            }
        }

        public d() {
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<V> listIterator(int i) {
            h hVar = new h(i);
            return new a(this, hVar, hVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return F01.this.d1;
        }
    }

    /* loaded from: classes3.dex */
    public static class f<K, V> {
        public g<K, V> a;
        public g<K, V> b;
        public int c;

        public f(g<K, V> gVar) {
            this.a = gVar;
            this.b = gVar;
            gVar.a1 = null;
            gVar.Z0 = null;
            this.c = 1;
        }
    }

    /* loaded from: classes3.dex */
    public static final class g<K, V> extends M1<K, V> {
        @InterfaceC7894ly1
        public final K X;
        @InterfaceC7894ly1
        public V Y;
        @MB
        public g<K, V> Y0;
        @MB
        public g<K, V> Z;
        @MB
        public g<K, V> Z0;
        @MB
        public g<K, V> a1;

        public g(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 V v) {
            this.X = k;
            this.Y = v;
        }

        @Override // o.M1, java.util.Map.Entry
        @InterfaceC7894ly1
        public K getKey() {
            return this.X;
        }

        @Override // o.M1, java.util.Map.Entry
        @InterfaceC7894ly1
        public V getValue() {
            return this.Y;
        }

        @Override // o.M1, java.util.Map.Entry
        @InterfaceC7894ly1
        public V setValue(@InterfaceC7894ly1 V v) {
            V v2 = this.Y;
            this.Y = v;
            return v2;
        }
    }

    /* loaded from: classes3.dex */
    public class h implements ListIterator<Map.Entry<K, V>> {
        public int X;
        @MB
        public g<K, V> Y;
        @MB
        public g<K, V> Y0;
        @MB
        public g<K, V> Z;
        public int Z0;

        public h(int i) {
            this.Z0 = F01.this.e1;
            int size = F01.this.size();
            C10664xF1.d0(i, size);
            if (i >= size / 2) {
                this.Y0 = F01.this.b1;
                this.X = size;
                while (true) {
                    int i2 = i + 1;
                    if (i >= size) {
                        break;
                    }
                    previous();
                    i = i2;
                }
            } else {
                this.Y = F01.this.a1;
                while (true) {
                    int i3 = i - 1;
                    if (i <= 0) {
                        break;
                    }
                    next();
                    i = i3;
                }
            }
            this.Z = null;
        }

        @Override // java.util.ListIterator
        /* renamed from: b */
        public void add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public final void c() {
            if (F01.this.e1 == this.Z0) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @InterfaceC6181ey
        /* renamed from: d */
        public g<K, V> next() {
            c();
            g<K, V> gVar = this.Y;
            if (gVar != null) {
                this.Z = gVar;
                this.Y0 = gVar;
                this.Y = gVar.Z;
                this.X++;
                return gVar;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        @InterfaceC6181ey
        /* renamed from: e */
        public g<K, V> previous() {
            c();
            g<K, V> gVar = this.Y0;
            if (gVar != null) {
                this.Z = gVar;
                this.Y = gVar;
                this.Y0 = gVar.Y0;
                this.X--;
                return gVar;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        /* renamed from: f */
        public void set(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public void g(@InterfaceC7894ly1 V v) {
            boolean z;
            if (this.Z != null) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.g0(z);
            this.Z.Y = v;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            c();
            if (this.Y != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            c();
            if (this.Y0 != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.X;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.X - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            boolean z;
            c();
            if (this.Z != null) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.h0(z, "no calls to next() since the last call to remove()");
            g<K, V> gVar = this.Z;
            if (gVar != this.Y) {
                this.Y0 = gVar.Y0;
                this.X--;
            } else {
                this.Y = gVar.Z;
            }
            F01.this.C(gVar);
            this.Z = null;
            this.Z0 = F01.this.e1;
        }
    }

    public F01() {
        this(12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC11149zF0
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.c1 = SG.i0();
        int readInt = objectInputStream.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    public static <K, V> F01<K, V> u() {
        return new F01<>();
    }

    public static <K, V> F01<K, V> v(int i2) {
        return new F01<>(i2);
    }

    public static <K, V> F01<K, V> w(InterfaceC10058um1<? extends K, ? extends V> interfaceC10058um1) {
        return new F01<>(interfaceC10058um1);
    }

    @InterfaceC11149zF0
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        for (Map.Entry<K, V> entry : r()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public final List<V> A(@InterfaceC7894ly1 K k) {
        return Collections.unmodifiableList(C10608x11.s(new i(k)));
    }

    public final void B(@InterfaceC7894ly1 K k) {
        C7052iU0.h(new i(k));
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    @InterfaceC6181ey
    public /* bridge */ /* synthetic */ boolean B0(InterfaceC10058um1 interfaceC10058um1) {
        return super.B0(interfaceC10058um1);
    }

    public final void C(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.Y0;
        if (gVar2 != null) {
            gVar2.Z = gVar.Z;
        } else {
            this.a1 = gVar.Z;
        }
        g<K, V> gVar3 = gVar.Z;
        if (gVar3 != null) {
            gVar3.Y0 = gVar2;
        } else {
            this.b1 = gVar2;
        }
        if (gVar.a1 == null && gVar.Z0 == null) {
            f<K, V> remove = this.c1.remove(gVar.X);
            Objects.requireNonNull(remove);
            remove.c = 0;
            this.e1++;
        } else {
            f<K, V> fVar = this.c1.get(gVar.X);
            Objects.requireNonNull(fVar);
            fVar.c--;
            g<K, V> gVar4 = gVar.a1;
            if (gVar4 == null) {
                g<K, V> gVar5 = gVar.Z0;
                Objects.requireNonNull(gVar5);
                fVar.a = gVar5;
            } else {
                gVar4.Z0 = gVar.Z0;
            }
            g<K, V> gVar6 = gVar.Z0;
            if (gVar6 == null) {
                g<K, V> gVar7 = gVar.a1;
                Objects.requireNonNull(gVar7);
                fVar.b = gVar7;
            } else {
                gVar6.a1 = gVar.a1;
            }
        }
        this.d1--;
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    /* renamed from: D */
    public List<V> values() {
        return (List) super.values();
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    public /* bridge */ /* synthetic */ InterfaceC2467Am1 Q() {
        return super.Q();
    }

    @Override // o.AbstractC6939i2
    public Map<K, Collection<V>> a() {
        return new C10547wm1.a(this);
    }

    @Override // o.AbstractC6939i2
    public Set<K> c() {
        return new c();
    }

    @Override // o.InterfaceC10058um1
    public void clear() {
        this.a1 = null;
        this.b1 = null;
        this.c1.clear();
        this.d1 = 0;
        this.e1++;
    }

    @Override // o.InterfaceC10058um1
    public boolean containsKey(@MB Object obj) {
        return this.c1.containsKey(obj);
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    public boolean containsValue(@MB Object obj) {
        return values().contains(obj);
    }

    @Override // o.AbstractC6939i2
    public InterfaceC2467Am1<K> d() {
        return new C10547wm1.g(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    @InterfaceC6181ey
    public /* bridge */ /* synthetic */ boolean e0(@InterfaceC7894ly1 Object obj, Iterable iterable) {
        return super.e0(obj, iterable);
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    public /* bridge */ /* synthetic */ boolean equals(@MB Object obj) {
        return super.equals(obj);
    }

    @Override // o.AbstractC6939i2
    public Iterator<Map.Entry<K, V>> f() {
        throw new AssertionError("should never be called");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC10058um1, o.InterfaceC8660p22
    public /* bridge */ /* synthetic */ Collection get(@InterfaceC7894ly1 Object obj) {
        return get((F01<K, V>) obj);
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    public boolean isEmpty() {
        if (this.a1 == null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    public /* bridge */ /* synthetic */ Collection j(@InterfaceC7894ly1 Object obj, Iterable iterable) {
        return j((F01<K, V>) obj, iterable);
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    public /* bridge */ /* synthetic */ Map l() {
        return super.l();
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    @InterfaceC6181ey
    public boolean put(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 V v) {
        t(k, v, null);
        return true;
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

    @Override // o.InterfaceC10058um1
    public int size() {
        return this.d1;
    }

    @InterfaceC6181ey
    public final g<K, V> t(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 V v, @MB g<K, V> gVar) {
        g<K, V> gVar2 = new g<>(k, v);
        if (this.a1 == null) {
            this.b1 = gVar2;
            this.a1 = gVar2;
            this.c1.put(k, new f<>(gVar2));
            this.e1++;
        } else if (gVar == null) {
            g<K, V> gVar3 = this.b1;
            Objects.requireNonNull(gVar3);
            gVar3.Z = gVar2;
            gVar2.Y0 = this.b1;
            this.b1 = gVar2;
            f<K, V> fVar = this.c1.get(k);
            if (fVar == null) {
                this.c1.put(k, new f<>(gVar2));
                this.e1++;
            } else {
                fVar.c++;
                g<K, V> gVar4 = fVar.b;
                gVar4.Z0 = gVar2;
                gVar2.a1 = gVar4;
                fVar.b = gVar2;
            }
        } else {
            f<K, V> fVar2 = this.c1.get(k);
            Objects.requireNonNull(fVar2);
            fVar2.c++;
            gVar2.Y0 = gVar.Y0;
            gVar2.a1 = gVar.a1;
            gVar2.Z = gVar;
            gVar2.Z0 = gVar;
            g<K, V> gVar5 = gVar.a1;
            if (gVar5 == null) {
                fVar2.a = gVar2;
            } else {
                gVar5.Z0 = gVar2;
            }
            g<K, V> gVar6 = gVar.Y0;
            if (gVar6 == null) {
                this.a1 = gVar2;
            } else {
                gVar6.Z = gVar2;
            }
            gVar.Y0 = gVar2;
            gVar.a1 = gVar2;
        }
        this.d1++;
        return gVar2;
    }

    @Override // o.AbstractC6939i2
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // o.AbstractC6939i2
    /* renamed from: x */
    public List<Map.Entry<K, V>> b() {
        return new b();
    }

    @Override // o.AbstractC6939i2
    /* renamed from: y */
    public List<V> e() {
        return new d();
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    /* renamed from: z */
    public List<Map.Entry<K, V>> r() {
        return (List) super.r();
    }

    public F01(int i2) {
        this.c1 = C7469kD1.d(i2);
    }

    @Override // o.InterfaceC10058um1, o.InterfaceC8660p22
    public List<V> get(@InterfaceC7894ly1 K k) {
        return new a(k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    public List<V> i(Object obj) {
        List<V> A = A(obj);
        B(obj);
        return A;
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    public List<V> j(@InterfaceC7894ly1 K k, Iterable<? extends V> iterable) {
        List<V> A = A(k);
        i iVar = new i(k);
        Iterator<? extends V> it = iterable.iterator();
        while (iVar.hasNext() && it.hasNext()) {
            iVar.next();
            iVar.set(it.next());
        }
        while (iVar.hasNext()) {
            iVar.next();
            iVar.remove();
        }
        while (it.hasNext()) {
            iVar.add(it.next());
        }
        return A;
    }

    /* loaded from: classes3.dex */
    public class e implements Iterator<K> {
        public final Set<K> X;
        @MB
        public g<K, V> Y;
        public int Y0;
        @MB
        public g<K, V> Z;

        public e() {
            this.X = C10856y22.y(F01.this.keySet().size());
            this.Y = F01.this.a1;
            this.Y0 = F01.this.e1;
        }

        public final void b() {
            if (F01.this.e1 == this.Y0) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            b();
            if (this.Y != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        @InterfaceC7894ly1
        public K next() {
            g<K, V> gVar;
            b();
            g<K, V> gVar2 = this.Y;
            if (gVar2 != null) {
                this.Z = gVar2;
                this.X.add(gVar2.X);
                do {
                    gVar = this.Y.Z;
                    this.Y = gVar;
                    if (gVar == null) {
                        break;
                    }
                } while (!this.X.add(gVar.X));
                return this.Z.X;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z;
            b();
            if (this.Z != null) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.h0(z, "no calls to next() since the last call to remove()");
            F01.this.B(this.Z.X);
            this.Z = null;
            this.Y0 = F01.this.e1;
        }

        public /* synthetic */ e(F01 f01, a aVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public class i implements ListIterator<V> {
        @InterfaceC7894ly1
        public final K X;
        public int Y;
        @MB
        public g<K, V> Y0;
        @MB
        public g<K, V> Z;
        @MB
        public g<K, V> Z0;

        public i(@InterfaceC7894ly1 K k) {
            this.X = k;
            f fVar = (f) F01.this.c1.get(k);
            this.Z = fVar == null ? null : fVar.a;
        }

        @Override // java.util.ListIterator
        public void add(@InterfaceC7894ly1 V v) {
            this.Z0 = F01.this.t(this.X, v, this.Z);
            this.Y++;
            this.Y0 = null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            if (this.Z != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (this.Z0 != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @InterfaceC6181ey
        @InterfaceC7894ly1
        public V next() {
            g<K, V> gVar = this.Z;
            if (gVar != null) {
                this.Y0 = gVar;
                this.Z0 = gVar;
                this.Z = gVar.Z0;
                this.Y++;
                return gVar.Y;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.Y;
        }

        @Override // java.util.ListIterator
        @InterfaceC6181ey
        @InterfaceC7894ly1
        public V previous() {
            g<K, V> gVar = this.Z0;
            if (gVar != null) {
                this.Y0 = gVar;
                this.Z = gVar;
                this.Z0 = gVar.a1;
                this.Y--;
                return gVar.Y;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.Y - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            boolean z;
            if (this.Y0 != null) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.h0(z, "no calls to next() since the last call to remove()");
            g<K, V> gVar = this.Y0;
            if (gVar != this.Z) {
                this.Z0 = gVar.a1;
                this.Y--;
            } else {
                this.Z = gVar.Z0;
            }
            F01.this.C(gVar);
            this.Y0 = null;
        }

        @Override // java.util.ListIterator
        public void set(@InterfaceC7894ly1 V v) {
            boolean z;
            if (this.Y0 != null) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.g0(z);
            this.Y0.Y = v;
        }

        public i(@InterfaceC7894ly1 K k, int i) {
            f fVar = (f) F01.this.c1.get(k);
            int i2 = fVar == null ? 0 : fVar.c;
            C10664xF1.d0(i, i2);
            if (i >= i2 / 2) {
                this.Z0 = fVar == null ? null : fVar.b;
                this.Y = i2;
                while (true) {
                    int i3 = i + 1;
                    if (i >= i2) {
                        break;
                    }
                    previous();
                    i = i3;
                }
            } else {
                this.Z = fVar == null ? null : fVar.a;
                while (true) {
                    int i4 = i - 1;
                    if (i <= 0) {
                        break;
                    }
                    next();
                    i = i4;
                }
            }
            this.X = k;
            this.Y0 = null;
        }
    }

    public F01(InterfaceC10058um1<? extends K, ? extends V> interfaceC10058um1) {
        this(interfaceC10058um1.keySet().size());
        B0(interfaceC10058um1);
    }
}
