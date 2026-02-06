package o;

import com.facebook.internal.H;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n204#1:208\n204#1:209\n204#1:210\n1#2:207\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n106#1:208\n175#1:209\n188#1:210\n*E\n"})
/* loaded from: classes3.dex */
public final class OU1<T> extends AbstractC8896q1<T> implements RandomAccess {
    public final int Y0;
    @NotNull
    public final Object[] Z;
    public int Z0;
    public int a1;

    @InterfaceC8303na2({"SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer$iterator$1\n+ 2 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n1#1,206:1\n204#2:207\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer$iterator$1\n*L\n121#1:207\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC6692h1<T> {
        public int Y0;
        public int Z;
        public final /* synthetic */ OU1<T> Z0;

        public a(OU1<T> ou1) {
            this.Z0 = ou1;
            this.Z = ou1.size();
            this.Y0 = ou1.Z0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.AbstractC6692h1
        public void b() {
            if (this.Z == 0) {
                c();
                return;
            }
            d(this.Z0.Z[this.Y0]);
            this.Y0 = (this.Y0 + 1) % this.Z0.Y0;
            this.Z--;
        }
    }

    public OU1(@NotNull Object[] objArr, int i) {
        C6562gT0.p(objArr, H.a.b);
        this.Z = objArr;
        if (i >= 0) {
            if (i <= objArr.length) {
                this.Y0 = objArr.length;
                this.a1 = i;
                return;
            }
            throw new IllegalArgumentException(("ring buffer filled size: " + i + " cannot be larger than the buffer size: " + objArr.length).toString());
        }
        throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i).toString());
    }

    @Override // o.AbstractC8896q1, o.AbstractC7901m0
    public int e() {
        return this.a1;
    }

    @Override // o.AbstractC8896q1, java.util.List
    public T get(int i) {
        AbstractC8896q1.X.b(i, size());
        return (T) this.Z[(this.Z0 + i) % this.Y0];
    }

    @Override // o.AbstractC8896q1, o.AbstractC7901m0, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<T> iterator() {
        return new a(this);
    }

    public final void k(T t) {
        if (!s()) {
            this.Z[(this.Z0 + size()) % this.Y0] = t;
            this.a1 = size() + 1;
            return;
        }
        throw new IllegalStateException("ring buffer is full");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final OU1<T> l(int i) {
        Object[] array;
        int i2 = this.Y0;
        int B = C5075aO1.B(i2 + (i2 >> 1) + 1, i);
        if (this.Z0 == 0) {
            array = Arrays.copyOf(this.Z, B);
            C6562gT0.o(array, "copyOf(...)");
        } else {
            array = toArray(new Object[B]);
        }
        return new OU1<>(array, size());
    }

    public final int p(int i, int i2) {
        return (i + i2) % this.Y0;
    }

    public final void r(int i) {
        if (i >= 0) {
            if (i <= size()) {
                if (i > 0) {
                    int i2 = this.Z0;
                    int i3 = (i2 + i) % this.Y0;
                    if (i2 > i3) {
                        C4788Ye.M1(this.Z, null, i2, this.Y0);
                        C4788Ye.M1(this.Z, null, 0, i3);
                    } else {
                        C4788Ye.M1(this.Z, null, i2, i3);
                    }
                    this.Z0 = i3;
                    this.a1 = size() - i;
                    return;
                }
                return;
            }
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i + ", size = " + size()).toString());
        }
        throw new IllegalArgumentException(("n shouldn't be negative but it is " + i).toString());
    }

    public final boolean s() {
        if (size() == this.Y0) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC7901m0, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] tArr) {
        C6562gT0.p(tArr, "array");
        int length = tArr.length;
        T[] tArr2 = tArr;
        if (length < size()) {
            T[] tArr3 = (T[]) Arrays.copyOf(tArr, size());
            C6562gT0.o(tArr3, "copyOf(...)");
            tArr2 = tArr3;
        }
        int size = size();
        int i = 0;
        int i2 = 0;
        for (int i3 = this.Z0; i2 < size && i3 < this.Y0; i3++) {
            tArr2[i2] = this.Z[i3];
            i2++;
        }
        while (i2 < size) {
            tArr2[i2] = this.Z[i];
            i2++;
            i++;
        }
        return (T[]) C7979mF.n(size, tArr2);
    }

    public OU1(int i) {
        this(new Object[i], 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC7901m0, java.util.Collection, java.util.List
    @NotNull
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
