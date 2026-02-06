package o;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import okhttp3.HttpUrl;

@InterfaceC5116aa0
@NN0
@InterfaceC4238Sm
@InterfaceC10420wF0
/* renamed from: o.aO0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5074aO0 implements Serializable {
    public static final C5074aO0 Y0 = new C5074aO0(new int[0]);
    public final int[] X;
    public final transient int Y;
    public final int Z;

    /* renamed from: o.aO0$b */
    /* loaded from: classes3.dex */
    public static class b extends AbstractList<Integer> implements RandomAccess, Serializable {
        public final C5074aO0 X;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@MB Object obj) {
            if (indexOf(obj) >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: d */
        public Integer get(int i) {
            return Integer.valueOf(this.X.k(i));
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@MB Object obj) {
            if (obj instanceof b) {
                return this.X.equals(((b) obj).X);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (size() == list.size()) {
                int i = this.X.Y;
                for (Object obj2 : list) {
                    if (obj2 instanceof Integer) {
                        int i2 = i + 1;
                        if (this.X.X[i] == ((Integer) obj2).intValue()) {
                            i = i2;
                        }
                    }
                    return false;
                }
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.X.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@MB Object obj) {
            if (obj instanceof Integer) {
                return this.X.l(((Integer) obj).intValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@MB Object obj) {
            if (obj instanceof Integer) {
                return this.X.o(((Integer) obj).intValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.X.p();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i, int i2) {
            return this.X.y(i, i2).d();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.X.toString();
        }

        public b(C5074aO0 c5074aO0) {
            this.X = c5074aO0;
        }
    }

    @InterfaceC6181ey
    /* renamed from: o.aO0$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public int[] a;
        public int b = 0;

        public c(int i) {
            this.a = new int[i];
        }

        public static int h(int i, int i2) {
            if (i2 >= 0) {
                int i3 = i + (i >> 1) + 1;
                if (i3 < i2) {
                    i3 = Integer.highestOneBit(i2 - 1) << 1;
                }
                if (i3 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i3;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }

        public c a(int i) {
            g(1);
            int[] iArr = this.a;
            int i2 = this.b;
            iArr[i2] = i;
            this.b = i2 + 1;
            return this;
        }

        public c b(Iterable<Integer> iterable) {
            if (iterable instanceof Collection) {
                return c((Collection) iterable);
            }
            for (Integer num : iterable) {
                a(num.intValue());
            }
            return this;
        }

        public c c(Collection<Integer> collection) {
            g(collection.size());
            for (Integer num : collection) {
                int[] iArr = this.a;
                int i = this.b;
                this.b = i + 1;
                iArr[i] = num.intValue();
            }
            return this;
        }

        public c d(C5074aO0 c5074aO0) {
            g(c5074aO0.p());
            System.arraycopy(c5074aO0.X, c5074aO0.Y, this.a, this.b, c5074aO0.p());
            this.b += c5074aO0.p();
            return this;
        }

        public c e(int[] iArr) {
            g(iArr.length);
            System.arraycopy(iArr, 0, this.a, this.b, iArr.length);
            this.b += iArr.length;
            return this;
        }

        @QB
        public C5074aO0 f() {
            if (this.b == 0) {
                return C5074aO0.Y0;
            }
            return new C5074aO0(this.a, 0, this.b);
        }

        public final void g(int i) {
            int i2 = this.b + i;
            int[] iArr = this.a;
            if (i2 > iArr.length) {
                this.a = Arrays.copyOf(iArr, h(iArr.length, i2));
            }
        }
    }

    public static c e() {
        return new c(10);
    }

    public static c f(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.k(z, "Invalid initialCapacity: %s", i);
        return new c(i);
    }

    public static C5074aO0 h(Iterable<Integer> iterable) {
        if (iterable instanceof Collection) {
            return i((Collection) iterable);
        }
        return e().b(iterable).f();
    }

    public static C5074aO0 i(Collection<Integer> collection) {
        if (collection.isEmpty()) {
            return Y0;
        }
        return new C5074aO0(C7775lT0.B(collection));
    }

    public static C5074aO0 j(int[] iArr) {
        if (iArr.length == 0) {
            return Y0;
        }
        return new C5074aO0(Arrays.copyOf(iArr, iArr.length));
    }

    public static C5074aO0 q() {
        return Y0;
    }

    public static C5074aO0 r(int i) {
        return new C5074aO0(new int[]{i});
    }

    public static C5074aO0 s(int i, int i2) {
        return new C5074aO0(new int[]{i, i2});
    }

    public static C5074aO0 t(int i, int i2, int i3) {
        return new C5074aO0(new int[]{i, i2, i3});
    }

    public static C5074aO0 u(int i, int i2, int i3, int i4) {
        return new C5074aO0(new int[]{i, i2, i3, i4});
    }

    public static C5074aO0 v(int i, int i2, int i3, int i4, int i5) {
        return new C5074aO0(new int[]{i, i2, i3, i4, i5});
    }

    public static C5074aO0 w(int i, int i2, int i3, int i4, int i5, int i6) {
        return new C5074aO0(new int[]{i, i2, i3, i4, i5, i6});
    }

    public static C5074aO0 x(int i, int... iArr) {
        boolean z;
        if (iArr.length <= 2147483646) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.e(z, "the total number of elements must fit in an int");
        int[] iArr2 = new int[iArr.length + 1];
        iArr2[0] = i;
        System.arraycopy(iArr, 0, iArr2, 1, iArr.length);
        return new C5074aO0(iArr2);
    }

    public C5074aO0 A() {
        if (n()) {
            return new C5074aO0(z());
        }
        return this;
    }

    public List<Integer> d() {
        return new b();
    }

    public boolean equals(@MB Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5074aO0)) {
            return false;
        }
        C5074aO0 c5074aO0 = (C5074aO0) obj;
        if (p() != c5074aO0.p()) {
            return false;
        }
        for (int i = 0; i < p(); i++) {
            if (k(i) != c5074aO0.k(i)) {
                return false;
            }
        }
        return true;
    }

    public boolean g(int i) {
        if (l(i) >= 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = this.Y; i2 < this.Z; i2++) {
            i = (i * 31) + C7775lT0.l(this.X[i2]);
        }
        return i;
    }

    public int k(int i) {
        C10664xF1.C(i, p());
        return this.X[this.Y + i];
    }

    public int l(int i) {
        for (int i2 = this.Y; i2 < this.Z; i2++) {
            if (this.X[i2] == i) {
                return i2 - this.Y;
            }
        }
        return -1;
    }

    public boolean m() {
        if (this.Z == this.Y) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        if (this.Y <= 0 && this.Z >= this.X.length) {
            return false;
        }
        return true;
    }

    public int o(int i) {
        int i2 = this.Z;
        while (true) {
            i2--;
            int i3 = this.Y;
            if (i2 >= i3) {
                if (this.X[i2] == i) {
                    return i2 - i3;
                }
            } else {
                return -1;
            }
        }
    }

    public int p() {
        return this.Z - this.Y;
    }

    public Object readResolve() {
        if (m()) {
            return Y0;
        }
        return this;
    }

    public String toString() {
        if (m()) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder(p() * 5);
        sb.append('[');
        sb.append(this.X[this.Y]);
        int i = this.Y;
        while (true) {
            i++;
            if (i < this.Z) {
                sb.append(C6566gU0.h);
                sb.append(this.X[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }

    public Object writeReplace() {
        return A();
    }

    public C5074aO0 y(int i, int i2) {
        C10664xF1.f0(i, i2, p());
        if (i == i2) {
            return Y0;
        }
        int[] iArr = this.X;
        int i3 = this.Y;
        return new C5074aO0(iArr, i + i3, i3 + i2);
    }

    public int[] z() {
        return Arrays.copyOfRange(this.X, this.Y, this.Z);
    }

    public C5074aO0(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    public C5074aO0(int[] iArr, int i, int i2) {
        this.X = iArr;
        this.Y = i;
        this.Z = i2;
    }
}
