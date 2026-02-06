package o;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

@InterfaceC5116aa0
@InterfaceC10420wF0(emulated = true)
/* renamed from: o.lT0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7775lT0 extends AbstractC8036mT0 {
    public static final int a = 4;
    public static final int b = 1073741824;

    @InterfaceC10420wF0
    /* renamed from: o.lT0$a */
    /* loaded from: classes3.dex */
    public static class a extends AbstractList<Integer> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        public final int[] X;
        public final int Y;
        public final int Z;

        public a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@MB Object obj) {
            if ((obj instanceof Integer) && C7775lT0.n(this.X, ((Integer) obj).intValue(), this.Y, this.Z) != -1) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: d */
        public Integer get(int i) {
            C10664xF1.C(i, size());
            return Integer.valueOf(this.X[this.Y + i]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: e */
        public Integer set(int i, Integer num) {
            C10664xF1.C(i, size());
            int[] iArr = this.X;
            int i2 = this.Y;
            int i3 = iArr[i2 + i];
            iArr[i2 + i] = ((Integer) C10664xF1.E(num)).intValue();
            return Integer.valueOf(i3);
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

        public int[] f() {
            return Arrays.copyOfRange(this.X, this.Y, this.Z);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i = 1;
            for (int i2 = this.Y; i2 < this.Z; i2++) {
                i = (i * 31) + C7775lT0.l(this.X[i2]);
            }
            return i;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@MB Object obj) {
            int n;
            if ((obj instanceof Integer) && (n = C7775lT0.n(this.X, ((Integer) obj).intValue(), this.Y, this.Z)) >= 0) {
                return n - this.Y;
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@MB Object obj) {
            int r;
            if ((obj instanceof Integer) && (r = C7775lT0.r(this.X, ((Integer) obj).intValue(), this.Y, this.Z)) >= 0) {
                return r - this.Y;
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.Z - this.Y;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i, int i2) {
            C10664xF1.f0(i, i2, size());
            if (i == i2) {
                return Collections.EMPTY_LIST;
            }
            int[] iArr = this.X;
            int i3 = this.Y;
            return new a(iArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
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

        public a(int[] iArr, int i, int i2) {
            this.X = iArr;
            this.Y = i;
            this.Z = i2;
        }
    }

    /* renamed from: o.lT0$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC7264jN<String, Integer> implements Serializable {
        public static final b Z = new b();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return Z;
        }

        @Override // o.AbstractC7264jN
        /* renamed from: o */
        public String g(Integer num) {
            return num.toString();
        }

        @Override // o.AbstractC7264jN
        /* renamed from: p */
        public Integer h(String str) {
            return Integer.decode(str);
        }

        public String toString() {
            return "Ints.stringConverter()";
        }
    }

    /* renamed from: o.lT0$c */
    /* loaded from: classes3.dex */
    public enum c implements Comparator<int[]> {
        INSTANCE;

        @Override // java.util.Comparator
        /* renamed from: g */
        public int compare(int[] iArr, int[] iArr2) {
            int min = Math.min(iArr.length, iArr2.length);
            for (int i = 0; i < min; i++) {
                int e = C7775lT0.e(iArr[i], iArr2[i]);
                if (e != 0) {
                    return e;
                }
            }
            return iArr.length - iArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Ints.lexicographicalComparator()";
        }
    }

    @InterfaceC4238Sm
    public static AbstractC7264jN<String, Integer> A() {
        return b.Z;
    }

    public static int[] B(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).f();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = ((Number) C10664xF1.E(array[i])).intValue();
        }
        return iArr;
    }

    public static byte[] C(int i) {
        return new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }

    @MB
    @InterfaceC4238Sm
    public static Integer D(String str) {
        return E(str, 10);
    }

    @MB
    @InterfaceC4238Sm
    public static Integer E(String str, int i) {
        Long C = C7194j51.C(str, i);
        if (C != null && C.longValue() == C.intValue()) {
            return Integer.valueOf(C.intValue());
        }
        return null;
    }

    public static List<Integer> c(int... iArr) {
        if (iArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        return new a(iArr);
    }

    public static int d(long j) {
        boolean z;
        int i = (int) j;
        if (i == j) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.p(z, "Out of range: %s", j);
        return i;
    }

    public static int e(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        return 0;
    }

    public static int[] f(int[]... iArr) {
        int i = 0;
        for (int[] iArr2 : iArr) {
            i += iArr2.length;
        }
        int[] iArr3 = new int[i];
        int i2 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, i2, iArr4.length);
            i2 += iArr4.length;
        }
        return iArr3;
    }

    @InterfaceC4238Sm
    public static int g(int i, int i2, int i3) {
        boolean z;
        if (i2 <= i3) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.m(z, "min (%s) must be less than or equal to max (%s)", i2, i3);
        return Math.min(Math.max(i, i2), i3);
    }

    public static boolean h(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static int[] i(int[] iArr, int i, int i2) {
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
        if (iArr.length < i) {
            return Arrays.copyOf(iArr, i + i2);
        }
        return iArr;
    }

    public static int j(byte[] bArr) {
        boolean z;
        if (bArr.length >= 4) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.m(z, "array too small: %s < %s", bArr.length, 4);
        return k(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int k(byte b2, byte b3, byte b4, byte b5) {
        return (b2 << C8077mf.B) | ((b3 & 255) << 16) | ((b4 & 255) << 8) | (b5 & 255);
    }

    public static int m(int[] iArr, int i) {
        return n(iArr, i, 0, iArr.length);
    }

    public static int n(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int o(int[] iArr, int[] iArr2) {
        C10664xF1.F(iArr, "array");
        C10664xF1.F(iArr2, "target");
        if (iArr2.length == 0) {
            return 0;
        }
        int i = 0;
        while (i < (iArr.length - iArr2.length) + 1) {
            for (int i2 = 0; i2 < iArr2.length; i2++) {
                if (iArr[i + i2] != iArr2[i2]) {
                    break;
                }
            }
            return i;
        }
        return -1;
    }

    public static String p(String str, int... iArr) {
        C10664xF1.E(str);
        if (iArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(iArr.length * 5);
        sb.append(iArr[0]);
        for (int i = 1; i < iArr.length; i++) {
            sb.append(str);
            sb.append(iArr[i]);
        }
        return sb.toString();
    }

    public static int q(int[] iArr, int i) {
        return r(iArr, i, 0, iArr.length);
    }

    public static int r(int[] iArr, int i, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            if (iArr[i4] == i) {
                return i4;
            }
        }
        return -1;
    }

    public static Comparator<int[]> s() {
        return c.INSTANCE;
    }

    @InterfaceC11149zF0("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static int t(int... iArr) {
        boolean z;
        if (iArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.d(z);
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            if (i3 > i) {
                i = i3;
            }
        }
        return i;
    }

    @InterfaceC11149zF0("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static int u(int... iArr) {
        boolean z;
        if (iArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.d(z);
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            if (i3 < i) {
                i = i3;
            }
        }
        return i;
    }

    public static void v(int[] iArr) {
        C10664xF1.E(iArr);
        w(iArr, 0, iArr.length);
    }

    public static void w(int[] iArr, int i, int i2) {
        C10664xF1.E(iArr);
        C10664xF1.f0(i, i2, iArr.length);
        for (int i3 = i2 - 1; i < i3; i3--) {
            int i4 = iArr[i];
            iArr[i] = iArr[i3];
            iArr[i3] = i4;
            i++;
        }
    }

    public static int x(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static void y(int[] iArr) {
        C10664xF1.E(iArr);
        z(iArr, 0, iArr.length);
    }

    public static void z(int[] iArr, int i, int i2) {
        C10664xF1.E(iArr);
        C10664xF1.f0(i, i2, iArr.length);
        Arrays.sort(iArr, i, i2);
        w(iArr, i, i2);
    }

    public static int l(int i) {
        return i;
    }
}
