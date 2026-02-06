package o;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import o.AbstractC5317bO0;

@Deprecated
/* loaded from: classes2.dex */
public final class KL0 extends U72 {
    public static final a b = new a() { // from class: o.JL0
        @Override // o.KL0.a
        public final boolean a(int i2, int i3, int i4, int i5, int i6) {
            return KL0.c(i2, i3, i4, i5, i6);
        }
    };
    public static final String c = "Id3Decoder";
    public static final int d = 4801587;
    public static final int e = 10;
    public static final int f = 128;
    public static final int g = 64;
    public static final int h = 32;
    public static final int i = 8;
    public static final int j = 4;
    public static final int k = 64;
    public static final int l = 2;
    public static final int m = 1;
    public static final int n = 0;

    /* renamed from: o  reason: collision with root package name */
    public static final int f514o = 1;
    public static final int p = 2;
    public static final int q = 3;
    @InterfaceC11300zs1
    public final a a;

    /* loaded from: classes2.dex */
    public interface a {
        boolean a(int i, int i2, int i3, int i4, int i5);
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public final int a;
        public final boolean b;
        public final int c;

        public b(int i, boolean z, int i2) {
            this.a = i;
            this.b = z;
            this.c = i2;
        }
    }

    public KL0() {
        this(null);
    }

