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
/* loaded from: classes3.dex */
public final class UN0 implements Serializable {
    public static final UN0 Y0 = new UN0(new double[0]);
    public final double[] X;
    public final transient int Y;
    public final int Z;

    /* loaded from: classes3.dex */
    public static class b extends AbstractList<Double> implements RandomAccess, Serializable {
        public final UN0 X;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@MB Object obj) {
            if (indexOf(obj) >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: d */
        public Double get(int i) {
            return Double.valueOf(this.X.m(i));
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
                    if (obj2 instanceof Double) {
                        int i2 = i + 1;
                        if (UN0.e(this.X.X[i], ((Double) obj2).doubleValue())) {
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
            if (obj instanceof Double) {
                return this.X.n(((Double) obj).doubleValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@MB Object obj) {
            if (obj instanceof Double) {
                return this.X.q(((Double) obj).doubleValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.X.r();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Double> subList(int i, int i2) {
            return this.X.A(i, i2).f();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.X.toString();
        }

        public b(UN0 un0) {
            this.X = un0;
        }
    }

    @InterfaceC6181ey
    /* loaded from: classes3.dex */
    public static final class c {
        public double[] a;
        public int b = 0;

        public c(int i) {
            this.a = new double[i];
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

        public c a(double d) {
            g(1);
            double[] dArr = this.a;
            int i = this.b;
            dArr[i] = d;
            this.b = i + 1;
            return this;
        }

        public c b(Iterable<Double> iterable) {
            if (iterable instanceof Collection) {
                return c((Collection) iterable);
            }
            for (Double d : iterable) {
                a(d.doubleValue());
            }
            return this;
        }

        public c c(Collection<Double> collection) {
            g(collection.size());
            for (Double d : collection) {
                double[] dArr = this.a;
                int i = this.b;
                this.b = i + 1;
                dArr[i] = d.doubleValue();
            }
            return this;
        }

        public c d(UN0 un0) {
            g(un0.r());
            System.arraycopy(un0.X, un0.Y, this.a, this.b, un0.r());
            this.b += un0.r();
            return this;
        }

        public c e(double[] dArr) {
            g(dArr.length);
            System.arraycopy(dArr, 0, this.a, this.b, dArr.length);
            this.b += dArr.length;
            return this;
        }

        @QB
        public UN0 f() {
            if (this.b == 0) {
                return UN0.Y0;
            }
            return new UN0(this.a, 0, this.b);
        }

        public final void g(int i) {
            int i2 = this.b + i;
            double[] dArr = this.a;
            if (i2 > dArr.length) {
                this.a = Arrays.copyOf(dArr, h(dArr.length, i2));
            }
        }
    }

    public static boolean e(double d, double d2) {
        if (Double.doubleToLongBits(d) == Double.doubleToLongBits(d2)) {
            return true;
        }
        return false;
    }

    public static c g() {
        return new c(10);
    }

    public static c h(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.k(z, "Invalid initialCapacity: %s", i);
        return new c(i);
    }

    public static UN0 j(Iterable<Double> iterable) {
        if (iterable instanceof Collection) {
            return k((Collection) iterable);
        }
        return g().b(iterable).f();
    }

    public static UN0 k(Collection<Double> collection) {
        if (collection.isEmpty()) {
            return Y0;
        }
        return new UN0(D50.z(collection));
    }

    public static UN0 l(double[] dArr) {
        if (dArr.length == 0) {
            return Y0;
        }
        return new UN0(Arrays.copyOf(dArr, dArr.length));
    }

    public static UN0 s() {
        return Y0;
    }

    public static UN0 t(double d) {
        return new UN0(new double[]{d});
    }

    public static UN0 u(double d, double d2) {
        return new UN0(new double[]{d, d2});
    }

    public static UN0 v(double d, double d2, double d3) {
        return new UN0(new double[]{d, d2, d3});
    }

    public static UN0 w(double d, double d2, double d3, double d4) {
        return new UN0(new double[]{d, d2, d3, d4});
    }

    public static UN0 x(double d, double d2, double d3, double d4, double d5) {
        return new UN0(new double[]{d, d2, d3, d4, d5});
    }

    public static UN0 y(double d, double d2, double d3, double d4, double d5, double d6) {
        return new UN0(new double[]{d, d2, d3, d4, d5, d6});
    }

    public static UN0 z(double d, double... dArr) {
        boolean z;
        if (dArr.length <= 2147483646) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.e(z, "the total number of elements must fit in an int");
        double[] dArr2 = new double[dArr.length + 1];
        dArr2[0] = d;
        System.arraycopy(dArr, 0, dArr2, 1, dArr.length);
        return new UN0(dArr2);
    }

    public UN0 A(int i, int i2) {
        C10664xF1.f0(i, i2, r());
        if (i == i2) {
            return Y0;
        }
        double[] dArr = this.X;
        int i3 = this.Y;
        return new UN0(dArr, i + i3, i3 + i2);
    }

    public double[] B() {
        return Arrays.copyOfRange(this.X, this.Y, this.Z);
    }

    public UN0 C() {
        if (p()) {
            return new UN0(B());
        }
        return this;
    }

    public boolean equals(@MB Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UN0)) {
            return false;
        }
        UN0 un0 = (UN0) obj;
        if (r() != un0.r()) {
            return false;
        }
        for (int i = 0; i < r(); i++) {
            if (!e(m(i), un0.m(i))) {
                return false;
            }
        }
        return true;
    }

    public List<Double> f() {
        return new b();
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = this.Y; i2 < this.Z; i2++) {
            i = (i * 31) + D50.j(this.X[i2]);
        }
        return i;
    }

    public boolean i(double d) {
        if (n(d) >= 0) {
            return true;
        }
        return false;
    }

    public double m(int i) {
        C10664xF1.C(i, r());
        return this.X[this.Y + i];
    }

    public int n(double d) {
        for (int i = this.Y; i < this.Z; i++) {
            if (e(this.X[i], d)) {
                return i - this.Y;
            }
        }
        return -1;
    }

    public boolean o() {
        if (this.Z == this.Y) {
            return true;
        }
        return false;
    }

    public final boolean p() {
        if (this.Y <= 0 && this.Z >= this.X.length) {
            return false;
        }
        return true;
    }

    public int q(double d) {
        int i = this.Z;
        while (true) {
            i--;
            if (i >= this.Y) {
                if (e(this.X[i], d)) {
                    return i - this.Y;
                }
            } else {
                return -1;
            }
        }
    }

    public int r() {
        return this.Z - this.Y;
    }

    public Object readResolve() {
        if (o()) {
            return Y0;
        }
        return this;
    }

    public String toString() {
        if (o()) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder(r() * 5);
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
        return C();
    }

    public UN0(double[] dArr) {
        this(dArr, 0, dArr.length);
    }

    public UN0(double[] dArr, int i, int i2) {
        this.X = dArr;
        this.Y = i;
        this.Z = i2;
    }
}
