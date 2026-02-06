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
/* renamed from: o.dO0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5802dO0 implements Serializable {
    public static final C5802dO0 Y0 = new C5802dO0(new long[0]);
    public final long[] X;
    public final transient int Y;
    public final int Z;

    /* renamed from: o.dO0$b */
    /* loaded from: classes3.dex */
    public static class b extends AbstractList<Long> implements RandomAccess, Serializable {
        public final C5802dO0 X;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@MB Object obj) {
            if (indexOf(obj) >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: d */
        public Long get(int i) {
            return Long.valueOf(this.X.k(i));
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
                    if (obj2 instanceof Long) {
                        int i2 = i + 1;
                        if (this.X.X[i] == ((Long) obj2).longValue()) {
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
            if (obj instanceof Long) {
                return this.X.l(((Long) obj).longValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@MB Object obj) {
            if (obj instanceof Long) {
                return this.X.o(((Long) obj).longValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.X.p();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int i, int i2) {
            return this.X.y(i, i2).d();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.X.toString();
        }

        public b(C5802dO0 c5802dO0) {
            this.X = c5802dO0;
        }
    }

    @InterfaceC6181ey
    /* renamed from: o.dO0$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public long[] a;
        public int b = 0;

        public c(int i) {
            this.a = new long[i];
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

        public c a(long j) {
            g(1);
            long[] jArr = this.a;
            int i = this.b;
            jArr[i] = j;
            this.b = i + 1;
            return this;
        }

        public c b(Iterable<Long> iterable) {
            if (iterable instanceof Collection) {
                return c((Collection) iterable);
            }
            for (Long l : iterable) {
                a(l.longValue());
            }
            return this;
        }

        public c c(Collection<Long> collection) {
            g(collection.size());
            for (Long l : collection) {
                long[] jArr = this.a;
                int i = this.b;
                this.b = i + 1;
                jArr[i] = l.longValue();
            }
            return this;
        }

        public c d(C5802dO0 c5802dO0) {
            g(c5802dO0.p());
            System.arraycopy(c5802dO0.X, c5802dO0.Y, this.a, this.b, c5802dO0.p());
            this.b += c5802dO0.p();
            return this;
        }

        public c e(long[] jArr) {
            g(jArr.length);
            System.arraycopy(jArr, 0, this.a, this.b, jArr.length);
            this.b += jArr.length;
            return this;
        }

        @QB
        public C5802dO0 f() {
            if (this.b == 0) {
                return C5802dO0.Y0;
            }
            return new C5802dO0(this.a, 0, this.b);
        }

        public final void g(int i) {
            int i2 = this.b + i;
            long[] jArr = this.a;
            if (i2 > jArr.length) {
                this.a = Arrays.copyOf(jArr, h(jArr.length, i2));
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

    public static C5802dO0 h(Iterable<Long> iterable) {
        if (iterable instanceof Collection) {
            return i((Collection) iterable);
        }
        return e().b(iterable).f();
    }

    public static C5802dO0 i(Collection<Long> collection) {
        if (collection.isEmpty()) {
            return Y0;
        }
        return new C5802dO0(C7194j51.z(collection));
    }

    public static C5802dO0 j(long[] jArr) {
        if (jArr.length == 0) {
            return Y0;
        }
        return new C5802dO0(Arrays.copyOf(jArr, jArr.length));
    }

    public static C5802dO0 q() {
        return Y0;
    }

    public static C5802dO0 r(long j) {
        return new C5802dO0(new long[]{j});
    }

    public static C5802dO0 s(long j, long j2) {
        return new C5802dO0(new long[]{j, j2});
    }

    public static C5802dO0 t(long j, long j2, long j3) {
        return new C5802dO0(new long[]{j, j2, j3});
    }

    public static C5802dO0 u(long j, long j2, long j3, long j4) {
        return new C5802dO0(new long[]{j, j2, j3, j4});
    }

    public static C5802dO0 v(long j, long j2, long j3, long j4, long j5) {
        return new C5802dO0(new long[]{j, j2, j3, j4, j5});
    }

    public static C5802dO0 w(long j, long j2, long j3, long j4, long j5, long j6) {
        return new C5802dO0(new long[]{j, j2, j3, j4, j5, j6});
    }

    public static C5802dO0 x(long j, long... jArr) {
        boolean z;
        if (jArr.length <= 2147483646) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.e(z, "the total number of elements must fit in an int");
        long[] jArr2 = new long[jArr.length + 1];
        jArr2[0] = j;
        System.arraycopy(jArr, 0, jArr2, 1, jArr.length);
        return new C5802dO0(jArr2);
    }

    public C5802dO0 A() {
        if (n()) {
            return new C5802dO0(z());
        }
        return this;
    }

    public List<Long> d() {
        return new b();
    }

    public boolean equals(@MB Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5802dO0)) {
            return false;
        }
        C5802dO0 c5802dO0 = (C5802dO0) obj;
        if (p() != c5802dO0.p()) {
            return false;
        }
        for (int i = 0; i < p(); i++) {
            if (k(i) != c5802dO0.k(i)) {
                return false;
            }
        }
        return true;
    }

    public boolean g(long j) {
        if (l(j) >= 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = this.Y; i2 < this.Z; i2++) {
            i = (i * 31) + C7194j51.k(this.X[i2]);
        }
        return i;
    }

    public long k(int i) {
        C10664xF1.C(i, p());
        return this.X[this.Y + i];
    }

    public int l(long j) {
        for (int i = this.Y; i < this.Z; i++) {
            if (this.X[i] == j) {
                return i - this.Y;
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

    public int o(long j) {
        int i = this.Z;
        while (true) {
            i--;
            int i2 = this.Y;
            if (i >= i2) {
                if (this.X[i] == j) {
                    return i - i2;
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

    public C5802dO0 y(int i, int i2) {
        C10664xF1.f0(i, i2, p());
        if (i == i2) {
            return Y0;
        }
        long[] jArr = this.X;
        int i3 = this.Y;
        return new C5802dO0(jArr, i + i3, i3 + i2);
    }

    public long[] z() {
        return Arrays.copyOfRange(this.X, this.Y, this.Z);
    }

    public C5802dO0(long[] jArr) {
        this(jArr, 0, jArr.length);
    }

    public C5802dO0(long[] jArr, int i, int i2) {
        this.X = jArr;
        this.Y = i;
        this.Z = i2;
    }
}
