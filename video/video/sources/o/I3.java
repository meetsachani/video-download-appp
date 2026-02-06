package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import o.C10833xx0;

@Deprecated
/* loaded from: classes2.dex */
public final class I3 {
    public static final int a = 80000;
    public static final int b = 768000;
    public static final int c = 3062500;
    public static final int d = 16;
    public static final int e = 10;
    public static final int f = 256;
    public static final int g = 1536;
    public static final int[] h = {1, 2, 3, 6};
    public static final int[] i = {48000, 44100, C9948uJ1.h};
    public static final int[] j = {24000, 22050, 16000};
    public static final int[] k = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] l = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, CK1.x, 224, 256, 320, 384, 448, 512, C3062Gl1.m, 640};
    public static final int[] m = {69, 87, 104, 121, C3503Kz.c0, C10997yd1.y1, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* loaded from: classes2.dex */
    public static final class b {
        public static final int h = -1;
        public static final int i = 0;
        public static final int j = 1;
        public static final int k = 2;
        @InterfaceC11300zs1
        public final String a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes2.dex */
        public @interface a {
        }

        public b(@InterfaceC11300zs1 String str, int i2, int i3, int i4, int i5, int i6, int i7) {
            this.a = str;
            this.b = i2;
            this.d = i3;
            this.c = i4;
            this.e = i5;
            this.f = i6;
            this.g = i7;
        }
    }

    public static int a(int i2, int i3, int i4) {
        return (i2 * i3) / (i4 * 32);
    }

    public static int b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i2 = position; i2 <= limit; i2++) {
            if ((TD2.V(byteBuffer, i2 + 4) & (-2)) == -126718022) {
                return i2 - position;
            }
        }
        return -1;
    }

    public static int c(int i2, int i3) {
        int i4 = i3 / 2;
        if (i2 >= 0) {
            int[] iArr = i;
            if (i2 < iArr.length && i3 >= 0) {
                int[] iArr2 = m;
                if (i4 < iArr2.length) {
                    int i5 = iArr[i2];
                    if (i5 == 44100) {
                        return (iArr2[i4] + (i3 % 2)) * 2;
                    }
                    int i6 = l[i4];
                    if (i5 == 32000) {
                        return i6 * 6;
                    }
                    return i6 * 4;
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }

    public static C10833xx0 d(C3012Fy1 c3012Fy1, String str, String str2, @InterfaceC11300zs1 C6960i70 c6960i70) {
        C2903Ey1 c2903Ey1 = new C2903Ey1();
        c2903Ey1.n(c3012Fy1);
        int i2 = i[c2903Ey1.h(2)];
        c2903Ey1.s(8);
        int i3 = k[c2903Ey1.h(3)];
        if (c2903Ey1.h(1) != 0) {
            i3++;
        }
        int i4 = l[c2903Ey1.h(5)] * 1000;
        c2903Ey1.c();
        c3012Fy1.Y(c2903Ey1.d());
        return new C10833xx0.b().U(str).g0(C4128Rj1.Q).J(i3).h0(i2).O(c6960i70).X(str2).I(i4).b0(i4).G();
    }

    public static int e(ByteBuffer byteBuffer) {
        int i2 = 3;
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            if (((byteBuffer.get(byteBuffer.position() + 4) & C2638Cg0.o7) >> 6) != 3) {
                i2 = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
            }
            return h[i2] * 256;
        }
        return g;
    }

    public static b f(C2903Ey1 c2903Ey1) {
        boolean z;
        String str;
        int c2;
        int i2;
        int i3;
        int i4;
        String str2;
        int i5;
        int i6;
        int i7;
        int i8;
        String str3;
        int i9;
        int i10;
        int e2 = c2903Ey1.e();
        c2903Ey1.s(40);
        if (c2903Ey1.h(5) > 10) {
            z = true;
        } else {
            z = false;
        }
        c2903Ey1.q(e2);
        int i11 = -1;
        if (z) {
            c2903Ey1.s(16);
            int h2 = c2903Ey1.h(2);
            if (h2 != 0) {
                if (h2 != 1) {
                    if (h2 == 2) {
                        i11 = 2;
                    }
                } else {
                    i11 = 1;
                }
            } else {
                i11 = 0;
            }
            c2903Ey1.s(3);
            c2 = (c2903Ey1.h(11) + 1) * 2;
            int h3 = c2903Ey1.h(2);
            if (h3 == 3) {
                i2 = j[c2903Ey1.h(2)];
                i6 = 3;
                i7 = 6;
            } else {
                int h4 = c2903Ey1.h(2);
                int i12 = h[h4];
                i6 = h4;
                i2 = i[h3];
                i7 = i12;
            }
            i4 = i7 * 256;
            int a2 = a(c2, i2, i7);
            int h5 = c2903Ey1.h(3);
            boolean g2 = c2903Ey1.g();
            i3 = k[h5] + (g2 ? 1 : 0);
            c2903Ey1.s(10);
            if (c2903Ey1.g()) {
                c2903Ey1.s(8);
            }
            if (h5 == 0) {
                c2903Ey1.s(5);
                if (c2903Ey1.g()) {
                    c2903Ey1.s(8);
                }
            }
            if (i11 == 1 && c2903Ey1.g()) {
                c2903Ey1.s(16);
            }
            if (c2903Ey1.g()) {
                if (h5 > 2) {
                    c2903Ey1.s(2);
                }
                if ((h5 & 1) != 0 && h5 > 2) {
                    i9 = 6;
                    c2903Ey1.s(6);
                } else {
                    i9 = 6;
                }
                if ((h5 & 4) != 0) {
                    c2903Ey1.s(i9);
                }
                if (g2 && c2903Ey1.g()) {
                    c2903Ey1.s(5);
                }
                if (i11 == 0) {
                    if (c2903Ey1.g()) {
                        i10 = 6;
                        c2903Ey1.s(6);
                    } else {
                        i10 = 6;
                    }
                    if (h5 == 0 && c2903Ey1.g()) {
                        c2903Ey1.s(i10);
                    }
                    if (c2903Ey1.g()) {
                        c2903Ey1.s(i10);
                    }
                    int h6 = c2903Ey1.h(2);
                    if (h6 == 1) {
                        c2903Ey1.s(5);
                    } else if (h6 == 2) {
                        c2903Ey1.s(12);
                    } else if (h6 == 3) {
                        int h7 = c2903Ey1.h(5);
                        if (c2903Ey1.g()) {
                            c2903Ey1.s(5);
                            if (c2903Ey1.g()) {
                                c2903Ey1.s(4);
                            }
                            if (c2903Ey1.g()) {
                                c2903Ey1.s(4);
                            }
                            if (c2903Ey1.g()) {
                                c2903Ey1.s(4);
                            }
                            if (c2903Ey1.g()) {
                                c2903Ey1.s(4);
                            }
                            if (c2903Ey1.g()) {
                                c2903Ey1.s(4);
                            }
                            if (c2903Ey1.g()) {
                                c2903Ey1.s(4);
                            }
                            if (c2903Ey1.g()) {
                                c2903Ey1.s(4);
                            }
                            if (c2903Ey1.g()) {
                                if (c2903Ey1.g()) {
                                    c2903Ey1.s(4);
                                }
                                if (c2903Ey1.g()) {
                                    c2903Ey1.s(4);
                                }
                            }
                        }
                        if (c2903Ey1.g()) {
                            c2903Ey1.s(5);
                            if (c2903Ey1.g()) {
                                c2903Ey1.s(7);
                                if (c2903Ey1.g()) {
                                    c2903Ey1.s(8);
                                }
                            }
                        }
                        c2903Ey1.s((h7 + 2) * 8);
                        c2903Ey1.c();
                    }
                    if (h5 < 2) {
                        if (c2903Ey1.g()) {
                            c2903Ey1.s(14);
                        }
                        if (h5 == 0 && c2903Ey1.g()) {
                            c2903Ey1.s(14);
                        }
                    }
                    if (c2903Ey1.g()) {
                        if (i6 == 0) {
                            c2903Ey1.s(5);
                        } else {
                            for (int i13 = 0; i13 < i7; i13++) {
                                if (c2903Ey1.g()) {
                                    c2903Ey1.s(5);
                                }
                            }
                        }
                    }
                }
            }
            if (c2903Ey1.g()) {
                c2903Ey1.s(5);
                if (h5 == 2) {
                    c2903Ey1.s(4);
                }
                if (h5 >= 6) {
                    c2903Ey1.s(2);
                }
                if (c2903Ey1.g()) {
                    c2903Ey1.s(8);
                }
                if (h5 == 0 && c2903Ey1.g()) {
                    c2903Ey1.s(8);
                }
                if (h3 < 3) {
                    c2903Ey1.r();
                }
            }
            if (i11 == 0 && i6 != 3) {
                c2903Ey1.r();
            }
            if (i11 == 2 && (i6 == 3 || c2903Ey1.g())) {
                i8 = 6;
                c2903Ey1.s(6);
            } else {
                i8 = 6;
            }
            if (c2903Ey1.g() && c2903Ey1.h(i8) == 1 && c2903Ey1.h(8) == 1) {
                str3 = C4128Rj1.S;
            } else {
                str3 = C4128Rj1.R;
            }
            str2 = str3;
            i5 = a2;
        } else {
            c2903Ey1.s(32);
            int h8 = c2903Ey1.h(2);
            if (h8 == 3) {
                str = null;
            } else {
                str = C4128Rj1.Q;
            }
            int h9 = c2903Ey1.h(6);
            int i14 = l[h9 / 2] * 1000;
            c2 = c(h8, h9);
            c2903Ey1.s(8);
            int h10 = c2903Ey1.h(3);
            if ((h10 & 1) != 0 && h10 != 1) {
                c2903Ey1.s(2);
            }
            if ((h10 & 4) != 0) {
                c2903Ey1.s(2);
            }
            if (h10 == 2) {
                c2903Ey1.s(2);
            }
            int[] iArr = i;
            if (h8 < iArr.length) {
                i2 = iArr[h8];
            } else {
                i2 = -1;
            }
            i3 = k[h10] + (c2903Ey1.g() ? 1 : 0);
            i4 = g;
            str2 = str;
            i5 = i14;
        }
        return new b(str2, i11, i3, i2, c2, i4, i5);
    }

    public static int g(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b2 = bArr[4];
        return c((b2 & C2638Cg0.o7) >> 6, b2 & ED2.a);
    }

    public static C10833xx0 h(C3012Fy1 c3012Fy1, String str, String str2, @InterfaceC11300zs1 C6960i70 c6960i70) {
        String str3;
        C2903Ey1 c2903Ey1 = new C2903Ey1();
        c2903Ey1.n(c3012Fy1);
        int h2 = c2903Ey1.h(13) * 1000;
        c2903Ey1.s(3);
        int i2 = i[c2903Ey1.h(2)];
        c2903Ey1.s(10);
        int i3 = k[c2903Ey1.h(3)];
        if (c2903Ey1.h(1) != 0) {
            i3++;
        }
        c2903Ey1.s(3);
        int h3 = c2903Ey1.h(4);
        c2903Ey1.s(1);
        if (h3 > 0) {
            c2903Ey1.s(6);
            if (c2903Ey1.h(1) != 0) {
                i3 += 2;
            }
            c2903Ey1.s(1);
        }
        if (c2903Ey1.b() > 7) {
            c2903Ey1.s(7);
            if (c2903Ey1.h(1) != 0) {
                str3 = C4128Rj1.S;
                c2903Ey1.c();
                c3012Fy1.Y(c2903Ey1.d());
                return new C10833xx0.b().U(str).g0(str3).J(i3).h0(i2).O(c6960i70).X(str2).b0(h2).G();
            }
        }
        str3 = C4128Rj1.R;
        c2903Ey1.c();
        c3012Fy1.Y(c2903Ey1.d());
        return new C10833xx0.b().U(str).g0(str3).J(i3).h0(i2).O(c6960i70).X(str2).b0(h2).G();
    }

    public static int i(ByteBuffer byteBuffer, int i2) {
        boolean z;
        int i3;
        if ((byteBuffer.get(byteBuffer.position() + i2 + 7) & 255) == 187) {
            z = true;
        } else {
            z = false;
        }
        int position = byteBuffer.position() + i2;
        if (z) {
            i3 = 9;
        } else {
            i3 = 8;
        }
        return 40 << ((byteBuffer.get(position + i3) >> 4) & 7);
    }

    public static int j(byte[] bArr) {
        char c2;
        boolean z = false;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b2 = bArr[7];
            if ((b2 & 254) == 186) {
                if ((b2 & 255) == 187) {
                    z = true;
                }
                if (z) {
                    c2 = '\t';
                } else {
                    c2 = '\b';
                }
                return 40 << ((bArr[c2] >> 4) & 7);
            }
        }
        return 0;
    }
}
