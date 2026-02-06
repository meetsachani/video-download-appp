package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import o.C9634t12;
import o.InterfaceC2467Am1;

@InterfaceC11149zF0
@InterfaceC6329fa0
/* renamed from: o.qJ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8968qJ<E> extends AbstractC7180j2<E> implements Serializable {
    private static final long serialVersionUID = 1;
    public final transient ConcurrentMap<E, AtomicInteger> Z;

    /* renamed from: o.qJ$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC2804Dy0<E> {
        public final /* synthetic */ Set X;

        public a(C8968qJ c8968qJ, Set set) {
            this.X = set;
        }

        @Override // o.AbstractC2804Dy0, o.AbstractC4473Ux0
        /* renamed from: Y5 */
        public Set<E> M5() {
            return this.X;
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection
        public boolean contains(@MB Object obj) {
            if (obj != null && C7232jF.j(this.X, obj)) {
                return true;
            }
            return false;
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return Q5(collection);
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection, o.InterfaceC2467Am1
        public boolean remove(@MB Object obj) {
            if (obj != null && C7232jF.k(this.X, obj)) {
                return true;
            }
            return false;
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection, o.InterfaceC2467Am1
        public boolean removeAll(Collection<?> collection) {
            return T5(collection);
        }
    }

    /* renamed from: o.qJ$b */
    /* loaded from: classes3.dex */
    public class b extends AbstractC6437g1<InterfaceC2467Am1.a<E>> {
        public final Iterator<Map.Entry<E, AtomicInteger>> Z;

        public b() {
            this.Z = C8968qJ.this.Z.entrySet().iterator();
        }

        @Override // o.AbstractC6437g1
        @MB
        /* renamed from: e */
        public InterfaceC2467Am1.a<E> b() {
            while (this.Z.hasNext()) {
                Map.Entry<E, AtomicInteger> next = this.Z.next();
                int i = next.getValue().get();
                if (i != 0) {
                    return C2565Bm1.k(next.getKey(), i);
                }
            }
            return c();
        }
    }

    /* renamed from: o.qJ$c */
    /* loaded from: classes3.dex */
    public class c extends AbstractC7164iy0<InterfaceC2467Am1.a<E>> {
        @MB
        public InterfaceC2467Am1.a<E> X;
        public final /* synthetic */ Iterator Y;

        public c(Iterator it) {
            this.Y = it;
        }

        @Override // o.AbstractC7164iy0, o.AbstractC2510Ay0
        /* renamed from: M5 */
        public Iterator<InterfaceC2467Am1.a<E>> L5() {
            return this.Y;
        }

        @Override // o.AbstractC7164iy0, java.util.Iterator
        /* renamed from: N5 */
        public InterfaceC2467Am1.a<E> next() {
            InterfaceC2467Am1.a<E> aVar = (InterfaceC2467Am1.a) super.next();
            this.X = aVar;
            return aVar;
        }

        @Override // o.AbstractC7164iy0, java.util.Iterator
        public void remove() {
            boolean z;
            if (this.X != null) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.h0(z, "no calls to next() since the last call to remove()");
            C8968qJ.this.R(this.X.a(), 0);
            this.X = null;
        }
    }

    /* renamed from: o.qJ$d */
    /* loaded from: classes3.dex */
    public class d extends AbstractC7180j2<E>.b {
        public d() {
            super();
        }

        @Override // o.AbstractC7180j2.b, o.C2565Bm1.i
        /* renamed from: j */
        public C8968qJ<E> i() {
            return C8968qJ.this;
        }

        public final List<InterfaceC2467Am1.a<E>> k() {
            ArrayList v = C10608x11.v(size());
            C7052iU0.a(v, iterator());
            return v;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return k().toArray();
        }

        public /* synthetic */ d(C8968qJ c8968qJ, a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) k().toArray(tArr);
        }
    }

    /* renamed from: o.qJ$e */
    /* loaded from: classes3.dex */
    public static class e {
        public static final C9634t12.b<C8968qJ> a = C9634t12.a(C8968qJ.class, "countMap");
    }

    @InterfaceC5299bJ2
    public C8968qJ(ConcurrentMap<E, AtomicInteger> concurrentMap) {
        C10664xF1.u(concurrentMap.isEmpty(), "the backing map (%s) must be empty", concurrentMap);
        this.Z = concurrentMap;
    }

    public static <E> C8968qJ<E> k() {
        return new C8968qJ<>(new ConcurrentHashMap());
    }

    public static <E> C8968qJ<E> l(Iterable<? extends E> iterable) {
        C8968qJ<E> k = k();
        C5098aU0.a(k, iterable);
        return k;
    }

    @InterfaceC4238Sm
    public static <E> C8968qJ<E> p(ConcurrentMap<E, AtomicInteger> concurrentMap) {
        return new C8968qJ<>(concurrentMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        e.a.b(this, (ConcurrentMap) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.Z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (r6 != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
        r2 = new java.util.concurrent.atomic.AtomicInteger(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r4.Z.putIfAbsent(r5, r2) == null) goto L29;
     */
    @Override // o.AbstractC7180j2, o.InterfaceC2467Am1
    @InterfaceC6181ey
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int R(E e2, int i) {
        AtomicInteger atomicInteger;
        AtomicInteger atomicInteger2;
        C10664xF1.E(e2);
        C5037aF.b(i, "count");
        do {
            atomicInteger = (AtomicInteger) C7935m81.p0(this.Z, e2);
            if (atomicInteger == null && (i == 0 || (atomicInteger = this.Z.putIfAbsent(e2, new AtomicInteger(i))) == null)) {
                return 0;
            }
            while (true) {
                int i2 = atomicInteger.get();
                if (i2 == 0) {
                    break;
                } else if (atomicInteger.compareAndSet(i2, i)) {
                    if (i == 0) {
                        this.Z.remove(e2, atomicInteger);
                    }
                    return i2;
                }
            }
        } while (!this.Z.replace(e2, atomicInteger, atomicInteger2));
        return 0;
    }

    @Override // o.AbstractC7180j2, o.InterfaceC2467Am1
    @InterfaceC6181ey
    public boolean Y3(E e2, int i, int i2) {
        C10664xF1.E(e2);
        C5037aF.b(i, "oldCount");
        C5037aF.b(i2, "newCount");
        AtomicInteger atomicInteger = (AtomicInteger) C7935m81.p0(this.Z, e2);
        if (atomicInteger == null) {
            if (i != 0) {
                return false;
            }
            if (i2 != 0 && this.Z.putIfAbsent(e2, new AtomicInteger(i2)) != null) {
                return false;
            }
            return true;
        }
        int i3 = atomicInteger.get();
        if (i3 == i) {
            if (i3 == 0) {
                if (i2 == 0) {
                    this.Z.remove(e2, atomicInteger);
                    return true;
                }
                AtomicInteger atomicInteger2 = new AtomicInteger(i2);
                if (this.Z.putIfAbsent(e2, atomicInteger2) != null && !this.Z.replace(e2, atomicInteger, atomicInteger2)) {
                    return false;
                }
                return true;
            } else if (atomicInteger.compareAndSet(i3, i2)) {
                if (i2 == 0) {
                    this.Z.remove(e2, atomicInteger);
                }
                return true;
            }
        }
        return false;
    }

    @Override // o.AbstractC7180j2, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.Z.clear();
    }

    @Override // o.AbstractC7180j2, java.util.AbstractCollection, java.util.Collection, o.InterfaceC2467Am1
    public /* bridge */ /* synthetic */ boolean contains(@MB Object obj) {
        return super.contains(obj);
    }

    @Override // o.AbstractC7180j2
    public Set<E> d() {
        return new a(this, this.Z.keySet());
    }

    @Override // o.AbstractC7180j2
    @Deprecated
    public Set<InterfaceC2467Am1.a<E>> e() {
        return new d(this, null);
    }

    @Override // o.AbstractC7180j2, o.InterfaceC2467Am1
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // o.AbstractC7180j2
    public int f() {
        return this.Z.size();
    }

    @Override // o.AbstractC7180j2
    public Iterator<E> h() {
        throw new AssertionError("should never be called");
    }

    @Override // o.AbstractC7180j2
    public Iterator<InterfaceC2467Am1.a<E>> i() {
        return new c(new b());
    }

    @Override // o.AbstractC7180j2, java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.Z.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, o.InterfaceC2467Am1
    public Iterator<E> iterator() {
        return C2565Bm1.n(this);
    }

    @Override // o.AbstractC7180j2, o.InterfaceC2467Am1
    public /* bridge */ /* synthetic */ Set n() {
        return super.n();
    }

    @InterfaceC6181ey
    public boolean r(@MB Object obj, int i) {
        int i2;
        int i3;
        if (i == 0) {
            return true;
        }
        C5037aF.d(i, "occurrences");
        AtomicInteger atomicInteger = (AtomicInteger) C7935m81.p0(this.Z, obj);
        if (atomicInteger == null) {
            return false;
        }
        do {
            i2 = atomicInteger.get();
            if (i2 < i) {
                return false;
            }
            i3 = i2 - i;
        } while (!atomicInteger.compareAndSet(i2, i3));
        if (i3 == 0) {
            this.Z.remove(obj, atomicInteger);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, o.InterfaceC2467Am1
    public int size() {
        long j = 0;
        for (AtomicInteger atomicInteger : this.Z.values()) {
            j += atomicInteger.get();
        }
        return C7775lT0.x(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        return w().toArray();
    }

    @Override // o.AbstractC7180j2, o.InterfaceC2467Am1
    @InterfaceC6181ey
    public int v(@MB Object obj, int i) {
        int i2;
        int max;
        if (i == 0) {
            return w4(obj);
        }
        C5037aF.d(i, "occurrences");
        AtomicInteger atomicInteger = (AtomicInteger) C7935m81.p0(this.Z, obj);
        if (atomicInteger == null) {
            return 0;
        }
        do {
            i2 = atomicInteger.get();
            if (i2 == 0) {
                return 0;
            }
            max = Math.max(0, i2 - i);
        } while (!atomicInteger.compareAndSet(i2, max));
        if (max == 0) {
            this.Z.remove(obj, atomicInteger);
        }
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<E> w() {
        ArrayList v = C10608x11.v(size());
        for (InterfaceC2467Am1.a aVar : entrySet()) {
            Object a2 = aVar.a();
            for (int count = aVar.getCount(); count > 0; count--) {
                v.add(a2);
            }
        }
        return v;
    }

    @Override // o.InterfaceC2467Am1
    public int w4(@MB Object obj) {
        AtomicInteger atomicInteger = (AtomicInteger) C7935m81.p0(this.Z, obj);
        if (atomicInteger == null) {
            return 0;
        }
        return atomicInteger.get();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
        r2 = new java.util.concurrent.atomic.AtomicInteger(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
        if (r4.Z.putIfAbsent(r5, r2) == null) goto L31;
     */
    @Override // o.AbstractC7180j2, o.InterfaceC2467Am1
    @InterfaceC6181ey
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int x(E e2, int i) {
        AtomicInteger atomicInteger;
        AtomicInteger atomicInteger2;
        C10664xF1.E(e2);
        if (i == 0) {
            return w4(e2);
        }
        C5037aF.d(i, "occurrences");
        do {
            atomicInteger = (AtomicInteger) C7935m81.p0(this.Z, e2);
            if (atomicInteger != null || (atomicInteger = this.Z.putIfAbsent(e2, new AtomicInteger(i))) != null) {
                while (true) {
                    int i2 = atomicInteger.get();
                    if (i2 == 0) {
                        break;
                    }
                    try {
                        if (atomicInteger.compareAndSet(i2, C9979uR0.c(i2, i))) {
                            return i2;
                        }
                    } catch (ArithmeticException unused) {
                        StringBuilder sb = new StringBuilder(65);
                        sb.append("Overflow adding ");
                        sb.append(i);
                        sb.append(" occurrences to a count of ");
                        sb.append(i2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            } else {
                return 0;
            }
        } while (!this.Z.replace(e2, atomicInteger, atomicInteger2));
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) w().toArray(tArr);
    }
}
