package o;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import okhttp3.internal.ws.WebSocketProtocol;

@InterfaceC5116aa0
@InterfaceC10420wF0(emulated = true)
/* renamed from: o.zB  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11132zB {
    public static final int a = 2;

    @InterfaceC10420wF0
    /* renamed from: o.zB$a */
    /* loaded from: classes3.dex */
    public static class a extends AbstractList<Character> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        public final char[] X;
        public final int Y;
        public final int Z;

        public a(char[] cArr) {
            this(cArr, 0, cArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@MB Object obj) {
            if ((obj instanceof Character) && C11132zB.n(this.X, ((Character) obj).charValue(), this.Y, this.Z) != -1) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: d */
        public Character get(int i) {
            C10664xF1.C(i, size());
            return Character.valueOf(this.X[this.Y + i]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: e */
        public Character set(int i, Character ch) {
            C10664xF1.C(i, size());
            char[] cArr = this.X;
            int i2 = this.Y;
            char c = cArr[i2 + i];
            cArr[i2 + i] = ((Character) C10664xF1.E(ch)).charValue();
            return Character.valueOf(c);
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

        public char[] f() {
            return Arrays.copyOfRange(this.X, this.Y, this.Z);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i = 1;
            for (int i2 = this.Y; i2 < this.Z; i2++) {
                i = (i * 31) + C11132zB.l(this.X[i2]);
            }
            return i;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@MB Object obj) {
            int n;
            if ((obj instanceof Character) && (n = C11132zB.n(this.X, ((Character) obj).charValue(), this.Y, this.Z)) >= 0) {
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
            if ((obj instanceof Character) && (r = C11132zB.r(this.X, ((Character) obj).charValue(), this.Y, this.Z)) >= 0) {
                return r - this.Y;
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.Z - this.Y;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Character> subList(int i, int i2) {
            C10664xF1.f0(i, i2, size());
            if (i == i2) {
                return Collections.EMPTY_LIST;
            }
            char[] cArr = this.X;
            int i3 = this.Y;
            return new a(cArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 3);
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

        public a(char[] cArr, int i, int i2) {
            this.X = cArr;
            this.Y = i;
            this.Z = i2;
        }
    }

    /* renamed from: o.zB$b */
    /* loaded from: classes3.dex */
    public enum b implements Comparator<char[]> {
        INSTANCE;

        @Override // java.util.Comparator
        /* renamed from: g */
        public int compare(char[] cArr, char[] cArr2) {
            int min = Math.min(cArr.length, cArr2.length);
            for (int i = 0; i < min; i++) {
                int e = C11132zB.e(cArr[i], cArr2[i]);
                if (e != 0) {
                    return e;
                }
            }
            return cArr.length - cArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Chars.lexicographicalComparator()";
        }
    }

    public static char[] A(Collection<Character> collection) {
        if (collection instanceof a) {
            return ((a) collection).f();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = ((Character) C10664xF1.E(array[i])).charValue();
        }
        return cArr;
    }

    @InterfaceC11149zF0
    public static byte[] B(char c) {
        return new byte[]{(byte) (c >> '\b'), (byte) c};
    }

    public static List<Character> c(char... cArr) {
        if (cArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        return new a(cArr);
    }

    public static char d(long j) {
        boolean z;
        char c = (char) j;
        if (c == j) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.p(z, "Out of range: %s", j);
        return c;
    }

    public static int e(char c, char c2) {
        return c - c2;
    }

    public static char[] f(char[]... cArr) {
        int i = 0;
        for (char[] cArr2 : cArr) {
            i += cArr2.length;
        }
        char[] cArr3 = new char[i];
        int i2 = 0;
        for (char[] cArr4 : cArr) {
            System.arraycopy(cArr4, 0, cArr3, i2, cArr4.length);
            i2 += cArr4.length;
        }
        return cArr3;
    }

    @InterfaceC4238Sm
    public static char g(char c, char c2, char c3) {
        boolean z;
        if (c2 <= c3) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.g(z, "min (%s) must be less than or equal to max (%s)", c2, c3);
        if (c < c2) {
            return c2;
        }
        if (c < c3) {
            return c;
        }
        return c3;
    }

    public static boolean h(char[] cArr, char c) {
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    public static char[] i(char[] cArr, int i, int i2) {
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
        if (cArr.length < i) {
            return Arrays.copyOf(cArr, i + i2);
        }
        return cArr;
    }

    @InterfaceC11149zF0
    public static char j(byte[] bArr) {
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
    public static char k(byte b2, byte b3) {
        return (char) ((b2 << 8) | (b3 & 255));
    }

    public static int m(char[] cArr, char c) {
        return n(cArr, c, 0, cArr.length);
    }

    public static int n(char[] cArr, char c, int i, int i2) {
        while (i < i2) {
            if (cArr[i] == c) {
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
    public static int o(char[] cArr, char[] cArr2) {
        C10664xF1.F(cArr, "array");
        C10664xF1.F(cArr2, "target");
        if (cArr2.length == 0) {
            return 0;
        }
        int i = 0;
        while (i < (cArr.length - cArr2.length) + 1) {
            for (int i2 = 0; i2 < cArr2.length; i2++) {
                if (cArr[i + i2] != cArr2[i2]) {
                    break;
                }
            }
            return i;
        }
        return -1;
    }

    public static String p(String str, char... cArr) {
        C10664xF1.E(str);
        int length = cArr.length;
        if (length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder((str.length() * (length - 1)) + length);
        sb.append(cArr[0]);
        for (int i = 1; i < length; i++) {
            sb.append(str);
            sb.append(cArr[i]);
        }
        return sb.toString();
    }

    public static int q(char[] cArr, char c) {
        return r(cArr, c, 0, cArr.length);
    }

    public static int r(char[] cArr, char c, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (cArr[i3] == c) {
                return i3;
            }
        }
        return -1;
    }

    public static Comparator<char[]> s() {
        return b.INSTANCE;
    }

    public static char t(char... cArr) {
        boolean z;
        if (cArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.d(z);
        char c = cArr[0];
        for (int i = 1; i < cArr.length; i++) {
            char c2 = cArr[i];
            if (c2 > c) {
                c = c2;
            }
        }
        return c;
    }

    public static char u(char... cArr) {
        boolean z;
        if (cArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.d(z);
        char c = cArr[0];
        for (int i = 1; i < cArr.length; i++) {
            char c2 = cArr[i];
            if (c2 < c) {
                c = c2;
            }
        }
        return c;
    }

    public static void v(char[] cArr) {
        C10664xF1.E(cArr);
        w(cArr, 0, cArr.length);
    }

    public static void w(char[] cArr, int i, int i2) {
        C10664xF1.E(cArr);
        C10664xF1.f0(i, i2, cArr.length);
        for (int i3 = i2 - 1; i < i3; i3--) {
            char c = cArr[i];
            cArr[i] = cArr[i3];
            cArr[i3] = c;
            i++;
        }
    }

    public static char x(long j) {
        if (j > WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            return (char) 65535;
        }
        if (j < 0) {
            return (char) 0;
        }
        return (char) j;
    }

    public static void y(char[] cArr) {
        C10664xF1.E(cArr);
        z(cArr, 0, cArr.length);
    }

    public static void z(char[] cArr, int i, int i2) {
        C10664xF1.E(cArr);
        C10664xF1.f0(i, i2, cArr.length);
        Arrays.sort(cArr, i, i2);
        w(cArr, i, i2);
    }

    public static int l(char c) {
        return c;
    }
}
