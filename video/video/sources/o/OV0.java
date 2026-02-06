package o;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
public class OV0 implements Closeable {
    public static final int A1 = 14;
    public static final int B1 = 15;
    public static final int C1 = 16;
    public static final int D1 = 17;
    public static final int E1 = 0;
    public static final int F1 = 1;
    public static final int G1 = 2;
    public static final int H1 = 3;
    public static final int I1 = 4;
    public static final int J1 = 5;
    public static final int K1 = 6;
    public static final int L1 = 7;
    public static final int M1 = 255;
    public static final int N1 = 1024;
    public static final long l1 = -922337203685477580L;
    public static final int m1 = 0;
    public static final int n1 = 1;
    public static final int o1 = 2;
    public static final int p1 = 3;
    public static final int q1 = 4;
    public static final int r1 = 5;
    public static final int s1 = 6;
    public static final int t1 = 7;
    public static final int u1 = 8;
    public static final int v1 = 9;
    public static final int w1 = 10;
    public static final int x1 = 11;
    public static final int y1 = 12;
    public static final int z1 = 13;
    public final Reader X;
    public long e1;
    public int f1;
    public String g1;
    public int[] h1;
    public String[] j1;
    public int[] k1;
    public EnumC7572ke2 Y = EnumC7572ke2.LEGACY_STRICT;
    public int Z = 255;
    public final char[] Y0 = new char[1024];
    public int Z0 = 0;
    public int a1 = 0;
    public int b1 = 0;
    public int c1 = 0;
    public int d1 = 0;
    public int i1 = 1;

    /* loaded from: classes3.dex */
    public class a extends PV0 {
        @Override // o.PV0
        public void a(OV0 ov0) throws IOException {
            if (ov0 instanceof YV0) {
                ((YV0) ov0).k0();
                return;
            }
            int i = ov0.d1;
            if (i == 0) {
                i = ov0.j();
            }
            if (i == 13) {
                ov0.d1 = 9;
            } else if (i == 12) {
                ov0.d1 = 8;
            } else if (i == 14) {
                ov0.d1 = 10;
            } else {
                throw ov0.b0("a name");
            }
        }
    }

    static {
        PV0.a = new a();
    }

    public OV0(Reader reader) {
        int[] iArr = new int[32];
        this.h1 = iArr;
        iArr[0] = 6;
        this.j1 = new String[32];
        this.k1 = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.X = reader;
    }

