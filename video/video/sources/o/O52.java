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
/* loaded from: classes3.dex */
public final class O52 extends P52 {
    public static final int a = 2;
    public static final short b = 16384;

    /* loaded from: classes3.dex */
    public enum a implements Comparator<short[]> {
        INSTANCE;

        @Override // java.util.Comparator
        /* renamed from: g */
        public int compare(short[] sArr, short[] sArr2) {
            int min = Math.min(sArr.length, sArr2.length);
            for (int i = 0; i < min; i++) {
                int e = O52.e(sArr[i], sArr2[i]);
                if (e != 0) {
                    return e;
                }
            }
            return sArr.length - sArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Shorts.lexicographicalComparator()";
        }
    }

    @InterfaceC10420wF0
    /* loaded from: classes3.dex */
    public static class b extends AbstractList<Short> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        public final short[] X;
        public final int Y;
        public final int Z;

        public b(short[] sArr) {
            this(sArr, 0, sArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@MB Object obj) {
            if ((obj instanceof Short) && O52.n(this.X, ((Short) obj).shortValue(), this.Y, this.Z) != -1) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: d */
        public Short get(int i) {
            C10664xF1.C(i, size());
            return Short.valueOf(this.X[this.Y + i]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: e */
        public Short set(int i, Short sh) {
            C10664xF1.C(i, size());
            short[] sArr = this.X;
            int i2 = this.Y;
            short s = sArr[i2 + i];
            sArr[i2 + i] = ((Short) C10664xF1.E(sh)).shortValue();
            return Short.valueOf(s);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@MB Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                int size = size();
                if (bVar.size() != size) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (this.X[this.Y + i] != bVar.X[bVar.Y + i]) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(obj);
        }

        public short[] f() {
            return Arrays.copyOfRange(this.X, this.Y, this.Z);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i = 1;
            for (int i2 = this.Y; i2 < this.Z; i2++) {
                i = (i * 31) + O52.l(this.X[i2]);
            }
            return i;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@MB Object obj) {
            int n;
            if ((obj instanceof Short) && (n = O52.n(this.X, ((Short) obj).shortValue(), this.Y, this.Z)) >= 0) {
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
            if ((obj instanceof Short) && (r = O52.r(this.X, ((Short) obj).shortValue(), this.Y, this.Z)) >= 0) {
                return r - this.Y;
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.Z - this.Y;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Short> subList(int i, int i2) {
            C10664xF1.f0(i, i2, size());
            if (i == i2) {
                return Collections.EMPTY_LIST;
            }
            short[] sArr = this.X;
            int i3 = this.Y;
            return new b(sArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 6);
            sb.append('[');
            sb.append((int) this.X[this.Y]);
            int i = this.Y;
            while (true) {
                i++;
                if (i < this.Z) {
                    sb.append(C6566gU0.h);
                    sb.append((int) this.X[i]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }

        public b(short[] sArr, int i, int i2) {
            this.X = sArr;
            this.Y = i;
            this.Z = i2;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends AbstractC7264jN<String, Short> implements Serializable {
        public static final c Z = new c();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return Z;
        }

        @Override // o.AbstractC7264jN
        /* renamed from: o */
        public String g(Short sh) {
            return sh.toString();
        }

        @Override // o.AbstractC7264jN
        /* renamed from: p */
        public Short h(String str) {
            return Short.decode(str);
        }

        public String toString() {
            return "Shorts.stringConverter()";
        }
    }

    @InterfaceC4238Sm
    public static AbstractC7264jN<String, Short> A() {
        return c.Z;
    }

    public static short[] B(Collection<? extends Number> collection) {
        if (collection instanceof b) {
            return ((b) collection).f();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        short[] sArr = new short[length];
        for (int i = 0; i < length; i++) {
            sArr[i] = ((Number) C10664xF1.E(array[i])).shortValue();
        }
        return sArr;
    }

    @InterfaceC11149zF0
    public static byte[] C(short s) {
        return new byte[]{(byte) (s >> 8), (byte) s};
    }

    public static List<Short> c(short... sArr) {
        if (sArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        return new b(sArr);
    }

    public static short d(long j) {
        boolean z;
        short s = (short) j;
        if (s == j) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.p(z, "Out of range: %s", j);
        return s;
    }

    public static int e(short s, short s2) {
        return s - s2;
    }

    public static short[] f(short[]... sArr) {
        int i = 0;
        for (short[] sArr2 : sArr) {
            i += sArr2.length;
        }
        short[] sArr3 = new short[i];
        int i2 = 0;
        for (short[] sArr4 : sArr) {
            System.arraycopy(sArr4, 0, sArr3, i2, sArr4.length);
            i2 += sArr4.length;
        }
        return sArr3;
    }

    @InterfaceC4238Sm
    public static short g(short s, short s2, short s3) {
        boolean z;
        if (s2 <= s3) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.m(z, "min (%s) must be less than or equal to max (%s)", s2, s3);
        if (s < s2) {
            return s2;
        }
        if (s < s3) {
            return s;
        }
        return s3;
    }

    public static boolean h(short[] sArr, short s) {
        for (short s2 : sArr) {
            if (s2 == s) {
                return true;
            }
        }
        return false;
    }

    public static short[] i(short[] sArr, int i, int i2) {
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
        if (sArr.length < i) {
            return Arrays.copyOf(sArr, i + i2);
        }
        return sArr;
    }

    @InterfaceC11149zF0
    public static short j(byte[] bArr) {
        boolean z;
        if (bArr.length >= 2) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.m(z, "array too small: %s < %s", bArr.length, 2);
        return k(bArr[0], bArr[1]);
    }

    @InterfaceC11149zF0
    public static short k(byte b2, byte b3) {
        return (short) ((b2 << 8) | (b3 & 255));
    }

    public static int m(short[] sArr, short s) {
        return n(sArr, s, 0, sArr.length);
    }

    public static int n(short[] sArr, short s, int i, int i2) {
        while (i < i2) {
            if (sArr[i] == s) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int o(short[] sArr, short[] sArr2) {
        C10664xF1.F(sArr, "array");
        C10664xF1.F(sArr2, "target");
        if (sArr2.length == 0) {
            return 0;
        }
        int i = 0;
        while (i < (sArr.length - sArr2.length) + 1) {
            for (int i2 = 0; i2 < sArr2.length; i2++) {
                if (sArr[i + i2] != sArr2[i2]) {
                    break;
                }
            }
            return i;
        }
        return -1;
    }

    public static String p(String str, short... sArr) {
        C10664xF1.E(str);
        if (sArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(sArr.length * 6);
        sb.append((int) sArr[0]);
        for (int i = 1; i < sArr.length; i++) {
            sb.append(str);
            sb.append((int) sArr[i]);
        }
        return sb.toString();
    }

    public static int q(short[] sArr, short s) {
        return r(sArr, s, 0, sArr.length);
    }

    public static int r(short[] sArr, short s, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (sArr[i3] == s) {
                return i3;
            }
        }
        return -1;
    }

    public static Comparator<short[]> s() {
        return a.INSTANCE;
    }

    @InterfaceC11149zF0("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static short t(short... sArr) {
        boolean z;
        if (sArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.d(z);
        short s = sArr[0];
        for (int i = 1; i < sArr.length; i++) {
            short s2 = sArr[i];
            if (s2 > s) {
                s = s2;
            }
        }
        return s;
    }

    @InterfaceC11149zF0("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static short u(short... sArr) {
        boolean z;
        if (sArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.d(z);
        short s = sArr[0];
        for (int i = 1; i < sArr.length; i++) {
            short s2 = sArr[i];
            if (s2 < s) {
                s = s2;
            }
        }
        return s;
    }

    public static void v(short[] sArr) {
        C10664xF1.E(sArr);
        w(sArr, 0, sArr.length);
    }

    public static void w(short[] sArr, int i, int i2) {
        C10664xF1.E(sArr);
        C10664xF1.f0(i, i2, sArr.length);
        for (int i3 = i2 - 1; i < i3; i3--) {
            short s = sArr[i];
            sArr[i] = sArr[i3];
            sArr[i3] = s;
            i++;
        }
    }

    public static short x(long j) {
        if (j > 32767) {
            return C10132v42.c;
        }
        if (j < -32768) {
            return C10132v42.b;
        }
        return (short) j;
    }

    public static void y(short[] sArr) {
        C10664xF1.E(sArr);
        z(sArr, 0, sArr.length);
    }

    public static void z(short[] sArr, int i, int i2) {
        C10664xF1.E(sArr);
        C10664xF1.f0(i, i2, sArr.length);
        Arrays.sort(sArr, i, i2);
        w(sArr, i, i2);
    }

    public static int l(short s) {
        return s;
    }
}
