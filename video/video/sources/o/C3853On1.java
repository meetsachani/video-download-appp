package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: o.On1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3853On1<E> extends ZX1<E> {
    public int e;

    /* renamed from: o.On1$a */
    /* loaded from: classes.dex */
    public final class a extends ZX1<E>.a implements Set<E>, RW0 {

        /* renamed from: o.On1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0220a implements Iterator<E>, JW0 {
            public int X = -1;
            public final Iterator<E> Y;
            public final /* synthetic */ C3853On1<E> Z;

            @FV(c = "androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1", f = "ScatterSet.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1060}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$3", "I$0", "I$1", "J$0", "I$2", "I$3"})
            /* renamed from: o.On1$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0221a extends MT1 implements VA0<F02<? super E>, HM<? super C7458kA2>, Object> {
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
                public final /* synthetic */ C3853On1<E> h1;
                public final /* synthetic */ C0220a i1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0221a(C3853On1<E> c3853On1, C0220a c0220a, HM<? super C0221a> hm) {
                    super(2, hm);
                    this.h1 = c3853On1;
                    this.i1 = c0220a;
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
                /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x00a0  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x00ab  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0057 -> B:23:0x00a9). Please submit an issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0059 -> B:14:0x006d). Please submit an issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0076 -> B:20:0x009d). Please submit an issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x009a -> B:20:0x009d). Please submit an issue!!! */
                @Override // o.AbstractC5644cl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object F(Object obj) {
                    F02 f02;
                    C3853On1<E> c3853On1;
                    C0220a c0220a;
                    long[] jArr;
                    int length;
                    int i;
                    long j;
                    Object l = C7289jT0.l();
                    int i2 = this.f1;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            int i3 = this.d1;
                            int i4 = this.c1;
                            long j2 = this.e1;
                            int i5 = this.b1;
                            int i6 = this.a1;
                            long[] jArr2 = (long[]) this.Z0;
                            C3853On1<E> c3853On12 = (C3853On1) this.Y0;
                            C0220a c0220a2 = (C0220a) this.Z;
                            F02 f022 = (F02) this.g1;
                            RT1.n(obj);
                            j2 >>= 8;
                            i3++;
                            if (i3 < i4) {
                                if (i4 == 8) {
                                    int i7 = i6;
                                    i = i5;
                                    length = i7;
                                    jArr = jArr2;
                                    c3853On1 = c3853On12;
                                    c0220a = c0220a2;
                                    f02 = f022;
                                    if (i != length) {
                                        i++;
                                        j = jArr[i];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i8 = i;
                                            i6 = length;
                                            i5 = i8;
                                            f022 = f02;
                                            i3 = 0;
                                            c3853On12 = c3853On1;
                                            jArr2 = jArr;
                                            i4 = 8 - ((~(i - length)) >>> 31);
                                            c0220a2 = c0220a;
                                            j2 = j;
                                            if (i3 < i4) {
                                                if ((255 & j2) < 128) {
                                                    int i9 = (i5 << 3) + i3;
                                                    c0220a2.d(i9);
                                                    Object obj2 = c3853On12.b[i9];
                                                    this.g1 = f022;
                                                    this.Z = c0220a2;
                                                    this.Y0 = c3853On12;
                                                    this.Z0 = jArr2;
                                                    this.a1 = i6;
                                                    this.b1 = i5;
                                                    this.e1 = j2;
                                                    this.c1 = i4;
                                                    this.d1 = i3;
                                                    this.f1 = 1;
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
                        f02 = (F02) this.g1;
                        c3853On1 = this.h1;
                        c0220a = this.i1;
                        jArr = c3853On1.a;
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
                public final Object i(F02<? super E> f02, HM<? super C7458kA2> hm) {
                    return ((C0221a) t(f02, hm)).F(C7458kA2.a);
                }

                @Override // o.AbstractC5644cl
                public final HM<C7458kA2> t(Object obj, HM<?> hm) {
                    C0221a c0221a = new C0221a(this.h1, this.i1, hm);
                    c0221a.g1 = obj;
                    return c0221a;
                }
            }

            public C0220a(C3853On1<E> c3853On1) {
                this.Z = c3853On1;
                this.Y = N02.a(new C0221a(c3853On1, this, null));
            }

            public final int b() {
                return this.X;
            }

            public final Iterator<E> c() {
                return this.Y;
            }

            public final void d(int i) {
                this.X = i;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.Y.hasNext();
            }

            @Override // java.util.Iterator
            public E next() {
                return this.Y.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                int i = this.X;
                if (i != -1) {
                    this.Z.j0(i);
                    this.X = -1;
                }
            }
        }

        public a() {
            super();
        }

        @Override // o.ZX1.a, java.util.Set, java.util.Collection
        public boolean add(E e) {
            return C3853On1.this.C(e);
        }

        @Override // o.ZX1.a, java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            C6562gT0.p(collection, "elements");
            return C3853On1.this.D(collection);
        }

        @Override // o.ZX1.a, java.util.Set, java.util.Collection
        public void clear() {
            C3853On1.this.K();
        }

        @Override // o.ZX1.a, java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return new C0220a(C3853On1.this);
        }

        @Override // o.ZX1.a, java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            return C3853On1.this.c0(obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ZX1.a, java.util.Set, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            C6562gT0.p(collection, "elements");
            int q = C3853On1.this.q();
            for (Object obj : collection) {
                C3853On1.this.R(obj);
            }
            if (q != C3853On1.this.q()) {
                return true;
            }
            return false;
        }

        @Override // o.ZX1.a, java.util.Set, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            C6562gT0.p(collection, "elements");
            C3853On1<E> c3853On1 = C3853On1.this;
            long[] jArr = c3853On1.a;
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
                            if (!collection.contains(c3853On1.b[i4])) {
                                c3853On1.j0(i4);
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
    }

    public C3853On1() {
        this(0, 1, null);
    }

    public final boolean C(E e) {
        int q = q();
        this.b[L(e)] = e;
        if (q() != q) {
            return true;
        }
        return false;
    }

    public final boolean D(Iterable<? extends E> iterable) {
        C6562gT0.p(iterable, "elements");
        int q = q();
        W(iterable);
        if (q != q()) {
            return true;
        }
        return false;
    }

    public final boolean E(AbstractC8135mt1<E> abstractC8135mt1) {
        C6562gT0.p(abstractC8135mt1, "elements");
        int q = q();
        Y(abstractC8135mt1);
        if (q != q()) {
            return true;
        }
        return false;
    }

    public final boolean F(ZX1<E> zx1) {
        C6562gT0.p(zx1, "elements");
        int q = q();
        Z(zx1);
        if (q != q()) {
            return true;
        }
        return false;
    }

    public final boolean G(B02<? extends E> b02) {
        C6562gT0.p(b02, "elements");
        int q = q();
        a0(b02);
        if (q != q()) {
            return true;
        }
        return false;
    }

    public final boolean H(E[] eArr) {
        C6562gT0.p(eArr, "elements");
        int q = q();
        b0(eArr);
        if (q != q()) {
            return true;
        }
        return false;
    }

    public final void I() {
        int compare;
        if (this.c > 8) {
            compare = Long.compare(C9860tx2.n(C9860tx2.n(this.d) * 32) ^ Long.MIN_VALUE, C9860tx2.n(C9860tx2.n(this.c) * 25) ^ Long.MIN_VALUE);
            if (compare <= 0) {
                i0();
                return;
            }
        }
        l0(YX1.w(this.c));
    }

    public final Set<E> J() {
        return new a();
    }

    public final void K() {
        this.d = 0;
        long[] jArr = this.a;
        if (jArr != YX1.e) {
            C4788Ye.U1(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.a;
            int i = this.c;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        C4788Ye.M1(this.b, null, 0, this.c);
        N();
    }

    public final int L(E e) {
        int i;
        int i2;
        if (e != null) {
            i = e.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * (-862048943);
        int i4 = i3 ^ (i3 << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.c;
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
                if (C6562gT0.g(this.b[numberOfTrailingZeros], e)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int M = M(i5);
                if (this.e == 0 && ((this.a[M >> 3] >> ((M & 7) << 3)) & 255) != 254) {
                    I();
                    M = M(i5);
                }
                this.d++;
                int i13 = this.e;
                long[] jArr2 = this.a;
                int i14 = M >> 3;
                long j5 = jArr2[i14];
                int i15 = (M & 7) << 3;
                if (((j5 >> i15) & 255) == 128) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                this.e = i13 - i2;
                jArr2[i14] = (j5 & (~(255 << i15))) | (j2 << i15);
                int i16 = this.c;
                int i17 = ((M - 7) & i16) + (i16 & 7);
                int i18 = i17 >> 3;
                int i19 = (i17 & 7) << 3;
                jArr2[i18] = ((~(255 << i19)) & jArr2[i18]) | (j2 << i19);
                return M;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
            i6 = i12;
        }
    }

    public final int M(int i) {
        int i2 = this.c;
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

    public final void N() {
        this.e = YX1.o(n()) - this.d;
    }

    public final void O(int i) {
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
        N();
    }

    public final void P(int i) {
        int i2;
        if (i > 0) {
            i2 = Math.max(7, YX1.x(i));
        } else {
            i2 = 0;
        }
        this.c = i2;
        O(i2);
        this.b = new Object[i2];
    }

    public final void Q(Iterable<? extends E> iterable) {
        C6562gT0.p(iterable, "elements");
        for (E e : iterable) {
            R(e);
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
    public final void R(E e) {
        int i;
        int i2;
        int i3 = 0;
        if (e != null) {
            i = e.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * (-862048943);
        int i5 = i4 ^ (i4 << 16);
        int i6 = i5 & 127;
        int i7 = this.c;
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
                if (C6562gT0.g(this.b[i2], e)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i3 += 8;
            i8 = i9 + i3;
        }
        if (i2 >= 0) {
            j0(i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void S(AbstractC8135mt1<E> abstractC8135mt1) {
        C6562gT0.p(abstractC8135mt1, "elements");
        Object[] objArr = abstractC8135mt1.a;
        int i = abstractC8135mt1.b;
        for (int i2 = 0; i2 < i; i2++) {
            R(objArr[i2]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void T(ZX1<E> zx1) {
        C6562gT0.p(zx1, "elements");
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
                            R(objArr[(i << 3) + i3]);
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

    public final void U(B02<? extends E> b02) {
        C6562gT0.p(b02, "elements");
        for (E e : b02) {
            R(e);
        }
    }

    public final void V(E[] eArr) {
        C6562gT0.p(eArr, "elements");
        for (E e : eArr) {
            R(e);
        }
    }

    public final void W(Iterable<? extends E> iterable) {
        C6562gT0.p(iterable, "elements");
        for (E e : iterable) {
            X(e);
        }
    }

    public final void X(E e) {
        this.b[L(e)] = e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Y(AbstractC8135mt1<E> abstractC8135mt1) {
        C6562gT0.p(abstractC8135mt1, "elements");
        Object[] objArr = abstractC8135mt1.a;
        int i = abstractC8135mt1.b;
        for (int i2 = 0; i2 < i; i2++) {
            X(objArr[i2]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Z(ZX1<E> zx1) {
        C6562gT0.p(zx1, "elements");
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
                            X(objArr[(i << 3) + i3]);
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

    public final void a0(B02<? extends E> b02) {
        C6562gT0.p(b02, "elements");
        for (E e : b02) {
            X(e);
        }
    }

    public final void b0(E[] eArr) {
        C6562gT0.p(eArr, "elements");
        for (E e : eArr) {
            X(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c0(E e) {
        int i;
        int i2;
        boolean z = false;
        if (e != null) {
            i = e.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * (-862048943);
        int i4 = i3 ^ (i3 << 16);
        int i5 = i4 & 127;
        int i6 = this.c;
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
                if (C6562gT0.g(this.b[i2], e)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
        }
        if (i2 >= 0) {
            z = true;
        }
        if (z) {
            j0(i2);
        }
        return z;
    }

    public final boolean d0(Iterable<? extends E> iterable) {
        C6562gT0.p(iterable, "elements");
        int q = q();
        Q(iterable);
        if (q != q()) {
            return true;
        }
        return false;
    }

    public final boolean e0(AbstractC8135mt1<E> abstractC8135mt1) {
        C6562gT0.p(abstractC8135mt1, "elements");
        int q = q();
        S(abstractC8135mt1);
        if (q != q()) {
            return true;
        }
        return false;
    }

    public final boolean f0(ZX1<E> zx1) {
        C6562gT0.p(zx1, "elements");
        int q = q();
        T(zx1);
        if (q != q()) {
            return true;
        }
        return false;
    }

    public final boolean g0(B02<? extends E> b02) {
        C6562gT0.p(b02, "elements");
        int q = q();
        U(b02);
        if (q != q()) {
            return true;
        }
        return false;
    }

    public final boolean h0(E[] eArr) {
        C6562gT0.p(eArr, "elements");
        int q = q();
        V(eArr);
        if (q != q()) {
            return true;
        }
        return false;
    }

    public final void i0() {
        long[] jArr = this.a;
        int i = this.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i3 >> 3;
            int i5 = (i3 & 7) << 3;
            if (((jArr[i4] >> i5) & 255) == 254) {
                long[] jArr2 = this.a;
                jArr2[i4] = (128 << i5) | (jArr2[i4] & (~(255 << i5)));
                int i6 = this.c;
                int i7 = ((i3 - 7) & i6) + (i6 & 7);
                int i8 = i7 >> 3;
                int i9 = (i7 & 7) << 3;
                jArr2[i8] = ((~(255 << i9)) & jArr2[i8]) | (128 << i9);
                i2++;
            }
        }
        this.e += i2;
    }

    public final void j0(int i) {
        this.d--;
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        jArr[i2] = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        int i4 = this.c;
        int i5 = ((i - 7) & i4) + (i4 & 7);
        int i6 = i5 >> 3;
        int i7 = (i5 & 7) << 3;
        jArr[i6] = (jArr[i6] & (~(255 << i7))) | (254 << i7);
        this.b[i] = null;
    }

    public final void k0(HA0<? super E, Boolean> ha0) {
        C6562gT0.p(ha0, "predicate");
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
                            int i4 = (i << 3) + i3;
                            if (ha0.invoke(objArr[i4]).booleanValue()) {
                                j0(i4);
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

    public final void l0(int i) {
        int i2;
        int i3;
        long[] jArr = this.a;
        Object[] objArr = this.b;
        int i4 = this.c;
        P(i);
        Object[] objArr2 = this.b;
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
                int i10 = this.c;
                int i11 = ((M - 7) & i10) + (i10 & 7);
                int i12 = i11 >> 3;
                int i13 = (i11 & 7) << 3;
                jArr2[i12] = ((~(255 << i13)) & jArr2[i12]) | (j << i13);
                objArr2[M] = obj;
            } else {
                i2 = i5;
            }
            i5 = i2 + 1;
        }
    }

    public final int m0() {
        int i = this.c;
        int x = YX1.x(YX1.z(this.d));
        if (x < i) {
            l0(x);
            return i - this.c;
        }
        return 0;
    }

    public final void n0(int i, long j) {
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        jArr[i2] = (jArr[i2] & (~(255 << i3))) | (j << i3);
        int i4 = this.c;
        int i5 = ((i - 7) & i4) + (i4 & 7);
        int i6 = i5 >> 3;
        int i7 = (i5 & 7) << 3;
        jArr[i6] = (j << i7) | (jArr[i6] & (~(255 << i7)));
    }

    public /* synthetic */ C3853On1(int i, int i2, C9516sY c9516sY) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public C3853On1(int i) {
        super(null);
        if (i >= 0) {
            P(YX1.z(i));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.");
    }
}
