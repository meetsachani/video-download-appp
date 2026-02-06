package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import o.InterfaceC8148mw2;

/* loaded from: classes.dex */
public abstract class XX1<K, V> {
    public long[] a;
    public Object[] b;
    public Object[] c;
    public int d;
    public int e;

    /* loaded from: classes.dex */
    public class a implements Map<K, V>, GW0 {

        /* renamed from: o.XX1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0245a implements Set<Map.Entry<? extends K, ? extends V>>, GW0 {
            public final /* synthetic */ XX1<K, V> X;

            @FV(c = "androidx.collection.ScatterMap$MapWrapper$entries$1$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {InterfaceC8148mw2.h.k}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
            /* renamed from: o.XX1$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0246a extends MT1 implements VA0<F02<? super Map.Entry<? extends K, ? extends V>>, HM<? super C7458kA2>, Object> {
                public Object Y0;
                public Object Z;
                public int Z0;
                public int a1;
                public int b1;
                public int c1;
                public long d1;
                public int e1;
                public /* synthetic */ Object f1;
                public final /* synthetic */ XX1<K, V> g1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0246a(XX1<K, V> xx1, HM<? super C0246a> hm) {
                    super(2, hm);
                    this.g1 = xx1;
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x00ab  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0053 -> B:14:0x0065). Please submit an issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006e -> B:20:0x009b). Please submit an issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0098 -> B:21:0x009d). Please submit an issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00ab -> B:26:0x00ac). Please submit an issue!!! */
                @Override // o.AbstractC5644cl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object F(Object obj) {
                    F02 f02;
                    XX1<K, V> xx1;
                    long[] jArr;
                    int length;
                    int i;
                    long j;
                    Object l = C7289jT0.l();
                    int i2 = this.e1;
                    int i3 = 8;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            int i4 = this.c1;
                            int i5 = this.b1;
                            long j2 = this.d1;
                            i = this.a1;
                            int i6 = this.Z0;
                            long[] jArr2 = (long[]) this.Y0;
                            XX1<K, V> xx12 = (XX1) this.Z;
                            F02 f022 = (F02) this.f1;
                            RT1.n(obj);
                            int i7 = i3;
                            j2 >>= i7;
                            i4++;
                            i3 = i7;
                            if (i4 < i5) {
                                int i8 = i3;
                                if (i5 == i8) {
                                    length = i6;
                                    jArr = jArr2;
                                    xx1 = xx12;
                                    f02 = f022;
                                    if (i != length) {
                                        i++;
                                        i3 = i8;
                                        j = jArr[i];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                            xx12 = xx1;
                                            i5 = 8 - ((~(i - length)) >>> 31);
                                            f022 = f02;
                                            i4 = 0;
                                            jArr2 = jArr;
                                            i6 = length;
                                            j2 = j;
                                            if (i4 < i5) {
                                                if ((255 & j2) < 128) {
                                                    int i9 = (i << 3) + i4;
                                                    i7 = i3;
                                                    N71 n71 = new N71(xx12.b[i9], xx12.c[i9]);
                                                    this.f1 = f022;
                                                    this.Z = xx12;
                                                    this.Y0 = jArr2;
                                                    this.Z0 = i6;
                                                    this.a1 = i;
                                                    this.d1 = j2;
                                                    this.b1 = i5;
                                                    this.c1 = i4;
                                                    this.e1 = 1;
                                                    if (f022.b(n71, this) == l) {
                                                        return l;
                                                    }
                                                    j2 >>= i7;
                                                    i4++;
                                                    i3 = i7;
                                                    if (i4 < i5) {
                                                    }
                                                }
                                                int i72 = i3;
                                                j2 >>= i72;
                                                i4++;
                                                i3 = i72;
                                                if (i4 < i5) {
                                                }
                                            }
                                        } else {
                                            i8 = i3;
                                            if (i != length) {
                                            }
                                        }
                                    }
                                }
                                return C7458kA2.a;
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        f02 = (F02) this.f1;
                        xx1 = this.g1;
                        jArr = xx1.a;
                        length = jArr.length - 2;
                        if (length >= 0) {
                            i = 0;
                            j = jArr[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            }
                        }
                        return C7458kA2.a;
                    }
                }

                @Override // o.VA0
                /* renamed from: O */
                public final Object i(F02<? super Map.Entry<? extends K, ? extends V>> f02, HM<? super C7458kA2> hm) {
                    return ((C0246a) t(f02, hm)).F(C7458kA2.a);
                }

                @Override // o.AbstractC5644cl
                public final HM<C7458kA2> t(Object obj, HM<?> hm) {
                    C0246a c0246a = new C0246a(this.g1, hm);
                    c0246a.f1 = obj;
                    return c0246a;
                }
            }

            public C0245a(XX1<K, V> xx1) {
                this.X = xx1;
            }

            @Override // java.util.Set, java.util.Collection
            public /* bridge */ /* synthetic */ boolean add(Object obj) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public boolean addAll(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public void clear() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public final /* bridge */ boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                return e((Map.Entry) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Set, java.util.Collection
            public boolean containsAll(Collection<? extends Object> collection) {
                C6562gT0.p(collection, "elements");
                Collection<? extends Object> collection2 = collection;
                XX1<K, V> xx1 = this.X;
                if (collection2.isEmpty()) {
                    return true;
                }
                Iterator<T> it = collection2.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!C6562gT0.g(xx1.p(entry.getKey()), entry.getValue())) {
                        return false;
                    }
                }
                return true;
            }

            public boolean d(Map.Entry<? extends K, ? extends V> entry) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            public boolean e(Map.Entry<? extends K, ? extends V> entry) {
                C6562gT0.p(entry, "element");
                return C6562gT0.g(this.X.p(entry.getKey()), entry.getValue());
            }

            public int f() {
                return this.X.e;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean isEmpty() {
                return this.X.x();
            }

            @Override // java.util.Set, java.util.Collection, java.lang.Iterable
            public Iterator<Map.Entry<K, V>> iterator() {
                return N02.a(new C0246a(this.X, null));
            }

            @Override // java.util.Set, java.util.Collection
            public boolean remove(Object obj) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public boolean removeAll(Collection<? extends Object> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public boolean retainAll(Collection<? extends Object> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public final /* bridge */ int size() {
                return f();
            }

            @Override // java.util.Set, java.util.Collection
            public Object[] toArray() {
                return C6250fF.a(this);
            }

            @Override // java.util.Set, java.util.Collection
            public <T> T[] toArray(T[] tArr) {
                C6562gT0.p(tArr, "array");
                return (T[]) C6250fF.b(this, tArr);
            }
        }

        /* loaded from: classes.dex */
        public static final class b implements Set<K>, GW0 {
            public final /* synthetic */ XX1<K, V> X;

            @FV(c = "androidx.collection.ScatterMap$MapWrapper$keys$1$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {726}, m = "invokeSuspend", n = {"$this$iterator", "k$iv", "m$iv$iv", "lastIndex$iv$iv", "i$iv$iv", "slot$iv$iv", "bitCount$iv$iv", "j$iv$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
            /* renamed from: o.XX1$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0247a extends MT1 implements VA0<F02<? super K>, HM<? super C7458kA2>, Object> {
                public Object Y0;
                public Object Z;
                public int Z0;
                public int a1;
                public int b1;
                public int c1;
                public long d1;
                public int e1;
                public /* synthetic */ Object f1;
                public final /* synthetic */ XX1<K, V> g1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0247a(XX1<K, V> xx1, HM<? super C0247a> hm) {
                    super(2, hm);
                    this.g1 = xx1;
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0053 -> B:23:0x0098). Please submit an issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0055 -> B:14:0x0066). Please submit an issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006f -> B:20:0x008f). Please submit an issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008c -> B:20:0x008f). Please submit an issue!!! */
                @Override // o.AbstractC5644cl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object F(Object obj) {
                    F02 f02;
                    Object[] objArr;
                    long[] jArr;
                    int length;
                    int i;
                    long j;
                    Object l = C7289jT0.l();
                    int i2 = this.e1;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            int i3 = this.c1;
                            int i4 = this.b1;
                            long j2 = this.d1;
                            i = this.a1;
                            int i5 = this.Z0;
                            long[] jArr2 = (long[]) this.Y0;
                            Object[] objArr2 = (Object[]) this.Z;
                            F02 f022 = (F02) this.f1;
                            RT1.n(obj);
                            j2 >>= 8;
                            i3++;
                            if (i3 < i4) {
                                if (i4 == 8) {
                                    length = i5;
                                    jArr = jArr2;
                                    objArr = objArr2;
                                    f02 = f022;
                                    if (i != length) {
                                        i++;
                                        j = jArr[i];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            f022 = f02;
                                            i3 = 0;
                                            jArr2 = jArr;
                                            i5 = length;
                                            i4 = 8 - ((~(i - length)) >>> 31);
                                            objArr2 = objArr;
                                            j2 = j;
                                            if (i3 < i4) {
                                                if ((255 & j2) < 128) {
                                                    Object obj2 = objArr2[(i << 3) + i3];
                                                    this.f1 = f022;
                                                    this.Z = objArr2;
                                                    this.Y0 = jArr2;
                                                    this.Z0 = i5;
                                                    this.a1 = i;
                                                    this.d1 = j2;
                                                    this.b1 = i4;
                                                    this.c1 = i3;
                                                    this.e1 = 1;
                                                    if (f022.b(obj2, this) == l) {
                                                        return l;
                                                    }
                                                }
                                                j2 >>= 8;
                                                i3++;
                                                if (i3 < i4) {
                                                }
                                            }
                                        }
                                        if (i != length) {
                                        }
                                    }
                                }
                                return C7458kA2.a;
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        f02 = (F02) this.f1;
                        XX1<K, V> xx1 = this.g1;
                        objArr = xx1.b;
                        jArr = xx1.a;
                        length = jArr.length - 2;
                        if (length >= 0) {
                            i = 0;
                            j = jArr[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            }
                            if (i != length) {
                            }
                        }
                        return C7458kA2.a;
                    }
                }

                @Override // o.VA0
                /* renamed from: O */
                public final Object i(F02<? super K> f02, HM<? super C7458kA2> hm) {
                    return ((C0247a) t(f02, hm)).F(C7458kA2.a);
                }

                @Override // o.AbstractC5644cl
                public final HM<C7458kA2> t(Object obj, HM<?> hm) {
                    C0247a c0247a = new C0247a(this.g1, hm);
                    c0247a.f1 = obj;
                    return c0247a;
                }
            }

            public b(XX1<K, V> xx1) {
                this.X = xx1;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean add(K k) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public boolean addAll(Collection<? extends K> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public void clear() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public boolean contains(Object obj) {
                return this.X.g(obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Set, java.util.Collection
            public boolean containsAll(Collection<? extends Object> collection) {
                C6562gT0.p(collection, "elements");
                Collection<? extends Object> collection2 = collection;
                XX1<K, V> xx1 = this.X;
                if (collection2.isEmpty()) {
                    return true;
                }
                for (Object obj : collection2) {
                    if (!xx1.g(obj)) {
                        return false;
                    }
                }
                return true;
            }

            public int d() {
                return this.X.e;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean isEmpty() {
                return this.X.x();
            }

            @Override // java.util.Set, java.util.Collection, java.lang.Iterable
            public Iterator<K> iterator() {
                return N02.a(new C0247a(this.X, null));
            }

            @Override // java.util.Set, java.util.Collection
            public boolean remove(Object obj) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public boolean removeAll(Collection<? extends Object> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public boolean retainAll(Collection<? extends Object> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public final /* bridge */ int size() {
                return d();
            }

            @Override // java.util.Set, java.util.Collection
            public Object[] toArray() {
                return C6250fF.a(this);
            }

            @Override // java.util.Set, java.util.Collection
            public <T> T[] toArray(T[] tArr) {
                C6562gT0.p(tArr, "array");
                return (T[]) C6250fF.b(this, tArr);
            }
        }

        /* loaded from: classes.dex */
        public static final class c implements Collection<V>, GW0 {
            public final /* synthetic */ XX1<K, V> X;

            @FV(c = "androidx.collection.ScatterMap$MapWrapper$values$1$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {744}, m = "invokeSuspend", n = {"$this$iterator", "v$iv", "m$iv$iv", "lastIndex$iv$iv", "i$iv$iv", "slot$iv$iv", "bitCount$iv$iv", "j$iv$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
            /* renamed from: o.XX1$a$c$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0248a extends MT1 implements VA0<F02<? super V>, HM<? super C7458kA2>, Object> {
                public Object Y0;
                public Object Z;
                public int Z0;
                public int a1;
                public int b1;
                public int c1;
                public long d1;
                public int e1;
                public /* synthetic */ Object f1;
                public final /* synthetic */ XX1<K, V> g1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0248a(XX1<K, V> xx1, HM<? super C0248a> hm) {
                    super(2, hm);
                    this.g1 = xx1;
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0053 -> B:23:0x0098). Please submit an issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0055 -> B:14:0x0066). Please submit an issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006f -> B:20:0x008f). Please submit an issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008c -> B:20:0x008f). Please submit an issue!!! */
                @Override // o.AbstractC5644cl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object F(Object obj) {
                    F02 f02;
                    Object[] objArr;
                    long[] jArr;
                    int length;
                    int i;
                    long j;
                    Object l = C7289jT0.l();
                    int i2 = this.e1;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            int i3 = this.c1;
                            int i4 = this.b1;
                            long j2 = this.d1;
                            i = this.a1;
                            int i5 = this.Z0;
                            long[] jArr2 = (long[]) this.Y0;
                            Object[] objArr2 = (Object[]) this.Z;
                            F02 f022 = (F02) this.f1;
                            RT1.n(obj);
                            j2 >>= 8;
                            i3++;
                            if (i3 < i4) {
                                if (i4 == 8) {
                                    length = i5;
                                    jArr = jArr2;
                                    objArr = objArr2;
                                    f02 = f022;
                                    if (i != length) {
                                        i++;
                                        j = jArr[i];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            f022 = f02;
                                            i3 = 0;
                                            jArr2 = jArr;
                                            i5 = length;
                                            i4 = 8 - ((~(i - length)) >>> 31);
                                            objArr2 = objArr;
                                            j2 = j;
                                            if (i3 < i4) {
                                                if ((255 & j2) < 128) {
                                                    Object obj2 = objArr2[(i << 3) + i3];
                                                    this.f1 = f022;
                                                    this.Z = objArr2;
                                                    this.Y0 = jArr2;
                                                    this.Z0 = i5;
                                                    this.a1 = i;
                                                    this.d1 = j2;
                                                    this.b1 = i4;
                                                    this.c1 = i3;
                                                    this.e1 = 1;
                                                    if (f022.b(obj2, this) == l) {
                                                        return l;
                                                    }
                                                }
                                                j2 >>= 8;
                                                i3++;
                                                if (i3 < i4) {
                                                }
                                            }
                                        }
                                        if (i != length) {
                                        }
                                    }
                                }
                                return C7458kA2.a;
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        f02 = (F02) this.f1;
                        XX1<K, V> xx1 = this.g1;
                        objArr = xx1.c;
                        jArr = xx1.a;
                        length = jArr.length - 2;
                        if (length >= 0) {
                            i = 0;
                            j = jArr[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            }
                            if (i != length) {
                            }
                        }
                        return C7458kA2.a;
                    }
                }

                @Override // o.VA0
                /* renamed from: O */
                public final Object i(F02<? super V> f02, HM<? super C7458kA2> hm) {
                    return ((C0248a) t(f02, hm)).F(C7458kA2.a);
                }

                @Override // o.AbstractC5644cl
                public final HM<C7458kA2> t(Object obj, HM<?> hm) {
                    C0248a c0248a = new C0248a(this.g1, hm);
                    c0248a.f1 = obj;
                    return c0248a;
                }
            }

            public c(XX1<K, V> xx1) {
                this.X = xx1;
            }

            @Override // java.util.Collection
            public boolean add(V v) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Collection
            public boolean addAll(Collection<? extends V> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Collection
            public void clear() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Collection
            public boolean contains(Object obj) {
                return this.X.h(obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Collection
            public boolean containsAll(Collection<? extends Object> collection) {
                C6562gT0.p(collection, "elements");
                Collection<? extends Object> collection2 = collection;
                XX1<K, V> xx1 = this.X;
                if (collection2.isEmpty()) {
                    return true;
                }
                for (Object obj : collection2) {
                    if (!xx1.h(obj)) {
                        return false;
                    }
                }
                return true;
            }

            public int d() {
                return this.X.e;
            }

            @Override // java.util.Collection
            public boolean isEmpty() {
                return this.X.x();
            }

            @Override // java.util.Collection, java.lang.Iterable
            public Iterator<V> iterator() {
                return N02.a(new C0248a(this.X, null));
            }

            @Override // java.util.Collection
            public boolean remove(Object obj) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Collection
            public boolean removeAll(Collection<? extends Object> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Collection
            public boolean removeIf(Predicate<? super V> predicate) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Collection
            public boolean retainAll(Collection<? extends Object> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Collection
            public final /* bridge */ int size() {
                return d();
            }

            @Override // java.util.Collection
            public Object[] toArray() {
                return C6250fF.a(this);
            }

            @Override // java.util.Collection
            public <T> T[] toArray(T[] tArr) {
                C6562gT0.p(tArr, "array");
                return (T[]) C6250fF.b(this, tArr);
            }
        }

        public a() {
        }

        public Set<Map.Entry<K, V>> a() {
            return new C0245a(XX1.this);
        }

        public Set<K> b() {
            return new b(XX1.this);
        }

        public int c() {
            return XX1.this.e;
        }

        @Override // java.util.Map
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V compute(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V computeIfAbsent(K k, Function<? super K, ? extends V> function) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V computeIfPresent(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public boolean containsKey(Object obj) {
            return XX1.this.g(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return XX1.this.h(obj);
        }

        public Collection<V> d() {
            return new c(XX1.this);
        }

        @Override // java.util.Map
        public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
            return a();
        }

        @Override // java.util.Map
        public V get(Object obj) {
            return XX1.this.p(obj);
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            return XX1.this.x();
        }

        @Override // java.util.Map
        public final /* bridge */ Set<K> keySet() {
            return b();
        }

        @Override // java.util.Map
        public V merge(K k, V v, BiFunction<? super V, ? super V, ? extends V> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V put(K k, V v) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V putIfAbsent(K k, V v) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V replace(K k, V v) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public final /* bridge */ int size() {
            return c();
        }

        @Override // java.util.Map
        public final /* bridge */ Collection<V> values() {
            return d();
        }

        @Override // java.util.Map
        public boolean remove(Object obj, Object obj2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public boolean replace(K k, V v, V v2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ XX1(C9516sY c9516sY) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String G(XX1 xx1, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, VA0 va0, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                charSequence = C6566gU0.h;
            }
            if ((i2 & 2) != 0) {
                charSequence2 = "";
            }
            if ((i2 & 4) != 0) {
                charSequence3 = "";
            }
            if ((i2 & 8) != 0) {
                i = -1;
            }
            if ((i2 & 16) != 0) {
                charSequence4 = "...";
            }
            VA0<? super K, ? super V, ? extends CharSequence> va02 = va0;
            if ((i2 & 32) != 0) {
                va02 = null;
            }
            CharSequence charSequence5 = charSequence4;
            VA0<? super K, ? super V, ? extends CharSequence> va03 = va02;
            return xx1.F(charSequence, charSequence2, charSequence3, i, charSequence5, va03);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String A(CharSequence charSequence) {
        C6562gT0.p(charSequence, "separator");
        return G(this, charSequence, null, null, 0, null, null, 62, null);
    }

    public final String B(CharSequence charSequence, CharSequence charSequence2) {
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        return G(this, charSequence, charSequence2, null, 0, null, null, 60, null);
    }

    public final String C(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        return G(this, charSequence, charSequence2, charSequence3, 0, null, null, 56, null);
    }

    public final String D(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i) {
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        return G(this, charSequence, charSequence2, charSequence3, i, null, null, 48, null);
    }

    public final String E(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4) {
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(charSequence4, "truncated");
        return G(this, charSequence, charSequence2, charSequence3, i, charSequence4, null, 32, null);
    }

    public final String F(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, VA0<? super K, ? super V, ? extends CharSequence> va0) {
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        Object[] objArr5 = this.b;
        Object[] objArr6 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j = jArr[i2];
                int i4 = i2;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j & 255) < 128) {
                            int i7 = (i4 << 3) + i6;
                            Object obj = objArr5[i7];
                            objArr3 = objArr5;
                            Object obj2 = objArr6[i7];
                            objArr4 = objArr6;
                            if (i3 == i) {
                                sb.append(charSequence4);
                                break loop0;
                            }
                            if (i3 != 0) {
                                sb.append(charSequence);
                            }
                            if (va0 == null) {
                                sb.append(obj);
                                sb.append('=');
                                sb.append(obj2);
                            } else {
                                sb.append(va0.i(obj, obj2));
                            }
                            i3++;
                        } else {
                            objArr3 = objArr5;
                            objArr4 = objArr6;
                        }
                        j >>= 8;
                        i6++;
                        objArr6 = objArr4;
                        objArr5 = objArr3;
                    }
                    objArr = objArr5;
                    objArr2 = objArr6;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    objArr = objArr5;
                    objArr2 = objArr6;
                }
                if (i4 == length) {
                    break;
                }
                i2 = i4 + 1;
                objArr6 = objArr2;
                objArr5 = objArr;
            }
        }
        sb.append(charSequence3);
        String sb2 = sb.toString();
        C6562gT0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final boolean H() {
        if (this.e == 0) {
            return true;
        }
        return false;
    }

    public final boolean a(VA0<? super K, ? super V, Boolean> va0) {
        C6562gT0.p(va0, "predicate");
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            if (!va0.i(objArr[i4], objArr2[i4]).booleanValue()) {
                                return false;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return true;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }

    public final boolean b() {
        if (this.e != 0) {
            return true;
        }
        return false;
    }

    public final boolean c(VA0<? super K, ? super V, Boolean> va0) {
        C6562gT0.p(va0, "predicate");
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            if (va0.i(objArr[i4], objArr2[i4]).booleanValue()) {
                                return true;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        sb.append("metadata=[");
        int q = q();
        for (int i = 0; i < q; i++) {
            long j = (this.a[i >> 3] >> ((i & 7) << 3)) & 255;
            if (j == 128) {
                sb.append("Empty");
            } else if (j == 254) {
                sb.append("Deleted");
            } else {
                sb.append(j);
            }
            sb.append(C6566gU0.h);
        }
        sb.append("], ");
        sb.append("keys=[");
        int length = this.b.length;
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(this.b[i2]);
            sb.append(C6566gU0.h);
        }
        sb.append("], ");
        sb.append("values=[");
        int length2 = this.c.length;
        for (int i3 = 0; i3 < length2; i3++) {
            sb.append(this.c[i3]);
            sb.append(C6566gU0.h);
        }
        sb.append(C6566gU0.g);
        sb.append('}');
        String sb2 = sb.toString();
        C6562gT0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final Map<K, V> e() {
        return new a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof XX1)) {
            return false;
        }
        XX1 xx1 = (XX1) obj;
        if (xx1.v() != v()) {
            return false;
        }
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = objArr[i4];
                            Object obj3 = objArr2[i4];
                            if (obj3 == null) {
                                if (xx1.p(obj2) != null || !xx1.g(obj2)) {
                                    break loop0;
                                }
                            } else if (!C6562gT0.g(obj3, xx1.p(obj2))) {
                                return false;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(K k) {
        int i;
        int i2;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * (-862048943);
        int i4 = i3 ^ (i3 << 16);
        int i5 = i4 & 127;
        int i6 = this.d;
        int i7 = (i4 >>> 7) & i6;
        int i8 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j2 = (i5 * YX1.k) ^ j;
            long j3 = (~j2) & (j2 - YX1.k) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i7) & i6;
                if (C6562gT0.g(this.b[i2], k)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
        }
        if (i2 < 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(K k) {
        int i;
        int i2;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * (-862048943);
        int i4 = i3 ^ (i3 << 16);
        int i5 = i4 & 127;
        int i6 = this.d;
        int i7 = (i4 >>> 7) & i6;
        int i8 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j2 = (i5 * YX1.k) ^ j;
            long j3 = (~j2) & (j2 - YX1.k) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i7) & i6;
                if (C6562gT0.g(this.b[i2], k)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
        }
        if (i2 < 0) {
            return false;
        }
        return true;
    }

    public final boolean h(V v) {
        Object[] objArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && C6562gT0.g(v, objArr[(i << 3) + i3])) {
                            return true;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                for (int i6 = 0; i6 < i5; i6++) {
                    if ((255 & j) < 128) {
                        int i7 = (i3 << 3) + i6;
                        Object obj = objArr[i7];
                        Object obj2 = objArr2[i7];
                        if (obj != null) {
                            i = obj.hashCode();
                        } else {
                            i = 0;
                        }
                        if (obj2 != null) {
                            i2 = obj2.hashCode();
                        } else {
                            i2 = 0;
                        }
                        i4 += i2 ^ i;
                    }
                    j >>= 8;
                }
                if (i5 != 8) {
                    return i4;
                }
            }
            if (i3 != length) {
                i3++;
            } else {
                return i4;
            }
        }
    }

    public final int i() {
        return v();
    }

    public final int j(VA0<? super K, ? super V, Boolean> va0) {
        C6562gT0.p(va0, "predicate");
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = (i << 3) + i4;
                        if (va0.i(objArr[i5], objArr2[i5]).booleanValue()) {
                            i2++;
                        }
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return i2;
                }
            }
            if (i != length) {
                i++;
            } else {
                return i2;
            }
        }
    }

    public final int k(K k) {
        int i;
        int i2 = 0;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * (-862048943);
        int i4 = i3 ^ (i3 << 16);
        int i5 = i4 & 127;
        int i6 = this.d;
        int i7 = i4 >>> 7;
        while (true) {
            int i8 = i7 & i6;
            long[] jArr = this.a;
            int i9 = i8 >> 3;
            int i10 = (i8 & 7) << 3;
            long j = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j2 = (i5 * YX1.k) ^ j;
            for (long j3 = (~j2) & (j2 - YX1.k) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i8) & i6;
                if (C6562gT0.g(this.b[numberOfTrailingZeros], k)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i2 += 8;
            i7 = i8 + i2;
        }
    }

    public final void l(VA0<? super K, ? super V, C7458kA2> va0) {
        C6562gT0.p(va0, "block");
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            va0.i(objArr[i4], objArr2[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void m(HA0<? super Integer, C7458kA2> ha0) {
        C6562gT0.p(ha0, "block");
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            ha0.invoke(Integer.valueOf((i << 3) + i3));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void n(HA0<? super K, C7458kA2> ha0) {
        C6562gT0.p(ha0, "block");
        Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            ha0.invoke(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void o(HA0<? super V, C7458kA2> ha0) {
        C6562gT0.p(ha0, "block");
        Object[] objArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            ha0.invoke(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V p(K k) {
        int i;
        int i2;
        int i3 = 0;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * (-862048943);
        int i5 = i4 ^ (i4 << 16);
        int i6 = i5 & 127;
        int i7 = this.d;
        int i8 = i5 >>> 7;
        loop0: while (true) {
            int i9 = i8 & i7;
            long[] jArr = this.a;
            int i10 = i9 >> 3;
            int i11 = (i9 & 7) << 3;
            long j = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j2 = (i6 * YX1.k) ^ j;
            long j3 = (~j2) & (j2 - YX1.k) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i9) & i7;
                if (C6562gT0.g(this.b[i2], k)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i3 += 8;
            i8 = i9 + i3;
        }
        if (i2 >= 0) {
            return (V) this.c[i2];
        }
        return null;
    }

    public final int q() {
        return this.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V t(K k, V v) {
        int i;
        int i2;
        int i3 = 0;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * (-862048943);
        int i5 = i4 ^ (i4 << 16);
        int i6 = i5 & 127;
        int i7 = this.d;
        int i8 = i5 >>> 7;
        loop0: while (true) {
            int i9 = i8 & i7;
            long[] jArr = this.a;
            int i10 = i9 >> 3;
            int i11 = (i9 & 7) << 3;
            long j = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j2 = (i6 * YX1.k) ^ j;
            long j3 = (~j2) & (j2 - YX1.k) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i9) & i7;
                if (C6562gT0.g(this.b[i2], k)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i3 += 8;
            i8 = i9 + i3;
        }
        if (i2 >= 0) {
            return (V) this.c[i2];
        }
        return v;
    }

    public String toString() {
        if (x()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            Object obj = objArr[i5];
                            Object obj2 = objArr2[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb.append(obj2);
                            i2++;
                            if (i2 < this.e) {
                                sb.append(',');
                                sb.append(' ');
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        C6562gT0.o(sb2, "s.append('}').toString()");
        return sb2;
    }

    public final V u(K k, FA0<? extends V> fa0) {
        C6562gT0.p(fa0, "defaultValue");
        V p = p(k);
        if (p == null) {
            return fa0.invoke();
        }
        return p;
    }

    public final int v() {
        return this.e;
    }

    public final boolean x() {
        if (this.e == 0) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        if (this.e != 0) {
            return true;
        }
        return false;
    }

    public final String z() {
        return G(this, null, null, null, 0, null, null, 63, null);
    }

    public XX1() {
        this.a = YX1.e;
        Object[] objArr = BL.c;
        this.b = objArr;
        this.c = objArr;
    }

    public static /* synthetic */ void r() {
    }

    public static /* synthetic */ void s() {
    }

    public static /* synthetic */ void w() {
    }
}
