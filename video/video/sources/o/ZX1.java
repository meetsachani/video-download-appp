package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class ZX1<E> {
    public long[] a;
    public Object[] b;
    public int c;
    public int d;

    /* loaded from: classes.dex */
    public class a implements Set<E>, GW0 {

        @FV(c = "androidx.collection.ScatterSet$SetWrapper$iterator$1", f = "ScatterSet.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {495}, m = "invokeSuspend", n = {"$this$iterator", "k$iv", "m$iv$iv", "lastIndex$iv$iv", "i$iv$iv", "slot$iv$iv", "bitCount$iv$iv", "j$iv$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
        /* renamed from: o.ZX1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0254a extends MT1 implements VA0<F02<? super E>, HM<? super C7458kA2>, Object> {
            public Object Y0;
            public Object Z;
            public int Z0;
            public int a1;
            public int b1;
            public int c1;
            public long d1;
            public int e1;
            public /* synthetic */ Object f1;
            public final /* synthetic */ ZX1<E> g1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0254a(ZX1<E> zx1, HM<? super C0254a> hm) {
                super(2, hm);
                this.g1 = zx1;
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
                    ZX1<E> zx1 = this.g1;
                    objArr = zx1.b;
                    jArr = zx1.a;
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
                return ((C0254a) t(f02, hm)).F(C7458kA2.a);
            }

            @Override // o.AbstractC5644cl
            public final HM<C7458kA2> t(Object obj, HM<?> hm) {
                C0254a c0254a = new C0254a(this.g1, hm);
                c0254a.f1 = obj;
                return c0254a;
            }
        }

        public a() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return ZX1.this.e(obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<? extends Object> collection) {
            C6562gT0.p(collection, "elements");
            ZX1<E> zx1 = ZX1.this;
            for (Object obj : collection) {
                if (!zx1.e(obj)) {
                    return false;
                }
            }
            return true;
        }

        public int d() {
            return ZX1.this.d;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return ZX1.this.r();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return N02.a(new C0254a(ZX1.this, null));
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
    public static final class b extends AbstractC8052mY0 implements HA0<E, CharSequence> {
        public final /* synthetic */ ZX1<E> X;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ZX1<E> zx1) {
            super(1);
            this.X = zx1;
        }

        @Override // o.HA0
        /* renamed from: c */
        public final CharSequence invoke(E e) {
            if (e == this.X) {
                return "(this)";
            }
            return String.valueOf(e);
        }
    }

    public /* synthetic */ ZX1(C9516sY c9516sY) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String A(ZX1 zx1, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, HA0 ha0, int i2, Object obj) {
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
            HA0<? super E, ? extends CharSequence> ha02 = ha0;
            if ((i2 & 32) != 0) {
                ha02 = null;
            }
            CharSequence charSequence5 = charSequence4;
            HA0<? super E, ? extends CharSequence> ha03 = ha02;
            return zx1.z(charSequence, charSequence2, charSequence3, i, charSequence5, ha03);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final boolean B() {
        if (this.d == 0) {
            return true;
        }
        return false;
    }

    public final boolean a(HA0<? super E, Boolean> ha0) {
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
                        if ((255 & j) < 128 && !ha0.invoke(objArr[(i << 3) + i3]).booleanValue()) {
                            return false;
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
        if (this.d != 0) {
            return true;
        }
        return false;
    }

    public final boolean c(HA0<? super E, Boolean> ha0) {
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
                        if ((255 & j) < 128 && ha0.invoke(objArr[(i << 3) + i3]).booleanValue()) {
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

    public final Set<E> d() {
        return new a();
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
    public final boolean e(E e) {
        int i;
        int i2;
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
        if (i2 < 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ZX1)) {
            return false;
        }
        ZX1 zx1 = (ZX1) obj;
        if (zx1.q() != q()) {
            return false;
        }
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
                        if ((255 & j) < 128 && !zx1.e(objArr[(i << 3) + i3])) {
                            return false;
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
        return true;
    }

    public final int f() {
        return q();
    }

    public final int g(HA0<? super E, Boolean> ha0) {
        C6562gT0.p(ha0, "predicate");
        Object[] objArr = this.b;
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
                    if ((255 & j) < 128 && ha0.invoke(objArr[(i << 3) + i4]).booleanValue()) {
                        i2++;
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

    public final int h(E e) {
        int i;
        int i2 = 0;
        if (e != null) {
            i = e.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * (-862048943);
        int i4 = i3 ^ (i3 << 16);
        int i5 = i4 & 127;
        int i6 = this.c;
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
                if (C6562gT0.g(this.b[numberOfTrailingZeros], e)) {
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

    public int hashCode() {
        int i;
        Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j) < 128) {
                        Object obj = objArr[(i2 << 3) + i5];
                        if (obj != null) {
                            i = obj.hashCode();
                        } else {
                            i = 0;
                        }
                        i3 += i;
                    }
                    j >>= 8;
                }
                if (i4 != 8) {
                    return i3;
                }
            }
            if (i2 != length) {
                i2++;
            } else {
                return i3;
            }
        }
    }

    public final E i() {
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
                            return (E) objArr[(i << 3) + i3];
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
        throw new NoSuchElementException("The ScatterSet is empty");
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [E, java.lang.Object] */
    public final E j(HA0<? super E, Boolean> ha0) {
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
                            ?? r10 = (Object) objArr[(i << 3) + i3];
                            if (ha0.invoke(r10).booleanValue()) {
                                return r10;
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
        throw new NoSuchElementException("Could not find a match");
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [E, java.lang.Object] */
    public final E k(HA0<? super E, Boolean> ha0) {
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
                            ?? r10 = (Object) objArr[(i << 3) + i3];
                            if (ha0.invoke(r10).booleanValue()) {
                                return r10;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return null;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return null;
                }
            }
        } else {
            return null;
        }
    }

    public final void l(HA0<? super E, C7458kA2> ha0) {
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

    public final int n() {
        return this.c;
    }

    public final int q() {
        return this.d;
    }

    public final boolean r() {
        if (this.d == 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if (this.d != 0) {
            return true;
        }
        return false;
    }

    public final String t() {
        return A(this, null, null, null, 0, null, null, 63, null);
    }

    public String toString() {
        return A(this, null, C6566gU0.f, C6566gU0.g, 0, null, new b(this), 25, null);
    }

    public final String u(CharSequence charSequence) {
        C6562gT0.p(charSequence, "separator");
        return A(this, charSequence, null, null, 0, null, null, 62, null);
    }

    public final String v(CharSequence charSequence, CharSequence charSequence2) {
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        return A(this, charSequence, charSequence2, null, 0, null, null, 60, null);
    }

    public final String w(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        return A(this, charSequence, charSequence2, charSequence3, 0, null, null, 56, null);
    }

    public final String x(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i) {
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        return A(this, charSequence, charSequence2, charSequence3, i, null, null, 48, null);
    }

    public final String y(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4) {
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(charSequence4, "truncated");
        return A(this, charSequence, charSequence2, charSequence3, i, charSequence4, null, 32, null);
    }

    public final String z(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, HA0<? super E, ? extends CharSequence> ha0) {
        int i2;
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i3 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j & 255) < 128) {
                            i2 = i5;
                            Object obj = objArr[(i3 << 3) + i7];
                            if (i4 == i) {
                                sb.append(charSequence4);
                                break loop0;
                            }
                            if (i4 != 0) {
                                sb.append(charSequence);
                            }
                            if (ha0 == null) {
                                sb.append(obj);
                            } else {
                                sb.append(ha0.invoke(obj));
                            }
                            i4++;
                        } else {
                            i2 = i5;
                        }
                        j >>= i2;
                        i7++;
                        i5 = i2;
                    }
                    if (i6 != i5) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        sb.append(charSequence3);
        String sb2 = sb.toString();
        C6562gT0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public ZX1() {
        this.a = YX1.e;
        this.b = BL.c;
    }

    public static /* synthetic */ void o() {
    }

    public static /* synthetic */ void p() {
    }
}
