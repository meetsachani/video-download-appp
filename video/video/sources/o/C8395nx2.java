package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

@InterfaceC7542kW0
@InterfaceC5880dj0
@InterfaceC8303na2({"SMAP\nUIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIntArray.kt\nkotlin/UIntArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n1740#2,3:83\n*S KotlinDebug\n*F\n+ 1 UIntArray.kt\nkotlin/UIntArray\n*L\n58#1:83,3\n*E\n"})
@InterfaceC6480g82(version = "1.3")
/* renamed from: o.nx2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8395nx2 implements Collection<C7162ix2>, GW0 {
    @NotNull
    public final int[] X;

    /* renamed from: o.nx2$a */
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<C7162ix2>, GW0 {
        @NotNull
        public final int[] X;
        public int Y;

        public a(@NotNull int[] iArr) {
            C6562gT0.p(iArr, "array");
            this.X = iArr;
        }

        public int b() {
            int i = this.Y;
            int[] iArr = this.X;
            if (i < iArr.length) {
                this.Y = i + 1;
                return C7162ix2.n(iArr[i]);
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
        public /* bridge */ /* synthetic */ C7162ix2 next() {
            return C7162ix2.g(b());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @HK1
    public /* synthetic */ C8395nx2(int[] iArr) {
        this.X = iArr;
    }

    public static int B(int[] iArr) {
        return iArr.length;
    }

    public static int F(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static boolean G(int[] iArr) {
        if (iArr.length == 0) {
            return true;
        }
        return false;
    }

    @NotNull
    public static Iterator<C7162ix2> H(int[] iArr) {
        return new a(iArr);
    }

    public static final void J(int[] iArr, int i, int i2) {
        iArr[i] = i2;
    }

    public static String K(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    public static final /* synthetic */ C8395nx2 e(int[] iArr) {
        return new C8395nx2(iArr);
    }

    @NotNull
    public static int[] f(int i) {
        return h(new int[i]);
    }

    @HK1
    @NotNull
    public static int[] h(@NotNull int[] iArr) {
        C6562gT0.p(iArr, "storage");
        return iArr;
    }

    public static boolean j(int[] iArr, int i) {
        return C7330jf.z8(iArr, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean k(int[] iArr, @NotNull Collection<C7162ix2> collection) {
        C6562gT0.p(collection, "elements");
        Collection<C7162ix2> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof C7162ix2) || !C7330jf.z8(iArr, ((C7162ix2) obj).p0())) {
                return false;
            }
            while (r4.hasNext()) {
            }
        }
        return true;
    }

    public static boolean l(int[] iArr, Object obj) {
        if (!(obj instanceof C8395nx2) || !C6562gT0.g(iArr, ((C8395nx2) obj).L())) {
            return false;
        }
        return true;
    }

    public static final boolean p(int[] iArr, int[] iArr2) {
        return C6562gT0.g(iArr, iArr2);
    }

    public static final int r(int[] iArr, int i) {
        return C7162ix2.n(iArr[i]);
    }

    public final /* synthetic */ int[] L() {
        return this.X;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(C7162ix2 c7162ix2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends C7162ix2> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C7162ix2)) {
            return false;
        }
        return i(((C7162ix2) obj).p0());
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<?> collection) {
        C6562gT0.p(collection, "elements");
        return k(this.X, collection);
    }

    public boolean d(int i) {
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

    public boolean i(int i) {
        return j(this.X, i);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return G(this.X);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<C7162ix2> iterator() {
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
