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
@InterfaceC10420wF0
/* renamed from: o.j51  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7194j51 {
    public static final int a = 8;
    public static final long b = 4611686018427387904L;

    /* renamed from: o.j51$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public static final byte[] a;

        static {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i = 0; i < 10; i++) {
                bArr[i + 48] = (byte) i;
            }
            for (int i2 = 0; i2 < 26; i2++) {
                byte b = (byte) (i2 + 10);
                bArr[i2 + 65] = b;
                bArr[i2 + 97] = b;
            }
            a = bArr;
        }

        public static int a(char c) {
            if (c < 128) {
                return a[c];
            }
            return -1;
        }
    }

    /* renamed from: o.j51$b */
    /* loaded from: classes3.dex */
    public enum b implements Comparator<long[]> {
        INSTANCE;

        @Override // java.util.Comparator
        /* renamed from: g */
        public int compare(long[] jArr, long[] jArr2) {
            int min = Math.min(jArr.length, jArr2.length);
            for (int i = 0; i < min; i++) {
                int d = C7194j51.d(jArr[i], jArr2[i]);
                if (d != 0) {
                    return d;
                }
            }
            return jArr.length - jArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Longs.lexicographicalComparator()";
        }
    }

    @InterfaceC10420wF0
    /* renamed from: o.j51$c */
    /* loaded from: classes3.dex */
    public static class c extends AbstractList<Long> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        public final long[] X;
        public final int Y;
        public final int Z;

        public c(long[] jArr) {
            this(jArr, 0, jArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@MB Object obj) {
            if ((obj instanceof Long) && C7194j51.m(this.X, ((Long) obj).longValue(), this.Y, this.Z) != -1) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: d */
        public Long get(int i) {
            C10664xF1.C(i, size());
            return Long.valueOf(this.X[this.Y + i]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: e */
        public Long set(int i, Long l) {
            C10664xF1.C(i, size());
            long[] jArr = this.X;
            int i2 = this.Y;
            long j = jArr[i2 + i];
            jArr[i2 + i] = ((Long) C10664xF1.E(l)).longValue();
            return Long.valueOf(j);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@MB Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                int size = size();
                if (cVar.size() != size) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (this.X[this.Y + i] != cVar.X[cVar.Y + i]) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(obj);
        }

        public long[] f() {
            return Arrays.copyOfRange(this.X, this.Y, this.Z);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i = 1;
            for (int i2 = this.Y; i2 < this.Z; i2++) {
                i = (i * 31) + C7194j51.k(this.X[i2]);
            }
            return i;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@MB Object obj) {
            int m;
            if ((obj instanceof Long) && (m = C7194j51.m(this.X, ((Long) obj).longValue(), this.Y, this.Z)) >= 0) {
                return m - this.Y;
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
            if ((obj instanceof Long) && (q = C7194j51.q(this.X, ((Long) obj).longValue(), this.Y, this.Z)) >= 0) {
                return q - this.Y;
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.Z - this.Y;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int i, int i2) {
            C10664xF1.f0(i, i2, size());
            if (i == i2) {
                return Collections.EMPTY_LIST;
            }
            long[] jArr = this.X;
            int i3 = this.Y;
            return new c(jArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 10);
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

        public c(long[] jArr, int i, int i2) {
            this.X = jArr;
            this.Y = i;
            this.Z = i2;
        }
    }

    /* renamed from: o.j51$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC7264jN<String, Long> implements Serializable {
        public static final d Z = new d();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return Z;
        }

        @Override // o.AbstractC7264jN
        /* renamed from: o */
        public String g(Long l) {
            return l.toString();
        }

        @Override // o.AbstractC7264jN
        /* renamed from: p */
        public Long h(String str) {
            return Long.decode(str);
        }

        public String toString() {
            return "Longs.stringConverter()";
        }
    }

    public static byte[] A(long j) {
        byte[] bArr = new byte[8];
        for (int i = 7; i >= 0; i--) {
            bArr[i] = (byte) (255 & j);
            j >>= 8;
        }
        return bArr;
    }

    @MB
    @InterfaceC4238Sm
    public static Long B(String str) {
        return C(str, 10);
    }

    @MB
    @InterfaceC4238Sm
    public static Long C(String str, int i) {
        if (((String) C10664xF1.E(str)).isEmpty()) {
            return null;
        }
        if (i >= 2 && i <= 36) {
            int i2 = 0;
            if (str.charAt(0) == '-') {
                i2 = 1;
            }
            if (i2 == str.length()) {
                return null;
            }
            int i3 = i2 + 1;
            int a2 = a.a(str.charAt(i2));
            if (a2 < 0 || a2 >= i) {
                return null;
            }
            long j = -a2;
            long j2 = i;
            long j3 = Long.MIN_VALUE / j2;
            while (i3 < str.length()) {
                int i4 = i3 + 1;
                int a3 = a.a(str.charAt(i3));
                if (a3 < 0 || a3 >= i || j < j3) {
                    return null;
                }
                long j4 = j * j2;
                long j5 = a3;
                if (j4 < j5 - Long.MIN_VALUE) {
                    return null;
                }
                j = j4 - j5;
                i3 = i4;
            }
            if (i2 != 0) {
                return Long.valueOf(j);
            }
            if (j == Long.MIN_VALUE) {
                return null;
            }
            return Long.valueOf(-j);
        }
        StringBuilder sb = new StringBuilder(65);
        sb.append("radix must be between MIN_RADIX and MAX_RADIX but was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static List<Long> c(long... jArr) {
        if (jArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        return new c(jArr);
    }

    public static int d(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        return 0;
    }

    public static long[] e(long[]... jArr) {
        int i = 0;
        for (long[] jArr2 : jArr) {
            i += jArr2.length;
        }
        long[] jArr3 = new long[i];
        int i2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, i2, jArr4.length);
            i2 += jArr4.length;
        }
        return jArr3;
    }

    @InterfaceC4238Sm
    public static long f(long j, long j2, long j3) {
        boolean z;
        if (j2 <= j3) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.s(z, "min (%s) must be less than or equal to max (%s)", j2, j3);
        return Math.min(Math.max(j, j2), j3);
    }

    public static boolean g(long[] jArr, long j) {
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (jArr[i] == j) {
                return true;
            }
        }
        return false;
    }

    public static long[] h(long[] jArr, int i, int i2) {
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
        if (jArr.length < i) {
            return Arrays.copyOf(jArr, i + i2);
        }
        return jArr;
    }

    public static long i(byte[] bArr) {
        boolean z;
        if (bArr.length >= 8) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.m(z, "array too small: %s < %s", bArr.length, 8);
        return j(bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5], bArr[6], bArr[7]);
    }

    public static long j(byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9) {
        return ((b3 & 255) << 48) | ((b2 & 255) << 56) | ((b4 & 255) << 40) | ((b5 & 255) << 32) | ((b6 & 255) << 24) | ((b7 & 255) << 16) | ((b8 & 255) << 8) | (b9 & 255);
    }

    public static int k(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int l(long[] jArr, long j) {
        return m(jArr, j, 0, jArr.length);
    }

    public static int m(long[] jArr, long j, int i, int i2) {
        while (i < i2) {
            if (jArr[i] == j) {
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
    public static int n(long[] jArr, long[] jArr2) {
        C10664xF1.F(jArr, "array");
        C10664xF1.F(jArr2, "target");
        if (jArr2.length == 0) {
            return 0;
        }
        int i = 0;
        while (i < (jArr.length - jArr2.length) + 1) {
            for (int i2 = 0; i2 < jArr2.length; i2++) {
                if (jArr[i + i2] != jArr2[i2]) {
                    break;
                }
            }
            return i;
        }
        return -1;
    }

    public static String o(String str, long... jArr) {
        C10664xF1.E(str);
        if (jArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(jArr.length * 10);
        sb.append(jArr[0]);
        for (int i = 1; i < jArr.length; i++) {
            sb.append(str);
            sb.append(jArr[i]);
        }
        return sb.toString();
    }

    public static int p(long[] jArr, long j) {
        return q(jArr, j, 0, jArr.length);
    }

    public static int q(long[] jArr, long j, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (jArr[i3] == j) {
                return i3;
            }
        }
        return -1;
    }

    public static Comparator<long[]> r() {
        return b.INSTANCE;
    }

    public static long s(long... jArr) {
        boolean z;
        if (jArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.d(z);
        long j = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            long j2 = jArr[i];
            if (j2 > j) {
                j = j2;
            }
        }
        return j;
    }

    public static long t(long... jArr) {
        boolean z;
        if (jArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.d(z);
        long j = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            long j2 = jArr[i];
            if (j2 < j) {
                j = j2;
            }
        }
        return j;
    }

    public static void u(long[] jArr) {
        C10664xF1.E(jArr);
        v(jArr, 0, jArr.length);
    }

    public static void v(long[] jArr, int i, int i2) {
        C10664xF1.E(jArr);
        C10664xF1.f0(i, i2, jArr.length);
        for (int i3 = i2 - 1; i < i3; i3--) {
            long j = jArr[i];
            jArr[i] = jArr[i3];
            jArr[i3] = j;
            i++;
        }
    }

    public static void w(long[] jArr) {
        C10664xF1.E(jArr);
        x(jArr, 0, jArr.length);
    }

    public static void x(long[] jArr, int i, int i2) {
        C10664xF1.E(jArr);
        C10664xF1.f0(i, i2, jArr.length);
        Arrays.sort(jArr, i, i2);
        v(jArr, i, i2);
    }

    @InterfaceC4238Sm
    public static AbstractC7264jN<String, Long> y() {
        return d.Z;
    }

    public static long[] z(Collection<? extends Number> collection) {
        if (collection instanceof c) {
            return ((c) collection).f();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = ((Number) C10664xF1.E(array[i])).longValue();
        }
        return jArr;
    }
}