    public static int A(C3012Fy1 c3012Fy1, int i2) {
        byte[] e2 = c3012Fy1.e();
        int f2 = c3012Fy1.f();
        int i3 = f2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 < f2 + i2) {
                if ((e2[i3] & 255) == 255 && e2[i4] == 0) {
                    System.arraycopy(e2, i3 + 2, e2, i4, (i2 - (i3 - f2)) - 2);
                    i2--;
                }
                i3 = i4;
            } else {
                return i2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
        if ((r10 & 1) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
        if ((r10 & 128) != 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean B(C3012Fy1 c3012Fy1, int i2, int i3, boolean z) {
        int O;
        long O2;
        int i4;
        int i5;
        int f2 = c3012Fy1.f();
        while (true) {
            try {
                boolean z2 = true;
                if (c3012Fy1.a() >= i3) {
                    if (i2 >= 3) {
                        O = c3012Fy1.s();
                        O2 = c3012Fy1.N();
                        i4 = c3012Fy1.R();
                    } else {
                        O = c3012Fy1.O();
                        O2 = c3012Fy1.O();
                        i4 = 0;
                    }
                    if (O == 0 && O2 == 0 && i4 == 0) {
                        c3012Fy1.Y(f2);
                        return true;
                    }
                    if (i2 == 4 && !z) {
                        if ((8421504 & O2) != 0) {
                            c3012Fy1.Y(f2);
                            return false;
                        }
                        O2 = (((O2 >> 24) & 255) << 21) | (O2 & 255) | (((O2 >> 8) & 255) << 7) | (((O2 >> 16) & 255) << 14);
                    }
                    if (i2 == 4) {
                        if ((i4 & 64) != 0) {
                            i5 = 1;
                        } else {
                            i5 = 0;
                        }
                    } else {
                        if (i2 == 3) {
                            if ((i4 & 32) != 0) {
                                i5 = 1;
                            } else {
                                i5 = 0;
                            }
                        } else {
                            i5 = 0;
                            z2 = false;
                        }
                        if (z2) {
                            i5 += 4;
                        }
                        if (O2 < i5) {
                            c3012Fy1.Y(f2);
                            return false;
                        } else if (c3012Fy1.a() < O2) {
                            c3012Fy1.Y(f2);
                            return false;
                        } else {
                            c3012Fy1.Z((int) O2);
                        }
                    }
                } else {
                    c3012Fy1.Y(f2);
                    return true;
                }
            } catch (Throwable th) {
                c3012Fy1.Y(f2);
                throw th;
            }
        }
    }

    public static /* synthetic */ boolean c(int i2, int i3, int i4, int i5, int i6) {
        return false;
    }

    public static byte[] d(byte[] bArr, int i2, int i3) {
        if (i3 <= i2) {
            return TD2.f;
        }
        return Arrays.copyOfRange(bArr, i2, i3);
    }

    public static C2617Cb f(C3012Fy1 c3012Fy1, int i2, int i3) {
        int z;
        String str;
        int L = c3012Fy1.L();
        Charset w = w(L);
        int i4 = i2 - 1;
        byte[] bArr = new byte[i4];
        c3012Fy1.n(bArr, 0, i4);
        if (i3 == 2) {
            str = "image/" + C8077mf.g(new String(bArr, 0, 3, KB.b));
            if ("image/jpg".equals(str)) {
                str = C4128Rj1.R0;
            }
            z = 2;
        } else {
            z = z(bArr, 0);
            String g2 = C8077mf.g(new String(bArr, 0, z, KB.b));
            if (g2.indexOf(47) == -1) {
                str = "image/" + g2;
            } else {
                str = g2;
            }
        }
        int i5 = z + 2;
        int y = y(bArr, i5, L);
        return new C2617Cb(str, new String(bArr, i5, y - i5, w), bArr[z + 1] & 255, d(bArr, y + v(L), i4));
    }

    public static C7362jn g(C3012Fy1 c3012Fy1, int i2, String str) {
        byte[] bArr = new byte[i2];
        c3012Fy1.n(bArr, 0, i2);
        return new C7362jn(str, bArr);
    }

    public static GA h(C3012Fy1 c3012Fy1, int i2, int i3, boolean z, int i4, @InterfaceC11300zs1 a aVar) {
        long j2;
        int f2 = c3012Fy1.f();
        int z2 = z(c3012Fy1.e(), f2);
        String str = new String(c3012Fy1.e(), f2, z2 - f2, KB.b);
        c3012Fy1.Y(z2 + 1);
        int s = c3012Fy1.s();
        int s2 = c3012Fy1.s();
        long N = c3012Fy1.N();
        if (N == 4294967295L) {
            N = -1;
        }
        long N2 = c3012Fy1.N();
        if (N2 == 4294967295L) {
            j2 = -1;
        } else {
            j2 = N2;
        }
        ArrayList arrayList = new ArrayList();
        int i5 = f2 + i2;
        while (c3012Fy1.f() < i5) {
            LL0 k2 = k(i3, c3012Fy1, z, i4, aVar);
            if (k2 != null) {
                arrayList.add(k2);
            }
        }
        return new GA(str, s, s2, N, j2, (LL0[]) arrayList.toArray(new LL0[0]));
    }

    public static HA i(C3012Fy1 c3012Fy1, int i2, int i3, boolean z, int i4, @InterfaceC11300zs1 a aVar) {
        boolean z2;
        boolean z3;
        int f2 = c3012Fy1.f();
        int z4 = z(c3012Fy1.e(), f2);
        String str = new String(c3012Fy1.e(), f2, z4 - f2, KB.b);
        c3012Fy1.Y(z4 + 1);
        int L = c3012Fy1.L();
        if ((L & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((L & 1) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        int L2 = c3012Fy1.L();
        String[] strArr = new String[L2];
        for (int i5 = 0; i5 < L2; i5++) {
            int f3 = c3012Fy1.f();
            int z5 = z(c3012Fy1.e(), f3);
            strArr[i5] = new String(c3012Fy1.e(), f3, z5 - f3, KB.b);
            c3012Fy1.Y(z5 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i6 = f2 + i2;
        while (c3012Fy1.f() < i6) {
            LL0 k2 = k(i3, c3012Fy1, z, i4, aVar);
            if (k2 != null) {
                arrayList.add(k2);
            }
        }
        return new HA(str, z2, z3, strArr, (LL0[]) arrayList.toArray(new LL0[0]));
    }

    @InterfaceC11300zs1
    public static KG j(C3012Fy1 c3012Fy1, int i2) {
        if (i2 < 4) {
            return null;
        }
        int L = c3012Fy1.L();
        Charset w = w(L);
        byte[] bArr = new byte[3];
        c3012Fy1.n(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i3 = i2 - 4;
        byte[] bArr2 = new byte[i3];
        c3012Fy1.n(bArr2, 0, i3);
        int y = y(bArr2, 0, L);
        String str2 = new String(bArr2, 0, y, w);
        int v = y + v(L);
        return new KG(str, str2, p(bArr2, v, y(bArr2, v, L), w));
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0188, code lost:
        if (r4 == 67) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01ff A[Catch: all -> 0x01e0, TRY_LEAVE, TryCatch #0 {all -> 0x01e0, blocks: (B:168:0x01ff, B:156:0x01db, B:165:0x01f0, B:166:0x01f5), top: B:175:0x0109 }] */
    /* JADX WARN: Type inference failed for: r1v16, types: [o.Fy1] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @InterfaceC11300zs1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static LL0 k(int i2, C3012Fy1 c3012Fy1, boolean z, int i3, @InterfaceC11300zs1 a aVar) {
        int i4;
        int O;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        C3012Fy1 c3012Fy12;
        int i10;
        int i11;
        int i12;
        int i13;
        C3012Fy1 c3012Fy13;
        LL0 g2;
        int i14 = i2;
        int L = c3012Fy1.L();
        int L2 = c3012Fy1.L();
        int L3 = c3012Fy1.L();
        boolean z9 = false;
        if (i14 >= 3) {
            i4 = c3012Fy1.L();
        } else {
            i4 = 0;
        }
        if (i14 == 4) {
            O = c3012Fy1.P();
            if (!z) {
                O = (((O >> 24) & 255) << 21) | (O & 255) | (((O >> 8) & 255) << 7) | (((O >> 16) & 255) << 14);
            }
        } else if (i14 == 3) {
            O = c3012Fy1.P();
        } else {
            O = c3012Fy1.O();
        }
        int i15 = O;
        if (i14 >= 3) {
            i5 = c3012Fy1.R();
        } else {
            i5 = 0;
        }
        if (L == 0 && L2 == 0 && L3 == 0 && i4 == 0 && i15 == 0 && i5 == 0) {
            c3012Fy1.Y(c3012Fy1.g());
            return null;
        }
        int f2 = c3012Fy1.f() + i15;
        if (f2 > c3012Fy1.g()) {
            I31.n(c, "Frame size exceeds remaining tag data");
            c3012Fy1.Y(c3012Fy1.g());
            return null;
        }
        if (aVar != null) {
            boolean a2 = aVar.a(i14, L, L2, L3, i4);
            i14 = i14;
            i6 = L2;
            i7 = L;
            i8 = L3;
            i9 = i4;
            if (!a2) {
                c3012Fy1.Y(f2);
                return null;
            }
        } else {
            i6 = L2;
            i7 = L;
            i8 = L3;
            i9 = i4;
        }
        if (i14 == 3) {
            if ((i5 & 128) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i5 & 64) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((i5 & 32) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            z5 = false;
            z9 = z2;
        } else if (i14 == 4) {
            if ((i5 & 64) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if ((i5 & 8) != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if ((i5 & 4) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if ((i5 & 2) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if ((i5 & 1) != 0) {
                z9 = true;
            }
            z3 = z6;
            z2 = z9;
            z9 = z7;
            z4 = z8;
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
        }
        if (!z9 && !z4) {
            if (z3) {
                i15--;
                c3012Fy1.Z(1);
            }
            if (z2) {
                i15 -= 4;
                c3012Fy1.Z(4);
            }
            if (z5) {
                i15 = A(c3012Fy1, i15);
            }
            try {
                try {
                    if (i7 == 84 && i6 == 88 && i8 == 88 && (i14 == 2 || i9 == 88)) {
                        g2 = s(c3012Fy1, i15);
                    } else if (i7 == 84) {
                        g2 = q(c3012Fy1, i15, x(i14, i7, i6, i8, i9));
                    } else if (i7 == 87 && i6 == 88 && i8 == 88 && (i14 == 2 || i9 == 88)) {
                        g2 = u(c3012Fy1, i15);
                    } else if (i7 == 87) {
                        g2 = t(c3012Fy1, i15, x(i14, i7, i6, i8, i9));
                    } else if (i7 == 80 && i6 == 82 && i8 == 73 && i9 == 86) {
                        g2 = o(c3012Fy1, i15);
                    } else if (i7 == 71 && i6 == 69 && i8 == 79 && (i9 == 66 || i14 == 2)) {
                        g2 = l(c3012Fy1, i15);
                    } else if (i14 == 2) {
                        if (i7 == 80 && i6 == 73 && i8 == 67) {
                            g2 = f(c3012Fy1, i15, i14);
                        }
                        if (i7 != 67 && i6 == 79 && i8 == 77 && (i9 == 77 || i14 == 2)) {
                            g2 = j(c3012Fy1, i15);
                        } else {
                            if (i7 != 67 && i6 == 72 && i8 == 65 && i9 == 80) {
                                i10 = i6;
                                i11 = i8;
                                i12 = i15;
                                i13 = i9;
                                try {
                                    g2 = h(c3012Fy1, i12, i14, z, i3, aVar);
                                    i14 = i2;
                                    i6 = c3012Fy1;
                                } catch (Throwable th) {
                                    th = th;
                                    c3012Fy12 = c3012Fy1;
                                    c3012Fy12.Y(f2);
                                    throw th;
                                }
                            } else {
                                i10 = i6;
                                i11 = i8;
                                i12 = i15;
                                i13 = i9;
                                if (i7 != 67 && i10 == 84 && i11 == 79 && i13 == 67) {
                                    i14 = i2;
                                    C3012Fy1 c3012Fy14 = c3012Fy1;
                                    g2 = i(c3012Fy14, i12, i14, z, i3, aVar);
                                    i6 = c3012Fy14;
                                } else {
                                    i14 = i2;
                                    c3012Fy13 = c3012Fy1;
                                    if (i7 != 77 && i10 == 76 && i11 == 76 && i13 == 84) {
                                        g2 = n(c3012Fy13, i12);
                                        i6 = c3012Fy13;
                                    } else {
                                        g2 = g(c3012Fy13, i12, x(i14, i7, i10, i11, i13));
                                        i6 = c3012Fy13;
                                    }
                                }
                            }
                            if (g2 == null) {
                                I31.n(c, "Failed to decode frame: id=" + x(i14, i7, i10, i11, i13) + ", frameSize=" + i12);
                            }
                            i6.Y(f2);
                            return g2;
                        }
                    } else {
                        if (i7 == 65) {
                            if (i6 == 80) {
                                if (i8 == 73) {
                                }
                            }
                        }
                        if (i7 != 67) {
                        }
                        if (i7 != 67) {
                        }
                        i10 = i6;
                        i11 = i8;
                        i12 = i15;
                        i13 = i9;
                        if (i7 != 67) {
                        }
                        i14 = i2;
                        c3012Fy13 = c3012Fy1;
                        if (i7 != 77) {
                        }
                        g2 = g(c3012Fy13, i12, x(i14, i7, i10, i11, i13));
                        i6 = c3012Fy13;
                        if (g2 == null) {
                        }
                        i6.Y(f2);
                        return g2;
                    }
                    i10 = i6;
                    i11 = i8;
                    i6 = c3012Fy1;
                    i12 = i15;
                    i13 = i9;
                    if (g2 == null) {
                    }
                    i6.Y(f2);
                    return g2;
                } catch (Throwable th2) {
                    th = th2;
                    c3012Fy12 = c3012Fy1;
                }
            } catch (Throwable th3) {
                th = th3;
                c3012Fy12 = i6;
            }
        } else {
            I31.n(c, "Skipping unsupported compressed or encrypted frame");
            c3012Fy1.Y(f2);
            return null;
        }
    }

    public static SC0 l(C3012Fy1 c3012Fy1, int i2) {
        int L = c3012Fy1.L();
        Charset w = w(L);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        c3012Fy1.n(bArr, 0, i3);
        int z = z(bArr, 0);
        String str = new String(bArr, 0, z, KB.b);
        int i4 = z + 1;
        int y = y(bArr, i4, L);
        String p2 = p(bArr, i4, y, w);
        int v = y + v(L);
        int y2 = y(bArr, v, L);
        return new SC0(str, p2, p(bArr, v, y2, w), d(bArr, y2 + v(L), i3));
    }

    @InterfaceC11300zs1
    public static b m(C3012Fy1 c3012Fy1) {
        int O;
        if (c3012Fy1.a() < 10) {
            I31.n(c, "Data too short to be an ID3 tag");
            return null;
        }
        if (c3012Fy1.O() != 4801587) {
            I31.n(c, "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(O)));
            return null;
        }
        int L = c3012Fy1.L();
        boolean z = true;
        c3012Fy1.Z(1);
        int L2 = c3012Fy1.L();
        int K = c3012Fy1.K();
        if (L == 2) {
            if ((L2 & 64) != 0) {
                I31.n(c, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (L == 3) {
            if ((L2 & 64) != 0) {
                int s = c3012Fy1.s();
                c3012Fy1.Z(s);
                K -= s + 4;
            }
        } else if (L == 4) {
            if ((L2 & 64) != 0) {
                int K2 = c3012Fy1.K();
                c3012Fy1.Z(K2 - 4);
                K -= K2;
            }
            if ((L2 & 16) != 0) {
                K -= 10;
            }
        } else {
            I31.n(c, "Skipped ID3 tag with unsupported majorVersion=" + L);
            return null;
        }
        return new b(L, (L >= 4 || (L2 & 128) == 0) ? false : false, K);
    }

    public static C5885dk1 n(C3012Fy1 c3012Fy1, int i2) {
        int R = c3012Fy1.R();
        int O = c3012Fy1.O();
        int O2 = c3012Fy1.O();
        int L = c3012Fy1.L();
        int L2 = c3012Fy1.L();
        C2903Ey1 c2903Ey1 = new C2903Ey1();
        c2903Ey1.n(c3012Fy1);
        int i3 = ((i2 - 10) * 8) / (L + L2);
        int[] iArr = new int[i3];
        int[] iArr2 = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int h2 = c2903Ey1.h(L);
            int h3 = c2903Ey1.h(L2);
            iArr[i4] = h2;
            iArr2[i4] = h3;
        }
        return new C5885dk1(R, O, O2, iArr, iArr2);
    }

    public static HH1 o(C3012Fy1 c3012Fy1, int i2) {
        byte[] bArr = new byte[i2];
        c3012Fy1.n(bArr, 0, i2);
        int z = z(bArr, 0);
        return new HH1(new String(bArr, 0, z, KB.b), d(bArr, z + 1, i2));
    }

    public static String p(byte[] bArr, int i2, int i3, Charset charset) {
        if (i3 > i2 && i3 <= bArr.length) {
            return new String(bArr, i2, i3 - i2, charset);
        }
        return "";
    }

    @InterfaceC11300zs1
    public static C2566Bm2 q(C3012Fy1 c3012Fy1, int i2, String str) {
        if (i2 < 1) {
            return null;
        }
        int L = c3012Fy1.L();
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        c3012Fy1.n(bArr, 0, i3);
        return new C2566Bm2(str, (String) null, r(bArr, L, 0));
    }

    public static AbstractC5317bO0<String> r(byte[] bArr, int i2, int i3) {
        if (i3 >= bArr.length) {
            return AbstractC5317bO0.M("");
        }
        AbstractC5317bO0.a r = AbstractC5317bO0.r();
        int y = y(bArr, i3, i2);
        while (i3 < y) {
            r.g(new String(bArr, i3, y - i3, w(i2)));
            i3 = v(i2) + y;
            y = y(bArr, i3, i2);
        }
        AbstractC5317bO0<String> e2 = r.e();
        if (e2.isEmpty()) {
            return AbstractC5317bO0.M("");
        }
        return e2;
    }

    @InterfaceC11300zs1
    public static C2566Bm2 s(C3012Fy1 c3012Fy1, int i2) {
        if (i2 < 1) {
            return null;
        }
        int L = c3012Fy1.L();
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        c3012Fy1.n(bArr, 0, i3);
        int y = y(bArr, 0, L);
        return new C2566Bm2("TXXX", new String(bArr, 0, y, w(L)), r(bArr, L, y + v(L)));
    }

    public static XC2 t(C3012Fy1 c3012Fy1, int i2, String str) {
        byte[] bArr = new byte[i2];
        c3012Fy1.n(bArr, 0, i2);
        return new XC2(str, null, new String(bArr, 0, z(bArr, 0), KB.b));
    }

    @InterfaceC11300zs1
    public static XC2 u(C3012Fy1 c3012Fy1, int i2) {
        if (i2 < 1) {
            return null;
        }
        int L = c3012Fy1.L();
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        c3012Fy1.n(bArr, 0, i3);
        int y = y(bArr, 0, L);
        String str = new String(bArr, 0, y, w(L));
        int v = y + v(L);
        return new XC2("WXXX", str, p(bArr, v, z(bArr, v), KB.b));
    }

    public static int v(int i2) {
        if (i2 != 0 && i2 != 3) {
            return 2;
        }
        return 1;
    }

    public static Charset w(int i2) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return KB.b;
                }
                return KB.c;
            }
            return KB.d;
        }
        return KB.f;
    }

    public static String x(int i2, int i3, int i4, int i5, int i6) {
        if (i2 == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
    }

    public static int y(byte[] bArr, int i2, int i3) {
        int z = z(bArr, i2);
        if (i3 != 0 && i3 != 3) {
            while (z < bArr.length - 1) {
                if ((z - i2) % 2 == 0 && bArr[z + 1] == 0) {
                    return z;
                }
                z = z(bArr, z + 1);
            }
            return bArr.length;
        }
        return z;
    }

    public static int z(byte[] bArr, int i2) {
        while (i2 < bArr.length) {
            if (bArr[i2] == 0) {
                return i2;
            }
            i2++;
        }
        return bArr.length;
    }

    @Override // o.U72
    @InterfaceC11300zs1
    public C4224Si1 b(C5638cj1 c5638cj1, ByteBuffer byteBuffer) {
        return e(byteBuffer.array(), byteBuffer.limit());
    }

    @InterfaceC11300zs1
    public C4224Si1 e(byte[] bArr, int i2) {
        int i3;
        ArrayList arrayList = new ArrayList();
        C3012Fy1 c3012Fy1 = new C3012Fy1(bArr, i2);
        b m2 = m(c3012Fy1);
        if (m2 == null) {
            return null;
        }
        int f2 = c3012Fy1.f();
        if (m2.a == 2) {
            i3 = 6;
        } else {
            i3 = 10;
        }
        int i4 = m2.c;
        if (m2.b) {
            i4 = A(c3012Fy1, m2.c);
        }
        c3012Fy1.X(f2 + i4);
        boolean z = false;
        if (!B(c3012Fy1, m2.a, i3, false)) {
            if (m2.a == 4 && B(c3012Fy1, 4, i3, true)) {
                z = true;
            } else {
                I31.n(c, "Failed to validate ID3 tag with majorVersion=" + m2.a);
                return null;
            }
        }
        while (c3012Fy1.a() >= i3) {
            LL0 k2 = k(m2.a, c3012Fy1, z, i3, this.a);
            if (k2 != null) {
                arrayList.add(k2);
            }
        }
        return new C4224Si1(arrayList);
    }

    public KL0(@InterfaceC11300zs1 a aVar) {
        this.a = aVar;
    }
}
