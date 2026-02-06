package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

@InterfaceC7542kW0
@InterfaceC5880dj0
@InterfaceC8303na2({"SMAP\nUShortArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UShortArray.kt\nkotlin/UShortArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n1740#2,3:83\n*S KotlinDebug\n*F\n+ 1 UShortArray.kt\nkotlin/UShortArray\n*L\n58#1:83,3\n*E\n"})
@InterfaceC6480g82(version = "1.3")
/* loaded from: classes3.dex */
public final class Yx2 implements Collection<Xx2>, GW0 {
    @NotNull
    public final short[] X;

    /* loaded from: classes3.dex */
    public static final class a implements Iterator<Xx2>, GW0 {
        @NotNull
        public final short[] X;
        public int Y;

        public a(@NotNull short[] sArr) {
            C6562gT0.p(sArr, "array");
            this.X = sArr;
        }

        public short b() {
            int i = this.Y;
            short[] sArr = this.X;
            if (i < sArr.length) {
                this.Y = i + 1;
                return Xx2.n(sArr[i]);
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
        public /* bridge */ /* synthetic */ Xx2 next() {
            return Xx2.g(b());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @HK1
    public /* synthetic */ Yx2(short[] sArr) {
        this.X = sArr;
    }

    public static int B(short[] sArr) {
        return sArr.length;
    }

    public static int F(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    public static boolean G(short[] sArr) {
        if (sArr.length == 0) {
            return true;
        }
        return false;
    }

    @NotNull
    public static Iterator<Xx2> H(short[] sArr) {
        return new a(sArr);
    }

    public static final void J(short[] sArr, int i, short s) {
        sArr[i] = s;
    }

    public static String K(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    public static final /* synthetic */ Yx2 e(short[] sArr) {
        return new Yx2(sArr);
    }

    @NotNull
    public static short[] f(int i) {
        return h(new short[i]);
    }

    @HK1
    @NotNull
    public static short[] h(@NotNull short[] sArr) {
        C6562gT0.p(sArr, "storage");
        return sArr;
    }

    public static boolean j(short[] sArr, short s) {
        return C7330jf.C8(sArr, s);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean k(short[] sArr, @NotNull Collection<Xx2> collection) {
        C6562gT0.p(collection, "elements");
        Collection<Xx2> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof Xx2) || !C7330jf.C8(sArr, ((Xx2) obj).n0())) {
                return false;
            }
            while (r4.hasNext()) {
            }
        }
        return true;
    }

    public static boolean l(short[] sArr, Object obj) {
        if (!(obj instanceof Yx2) || !C6562gT0.g(sArr, ((Yx2) obj).L())) {
            return false;
        }
        return true;
    }

    public static final boolean p(short[] sArr, short[] sArr2) {
        return C6562gT0.g(sArr, sArr2);
    }

    public static final short r(short[] sArr, int i) {
        return Xx2.n(sArr[i]);
    }

    public final /* synthetic */ short[] L() {
        return this.X;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Xx2 xx2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends Xx2> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Xx2)) {
            return false;
        }
        return i(((Xx2) obj).n0());
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<?> collection) {
        C6562gT0.p(collection, "elements");
        return k(this.X, collection);
    }

    public boolean d(short s) {
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

    public boolean i(short s) {
        return j(this.X, s);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return G(this.X);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<Xx2> iterator() {
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
