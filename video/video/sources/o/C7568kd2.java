package o;

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.nio.CharBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

@Deprecated
/* renamed from: o.kd2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7568kd2 implements CharSequence, Appendable, Serializable, InterfaceC4836Yq<String> {
    public static final int Z0 = 32;
    private static final long serialVersionUID = 7628716375283629643L;
    public char[] X;
    public int Y;
    public String Y0;
    public String Z;

    /* renamed from: o.kd2$b */
    /* loaded from: classes4.dex */
    public class b extends C9294rd2 {
        public b() {
        }

        @Override // o.C9294rd2
        public List<String> S(char[] cArr, int i, int i2) {
            if (cArr == null) {
                C7568kd2 c7568kd2 = C7568kd2.this;
                return super.S(c7568kd2.X, 0, c7568kd2.B1());
            }
            return super.S(cArr, i, i2);
        }

        @Override // o.C9294rd2
        public String j() {
            String j = super.j();
            if (j == null) {
                return C7568kd2.this.toString();
            }
            return j;
        }
    }

    /* renamed from: o.kd2$c */
    /* loaded from: classes4.dex */
    public class c extends Writer {
        public c() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr) {
            C7568kd2.this.v(cArr);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            C7568kd2.this.w(cArr, i, i2);
        }

        @Override // java.io.Writer
        public void write(int i) {
            C7568kd2.this.append((char) i);
        }

        @Override // java.io.Writer
        public void write(String str) {
            C7568kd2.this.j(str);
        }

        @Override // java.io.Writer
        public void write(String str, int i, int i2) {
            C7568kd2.this.k(str, i, i2);
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }
    }

    public C7568kd2() {
        this(32);
    }

    public C7568kd2 A(int i, int i2, char c2) {
        return B(String.valueOf(i), i2, c2);
    }

    public final void A0(int i, int i2, int i3) {
        char[] cArr = this.X;
        System.arraycopy(cArr, i2, cArr, i, this.Y - i2);
        this.Y -= i3;
    }

    public C7568kd2 A1(String str) {
        if (str != null && str.isEmpty()) {
            str = null;
        }
        this.Y0 = str;
        return this;
    }

    public C7568kd2 B(Object obj, int i, char c2) {
        String obj2;
        if (i > 0) {
            C0(this.Y + i);
            if (obj == null) {
                obj2 = H0();
            } else {
                obj2 = obj.toString();
            }
            if (obj2 == null) {
                obj2 = "";
            }
            int length = obj2.length();
            if (length >= i) {
                obj2.getChars(length - i, length, this.X, this.Y);
            } else {
                int i2 = i - length;
                for (int i3 = 0; i3 < i2; i3++) {
                    this.X[this.Y + i3] = c2;
                }
                obj2.getChars(0, length, this.X, this.Y + i2);
            }
            this.Y += i;
        }
        return this;
    }

    public boolean B0(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return true;
        }
        int i = this.Y;
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

    public int B1() {
        return this.Y;
    }

    public C7568kd2 C(int i, int i2, char c2) {
        return D(String.valueOf(i), i2, c2);
    }

    public C7568kd2 C0(int i) {
        char[] cArr = this.X;
        if (i > cArr.length) {
            char[] cArr2 = new char[i * 2];
            this.X = cArr2;
            System.arraycopy(cArr, 0, cArr2, 0, this.Y);
        }
        return this;
    }

    public boolean C1(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return true;
        }
        if (length > this.Y) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (this.X[i] != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public C7568kd2 D(Object obj, int i, char c2) {
        String obj2;
        if (i > 0) {
            C0(this.Y + i);
            if (obj == null) {
                obj2 = H0();
            } else {
                obj2 = obj.toString();
            }
            if (obj2 == null) {
                obj2 = "";
            }
            int length = obj2.length();
            if (length >= i) {
                obj2.getChars(0, i, this.X, this.Y);
            } else {
                int i2 = i - length;
                obj2.getChars(0, length, this.X, this.Y);
                for (int i3 = 0; i3 < i2; i3++) {
                    this.X[this.Y + length + i3] = c2;
                }
            }
            this.Y += i;
        }
        return this;
    }

    public boolean D0(C7568kd2 c7568kd2) {
        int i;
        if (this == c7568kd2) {
            return true;
        }
        if (c7568kd2 == null || (i = this.Y) != c7568kd2.Y) {
            return false;
        }
        char[] cArr = this.X;
        char[] cArr2 = c7568kd2.X;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (cArr[i2] != cArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public String D1(int i) {
        return E1(i, this.Y);
    }

    public C7568kd2 E() {
        String str = this.Z;
        if (str == null) {
            j(System.lineSeparator());
            return this;
        }
        return j(str);
    }

    public boolean E0(C7568kd2 c7568kd2) {
        if (this == c7568kd2) {
            return true;
        }
        int i = this.Y;
        if (i != c7568kd2.Y) {
            return false;
        }
        char[] cArr = this.X;
        char[] cArr2 = c7568kd2.X;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            char c2 = cArr[i2];
            char c3 = cArr2[i2];
            if (c2 != c3 && Character.toUpperCase(c2) != Character.toUpperCase(c3)) {
                return false;
            }
        }
        return true;
    }

    public String E1(int i, int i2) {
        return new String(this.X, i, L1(i, i2) - i);
    }

    public C7568kd2 F() {
        String str = this.Y0;
        if (str == null) {
            return this;
        }
        return j(str);
    }

    public char[] F0(char[] cArr) {
        int length = length();
        if (cArr == null || cArr.length < length) {
            cArr = new char[length];
        }
        System.arraycopy(this.X, 0, cArr, 0, length);
        return cArr;
    }

    public char[] F1() {
        int i = this.Y;
        if (i == 0) {
            return C4206Se.e;
        }
        char[] cArr = new char[i];
        System.arraycopy(this.X, 0, cArr, 0, i);
        return cArr;
    }

    public C7568kd2 G(int i, char c2) {
        if (i >= 0) {
            C0(this.Y + i);
            for (int i2 = 0; i2 < i; i2++) {
                char[] cArr = this.X;
                int i3 = this.Y;
                this.Y = i3 + 1;
                cArr[i3] = c2;
            }
        }
        return this;
    }

    public String G0() {
        return this.Z;
    }

    public char[] G1(int i, int i2) {
        int L1 = L1(i, i2) - i;
        if (L1 == 0) {
            return C4206Se.e;
        }
        char[] cArr = new char[L1];
        System.arraycopy(this.X, i, cArr, 0, L1);
        return cArr;
    }

    public C7568kd2 H(char c2) {
        if (a1()) {
            append(c2);
        }
        return this;
    }

    public String H0() {
        return this.Y0;
    }

    public StringBuffer H1() {
        StringBuffer stringBuffer = new StringBuffer(this.Y);
        stringBuffer.append(this.X, 0, this.Y);
        return stringBuffer;
    }

    public C7568kd2 I(char c2, char c3) {
        if (a1()) {
            append(c2);
            return this;
        }
        append(c3);
        return this;
    }

    public int I0(char c2) {
        return J0(c2, 0);
    }

    public StringBuilder I1() {
        StringBuilder sb = new StringBuilder(this.Y);
        sb.append(this.X, 0, this.Y);
        return sb;
    }

    public C7568kd2 J(char c2, int i) {
        if (i > 0) {
            append(c2);
        }
        return this;
    }

    public int J0(char c2, int i) {
        int max = Math.max(i, 0);
        if (max >= this.Y) {
            return -1;
        }
        char[] cArr = this.X;
        while (max < this.Y) {
            if (cArr[max] == c2) {
                return max;
            }
            max++;
        }
        return -1;
    }

    public C7568kd2 J1() {
        int i = this.Y;
        if (i != 0) {
            char[] cArr = this.X;
            int i2 = 0;
            while (i2 < i && cArr[i2] <= ' ') {
                i2++;
            }
            while (i2 < i && cArr[i - 1] <= ' ') {
                i--;
            }
            int i3 = this.Y;
            if (i < i3) {
                s0(i, i3);
            }
            if (i2 > 0) {
                s0(0, i2);
            }
        }
        return this;
    }

    public C7568kd2 K(String str) {
        return M(str, null);
    }

    public int K0(String str) {
        return L0(str, 0);
    }

    public void K1(int i) {
        if (i >= 0 && i <= this.Y) {
            return;
        }
        throw new StringIndexOutOfBoundsException(i);
    }

    public C7568kd2 L(String str, int i) {
        if (str != null && i > 0) {
            j(str);
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
        r10 = r10 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int L0(String str, int i) {
        int max = Math.max(i, 0);
        if (str != null && max < this.Y) {
            int length = str.length();
            if (length == 1) {
                return J0(str.charAt(0), max);
            }
            if (length == 0) {
                return max;
            }
            int i2 = this.Y;
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

    public int L1(int i, int i2) {
        if (i >= 0) {
            int i3 = this.Y;
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

    public C7568kd2 M(String str, String str2) {
        if (isEmpty()) {
            str = str2;
        }
        if (str != null) {
            j(str);
        }
        return this;
    }

    public int M0(AbstractC8559od2 abstractC8559od2) {
        return N0(abstractC8559od2, 0);
    }

    public void N(Appendable appendable) throws IOException {
        if (appendable instanceof Writer) {
            ((Writer) appendable).write(this.X, 0, this.Y);
        } else if (appendable instanceof StringBuilder) {
            ((StringBuilder) appendable).append(this.X, 0, this.Y);
        } else if (appendable instanceof StringBuffer) {
            ((StringBuffer) appendable).append(this.X, 0, this.Y);
        } else if (appendable instanceof CharBuffer) {
            ((CharBuffer) appendable).put(this.X, 0, this.Y);
        } else {
            appendable.append(this);
        }
    }

    public int N0(AbstractC8559od2 abstractC8559od2, int i) {
        int i2;
        int max = Math.max(i, 0);
        if (abstractC8559od2 != null && max < (i2 = this.Y)) {
            char[] cArr = this.X;
            for (int i3 = max; i3 < i2; i3++) {
                if (abstractC8559od2.g(cArr, i3, max, i2) > 0) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public C7568kd2 O(Iterable<?> iterable, String str) {
        if (iterable != null) {
            P(iterable.iterator(), str);
        }
        return this;
    }

    public C7568kd2 O0(int i, char c2) {
        K1(i);
        C0(this.Y + 1);
        char[] cArr = this.X;
        System.arraycopy(cArr, i, cArr, i + 1, this.Y - i);
        this.X[i] = c2;
        this.Y++;
        return this;
    }

    public C7568kd2 P(Iterator<?> it, String str) {
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

    public C7568kd2 P0(int i, double d) {
        return W0(i, String.valueOf(d));
    }

    public C7568kd2 Q(Object[] objArr, String str) {
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

    public C7568kd2 Q0(int i, float f) {
        return W0(i, String.valueOf(f));
    }

    public C7568kd2 R(char c2) {
        return append(c2).E();
    }

    public C7568kd2 R0(int i, int i2) {
        return W0(i, String.valueOf(i2));
    }

    public C7568kd2 S(double d) {
        return c(d).E();
    }

    public C7568kd2 T(float f) {
        return d(f).E();
    }

    public C7568kd2 T0(int i, long j) {
        return W0(i, String.valueOf(j));
    }

    public C7568kd2 U(int i) {
        return e(i).E();
    }

    public C7568kd2 U0(int i, Object obj) {
        if (obj == null) {
            return W0(i, this.Y0);
        }
        return W0(i, obj.toString());
    }

    public C7568kd2 V(long j) {
        return f(j).E();
    }

    public C7568kd2 W(Object obj) {
        return i(obj).E();
    }

    public C7568kd2 W0(int i, String str) {
        int length;
        K1(i);
        if (str == null) {
            str = this.Y0;
        }
        if (str != null && (length = str.length()) > 0) {
            int i2 = this.Y + length;
            C0(i2);
            char[] cArr = this.X;
            System.arraycopy(cArr, i, cArr, i + length, this.Y - i);
            this.Y = i2;
            str.getChars(0, length, this.X, i);
        }
        return this;
    }

    public C7568kd2 X(String str) {
        return j(str).E();
    }

    public C7568kd2 X0(int i, boolean z) {
        K1(i);
        if (z) {
            C0(this.Y + 4);
            char[] cArr = this.X;
            System.arraycopy(cArr, i, cArr, i + 4, this.Y - i);
            char[] cArr2 = this.X;
            cArr2[i] = 't';
            cArr2[i + 1] = 'r';
            cArr2[i + 2] = 'u';
            cArr2[i + 3] = 'e';
            this.Y += 4;
            return this;
        }
        C0(this.Y + 5);
        char[] cArr3 = this.X;
        System.arraycopy(cArr3, i, cArr3, i + 5, this.Y - i);
        char[] cArr4 = this.X;
        cArr4[i] = 'f';
        cArr4[i + 1] = 'a';
        cArr4[i + 2] = 'l';
        cArr4[i + 3] = 's';
        cArr4[i + 4] = 'e';
        this.Y += 5;
        return this;
    }

    public C7568kd2 Y(String str, int i, int i2) {
        return k(str, i, i2).E();
    }

    public C7568kd2 Y0(int i, char[] cArr) {
        K1(i);
        if (cArr == null) {
            return W0(i, this.Y0);
        }
        int length = cArr.length;
        if (length > 0) {
            C0(this.Y + length);
            char[] cArr2 = this.X;
            System.arraycopy(cArr2, i, cArr2, i + length, this.Y - i);
            System.arraycopy(cArr, 0, this.X, i, length);
            this.Y += length;
        }
        return this;
    }

    public C7568kd2 Z(String str, Object... objArr) {
        return l(str, objArr).E();
    }

    public C7568kd2 Z0(int i, char[] cArr, int i2, int i3) {
        K1(i);
        if (cArr == null) {
            return W0(i, this.Y0);
        }
        if (i2 >= 0 && i2 <= cArr.length) {
            if (i3 >= 0 && i2 + i3 <= cArr.length) {
                if (i3 > 0) {
                    C0(this.Y + i3);
                    char[] cArr2 = this.X;
                    System.arraycopy(cArr2, i, cArr2, i + i3, this.Y - i);
                    System.arraycopy(cArr, i2, this.X, i, i3);
                    this.Y += i3;
                }
                return this;
            }
            throw new StringIndexOutOfBoundsException("Invalid length: " + i3);
        }
        throw new StringIndexOutOfBoundsException("Invalid offset: " + i2);
    }

    public C7568kd2 a0(StringBuffer stringBuffer) {
        return m(stringBuffer).E();
    }

    public boolean a1() {
        if (this.Y > 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Appendable
    /* renamed from: b */
    public C7568kd2 append(char c2) {
        C0(length() + 1);
        char[] cArr = this.X;
        int i = this.Y;
        this.Y = i + 1;
        cArr[i] = c2;
        return this;
    }

    public C7568kd2 b0(StringBuffer stringBuffer, int i, int i2) {
        return n(stringBuffer, i, i2).E();
    }

    public int b1(char c2) {
        return c1(c2, this.Y - 1);
    }

    public C7568kd2 c(double d) {
        return j(String.valueOf(d));
    }

    public C7568kd2 c0(StringBuilder sb) {
        return o(sb).E();
    }

    public int c1(char c2, int i) {
        int i2 = this.Y;
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

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        if (i >= 0 && i < length()) {
            return this.X[i];
        }
        throw new StringIndexOutOfBoundsException(i);
    }

    public C7568kd2 d(float f) {
        return j(String.valueOf(f));
    }

    public C7568kd2 d0(StringBuilder sb, int i, int i2) {
        return p(sb, i, i2).E();
    }

    public int d1(String str) {
        return e1(str, this.Y - 1);
    }

    public C7568kd2 e(int i) {
        return j(String.valueOf(i));
    }

    public C7568kd2 e0(C7568kd2 c7568kd2) {
        return s(c7568kd2).E();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0036, code lost:
        r9 = r9 - 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int e1(String str, int i) {
        int i2 = this.Y;
        if (i >= i2) {
            i = i2 - 1;
        }
        if (str != null && i >= 0) {
            int length = str.length();
            if (length > 0 && length <= this.Y) {
                if (length == 1) {
                    return c1(str.charAt(0), i);
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

    public boolean equals(Object obj) {
        if ((obj instanceof C7568kd2) && D0((C7568kd2) obj)) {
            return true;
        }
        return false;
    }

    public C7568kd2 f(long j) {
        return j(String.valueOf(j));
    }

    public C7568kd2 f0(C7568kd2 c7568kd2, int i, int i2) {
        return t(c7568kd2, i, i2).E();
    }

    public int f1(AbstractC8559od2 abstractC8559od2) {
        return g1(abstractC8559od2, this.Y);
    }

    @Override // java.lang.Appendable
    /* renamed from: g */
    public C7568kd2 append(CharSequence charSequence) {
        if (charSequence == null) {
            return F();
        }
        if (charSequence instanceof C7568kd2) {
            return s((C7568kd2) charSequence);
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

    public C7568kd2 g0(boolean z) {
        return u(z).E();
    }

    public int g1(AbstractC8559od2 abstractC8559od2, int i) {
        int i2 = this.Y;
        if (i >= i2) {
            i = i2 - 1;
        }
        if (abstractC8559od2 != null && i >= 0) {
            char[] cArr = this.X;
            int i3 = i + 1;
            while (i >= 0) {
                if (abstractC8559od2.g(cArr, i, 0, i3) > 0) {
                    return i;
                }
                i--;
            }
        }
        return -1;
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
    public C7568kd2 append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            return F();
        }
        return k(charSequence.toString(), i, i2);
    }

    public C7568kd2 h0(char[] cArr) {
        return v(cArr).E();
    }

    public String h1(int i) {
        if (i <= 0) {
            return "";
        }
        int i2 = this.Y;
        if (i >= i2) {
            return new String(this.X, 0, i2);
        }
        return new String(this.X, 0, i);
    }

    public int hashCode() {
        char[] cArr = this.X;
        int i = 0;
        for (int i2 = this.Y - 1; i2 >= 0; i2--) {
            i = (i * 31) + cArr[i2];
        }
        return i;
    }

    public C7568kd2 i(Object obj) {
        if (obj == null) {
            return F();
        }
        if (obj instanceof CharSequence) {
            return append((CharSequence) obj);
        }
        return j(obj.toString());
    }

    public C7568kd2 i0(char[] cArr, int i, int i2) {
        return w(cArr, i, i2).E();
    }

    public String i1(int i, int i2) {
        int i3;
        if (i < 0) {
            i = 0;
        }
        if (i2 > 0 && i < (i3 = this.Y)) {
            if (i3 <= i + i2) {
                return new String(this.X, i, i3 - i);
            }
            return new String(this.X, i, i2);
        }
        return "";
    }

    public boolean isEmpty() {
        if (this.Y == 0) {
            return true;
        }
        return false;
    }

    public C7568kd2 j(String str) {
        if (str == null) {
            return F();
        }
        int length = str.length();
        if (length > 0) {
            int length2 = length();
            C0(length2 + length);
            str.getChars(0, length, this.X, length2);
            this.Y += length;
        }
        return this;
    }

    public Reader j0() {
        return new a();
    }

    public C7568kd2 j1() {
        if (this.X.length > length()) {
            char[] cArr = this.X;
            char[] cArr2 = new char[length()];
            this.X = cArr2;
            System.arraycopy(cArr, 0, cArr2, 0, this.Y);
        }
        return this;
    }

    public C7568kd2 k(String str, int i, int i2) {
        int i3;
        if (str == null) {
            return F();
        }
        if (i >= 0 && i <= str.length()) {
            if (i2 >= 0 && (i3 = i + i2) <= str.length()) {
                if (i2 > 0) {
                    int length = length();
                    C0(length + i2);
                    str.getChars(i, i3, this.X, length);
                    this.Y += i2;
                }
                return this;
            }
            throw new StringIndexOutOfBoundsException("length must be valid");
        }
        throw new StringIndexOutOfBoundsException("startIndex must be valid");
    }

    public C9294rd2 k0() {
        return new b();
    }

    public int k1(Readable readable) throws IOException {
        int i = this.Y;
        if (readable instanceof Reader) {
            Reader reader = (Reader) readable;
            C0(i + 1);
            while (true) {
                char[] cArr = this.X;
                int i2 = this.Y;
                int read = reader.read(cArr, i2, cArr.length - i2);
                if (read == -1) {
                    break;
                }
                int i3 = this.Y + read;
                this.Y = i3;
                C0(i3 + 1);
            }
        } else if (readable instanceof CharBuffer) {
            CharBuffer charBuffer = (CharBuffer) readable;
            int remaining = charBuffer.remaining();
            C0(this.Y + remaining);
            charBuffer.get(this.X, this.Y, remaining);
            this.Y += remaining;
        } else {
            while (true) {
                C0(this.Y + 1);
                char[] cArr2 = this.X;
                int i4 = this.Y;
                int read2 = readable.read(CharBuffer.wrap(cArr2, i4, cArr2.length - i4));
                if (read2 == -1) {
                    break;
                }
                this.Y += read2;
            }
        }
        return this.Y - i;
    }

    public C7568kd2 l(String str, Object... objArr) {
        return j(String.format(str, objArr));
    }

    public Writer l0() {
        return new c();
    }

    public C7568kd2 l1(int i, int i2, String str) {
        int length;
        int L1 = L1(i, i2);
        if (str == null) {
            length = 0;
        } else {
            length = str.length();
        }
        u1(i, L1, L1 - i, str, length);
        return this;
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.Y;
    }

    public C7568kd2 m(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return F();
        }
        int length = stringBuffer.length();
        if (length > 0) {
            int length2 = length();
            C0(length2 + length);
            stringBuffer.getChars(0, length, this.X, length2);
            this.Y += length;
        }
        return this;
    }

    @Override // o.InterfaceC4836Yq
    /* renamed from: m0 */
    public String build() {
        return toString();
    }

    public C7568kd2 m1(AbstractC8559od2 abstractC8559od2, String str, int i, int i2, int i3) {
        return t1(abstractC8559od2, str, i, L1(i, i2), i3);
    }

    public C7568kd2 n(StringBuffer stringBuffer, int i, int i2) {
        int i3;
        if (stringBuffer == null) {
            return F();
        }
        if (i >= 0 && i <= stringBuffer.length()) {
            if (i2 >= 0 && (i3 = i + i2) <= stringBuffer.length()) {
                if (i2 > 0) {
                    int length = length();
                    C0(length + i2);
                    stringBuffer.getChars(i, i3, this.X, length);
                    this.Y += i2;
                }
                return this;
            }
            throw new StringIndexOutOfBoundsException("length must be valid");
        }
        throw new StringIndexOutOfBoundsException("startIndex must be valid");
    }

    public int n0() {
        return this.X.length;
    }

    public C7568kd2 n1(char c2, char c3) {
        if (c2 != c3) {
            for (int i = 0; i < this.Y; i++) {
                char[] cArr = this.X;
                if (cArr[i] == c2) {
                    cArr[i] = c3;
                }
            }
        }
        return this;
    }

    public C7568kd2 o(StringBuilder sb) {
        if (sb == null) {
            return F();
        }
        int length = sb.length();
        if (length > 0) {
            int length2 = length();
            C0(length2 + length);
            sb.getChars(0, length, this.X, length2);
            this.Y += length;
        }
        return this;
    }

    public C7568kd2 o0() {
        this.Y = 0;
        return this;
    }

    public C7568kd2 o1(String str, String str2) {
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
            int L0 = L0(str, 0);
            while (L0 >= 0) {
                u1(L0, L0 + length, length, str2, length2);
                L0 = L0(str, L0 + length2);
            }
        }
        return this;
    }

    public C7568kd2 p(StringBuilder sb, int i, int i2) {
        int i3;
        if (sb == null) {
            return F();
        }
        if (i >= 0 && i <= sb.length()) {
            if (i2 >= 0 && (i3 = i + i2) <= sb.length()) {
                if (i2 > 0) {
                    int length = length();
                    C0(length + i2);
                    sb.getChars(i, i3, this.X, length);
                    this.Y += i2;
                }
                return this;
            }
            throw new StringIndexOutOfBoundsException("length must be valid");
        }
        throw new StringIndexOutOfBoundsException("startIndex must be valid");
    }

    public boolean p0(char c2) {
        char[] cArr = this.X;
        for (int i = 0; i < this.Y; i++) {
            if (cArr[i] == c2) {
                return true;
            }
        }
        return false;
    }

    public C7568kd2 p1(AbstractC8559od2 abstractC8559od2, String str) {
        return m1(abstractC8559od2, str, 0, this.Y, -1);
    }

    public C7568kd2 q(CharBuffer charBuffer) {
        if (charBuffer == null) {
            return F();
        }
        if (charBuffer.hasArray()) {
            int remaining = charBuffer.remaining();
            int length = length();
            C0(length + remaining);
            System.arraycopy(charBuffer.array(), charBuffer.arrayOffset() + charBuffer.position(), this.X, length, remaining);
            this.Y += remaining;
            return this;
        }
        j(charBuffer.toString());
        return this;
    }

    public boolean q0(String str) {
        if (L0(str, 0) < 0) {
            return false;
        }
        return true;
    }

    public C7568kd2 q1(char c2, char c3) {
        if (c2 != c3) {
            for (int i = 0; i < this.Y; i++) {
                char[] cArr = this.X;
                if (cArr[i] == c2) {
                    cArr[i] = c3;
                    return this;
                }
            }
        }
        return this;
    }

    public C7568kd2 r(CharBuffer charBuffer, int i, int i2) {
        if (charBuffer == null) {
            return F();
        }
        if (charBuffer.hasArray()) {
            int remaining = charBuffer.remaining();
            if (i >= 0 && i <= remaining) {
                if (i2 >= 0 && i + i2 <= remaining) {
                    int length = length();
                    C0(length + i2);
                    System.arraycopy(charBuffer.array(), charBuffer.arrayOffset() + charBuffer.position() + i, this.X, length, i2);
                    this.Y += i2;
                    return this;
                }
                throw new StringIndexOutOfBoundsException("length must be valid");
            }
            throw new StringIndexOutOfBoundsException("startIndex must be valid");
        }
        k(charBuffer.toString(), i, i2);
        return this;
    }

    public boolean r0(AbstractC8559od2 abstractC8559od2) {
        if (N0(abstractC8559od2, 0) < 0) {
            return false;
        }
        return true;
    }

    public C7568kd2 r1(String str, String str2) {
        int length;
        int L0;
        int i = 0;
        if (str == null) {
            length = 0;
        } else {
            length = str.length();
        }
        if (length > 0 && (L0 = L0(str, 0)) >= 0) {
            if (str2 != null) {
                i = str2.length();
            }
            u1(L0, L0 + length, length, str2, i);
            return this;
        }
        return this;
    }

    public C7568kd2 s(C7568kd2 c7568kd2) {
        if (c7568kd2 == null) {
            return F();
        }
        int length = c7568kd2.length();
        if (length > 0) {
            int length2 = length();
            C0(length2 + length);
            System.arraycopy(c7568kd2.X, 0, this.X, length2, length);
            this.Y += length;
        }
        return this;
    }

    public C7568kd2 s0(int i, int i2) {
        int L1 = L1(i, i2);
        int i3 = L1 - i;
        if (i3 > 0) {
            A0(i, L1, i3);
        }
        return this;
    }

    public C7568kd2 s1(AbstractC8559od2 abstractC8559od2, String str) {
        return m1(abstractC8559od2, str, 0, this.Y, 1);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        if (i >= 0) {
            if (i2 <= this.Y) {
                if (i <= i2) {
                    return E1(i, i2);
                }
                throw new StringIndexOutOfBoundsException(i2 - i);
            }
            throw new StringIndexOutOfBoundsException(i2);
        }
        throw new StringIndexOutOfBoundsException(i);
    }

    public C7568kd2 t(C7568kd2 c7568kd2, int i, int i2) {
        int i3;
        if (c7568kd2 == null) {
            return F();
        }
        if (i >= 0 && i <= c7568kd2.length()) {
            if (i2 >= 0 && (i3 = i + i2) <= c7568kd2.length()) {
                if (i2 > 0) {
                    int length = length();
                    C0(length + i2);
                    c7568kd2.getChars(i, i3, this.X, length);
                    this.Y += i2;
                }
                return this;
            }
            throw new StringIndexOutOfBoundsException("length must be valid");
        }
        throw new StringIndexOutOfBoundsException("startIndex must be valid");
    }

    public C7568kd2 t0(char c2) {
        int i = 0;
        while (i < this.Y) {
            if (this.X[i] == c2) {
                int i2 = i;
                do {
                    i2++;
                    if (i2 >= this.Y) {
                        break;
                    }
                } while (this.X[i2] == c2);
                int i3 = i2 - i;
                A0(i, i2, i3);
                i = i2 - i3;
            }
            i++;
        }
        return this;
    }

    public final C7568kd2 t1(AbstractC8559od2 abstractC8559od2, String str, int i, int i2, int i3) {
        int length;
        String str2;
        if (abstractC8559od2 != null && this.Y != 0) {
            if (str == null) {
                length = 0;
            } else {
                length = str.length();
            }
            int i4 = length;
            int i5 = i;
            while (i5 < i2 && i3 != 0) {
                int g = abstractC8559od2.g(this.X, i5, i, i2);
                if (g > 0) {
                    str2 = str;
                    u1(i5, i5 + g, g, str2, i4);
                    i2 = (i2 - g) + i4;
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

    @Override // java.lang.CharSequence
    public String toString() {
        return new String(this.X, 0, this.Y);
    }

    public C7568kd2 u(boolean z) {
        if (z) {
            C0(this.Y + 4);
            char[] cArr = this.X;
            int i = this.Y;
            int i2 = i + 1;
            this.Y = i2;
            cArr[i] = 't';
            int i3 = i + 2;
            this.Y = i3;
            cArr[i2] = 'r';
            int i4 = i + 3;
            this.Y = i4;
            cArr[i3] = 'u';
            this.Y = i + 4;
            cArr[i4] = 'e';
            return this;
        }
        C0(this.Y + 5);
        char[] cArr2 = this.X;
        int i5 = this.Y;
        int i6 = i5 + 1;
        this.Y = i6;
        cArr2[i5] = 'f';
        int i7 = i5 + 2;
        this.Y = i7;
        cArr2[i6] = 'a';
        int i8 = i5 + 3;
        this.Y = i8;
        cArr2[i7] = 'l';
        int i9 = i5 + 4;
        this.Y = i9;
        cArr2[i8] = 's';
        this.Y = i5 + 5;
        cArr2[i9] = 'e';
        return this;
    }

    public C7568kd2 u0(String str) {
        int length;
        if (str == null) {
            length = 0;
        } else {
            length = str.length();
        }
        if (length > 0) {
            int L0 = L0(str, 0);
            while (L0 >= 0) {
                A0(L0, L0 + length, length);
                L0 = L0(str, L0);
            }
        }
        return this;
    }

    public final void u1(int i, int i2, int i3, String str, int i4) {
        int i5 = (this.Y - i3) + i4;
        if (i4 != i3) {
            C0(i5);
            char[] cArr = this.X;
            System.arraycopy(cArr, i2, cArr, i + i4, this.Y - i2);
            this.Y = i5;
        }
        if (i4 > 0) {
            str.getChars(0, i4, this.X, i);
        }
    }

    public C7568kd2 v(char[] cArr) {
        if (cArr == null) {
            return F();
        }
        int length = cArr.length;
        if (length > 0) {
            int length2 = length();
            C0(length2 + length);
            System.arraycopy(cArr, 0, this.X, length2, length);
            this.Y += length;
        }
        return this;
    }

    public C7568kd2 v0(AbstractC8559od2 abstractC8559od2) {
        return m1(abstractC8559od2, null, 0, this.Y, -1);
    }

    public C7568kd2 v1() {
        int i = this.Y;
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

    public C7568kd2 w(char[] cArr, int i, int i2) {
        if (cArr == null) {
            return F();
        }
        if (i >= 0 && i <= cArr.length) {
            if (i2 >= 0 && i + i2 <= cArr.length) {
                if (i2 > 0) {
                    int length = length();
                    C0(length + i2);
                    System.arraycopy(cArr, i, this.X, length, i2);
                    this.Y += i2;
                }
                return this;
            }
            throw new StringIndexOutOfBoundsException("Invalid length: " + i2);
        }
        throw new StringIndexOutOfBoundsException("Invalid startIndex: " + i2);
    }

    public C7568kd2 w0(int i) {
        if (i >= 0 && i < this.Y) {
            A0(i, i + 1, 1);
            return this;
        }
        throw new StringIndexOutOfBoundsException(i);
    }

    public String w1(int i) {
        if (i <= 0) {
            return "";
        }
        int i2 = this.Y;
        if (i >= i2) {
            return new String(this.X, 0, i2);
        }
        return new String(this.X, i2 - i, i);
    }

    public C7568kd2 x(Iterable<?> iterable) {
        if (iterable != null) {
            iterable.forEach(new Consumer() { // from class: o.id2
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    C7568kd2.this.i(obj);
                }
            });
        }
        return this;
    }

    public C7568kd2 x0(char c2) {
        for (int i = 0; i < this.Y; i++) {
            if (this.X[i] == c2) {
                A0(i, i + 1, 1);
                return this;
            }
        }
        return this;
    }

    public C7568kd2 x1(int i, char c2) {
        if (i >= 0 && i < length()) {
            this.X[i] = c2;
            return this;
        }
        throw new StringIndexOutOfBoundsException(i);
    }

    public C7568kd2 y(Iterator<?> it) {
        if (it != null) {
            while (it.hasNext()) {
                i(it.next());
            }
        }
        return this;
    }

    public C7568kd2 y0(String str) {
        int length;
        int L0;
        if (str == null) {
            length = 0;
        } else {
            length = str.length();
        }
        if (length > 0 && (L0 = L0(str, 0)) >= 0) {
            A0(L0, L0 + length, length);
        }
        return this;
    }

    public C7568kd2 y1(int i) {
        if (i >= 0) {
            int i2 = this.Y;
            if (i < i2) {
                this.Y = i;
                return this;
            }
            if (i > i2) {
                C0(i);
                this.Y = i;
                for (int i3 = this.Y; i3 < i; i3++) {
                    this.X[i3] = 0;
                }
            }
            return this;
        }
        throw new StringIndexOutOfBoundsException(i);
    }

    public <T> C7568kd2 z(T... tArr) {
        if (tArr != null && tArr.length > 0) {
            for (T t : tArr) {
                i(t);
            }
        }
        return this;
    }

    public C7568kd2 z0(AbstractC8559od2 abstractC8559od2) {
        return m1(abstractC8559od2, null, 0, this.Y, 1);
    }

    public C7568kd2 z1(String str) {
        this.Z = str;
        return this;
    }

    /* renamed from: o.kd2$a */
    /* loaded from: classes4.dex */
    public class a extends Reader {
        public int X;
        public int Y;

        public a() {
        }

        @Override // java.io.Reader
        public void mark(int i) {
            this.Y = this.X;
        }

        @Override // java.io.Reader
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.Reader
        public int read() {
            if (ready()) {
                C7568kd2 c7568kd2 = C7568kd2.this;
                int i = this.X;
                this.X = i + 1;
                return c7568kd2.charAt(i);
            }
            return -1;
        }

        @Override // java.io.Reader
        public boolean ready() {
            if (this.X < C7568kd2.this.B1()) {
                return true;
            }
            return false;
        }

        @Override // java.io.Reader
        public void reset() {
            this.X = this.Y;
        }

        @Override // java.io.Reader
        public long skip(long j) {
            if (this.X + j > C7568kd2.this.B1()) {
                j = C7568kd2.this.B1() - this.X;
            }
            if (j < 0) {
                return 0L;
            }
            this.X = Math.addExact(this.X, Math.toIntExact(j));
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
            if (this.X >= C7568kd2.this.B1()) {
                return -1;
            }
            if (this.X + i2 > C7568kd2.this.B1()) {
                i2 = C7568kd2.this.B1() - this.X;
            }
            C7568kd2 c7568kd2 = C7568kd2.this;
            int i4 = this.X;
            c7568kd2.getChars(i4, i4 + i2, cArr, i);
            this.X += i2;
            return i2;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    public C7568kd2(int i) {
        this.X = new char[i <= 0 ? 32 : i];
    }

    public C7568kd2(String str) {
        if (str == null) {
            this.X = new char[32];
            return;
        }
        this.X = new char[str.length() + 32];
        j(str);
    }
}
