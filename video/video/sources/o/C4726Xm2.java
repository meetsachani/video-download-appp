package o;

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: o.Xm2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4726Xm2 implements CharSequence, Appendable, Serializable, InterfaceC4836Yq<String> {
    public static final char a1 = ' ';
    public static final int b1 = 32;
    public static final int c1 = -1;
    public static final int d1 = Boolean.FALSE.toString().length();
    public static final int e1 = Boolean.TRUE.toString().length();
    private static final long serialVersionUID = 1;
    public char[] X;
    public String Y;
    public int Y0;
    public String Z;
    public int Z0;

    /* renamed from: o.Xm2$b */
    /* loaded from: classes4.dex */
    public class b extends C3622Me2 {
        public b() {
        }

        @Override // o.C3622Me2
        public List<String> S(char[] cArr, int i, int i2) {
            if (cArr == null) {
                return super.S(C4726Xm2.this.J0(), 0, C4726Xm2.this.N1());
            }
            return super.S(cArr, i, i2);
        }

        @Override // o.C3622Me2
        public String j() {
            String j = super.j();
            if (j == null) {
                return C4726Xm2.this.toString();
            }
            return j;
        }
    }

    /* renamed from: o.Xm2$c */
    /* loaded from: classes4.dex */
    public class c extends Writer {
        public c() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr) {
            C4726Xm2.this.v(cArr);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            C4726Xm2.this.w(cArr, i, i2);
        }

        @Override // java.io.Writer
        public void write(int i) {
            C4726Xm2.this.append((char) i);
        }

        @Override // java.io.Writer
        public void write(String str) {
            C4726Xm2.this.j(str);
        }

        @Override // java.io.Writer
        public void write(String str, int i, int i2) {
            C4726Xm2.this.k(str, i, i2);
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }
    }

    public C4726Xm2() {
        this(32);
    }

    private void C0(int i, int i2, int i3) {
        char[] cArr = this.X;
        System.arraycopy(cArr, i2, cArr, i, this.Z0 - i2);
        this.Z0 -= i3;
    }

    private void E1(int i, int i2, int i3, String str, int i4) {
        int i5 = (this.Z0 - i3) + i4;
        if (i4 != i3) {
            G0(i5);
            char[] cArr = this.X;
            System.arraycopy(cArr, i2, cArr, i + i4, this.Z0 - i2);
            this.Z0 = i5;
        }
        if (i4 > 0) {
            str.getChars(0, i4, this.X, i);
        }
    }

    public static C4726Xm2 Y1(char[] cArr) {
        Objects.requireNonNull(cArr, "initialBuffer");
        return new C4726Xm2(cArr, cArr.length);
    }

    public static C4726Xm2 Z1(char[] cArr, int i) {
        return new C4726Xm2(cArr, i);
    }

    public final void A(int i) {
        char[] cArr = this.X;
        cArr[i] = 'f';
        cArr[i + 1] = 'a';
        cArr[i + 2] = 'l';
        cArr[i + 3] = 's';
        cArr[i + 4] = 'e';
        this.Z0 += d1;
    }

    public C4726Xm2 A0(String str) {
        int length;
        int Q0;
        if (str == null) {
            length = 0;
        } else {
            length = str.length();
        }
        if (length > 0 && (Q0 = Q0(str, 0)) >= 0) {
            C0(Q0, Q0 + length, length);
        }
        return this;
    }

    public C4726Xm2 A1(char c2, char c3) {
        if (c2 != c3) {
            for (int i = 0; i < this.Z0; i++) {
                char[] cArr = this.X;
                if (cArr[i] == c2) {
                    cArr[i] = c3;
                    return this;
                }
            }
        }
        return this;
    }

    public C4726Xm2 B(int i, int i2, char c2) {
        return C(String.valueOf(i), i2, c2);
    }

    public C4726Xm2 B0(InterfaceC2828Ee2 interfaceC2828Ee2) {
        return w1(interfaceC2828Ee2, null, 0, this.Z0, 1);
    }

    public C4726Xm2 B1(String str, String str2) {
        int length;
        int Q0;
        int i = 0;
        if (str == null) {
            length = 0;
        } else {
            length = str.length();
        }
        if (length > 0 && (Q0 = Q0(str, 0)) >= 0) {
            if (str2 != null) {
                i = str2.length();
            }
            E1(Q0, Q0 + length, length, str2, i);
            return this;
        }
        return this;
    }

    public C4726Xm2 C(Object obj, int i, char c2) {
        String obj2;
        if (i > 0) {
            G0(this.Z0 + i);
            if (obj == null) {
                obj2 = M0();
            } else {
                obj2 = obj.toString();
            }
            if (obj2 == null) {
                obj2 = "";
            }
            int length = obj2.length();
            if (length >= i) {
                obj2.getChars(length - i, length, this.X, this.Z0);
            } else {
                int i2 = i - length;
                for (int i3 = 0; i3 < i2; i3++) {
                    this.X[this.Z0 + i3] = c2;
                }
                obj2.getChars(0, length, this.X, this.Z0 + i2);
            }
            this.Z0 += i;
        }
        return this;
    }

    public C4726Xm2 C1(InterfaceC2828Ee2 interfaceC2828Ee2, String str) {
        return w1(interfaceC2828Ee2, str, 0, this.Z0, 1);
    }

    public C4726Xm2 D(int i, int i2, char c2) {
        return E(String.valueOf(i), i2, c2);
    }

    public char D0(int i) {
        W1(i);
        char c2 = this.X[i];
        y0(i);
        return c2;
    }

    public final C4726Xm2 D1(InterfaceC2828Ee2 interfaceC2828Ee2, String str, int i, int i2, int i3) {
        int length;
        String str2;
        if (interfaceC2828Ee2 != null && this.Z0 != 0) {
            if (str == null) {
                length = 0;
            } else {
                length = str.length();
            }
            int i4 = length;
            int i5 = i;
            while (i5 < i2 && i3 != 0) {
                int b2 = interfaceC2828Ee2.b(this.X, i5, i, i2);
                if (b2 > 0) {
                    str2 = str;
                    E1(i5, i5 + b2, b2, str2, i4);
                    i2 = (i2 - b2) + i4;
                    i5 = (i5 + i4) - 1;
                    if (i3 > 0) {
                        i3--;
                    }
                } else {
                    str2 = str;
                }
                i5++;
                str = str2;
            }
        }
        return this;
    }

    public C4726Xm2 E(Object obj, int i, char c2) {
        String obj2;
        if (i > 0) {
            G0(this.Z0 + i);
            if (obj == null) {
                obj2 = M0();
            } else {
                obj2 = obj.toString();
            }
            if (obj2 == null) {
                obj2 = "";
            }
            int length = obj2.length();
            if (length >= i) {
                obj2.getChars(0, i, this.X, this.Z0);
            } else {
                int i2 = i - length;
                obj2.getChars(0, length, this.X, this.Z0);
                for (int i3 = 0; i3 < i2; i3++) {
                    this.X[this.Z0 + length + i3] = c2;
                }
            }
            this.Z0 += i;
        }
        return this;
    }

    public int E0(int i, int i2, char[] cArr, int i3) {
        int i4 = i2 - i;
        if (!isEmpty() && i4 != 0 && cArr.length != 0) {
            int min = Math.min(Math.min(this.Z0, i4), cArr.length - i3);
            getChars(i, min, cArr, i3);
            u0(i, min);
            return min;
        }
        return 0;
    }

    public C4726Xm2 F() {
        String str = this.Y;
        if (str == null) {
            j(System.lineSeparator());
            return this;
        }
        return j(str);
    }

    public boolean F0(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return true;
        }
        int i = this.Z0;
        if (length > i) {
            return false;
        }
        int i2 = i - length;
        int i3 = 0;
        while (i3 < length) {
            if (this.X[i2] != str.charAt(i3)) {
                return false;
            }
            i3++;
            i2++;
        }
        return true;
    }

    public C4726Xm2 F1() {
        int i = this.Z0;
        if (i != 0) {
            int i2 = i / 2;
            char[] cArr = this.X;
            int i3 = i - 1;
            int i4 = 0;
            while (i4 < i2) {
                char c2 = cArr[i4];
                cArr[i4] = cArr[i3];
                cArr[i3] = c2;
                i4++;
                i3--;
            }
        }
        return this;
    }

    public C4726Xm2 G() {
        String str = this.Z;
        if (str == null) {
            return this;
        }
        return j(str);
    }

    public C4726Xm2 G0(int i) {
        if (i > 0 && i - this.X.length > 0) {
            u1(i);
        }
        return this;
    }

    public String G1(int i) {
        if (i <= 0) {
            return "";
        }
        int i2 = this.Z0;
        if (i >= i2) {
            return new String(this.X, 0, i2);
        }
        return new String(this.X, i2 - i, i);
    }

    public C4726Xm2 H(int i, char c2) {
        if (i >= 0) {
            G0(this.Z0 + i);
            for (int i2 = 0; i2 < i; i2++) {
                char[] cArr = this.X;
                int i3 = this.Z0;
                this.Z0 = i3 + 1;
                cArr[i3] = c2;
            }
        }
        return this;
    }

    public boolean H0(C4726Xm2 c4726Xm2) {
        int i;
        if (this == c4726Xm2) {
            return true;
        }
        if (c4726Xm2 == null || (i = this.Z0) != c4726Xm2.Z0) {
            return false;
        }
        char[] cArr = this.X;
        char[] cArr2 = c4726Xm2.X;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (cArr[i2] != cArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public C4726Xm2 H1(CharSequence charSequence) {
        q0();
        append(charSequence);
        return this;
    }

    public C4726Xm2 I(char c2) {
        if (f1()) {
            append(c2);
        }
        return this;
    }

    public boolean I0(C4726Xm2 c4726Xm2) {
        if (this == c4726Xm2) {
            return true;
        }
        int i = this.Z0;
        if (i != c4726Xm2.Z0) {
            return false;
        }
        char[] cArr = this.X;
        char[] cArr2 = c4726Xm2.X;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            char c2 = cArr[i2];
            char c3 = cArr2[i2];
            if (c2 != c3 && Character.toUpperCase(c2) != Character.toUpperCase(c3)) {
                return false;
            }
        }
        return true;
    }

    public C4726Xm2 I1(int i, char c2) {
        W1(i);
        this.X[i] = c2;
        return this;
    }

    public C4726Xm2 J(char c2, char c3) {
        if (isEmpty()) {
            append(c3);
            return this;
        }
        append(c2);
        return this;
    }

    public char[] J0() {
        return this.X;
    }

    public C4726Xm2 J1(int i) {
        if (i >= 0) {
            int i2 = this.Z0;
            if (i < i2) {
                this.Z0 = i;
                return this;
            }
            if (i > i2) {
                G0(i);
                int i3 = this.Z0;
                this.Z0 = i;
                Arrays.fill(this.X, i3, i, (char) 0);
            }
            return this;
        }
        throw new StringIndexOutOfBoundsException(i);
    }

    public C4726Xm2 K(char c2, int i) {
        if (i > 0) {
            append(c2);
        }
        return this;
    }

    public char[] K0(char[] cArr) {
        int length = length();
        if (cArr == null || cArr.length < length) {
            cArr = new char[length];
        }
        System.arraycopy(this.X, 0, cArr, 0, length);
        return cArr;
    }

    public C4726Xm2 K1(String str) {
        this.Y = str;
        return this;
    }

    public C4726Xm2 L(String str) {
        return N(str, null);
    }

    public String L0() {
        return this.Y;
    }

    public C4726Xm2 L1(String str) {
        if (str != null && str.isEmpty()) {
            str = null;
        }
        this.Z = str;
        return this;
    }

    public C4726Xm2 M(String str, int i) {
        if (str != null && i > 0) {
            j(str);
        }
        return this;
    }

    public String M0() {
        return this.Z;
    }

    public C4726Xm2 N(String str, String str2) {
        if (isEmpty()) {
            str = str2;
        }
        if (str != null) {
            j(str);
        }
        return this;
    }

    public int N0(char c2) {
        return O0(c2, 0);
    }

    public int N1() {
        return this.Z0;
    }

    public void O(Appendable appendable) throws IOException {
        if (appendable instanceof Writer) {
            ((Writer) appendable).write(this.X, 0, this.Z0);
        } else if (appendable instanceof StringBuilder) {
            ((StringBuilder) appendable).append(this.X, 0, this.Z0);
        } else if (appendable instanceof StringBuffer) {
            ((StringBuffer) appendable).append(this.X, 0, this.Z0);
        } else if (appendable instanceof CharBuffer) {
            ((CharBuffer) appendable).put(this.X, 0, this.Z0);
        } else {
            appendable.append(this);
        }
    }

    public int O0(char c2, int i) {
        int max = Math.max(0, i);
        if (max >= this.Z0) {
            return -1;
        }
        char[] cArr = this.X;
        while (max < this.Z0) {
            if (cArr[max] == c2) {
                return max;
            }
            max++;
        }
        return -1;
    }

    public boolean O1(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return true;
        }
        if (length > this.Z0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (this.X[i] != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public final void P(int i) {
        char[] cArr = this.X;
        cArr[i] = 't';
        cArr[i + 1] = 'r';
        cArr[i + 2] = 'u';
        cArr[i + 3] = 'e';
        this.Z0 += e1;
    }

    public int P0(String str) {
        return Q0(str, 0);
    }

    public String P1(int i) {
        return Q1(i, this.Z0);
    }

    public C4726Xm2 Q(Iterable<?> iterable, String str) {
        if (iterable != null) {
            R(iterable.iterator(), str);
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
        r10 = r10 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int Q0(String str, int i) {
        int max = Math.max(0, i);
        if (str != null && max < this.Z0) {
            int length = str.length();
            if (length == 1) {
                return O0(str.charAt(0), max);
            }
            if (length == 0) {
                return max;
            }
            int i2 = this.Z0;
            if (length > i2) {
                return -1;
            }
            char[] cArr = this.X;
            int i3 = (i2 - length) + 1;
            while (max < i3) {
                for (int i4 = 0; i4 < length; i4++) {
                    if (str.charAt(i4) != cArr[max + i4]) {
                        break;
                    }
                }
                return max;
            }
        }
        return -1;
    }

    public String Q1(int i, int i2) {
        return new String(this.X, i, X1(i, i2) - i);
    }

    public C4726Xm2 R(Iterator<?> it, String str) {
        if (it != null) {
            String objects = Objects.toString(str, "");
            while (it.hasNext()) {
                i(it.next());
                if (it.hasNext()) {
                    j(objects);
                }
            }
        }
        return this;
    }

    public int R0(InterfaceC2828Ee2 interfaceC2828Ee2) {
        return T0(interfaceC2828Ee2, 0);
    }

    public char[] R1() {
        int i = this.Z0;
        if (i == 0) {
            return C4206Se.e;
        }
        return Arrays.copyOf(this.X, i);
    }

    public C4726Xm2 S(Object[] objArr, String str) {
        if (objArr != null && objArr.length > 0) {
            String objects = Objects.toString(str, "");
            i(objArr[0]);
            for (int i = 1; i < objArr.length; i++) {
                j(objects);
                i(objArr[i]);
            }
        }
        return this;
    }

    public char[] S1(int i, int i2) {
        int X1 = X1(i, i2);
        if (X1 - i == 0) {
            return C4206Se.e;
        }
        return Arrays.copyOfRange(this.X, i, X1);
    }

    public C4726Xm2 T(char c2) {
        return append(c2).F();
    }

    public int T0(InterfaceC2828Ee2 interfaceC2828Ee2, int i) {
        int i2;
        int max = Math.max(0, i);
        if (interfaceC2828Ee2 != null && max < (i2 = this.Z0)) {
            char[] cArr = this.X;
            for (int i3 = max; i3 < i2; i3++) {
                if (interfaceC2828Ee2.b(cArr, i3, max, i2) > 0) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public StringBuffer T1() {
        StringBuffer stringBuffer = new StringBuffer(this.Z0);
        stringBuffer.append(this.X, 0, this.Z0);
        return stringBuffer;
    }

    public C4726Xm2 U(double d) {
        return c(d).F();
    }

    public C4726Xm2 U0(int i, char c2) {
        W1(i);
        G0(this.Z0 + 1);
        char[] cArr = this.X;
        System.arraycopy(cArr, i, cArr, i + 1, this.Z0 - i);
        this.X[i] = c2;
        this.Z0++;
        return this;
    }

    public StringBuilder U1() {
        StringBuilder sb = new StringBuilder(this.Z0);
        sb.append(this.X, 0, this.Z0);
        return sb;
    }

    public C4726Xm2 V(float f) {
        return d(f).F();
    }

    public C4726Xm2 V1() {
        int i = this.Z0;
        if (i != 0) {
            char[] cArr = this.X;
            int i2 = 0;
            while (i2 < i && cArr[i2] <= ' ') {
                i2++;
            }
            while (i2 < i && cArr[i - 1] <= ' ') {
                i--;
            }
            int i3 = this.Z0;
            if (i < i3) {
                u0(i, i3);
            }
            if (i2 > 0) {
                u0(0, i2);
            }
        }
        return this;
    }

    public C4726Xm2 W(int i) {
        return e(i).F();
    }

    public C4726Xm2 W0(int i, double d) {
        return b1(i, String.valueOf(d));
    }

    public void W1(int i) {
        if (i >= 0 && i < this.Z0) {
            return;
        }
        throw new StringIndexOutOfBoundsException(i);
    }

    public C4726Xm2 X(long j) {
        return f(j).F();
    }

    public C4726Xm2 X0(int i, float f) {
        return b1(i, String.valueOf(f));
    }

    public int X1(int i, int i2) {
        if (i >= 0) {
            int i3 = this.Z0;
            if (i2 > i3) {
                i2 = i3;
            }
            if (i <= i2) {
                return i2;
            }
            throw new StringIndexOutOfBoundsException("end < start");
        }
        throw new StringIndexOutOfBoundsException(i);
    }

    public C4726Xm2 Y(Object obj) {
        return i(obj).F();
    }

    public C4726Xm2 Y0(int i, int i2) {
        return b1(i, String.valueOf(i2));
    }

    public C4726Xm2 Z(String str) {
        return j(str).F();
    }

    public C4726Xm2 Z0(int i, long j) {
        return b1(i, String.valueOf(j));
    }

    public C4726Xm2 a0(String str, int i, int i2) {
        return k(str, i, i2).F();
    }

    public C4726Xm2 a1(int i, Object obj) {
        if (obj == null) {
            return b1(i, this.Z);
        }
        return b1(i, obj.toString());
    }

    @Override // java.lang.Appendable
    /* renamed from: b */
    public C4726Xm2 append(char c2) {
        G0(length() + 1);
        char[] cArr = this.X;
        int i = this.Z0;
        this.Z0 = i + 1;
        cArr[i] = c2;
        return this;
    }

    public C4726Xm2 b0(String str, Object... objArr) {
        return l(str, objArr).F();
    }

    public C4726Xm2 b1(int i, String str) {
        int length;
        W1(i);
        if (str == null) {
            str = this.Z;
        }
        if (str != null && (length = str.length()) > 0) {
            int i2 = this.Z0 + length;
            G0(i2);
            char[] cArr = this.X;
            System.arraycopy(cArr, i, cArr, i + length, this.Z0 - i);
            this.Z0 = i2;
            str.getChars(0, length, this.X, i);
        }
        return this;
    }

    public C4726Xm2 c(double d) {
        return j(String.valueOf(d));
    }

    public C4726Xm2 c0(StringBuffer stringBuffer) {
        return m(stringBuffer).F();
    }

    public C4726Xm2 c1(int i, boolean z) {
        W1(i);
        if (z) {
            int i2 = this.Z0;
            int i3 = e1;
            G0(i2 + i3);
            char[] cArr = this.X;
            System.arraycopy(cArr, i, cArr, i3 + i, this.Z0 - i);
            P(i);
            return this;
        }
        int i4 = this.Z0;
        int i5 = d1;
        G0(i4 + i5);
        char[] cArr2 = this.X;
        System.arraycopy(cArr2, i, cArr2, i5 + i, this.Z0 - i);
        A(i);
        return this;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        W1(i);
        return this.X[i];
    }

    public C4726Xm2 d(float f) {
        return j(String.valueOf(f));
    }

    public C4726Xm2 d0(StringBuffer stringBuffer, int i, int i2) {
        return n(stringBuffer, i, i2).F();
    }

    public C4726Xm2 d1(int i, char[] cArr) {
        W1(i);
        if (cArr == null) {
            return b1(i, this.Z);
        }
        int length = cArr.length;
        if (length > 0) {
            G0(this.Z0 + length);
            char[] cArr2 = this.X;
            System.arraycopy(cArr2, i, cArr2, i + length, this.Z0 - i);
            System.arraycopy(cArr, 0, this.X, i, length);
            this.Z0 += length;
        }
        return this;
    }

    public C4726Xm2 e(int i) {
        return j(String.valueOf(i));
    }

    public C4726Xm2 e0(StringBuilder sb) {
        return o(sb).F();
    }

    public C4726Xm2 e1(int i, char[] cArr, int i2, int i3) {
        W1(i);
        if (cArr == null) {
            return b1(i, this.Z);
        }
        if (i2 >= 0 && i2 <= cArr.length) {
            if (i3 >= 0 && i2 + i3 <= cArr.length) {
                if (i3 > 0) {
                    G0(this.Z0 + i3);
                    char[] cArr2 = this.X;
                    System.arraycopy(cArr2, i, cArr2, i + i3, this.Z0 - i);
                    System.arraycopy(cArr, i2, this.X, i, i3);
                    this.Z0 += i3;
                }
                return this;
            }
            throw new StringIndexOutOfBoundsException("Invalid length: " + i3);
        }
        throw new StringIndexOutOfBoundsException("Invalid offset: " + i2);
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C4726Xm2) && H0((C4726Xm2) obj)) {
            return true;
        }
        return false;
    }

    public C4726Xm2 f(long j) {
        return j(String.valueOf(j));
    }

    public C4726Xm2 f0(StringBuilder sb, int i, int i2) {
        return p(sb, i, i2).F();
    }

    public boolean f1() {
        if (this.Z0 != 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Appendable
    /* renamed from: g */
    public C4726Xm2 append(CharSequence charSequence) {
        if (charSequence == null) {
            return G();
        }
        if (charSequence instanceof C4726Xm2) {
            return s((C4726Xm2) charSequence);
        }
        if (charSequence instanceof StringBuilder) {
            return o((StringBuilder) charSequence);
        }
        if (charSequence instanceof StringBuffer) {
            return m((StringBuffer) charSequence);
        }
        if (charSequence instanceof CharBuffer) {
            return q((CharBuffer) charSequence);
        }
        return j(charSequence.toString());
    }

    public C4726Xm2 g0(C4726Xm2 c4726Xm2) {
        return s(c4726Xm2).F();
    }

    public boolean g1() {
        if (this.Y0 > 0) {
            return true;
        }
        return false;
    }

    public void getChars(int i, int i2, char[] cArr, int i3) {
        if (i >= 0) {
            if (i2 >= 0 && i2 <= length()) {
                if (i <= i2) {
                    System.arraycopy(this.X, i, cArr, i3, i2 - i);
                    return;
                }
                throw new StringIndexOutOfBoundsException("end < start");
            }
            throw new StringIndexOutOfBoundsException(i2);
        }
        throw new StringIndexOutOfBoundsException(i);
    }

    @Override // java.lang.Appendable
    /* renamed from: h */
    public C4726Xm2 append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            return G();
        }
        if (i2 > 0) {
            if (i < i2) {
                return k(charSequence.toString(), i, i2 - i);
            }
            throw new StringIndexOutOfBoundsException("endIndex must be greater than startIndex");
        }
        throw new StringIndexOutOfBoundsException("endIndex must be valid");
    }

    public C4726Xm2 h0(C4726Xm2 c4726Xm2, int i, int i2) {
        return t(c4726Xm2, i, i2).F();
    }

    public int h1(char c2) {
        return i1(c2, this.Z0 - 1);
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public C4726Xm2 i(Object obj) {
        if (obj == null) {
            return G();
        }
        if (obj instanceof CharSequence) {
            return append((CharSequence) obj);
        }
        return j(obj.toString());
    }

    public C4726Xm2 i0(boolean z) {
        return u(z).F();
    }

    public int i1(char c2, int i) {
        int i2 = this.Z0;
        if (i >= i2) {
            i = i2 - 1;
        }
        if (i < 0) {
            return -1;
        }
        while (i >= 0) {
            if (this.X[i] == c2) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public boolean isEmpty() {
        if (this.Z0 == 0) {
            return true;
        }
        return false;
    }

    public C4726Xm2 j(String str) {
        return k(str, 0, C4500Ve2.F1(str));
    }

    public C4726Xm2 j0(char[] cArr) {
        return v(cArr).F();
    }

    public int j1(String str) {
        return k1(str, this.Z0 - 1);
    }

    public C4726Xm2 k(String str, int i, int i2) {
        int i3;
        if (str == null) {
            return G();
        }
        if (i >= 0 && i <= str.length()) {
            if (i2 >= 0 && (i3 = i + i2) <= str.length()) {
                if (i2 > 0) {
                    int length = length();
                    G0(length + i2);
                    str.getChars(i, i3, this.X, length);
                    this.Z0 += i2;
                }
                return this;
            }
            throw new StringIndexOutOfBoundsException("length must be valid");
        }
        throw new StringIndexOutOfBoundsException("startIndex must be valid");
    }

    public C4726Xm2 k0(char[] cArr, int i, int i2) {
        return w(cArr, i, i2).F();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0036, code lost:
        r9 = r9 - 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int k1(String str, int i) {
        int i2 = this.Z0;
        if (i >= i2) {
            i = i2 - 1;
        }
        if (str != null && i >= 0) {
            int length = str.length();
            if (length > 0 && length <= this.Z0) {
                if (length == 1) {
                    return i1(str.charAt(0), i);
                }
                int i3 = (i - length) + 1;
                while (i3 >= 0) {
                    for (int i4 = 0; i4 < length; i4++) {
                        if (str.charAt(i4) != this.X[i3 + i4]) {
                            break;
                        }
                    }
                    return i3;
                }
            } else if (length == 0) {
                return i;
            }
        }
        return -1;
    }

    public C4726Xm2 l(String str, Object... objArr) {
        return j(String.format(str, objArr));
    }

    public Reader l0() {
        return new a();
    }

    public int l1(InterfaceC2828Ee2 interfaceC2828Ee2) {
        return m1(interfaceC2828Ee2, this.Z0);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.Z0;
    }

    public C4726Xm2 m(StringBuffer stringBuffer) {
        return n(stringBuffer, 0, C4500Ve2.F1(stringBuffer));
    }

    public C3622Me2 m0() {
        return new b();
    }

    public int m1(InterfaceC2828Ee2 interfaceC2828Ee2, int i) {
        int i2 = this.Z0;
        if (i >= i2) {
            i = i2 - 1;
        }
        if (interfaceC2828Ee2 != null && i >= 0) {
            char[] cArr = this.X;
            int i3 = i + 1;
            while (i >= 0) {
                if (interfaceC2828Ee2.b(cArr, i, 0, i3) > 0) {
                    return i;
                }
                i--;
            }
        }
        return -1;
    }

    public C4726Xm2 n(StringBuffer stringBuffer, int i, int i2) {
        int i3;
        if (stringBuffer == null) {
            return G();
        }
        if (i >= 0 && i <= stringBuffer.length()) {
            if (i2 >= 0 && (i3 = i + i2) <= stringBuffer.length()) {
                if (i2 > 0) {
                    int length = length();
                    G0(length + i2);
                    stringBuffer.getChars(i, i3, this.X, length);
                    this.Z0 += i2;
                }
                return this;
            }
            throw new StringIndexOutOfBoundsException("length must be valid");
        }
        throw new StringIndexOutOfBoundsException("startIndex must be valid");
    }

    public Writer n0() {
        return new c();
    }

    public String n1(int i) {
        if (i <= 0) {
            return "";
        }
        int i2 = this.Z0;
        if (i >= i2) {
            return new String(this.X, 0, i2);
        }
        return new String(this.X, 0, i);
    }

    public C4726Xm2 o(StringBuilder sb) {
        return p(sb, 0, C4500Ve2.F1(sb));
    }

    @Override // o.InterfaceC4836Yq
    /* renamed from: o0 */
    public String build() {
        return toString();
    }

    public String o1(int i, int i2) {
        int i3;
        if (i < 0) {
            i = 0;
        }
        if (i2 > 0 && i < (i3 = this.Z0)) {
            if (i3 <= i + i2) {
                return new String(this.X, i, i3 - i);
            }
            return new String(this.X, i, i2);
        }
        return "";
    }

    public C4726Xm2 p(StringBuilder sb, int i, int i2) {
        int i3;
        if (sb == null) {
            return G();
        }
        if (i >= 0 && i <= sb.length()) {
            if (i2 >= 0 && (i3 = i + i2) <= sb.length()) {
                if (i2 > 0) {
                    int length = length();
                    G0(length + i2);
                    sb.getChars(i, i3, this.X, length);
                    this.Z0 += i2;
                }
                return this;
            }
            throw new StringIndexOutOfBoundsException("length must be valid");
        }
        throw new StringIndexOutOfBoundsException("startIndex must be valid");
    }

    public int p0() {
        return this.X.length;
    }

    public C4726Xm2 p1() {
        int length = this.X.length;
        int i = this.Z0;
        if (length > i) {
            u1(i);
        }
        return this;
    }

    public C4726Xm2 q(CharBuffer charBuffer) {
        return r(charBuffer, 0, C4500Ve2.F1(charBuffer));
    }

    public C4726Xm2 q0() {
        this.Z0 = 0;
        return this;
    }

    public int q1(Reader reader) throws IOException {
        int i = this.Z0;
        G0(i + 1);
        char[] cArr = this.X;
        int i2 = this.Z0;
        int read = reader.read(cArr, i2, cArr.length - i2);
        if (read == -1) {
            return -1;
        }
        do {
            int i3 = this.Z0 + read;
            this.Z0 = i3;
            G0(i3 + 1);
            char[] cArr2 = this.X;
            int i4 = this.Z0;
            read = reader.read(cArr2, i4, cArr2.length - i4);
        } while (read != -1);
        return this.Z0 - i;
    }

    public C4726Xm2 r(CharBuffer charBuffer, int i, int i2) {
        if (charBuffer == null) {
            return G();
        }
        if (charBuffer.hasArray()) {
            int remaining = charBuffer.remaining();
            if (i >= 0 && i <= remaining) {
                if (i2 >= 0 && i + i2 <= remaining) {
                    int length = length();
                    G0(length + i2);
                    System.arraycopy(charBuffer.array(), charBuffer.arrayOffset() + charBuffer.position() + i, this.X, length, i2);
                    this.Z0 += i2;
                    return this;
                }
                throw new StringIndexOutOfBoundsException("length must be valid");
            }
            throw new StringIndexOutOfBoundsException("startIndex must be valid");
        }
        k(charBuffer.toString(), i, i2);
        return this;
    }

    public boolean r0(char c2) {
        char[] cArr = this.X;
        for (int i = 0; i < this.Z0; i++) {
            if (cArr[i] == c2) {
                return true;
            }
        }
        return false;
    }

    public int r1(Reader reader, int i) throws IOException {
        if (i <= 0) {
            return 0;
        }
        int i2 = this.Z0;
        G0(i2 + i);
        int read = reader.read(this.X, this.Z0, i);
        if (read == -1) {
            return -1;
        }
        do {
            i -= read;
            int i3 = this.Z0 + read;
            this.Z0 = i3;
            read = reader.read(this.X, i3, i);
            if (i <= 0) {
                break;
            }
        } while (read != -1);
        return this.Z0 - i2;
    }

    public C4726Xm2 s(C4726Xm2 c4726Xm2) {
        return t(c4726Xm2, 0, C4500Ve2.F1(c4726Xm2));
    }

    public boolean s0(String str) {
        if (Q0(str, 0) < 0) {
            return false;
        }
        return true;
    }

    public int s1(Readable readable) throws IOException {
        if (readable instanceof Reader) {
            return q1((Reader) readable);
        }
        if (readable instanceof CharBuffer) {
            return t1((CharBuffer) readable);
        }
        int i = this.Z0;
        while (true) {
            G0(this.Z0 + 1);
            char[] cArr = this.X;
            int i2 = this.Z0;
            int read = readable.read(CharBuffer.wrap(cArr, i2, cArr.length - i2));
            if (read == -1) {
                return this.Z0 - i;
            }
            this.Z0 += read;
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        if (i >= 0) {
            if (i2 <= this.Z0) {
                if (i <= i2) {
                    return Q1(i, i2);
                }
                throw new StringIndexOutOfBoundsException(i2 - i);
            }
            throw new StringIndexOutOfBoundsException(i2);
        }
        throw new StringIndexOutOfBoundsException(i);
    }

    public C4726Xm2 t(C4726Xm2 c4726Xm2, int i, int i2) {
        int i3;
        if (c4726Xm2 == null) {
            return G();
        }
        if (i >= 0 && i <= c4726Xm2.length()) {
            if (i2 >= 0 && (i3 = i + i2) <= c4726Xm2.length()) {
                if (i2 > 0) {
                    int length = length();
                    G0(length + i2);
                    c4726Xm2.getChars(i, i3, this.X, length);
                    this.Z0 += i2;
                }
                return this;
            }
            throw new StringIndexOutOfBoundsException("length must be valid");
        }
        throw new StringIndexOutOfBoundsException("startIndex must be valid");
    }

    public boolean t0(InterfaceC2828Ee2 interfaceC2828Ee2) {
        if (T0(interfaceC2828Ee2, 0) < 0) {
            return false;
        }
        return true;
    }

    public int t1(CharBuffer charBuffer) {
        int i = this.Z0;
        int remaining = charBuffer.remaining();
        G0(this.Z0 + remaining);
        charBuffer.get(this.X, this.Z0, remaining);
        int i2 = this.Z0 + remaining;
        this.Z0 = i2;
        return i2 - i;
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return new String(this.X, 0, this.Z0);
    }

    public C4726Xm2 u(boolean z) {
        if (z) {
            G0(this.Z0 + e1);
            P(this.Z0);
            return this;
        }
        G0(this.Z0 + d1);
        A(this.Z0);
        return this;
    }

    public C4726Xm2 u0(int i, int i2) {
        int X1 = X1(i, i2);
        int i3 = X1 - i;
        if (i3 > 0) {
            C0(i, X1, i3);
        }
        return this;
    }

    public final void u1(int i) {
        this.X = Arrays.copyOf(this.X, i);
        this.Y0++;
    }

    public C4726Xm2 v(char[] cArr) {
        if (cArr == null) {
            return G();
        }
        int length = cArr.length;
        if (length > 0) {
            int length2 = length();
            G0(length2 + length);
            System.arraycopy(cArr, 0, this.X, length2, length);
            this.Z0 += length;
        }
        return this;
    }

    public C4726Xm2 v0(char c2) {
        int i = 0;
        while (i < this.Z0) {
            if (this.X[i] == c2) {
                int i2 = i;
                do {
                    i2++;
                    if (i2 >= this.Z0) {
                        break;
                    }
                } while (this.X[i2] == c2);
                int i3 = i2 - i;
                C0(i, i2, i3);
                i = i2 - i3;
            }
            i++;
        }
        return this;
    }

    public C4726Xm2 v1(int i, int i2, String str) {
        int length;
        int X1 = X1(i, i2);
        if (str == null) {
            length = 0;
        } else {
            length = str.length();
        }
        E1(i, X1, X1 - i, str, length);
        return this;
    }

    public C4726Xm2 w(char[] cArr, int i, int i2) {
        if (cArr == null) {
            return G();
        }
        if (i >= 0 && i <= cArr.length) {
            if (i2 >= 0 && i + i2 <= cArr.length) {
                if (i2 > 0) {
                    int length = length();
                    G0(length + i2);
                    System.arraycopy(cArr, i, this.X, length, i2);
                    this.Z0 += i2;
                }
                return this;
            }
            throw new StringIndexOutOfBoundsException("Invalid length: " + i2);
        }
        throw new StringIndexOutOfBoundsException("Invalid startIndex: " + i2);
    }

    public C4726Xm2 w0(String str) {
        int length;
        if (str == null) {
            length = 0;
        } else {
            length = str.length();
        }
        if (length > 0) {
            int Q0 = Q0(str, 0);
            while (Q0 >= 0) {
                C0(Q0, Q0 + length, length);
                Q0 = Q0(str, Q0);
            }
        }
        return this;
    }

    public C4726Xm2 w1(InterfaceC2828Ee2 interfaceC2828Ee2, String str, int i, int i2, int i3) {
        return D1(interfaceC2828Ee2, str, i, X1(i, i2), i3);
    }

    public C4726Xm2 x(Iterable<?> iterable) {
        if (iterable != null) {
            iterable.forEach(new C4629Wm2(this));
        }
        return this;
    }

    public C4726Xm2 x0(InterfaceC2828Ee2 interfaceC2828Ee2) {
        return w1(interfaceC2828Ee2, null, 0, this.Z0, -1);
    }

    public C4726Xm2 x1(char c2, char c3) {
        if (c2 != c3) {
            for (int i = 0; i < this.Z0; i++) {
                char[] cArr = this.X;
                if (cArr[i] == c2) {
                    cArr[i] = c3;
                }
            }
        }
        return this;
    }

    public C4726Xm2 y(Iterator<?> it) {
        if (it != null) {
            it.forEachRemaining(new C4629Wm2(this));
        }
        return this;
    }

    public C4726Xm2 y0(int i) {
        W1(i);
        C0(i, i + 1, 1);
        return this;
    }

    public C4726Xm2 y1(String str, String str2) {
        int length;
        int length2;
        if (str == null) {
            length = 0;
        } else {
            length = str.length();
        }
        if (length > 0) {
            if (str2 == null) {
                length2 = 0;
            } else {
                length2 = str2.length();
            }
            int Q0 = Q0(str, 0);
            while (Q0 >= 0) {
                E1(Q0, Q0 + length, length, str2, length2);
                Q0 = Q0(str, Q0 + length2);
            }
        }
        return this;
    }

    public <T> C4726Xm2 z(T... tArr) {
        if (tArr != null && tArr.length > 0) {
            for (T t : tArr) {
                i(t);
            }
        }
        return this;
    }

    public C4726Xm2 z0(char c2) {
        for (int i = 0; i < this.Z0; i++) {
            if (this.X[i] == c2) {
                C0(i, i + 1, 1);
                return this;
            }
        }
        return this;
    }

    public C4726Xm2 z1(InterfaceC2828Ee2 interfaceC2828Ee2, String str) {
        return w1(interfaceC2828Ee2, str, 0, this.Z0, -1);
    }

    /* renamed from: o.Xm2$a */
    /* loaded from: classes4.dex */
    public class a extends Reader {
        public int X;
        public int Y;

        public a() {
        }

        @Override // java.io.Reader
        public void mark(int i) {
            this.X = this.Y;
        }

        @Override // java.io.Reader
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.Reader
        public int read() {
            if (ready()) {
                C4726Xm2 c4726Xm2 = C4726Xm2.this;
                int i = this.Y;
                this.Y = i + 1;
                return c4726Xm2.charAt(i);
            }
            return -1;
        }

        @Override // java.io.Reader
        public boolean ready() {
            if (this.Y < C4726Xm2.this.N1()) {
                return true;
            }
            return false;
        }

        @Override // java.io.Reader
        public void reset() {
            this.Y = this.X;
        }

        @Override // java.io.Reader
        public long skip(long j) {
            if (this.Y + j > C4726Xm2.this.N1()) {
                j = C4726Xm2.this.N1() - this.Y;
            }
            if (j < 0) {
                return 0L;
            }
            this.Y = Math.addExact(this.Y, Math.toIntExact(j));
            return j;
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) {
            int i3;
            if (i < 0 || i2 < 0 || i > cArr.length || (i3 = i + i2) > cArr.length || i3 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (i2 == 0) {
                return 0;
            }
            if (this.Y >= C4726Xm2.this.N1()) {
                return -1;
            }
            if (this.Y + i2 > C4726Xm2.this.N1()) {
                i2 = C4726Xm2.this.N1() - this.Y;
            }
            C4726Xm2 c4726Xm2 = C4726Xm2.this;
            int i4 = this.Y;
            c4726Xm2.getChars(i4, i4 + i2, cArr, i);
            this.Y += i2;
            return i2;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    public C4726Xm2(char[] cArr, int i) {
        Objects.requireNonNull(cArr, "initialBuffer");
        this.X = cArr;
        if (i >= 0 && i <= cArr.length) {
            this.Z0 = i;
            return;
        }
        throw new IllegalArgumentException("initialBuffer.length=" + cArr.length + ", length=" + i);
    }

    public C4726Xm2(CharSequence charSequence) {
        this(C4500Ve2.F1(charSequence) + 32);
        if (charSequence != null) {
            append(charSequence);
        }
    }

    public C4726Xm2(int i) {
        this.X = new char[i <= 0 ? 32 : i];
    }

    public C4726Xm2(String str) {
        this(C4500Ve2.F1(str) + 32);
        if (str != null) {
            j(str);
        }
    }
}
