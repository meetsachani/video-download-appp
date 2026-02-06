package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import o.Y71;
import o.Z71.InterfaceC4878j;
import o.Z71.o;

@InterfaceC11149zF0
/* loaded from: classes3.dex */
public class Z71<K, V, E extends InterfaceC4878j<K, V, E>, S extends o<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
    public static final int e1 = 1073741824;
    public static final int f1 = 65536;
    public static final int g1 = 3;
    public static final int h1 = 63;
    public static final int i1 = 16;
    public static final long j1 = 60;
    public static final H<Object, Object, C4874f> k1 = new C4869a();
    private static final long serialVersionUID = 5;
    public final transient int X;
    public final transient int Y;
    public final int Y0;
    public final transient o<K, V, E, S>[] Z;
    public final AbstractC6843he0<Object> Z0;
    public final transient k<K, V, E, S> a1;
    @MB
    public transient Set<K> b1;
    @MB
    public transient Collection<V> c1;
    @MB
    public transient Set<Map.Entry<K, V>> d1;

    /* loaded from: classes3.dex */
    public static final class C<K, V> extends AbstractC4872d<K, V, C<K, V>> implements x<K, V, C<K, V>> {
        @MB
        public volatile V Z;

        /* loaded from: classes3.dex */
        public static final class a<K, V> implements k<K, V, C<K, V>, D<K, V>> {
            public static final a<?, ?> a = new a<>();

            public static <K, V> a<K, V> h() {
                return (a<K, V>) a;
            }

            @Override // o.Z71.k
            public q b() {
                return q.X;
            }

            @Override // o.Z71.k
            public q f() {
                return q.Y;
            }

            @Override // o.Z71.k
            /* renamed from: g */
            public C<K, V> c(D<K, V> d, C<K, V> c, @MB C<K, V> c2) {
                if (c.getKey() == null) {
                    return null;
                }
                return c.a(d.c1, c2);
            }

            @Override // o.Z71.k
            /* renamed from: i */
            public C<K, V> a(D<K, V> d, K k, int i, @MB C<K, V> c) {
                return new C<>(d.c1, k, i, c);
            }

            @Override // o.Z71.k
            /* renamed from: j */
            public D<K, V> e(Z71<K, V, C<K, V>, D<K, V>> z71, int i, int i2) {
                return new D<>(z71, i, i2);
            }

            @Override // o.Z71.k
            /* renamed from: k */
            public void d(D<K, V> d, C<K, V> c, V v) {
                c.b(v);
            }
        }

        public C(ReferenceQueue<K> referenceQueue, K k, int i, @MB C<K, V> c) {
            super(referenceQueue, k, i, c);
            this.Z = null;
        }

        public C<K, V> a(ReferenceQueue<K> referenceQueue, C<K, V> c) {
            C<K, V> c2 = new C<>(referenceQueue, getKey(), this.X, c);
            c2.b(this.Z);
            return c2;
        }

        public void b(V v) {
            this.Z = v;
        }

        @Override // o.Z71.InterfaceC4878j
        @MB
        public V getValue() {
            return this.Z;
        }
    }

    /* loaded from: classes3.dex */
    public static final class E<K, V> extends AbstractC4872d<K, V, E<K, V>> implements G<K, V, E<K, V>> {
        public volatile H<K, V, E<K, V>> Z;

        /* loaded from: classes3.dex */
        public static final class a<K, V> implements k<K, V, E<K, V>, F<K, V>> {
            public static final a<?, ?> a = new a<>();

            public static <K, V> a<K, V> h() {
                return (a<K, V>) a;
            }

            @Override // o.Z71.k
            public q b() {
                return q.Y;
            }

            @Override // o.Z71.k
            public q f() {
                return q.Y;
            }

            @Override // o.Z71.k
            /* renamed from: g */
            public E<K, V> c(F<K, V> f, E<K, V> e, @MB E<K, V> e2) {
                if (e.getKey() == null || o.v(e)) {
                    return null;
                }
                return e.c(f.c1, f.d1, e2);
            }

            @Override // o.Z71.k
            /* renamed from: i */
            public E<K, V> a(F<K, V> f, K k, int i, @MB E<K, V> e) {
                return new E<>(f.c1, k, i, e);
            }

            @Override // o.Z71.k
            /* renamed from: j */
            public F<K, V> e(Z71<K, V, E<K, V>, F<K, V>> z71, int i, int i2) {
                return new F<>(z71, i, i2);
            }

            @Override // o.Z71.k
            /* renamed from: k */
            public void d(F<K, V> f, E<K, V> e, V v) {
                e.d(v, f.d1);
            }
        }

        public E(ReferenceQueue<K> referenceQueue, K k, int i, @MB E<K, V> e) {
            super(referenceQueue, k, i, e);
            this.Z = Z71.u();
        }

        public E<K, V> c(ReferenceQueue<K> referenceQueue, ReferenceQueue<V> referenceQueue2, E<K, V> e) {
            E<K, V> e2 = new E<>(referenceQueue, getKey(), this.X, e);
            e2.Z = this.Z.a(referenceQueue2, e2);
            return e2;
        }

        public void d(V v, ReferenceQueue<V> referenceQueue) {
            H<K, V, E<K, V>> h = this.Z;
            this.Z = new I(referenceQueue, v, this);
            h.clear();
        }

        @Override // o.Z71.G
        public H<K, V, E<K, V>> e() {
            return this.Z;
        }

        @Override // o.Z71.G
        public void f() {
            this.Z.clear();
        }

        @Override // o.Z71.InterfaceC4878j
        public V getValue() {
            return this.Z.get();
        }
    }

    /* loaded from: classes3.dex */
    public interface G<K, V, E extends InterfaceC4878j<K, V, E>> extends InterfaceC4878j<K, V, E> {
        H<K, V, E> e();

        void f();
    }

    /* loaded from: classes3.dex */
    public interface H<K, V, E extends InterfaceC4878j<K, V, E>> {
        H<K, V, E> a(ReferenceQueue<V> referenceQueue, E e);

        E b();

        void clear();

        @MB
        V get();
    }

    /* loaded from: classes3.dex */
    public static final class I<K, V, E extends InterfaceC4878j<K, V, E>> extends WeakReference<V> implements H<K, V, E> {
        @GJ2
        public final E X;

        public I(ReferenceQueue<V> referenceQueue, V v, E e) {
            super(v, referenceQueue);
            this.X = e;
        }

        @Override // o.Z71.H
        public H<K, V, E> a(ReferenceQueue<V> referenceQueue, E e) {
            return new I(referenceQueue, get(), e);
        }

        @Override // o.Z71.H
        public E b() {
            return this.X;
        }
    }

    /* loaded from: classes3.dex */
    public final class J extends M1<K, V> {
        public final K X;
        public V Y;

        public J(K k, V v) {
            this.X = k;
            this.Y = v;
        }

        @Override // o.M1, java.util.Map.Entry
        public boolean equals(@MB Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (this.X.equals(entry.getKey()) && this.Y.equals(entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // o.M1, java.util.Map.Entry
        public K getKey() {
            return this.X;
        }

        @Override // o.M1, java.util.Map.Entry
        public V getValue() {
            return this.Y;
        }

        @Override // o.M1, java.util.Map.Entry
        public int hashCode() {
            return this.X.hashCode() ^ this.Y.hashCode();
        }

        @Override // o.M1, java.util.Map.Entry
        public V setValue(V v) {
            V v2 = (V) Z71.this.put(this.X, v);
            this.Y = v;
            return v2;
        }
    }

    /* renamed from: o.Z71$b  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC4870b<K, V> extends AbstractConcurrentMapC4570Vx0<K, V> implements Serializable {
        private static final long serialVersionUID = 3;
        public final q X;
        public final q Y;
        public final AbstractC6843he0<Object> Y0;
        public final AbstractC6843he0<Object> Z;
        public final int Z0;
        public transient ConcurrentMap<K, V> a1;

        public AbstractC4870b(q qVar, q qVar2, AbstractC6843he0<Object> abstractC6843he0, AbstractC6843he0<Object> abstractC6843he02, int i, ConcurrentMap<K, V> concurrentMap) {
            this.X = qVar;
            this.Y = qVar2;
            this.Z = abstractC6843he0;
            this.Y0 = abstractC6843he02;
            this.Z0 = i;
            this.a1 = concurrentMap;
        }

        @Override // o.AbstractConcurrentMapC4570Vx0, o.AbstractC9862ty0
        /* renamed from: W5 */
        public ConcurrentMap<K, V> M5() {
            return this.a1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void X5(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            while (true) {
                Object readObject = objectInputStream.readObject();
                if (readObject == null) {
                    return;
                }
                this.a1.put(readObject, objectInputStream.readObject());
            }
        }

        public Y71 Y5(ObjectInputStream objectInputStream) throws IOException {
            return new Y71().g(objectInputStream.readInt()).j(this.X).k(this.Y).h(this.Z).a(this.Z0);
        }

        public void Z5(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeInt(this.a1.size());
            for (Map.Entry<K, V> entry : this.a1.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject(null);
        }
    }

    /* renamed from: o.Z71$c  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC4871c<K, V, E extends InterfaceC4878j<K, V, E>> implements InterfaceC4878j<K, V, E> {
        public final K X;
        public final int Y;
        @MB
        public final E Z;

        public AbstractC4871c(K k, int i, @MB E e) {
            this.X = k;
            this.Y = i;
            this.Z = e;
        }

        @Override // o.Z71.InterfaceC4878j
        public int g() {
            return this.Y;
        }

        @Override // o.Z71.InterfaceC4878j
        public K getKey() {
            return this.X;
        }

        @Override // o.Z71.InterfaceC4878j
        public E h() {
            return this.Z;
        }
    }

    /* renamed from: o.Z71$d  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC4872d<K, V, E extends InterfaceC4878j<K, V, E>> extends WeakReference<K> implements InterfaceC4878j<K, V, E> {
        public final int X;
        @MB
        public final E Y;

        public AbstractC4872d(ReferenceQueue<K> referenceQueue, K k, int i, @MB E e) {
            super(k, referenceQueue);
            this.X = i;
            this.Y = e;
        }

        @Override // o.Z71.InterfaceC4878j
        public int g() {
            return this.X;
        }

        @Override // o.Z71.InterfaceC4878j
        public K getKey() {
            return get();
        }

        @Override // o.Z71.InterfaceC4878j
        public E h() {
            return this.Y;
        }
    }

    /* renamed from: o.Z71$e  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class RunnableC4873e implements Runnable {
        public final WeakReference<Z71<?, ?, ?, ?>> X;

        public RunnableC4873e(Z71<?, ?, ?, ?> z71) {
            this.X = new WeakReference<>(z71);
        }

        @Override // java.lang.Runnable
        public void run() {
            Z71<?, ?, ?, ?> z71 = this.X.get();
            if (z71 != null) {
                for (o<?, ?, ?, ?> oVar : z71.Z) {
                    oVar.O();
                }
                return;
            }
            throw new CancellationException();
        }
    }

    /* renamed from: o.Z71$f  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C4874f implements InterfaceC4878j<Object, Object, C4874f> {
        public C4874f() {
            throw new AssertionError();
        }

        @Override // o.Z71.InterfaceC4878j
        /* renamed from: a */
        public C4874f h() {
            throw new AssertionError();
        }

        @Override // o.Z71.InterfaceC4878j
        public int g() {
            throw new AssertionError();
        }

        @Override // o.Z71.InterfaceC4878j
        public Object getKey() {
            throw new AssertionError();
        }

        @Override // o.Z71.InterfaceC4878j
        public Object getValue() {
            throw new AssertionError();
        }
    }

    /* renamed from: o.Z71$g  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public final class C4875g extends Z71<K, V, E, S>.AbstractC4877i<Map.Entry<K, V>> {
        public C4875g(Z71 z71) {
            super();
        }

        @Override // o.Z71.AbstractC4877i, java.util.Iterator
        /* renamed from: g */
        public Map.Entry<K, V> next() {
            return d();
        }
    }

    /* renamed from: o.Z71$h  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public final class C4876h extends n<Map.Entry<K, V>> {
        public C4876h() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Z71.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (obj2 = Z71.this.get(key)) == null || !Z71.this.v().d(entry.getValue(), obj2)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Z71.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C4875g(Z71.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || !Z71.this.remove(key, entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return Z71.this.size();
        }
    }

    /* renamed from: o.Z71$i  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public abstract class AbstractC4877i<T> implements Iterator<T> {
        public int X;
        public int Y = -1;
        @MB
        public AtomicReferenceArray<E> Y0;
        @MB
        public o<K, V, E, S> Z;
        @MB
        public E Z0;
        @MB
        public Z71<K, V, E, S>.J a1;
        @MB
        public Z71<K, V, E, S>.J b1;

        public AbstractC4877i() {
            this.X = Z71.this.Z.length - 1;
            b();
        }

        public final void b() {
            this.a1 = null;
            if (e() || f()) {
                return;
            }
            while (true) {
                int i = this.X;
                if (i >= 0) {
                    o<K, V, E, S>[] oVarArr = Z71.this.Z;
                    this.X = i - 1;
                    o<K, V, E, S> oVar = oVarArr[i];
                    this.Z = oVar;
                    if (oVar.Y != 0) {
                        AtomicReferenceArray<E> atomicReferenceArray = this.Z.Z0;
                        this.Y0 = atomicReferenceArray;
                        this.Y = atomicReferenceArray.length() - 1;
                        if (f()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }

        public boolean c(E e) {
            try {
                Object key = e.getKey();
                Object g = Z71.this.g(e);
                if (g != null) {
                    this.a1 = new J(key, g);
                    this.Z.B();
                    return true;
                }
                this.Z.B();
                return false;
            } catch (Throwable th) {
                this.Z.B();
                throw th;
            }
        }

        public Z71<K, V, E, S>.J d() {
            Z71<K, V, E, S>.J j = this.a1;
            if (j != null) {
                this.b1 = j;
                b();
                return this.b1;
            }
            throw new NoSuchElementException();
        }

        public boolean e() {
            E e = this.Z0;
            if (e == null) {
                return false;
            }
            while (true) {
                this.Z0 = (E) e.h();
                E e2 = this.Z0;
                if (e2 != null) {
                    if (c(e2)) {
                        return true;
                    }
                    e = this.Z0;
                } else {
                    return false;
                }
            }
        }

        public boolean f() {
            while (true) {
                int i = this.Y;
                if (i >= 0) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.Y0;
                    this.Y = i - 1;
                    E e = atomicReferenceArray.get(i);
                    this.Z0 = e;
                    if (e != null && (c(e) || e())) {
                        return true;
                    }
                } else {
                    return false;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.a1 != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public abstract T next();

        @Override // java.util.Iterator
        public void remove() {
            boolean z;
            if (this.b1 != null) {
                z = true;
            } else {
                z = false;
            }
            C5037aF.e(z);
            Z71.this.remove(this.b1.getKey());
            this.b1 = null;
        }
    }

    /* renamed from: o.Z71$j  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public interface InterfaceC4878j<K, V, E extends InterfaceC4878j<K, V, E>> {
        int g();

        K getKey();

        V getValue();

        E h();
    }

    /* loaded from: classes3.dex */
    public interface k<K, V, E extends InterfaceC4878j<K, V, E>, S extends o<K, V, E, S>> {
        E a(S s, K k, int i, @MB E e);

        q b();

        E c(S s, E e, @MB E e2);

        void d(S s, E e, V v);

        S e(Z71<K, V, E, S> z71, int i, int i2);

        q f();
    }

    /* loaded from: classes3.dex */
    public final class l extends Z71<K, V, E, S>.AbstractC4877i<K> {
        public l(Z71 z71) {
            super();
        }

        @Override // o.Z71.AbstractC4877i, java.util.Iterator
        public K next() {
            return d().getKey();
        }
    }

    /* loaded from: classes3.dex */
    public final class m extends n<K> {
        public m() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Z71.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return Z71.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Z71.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new l(Z71.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (Z71.this.remove(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return Z71.this.size();
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class n<E> extends AbstractSet<E> {
        public n() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return Z71.t(this).toArray();
        }

        public /* synthetic */ n(C4869a c4869a) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) Z71.t(this).toArray(tArr);
        }
    }

    /* loaded from: classes3.dex */
    public static final class p<K, V> extends AbstractC4870b<K, V> {
        private static final long serialVersionUID = 3;

        public p(q qVar, q qVar2, AbstractC6843he0<Object> abstractC6843he0, AbstractC6843he0<Object> abstractC6843he02, int i, ConcurrentMap<K, V> concurrentMap) {
            super(qVar, qVar2, abstractC6843he0, abstractC6843he02, i, concurrentMap);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.a1 = Y5(objectInputStream).i();
            X5(objectInputStream);
        }

        private Object readResolve() {
            return this.a1;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            Z5(objectOutputStream);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static abstract class q {
        public static final q X = new a("STRONG", 0);
        public static final q Y = new b("WEAK", 1);
        public static final /* synthetic */ q[] Z = e();

        /* loaded from: classes3.dex */
        public enum a extends q {
            public a(String str, int i) {
                super(str, i, null);
            }

            @Override // o.Z71.q
            public AbstractC6843he0<Object> g() {
                return AbstractC6843he0.c();
            }
        }

        /* loaded from: classes3.dex */
        public enum b extends q {
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // o.Z71.q
            public AbstractC6843he0<Object> g() {
                return AbstractC6843he0.g();
            }
        }

        public q(String str, int i) {
        }

        public static /* synthetic */ q[] e() {
            return new q[]{X, Y};
        }

        public static q valueOf(String str) {
            return (q) Enum.valueOf(q.class, str);
        }

        public static q[] values() {
            return (q[]) Z.clone();
        }

        public abstract AbstractC6843he0<Object> g();

        public /* synthetic */ q(String str, int i, C4869a c4869a) {
            this(str, i);
        }
    }

    /* loaded from: classes3.dex */
    public static final class t<K, V> extends AbstractC4871c<K, V, t<K, V>> implements x<K, V, t<K, V>> {
        @MB
        public volatile V Y0;

        /* loaded from: classes3.dex */
        public static final class a<K, V> implements k<K, V, t<K, V>, u<K, V>> {
            public static final a<?, ?> a = new a<>();

            public static <K, V> a<K, V> h() {
                return (a<K, V>) a;
            }

            @Override // o.Z71.k
            public q b() {
                return q.X;
            }

            @Override // o.Z71.k
            public q f() {
                return q.X;
            }

            @Override // o.Z71.k
            /* renamed from: g */
            public t<K, V> c(u<K, V> uVar, t<K, V> tVar, @MB t<K, V> tVar2) {
                return tVar.a(tVar2);
            }

            @Override // o.Z71.k
            /* renamed from: i */
            public t<K, V> a(u<K, V> uVar, K k, int i, @MB t<K, V> tVar) {
                return new t<>(k, i, tVar);
            }

            @Override // o.Z71.k
            /* renamed from: j */
            public u<K, V> e(Z71<K, V, t<K, V>, u<K, V>> z71, int i, int i2) {
                return new u<>(z71, i, i2);
            }

            @Override // o.Z71.k
            /* renamed from: k */
            public void d(u<K, V> uVar, t<K, V> tVar, V v) {
                tVar.b(v);
            }
        }

        public t(K k, int i, @MB t<K, V> tVar) {
            super(k, i, tVar);
            this.Y0 = null;
        }

        public t<K, V> a(t<K, V> tVar) {
            t<K, V> tVar2 = new t<>(this.X, this.Y, tVar);
            tVar2.Y0 = this.Y0;
            return tVar2;
        }

        public void b(V v) {
            this.Y0 = v;
        }

        @Override // o.Z71.InterfaceC4878j
        @MB
        public V getValue() {
            return this.Y0;
        }
    }

    /* loaded from: classes3.dex */
    public static final class v<K, V> extends AbstractC4871c<K, V, v<K, V>> implements G<K, V, v<K, V>> {
        public volatile H<K, V, v<K, V>> Y0;

        /* loaded from: classes3.dex */
        public static final class a<K, V> implements k<K, V, v<K, V>, w<K, V>> {
            public static final a<?, ?> a = new a<>();

            public static <K, V> a<K, V> h() {
                return (a<K, V>) a;
            }

            @Override // o.Z71.k
            public q b() {
                return q.Y;
            }

            @Override // o.Z71.k
            public q f() {
                return q.X;
            }

            @Override // o.Z71.k
            /* renamed from: g */
            public v<K, V> c(w<K, V> wVar, v<K, V> vVar, @MB v<K, V> vVar2) {
                if (o.v(vVar)) {
                    return null;
                }
                return vVar.c(wVar.c1, vVar2);
            }

            @Override // o.Z71.k
            /* renamed from: i */
            public v<K, V> a(w<K, V> wVar, K k, int i, @MB v<K, V> vVar) {
                return new v<>(k, i, vVar);
            }

            @Override // o.Z71.k
            /* renamed from: j */
            public w<K, V> e(Z71<K, V, v<K, V>, w<K, V>> z71, int i, int i2) {
                return new w<>(z71, i, i2);
            }

            @Override // o.Z71.k
            /* renamed from: k */
            public void d(w<K, V> wVar, v<K, V> vVar, V v) {
                vVar.d(v, wVar.c1);
            }
        }

        public v(K k, int i, @MB v<K, V> vVar) {
            super(k, i, vVar);
            this.Y0 = Z71.u();
        }

        public v<K, V> c(ReferenceQueue<V> referenceQueue, v<K, V> vVar) {
            v<K, V> vVar2 = new v<>(this.X, this.Y, vVar);
            vVar2.Y0 = this.Y0.a(referenceQueue, vVar2);
            return vVar2;
        }

        public void d(V v, ReferenceQueue<V> referenceQueue) {
            H<K, V, v<K, V>> h = this.Y0;
            this.Y0 = new I(referenceQueue, v, this);
            h.clear();
        }

        @Override // o.Z71.G
        public H<K, V, v<K, V>> e() {
            return this.Y0;
        }

        @Override // o.Z71.G
        public void f() {
            this.Y0.clear();
        }

        @Override // o.Z71.InterfaceC4878j
        public V getValue() {
            return this.Y0.get();
        }
    }

    /* loaded from: classes3.dex */
    public interface x<K, V, E extends InterfaceC4878j<K, V, E>> extends InterfaceC4878j<K, V, E> {
    }

    /* loaded from: classes3.dex */
    public final class y extends Z71<K, V, E, S>.AbstractC4877i<V> {
        public y(Z71 z71) {
            super();
        }

        @Override // o.Z71.AbstractC4877i, java.util.Iterator
        public V next() {
            return d().getValue();
        }
    }

    /* loaded from: classes3.dex */
    public final class z extends AbstractCollection<V> {
        public z() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            Z71.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return Z71.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return Z71.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new y(Z71.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return Z71.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return Z71.t(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) Z71.t(this).toArray(tArr);
        }
    }

    public Z71(Y71 y71, k<K, V, E, S> kVar) {
        this.Y0 = Math.min(y71.b(), 65536);
        this.Z0 = y71.d();
        this.a1 = kVar;
        int min = Math.min(y71.c(), 1073741824);
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        int i4 = 1;
        while (i4 < this.Y0) {
            i3++;
            i4 <<= 1;
        }
        this.Y = 32 - i3;
        this.X = i4 - 1;
        this.Z = l(i4);
        int i5 = min / i4;
        while (i2 < (i4 * i5 < min ? i5 + 1 : i5)) {
            i2 <<= 1;
        }
        while (true) {
            o<K, V, E, S>[] oVarArr = this.Z;
            if (i < oVarArr.length) {
                oVarArr[i] = d(i2, -1);
                i++;
            } else {
                return;
            }
        }
    }

    public static <K, V> Z71<K, V, ? extends InterfaceC4878j<K, V, ?>, ?> c(Y71 y71) {
        q e = y71.e();
        q qVar = q.X;
        if (e == qVar && y71.f() == qVar) {
            return new Z71<>(y71, t.a.h());
        }
        if (y71.e() == qVar && y71.f() == q.Y) {
            return new Z71<>(y71, v.a.h());
        }
        q e2 = y71.e();
        q qVar2 = q.Y;
        if (e2 == qVar2 && y71.f() == qVar) {
            return new Z71<>(y71, C.a.h());
        }
        if (y71.e() == qVar2 && y71.f() == qVar2) {
            return new Z71<>(y71, E.a.h());
        }
        throw new AssertionError();
    }

    public static <K> Z71<K, Y71.a, ? extends InterfaceC4878j<K, Y71.a, ?>, ?> e(Y71 y71) {
        q e = y71.e();
        q qVar = q.X;
        if (e == qVar && y71.f() == qVar) {
            return new Z71<>(y71, r.a.h());
        }
        q e2 = y71.e();
        q qVar2 = q.Y;
        if (e2 == qVar2 && y71.f() == qVar) {
            return new Z71<>(y71, A.a.h());
        }
        if (y71.f() == qVar2) {
            throw new IllegalArgumentException("Map cannot have both weak and dummy values");
        }
        throw new AssertionError();
    }

    public static int o(int i) {
        int i2 = i + ((i << 15) ^ (-12931));
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    public static <E> ArrayList<E> t(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        C7052iU0.a(arrayList, collection.iterator());
        return arrayList;
    }

    public static <K, V, E extends InterfaceC4878j<K, V, E>> H<K, V, E> u() {
        return (H<K, V, E>) k1;
    }

    @InterfaceC5299bJ2
    public E b(E e, E e2) {
        return r(e.g()).g(e, e2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (o<K, V, E, S> oVar : this.Z) {
            oVar.b();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@MB Object obj) {
        if (obj == null) {
            return false;
        }
        int i = i(obj);
        return r(i).e(obj, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v0, types: [o.Z71$o] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0, types: [o.Z71$o<K, V, E extends o.Z71$j<K, V, E>, S extends o.Z71$o<K, V, E, S>>[]] */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@MB Object obj) {
        boolean z2 = false;
        if (obj == null) {
            return false;
        }
        o<K, V, E, S>[] oVarArr = this.Z;
        long j = -1;
        int i = 0;
        while (i < 3) {
            int length = oVarArr.length;
            long j2 = 0;
            for (int i2 = z2; i2 < length; i2++) {
                ?? r11 = oVarArr[i2];
                int i3 = r11.Y;
                AtomicReferenceArray<E> atomicReferenceArray = r11.Z0;
                for (int i4 = z2; i4 < atomicReferenceArray.length(); i4++) {
                    E e = atomicReferenceArray.get(i4);
                    while (e != null) {
                        Object q2 = r11.q(e);
                        boolean z3 = z2;
                        if (q2 != null && v().d(obj, q2)) {
                            return true;
                        }
                        e = e.h();
                        z2 = z3;
                    }
                }
                j2 += r11.Z;
                z2 = z2;
            }
            boolean z4 = z2;
            if (j2 != j) {
                i++;
                j = j2;
                z2 = z4;
            } else {
                return z4;
            }
        }
        return z2;
    }

    public o<K, V, E, S> d(int i, int i2) {
        return (S) this.a1.e(this, i, i2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.d1;
        if (set != null) {
            return set;
        }
        C4876h c4876h = new C4876h();
        this.d1 = c4876h;
        return c4876h;
    }

    public E f(@MB Object obj) {
        if (obj == null) {
            return null;
        }
        int i = i(obj);
        return r(i).m(obj, i);
    }

    public V g(E e) {
        if (e.getKey() == null) {
            return null;
        }
        return (V) e.getValue();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(@MB Object obj) {
        if (obj == null) {
            return null;
        }
        int i = i(obj);
        return r(i).l(obj, i);
    }

    public int i(Object obj) {
        return o(this.Z0.f(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        o<K, V, E, S>[] oVarArr = this.Z;
        long j = 0;
        for (int i = 0; i < oVarArr.length; i++) {
            if (oVarArr[i].Y != 0) {
                return false;
            }
            j += oVarArr[i].Z;
        }
        if (j == 0) {
            return true;
        }
        for (int i2 = 0; i2 < oVarArr.length; i2++) {
            if (oVarArr[i2].Y != 0) {
                return false;
            }
            j -= oVarArr[i2].Z;
        }
        if (j != 0) {
            return false;
        }
        return true;
    }

    @InterfaceC5299bJ2
    public boolean j(InterfaceC4878j<K, V, ?> interfaceC4878j) {
        if (r(interfaceC4878j.g()).r(interfaceC4878j) != null) {
            return true;
        }
        return false;
    }

    @InterfaceC5299bJ2
    public q k() {
        return this.a1.f();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.b1;
        if (set != null) {
            return set;
        }
        m mVar = new m();
        this.b1 = mVar;
        return mVar;
    }

    public final o<K, V, E, S>[] l(int i) {
        return new o[i];
    }

    public void m(E e) {
        int g = e.g();
        r(g).E(e, g);
    }

    public void n(H<K, V, E> h) {
        E b = h.b();
        int g = b.g();
        r(g).F((K) b.getKey(), g, h);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @InterfaceC6181ey
    public V put(K k2, V v2) {
        C10664xF1.E(k2);
        C10664xF1.E(v2);
        int i = i(k2);
        return r(i).D(k2, i, v2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @InterfaceC6181ey
    public V putIfAbsent(K k2, V v2) {
        C10664xF1.E(k2);
        C10664xF1.E(v2);
        int i = i(k2);
        return r(i).D(k2, i, v2, true);
    }

    public o<K, V, E, S> r(int i) {
        return this.Z[(i >>> this.Y) & this.X];
    }

    @Override // java.util.AbstractMap, java.util.Map
    @InterfaceC6181ey
    public V remove(@MB Object obj) {
        if (obj == null) {
            return null;
        }
        int i = i(obj);
        return r(i).G(obj, i);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @InterfaceC6181ey
    public boolean replace(K k2, @MB V v2, V v3) {
        C10664xF1.E(k2);
        C10664xF1.E(v3);
        if (v2 == null) {
            return false;
        }
        int i = i(k2);
        return r(i).N(k2, i, v2, v3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j = 0;
        for (o<K, V, E, S> oVar : this.Z) {
            j += oVar.Y;
        }
        return C7775lT0.x(j);
    }

    @InterfaceC5299bJ2
    public AbstractC6843he0<Object> v() {
        return this.a1.b().g();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.c1;
        if (collection != null) {
            return collection;
        }
        z zVar = new z();
        this.c1 = zVar;
        return zVar;
    }

    @InterfaceC5299bJ2
    public q w() {
        return this.a1.b();
    }

    public Object writeReplace() {
        return new p(this.a1.f(), this.a1.b(), this.Z0, this.a1.b().g(), this.Y0, this);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @InterfaceC6181ey
    public boolean remove(@MB Object obj, @MB Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int i = i(obj);
        return r(i).H(obj, i, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @InterfaceC6181ey
    public V replace(K k2, V v2) {
        C10664xF1.E(k2);
        C10664xF1.E(v2);
        int i = i(k2);
        return r(i).M(k2, i, v2);
    }

    /* loaded from: classes3.dex */
    public static final class B<K> extends o<K, Y71.a, A<K>, B<K>> {
        public final ReferenceQueue<K> c1;

        public B(Z71<K, Y71.a, A<K>, B<K>> z71, int i, int i2) {
            super(z71, i, i2);
            this.c1 = new ReferenceQueue<>();
        }

        @Override // o.Z71.o
        /* renamed from: X */
        public A<K> a(InterfaceC4878j<K, Y71.a, ?> interfaceC4878j) {
            return (A) interfaceC4878j;
        }

        @Override // o.Z71.o
        public ReferenceQueue<K> o() {
            return this.c1;
        }

        @Override // o.Z71.o
        public void w() {
            c((ReferenceQueue<K>) this.c1);
        }

        @Override // o.Z71.o
        public void x() {
            i(this.c1);
        }

        @Override // o.Z71.o
        /* renamed from: Y */
        public B<K> Q() {
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static final class D<K, V> extends o<K, V, C<K, V>, D<K, V>> {
        public final ReferenceQueue<K> c1;

        public D(Z71<K, V, C<K, V>, D<K, V>> z71, int i, int i2) {
            super(z71, i, i2);
            this.c1 = new ReferenceQueue<>();
        }

        @Override // o.Z71.o
        /* renamed from: X */
        public C<K, V> a(InterfaceC4878j<K, V, ?> interfaceC4878j) {
            return (C) interfaceC4878j;
        }

        @Override // o.Z71.o
        public ReferenceQueue<K> o() {
            return this.c1;
        }

        @Override // o.Z71.o
        public void w() {
            c((ReferenceQueue<K>) this.c1);
        }

        @Override // o.Z71.o
        public void x() {
            i(this.c1);
        }

        @Override // o.Z71.o
        /* renamed from: Y */
        public D<K, V> Q() {
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static final class F<K, V> extends o<K, V, E<K, V>, F<K, V>> {
        public final ReferenceQueue<K> c1;
        public final ReferenceQueue<V> d1;

        public F(Z71<K, V, E<K, V>, F<K, V>> z71, int i, int i2) {
            super(z71, i, i2);
            this.c1 = new ReferenceQueue<>();
            this.d1 = new ReferenceQueue<>();
        }

        @Override // o.Z71.o
        public H<K, V, E<K, V>> A(InterfaceC4878j<K, V, ?> interfaceC4878j, V v) {
            return new I(this.d1, v, a(interfaceC4878j));
        }

        @Override // o.Z71.o
        public void U(InterfaceC4878j<K, V, ?> interfaceC4878j, H<K, V, ? extends InterfaceC4878j<K, V, ?>> h) {
            E<K, V> a = a(interfaceC4878j);
            H h2 = a.Z;
            a.Z = h;
            h2.clear();
        }

        @Override // o.Z71.o
        /* renamed from: Y */
        public E<K, V> a(InterfaceC4878j<K, V, ?> interfaceC4878j) {
            return (E) interfaceC4878j;
        }

        @Override // o.Z71.o
        public ReferenceQueue<K> o() {
            return this.c1;
        }

        @Override // o.Z71.o
        public ReferenceQueue<V> s() {
            return this.d1;
        }

        @Override // o.Z71.o
        public H<K, V, E<K, V>> t(InterfaceC4878j<K, V, ?> interfaceC4878j) {
            return a(interfaceC4878j).e();
        }

        @Override // o.Z71.o
        public void w() {
            c((ReferenceQueue<K>) this.c1);
        }

        @Override // o.Z71.o
        public void x() {
            i(this.c1);
            j(this.d1);
        }

        @Override // o.Z71.o
        /* renamed from: Z */
        public F<K, V> Q() {
            return this;
        }
    }

    /* renamed from: o.Z71$a  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public class C4869a implements H<Object, Object, C4874f> {
        @Override // o.Z71.H
        /* renamed from: d */
        public C4874f b() {
            return null;
        }

        @Override // o.Z71.H
        public Object get() {
            return null;
        }

        @Override // o.Z71.H
        public void clear() {
        }

        @Override // o.Z71.H
        /* renamed from: c */
        public H<Object, Object, C4874f> a(ReferenceQueue<Object> referenceQueue, C4874f c4874f) {
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class o<K, V, E extends InterfaceC4878j<K, V, E>, S extends o<K, V, E, S>> extends ReentrantLock {
        @GJ2
        public final Z71<K, V, E, S> X;
        public volatile int Y;
        public int Y0;
        public int Z;
        @MB
        public volatile AtomicReferenceArray<E> Z0;
        public final int a1;
        public final AtomicInteger b1 = new AtomicInteger();

        public o(Z71<K, V, E, S> z71, int i, int i2) {
            this.X = z71;
            this.a1 = i2;
            u(y(i));
        }

        public static <K, V, E extends InterfaceC4878j<K, V, E>> boolean v(E e) {
            if (e.getValue() == null) {
                return true;
            }
            return false;
        }

        public H<K, V, E> A(InterfaceC4878j<K, V, ?> interfaceC4878j, V v) {
            throw new AssertionError();
        }

        public void B() {
            if ((this.b1.incrementAndGet() & 63) == 0) {
                O();
            }
        }

        @InterfaceC7980mF0("this")
        public void C() {
            P();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public V D(K k, int i, V v, boolean z) {
            lock();
            try {
                C();
                int i2 = this.Y + 1;
                if (i2 > this.Y0) {
                    k();
                    i2 = this.Y + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.Z0;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InterfaceC4878j interfaceC4878j = e; interfaceC4878j != null; interfaceC4878j = interfaceC4878j.h()) {
                    Object key = interfaceC4878j.getKey();
                    if (interfaceC4878j.g() == i && key != null && this.X.Z0.d(k, key)) {
                        V v2 = (V) interfaceC4878j.getValue();
                        if (v2 == null) {
                            this.Z++;
                            S(interfaceC4878j, v);
                            this.Y = this.Y;
                            unlock();
                            return null;
                        } else if (z) {
                            unlock();
                            return v2;
                        } else {
                            this.Z++;
                            S(interfaceC4878j, v);
                            unlock();
                            return v2;
                        }
                    }
                }
                this.Z++;
                E a = this.X.a1.a(Q(), k, i, e);
                S(a, v);
                atomicReferenceArray.set(length, a);
                this.Y = i2;
                unlock();
                return null;
            } catch (Throwable th) {
                unlock();
                throw th;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC6181ey
        public boolean E(E e, int i) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.Z0;
                int length = i & (atomicReferenceArray.length() - 1);
                E e2 = atomicReferenceArray.get(length);
                for (InterfaceC4878j interfaceC4878j = e2; interfaceC4878j != null; interfaceC4878j = interfaceC4878j.h()) {
                    if (interfaceC4878j == e) {
                        this.Z++;
                        atomicReferenceArray.set(length, J(e2, interfaceC4878j));
                        this.Y--;
                        return true;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC6181ey
        public boolean F(K k, int i, H<K, V, E> h) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.Z0;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InterfaceC4878j interfaceC4878j = e; interfaceC4878j != null; interfaceC4878j = interfaceC4878j.h()) {
                    Object key = interfaceC4878j.getKey();
                    if (interfaceC4878j.g() == i && key != null && this.X.Z0.d(k, key)) {
                        if (((G) interfaceC4878j).e() != h) {
                            return false;
                        }
                        this.Z++;
                        atomicReferenceArray.set(length, J(e, interfaceC4878j));
                        this.Y--;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC6181ey
        public V G(Object obj, int i) {
            lock();
            try {
                C();
                AtomicReferenceArray<E> atomicReferenceArray = this.Z0;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InterfaceC4878j interfaceC4878j = e; interfaceC4878j != null; interfaceC4878j = interfaceC4878j.h()) {
                    Object key = interfaceC4878j.getKey();
                    if (interfaceC4878j.g() == i && key != null && this.X.Z0.d(obj, key)) {
                        V v = (V) interfaceC4878j.getValue();
                        if (v == null && !v(interfaceC4878j)) {
                            return null;
                        }
                        this.Z++;
                        atomicReferenceArray.set(length, J(e, interfaceC4878j));
                        this.Y--;
                        return v;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
            if (r8.X.v().d(r11, r4.getValue()) == false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
            r5 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
            if (v(r4) == false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
            r8.Z++;
            r0.set(r1, J(r3, r4));
            r8.Y--;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
            return false;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean H(Object obj, int i, Object obj2) {
            lock();
            try {
                C();
                AtomicReferenceArray<E> atomicReferenceArray = this.Z0;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                InterfaceC4878j interfaceC4878j = e;
                while (true) {
                    boolean z = false;
                    if (interfaceC4878j == null) {
                        return false;
                    }
                    Object key = interfaceC4878j.getKey();
                    if (interfaceC4878j.g() == i && key != null && this.X.Z0.d(obj, key)) {
                        break;
                    }
                    interfaceC4878j = interfaceC4878j.h();
                }
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC7980mF0("this")
        public boolean I(E e) {
            int g = e.g();
            AtomicReferenceArray<E> atomicReferenceArray = this.Z0;
            int length = g & (atomicReferenceArray.length() - 1);
            E e2 = atomicReferenceArray.get(length);
            for (InterfaceC4878j interfaceC4878j = e2; interfaceC4878j != null; interfaceC4878j = interfaceC4878j.h()) {
                if (interfaceC4878j == e) {
                    this.Z++;
                    atomicReferenceArray.set(length, J(e2, interfaceC4878j));
                    this.Y--;
                    return true;
                }
            }
            return false;
        }

        @InterfaceC7980mF0("this")
        public E J(E e, E e2) {
            int i = this.Y;
            E e3 = (E) e2.h();
            while (e != e2) {
                E g = g(e, e3);
                if (g != null) {
                    e3 = g;
                } else {
                    i--;
                }
                e = (E) e.h();
            }
            this.Y = i;
            return e3;
        }

        public E K(InterfaceC4878j<K, V, ?> interfaceC4878j, InterfaceC4878j<K, V, ?> interfaceC4878j2) {
            return J(a(interfaceC4878j), a(interfaceC4878j2));
        }

        @InterfaceC6181ey
        public boolean L(InterfaceC4878j<K, V, ?> interfaceC4878j) {
            return I(a(interfaceC4878j));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public V M(K k, int i, V v) {
            lock();
            try {
                C();
                AtomicReferenceArray<E> atomicReferenceArray = this.Z0;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InterfaceC4878j interfaceC4878j = e; interfaceC4878j != null; interfaceC4878j = interfaceC4878j.h()) {
                    Object key = interfaceC4878j.getKey();
                    if (interfaceC4878j.g() == i && key != null && this.X.Z0.d(k, key)) {
                        V v2 = (V) interfaceC4878j.getValue();
                        if (v2 == null) {
                            if (v(interfaceC4878j)) {
                                this.Z++;
                                atomicReferenceArray.set(length, J(e, interfaceC4878j));
                                this.Y--;
                            }
                            return null;
                        }
                        this.Z++;
                        S(interfaceC4878j, v);
                        return v2;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean N(K k, int i, V v, V v2) {
            lock();
            try {
                C();
                AtomicReferenceArray<E> atomicReferenceArray = this.Z0;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InterfaceC4878j interfaceC4878j = e; interfaceC4878j != null; interfaceC4878j = interfaceC4878j.h()) {
                    Object key = interfaceC4878j.getKey();
                    if (interfaceC4878j.g() == i && key != null && this.X.Z0.d(k, key)) {
                        Object value = interfaceC4878j.getValue();
                        if (value == null) {
                            if (v(interfaceC4878j)) {
                                this.Z++;
                                atomicReferenceArray.set(length, J(e, interfaceC4878j));
                                this.Y--;
                            }
                            return false;
                        } else if (!this.X.v().d(v, value)) {
                            return false;
                        } else {
                            this.Z++;
                            S(interfaceC4878j, v2);
                            return true;
                        }
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        public void O() {
            P();
        }

        public void P() {
            if (tryLock()) {
                try {
                    x();
                    this.b1.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public abstract S Q();

        public void R(int i, InterfaceC4878j<K, V, ?> interfaceC4878j) {
            this.Z0.set(i, a(interfaceC4878j));
        }

        public void S(E e, V v) {
            this.X.a1.d(Q(), e, v);
        }

        public void T(InterfaceC4878j<K, V, ?> interfaceC4878j, V v) {
            this.X.a1.d(Q(), a(interfaceC4878j), v);
        }

        public void U(InterfaceC4878j<K, V, ?> interfaceC4878j, H<K, V, ? extends InterfaceC4878j<K, V, ?>> h) {
            throw new AssertionError();
        }

        public void V() {
            if (tryLock()) {
                try {
                    x();
                } finally {
                    unlock();
                }
            }
        }

        public abstract E a(InterfaceC4878j<K, V, ?> interfaceC4878j);

        public void b() {
            if (this.Y != 0) {
                lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = this.Z0;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        atomicReferenceArray.set(i, null);
                    }
                    w();
                    this.b1.set(0);
                    this.Z++;
                    this.Y = 0;
                    unlock();
                } catch (Throwable th) {
                    unlock();
                    throw th;
                }
            }
        }

        public <T> void c(ReferenceQueue<T> referenceQueue) {
            do {
            } while (referenceQueue.poll() != null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC6181ey
        public boolean d(K k, int i, H<K, V, ? extends InterfaceC4878j<K, V, ?>> h) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.Z0;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InterfaceC4878j interfaceC4878j = e; interfaceC4878j != null; interfaceC4878j = interfaceC4878j.h()) {
                    Object key = interfaceC4878j.getKey();
                    if (interfaceC4878j.g() == i && key != null && this.X.Z0.d(k, key)) {
                        if (((G) interfaceC4878j).e() != h) {
                            return false;
                        }
                        atomicReferenceArray.set(length, J(e, interfaceC4878j));
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        public boolean e(Object obj, int i) {
            try {
                boolean z = false;
                if (this.Y == 0) {
                    return false;
                }
                E p = p(obj, i);
                if (p != null) {
                    if (p.getValue() != null) {
                        z = true;
                    }
                }
                return z;
            } finally {
                B();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC5299bJ2
        public boolean f(Object obj) {
            try {
                if (this.Y != 0) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.Z0;
                    int length = atomicReferenceArray.length();
                    for (int i = 0; i < length; i++) {
                        for (E e = atomicReferenceArray.get(i); e != null; e = e.h()) {
                            Object q = q(e);
                            if (q != null && this.X.v().d(obj, q)) {
                                B();
                                return true;
                            }
                        }
                    }
                }
                return false;
            } finally {
                B();
            }
        }

        public E g(E e, E e2) {
            return this.X.a1.c(Q(), e, e2);
        }

        public E h(InterfaceC4878j<K, V, ?> interfaceC4878j, @MB InterfaceC4878j<K, V, ?> interfaceC4878j2) {
            return this.X.a1.c(Q(), a(interfaceC4878j), a(interfaceC4878j2));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC7980mF0("this")
        public void i(ReferenceQueue<K> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends K> poll = referenceQueue.poll();
                if (poll != null) {
                    this.X.m((InterfaceC4878j) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        @InterfaceC7980mF0("this")
        public void j(ReferenceQueue<V> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends V> poll = referenceQueue.poll();
                if (poll != null) {
                    this.X.n((H) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC7980mF0("this")
        public void k() {
            AtomicReferenceArray<E> atomicReferenceArray = this.Z0;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i = this.Y;
            AtomicReferenceArray<E> atomicReferenceArray2 = (AtomicReferenceArray<E>) y(length << 1);
            this.Y0 = (atomicReferenceArray2.length() * 3) / 4;
            int length2 = atomicReferenceArray2.length() - 1;
            for (int i2 = 0; i2 < length; i2++) {
                E e = atomicReferenceArray.get(i2);
                if (e != null) {
                    InterfaceC4878j h = e.h();
                    int g = e.g() & length2;
                    if (h == null) {
                        atomicReferenceArray2.set(g, e);
                    } else {
                        InterfaceC4878j interfaceC4878j = e;
                        while (h != null) {
                            int g2 = h.g() & length2;
                            if (g2 != g) {
                                interfaceC4878j = h;
                                g = g2;
                            }
                            h = h.h();
                        }
                        atomicReferenceArray2.set(g, interfaceC4878j);
                        while (e != interfaceC4878j) {
                            int g3 = e.g() & length2;
                            InterfaceC4878j g4 = g(e, (InterfaceC4878j) atomicReferenceArray2.get(g3));
                            if (g4 != null) {
                                atomicReferenceArray2.set(g3, g4);
                            } else {
                                i--;
                            }
                            e = e.h();
                        }
                    }
                }
            }
            this.Z0 = atomicReferenceArray2;
            this.Y = i;
        }

        public V l(Object obj, int i) {
            try {
                E p = p(obj, i);
                if (p == null) {
                    B();
                    return null;
                }
                V v = (V) p.getValue();
                if (v == null) {
                    V();
                }
                return v;
            } finally {
                B();
            }
        }

        public E m(Object obj, int i) {
            if (this.Y != 0) {
                for (E n = n(i); n != null; n = (E) n.h()) {
                    if (n.g() == i) {
                        Object key = n.getKey();
                        if (key == null) {
                            V();
                        } else if (this.X.Z0.d(obj, key)) {
                            return n;
                        }
                    }
                }
                return null;
            }
            return null;
        }

        public E n(int i) {
            AtomicReferenceArray<E> atomicReferenceArray = this.Z0;
            return atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
        }

        public ReferenceQueue<K> o() {
            throw new AssertionError();
        }

        public E p(Object obj, int i) {
            return m(obj, i);
        }

        @MB
        public V q(E e) {
            if (e.getKey() == null) {
                V();
                return null;
            }
            V v = (V) e.getValue();
            if (v == null) {
                V();
                return null;
            }
            return v;
        }

        @MB
        public V r(InterfaceC4878j<K, V, ?> interfaceC4878j) {
            return q(a(interfaceC4878j));
        }

        public ReferenceQueue<V> s() {
            throw new AssertionError();
        }

        public H<K, V, E> t(InterfaceC4878j<K, V, ?> interfaceC4878j) {
            throw new AssertionError();
        }

        public void u(AtomicReferenceArray<E> atomicReferenceArray) {
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.Y0 = length;
            if (length == this.a1) {
                this.Y0 = length + 1;
            }
            this.Z0 = atomicReferenceArray;
        }

        public AtomicReferenceArray<E> y(int i) {
            return new AtomicReferenceArray<>(i);
        }

        public E z(K k, int i, @MB InterfaceC4878j<K, V, ?> interfaceC4878j) {
            return this.X.a1.a(Q(), k, i, a(interfaceC4878j));
        }

        public void w() {
        }

        @InterfaceC7980mF0("this")
        public void x() {
        }
    }

    /* loaded from: classes3.dex */
    public static final class s<K> extends o<K, Y71.a, r<K>, s<K>> {
        public s(Z71<K, Y71.a, r<K>, s<K>> z71, int i, int i2) {
            super(z71, i, i2);
        }

        @Override // o.Z71.o
        /* renamed from: W */
        public r<K> a(InterfaceC4878j<K, Y71.a, ?> interfaceC4878j) {
            return (r) interfaceC4878j;
        }

        @Override // o.Z71.o
        /* renamed from: X */
        public s<K> Q() {
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static final class u<K, V> extends o<K, V, t<K, V>, u<K, V>> {
        public u(Z71<K, V, t<K, V>, u<K, V>> z71, int i, int i2) {
            super(z71, i, i2);
        }

        @Override // o.Z71.o
        /* renamed from: W */
        public t<K, V> a(InterfaceC4878j<K, V, ?> interfaceC4878j) {
            return (t) interfaceC4878j;
        }

        @Override // o.Z71.o
        /* renamed from: X */
        public u<K, V> Q() {
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static final class w<K, V> extends o<K, V, v<K, V>, w<K, V>> {
        public final ReferenceQueue<V> c1;

        public w(Z71<K, V, v<K, V>, w<K, V>> z71, int i, int i2) {
            super(z71, i, i2);
            this.c1 = new ReferenceQueue<>();
        }

        @Override // o.Z71.o
        public H<K, V, v<K, V>> A(InterfaceC4878j<K, V, ?> interfaceC4878j, V v) {
            return new I(this.c1, v, a(interfaceC4878j));
        }

        @Override // o.Z71.o
        public void U(InterfaceC4878j<K, V, ?> interfaceC4878j, H<K, V, ? extends InterfaceC4878j<K, V, ?>> h) {
            v<K, V> a = a(interfaceC4878j);
            H h2 = a.Y0;
            a.Y0 = h;
            h2.clear();
        }

        @Override // o.Z71.o
        /* renamed from: X */
        public v<K, V> a(InterfaceC4878j<K, V, ?> interfaceC4878j) {
            return (v) interfaceC4878j;
        }

        @Override // o.Z71.o
        public ReferenceQueue<V> s() {
            return this.c1;
        }

        @Override // o.Z71.o
        public H<K, V, v<K, V>> t(InterfaceC4878j<K, V, ?> interfaceC4878j) {
            return a(interfaceC4878j).e();
        }

        @Override // o.Z71.o
        public void w() {
            c((ReferenceQueue<V>) this.c1);
        }

        @Override // o.Z71.o
        public void x() {
            j(this.c1);
        }

        @Override // o.Z71.o
        /* renamed from: Y */
        public w<K, V> Q() {
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static final class A<K> extends AbstractC4872d<K, Y71.a, A<K>> implements x<K, Y71.a, A<K>> {
        public A(ReferenceQueue<K> referenceQueue, K k, int i, @MB A<K> a2) {
            super(referenceQueue, k, i, a2);
        }

        public A<K> a(ReferenceQueue<K> referenceQueue, A<K> a2) {
            return new A<>(referenceQueue, getKey(), this.X, a2);
        }

        @Override // o.Z71.InterfaceC4878j
        /* renamed from: b */
        public Y71.a getValue() {
            return Y71.a.VALUE;
        }

        public void c(Y71.a aVar) {
        }

        /* loaded from: classes3.dex */
        public static final class a<K> implements k<K, Y71.a, A<K>, B<K>> {
            public static final a<?> a = new a<>();

            public static <K> a<K> h() {
                return (a<K>) a;
            }

            @Override // o.Z71.k
            public q b() {
                return q.X;
            }

            @Override // o.Z71.k
            public q f() {
                return q.Y;
            }

            @Override // o.Z71.k
            /* renamed from: g */
            public A<K> c(B<K> b, A<K> a2, @MB A<K> a3) {
                if (a2.getKey() == null) {
                    return null;
                }
                return a2.a(b.c1, a3);
            }

            @Override // o.Z71.k
            /* renamed from: i */
            public A<K> a(B<K> b, K k, int i, @MB A<K> a2) {
                return new A<>(b.c1, k, i, a2);
            }

            @Override // o.Z71.k
            /* renamed from: j */
            public B<K> e(Z71<K, Y71.a, A<K>, B<K>> z71, int i, int i2) {
                return new B<>(z71, i, i2);
            }

            @Override // o.Z71.k
            /* renamed from: k */
            public void d(B<K> b, A<K> a2, Y71.a aVar) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class r<K> extends AbstractC4871c<K, Y71.a, r<K>> implements x<K, Y71.a, r<K>> {
        public r(K k, int i, @MB r<K> rVar) {
            super(k, i, rVar);
        }

        public r<K> a(r<K> rVar) {
            return new r<>(this.X, this.Y, rVar);
        }

        @Override // o.Z71.InterfaceC4878j
        /* renamed from: b */
        public Y71.a getValue() {
            return Y71.a.VALUE;
        }

        public void c(Y71.a aVar) {
        }

        /* loaded from: classes3.dex */
        public static final class a<K> implements k<K, Y71.a, r<K>, s<K>> {
            public static final a<?> a = new a<>();

            public static <K> a<K> h() {
                return (a<K>) a;
            }

            @Override // o.Z71.k
            public q b() {
                return q.X;
            }

            @Override // o.Z71.k
            public q f() {
                return q.X;
            }

            @Override // o.Z71.k
            /* renamed from: g */
            public r<K> c(s<K> sVar, r<K> rVar, @MB r<K> rVar2) {
                return rVar.a(rVar2);
            }

            @Override // o.Z71.k
            /* renamed from: i */
            public r<K> a(s<K> sVar, K k, int i, @MB r<K> rVar) {
                return new r<>(k, i, rVar);
            }

            @Override // o.Z71.k
            /* renamed from: j */
            public s<K> e(Z71<K, Y71.a, r<K>, s<K>> z71, int i, int i2) {
                return new s<>(z71, i, i2);
            }

            @Override // o.Z71.k
            /* renamed from: k */
            public void d(s<K> sVar, r<K> rVar, Y71.a aVar) {
            }
        }
    }
}
