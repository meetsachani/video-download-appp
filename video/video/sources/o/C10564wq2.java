package o;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.wq2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10564wq2<T> {
    public final int a;
    public final Comparator<? super T> b;
    public final T[] c;
    public int d;
    @MB
    public T e;

    public C10564wq2(Comparator<? super T> comparator, int i) {
        boolean z;
        this.b = (Comparator) C10664xF1.F(comparator, "comparator");
        this.a = i;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.k(z, "k (%s) must be >= 0", i);
        C10664xF1.k(i <= 1073741823, "k (%s) must be <= Integer.MAX_VALUE / 2", i);
        this.c = (T[]) new Object[C9979uR0.d(i, 2)];
        this.d = 0;
        this.e = null;
    }

    public static <T extends Comparable<? super T>> C10564wq2<T> a(int i) {
        return b(i, AbstractC10587ww1.z());
    }

    public static <T> C10564wq2<T> b(int i, Comparator<? super T> comparator) {
        return new C10564wq2<>(AbstractC10587ww1.h(comparator).E(), i);
    }

    public static <T extends Comparable<? super T>> C10564wq2<T> c(int i) {
        return d(i, AbstractC10587ww1.z());
    }

    public static <T> C10564wq2<T> d(int i, Comparator<? super T> comparator) {
        return new C10564wq2<>(comparator, i);
    }

    public void e(@InterfaceC7894ly1 T t) {
        int i = this.a;
        if (i != 0) {
            int i2 = this.d;
            if (i2 == 0) {
                this.c[0] = t;
                this.e = t;
                this.d = 1;
            } else if (i2 < i) {
                T[] tArr = this.c;
                this.d = i2 + 1;
                tArr[i2] = t;
                if (this.b.compare(t, (Object) C2491As1.a(this.e)) > 0) {
                    this.e = t;
                }
            } else if (this.b.compare(t, (Object) C2491As1.a(this.e)) < 0) {
                T[] tArr2 = this.c;
                int i3 = this.d;
                int i4 = i3 + 1;
                this.d = i4;
                tArr2[i3] = t;
                if (i4 == this.a * 2) {
                    k();
                }
            }
        }
    }

    public void f(Iterable<? extends T> iterable) {
        g(iterable.iterator());
    }

    public void g(Iterator<? extends T> it) {
        while (it.hasNext()) {
            e(it.next());
        }
    }

    public final int h(int i, int i2, int i3) {
        Object a = C2491As1.a(this.c[i3]);
        T[] tArr = this.c;
        tArr[i3] = tArr[i2];
        int i4 = i;
        while (i < i2) {
            if (this.b.compare((Object) C2491As1.a(this.c[i]), a) < 0) {
                i(i4, i);
                i4++;
            }
            i++;
        }
        T[] tArr2 = this.c;
        tArr2[i2] = tArr2[i4];
        tArr2[i4] = a;
        return i4;
    }

    public final void i(int i, int i2) {
        T[] tArr = this.c;
        T t = tArr[i];
        tArr[i] = tArr[i2];
        tArr[i2] = t;
    }

    public List<T> j() {
        Arrays.sort(this.c, 0, this.d, this.b);
        int i = this.d;
        int i2 = this.a;
        if (i > i2) {
            T[] tArr = this.c;
            Arrays.fill(tArr, i2, tArr.length, (Object) null);
            int i3 = this.a;
            this.d = i3;
            this.e = this.c[i3 - 1];
        }
        return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(this.c, this.d)));
    }

    public final void k() {
        int i = (this.a * 2) - 1;
        int p = C9979uR0.p(i, RoundingMode.CEILING) * 3;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i2 < i) {
                int h = h(i2, i, ((i2 + i) + 1) >>> 1);
                int i5 = this.a;
                if (h > i5) {
                    i = h - 1;
                } else if (h >= i5) {
                    break;
                } else {
                    i2 = Math.max(h, i2 + 1);
                    i4 = h;
                }
                i3++;
                if (i3 >= p) {
                    Arrays.sort(this.c, i2, i + 1, this.b);
                    break;
                }
            } else {
                break;
            }
        }
        this.d = this.a;
        this.e = (T) C2491As1.a(this.c[i4]);
        while (true) {
            i4++;
            if (i4 < this.a) {
                if (this.b.compare((Object) C2491As1.a(this.c[i4]), (Object) C2491As1.a(this.e)) > 0) {
                    this.e = this.c[i4];
                }
            } else {
                return;
            }
        }
    }
}
