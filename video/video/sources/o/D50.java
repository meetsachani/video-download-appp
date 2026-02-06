package o;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.regex.Pattern;

@InterfaceC5116aa0
@InterfaceC10420wF0(emulated = true)
/* loaded from: classes3.dex */
public final class D50 extends E50 {
    public static final int a = 8;
    @InterfaceC11149zF0
    public static final Pattern b = i();

    @InterfaceC10420wF0
    /* loaded from: classes3.dex */
    public static class a extends AbstractList<Double> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        public final double[] X;
        public final int Y;
        public final int Z;

        public a(double[] dArr) {
            this(dArr, 0, dArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@MB Object obj) {
            if ((obj instanceof Double) && D50.l(this.X, ((Double) obj).doubleValue(), this.Y, this.Z) != -1) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: d */
        public Double get(int i) {
            C10664xF1.C(i, size());
            return Double.valueOf(this.X[this.Y + i]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: e */
        public Double set(int i, Double d) {
            C10664xF1.C(i, size());
            double[] dArr = this.X;
            int i2 = this.Y;
            double d2 = dArr[i2 + i];
            dArr[i2 + i] = ((Double) C10664xF1.E(d)).doubleValue();
            return Double.valueOf(d2);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@MB Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                int size = size();
                if (aVar.size() != size) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (this.X[this.Y + i] != aVar.X[aVar.Y + i]) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(obj);
        }

        public double[] f() {
            return Arrays.copyOfRange(this.X, this.Y, this.Z);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i = 1;
            for (int i2 = this.Y; i2 < this.Z; i2++) {
                i = (i * 31) + D50.j(this.X[i2]);
            }
            return i;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@MB Object obj) {
            int l;
            if ((obj instanceof Double) && (l = D50.l(this.X, ((Double) obj).doubleValue(), this.Y, this.Z)) >= 0) {
                return l - this.Y;
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@MB Object obj) {
            int q;
            if ((obj instanceof Double) && (q = D50.q(this.X, ((Double) obj).doubleValue(), this.Y, this.Z)) >= 0) {
                return q - this.Y;
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.Z - this.Y;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Double> subList(int i, int i2) {
            C10664xF1.f0(i, i2, size());
            if (i == i2) {
                return Collections.EMPTY_LIST;
            }
            double[] dArr = this.X;
            int i3 = this.Y;
            return new a(dArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 12);
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

        public a(double[] dArr, int i, int i2) {
            this.X = dArr;
            this.Y = i;
            this.Z = i2;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends AbstractC7264jN<String, Double> implements Serializable {
        public static final b Z = new b();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return Z;
        }

        @Override // o.AbstractC7264jN
        /* renamed from: o */
        public String g(Double d) {
            return d.toString();
        }

        @Override // o.AbstractC7264jN
        /* renamed from: p */
        public Double h(String str) {
            return Double.valueOf(str);
        }

        public String toString() {
            return "Doubles.stringConverter()";
        }
    }

    /* loaded from: classes3.dex */
    public enum c implements Comparator<double[]> {
        INSTANCE;

        @Override // java.util.Comparator
        /* renamed from: g */
        public int compare(double[] dArr, double[] dArr2) {
            int min = Math.min(dArr.length, dArr2.length);
            for (int i = 0; i < min; i++) {
                int compare = Double.compare(dArr[i], dArr2[i]);
                if (compare != 0) {
                    return compare;
                }
            }
            return dArr.length - dArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Doubles.lexicographicalComparator()";
        }
    }

    @MB
    @InterfaceC11149zF0
    @InterfaceC4238Sm
    public static Double A(String str) {
        if (b.matcher(str).matches()) {
            try {
                return Double.valueOf(Double.parseDouble(str));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    public static List<Double> c(double... dArr) {
        if (dArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        return new a(dArr);
    }

    public static int d(double d, double d2) {
        return Double.compare(d, d2);
    }

    public static double[] e(double[]... dArr) {
        int i = 0;
        for (double[] dArr2 : dArr) {
            i += dArr2.length;
        }
        double[] dArr3 = new double[i];
        int i2 = 0;
        for (double[] dArr4 : dArr) {
            System.arraycopy(dArr4, 0, dArr3, i2, dArr4.length);
            i2 += dArr4.length;
        }
        return dArr3;
    }

    @InterfaceC4238Sm
    public static double f(double d, double d2, double d3) {
        if (d2 <= d3) {
            return Math.min(Math.max(d, d2), d3);
        }
        throw new IllegalArgumentException(C6108ef2.e("min (%s) must be less than or equal to max (%s)", Double.valueOf(d2), Double.valueOf(d3)));
    }

    public static boolean g(double[] dArr, double d) {
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            if (dArr[i] == d) {
                return true;
            }
        }
        return false;
    }

    public static double[] h(double[] dArr, int i, int i2) {
        boolean z;
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.k(z, "Invalid minLength: %s", i);
        if (i2 >= 0) {
            z2 = true;
        }
        C10664xF1.k(z2, "Invalid padding: %s", i2);
        if (dArr.length < i) {
            return Arrays.copyOf(dArr, i + i2);
        }
        return dArr;
    }

    @InterfaceC11149zF0
    public static Pattern i() {
        String concat = "(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)".concat("(?:[eE][+-]?\\d+#)?[fFdD]?");
        StringBuilder sb = new StringBuilder("(?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)".length() + 25);
        sb.append("0[xX]");
        sb.append("(?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)");
        sb.append("[pP][+-]?\\d+#[fFdD]?");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(String.valueOf(concat).length() + 23 + String.valueOf(sb2).length());
        sb3.append("[+-]?(?:NaN|Infinity|");
        sb3.append(concat);
        sb3.append("|");
        sb3.append(sb2);
        sb3.append(C9811tl1.d);
        return Pattern.compile(sb3.toString().replace("#", C2555Bk.p1));
    }

    public static int j(double d) {
        return Double.valueOf(d).hashCode();
    }

    public static int k(double[] dArr, double d) {
        return l(dArr, d, 0, dArr.length);
    }

    public static int l(double[] dArr, double d, int i, int i2) {
        while (i < i2) {
            if (dArr[i] == d) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m(double[] dArr, double[] dArr2) {
        C10664xF1.F(dArr, "array");
        C10664xF1.F(dArr2, "target");
        if (dArr2.length == 0) {
            return 0;
        }
        int i = 0;
        while (i < (dArr.length - dArr2.length) + 1) {
            for (int i2 = 0; i2 < dArr2.length; i2++) {
                if (dArr[i + i2] != dArr2[i2]) {
                    break;
                }
            }
            return i;
        }
        return -1;
    }

    public static boolean n(double d) {
        if (Double.NEGATIVE_INFINITY < d && d < Double.POSITIVE_INFINITY) {
            return true;
        }
        return false;
    }

    public static String o(String str, double... dArr) {
        C10664xF1.E(str);
        if (dArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(dArr.length * 12);
        sb.append(dArr[0]);
        for (int i = 1; i < dArr.length; i++) {
            sb.append(str);
            sb.append(dArr[i]);
        }
        return sb.toString();
    }

    public static int p(double[] dArr, double d) {
        return q(dArr, d, 0, dArr.length);
    }

    public static int q(double[] dArr, double d, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (dArr[i3] == d) {
                return i3;
            }
        }
        return -1;
    }

    public static Comparator<double[]> r() {
        return c.INSTANCE;
    }

    @InterfaceC11149zF0("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static double s(double... dArr) {
        boolean z;
        if (dArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.d(z);
        double d = dArr[0];
        for (int i = 1; i < dArr.length; i++) {
            d = Math.max(d, dArr[i]);
        }
        return d;
    }

    @InterfaceC11149zF0("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static double t(double... dArr) {
        boolean z;
        if (dArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.d(z);
        double d = dArr[0];
        for (int i = 1; i < dArr.length; i++) {
            d = Math.min(d, dArr[i]);
        }
        return d;
    }

    public static void u(double[] dArr) {
        C10664xF1.E(dArr);
        v(dArr, 0, dArr.length);
    }

    public static void v(double[] dArr, int i, int i2) {
        C10664xF1.E(dArr);
        C10664xF1.f0(i, i2, dArr.length);
        for (int i3 = i2 - 1; i < i3; i3--) {
            double d = dArr[i];
            dArr[i] = dArr[i3];
            dArr[i3] = d;
            i++;
        }
    }

    public static void w(double[] dArr) {
        C10664xF1.E(dArr);
        x(dArr, 0, dArr.length);
    }

    public static void x(double[] dArr, int i, int i2) {
        C10664xF1.E(dArr);
        C10664xF1.f0(i, i2, dArr.length);
        Arrays.sort(dArr, i, i2);
        v(dArr, i, i2);
    }

    @InterfaceC4238Sm
    public static AbstractC7264jN<String, Double> y() {
        return b.Z;
    }

    public static double[] z(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).f();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = ((Number) C10664xF1.E(array[i])).doubleValue();
        }
        return dArr;
    }
}
