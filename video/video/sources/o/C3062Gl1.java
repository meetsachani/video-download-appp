package o;

@Deprecated
/* renamed from: o.Gl1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3062Gl1 {
    public static final int a = 4096;
    public static final int j = 384;
    public static final int k = 1152;
    public static final int l = 1152;
    public static final int m = 576;
    public static final String[] c = {C4128Rj1.J, C4128Rj1.K, C4128Rj1.I};
    public static final int[] d = {44100, 48000, C9948uJ1.h};
    public static final int[] e = {C9948uJ1.h, 64000, 96000, C9948uJ1.i, 160000, O70.a, 224000, G.i, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] f = {C9948uJ1.h, 48000, 56000, 64000, I3.a, 96000, 112000, C9948uJ1.i, 144000, 160000, 176000, O70.a, 224000, G.i};
    public static final int[] g = {C9948uJ1.h, 48000, 56000, 64000, I3.a, 96000, 112000, C9948uJ1.i, 160000, O70.a, 224000, G.i, 320000, 384000};
    public static final int b = 40000;
    public static final int[] h = {C9948uJ1.h, b, 48000, 56000, 64000, I3.a, 96000, 112000, C9948uJ1.i, 160000, O70.a, 224000, G.i, 320000};
    public static final int[] i = {8000, 16000, 24000, C9948uJ1.h, b, 48000, 56000, 64000, I3.a, 96000, 112000, C9948uJ1.i, 144000, 160000};

    /* renamed from: o.Gl1$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public int a;
        @InterfaceC11300zs1
        public String b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public boolean a(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            if (!C3062Gl1.l(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
                return false;
            }
            this.a = i2;
            this.b = C3062Gl1.c[3 - i3];
            int i8 = C3062Gl1.d[i5];
            this.d = i8;
            int i9 = 2;
            if (i2 == 2) {
                this.d = i8 / 2;
            } else if (i2 == 0) {
                this.d = i8 / 4;
            }
            int i10 = (i >>> 9) & 1;
            this.g = C3062Gl1.k(i2, i3);
            if (i3 == 3) {
                if (i2 == 3) {
                    i7 = C3062Gl1.e[i4 - 1];
                } else {
                    i7 = C3062Gl1.f[i4 - 1];
                }
                this.f = i7;
                this.c = (((i7 * 12) / this.d) + i10) * 4;
            } else {
                int i11 = C3503Kz.h0;
                if (i2 == 3) {
                    if (i3 == 2) {
                        i6 = C3062Gl1.g[i4 - 1];
                    } else {
                        i6 = C3062Gl1.h[i4 - 1];
                    }
                    this.f = i6;
                    this.c = ((i6 * C3503Kz.h0) / this.d) + i10;
                } else {
                    int i12 = C3062Gl1.i[i4 - 1];
                    this.f = i12;
                    if (i3 == 1) {
                        i11 = 72;
                    }
                    this.c = ((i11 * i12) / this.d) + i10;
                }
            }
            if (((i >> 6) & 3) == 3) {
                i9 = 1;
            }
            this.e = i9;
            return true;
        }
    }

    public static int j(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (!l(i2) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i9 = d[i6];
        if (i3 == 2) {
            i9 /= 2;
        } else if (i3 == 0) {
            i9 /= 4;
        }
        int i10 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            if (i3 == 3) {
                i8 = e[i5 - 1];
            } else {
                i8 = f[i5 - 1];
            }
            return (((i8 * 12) / i9) + i10) * 4;
        }
        if (i3 == 3) {
            if (i4 == 2) {
                i7 = g[i5 - 1];
            } else {
                i7 = h[i5 - 1];
            }
        } else {
            i7 = i[i5 - 1];
        }
        int i11 = C3503Kz.h0;
        if (i3 == 3) {
            return ((i7 * C3503Kz.h0) / i9) + i10;
        }
        if (i4 == 1) {
            i11 = 72;
        }
        return ((i11 * i7) / i9) + i10;
    }

    public static int k(int i2, int i3) {
        if (i3 != 1) {
            if (i3 == 2) {
                return 1152;
            }
            if (i3 == 3) {
                return 384;
            }
            throw new IllegalArgumentException();
        } else if (i2 == 3) {
            return 1152;
        } else {
            return m;
        }
    }

    public static boolean l(int i2) {
        if ((i2 & (-2097152)) == -2097152) {
            return true;
        }
        return false;
    }

    public static int m(int i2) {
        int i3;
        int i4;
        if (!l(i2) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0) {
            return -1;
        }
        int i5 = (i2 >>> 12) & 15;
        int i6 = (i2 >>> 10) & 3;
        if (i5 == 0 || i5 == 15 || i6 == 3) {
            return -1;
        }
        return k(i3, i4);
    }
}
