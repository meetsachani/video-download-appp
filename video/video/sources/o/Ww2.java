package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

@InterfaceC7542kW0
@InterfaceC5880dj0
@InterfaceC8303na2({"SMAP\nUByteArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UByteArray.kt\nkotlin/UByteArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n1740#2,3:83\n*S KotlinDebug\n*F\n+ 1 UByteArray.kt\nkotlin/UByteArray\n*L\n58#1:83,3\n*E\n"})
@InterfaceC6480g82(version = "1.3")
/* loaded from: classes3.dex */
public final class Ww2 implements Collection<Vw2>, GW0 {
    @NotNull
    public final byte[] X;

    /* loaded from: classes3.dex */
    public static final class a implements Iterator<Vw2>, GW0 {
        @NotNull
        public final byte[] X;
        public int Y;

        public a(@NotNull byte[] bArr) {
            C6562gT0.p(bArr, "array");
            this.X = bArr;
        }

        public byte b() {
            int i = this.Y;
            byte[] bArr = this.X;
            if (i < bArr.length) {
                this.Y = i + 1;
                return Vw2.n(bArr[i]);
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
        public /* bridge */ /* synthetic */ Vw2 next() {
            return Vw2.g(b());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @HK1
    public /* synthetic */ Ww2(byte[] bArr) {
        this.X = bArr;
    }

    public static int B(byte[] bArr) {
        return bArr.length;
    }

    public static int F(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    public static boolean G(byte[] bArr) {
        if (bArr.length == 0) {
            return true;
        }
        return false;
    }

    @NotNull
    public static Iterator<Vw2> H(byte[] bArr) {
        return new a(bArr);
    }

    public static final void J(byte[] bArr, int i, byte b) {
        bArr[i] = b;
    }

    public static String K(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }

    public static final /* synthetic */ Ww2 e(byte[] bArr) {
        return new Ww2(bArr);
    }

    @NotNull
    public static byte[] f(int i) {
        return h(new byte[i]);
    }

    @HK1
    @NotNull
    public static byte[] h(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "storage");
        return bArr;
    }

    public static boolean j(byte[] bArr, byte b) {
        return C7330jf.v8(bArr, b);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean k(byte[] bArr, @NotNull Collection<Vw2> collection) {
        C6562gT0.p(collection, "elements");
        Collection<Vw2> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof Vw2) || !C7330jf.v8(bArr, ((Vw2) obj).n0())) {
                return false;
            }
            while (r4.hasNext()) {
            }
        }
        return true;
    }

    public static boolean l(byte[] bArr, Object obj) {
        if (!(obj instanceof Ww2) || !C6562gT0.g(bArr, ((Ww2) obj).L())) {
            return false;
        }
        return true;
    }

    public static final boolean p(byte[] bArr, byte[] bArr2) {
        return C6562gT0.g(bArr, bArr2);
    }

    public static final byte r(byte[] bArr, int i) {
        return Vw2.n(bArr[i]);
    }

    public final /* synthetic */ byte[] L() {
        return this.X;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Vw2 vw2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends Vw2> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Vw2)) {
            return false;
        }
        return i(((Vw2) obj).n0());
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<?> collection) {
        C6562gT0.p(collection, "elements");
        return k(this.X, collection);
    }

    public boolean d(byte b) {
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

    public boolean i(byte b) {
        return j(this.X, b);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return G(this.X);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<Vw2> iterator() {
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
