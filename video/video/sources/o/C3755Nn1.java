package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: o.Nn1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3755Nn1<K, V> extends XX1<K, V> {
    public int f;

    /* renamed from: o.Nn1$a */
    /* loaded from: classes.dex */
    public final class a extends XX1<K, V>.a implements Map<K, V>, MW0 {

        /* renamed from: o.Nn1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0208a implements Set<Map.Entry<K, V>>, RW0 {
            public final /* synthetic */ C3755Nn1<K, V> X;

            /* renamed from: o.Nn1$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0209a implements Iterator<Map.Entry<K, V>>, JW0 {
                public Iterator<? extends Map.Entry<K, V>> X;
                public int Y = -1;
                public final /* synthetic */ C3755Nn1<K, V> Z;

                @FV(c = "androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1328}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$3", "I$0", "I$1", "J$0", "I$2", "I$3"})
                /* renamed from: o.Nn1$a$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0210a extends MT1 implements VA0<F02<? super Map.Entry<K, V>>, HM<? super C7458kA2>, Object> {
                    public Object Y0;
                    public Object Z;
                    public Object Z0;
                    public int a1;
                    public int b1;
                    public int c1;
                    public int d1;
                    public long e1;
                    public int f1;
                    public /* synthetic */ Object g1;
                    public final /* synthetic */ C3755Nn1<K, V> h1;
                    public final /* synthetic */ C0209a i1;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0210a(C3755Nn1<K, V> c3755Nn1, C0209a c0209a, HM<? super C0210a> hm) {
                        super(2, hm);
                        this.h1 = c3755Nn1;
                        this.i1 = c0209a;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
                    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
                    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
                    /* JADX WARN: Removed duplicated region for block: B:25:0x00be  */
                    /* JADX WARN: Removed duplicated region for block: B:27:0x00c1  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0059 -> B:14:0x006d). Please submit an issue!!! */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0076 -> B:20:0x00a9). Please submit an issue!!! */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00a6 -> B:21:0x00ac). Please submit an issue!!! */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00be -> B:26:0x00bf). Please submit an issue!!! */
                    @Override // o.AbstractC5644cl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object F(Object obj) {
                        F02 f02;
                        C3755Nn1<K, V> c3755Nn1;
                        C0209a c0209a;
                        long[] jArr;
                        int length;
                        int i;
                        long j;
                        Object l = C7289jT0.l();
                        int i2 = this.f1;
                        int i3 = 8;
                        int i4 = 1;
                        if (i2 != 0) {
                            if (i2 == 1) {
                                int i5 = this.d1;
                                int i6 = this.c1;
                                long j2 = this.e1;
                                int i7 = this.b1;
                                int i8 = this.a1;
                                long[] jArr2 = (long[]) this.Z0;
                                C3755Nn1<K, V> c3755Nn12 = (C3755Nn1) this.Y0;
                                C0209a c0209a2 = (C0209a) this.Z;
                                F02 f022 = (F02) this.g1;
                                RT1.n(obj);
                                int i9 = i3;
                                int i10 = i4;
                                j2 >>= i9;
                                i5 += i10;
                                i4 = i10;
                                i3 = i9;
                                if (i5 < i6) {
                                    int i11 = i4;
                                    if (i6 == i3) {
                                        int i12 = i8;
                                        i = i7;
                                        length = i12;
                                        jArr = jArr2;
                                        c3755Nn1 = c3755Nn12;
                                        c0209a = c0209a2;
                                        f02 = f022;
                                        if (i != length) {
                                            i++;
                                            i4 = i11;
                                            j = jArr[i];
                                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                                int i13 = i;
                                                i8 = length;
                                                i7 = i13;
                                                f022 = f02;
                                                i5 = 0;
                                                c3755Nn12 = c3755Nn1;
                                                jArr2 = jArr;
                                                i6 = 8 - ((~(i - length)) >>> 31);
                                                c0209a2 = c0209a;
                                                j2 = j;
                                                if (i5 < i6) {
                                                    if ((255 & j2) < 128) {
                                                        c0209a2.e((i7 << 3) + i5);
                                                        i9 = i3;
                                                        C9576sn1 c9576sn1 = new C9576sn1(c3755Nn12.b, c3755Nn12.c, c0209a2.b());
                                                        this.g1 = f022;
                                                        this.Z = c0209a2;
                                                        this.Y0 = c3755Nn12;
                                                        this.Z0 = jArr2;
                                                        this.a1 = i8;
                                                        this.b1 = i7;
                                                        this.e1 = j2;
                                                        this.c1 = i6;
                                                        this.d1 = i5;
                                                        i10 = 1;
                                                        this.f1 = 1;
                                                        if (f022.b(c9576sn1, this) == l) {
                                                            return l;
                                                        }
                                                        j2 >>= i9;
                                                        i5 += i10;
                                                        i4 = i10;
                                                        i3 = i9;
                                                        if (i5 < i6) {
                                                        }
                                                    }
                                                    int i92 = i3;
                                                    int i102 = i4;
                                                    j2 >>= i92;
                                                    i5 += i102;
                                                    i4 = i102;
                                                    i3 = i92;
                                                    if (i5 < i6) {
                                                    }
                                                }
                                            } else {
                                                i11 = i4;
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
                            f02 = (F02) this.g1;
                            c3755Nn1 = this.h1;
                            c0209a = this.i1;
                            jArr = c3755Nn1.a;
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
                    public final Object i(F02<? super Map.Entry<K, V>> f02, HM<? super C7458kA2> hm) {
                        return ((C0210a) t(f02, hm)).F(C7458kA2.a);
                    }

                    @Override // o.AbstractC5644cl
                    public final HM<C7458kA2> t(Object obj, HM<?> hm) {
                        C0210a c0210a = new C0210a(this.h1, this.i1, hm);
                        c0210a.g1 = obj;
                        return c0210a;
                    }
                }

                public C0209a(C3755Nn1<K, V> c3755Nn1) {
                    this.Z = c3755Nn1;
                    this.X = N02.a(new C0210a(c3755Nn1, this, null));
                }

                public final int b() {
                    return this.Y;
                }

                public final Iterator<Map.Entry<K, V>> c() {
                    return (Iterator<? extends Map.Entry<K, V>>) this.X;
                }

                @Override // java.util.Iterator
                /* renamed from: d */
                public Map.Entry<K, V> next() {
                    return this.X.next();
                }

                public final void e(int i) {
                    this.Y = i;
                }

                public final void f(Iterator<? extends Map.Entry<K, V>> it) {
                    C6562gT0.p(it, "<set-?>");
                    this.X = it;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.X.hasNext();
                }

                @Override // java.util.Iterator
                public void remove() {
                    int i = this.Y;
                    if (i != -1) {
                        this.Z.o0(i);
                        this.Y = -1;
                    }
                }
            }

            public C0208a(C3755Nn1<K, V> c3755Nn1) {
                this.X = c3755Nn1;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
                C6562gT0.p(collection, "elements");
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Set, java.util.Collection
            public void clear() {
                this.X.K();
            }

            @Override // java.util.Set, java.util.Collection
            public final /* bridge */ boolean contains(Object obj) {
                if (!C11313zv2.I(obj)) {
                    return false;
                }
                return e((Map.Entry) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Set, java.util.Collection
            public boolean containsAll(Collection<? extends Object> collection) {
                C6562gT0.p(collection, "elements");
                Collection<? extends Object> collection2 = collection;
                C3755Nn1<K, V> c3755Nn1 = this.X;
                if (collection2.isEmpty()) {
                    return true;
                }
                Iterator<T> it = collection2.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!C6562gT0.g(c3755Nn1.p(entry.getKey()), entry.getValue())) {
                        return false;
                    }
                }
                return true;
            }

            @Override // java.util.Set, java.util.Collection
            /* renamed from: d */
            public boolean add(Map.Entry<K, V> entry) {
                C6562gT0.p(entry, "element");
                throw new UnsupportedOperationException();
            }

            public boolean e(Map.Entry<K, V> entry) {
                C6562gT0.p(entry, "element");
                return C6562gT0.g(this.X.p(entry.getKey()), entry.getValue());
            }

            public int f() {
                return this.X.e;
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0083, code lost:
                if (((r4 & ((~r4) << 6)) & r11) == 0) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0085, code lost:
                r13 = -1;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean h(Map.Entry<K, V> entry) {
                int i;
                int i2;
                C6562gT0.p(entry, "element");
                C3755Nn1<K, V> c3755Nn1 = this.X;
                K key = entry.getKey();
                if (key != null) {
                    i = key.hashCode();
                } else {
                    i = 0;
                }
                int i3 = i * (-862048943);
                int i4 = i3 ^ (i3 << 16);
                int i5 = i4 & 127;
                int i6 = c3755Nn1.d;
                int i7 = (i4 >>> 7) & i6;
                int i8 = 0;
                loop0: while (true) {
                    long[] jArr = c3755Nn1.a;
                    int i9 = i7 >> 3;
                    int i10 = (i7 & 7) << 3;
                    int i11 = i7;
                    long j = (((-i10) >> 63) & (jArr[i9 + 1] << (64 - i10))) | (jArr[i9] >>> i10);
                    long j2 = (i5 * YX1.k) ^ j;
                    long j3 = (~j2) & (j2 - YX1.k);
                    long j4 = -9187201950435737472L;
                    long j5 = j3 & (-9187201950435737472L);
                    while (true) {
                        if (j5 == 0) {
                            break;
                        }
                        i2 = (i11 + (Long.numberOfTrailingZeros(j5) >> 3)) & i6;
                        long j6 = j4;
                        if (C6562gT0.g(c3755Nn1.b[i2], key)) {
                            break loop0;
                        }
                        j5 &= j5 - 1;
                        j4 = j6;
                    }
                    i8 += 8;
                    i7 = (i11 + i8) & i6;
                }
                if (i2 < 0 || !C6562gT0.g(this.X.c[i2], entry.getValue())) {
                    return false;
                }
                this.X.o0(i2);
                return true;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean isEmpty() {
                return this.X.x();
            }

            @Override // java.util.Set, java.util.Collection, java.lang.Iterable
            public Iterator<Map.Entry<K, V>> iterator() {
                return new C0209a(this.X);
            }

            @Override // java.util.Set, java.util.Collection
            public final /* bridge */ boolean remove(Object obj) {
                if (!C11313zv2.I(obj)) {
                    return false;
                }
                return h((Map.Entry) obj);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean removeAll(Collection<? extends Object> collection) {
                int i;
                C6562gT0.p(collection, "elements");
                C3755Nn1<K, V> c3755Nn1 = this.X;
                long[] jArr = c3755Nn1.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    boolean z = false;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8;
                            int i4 = 8 - ((~(i2 - length)) >>> 31);
                            int i5 = 0;
                            while (i5 < i4) {
                                if ((255 & j) < 128) {
                                    int i6 = (i2 << 3) + i5;
                                    Iterator<? extends Object> it = collection.iterator();
                                    while (it.hasNext()) {
                                        Map.Entry entry = (Map.Entry) it.next();
                                        i = i3;
                                        if (C6562gT0.g(entry.getKey(), c3755Nn1.b[i6]) && C6562gT0.g(entry.getValue(), c3755Nn1.c[i6])) {
                                            c3755Nn1.o0(i6);
                                            z = true;
                                            break;
                                        }
                                        i3 = i;
                                    }
                                }
                                i = i3;
                                j >>= i;
                                i5++;
                                i3 = i;
                            }
                            if (i4 != i3) {
                                return z;
                            }
                        }
                        if (i2 != length) {
                            i2++;
                        } else {
                            return z;
                        }
                    }
                } else {
                    return false;
                }
            }

            @Override // java.util.Set, java.util.Collection
            public boolean retainAll(Collection<? extends Object> collection) {
                int i;
                C6562gT0.p(collection, "elements");
                C3755Nn1<K, V> c3755Nn1 = this.X;
                long[] jArr = c3755Nn1.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    boolean z = false;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8;
                            int i4 = 8 - ((~(i2 - length)) >>> 31);
                            int i5 = 0;
                            while (i5 < i4) {
                                if ((255 & j) < 128) {
                                    int i6 = (i2 << 3) + i5;
                                    Iterator<? extends Object> it = collection.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            Map.Entry entry = (Map.Entry) it.next();
                                            i = i3;
                                            if (!C6562gT0.g(entry.getKey(), c3755Nn1.b[i6]) || !C6562gT0.g(entry.getValue(), c3755Nn1.c[i6])) {
                                                i3 = i;
                                            }
                                        } else {
                                            i = i3;
                                            c3755Nn1.o0(i6);
                                            z = true;
                                            break;
                                        }
                                    }
                                } else {
                                    i = i3;
                                }
                                j >>= i;
                                i5++;
                                i3 = i;
                            }
                            if (i4 != i3) {
                                return z;
                            }
                        }
                        if (i2 != length) {
                            i2++;
                        } else {
                            return z;
                        }
                    }
                } else {
                    return false;
                }
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

        /* renamed from: o.Nn1$a$b */
        /* loaded from: classes.dex */
        public static final class b implements Set<K>, RW0 {
            public final /* synthetic */ C3755Nn1<K, V> X;

            /* renamed from: o.Nn1$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0211a implements Iterator<K>, JW0 {
                public final Iterator<Integer> X;
                public int Y = -1;
                public final /* synthetic */ C3755Nn1<K, V> Z;

                @FV(c = "androidx.collection.MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1431}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$1", "I$0", "I$1", "J$0", "I$2", "I$3"})
                /* renamed from: o.Nn1$a$b$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0212a extends MT1 implements VA0<F02<? super Integer>, HM<? super C7458kA2>, Object> {
                    public int Y0;
                    public Object Z;
                    public int Z0;
                    public int a1;
                    public int b1;
                    public long c1;
                    public int d1;
                    public /* synthetic */ Object e1;
                    public final /* synthetic */ C3755Nn1<K, V> f1;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0212a(C3755Nn1<K, V> c3755Nn1, HM<? super C0212a> hm) {
                        super(2, hm);
                        this.f1 = c3755Nn1;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
                    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
                    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
                    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004d -> B:23:0x0093). Please submit an issue!!! */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004f -> B:14:0x0061). Please submit an issue!!! */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006a -> B:20:0x008a). Please submit an issue!!! */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0087 -> B:20:0x008a). Please submit an issue!!! */
                    @Override // o.AbstractC5644cl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object F(Object obj) {
                        F02 f02;
                        long[] jArr;
                        int length;
                        int i;
                        long j;
                        Object l = C7289jT0.l();
                        int i2 = this.d1;
                        if (i2 != 0) {
                            if (i2 == 1) {
                                int i3 = this.b1;
                                int i4 = this.a1;
                                long j2 = this.c1;
                                int i5 = this.Z0;
                                int i6 = this.Y0;
                                long[] jArr2 = (long[]) this.Z;
                                F02 f022 = (F02) this.e1;
                                RT1.n(obj);
                                j2 >>= 8;
                                i3++;
                                if (i3 < i4) {
                                    if (i4 == 8) {
                                        i = i5;
                                        length = i6;
                                        jArr = jArr2;
                                        f02 = f022;
                                        if (i != length) {
                                            i++;
                                            j = jArr[i];
                                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                jArr2 = jArr;
                                                i4 = 8 - ((~(i - length)) >>> 31);
                                                f022 = f02;
                                                i3 = 0;
                                                i6 = length;
                                                i5 = i;
                                                j2 = j;
                                                if (i3 < i4) {
                                                    if ((255 & j2) < 128) {
                                                        Integer f = C10557wp.f((i5 << 3) + i3);
                                                        this.e1 = f022;
                                                        this.Z = jArr2;
                                                        this.Y0 = i6;
                                                        this.Z0 = i5;
                                                        this.c1 = j2;
                                                        this.a1 = i4;
                                                        this.b1 = i3;
                                                        this.d1 = 1;
                                                        if (f022.b(f, this) == l) {
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
                            f02 = (F02) this.e1;
                            jArr = this.f1.a;
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
                    public final Object i(F02<? super Integer> f02, HM<? super C7458kA2> hm) {
                        return ((C0212a) t(f02, hm)).F(C7458kA2.a);
                    }

                    @Override // o.AbstractC5644cl
                    public final HM<C7458kA2> t(Object obj, HM<?> hm) {
                        C0212a c0212a = new C0212a(this.f1, hm);
                        c0212a.e1 = obj;
                        return c0212a;
                    }
                }

                public C0211a(C3755Nn1<K, V> c3755Nn1) {
                    this.Z = c3755Nn1;
                    this.X = N02.a(new C0212a(c3755Nn1, null));
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.X.hasNext();
                }

                @Override // java.util.Iterator
                public K next() {
                    int intValue = this.X.next().intValue();
                    this.Y = intValue;
                    return (K) this.Z.b[intValue];
                }

                @Override // java.util.Iterator
                public void remove() {
                    int i = this.Y;
                    if (i >= 0) {
                        this.Z.o0(i);
                        this.Y = -1;
                    }
                }
            }

            public b(C3755Nn1<K, V> c3755Nn1) {
                this.X = c3755Nn1;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean add(K k) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Set, java.util.Collection
            public boolean addAll(Collection<? extends K> collection) {
                C6562gT0.p(collection, "elements");
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Set, java.util.Collection
            public void clear() {
                this.X.K();
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
                C3755Nn1<K, V> c3755Nn1 = this.X;
                if (collection2.isEmpty()) {
                    return true;
                }
                for (Object obj : collection2) {
                    if (!c3755Nn1.g(obj)) {
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
                return new C0211a(this.X);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x006b, code lost:
                r18 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0074, code lost:
                if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
                r12 = -1;
             */
            @Override // java.util.Set, java.util.Collection
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean remove(Object obj) {
                int i;
                boolean z;
                int i2;
                C3755Nn1<K, V> c3755Nn1 = this.X;
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                int i3 = i * (-862048943);
                int i4 = i3 ^ (i3 << 16);
                int i5 = i4 & 127;
                int i6 = c3755Nn1.d;
                int i7 = (i4 >>> 7) & i6;
                int i8 = 0;
                loop0: while (true) {
                    long[] jArr = c3755Nn1.a;
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
                        z = false;
                        if (C6562gT0.g(c3755Nn1.b[i2], obj)) {
                            break loop0;
                        }
                        j3 &= j3 - 1;
                    }
                    i8 += 8;
                    i7 = (i7 + i8) & i6;
                }
                if (i2 >= 0) {
                    this.X.o0(i2);
                    return true;
                }
                return z;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean removeAll(Collection<? extends Object> collection) {
                C6562gT0.p(collection, "elements");
                C3755Nn1<K, V> c3755Nn1 = this.X;
                long[] jArr = c3755Nn1.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return false;
                }
                int i = 0;
                boolean z = false;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                if (C10662xF.Y1(collection, c3755Nn1.b[i4])) {
                                    c3755Nn1.o0(i4);
                                    z = true;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            return z;
                        }
                    }
                    if (i != length) {
                        i++;
                    } else {
                        return z;
                    }
                }
            }

            @Override // java.util.Set, java.util.Collection
            public boolean retainAll(Collection<? extends Object> collection) {
                C6562gT0.p(collection, "elements");
                C3755Nn1<K, V> c3755Nn1 = this.X;
                long[] jArr = c3755Nn1.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return false;
                }
                int i = 0;
                boolean z = false;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                if (!C10662xF.Y1(collection, c3755Nn1.b[i4])) {
                                    c3755Nn1.o0(i4);
                                    z = true;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            return z;
                        }
                    }
                    if (i != length) {
                        i++;
                    } else {
                        return z;
                    }
                }
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

        /* renamed from: o.Nn1$a$c */
        /* loaded from: classes.dex */
        public static final class c implements Collection<V>, HW0 {
            public final /* synthetic */ C3755Nn1<K, V> X;

            /* renamed from: o.Nn1$a$c$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0213a implements Iterator<V>, JW0 {
                public final Iterator<Integer> X;
                public int Y = -1;
                public final /* synthetic */ C3755Nn1<K, V> Z;

                @FV(c = "androidx.collection.MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1511}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$1", "I$0", "I$1", "J$0", "I$2", "I$3"})
                /* renamed from: o.Nn1$a$c$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0214a extends MT1 implements VA0<F02<? super Integer>, HM<? super C7458kA2>, Object> {
                    public int Y0;
                    public Object Z;
                    public int Z0;
                    public int a1;
                    public int b1;
                    public long c1;
                    public int d1;
                    public /* synthetic */ Object e1;
                    public final /* synthetic */ C3755Nn1<K, V> f1;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0214a(C3755Nn1<K, V> c3755Nn1, HM<? super C0214a> hm) {
                        super(2, hm);
                        this.f1 = c3755Nn1;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
                    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
                    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
                    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004d -> B:23:0x0093). Please submit an issue!!! */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004f -> B:14:0x0061). Please submit an issue!!! */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006a -> B:20:0x008a). Please submit an issue!!! */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0087 -> B:20:0x008a). Please submit an issue!!! */
                    @Override // o.AbstractC5644cl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object F(Object obj) {
                        F02 f02;
                        long[] jArr;
                        int length;
                        int i;
                        long j;
                        Object l = C7289jT0.l();
                        int i2 = this.d1;
                        if (i2 != 0) {
                            if (i2 == 1) {
                                int i3 = this.b1;
                                int i4 = this.a1;
                                long j2 = this.c1;
                                int i5 = this.Z0;
                                int i6 = this.Y0;
                                long[] jArr2 = (long[]) this.Z;
                                F02 f022 = (F02) this.e1;
                                RT1.n(obj);
                                j2 >>= 8;
                                i3++;
                                if (i3 < i4) {
                                    if (i4 == 8) {
                                        i = i5;
                                        length = i6;
                                        jArr = jArr2;
                                        f02 = f022;
                                        if (i != length) {
                                            i++;
                                            j = jArr[i];
                                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                jArr2 = jArr;
                                                i4 = 8 - ((~(i - length)) >>> 31);
                                                f022 = f02;
                                                i3 = 0;
                                                i6 = length;
                                                i5 = i;
                                                j2 = j;
                                                if (i3 < i4) {
                                                    if ((255 & j2) < 128) {
                                                        Integer f = C10557wp.f((i5 << 3) + i3);
                                                        this.e1 = f022;
                                                        this.Z = jArr2;
                                                        this.Y0 = i6;
                                                        this.Z0 = i5;
                                                        this.c1 = j2;
                                                        this.a1 = i4;
                                                        this.b1 = i3;
                                                        this.d1 = 1;
                                                        if (f022.b(f, this) == l) {
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
                            f02 = (F02) this.e1;
                            jArr = this.f1.a;
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
                    public final Object i(F02<? super Integer> f02, HM<? super C7458kA2> hm) {
                        return ((C0214a) t(f02, hm)).F(C7458kA2.a);
                    }

                    @Override // o.AbstractC5644cl
                    public final HM<C7458kA2> t(Object obj, HM<?> hm) {
                        C0214a c0214a = new C0214a(this.f1, hm);
                        c0214a.e1 = obj;
                        return c0214a;
                    }
                }

                public C0213a(C3755Nn1<K, V> c3755Nn1) {
                    this.Z = c3755Nn1;
                    this.X = N02.a(new C0214a(c3755Nn1, null));
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.X.hasNext();
                }

                @Override // java.util.Iterator
                public V next() {
                    int intValue = this.X.next().intValue();
                    this.Y = intValue;
                    return (V) this.Z.c[intValue];
                }

                @Override // java.util.Iterator
                public void remove() {
                    int i = this.Y;
                    if (i >= 0) {
                        this.Z.o0(i);
                        this.Y = -1;
                    }
                }
            }

            public c(C3755Nn1<K, V> c3755Nn1) {
                this.X = c3755Nn1;
            }

            @Override // java.util.Collection
            public boolean add(V v) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Collection
            public boolean addAll(Collection<? extends V> collection) {
                C6562gT0.p(collection, "elements");
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Collection
            public void clear() {
                this.X.K();
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
                C3755Nn1<K, V> c3755Nn1 = this.X;
                if (collection2.isEmpty()) {
                    return true;
                }
                for (Object obj : collection2) {
                    if (!c3755Nn1.h(obj)) {
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
                return new C0213a(this.X);
            }

            @Override // java.util.Collection
            public boolean remove(Object obj) {
                C3755Nn1<K, V> c3755Nn1 = this.X;
                long[] jArr = c3755Nn1.a;
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
                                    if (C6562gT0.g(c3755Nn1.c[i4], obj)) {
                                        c3755Nn1.o0(i4);
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

            @Override // java.util.Collection
            public boolean removeAll(Collection<? extends Object> collection) {
                C6562gT0.p(collection, "elements");
                C3755Nn1<K, V> c3755Nn1 = this.X;
                long[] jArr = c3755Nn1.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return false;
                }
                int i = 0;
                boolean z = false;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                if (C10662xF.Y1(collection, c3755Nn1.c[i4])) {
                                    c3755Nn1.o0(i4);
                                    z = true;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            return z;
                        }
                    }
                    if (i != length) {
                        i++;
                    } else {
                        return z;
                    }
                }
            }

            @Override // java.util.Collection
            public boolean retainAll(Collection<? extends Object> collection) {
                C6562gT0.p(collection, "elements");
                C3755Nn1<K, V> c3755Nn1 = this.X;
                long[] jArr = c3755Nn1.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return false;
                }
                int i = 0;
                boolean z = false;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                if (!C10662xF.Y1(collection, c3755Nn1.c[i4])) {
                                    c3755Nn1.o0(i4);
                                    z = true;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            return z;
                        }
                    }
                    if (i != length) {
                        i++;
                    } else {
                        return z;
                    }
                }
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
            super();
        }

        @Override // o.XX1.a
        public Set<Map.Entry<K, V>> a() {
            return new C0208a(C3755Nn1.this);
        }

        @Override // o.XX1.a
        public Set<K> b() {
            return new b(C3755Nn1.this);
        }

        @Override // o.XX1.a, java.util.Map
        public void clear() {
            C3755Nn1.this.K();
        }

        @Override // o.XX1.a
        public Collection<V> d() {
            return new c(C3755Nn1.this);
        }

        @Override // o.XX1.a, java.util.Map
        public V put(K k, V v) {
            return C3755Nn1.this.e0(k, v);
        }

        @Override // o.XX1.a, java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            C6562gT0.p(map, "from");
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }

        @Override // o.XX1.a, java.util.Map
        public V remove(Object obj) {
            return C3755Nn1.this.k0(obj);
        }
    }

    public C3755Nn1() {
        this(0, 1, null);
    }

    public final void I() {
        int compare;
        if (this.d > 8) {
            compare = Long.compare(C9860tx2.n(C9860tx2.n(this.e) * 32) ^ Long.MIN_VALUE, C9860tx2.n(C9860tx2.n(this.d) * 25) ^ Long.MIN_VALUE);
            if (compare <= 0) {
                p0(this.d);
                return;
            }
        }
        p0(YX1.w(this.d));
    }

    public final Map<K, V> J() {
        return new a();
    }

    public final void K() {
        this.e = 0;
        long[] jArr = this.a;
        if (jArr != YX1.e) {
            C4788Ye.U1(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        C4788Ye.M1(this.c, null, 0, this.d);
        C4788Ye.M1(this.b, null, 0, this.d);
        P();
    }

    public final V L(K k, VA0<? super K, ? super V, ? extends V> va0) {
        boolean z;
        Object obj;
        C6562gT0.p(va0, "computeBlock");
        int N = N(k);
        if (N < 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            obj = null;
        } else {
            obj = this.c[N];
        }
        V i = va0.i(k, obj);
        if (z) {
            int i2 = ~N;
            this.b[i2] = k;
            this.c[i2] = i;
            return i;
        }
        this.c[N] = i;
        return i;
    }

    public final int M(int i) {
        int i2 = this.d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final int N(K k) {
        int i;
        int i2;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * (-862048943);
        int i4 = i3 ^ (i3 << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.d;
        int i8 = i5 & i7;
        int i9 = 0;
        while (true) {
            long[] jArr = this.a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j2 = i6;
            int i12 = i6;
            long j3 = j ^ (j2 * YX1.k);
            for (long j4 = (~j3) & (j3 - YX1.k) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int numberOfTrailingZeros = (i8 + (Long.numberOfTrailingZeros(j4) >> 3)) & i7;
                if (C6562gT0.g(this.b[numberOfTrailingZeros], k)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int M = M(i5);
                if (this.f == 0 && ((this.a[M >> 3] >> ((M & 7) << 3)) & 255) != 254) {
                    I();
                    M = M(i5);
                }
                this.e++;
                int i13 = this.f;
                long[] jArr2 = this.a;
                int i14 = M >> 3;
                long j5 = jArr2[i14];
                int i15 = (M & 7) << 3;
                if (((j5 >> i15) & 255) == 128) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                this.f = i13 - i2;
                jArr2[i14] = (j5 & (~(255 << i15))) | (j2 << i15);
                int i16 = this.d;
                int i17 = ((M - 7) & i16) + (i16 & 7);
                int i18 = i17 >> 3;
                int i19 = (i17 & 7) << 3;
                jArr2[i18] = ((~(255 << i19)) & jArr2[i18]) | (j2 << i19);
                return ~M;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
            i6 = i12;
        }
    }

    public final V O(K k, FA0<? extends V> fa0) {
        C6562gT0.p(fa0, "defaultValue");
        V p = p(k);
        if (p == null) {
            V invoke = fa0.invoke();
            q0(k, invoke);
            return invoke;
        }
        return p;
    }

    public final void P() {
        this.f = YX1.o(q()) - this.e;
    }

    public final void Q(int i) {
        long[] jArr;
        if (i == 0) {
            jArr = YX1.e;
        } else {
            long[] jArr2 = new long[((i + 15) & (-8)) >> 3];
            C4788Ye.U1(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.a = jArr;
        int i2 = i >> 3;
        long j = 255 << ((i & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        P();
    }

    public final void R(int i) {
        int i2;
        if (i > 0) {
            i2 = Math.max(7, YX1.x(i));
        } else {
            i2 = 0;
        }
        this.d = i2;
        Q(i2);
        this.b = new Object[i2];
        this.c = new Object[i2];
    }

    public final void S(Iterable<? extends K> iterable) {
        C6562gT0.p(iterable, "keys");
        for (K k : iterable) {
            k0(k);
        }
    }

    public final void T(K k) {
        k0(k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void U(AbstractC8135mt1<K> abstractC8135mt1) {
        C6562gT0.p(abstractC8135mt1, "keys");
        Object[] objArr = abstractC8135mt1.a;
        int i = abstractC8135mt1.b;
        for (int i2 = 0; i2 < i; i2++) {
            k0(objArr[i2]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V(ZX1<K> zx1) {
        C6562gT0.p(zx1, "keys");
        Object[] objArr = zx1.b;
        long[] jArr = zx1.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            k0(objArr[(i << 3) + i3]);
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

    public final void W(B02<? extends K> b02) {
        C6562gT0.p(b02, "keys");
        for (K k : b02) {
            k0(k);
        }
    }

    public final void X(K[] kArr) {
        C6562gT0.p(kArr, "keys");
        for (K k : kArr) {
            k0(k);
        }
    }

    public final void Y(Iterable<? extends C4180Rx1<? extends K, ? extends V>> iterable) {
        C6562gT0.p(iterable, "pairs");
        f0(iterable);
    }

    public final void Z(Map<K, ? extends V> map) {
        C6562gT0.p(map, "from");
        g0(map);
    }

    public final void a0(C4180Rx1<? extends K, ? extends V> c4180Rx1) {
        C6562gT0.p(c4180Rx1, "pair");
        q0(c4180Rx1.e(), c4180Rx1.f());
    }

    public final void b0(XX1<K, V> xx1) {
        C6562gT0.p(xx1, "from");
        h0(xx1);
    }

    public final void c0(B02<? extends C4180Rx1<? extends K, ? extends V>> b02) {
        C6562gT0.p(b02, "pairs");
        i0(b02);
    }

    public final void d0(C4180Rx1<? extends K, ? extends V>[] c4180Rx1Arr) {
        C6562gT0.p(c4180Rx1Arr, "pairs");
        j0(c4180Rx1Arr);
    }

    public final V e0(K k, V v) {
        int N = N(k);
        if (N < 0) {
            N = ~N;
        }
        Object[] objArr = this.c;
        V v2 = (V) objArr[N];
        this.b[N] = k;
        objArr[N] = v;
        return v2;
    }

    public final void f0(Iterable<? extends C4180Rx1<? extends K, ? extends V>> iterable) {
        C6562gT0.p(iterable, "pairs");
        for (C4180Rx1<? extends K, ? extends V> c4180Rx1 : iterable) {
            q0(c4180Rx1.a(), c4180Rx1.b());
        }
    }

    public final void g0(Map<K, ? extends V> map) {
        C6562gT0.p(map, "from");
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            q0(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h0(XX1<K, V> xx1) {
        C6562gT0.p(xx1, "from");
        Object[] objArr = xx1.b;
        Object[] objArr2 = xx1.c;
        long[] jArr = xx1.a;
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
                            q0(objArr[i4], objArr2[i4]);
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

    public final void i0(B02<? extends C4180Rx1<? extends K, ? extends V>> b02) {
        C6562gT0.p(b02, "pairs");
        for (C4180Rx1<? extends K, ? extends V> c4180Rx1 : b02) {
            q0(c4180Rx1.a(), c4180Rx1.b());
        }
    }

    public final void j0(C4180Rx1<? extends K, ? extends V>[] c4180Rx1Arr) {
        C6562gT0.p(c4180Rx1Arr, "pairs");
        for (C4180Rx1<? extends K, ? extends V> c4180Rx1 : c4180Rx1Arr) {
            q0(c4180Rx1.a(), c4180Rx1.b());
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
    public final V k0(K k) {
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
            return o0(i2);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l0(K k, V v) {
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
        if (i2 < 0 || !C6562gT0.g(this.c[i2], v)) {
            return false;
        }
        o0(i2);
        return true;
    }

    public final void m0() {
        long[] jArr = this.a;
        int i = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i3 >> 3;
            int i5 = (i3 & 7) << 3;
            if (((jArr[i4] >> i5) & 255) == 254) {
                long[] jArr2 = this.a;
                jArr2[i4] = (128 << i5) | (jArr2[i4] & (~(255 << i5)));
                int i6 = this.d;
                int i7 = ((i3 - 7) & i6) + (i6 & 7);
                int i8 = i7 >> 3;
                int i9 = (i7 & 7) << 3;
                jArr2[i8] = ((~(255 << i9)) & jArr2[i8]) | (128 << i9);
                i2++;
            }
        }
        this.f += i2;
    }

    public final void n0(VA0<? super K, ? super V, Boolean> va0) {
        C6562gT0.p(va0, "predicate");
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
                            if (va0.i(this.b[i4], this.c[i4]).booleanValue()) {
                                o0(i4);
                            }
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

    public final V o0(int i) {
        this.e--;
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        jArr[i2] = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        int i4 = this.d;
        int i5 = ((i - 7) & i4) + (i4 & 7);
        int i6 = i5 >> 3;
        int i7 = (i5 & 7) << 3;
        jArr[i6] = (jArr[i6] & (~(255 << i7))) | (254 << i7);
        this.b[i] = null;
        Object[] objArr = this.c;
        V v = (V) objArr[i];
        objArr[i] = null;
        return v;
    }

    public final void p0(int i) {
        int i2;
        int i3;
        long[] jArr = this.a;
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        int i4 = this.d;
        R(i);
        Object[] objArr3 = this.b;
        Object[] objArr4 = this.c;
        int i5 = 0;
        while (i5 < i4) {
            if (((jArr[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i5];
                if (obj != null) {
                    i3 = obj.hashCode();
                } else {
                    i3 = 0;
                }
                int i6 = i3 * (-862048943);
                int i7 = i6 ^ (i6 << 16);
                int M = M(i7 >>> 7);
                long j = i7 & 127;
                long[] jArr2 = this.a;
                int i8 = M >> 3;
                int i9 = (M & 7) << 3;
                i2 = i5;
                jArr2[i8] = (jArr2[i8] & (~(255 << i9))) | (j << i9);
                int i10 = this.d;
                int i11 = ((M - 7) & i10) + (i10 & 7);
                int i12 = i11 >> 3;
                int i13 = (i11 & 7) << 3;
                jArr2[i12] = (jArr2[i12] & (~(255 << i13))) | (j << i13);
                objArr3[M] = obj;
                objArr4[M] = objArr2[i2];
            } else {
                i2 = i5;
            }
            i5 = i2 + 1;
        }
    }

    public final void q0(K k, V v) {
        int N = N(k);
        if (N < 0) {
            N = ~N;
        }
        this.b[N] = k;
        this.c[N] = v;
    }

    public final int r0() {
        int i = this.d;
        int x = YX1.x(YX1.z(this.e));
        if (x < i) {
            p0(x);
            return i - this.d;
        }
        return 0;
    }

    public final void s0(int i, long j) {
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        jArr[i2] = (jArr[i2] & (~(255 << i3))) | (j << i3);
        int i4 = this.d;
        int i5 = ((i - 7) & i4) + (i4 & 7);
        int i6 = i5 >> 3;
        int i7 = (i5 & 7) << 3;
        jArr[i6] = (j << i7) | (jArr[i6] & (~(255 << i7)));
    }

    public /* synthetic */ C3755Nn1(int i, int i2, C9516sY c9516sY) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public C3755Nn1(int i) {
        super(null);
        if (i >= 0) {
            R(YX1.z(i));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.");
    }
}
