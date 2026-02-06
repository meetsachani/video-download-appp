package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Deprecated
/* loaded from: classes2.dex */
public final class G {
    public static final String a = "AacUtil";
    public static final int b = 1024;
    public static final int c = 1024;
    public static final int d = 2048;
    public static final int e = 512;
    public static final int f = 100000;
    public static final int g = 16000;
    public static final int h = 7000;
    public static final int i = 256000;
    public static final int j = 8000;
    public static final int k = 15;
    public static final int m = -1;

    /* renamed from: o  reason: collision with root package name */
    public static final String f460o = "mp4a.40.";
    public static final int p = 2;
    public static final int q = 5;
    public static final int r = 22;
    public static final int s = 23;
    public static final int t = 29;
    public static final int u = 31;
    public static final int v = 42;
    public static final int[] l = {96000, 88200, 64000, 48000, 44100, C9948uJ1.h, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] n = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface b {
    }

    /* loaded from: classes2.dex */
    public static final class c {
        public final int a;
        public final int b;
        public final String c;

        public c(int i, int i2, String str) {
            this.a = i;
            this.b = i2;
            this.c = str;
        }
    }

    public static byte[] a(int i2, int i3) {
        int i4 = 0;
        int i5 = -1;
        int i6 = 0;
        while (true) {
            int[] iArr = l;
            if (i6 >= iArr.length) {
                break;
            }
            if (i2 == iArr[i6]) {
                i5 = i6;
            }
            i6++;
        }
        int i7 = -1;
        while (true) {
            int[] iArr2 = n;
            if (i4 >= iArr2.length) {
                break;
            }
            if (i3 == iArr2[i4]) {
                i7 = i4;
            }
            i4++;
        }
        if (i2 != -1 && i7 != -1) {
            return b(2, i5, i7);
        }
        throw new IllegalArgumentException("Invalid sample rate or number of channels: " + i2 + C6566gU0.h + i3);
    }

    public static byte[] b(int i2, int i3, int i4) {
        return new byte[]{(byte) (((i2 << 3) & 248) | ((i3 >> 1) & 7)), (byte) (((i3 << 7) & 128) | ((i4 << 3) & 120))};
    }

    public static int c(C2903Ey1 c2903Ey1) {
        int h2 = c2903Ey1.h(5);
        if (h2 == 31) {
            return c2903Ey1.h(6) + 32;
        }
        return h2;
    }

    public static int d(C2903Ey1 c2903Ey1) throws C3989Py1 {
        int h2 = c2903Ey1.h(4);
        if (h2 == 15) {
            if (c2903Ey1.b() >= 24) {
                return c2903Ey1.h(24);
            }
            throw C3989Py1.a("AAC header insufficient data", null);
        } else if (h2 < 13) {
            return l[h2];
        } else {
            throw C3989Py1.a("AAC header wrong Sampling Frequency Index", null);
        }
    }

    public static c e(C2903Ey1 c2903Ey1, boolean z) throws C3989Py1 {
        int c2 = c(c2903Ey1);
        int d2 = d(c2903Ey1);
        int h2 = c2903Ey1.h(4);
        String str = "mp4a.40." + c2;
        if (c2 == 5 || c2 == 29) {
            d2 = d(c2903Ey1);
            c2 = c(c2903Ey1);
            if (c2 == 22) {
                h2 = c2903Ey1.h(4);
            }
        }
        if (z) {
            if (c2 != 1 && c2 != 2 && c2 != 3 && c2 != 4 && c2 != 6 && c2 != 7 && c2 != 17) {
                switch (c2) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw C3989Py1.e("Unsupported audio object type: " + c2);
                }
            }
            g(c2903Ey1, c2, h2);
            switch (c2) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int h3 = c2903Ey1.h(2);
                    if (h3 == 2 || h3 == 3) {
                        throw C3989Py1.e("Unsupported epConfig: " + h3);
                    }
            }
        }
        int i2 = n[h2];
        if (i2 != -1) {
            return new c(d2, i2, str);
        }
        throw C3989Py1.a(null, null);
    }

    public static c f(byte[] bArr) throws C3989Py1 {
        return e(new C2903Ey1(bArr), false);
    }

    public static void g(C2903Ey1 c2903Ey1, int i2, int i3) {
        if (c2903Ey1.g()) {
            I31.n(a, "Unexpected frameLengthFlag = 1");
        }
        if (c2903Ey1.g()) {
            c2903Ey1.s(14);
        }
        boolean g2 = c2903Ey1.g();
        if (i3 != 0) {
            if (i2 == 6 || i2 == 20) {
                c2903Ey1.s(3);
            }
            if (g2) {
                if (i2 == 22) {
                    c2903Ey1.s(16);
                }
                if (i2 == 17 || i2 == 19 || i2 == 20 || i2 == 23) {
                    c2903Ey1.s(3);
                }
                c2903Ey1.s(1);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }
}
