package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

@InterfaceC7542kW0
@InterfaceC5880dj0
@InterfaceC8303na2({"SMAP\nULongArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ULongArray.kt\nkotlin/ULongArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n1740#2,3:83\n*S KotlinDebug\n*F\n+ 1 ULongArray.kt\nkotlin/ULongArray\n*L\n58#1:83,3\n*E\n"})
@InterfaceC6480g82(version = "1.3")
/* renamed from: o.ux2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10103ux2 implements Collection<C9860tx2>, GW0 {
    @NotNull
    public final long[] X;

    /* renamed from: o.ux2$a */
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<C9860tx2>, GW0 {
        @NotNull
        public final long[] X;
        public int Y;

        public a(@NotNull long[] jArr) {
            C6562gT0.p(jArr, "array");
            this.X = jArr;
        }

        public long b() {
            int i = this.Y;
            long[] jArr = this.X;
            if (i < jArr.length) {
                this.Y = i + 1;
                return C9860tx2.n(jArr[i]);
            }
            throw new NoSuchElementException(String.valueOf(this.Y));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.Y < this.X.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ C9860tx2 next() {
            return C9860tx2.g(b());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @HK1
    public /* synthetic */ C10103ux2(long[] jArr) {
        this.X = jArr;
    }

    public static int B(long[] jArr) {
        return jArr.length;
    }

    public static int F(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    public static boolean G(long[] jArr) {
        if (jArr.length == 0) {
            return true;
        }
        return false;
    }

    @NotNull
    public static Iterator<C9860tx2> H(long[] jArr) {
        return new a(jArr);
    }

    public static final void J(long[] jArr, int i, long j) {
        jArr[i] = j;
    }

    public static String K(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    public static final /* synthetic */ C10103ux2 e(long[] jArr) {
        return new C10103ux2(jArr);
    }

    @NotNull
    public static long[] f(int i) {
        return h(new long[i]);
    }

    @HK1
    @NotNull
    public static long[] h(@NotNull long[] jArr) {
        C6562gT0.p(jArr, "storage");
        return jArr;
    }

    public static boolean j(long[] jArr, long j) {
        return C7330jf.A8(jArr, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean k(long[] jArr, @NotNull Collection<C9860tx2> collection) {
        C6562gT0.p(collection, "elements");
        Collection<C9860tx2> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof C9860tx2) || !C7330jf.A8(jArr, ((C9860tx2) obj).p0())) {
                return false;
            }
            while (r5.hasNext()) {
            }
        }
        return true;
    }

    public static boolean l(long[] jArr, Object obj) {
        if (!(obj instanceof C10103ux2) || !C6562gT0.g(jArr, ((C10103ux2) obj).L())) {
            return false;
        }
        return true;
    }

    public static final boolean p(long[] jArr, long[] jArr2) {
        return C6562gT0.g(jArr, jArr2);
    }

    public static final long r(long[] jArr, int i) {
        return C9860tx2.n(jArr[i]);
    }

    public final /* synthetic */ long[] L() {
        return this.X;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(C9860tx2 c9860tx2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends C9860tx2> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C9860tx2)) {
            return false;
        }
        return i(((C9860tx2) obj).p0());
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<?> collection) {
        C6562gT0.p(collection, "elements");
        return k(this.X, collection);
    }

    public boolean d(long j) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return l(this.X, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return F(this.X);
    }

    public boolean i(long j) {
        return j(this.X, j);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return G(this.X);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<C9860tx2> iterator() {
        return H(this.X);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return C6250fF.a(this);
    }

    public String toString() {
        return K(this.X);
    }

    @Override // java.util.Collection
    /* renamed from: w */
    public int size() {
        return B(this.X);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        C6562gT0.p(tArr, "array");
        return (T[]) C6250fF.b(this, tArr);
    }

    @HK1
    public static /* synthetic */ void D() {
    }
}
