package o;

import java.io.EOFException;
import java.io.IOException;
import o.NV0;

/* renamed from: o.aW0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5104aW0 extends NV0 {
    public static final int A1 = 12;
    public static final int B1 = 13;
    public static final int C1 = 14;
    public static final int D1 = 15;
    public static final int E1 = 16;
    public static final int F1 = 17;
    public static final int G1 = 18;
    public static final int H1 = 0;
    public static final int I1 = 1;
    public static final int J1 = 2;
    public static final int K1 = 3;
    public static final int L1 = 4;
    public static final int M1 = 5;
    public static final int N1 = 6;
    public static final int O1 = 7;
    public static final long i1 = -922337203685477580L;
    public static final C8859ps j1 = C8859ps.s("'\\");
    public static final C8859ps k1 = C8859ps.s("\"\\");
    public static final C8859ps l1 = C8859ps.s("{}[]:, \n\t\r\f/\\;#=");
    public static final C8859ps m1 = C8859ps.s("\n\r");
    public static final C8859ps n1 = C8859ps.s("*/");
    public static final int o1 = 0;
    public static final int p1 = 1;
    public static final int q1 = 2;
    public static final int r1 = 3;
    public static final int s1 = 4;
    public static final int t1 = 5;
    public static final int u1 = 6;
    public static final int v1 = 7;
    public static final int w1 = 8;
    public static final int x1 = 9;
    public static final int y1 = 10;
    public static final int z1 = 11;
    public final InterfaceC2677Cq c1;
    public final C5422bq d1;
    public int e1 = 0;
    public long f1;
    public int g1;
    public String h1;

    public C5104aW0(InterfaceC2677Cq interfaceC2677Cq) {
        if (interfaceC2677Cq != null) {
            this.c1 = interfaceC2677Cq;
            this.d1 = interfaceC2677Cq.L();
            r(6);
            return;
        }
        throw new NullPointerException("source == null");
    }

    public final int A(String str, NV0.a aVar) {
        int length = aVar.a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.a[i])) {
                this.e1 = 0;
                this.Z[this.X - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public final boolean C(int i) throws IOException {
        if (i != 9 && i != 10 && i != 12 && i != 13 && i != 32) {
            if (i != 35) {
                if (i != 44) {
                    if (i != 47 && i != 61) {
                        if (i != 123 && i != 125 && i != 58) {
                            if (i != 59) {
                                switch (i) {
                                    case 91:
                                    case 93:
                                        return false;
                                    case 92:
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
            y();
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
        r6.d1.skip(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        if (r2 != 47) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (r6.c1.e2(2) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        y();
        r3 = r6.d1.x(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
        if (r3 == 42) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
        if (r3 == 47) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
        r6.d1.readByte();
        r6.d1.readByte();
        P();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
        r6.d1.readByte();
        r6.d1.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
        if (O() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
        throw x("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
        if (r2 != 35) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
        y();
        P();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int E(boolean z) throws IOException {
        byte x;
        while (true) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (this.c1.e2(i2)) {
                    x = this.d1.x(i);
                    if (x != 10 && x != 32 && x != 13 && x != 9) {
                        break;
                    }
                    i = i2;
                } else if (!z) {
                    return -1;
                } else {
                    throw new EOFException("End of input");
                }
            }
        }
        return x;
    }

    public final String F(C8859ps c8859ps) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long P4 = this.c1.P4(c8859ps);
            if (P4 != -1) {
                if (this.d1.x(P4) == 92) {
                    if (sb == null) {
                        sb = new StringBuilder();
                    }
                    sb.append(this.d1.e3(P4));
                    this.d1.readByte();
                    sb.append(M());
                } else if (sb == null) {
                    String e3 = this.d1.e3(P4);
                    this.d1.readByte();
                    return e3;
                } else {
                    sb.append(this.d1.e3(P4));
                    this.d1.readByte();
                    return sb.toString();
                }
            } else {
                throw x("Unterminated string");
            }
        }
    }

    public final String G() throws IOException {
        long P4 = this.c1.P4(l1);
        if (P4 != -1) {
            return this.d1.e3(P4);
        }
        return this.d1.Y4();
    }

    public final int H() throws IOException {
        String str;
        String str2;
        int i;
        byte x = this.d1.x(0L);
        if (x != 116 && x != 84) {
            if (x != 102 && x != 70) {
                if (x != 110 && x != 78) {
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
        int length = str.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.c1.e2(i3)) {
                return 0;
            }
            byte x2 = this.d1.x(i2);
            if (x2 != str.charAt(i2) && x2 != str2.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.c1.e2(length + 1) && C(this.d1.x(length))) {
            return 0;
        }
        this.d1.skip(length);
        this.e1 = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0089, code lost:
        if (C(r1) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
        if (r6 != 2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008d, code lost:
        if (r7 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0093, code lost:
        if (r8 != Long.MIN_VALUE) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0095, code lost:
        if (r10 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0099, code lost:
        if (r8 != r16) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009b, code lost:
        if (r10 != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009d, code lost:
        if (r10 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a0, code lost:
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a1, code lost:
        r19.f1 = r8;
        r19.d1.skip(r5);
        r19.e1 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ad, code lost:
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ae, code lost:
        if (r6 == 2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b0, code lost:
        if (r6 == 4) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b3, code lost:
        if (r6 != 7) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b6, code lost:
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b7, code lost:
        r19.g1 = r5;
        r19.e1 = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00bd, code lost:
        return 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00be, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int I() throws IOException {
        long j;
        int i;
        boolean z;
        boolean z2 = true;
        int i2 = 0;
        char c = 0;
        long j2 = 0;
        boolean z3 = false;
        while (true) {
            int i3 = i2 + 1;
            if (!this.c1.e2(i3)) {
                j = 0;
                i = 0;
                break;
            }
            j = 0;
            byte x = this.d1.x(i2);
            i = 0;
            if (x != 43) {
                if (x != 69 && x != 101) {
                    if (x != 45) {
                        if (x != 46) {
                            if (x < 48 || x > 57) {
                                break;
                            } else if (c != 1 && c != 0) {
                                if (c == 2) {
                                    if (j2 == 0) {
                                        return 0;
                                    }
                                    long j3 = (10 * j2) - (x - 48);
                                    int i4 = (j2 > (-922337203685477580L) ? 1 : (j2 == (-922337203685477580L) ? 0 : -1));
                                    if (i4 <= 0 && (i4 != 0 || j3 >= j2)) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    z2 &= z;
                                    j2 = j3;
                                } else if (c == 3) {
                                    c = 4;
                                } else if (c == 5 || c == 6) {
                                    c = 7;
                                }
                            } else {
                                j2 = -(x - 48);
                                c = 2;
                            }
                        } else if (c != 2) {
                            return 0;
                        } else {
                            c = 3;
                        }
                    } else if (c == 0) {
                        c = 1;
                        z3 = true;
                    } else if (c != 5) {
                        return 0;
                    }
                } else if (c != 2 && c != 4) {
                    return 0;
                } else {
                    c = 5;
                }
                i2 = i3;
            } else if (c != 5) {
                return 0;
            }
            c = 6;
            i2 = i3;
        }
    }

    public final char M() throws IOException {
        int i;
        if (this.c1.e2(1L)) {
            byte readByte = this.d1.readByte();
            if (readByte != 10 && readByte != 34 && readByte != 39 && readByte != 47 && readByte != 92) {
                if (readByte != 98) {
                    if (readByte != 102) {
                        if (readByte == 110) {
                            return '\n';
                        }
                        if (readByte != 114) {
                            if (readByte != 116) {
                                if (readByte != 117) {
                                    if (this.Z0) {
                                        return (char) readByte;
                                    }
                                    throw x("Invalid escape sequence: \\" + ((char) readByte));
                                } else if (this.c1.e2(4L)) {
                                    char c = 0;
                                    for (int i2 = 0; i2 < 4; i2++) {
                                        byte x = this.d1.x(i2);
                                        char c2 = (char) (c << 4);
                                        if (x >= 48 && x <= 57) {
                                            i = x - 48;
                                        } else if (x >= 97 && x <= 102) {
                                            i = x - 87;
                                        } else if (x >= 65 && x <= 70) {
                                            i = x + C2638Cg0.v7;
                                        } else {
                                            throw x("\\u" + this.d1.e3(4L));
                                        }
                                        c = (char) (c2 + i);
                                    }
                                    this.d1.skip(4L);
                                    return c;
                                } else {
                                    throw new EOFException("Unterminated escape sequence at path " + Y());
                                }
                            }
                            return '\t';
                        }
                        return C8206nB.d;
                    }
                    return '\f';
                }
                return '\b';
            }
            return (char) readByte;
        }
        throw x("Unterminated escape sequence");
    }

    public final void N(C8859ps c8859ps) throws IOException {
        while (true) {
            long P4 = this.c1.P4(c8859ps);
            if (P4 != -1) {
                if (this.d1.x(P4) == 92) {
                    this.d1.skip(P4 + 1);
                    M();
                } else {
                    this.d1.skip(P4 + 1);
                    return;
                }
            } else {
                throw x("Unterminated string");
            }
        }
    }

    public final boolean O() throws IOException {
        boolean z;
        long size;
        InterfaceC2677Cq interfaceC2677Cq = this.c1;
        C8859ps c8859ps = n1;
        long w12 = interfaceC2677Cq.w1(c8859ps);
        if (w12 != -1) {
            z = true;
        } else {
            z = false;
        }
        C5422bq c5422bq = this.d1;
        if (z) {
            size = w12 + c8859ps.g0();
        } else {
            size = c5422bq.size();
        }
        c5422bq.skip(size);
        return z;
    }

    public final void P() throws IOException {
        long size;
        long P4 = this.c1.P4(m1);
        C5422bq c5422bq = this.d1;
        if (P4 != -1) {
            size = P4 + 1;
        } else {
            size = c5422bq.size();
        }
        c5422bq.skip(size);
    }

    public final void Q() throws IOException {
        long P4 = this.c1.P4(l1);
        C5422bq c5422bq = this.d1;
        if (P4 == -1) {
            P4 = c5422bq.size();
        }
        c5422bq.skip(P4);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.e1 = 0;
        this.Y[0] = 8;
        this.X = 1;
        this.d1.h();
        this.c1.close();
    }

    @Override // o.NV0
    public void d() throws IOException {
        int i = this.e1;
        if (i == 0) {
            i = z();
        }
        if (i == 3) {
            r(1);
            this.Y0[this.X - 1] = 0;
            this.e1 = 0;
            return;
        }
        throw new AV0("Expected BEGIN_ARRAY but was " + q() + " at path " + Y());
    }

    @Override // o.NV0
    public void f() throws IOException {
        int i = this.e1;
        if (i == 0) {
            i = z();
        }
        if (i == 1) {
            r(3);
            this.e1 = 0;
            return;
        }
        throw new AV0("Expected BEGIN_OBJECT but was " + q() + " at path " + Y());
    }

    @Override // o.NV0
    public void h() throws IOException {
        int i = this.e1;
        if (i == 0) {
            i = z();
        }
        if (i == 4) {
            int i2 = this.X;
            this.X = i2 - 1;
            int[] iArr = this.Y0;
            int i3 = i2 - 2;
            iArr[i3] = iArr[i3] + 1;
            this.e1 = 0;
            return;
        }
        throw new AV0("Expected END_ARRAY but was " + q() + " at path " + Y());
    }

    @Override // o.NV0
    public void i() throws IOException {
        int i = this.e1;
        if (i == 0) {
            i = z();
        }
        if (i == 2) {
            int i2 = this.X;
            int i3 = i2 - 1;
            this.X = i3;
            this.Z[i3] = null;
            int[] iArr = this.Y0;
            int i4 = i2 - 2;
            iArr[i4] = iArr[i4] + 1;
            this.e1 = 0;
            return;
        }
        throw new AV0("Expected END_OBJECT but was " + q() + " at path " + Y());
    }

    @Override // o.NV0
    public boolean j() throws IOException {
        int i = this.e1;
        if (i == 0) {
            i = z();
        }
        if (i != 2 && i != 4 && i != 18) {
            return true;
        }
        return false;
    }

    @Override // o.NV0
    public boolean k() throws IOException {
        int i = this.e1;
        if (i == 0) {
            i = z();
        }
        if (i == 5) {
            this.e1 = 0;
            int[] iArr = this.Y0;
            int i2 = this.X - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.e1 = 0;
            int[] iArr2 = this.Y0;
            int i3 = this.X - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new AV0("Expected a boolean but was " + q() + " at path " + Y());
        }
    }

    @Override // o.NV0
    public double l() throws IOException {
        int i = this.e1;
        if (i == 0) {
            i = z();
        }
        if (i == 16) {
            this.e1 = 0;
            int[] iArr = this.Y0;
            int i2 = this.X - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f1;
        }
        if (i == 17) {
            this.h1 = this.d1.e3(this.g1);
        } else if (i == 9) {
            this.h1 = F(k1);
        } else if (i == 8) {
            this.h1 = F(j1);
        } else if (i == 10) {
            this.h1 = G();
        } else if (i != 11) {
            throw new AV0("Expected a double but was " + q() + " at path " + Y());
        }
        this.e1 = 11;
        try {
            double parseDouble = Double.parseDouble(this.h1);
            if (!this.Z0 && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                throw new FV0("JSON forbids NaN and infinities: " + parseDouble + " at path " + Y());
            }
            this.h1 = null;
            this.e1 = 0;
            int[] iArr2 = this.Y0;
            int i3 = this.X - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new AV0("Expected a double but was " + this.h1 + " at path " + Y());
        }
    }

    @Override // o.NV0
    public int m() throws IOException {
        String F;
        int i = this.e1;
        if (i == 0) {
            i = z();
        }
        if (i == 16) {
            long j = this.f1;
            int i2 = (int) j;
            if (j == i2) {
                this.e1 = 0;
                int[] iArr = this.Y0;
                int i3 = this.X - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new AV0("Expected an int but was " + this.f1 + " at path " + Y());
        }
        if (i == 17) {
            this.h1 = this.d1.e3(this.g1);
        } else if (i != 9 && i != 8) {
            if (i != 11) {
                throw new AV0("Expected an int but was " + q() + " at path " + Y());
            }
        } else {
            if (i == 9) {
                F = F(k1);
            } else {
                F = F(j1);
            }
            this.h1 = F;
            try {
                int parseInt = Integer.parseInt(F);
                this.e1 = 0;
                int[] iArr2 = this.Y0;
                int i4 = this.X - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.e1 = 11;
        try {
            double parseDouble = Double.parseDouble(this.h1);
            int i5 = (int) parseDouble;
            if (i5 == parseDouble) {
                this.h1 = null;
                this.e1 = 0;
                int[] iArr3 = this.Y0;
                int i6 = this.X - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new AV0("Expected an int but was " + this.h1 + " at path " + Y());
        } catch (NumberFormatException unused2) {
            throw new AV0("Expected an int but was " + this.h1 + " at path " + Y());
        }
    }

    @Override // o.NV0
    public String n() throws IOException {
        String str;
        int i = this.e1;
        if (i == 0) {
            i = z();
        }
        if (i == 14) {
            str = G();
        } else if (i == 13) {
            str = F(k1);
        } else if (i == 12) {
            str = F(j1);
        } else if (i == 15) {
            str = this.h1;
        } else {
            throw new AV0("Expected a name but was " + q() + " at path " + Y());
        }
        this.e1 = 0;
        this.Z[this.X - 1] = str;
        return str;
    }

    @Override // o.NV0
    public String o() throws IOException {
        String e3;
        int i = this.e1;
        if (i == 0) {
            i = z();
        }
        if (i == 10) {
            e3 = G();
        } else if (i == 9) {
            e3 = F(k1);
        } else if (i == 8) {
            e3 = F(j1);
        } else if (i == 11) {
            e3 = this.h1;
            this.h1 = null;
        } else if (i == 16) {
            e3 = Long.toString(this.f1);
        } else if (i == 17) {
            e3 = this.d1.e3(this.g1);
        } else {
            throw new AV0("Expected a string but was " + q() + " at path " + Y());
        }
        this.e1 = 0;
        int[] iArr = this.Y0;
        int i2 = this.X - 1;
        iArr[i2] = iArr[i2] + 1;
        return e3;
    }

    @Override // o.NV0
    public NV0.b q() throws IOException {
        int i = this.e1;
        if (i == 0) {
            i = z();
        }
        switch (i) {
            case 1:
                return NV0.b.BEGIN_OBJECT;
            case 2:
                return NV0.b.END_OBJECT;
            case 3:
                return NV0.b.BEGIN_ARRAY;
            case 4:
                return NV0.b.END_ARRAY;
            case 5:
            case 6:
                return NV0.b.BOOLEAN;
            case 7:
                return NV0.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return NV0.b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return NV0.b.NAME;
            case 16:
            case 17:
                return NV0.b.NUMBER;
            case 18:
                return NV0.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // o.NV0
    public int s(NV0.a aVar) throws IOException {
        int i = this.e1;
        if (i == 0) {
            i = z();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return A(this.h1, aVar);
        }
        int I5 = this.c1.I5(aVar.b);
        if (I5 != -1) {
            this.e1 = 0;
            this.Z[this.X - 1] = aVar.a[I5];
            return I5;
        }
        String str = this.Z[this.X - 1];
        String n = n();
        int A = A(n, aVar);
        if (A == -1) {
            this.e1 = 15;
            this.h1 = n;
            this.Z[this.X - 1] = str;
        }
        return A;
    }

    @Override // o.NV0
    public void t() throws IOException {
        if (!this.a1) {
            int i = this.e1;
            if (i == 0) {
                i = z();
            }
            if (i == 14) {
                Q();
            } else if (i == 13) {
                N(k1);
            } else if (i == 12) {
                N(j1);
            } else if (i != 15) {
                throw new AV0("Expected a name but was " + q() + " at path " + Y());
            }
            this.e1 = 0;
            this.Z[this.X - 1] = "null";
            return;
        }
        throw new AV0("Cannot skip unexpected " + q() + " at " + Y());
    }

    public String toString() {
        return "JsonReader(" + this.c1 + C9811tl1.d;
    }

    @Override // o.NV0
    public void u() throws IOException {
        if (!this.a1) {
            int i = 0;
            do {
                int i2 = this.e1;
                if (i2 == 0) {
                    i2 = z();
                }
                if (i2 == 3) {
                    r(1);
                } else if (i2 == 1) {
                    r(3);
                } else {
                    if (i2 == 4) {
                        i--;
                        if (i >= 0) {
                            this.X--;
                        } else {
                            throw new AV0("Expected a value but was " + q() + " at path " + Y());
                        }
                    } else if (i2 == 2) {
                        i--;
                        if (i >= 0) {
                            this.X--;
                        } else {
                            throw new AV0("Expected a value but was " + q() + " at path " + Y());
                        }
                    } else if (i2 != 14 && i2 != 10) {
                        if (i2 != 9 && i2 != 13) {
                            if (i2 != 8 && i2 != 12) {
                                if (i2 == 17) {
                                    this.d1.skip(this.g1);
                                } else if (i2 == 18) {
                                    throw new AV0("Expected a value but was " + q() + " at path " + Y());
                                }
                            } else {
                                N(j1);
                            }
                        } else {
                            N(k1);
                        }
                    } else {
                        Q();
                    }
                    this.e1 = 0;
                }
                i++;
                this.e1 = 0;
            } while (i != 0);
            int[] iArr = this.Y0;
            int i3 = this.X;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.Z[i3 - 1] = "null";
            return;
        }
        throw new AV0("Cannot skip unexpected " + q() + " at " + Y());
    }

    public final void y() throws IOException {
        if (this.Z0) {
            return;
        }
        throw x("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    public final int z() throws IOException {
        int[] iArr = this.Y;
        int i = this.X;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int E = E(true);
            this.d1.readByte();
            if (E != 44) {
                if (E != 59) {
                    if (E == 93) {
                        this.e1 = 4;
                        return 4;
                    }
                    throw x("Unterminated array");
                }
                y();
            }
        } else if (i2 != 3 && i2 != 5) {
            if (i2 == 4) {
                iArr[i - 1] = 5;
                int E2 = E(true);
                this.d1.readByte();
                if (E2 != 58) {
                    if (E2 == 61) {
                        y();
                        if (this.c1.e2(1L) && this.d1.x(0L) == 62) {
                            this.d1.readByte();
                        }
                    } else {
                        throw x("Expected ':'");
                    }
                }
            } else if (i2 == 6) {
                iArr[i - 1] = 7;
            } else if (i2 == 7) {
                if (E(false) == -1) {
                    this.e1 = 18;
                    return 18;
                }
                y();
            } else if (i2 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        } else {
            iArr[i - 1] = 4;
            if (i2 == 5) {
                int E3 = E(true);
                this.d1.readByte();
                if (E3 != 44) {
                    if (E3 != 59) {
                        if (E3 == 125) {
                            this.e1 = 2;
                            return 2;
                        }
                        throw x("Unterminated object");
                    }
                    y();
                }
            }
            int E4 = E(true);
            if (E4 != 34) {
                if (E4 != 39) {
                    if (E4 != 125) {
                        y();
                        if (C((char) E4)) {
                            this.e1 = 14;
                            return 14;
                        }
                        throw x("Expected name");
                    } else if (i2 != 5) {
                        this.d1.readByte();
                        this.e1 = 2;
                        return 2;
                    } else {
                        throw x("Expected name");
                    }
                }
                this.d1.readByte();
                y();
                this.e1 = 12;
                return 12;
            }
            this.d1.readByte();
            this.e1 = 13;
            return 13;
        }
        int E5 = E(true);
        if (E5 != 34) {
            if (E5 != 39) {
                if (E5 != 44 && E5 != 59) {
                    if (E5 != 91) {
                        if (E5 != 93) {
                            if (E5 != 123) {
                                int H = H();
                                if (H != 0) {
                                    return H;
                                }
                                int I = I();
                                if (I != 0) {
                                    return I;
                                }
                                if (C(this.d1.x(0L))) {
                                    y();
                                    this.e1 = 10;
                                    return 10;
                                }
                                throw x("Expected value");
                            }
                            this.d1.readByte();
                            this.e1 = 1;
                            return 1;
                        } else if (i2 == 1) {
                            this.d1.readByte();
                            this.e1 = 4;
                            return 4;
                        }
                    } else {
                        this.d1.readByte();
                        this.e1 = 3;
                        return 3;
                    }
                }
                if (i2 != 1 && i2 != 2) {
                    throw x("Unexpected value");
                }
                y();
                this.e1 = 7;
                return 7;
            }
            y();
            this.d1.readByte();
            this.e1 = 8;
            return 8;
        }
        this.d1.readByte();
        this.e1 = 9;
        return 9;
    }
}
