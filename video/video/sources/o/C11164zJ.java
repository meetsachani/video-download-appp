package o;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o.MW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nConcurrentWeakMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentWeakMap.kt\nkotlinx/coroutines/debug/internal/ConcurrentWeakMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,280:1\n1#2:281\n*E\n"})
/* renamed from: o.zJ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11164zJ<K, V> extends AbstractC7909m2<K, V> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater Y = AtomicIntegerFieldUpdater.newUpdater(C11164zJ.class, "_size$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater Z = AtomicReferenceFieldUpdater.newUpdater(C11164zJ.class, Object.class, "core$volatile");
    @Nullable
    public final ReferenceQueue<K> X;
    private volatile /* synthetic */ int _size$volatile;
    private volatile /* synthetic */ Object core$volatile;

    /* renamed from: o.zJ$a */
    /* loaded from: classes3.dex */
    public final class a {
        public static final /* synthetic */ AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(a.class, "load$volatile");
        public final int a;
        public final int b;
        public final int c;
        public final /* synthetic */ AtomicReferenceArray d;
        public final /* synthetic */ AtomicReferenceArray e;
        private volatile /* synthetic */ int load$volatile;

        @InterfaceC8303na2({"SMAP\nConcurrentWeakMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentWeakMap.kt\nkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core$KeyValueIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,280:1\n1#2:281\n*E\n"})
        /* renamed from: o.zJ$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public final class C0361a<E> implements Iterator<E>, JW0 {
            @NotNull
            public final VA0<K, V, E> X;
            public int Y = -1;
            public V Y0;
            public K Z;

            /* JADX WARN: Multi-variable type inference failed */
            public C0361a(@NotNull VA0<? super K, ? super V, ? extends E> va0) {
                this.X = va0;
                b();
            }

            public final void b() {
                K k;
                while (true) {
                    int i = this.Y + 1;
                    this.Y = i;
                    if (i < a.this.a) {
                        BG0 bg0 = (BG0) a.this.f().get(this.Y);
                        if (bg0 != null && (k = (K) bg0.get()) != null) {
                            this.Z = k;
                            V v = (V) a.this.i().get(this.Y);
                            if (v instanceof C10393w81) {
                                v = (V) ((C10393w81) v).a;
                            }
                            if (v != null) {
                                this.Y0 = v;
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }

            @Override // java.util.Iterator
            @NotNull
            /* renamed from: c */
            public Void remove() {
                AJ.e();
                throw new SX0();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.Y < a.this.a) {
                    return true;
                }
                return false;
            }

            @Override // java.util.Iterator
            public E next() {
                if (this.Y < a.this.a) {
                    VA0<K, V, E> va0 = this.X;
                    K k = this.Z;
                    if (k == null) {
                        C6562gT0.S("key");
                        k = (K) C7458kA2.a;
                    }
                    V v = this.Y0;
                    if (v == null) {
                        C6562gT0.S("value");
                        v = (V) C7458kA2.a;
                    }
                    E i = va0.i(k, v);
                    b();
                    return i;
                }
                throw new NoSuchElementException();
            }
        }

        public a(int i) {
            this.a = i;
            this.b = Integer.numberOfLeadingZeros(i) + 1;
            this.c = (i * 2) / 3;
            this.d = new AtomicReferenceArray(i);
            this.e = new AtomicReferenceArray(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object m(a aVar, Object obj, Object obj2, BG0 bg0, int i, Object obj3) {
            if ((i & 4) != 0) {
                bg0 = null;
            }
            return aVar.l(obj, obj2, bg0);
        }

        public final void d(@NotNull BG0<?> bg0) {
            int j = j(bg0.a);
            while (true) {
                BG0<?> bg02 = (BG0) f().get(j);
                if (bg02 == null) {
                    return;
                }
                if (bg02 == bg0) {
                    o(j);
                    return;
                }
                if (j == 0) {
                    j = this.a;
                }
                j--;
            }
        }

        @Nullable
        public final V e(@NotNull K k) {
            int j = j(k.hashCode());
            while (true) {
                BG0 bg0 = (BG0) f().get(j);
                if (bg0 == null) {
                    return null;
                }
                T t = bg0.get();
                if (C6562gT0.g(k, t)) {
                    V v = (V) i().get(j);
                    if (v instanceof C10393w81) {
                        return (V) ((C10393w81) v).a;
                    }
                    return v;
                }
                if (t == 0) {
                    o(j);
                }
                if (j == 0) {
                    j = this.a;
                }
                j--;
            }
        }

        public final /* synthetic */ AtomicReferenceArray f() {
            return this.d;
        }

        public final /* synthetic */ int g() {
            return this.load$volatile;
        }

        public final /* synthetic */ AtomicReferenceArray i() {
            return this.e;
        }

        public final int j(int i) {
            return (i * (-1640531527)) >>> this.b;
        }

        @NotNull
        public final <E> Iterator<E> k(@NotNull VA0<? super K, ? super V, ? extends E> va0) {
            return new C0361a(va0);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
            r6 = i().get(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
            if ((r6 instanceof o.C10393w81) == false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
            r6 = o.AJ.c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
            if (o.C3626Mf2.a(i(), r0, r6, r7) == false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
            return r6;
         */
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object l(@NotNull K k, @Nullable V v, @Nullable BG0<K> bg0) {
            int i;
            C7592kj2 c7592kj2;
            int j = j(k.hashCode());
            boolean z = false;
            while (true) {
                BG0 bg02 = (BG0) f().get(j);
                if (bg02 == null) {
                    if (v == null) {
                        return null;
                    }
                    if (!z) {
                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
                        do {
                            i = atomicIntegerFieldUpdater.get(this);
                            if (i >= this.c) {
                                c7592kj2 = AJ.c;
                                return c7592kj2;
                            }
                        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1));
                        z = true;
                    }
                    if (bg0 == null) {
                        bg0 = new BG0<>(k, C11164zJ.this.X);
                    }
                    if (C3626Mf2.a(f(), j, null, bg0)) {
                        break;
                    }
                } else {
                    T t = bg02.get();
                    if (C6562gT0.g(k, t)) {
                        if (z) {
                            g.decrementAndGet(this);
                        }
                    } else {
                        if (t == 0) {
                            o(j);
                        }
                        if (j == 0) {
                            j = this.a;
                        }
                        j--;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final C11164zJ<K, V>.a n() {
            Object obj;
            Object obj2;
            C7592kj2 c7592kj2;
            C10393w81 d;
            while (true) {
                C11164zJ<K, V>.a aVar = (C11164zJ<K, V>.a) new a(Integer.highestOneBit(C5075aO1.u(C11164zJ.this.size(), 4)) * 4);
                int i = this.a;
                for (int i2 = 0; i2 < i; i2++) {
                    BG0 bg0 = (BG0) f().get(i2);
                    if (bg0 != null) {
                        obj = bg0.get();
                    } else {
                        obj = null;
                    }
                    if (bg0 != null && obj == null) {
                        o(i2);
                    }
                    while (true) {
                        obj2 = i().get(i2);
                        if (obj2 instanceof C10393w81) {
                            obj2 = ((C10393w81) obj2).a;
                            break;
                        }
                        AtomicReferenceArray i3 = i();
                        d = AJ.d(obj2);
                        if (C3626Mf2.a(i3, i2, obj2, d)) {
                            break;
                        }
                    }
                    if (obj != null && obj2 != null) {
                        Object l = aVar.l(obj, obj2, bg0);
                        c7592kj2 = AJ.c;
                        if (l != c7592kj2) {
                        }
                    }
                }
                return aVar;
            }
        }

        public final void o(int i) {
            Object obj;
            do {
                obj = i().get(i);
                if (obj == null || (obj instanceof C10393w81)) {
                    return;
                }
            } while (!C3626Mf2.a(i(), i, obj, null));
            C11164zJ.this.o();
        }

        public final /* synthetic */ void p(int i) {
            this.load$volatile = i;
        }

        public final /* synthetic */ void q(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, HA0<? super Integer, Integer> ha0) {
            int i;
            do {
                i = atomicIntegerFieldUpdater.get(obj);
            } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i, ha0.invoke(Integer.valueOf(i)).intValue()));
        }
    }

    /* renamed from: o.zJ$b */
    /* loaded from: classes3.dex */
    public static final class b<K, V> implements Map.Entry<K, V>, MW0.a {
        public final K X;
        public final V Y;

        public b(K k, V v) {
            this.X = k;
            this.Y = v;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.X;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.Y;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            AJ.e();
            throw new SX0();
        }
    }

    /* renamed from: o.zJ$c */
    /* loaded from: classes3.dex */
    public final class c<E> extends AbstractC8170n2<E> {
        @NotNull
        public final VA0<K, V, E> X;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@NotNull VA0<? super K, ? super V, ? extends E> va0) {
            this.X = va0;
        }

        @Override // o.AbstractC8170n2, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(E e) {
            AJ.e();
            throw new SX0();
        }

        @Override // o.AbstractC8170n2
        public int d() {
            return C11164zJ.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        @NotNull
        public Iterator<E> iterator() {
            return ((a) C11164zJ.k().get(C11164zJ.this)).k(this.X);
        }
    }

    public C11164zJ() {
        this(false, 1, null);
    }

    public static final Map.Entry g(Object obj, Object obj2) {
        return new b(obj, obj2);
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater k() {
        return Z;
    }

    @Override // o.AbstractC7909m2
    @NotNull
    public Set<Map.Entry<K, V>> a() {
        return new c(new VA0() { // from class: o.yJ
            @Override // o.VA0
            public final Object i(Object obj, Object obj2) {
                Map.Entry g;
                g = C11164zJ.g(obj, obj2);
                return g;
            }
        });
    }

    @Override // o.AbstractC7909m2
    @NotNull
    public Set<K> b() {
        return new c(new VA0() { // from class: o.xJ
            @Override // o.VA0
            public final Object i(Object obj, Object obj2) {
                Object i;
                i = C11164zJ.i(obj, obj2);
                return i;
            }
        });
    }

    @Override // o.AbstractC7909m2
    public int c() {
        return Y.get(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (K k : keySet()) {
            remove(k);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public V get(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        return (V) ((a) Z.get(this)).e(obj);
    }

    public final void n(BG0<?> bg0) {
        ((a) Z.get(this)).d(bg0);
    }

    public final void o() {
        Y.decrementAndGet(this);
    }

    @Override // o.AbstractC7909m2, java.util.AbstractMap, java.util.Map
    @Nullable
    public V put(@NotNull K k, @NotNull V v) {
        C7592kj2 c7592kj2;
        V v2 = (V) a.m((a) Z.get(this), k, v, null, 4, null);
        c7592kj2 = AJ.c;
        if (v2 == c7592kj2) {
            v2 = w(k, v);
        }
        if (v2 == null) {
            Y.incrementAndGet(this);
        }
        return v2;
    }

    public final /* synthetic */ Object r() {
        return this.core$volatile;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public V remove(@Nullable Object obj) {
        C7592kj2 c7592kj2;
        if (obj == 0) {
            return null;
        }
        V v = (V) a.m((a) Z.get(this), obj, null, null, 4, null);
        c7592kj2 = AJ.c;
        if (v == c7592kj2) {
            v = w(obj, null);
        }
        if (v != null) {
            Y.decrementAndGet(this);
        }
        return v;
    }

    public final /* synthetic */ int u() {
        return this._size$volatile;
    }

    public final synchronized V w(K k, V v) {
        V v2;
        C7592kj2 c7592kj2;
        a aVar = (a) Z.get(this);
        while (true) {
            K k2 = k;
            V v3 = v;
            v2 = (V) a.m(aVar, k2, v3, null, 4, null);
            c7592kj2 = AJ.c;
            if (v2 == c7592kj2) {
                aVar = aVar.n();
                Z.set(this, aVar);
                k = k2;
                v = v3;
            }
        }
        return v2;
    }

    public final void x() {
        if (this.X == null) {
            throw new IllegalStateException("Must be created with weakRefQueue = true");
        }
        while (true) {
            try {
                Reference<? extends K> remove = this.X.remove();
                C6562gT0.n(remove, "null cannot be cast to non-null type kotlinx.coroutines.debug.internal.HashedWeakRef<*>");
                n((BG0) remove);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    public final /* synthetic */ void y(Object obj) {
        this.core$volatile = obj;
    }

    public final /* synthetic */ void z(int i) {
        this._size$volatile = i;
    }

    public /* synthetic */ C11164zJ(boolean z, int i, C9516sY c9516sY) {
        this((i & 1) != 0 ? false : z);
    }

    public C11164zJ(boolean z) {
        this.core$volatile = new a(16);
        this.X = z ? new ReferenceQueue<>() : null;
    }

    public static final Object i(Object obj, Object obj2) {
        return obj;
    }
}
