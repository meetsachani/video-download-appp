package o;

import java.nio.ByteBuffer;
import o.C10833xx0;

@Deprecated
/* loaded from: classes2.dex */
public final class M3 {
    public static final int a = 44096;
    public static final int b = 44097;
    public static final int c = 336000;
    public static final int d = 2;
    public static final int e = 7;
    public static final int f = 16;
    public static final int[] g = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, com.facebook.internal.q0.n1, 400, 400, 2048};

    /* loaded from: classes2.dex */
    public static final class b {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        public b(int i, int i2, int i3, int i4, int i5) {
            this.a = i;
            this.c = i2;
            this.b = i3;
            this.d = i4;
            this.e = i5;
        }
    }

    public static void a(int i, C3012Fy1 c3012Fy1) {
        c3012Fy1.U(7);
        byte[] e2 = c3012Fy1.e();
        e2[0] = -84;
        e2[1] = 64;
        e2[2] = -1;
        e2[3] = -1;
        e2[4] = (byte) ((i >> 16) & 255);
        e2[5] = (byte) ((i >> 8) & 255);
        e2[6] = (byte) (i & 255);
    }

    public static C10833xx0 b(C3012Fy1 c3012Fy1, String str, String str2, @InterfaceC11300zs1 C6960i70 c6960i70) {
        int i;
        c3012Fy1.Z(1);
        if (((c3012Fy1.L() & 32) >> 5) == 1) {
            i = 48000;
        } else {
            i = 44100;
        }
        return new C10833xx0.b().U(str).g0(C4128Rj1.T).J(2).h0(i).O(c6960i70).X(str2).G();
    }

    public static int c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return d(new C2903Ey1(bArr)).e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
        if (r11 != 11) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
        if (r11 != 11) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008e, code lost:
        if (r11 != 8) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b d(C2903Ey1 c2903Ey1) {
        int i;
        int i2;
        int i3;
        int i4;
        int h = c2903Ey1.h(16);
        int h2 = c2903Ey1.h(16);
        if (h2 == 65535) {
            h2 = c2903Ey1.h(24);
            i = 7;
        } else {
            i = 4;
        }
        int i5 = h2 + i;
        if (h == 44097) {
            i5 += 2;
        }
        int i6 = i5;
        int h3 = c2903Ey1.h(2);
        if (h3 == 3) {
            h3 += f(c2903Ey1, 2);
        }
        int i7 = h3;
        int h4 = c2903Ey1.h(10);
        if (c2903Ey1.g() && c2903Ey1.h(3) > 0) {
            c2903Ey1.s(2);
        }
        int i8 = 48000;
        if (c2903Ey1.g()) {
            i2 = 48000;
        } else {
            i2 = 48000;
            i8 = 44100;
        }
        int h5 = c2903Ey1.h(4);
        if (i8 == 44100 && h5 == 13) {
            i3 = g[h5];
        } else {
            if (i8 == i2) {
                int[] iArr = g;
                if (h5 < iArr.length) {
                    int i9 = iArr[h5];
                    int i10 = h4 % 5;
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 == 4) {
                                    if (h5 != 3) {
                                        if (h5 != 8) {
                                        }
                                    }
                                    i3 = i9 + 1;
                                }
                                i4 = i9;
                            }
                        } else {
                            if (h5 != 8) {
                            }
                            i3 = i9 + 1;
                        }
                        return new b(i7, 2, i8, i6, i4);
                    }
                    if (h5 != 3) {
                    }
                    i3 = i9 + 1;
                }
            }
            i3 = 0;
        }
        i4 = i3;
        return new b(i7, 2, i8, i6, i4);
    }

    public static int e(byte[] bArr, int i) {
        int i2 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i3 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i3 == 65535) {
            i3 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i2 = 4;
        }
        if (i == 44097) {
            i2 += 2;
        }
        return i3 + i2;
    }

    public static int f(C2903Ey1 c2903Ey1, int i) {
        int i2 = 0;
        while (true) {
            int h = i2 + c2903Ey1.h(i);
            if (!c2903Ey1.g()) {
                return h;
            }
            i2 = (h + 1) << i;
        }
    }
}