    private String o(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (true) {
            int i2 = this.i1;
            if (i < i2) {
                int i3 = this.h1[i];
                switch (i3) {
                    case 1:
                    case 2:
                        int i4 = this.k1[i];
                        if (z && i4 > 0 && i == i2 - 1) {
                            i4--;
                        }
                        sb.append('[');
                        sb.append(i4);
                        sb.append(']');
                        break;
                    case 3:
                    case 4:
                    case 5:
                        sb.append('.');
                        String str = this.j1[i];
                        if (str == null) {
                            break;
                        } else {
                            sb.append(str);
                            break;
                        }
                    case 6:
                    case 7:
                    case 8:
                        break;
                    default:
                        throw new AssertionError("Unknown scope value: " + i3);
                }
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    public String A() throws IOException {
        String F;
        int i = this.d1;
        if (i == 0) {
            i = j();
        }
        if (i == 14) {
            F = H();
        } else if (i == 12) {
            F = F('\'');
        } else if (i == 13) {
            F = F('\"');
        } else {
            throw b0("a name");
        }
        this.d1 = 0;
        this.j1[this.i1 - 1] = F;
        return F;
    }

    public final int C(boolean z) throws IOException {
        char c;
        char[] cArr = this.Y0;
        int i = this.Z0;
        int i2 = this.a1;
        while (true) {
            if (i == i2) {
                this.Z0 = i;
                if (!m(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input" + u());
                }
                i = this.Z0;
                i2 = this.a1;
            }
            int i3 = i + 1;
            c = cArr[i];
            if (c == '\n') {
                this.b1++;
                this.c1 = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.Z0 = i3;
                    if (i3 == i2) {
                        this.Z0 = i;
                        boolean m = m(2);
                        this.Z0++;
                        if (!m) {
                            break;
                        }
                    }
                    h();
                    int i4 = this.Z0;
                    char c2 = cArr[i4];
                    if (c2 != '*') {
                        if (c2 != '/') {
                            break;
                        }
                        this.Z0 = i4 + 1;
                        V();
                        i = this.Z0;
                        i2 = this.a1;
                    } else {
                        this.Z0 = i4 + 1;
                        if (U("*/")) {
                            i = this.Z0 + 2;
                            i2 = this.a1;
                        } else {
                            throw a0("Unterminated comment");
                        }
                    }
                } else if (c == '#') {
                    this.Z0 = i3;
                    h();
                    V();
                    i = this.Z0;
                    i2 = this.a1;
                } else {
                    this.Z0 = i3;
                    return c;
                }
            }
            i = i3;
        }
        return c;
    }

    public void E() throws IOException {
        int i = this.d1;
        if (i == 0) {
            i = j();
        }
        if (i == 7) {
            this.d1 = 0;
            int[] iArr = this.k1;
            int i2 = this.i1 - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw b0("null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
        if (r1 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
        r1.append(r0, r3, r2 - r3);
        r10.Z0 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String F(char c) throws IOException {
        char[] cArr = this.Y0;
        StringBuilder sb = null;
        do {
            int i = this.Z0;
            int i2 = this.a1;
            while (true) {
                int i3 = i2;
                int i4 = i;
                while (i < i3) {
                    int i5 = i + 1;
                    char c2 = cArr[i];
                    if (this.Y == EnumC7572ke2.STRICT && c2 < ' ') {
                        throw a0("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                    }
                    if (c2 == c) {
                        this.Z0 = i5;
                        int i6 = (i5 - i4) - 1;
                        if (sb == null) {
                            return new String(cArr, i4, i6);
                        }
                        sb.append(cArr, i4, i6);
                        return sb.toString();
                    } else if (c2 == '\\') {
                        this.Z0 = i5;
                        int i7 = i5 - i4;
                        int i8 = i7 - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max(i7 * 2, 16));
                        }
                        sb.append(cArr, i4, i8);
                        sb.append(P());
                        i = this.Z0;
                        i2 = this.a1;
                    } else {
                        if (c2 == '\n') {
                            this.b1++;
                            this.c1 = i5;
                        }
                        i = i5;
                    }
                }
                break;
            }
        } while (m(1));
        throw a0("Unterminated string");
    }

    public String G() throws IOException {
        String str;
        int i = this.d1;
        if (i == 0) {
            i = j();
        }
        if (i == 10) {
            str = H();
        } else if (i == 8) {
            str = F('\'');
        } else if (i == 9) {
            str = F('\"');
        } else if (i == 11) {
            str = this.g1;
            this.g1 = null;
        } else if (i == 15) {
            str = Long.toString(this.e1);
        } else if (i == 16) {
            str = new String(this.Y0, this.Z0, this.f1);
            this.Z0 += this.f1;
        } else {
            throw b0("a string");
        }
        this.d1 = 0;
        int[] iArr = this.k1;
        int i2 = this.i1 - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
        h();
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String H() throws IOException {
        String sb;
        StringBuilder sb2 = null;
        int i = 0;
        do {
            int i2 = 0;
            while (true) {
                int i3 = this.Z0;
                if (i3 + i2 < this.a1) {
                    char c = this.Y0[i3 + i2];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i2++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i2 < this.Y0.length) {
                    if (m(i2 + 1)) {
                    }
                } else {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i2, 16));
                    }
                    sb2.append(this.Y0, this.Z0, i2);
                    this.Z0 += i2;
                }
            }
            i = i2;
            if (sb2 != null) {
                sb = new String(this.Y0, this.Z0, i);
            } else {
                sb2.append(this.Y0, this.Z0, i);
                sb = sb2.toString();
            }
            this.Z0 += i;
            return sb;
        } while (m(1));
        if (sb2 != null) {
        }
        this.Z0 += i;
        return sb;
    }

    public XV0 I() throws IOException {
        int i = this.d1;
        if (i == 0) {
            i = j();
        }
        switch (i) {
            case 1:
                return XV0.BEGIN_OBJECT;
            case 2:
                return XV0.END_OBJECT;
            case 3:
                return XV0.BEGIN_ARRAY;
            case 4:
                return XV0.END_ARRAY;
            case 5:
            case 6:
                return XV0.BOOLEAN;
            case 7:
                return XV0.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return XV0.STRING;
            case 12:
            case 13:
            case 14:
                return XV0.NAME;
            case 15:
            case 16:
                return XV0.NUMBER;
            case 17:
                return XV0.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final int M() throws IOException {
        String str;
        String str2;
        int i;
        boolean z;
        char c = this.Y0[this.Z0];
        if (c != 't' && c != 'T') {
            if (c != 'f' && c != 'F') {
                if (c != 'n' && c != 'N') {
                    return 0;
                }
                str = "null";
                str2 = "NULL";
                i = 7;
            } else {
                str = C3855Oo.a;
                str2 = "FALSE";
                i = 6;
            }
        } else {
            str = "true";
            str2 = "TRUE";
            i = 5;
        }
        if (this.Y != EnumC7572ke2.STRICT) {
            z = true;
        } else {
            z = false;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (this.Z0 + i2 >= this.a1 && !m(i2 + 1)) {
                return 0;
            }
            char c2 = this.Y0[this.Z0 + i2];
            if (c2 != str.charAt(i2) && (!z || c2 != str2.charAt(i2))) {
                return 0;
            }
        }
        if ((this.Z0 + length < this.a1 || m(length + 1)) && t(this.Y0[this.Z0 + length])) {
            return 0;
        }
        this.Z0 += length;
        this.d1 = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0093, code lost:
        if (t(r14) != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0095, code lost:
        if (r9 != 2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0097, code lost:
        if (r10 == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009d, code lost:
        if (r11 != Long.MIN_VALUE) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009f, code lost:
        if (r13 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a3, code lost:
        if (r11 != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a5, code lost:
        if (r13 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a7, code lost:
        if (r13 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00aa, code lost:
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ab, code lost:
        r19.e1 = r11;
        r19.Z0 += r8;
        r19.d1 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b6, code lost:
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b7, code lost:
        if (r9 == 2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ba, code lost:
        if (r9 == 4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00bd, code lost:
        if (r9 != 7) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c0, code lost:
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c1, code lost:
        r19.f1 = r8;
        r19.d1 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c7, code lost:
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c8, code lost:
        return r18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int N() throws IOException {
        int i;
        int i2;
        char[] cArr = this.Y0;
        int i3 = this.Z0;
        int i4 = this.a1;
        int i5 = 0;
        int i6 = 0;
        char c = 0;
        boolean z = false;
        int i7 = 1;
        long j = 0;
        while (true) {
            char c2 = 2;
            if (i3 + i6 == i4) {
                if (i6 == cArr.length) {
                    return i5;
                }
                if (!m(i6 + 1)) {
                    i = i5;
                    break;
                }
                i3 = this.Z0;
                i4 = this.a1;
            }
            char c3 = cArr[i3 + i6];
            i = i5;
            if (c3 != '+') {
                if (c3 != 'E' && c3 != 'e') {
                    if (c3 != '-') {
                        if (c3 != '.') {
                            if (c3 < '0' || c3 > '9') {
                                break;
                            } else if (c != 1 && c != 0) {
                                if (c == 2) {
                                    if (j == 0) {
                                        return i;
                                    }
                                    long j2 = (10 * j) - (c3 - '0');
                                    int i8 = (j > (-922337203685477580L) ? 1 : (j == (-922337203685477580L) ? 0 : -1));
                                    if (i8 <= 0 && (i8 != 0 || j2 >= j)) {
                                        i2 = i;
                                    } else {
                                        i2 = 1;
                                    }
                                    i7 &= i2;
                                    j = j2;
                                } else if (c == 3) {
                                    c = 4;
                                } else if (c == 5 || c == 6) {
                                    c = 7;
                                }
                            } else {
                                j = -(c3 - '0');
                            }
                        } else if (c == 2) {
                            c = 3;
                        } else {
                            return i;
                        }
                    } else {
                        c2 = 6;
                        if (c == 0) {
                            c = 1;
                            z = true;
                        } else if (c != 5) {
                            return i;
                        }
                    }
                } else if (c != 2 && c != 4) {
                    return i;
                } else {
                    c = 5;
                }
                i6++;
                i5 = i;
            } else {
                c2 = 6;
                if (c != 5) {
                    return i;
                }
            }
            c = c2;
            i6++;
            i5 = i;
        }
    }

    public final void O(int i) throws A71 {
        int i2 = this.i1;
        if (i2 - 1 < this.Z) {
            int[] iArr = this.h1;
            if (i2 == iArr.length) {
                int i3 = i2 * 2;
                this.h1 = Arrays.copyOf(iArr, i3);
                this.k1 = Arrays.copyOf(this.k1, i3);
                this.j1 = (String[]) Arrays.copyOf(this.j1, i3);
            }
            int[] iArr2 = this.h1;
            int i4 = this.i1;
            this.i1 = i4 + 1;
            iArr2[i4] = i;
            return;
        }
        throw new A71("Nesting limit " + this.Z + " reached" + u());
    }

    public final char P() throws IOException {
        int i;
        if (this.Z0 == this.a1 && !m(1)) {
            throw a0("Unterminated escape sequence");
        }
        char[] cArr = this.Y0;
        int i2 = this.Z0;
        int i3 = i2 + 1;
        this.Z0 = i3;
        char c = cArr[i2];
        if (c != '\n') {
            if (c != '\"') {
                if (c != '\'') {
                    if (c != '/' && c != '\\') {
                        if (c != 'b') {
                            if (c != 'f') {
                                if (c == 'n') {
                                    return '\n';
                                }
                                if (c != 'r') {
                                    if (c != 't') {
                                        if (c == 'u') {
                                            if (i2 + 5 > this.a1 && !m(4)) {
                                                throw a0("Unterminated escape sequence");
                                            }
                                            int i4 = this.Z0;
                                            int i5 = i4 + 4;
                                            int i6 = 0;
                                            while (i4 < i5) {
                                                char c2 = this.Y0[i4];
                                                int i7 = i6 << 4;
                                                if (c2 >= '0' && c2 <= '9') {
                                                    i = c2 - '0';
                                                } else if (c2 >= 'a' && c2 <= 'f') {
                                                    i = c2 - 'W';
                                                } else if (c2 >= 'A' && c2 <= 'F') {
                                                    i = c2 - '7';
                                                } else {
                                                    throw a0("Malformed Unicode escape \\u" + new String(this.Y0, this.Z0, 4));
                                                }
                                                i6 = i7 + i;
                                                i4++;
                                            }
                                            this.Z0 += 4;
                                            return (char) i6;
                                        }
                                        throw a0("Invalid escape sequence");
                                    }
                                    return '\t';
                                }
                                return C8206nB.d;
                            }
                            return '\f';
                        }
                        return '\b';
                    }
                }
            }
            return c;
        } else if (this.Y != EnumC7572ke2.STRICT) {
            this.b1++;
            this.c1 = i3;
        } else {
            throw a0("Cannot escape a newline character in strict mode");
        }
        if (this.Y == EnumC7572ke2.STRICT) {
            throw a0("Invalid escaped character \"'\" in strict mode");
        }
        return c;
    }

    @Deprecated
    public final void Q(boolean z) {
        EnumC7572ke2 enumC7572ke2;
        if (z) {
            enumC7572ke2 = EnumC7572ke2.LENIENT;
        } else {
            enumC7572ke2 = EnumC7572ke2.LEGACY_STRICT;
        }
        S(enumC7572ke2);
    }

    public final void R(int i) {
        if (i >= 0) {
            this.Z = i;
            return;
        }
        throw new IllegalArgumentException("Invalid nesting limit: " + i);
    }

    public final void S(EnumC7572ke2 enumC7572ke2) {
        Objects.requireNonNull(enumC7572ke2);
        this.Y = enumC7572ke2;
    }

    public final void T(char c) throws IOException {
        char[] cArr = this.Y0;
        do {
            int i = this.Z0;
            int i2 = this.a1;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.Z0 = i3;
                    return;
                } else if (c2 == '\\') {
                    this.Z0 = i3;
                    P();
                    i = this.Z0;
                    i2 = this.a1;
                } else {
                    if (c2 == '\n') {
                        this.b1++;
                        this.c1 = i3;
                    }
                    i = i3;
                }
            }
            this.Z0 = i;
        } while (m(1));
        throw a0("Unterminated string");
    }

    public final boolean U(String str) throws IOException {
        int length = str.length();
        while (true) {
            if (this.Z0 + length > this.a1 && !m(length)) {
                return false;
            }
            char[] cArr = this.Y0;
            int i = this.Z0;
            if (cArr[i] == '\n') {
                this.b1++;
                this.c1 = i + 1;
            } else {
                for (int i2 = 0; i2 < length; i2++) {
                    if (this.Y0[this.Z0 + i2] != str.charAt(i2)) {
                        break;
                    }
                }
                return true;
            }
            this.Z0++;
        }
    }

    public final void V() throws IOException {
        char c;
        do {
            if (this.Z0 < this.a1 || m(1)) {
                char[] cArr = this.Y0;
                int i = this.Z0;
                int i2 = i + 1;
                this.Z0 = i2;
                c = cArr[i];
                if (c == '\n') {
                    this.b1++;
                    this.c1 = i2;
                    return;
                }
            } else {
                return;
            }
        } while (c != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
        h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W() throws IOException {
        do {
            int i = 0;
            while (true) {
                int i2 = this.Z0;
                if (i2 + i < this.a1) {
                    char c = this.Y0[i2 + i];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    this.Z0 = i2 + i;
                }
            }
            this.Z0 += i;
            return;
        } while (m(1));
    }

    public String Y() {
        return o(false);
    }

    public void Z() throws IOException {
        int i = 0;
        do {
            int i2 = this.d1;
            if (i2 == 0) {
                i2 = j();
            }
            switch (i2) {
                case 1:
                    O(3);
                    i++;
                    break;
                case 2:
                    if (i == 0) {
                        this.j1[this.i1 - 1] = null;
                    }
                    this.i1--;
                    i--;
                    break;
                case 3:
                    O(1);
                    i++;
                    break;
                case 4:
                    this.i1--;
                    i--;
                    break;
                case 8:
                    T('\'');
                    break;
                case 9:
                    T('\"');
                    break;
                case 10:
                    W();
                    break;
                case 12:
                    T('\'');
                    if (i == 0) {
                        this.j1[this.i1 - 1] = "<skipped>";
                        break;
                    }
                    break;
                case 13:
                    T('\"');
                    if (i == 0) {
                        this.j1[this.i1 - 1] = "<skipped>";
                        break;
                    }
                    break;
                case 14:
                    W();
                    if (i == 0) {
                        this.j1[this.i1 - 1] = "<skipped>";
                        break;
                    }
                    break;
                case 16:
                    this.Z0 += this.f1;
                    break;
                case 17:
                    return;
            }
            this.d1 = 0;
        } while (i > 0);
        int[] iArr = this.k1;
        int i3 = this.i1 - 1;
        iArr[i3] = iArr[i3] + 1;
    }

    public final A71 a0(String str) throws A71 {
        throw new A71(str + u() + "\nSee " + Bu2.a("malformed-json"));
    }

    public final IllegalStateException b0(String str) throws IOException {
        String str2;
        if (I() == XV0.NULL) {
            str2 = "adapter-not-null-safe";
        } else {
            str2 = "unexpected-json-structure";
        }
        return new IllegalStateException("Expected " + str + " but was " + I() + u() + "\nSee " + Bu2.a(str2));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.d1 = 0;
        this.h1[0] = 8;
        this.i1 = 1;
        this.X.close();
    }

    public void d() throws IOException {
        int i = this.d1;
        if (i == 0) {
            i = j();
        }
        if (i == 3) {
            O(1);
            this.k1[this.i1 - 1] = 0;
            this.d1 = 0;
            return;
        }
        throw b0("BEGIN_ARRAY");
    }

    public void f() throws IOException {
        int i = this.d1;
        if (i == 0) {
            i = j();
        }
        if (i == 1) {
            O(3);
            this.d1 = 0;
            return;
        }
        throw b0("BEGIN_OBJECT");
    }

    public final void h() throws A71 {
        if (this.Y == EnumC7572ke2.LENIENT) {
            return;
        }
        throw a0("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
    }

    public final void i() throws IOException {
        C(true);
        int i = this.Z0;
        this.Z0 = i - 1;
        if (i + 4 <= this.a1 || m(5)) {
            int i2 = this.Z0;
            char[] cArr = this.Y0;
            if (cArr[i2] == ')' && cArr[i2 + 1] == ']' && cArr[i2 + 2] == '}' && cArr[i2 + 3] == '\'' && cArr[i2 + 4] == '\n') {
                this.Z0 = i2 + 5;
            }
        }
    }

    public int j() throws IOException {
        int C;
        int[] iArr = this.h1;
        int i = this.i1;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int C2 = C(true);
            if (C2 != 44) {
                if (C2 != 59) {
                    if (C2 == 93) {
                        this.d1 = 4;
                        return 4;
                    }
                    throw a0("Unterminated array");
                }
                h();
            }
        } else if (i2 != 3 && i2 != 5) {
            if (i2 == 4) {
                iArr[i - 1] = 5;
                int C3 = C(true);
                if (C3 != 58) {
                    if (C3 == 61) {
                        h();
                        if (this.Z0 < this.a1 || m(1)) {
                            char[] cArr = this.Y0;
                            int i3 = this.Z0;
                            if (cArr[i3] == '>') {
                                this.Z0 = i3 + 1;
                            }
                        }
                    } else {
                        throw a0("Expected ':'");
                    }
                }
            } else if (i2 == 6) {
                if (this.Y == EnumC7572ke2.LENIENT) {
                    i();
                }
                this.h1[this.i1 - 1] = 7;
            } else if (i2 == 7) {
                if (C(false) == -1) {
                    this.d1 = 17;
                    return 17;
                }
                h();
                this.Z0--;
            } else if (i2 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        } else {
            iArr[i - 1] = 4;
            if (i2 == 5 && (C = C(true)) != 44) {
                if (C != 59) {
                    if (C == 125) {
                        this.d1 = 2;
                        return 2;
                    }
                    throw a0("Unterminated object");
                }
                h();
            }
            int C4 = C(true);
            if (C4 != 34) {
                if (C4 != 39) {
                    if (C4 != 125) {
                        h();
                        this.Z0--;
                        if (t((char) C4)) {
                            this.d1 = 14;
                            return 14;
                        }
                        throw a0("Expected name");
                    } else if (i2 != 5) {
                        this.d1 = 2;
                        return 2;
                    } else {
                        throw a0("Expected name");
                    }
                }
                h();
                this.d1 = 12;
                return 12;
            }
            this.d1 = 13;
            return 13;
        }
        int C5 = C(true);
        if (C5 != 34) {
            if (C5 != 39) {
                if (C5 != 44 && C5 != 59) {
                    if (C5 != 91) {
                        if (C5 != 93) {
                            if (C5 != 123) {
                                this.Z0--;
                                int M = M();
                                if (M != 0) {
                                    return M;
                                }
                                int N = N();
                                if (N != 0) {
                                    return N;
                                }
                                if (t(this.Y0[this.Z0])) {
                                    h();
                                    this.d1 = 10;
                                    return 10;
                                }
                                throw a0("Expected value");
                            }
                            this.d1 = 1;
                            return 1;
                        } else if (i2 == 1) {
                            this.d1 = 4;
                            return 4;
                        }
                    } else {
                        this.d1 = 3;
                        return 3;
                    }
                }
                if (i2 != 1 && i2 != 2) {
                    throw a0("Unexpected value");
                }
                h();
                this.Z0--;
                this.d1 = 7;
                return 7;
            }
            h();
            this.d1 = 8;
            return 8;
        }
        this.d1 = 9;
        return 9;
    }

    public void k() throws IOException {
        int i = this.d1;
        if (i == 0) {
            i = j();
        }
        if (i == 4) {
            int i2 = this.i1;
            this.i1 = i2 - 1;
            int[] iArr = this.k1;
            int i3 = i2 - 2;
            iArr[i3] = iArr[i3] + 1;
            this.d1 = 0;
            return;
        }
        throw b0("END_ARRAY");
    }

    public void l() throws IOException {
        int i = this.d1;
        if (i == 0) {
            i = j();
        }
        if (i == 2) {
            int i2 = this.i1;
            int i3 = i2 - 1;
            this.i1 = i3;
            this.j1[i3] = null;
            int[] iArr = this.k1;
            int i4 = i2 - 2;
            iArr[i4] = iArr[i4] + 1;
            this.d1 = 0;
            return;
        }
        throw b0("END_OBJECT");
    }

    public final boolean m(int i) throws IOException {
        int i2;
        int i3;
        char[] cArr = this.Y0;
        int i4 = this.c1;
        int i5 = this.Z0;
        this.c1 = i4 - i5;
        int i6 = this.a1;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.a1 = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.a1 = 0;
        }
        this.Z0 = 0;
        do {
            Reader reader = this.X;
            int i8 = this.a1;
            int read = reader.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.a1 + read;
            this.a1 = i2;
            if (this.b1 == 0 && (i3 = this.c1) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.Z0++;
                this.c1 = i3 + 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    public final int n() {
        return this.Z;
    }

    public String p() {
        return o(true);
    }

    public final EnumC7572ke2 q() {
        return this.Y;
    }

    public boolean r() throws IOException {
        int i = this.d1;
        if (i == 0) {
            i = j();
        }
        if (i != 2 && i != 4 && i != 17) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if (this.Y == EnumC7572ke2.LENIENT) {
            return true;
        }
        return false;
    }

    public final boolean t(char c) throws IOException {
        if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
            if (c != '#') {
                if (c != ',') {
                    if (c != '/' && c != '=') {
                        if (c != '{' && c != '}' && c != ':') {
                            if (c != ';') {
                                switch (c) {
                                    case '[':
                                    case ']':
                                        return false;
                                    case '\\':
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            h();
            return false;
        }
        return false;
    }

    public String toString() {
        return getClass().getSimpleName() + u();
    }

    public String u() {
        return " at line " + (this.b1 + 1) + " column " + ((this.Z0 - this.c1) + 1) + " path " + Y();
    }

    public boolean v() throws IOException {
        int i = this.d1;
        if (i == 0) {
            i = j();
        }
        if (i == 5) {
            this.d1 = 0;
            int[] iArr = this.k1;
            int i2 = this.i1 - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.d1 = 0;
            int[] iArr2 = this.k1;
            int i3 = this.i1 - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw b0("a boolean");
        }
    }

    public double x() throws IOException {
        char c;
        int i = this.d1;
        if (i == 0) {
            i = j();
        }
        if (i == 15) {
            this.d1 = 0;
            int[] iArr = this.k1;
            int i2 = this.i1 - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.e1;
        }
        if (i == 16) {
            this.g1 = new String(this.Y0, this.Z0, this.f1);
            this.Z0 += this.f1;
        } else if (i != 8 && i != 9) {
            if (i == 10) {
                this.g1 = H();
            } else if (i != 11) {
                throw b0("a double");
            }
        } else {
            if (i == 8) {
                c = '\'';
            } else {
                c = '\"';
            }
            this.g1 = F(c);
        }
        this.d1 = 11;
        double parseDouble = Double.parseDouble(this.g1);
        if (this.Y != EnumC7572ke2.LENIENT && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw a0("JSON forbids NaN and infinities: " + parseDouble);
        }
        this.g1 = null;
        this.d1 = 0;
        int[] iArr2 = this.k1;
        int i3 = this.i1 - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseDouble;
    }

    public int y() throws IOException {
        char c;
        int i = this.d1;
        if (i == 0) {
            i = j();
        }
        if (i == 15) {
            long j = this.e1;
            int i2 = (int) j;
            if (j == i2) {
                this.d1 = 0;
                int[] iArr = this.k1;
                int i3 = this.i1 - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.e1 + u());
        }
        if (i == 16) {
            this.g1 = new String(this.Y0, this.Z0, this.f1);
            this.Z0 += this.f1;
        } else if (i != 8 && i != 9 && i != 10) {
            throw b0("an int");
        } else {
            if (i == 10) {
                this.g1 = H();
            } else {
                if (i == 8) {
                    c = '\'';
                } else {
                    c = '\"';
                }
                this.g1 = F(c);
            }
            try {
                int parseInt = Integer.parseInt(this.g1);
                this.d1 = 0;
                int[] iArr2 = this.k1;
                int i4 = this.i1 - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.d1 = 11;
        double parseDouble = Double.parseDouble(this.g1);
        int i5 = (int) parseDouble;
        if (i5 == parseDouble) {
            this.g1 = null;
            this.d1 = 0;
            int[] iArr3 = this.k1;
            int i6 = this.i1 - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        throw new NumberFormatException("Expected an int but was " + this.g1 + u());
    }

    public long z() throws IOException {
        char c;
        int i = this.d1;
        if (i == 0) {
            i = j();
        }
        if (i == 15) {
            this.d1 = 0;
            int[] iArr = this.k1;
            int i2 = this.i1 - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.e1;
        }
        if (i == 16) {
            this.g1 = new String(this.Y0, this.Z0, this.f1);
            this.Z0 += this.f1;
        } else if (i != 8 && i != 9 && i != 10) {
            throw b0("a long");
        } else {
            if (i == 10) {
                this.g1 = H();
            } else {
                if (i == 8) {
                    c = '\'';
                } else {
                    c = '\"';
                }
                this.g1 = F(c);
            }
            try {
                long parseLong = Long.parseLong(this.g1);
                this.d1 = 0;
                int[] iArr2 = this.k1;
                int i3 = this.i1 - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.d1 = 11;
        double parseDouble = Double.parseDouble(this.g1);
        long j = (long) parseDouble;
        if (j == parseDouble) {
            this.g1 = null;
            this.d1 = 0;
            int[] iArr3 = this.k1;
            int i4 = this.i1 - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        throw new NumberFormatException("Expected a long but was " + this.g1 + u());
    }
}
