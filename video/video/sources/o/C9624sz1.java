package o;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;
import o.AbstractC4253Sp2;

/* renamed from: o.sz1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9624sz1 {
    public static final String a = "PathParser";

    /* renamed from: o.sz1$a */
    /* loaded from: classes.dex */
    public static class a {
        public int a;
        public boolean b;
    }

    public static void a(ArrayList<b> arrayList, char c, float[] fArr) {
        arrayList.add(new b(c, fArr));
    }

    public static boolean b(b[] bVarArr, b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i = 0; i < bVarArr.length; i++) {
            if (bVarArr[i].a != bVarArr2[i].a || bVarArr[i].b.length != bVarArr2[i].b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] c(float[] fArr, int i, int i2) {
        if (i <= i2) {
            int length = fArr.length;
            if (i >= 0 && i <= length) {
                int i3 = i2 - i;
                int min = Math.min(i3, length - i);
                float[] fArr2 = new float[i3];
                System.arraycopy(fArr, i, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    public static b[] d(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 1;
        while (i2 < str.length()) {
            int k = k(str, i2);
            String trim = str.substring(i, k).trim();
            if (!trim.isEmpty()) {
                a(arrayList, trim.charAt(0), h(trim));
            }
            i = k;
            i2 = k + 1;
        }
        if (i2 - i == 1 && i < str.length()) {
            a(arrayList, str.charAt(i), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[0]);
    }

    public static Path e(String str) {
        Path path = new Path();
        try {
            b.k(d(str), path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing " + str, e);
        }
    }

    public static b[] f(b[] bVarArr) {
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i = 0; i < bVarArr.length; i++) {
            bVarArr2[i] = new b(bVarArr[i]);
        }
        return bVarArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039 A[LOOP:0: B:3:0x0007->B:24:0x0039, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g(String str, int i, a aVar) {
        aVar.b = false;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i2 = i; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt != ' ') {
                if (charAt != 'E' && charAt != 'e') {
                    switch (charAt) {
                        case ',':
                            break;
                        case '-':
                            if (i2 != i && !z) {
                                aVar.b = true;
                                break;
                            }
                            z = false;
                            break;
                        case '.':
                            if (!z2) {
                                z = false;
                                z2 = true;
                                break;
                            } else {
                                aVar.b = true;
                                break;
                            }
                        default:
                            z = false;
                            break;
                    }
                } else {
                    z = true;
                }
                if (!z3) {
                    aVar.a = i2;
                }
            }
            z = false;
            z3 = true;
            if (!z3) {
            }
        }
        aVar.a = i2;
    }

    public static float[] h(String str) {
        if (str.charAt(0) != 'z' && str.charAt(0) != 'Z') {
            try {
                float[] fArr = new float[str.length()];
                a aVar = new a();
                int length = str.length();
                int i = 1;
                int i2 = 0;
                while (i < length) {
                    g(str, i, aVar);
                    int i3 = aVar.a;
                    if (i < i3) {
                        fArr[i2] = Float.parseFloat(str.substring(i, i3));
                        i2++;
                    }
                    if (aVar.b) {
                        i = i3;
                    } else {
                        i = i3 + 1;
                    }
                }
                return c(fArr, 0, i2);
            } catch (NumberFormatException e) {
                throw new RuntimeException("error in parsing \"" + str + AbstractC4253Sp2.b.x1, e);
            }
        }
        return new float[0];
    }

    public static void i(b[] bVarArr, float f, b[] bVarArr2, b[] bVarArr3) {
        if (j(bVarArr, bVarArr2, bVarArr3, f)) {
            return;
        }
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }

    @Deprecated
    public static boolean j(b[] bVarArr, b[] bVarArr2, b[] bVarArr3, float f) {
        if (bVarArr.length == bVarArr2.length && bVarArr2.length == bVarArr3.length) {
            if (!b(bVarArr2, bVarArr3)) {
                return false;
            }
            for (int i = 0; i < bVarArr.length; i++) {
                bVarArr[i].j(bVarArr2[i], bVarArr3[i], f);
            }
            return true;
        }
        throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes must have the same length");
    }

    public static int k(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                break;
            }
            i++;
        }
        return i;
    }

    public static void l(b[] bVarArr, Path path) {
        float[] fArr = new float[6];
        char c = 'm';
        for (b bVar : bVarArr) {
            b.e(path, fArr, c, bVar.a, bVar.b);
            c = bVar.a;
        }
    }

    public static void m(b[] bVarArr, b[] bVarArr2) {
        for (int i = 0; i < bVarArr2.length; i++) {
            bVarArr[i].a = bVarArr2[i].a;
            for (int i2 = 0; i2 < bVarArr2[i].b.length; i2++) {
                bVarArr[i].b[i2] = bVarArr2[i].b[i2];
            }
        }
    }

    /* renamed from: o.sz1$b */
    /* loaded from: classes.dex */
    public static class b {
        private char a;
        private final float[] b;

        public b(char c, float[] fArr) {
            this.a = c;
            this.b = fArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static void e(Path path, float[] fArr, char c, char c2, float[] fArr2) {
            int i;
            int i2;
            boolean z;
            boolean z2;
            char c3;
            char c4;
            int i3;
            float f;
            boolean z3;
            boolean z4;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            boolean z5;
            boolean z6;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            Path path2 = path;
            boolean z7 = false;
            float f17 = fArr[0];
            boolean z8 = true;
            float f18 = fArr[1];
            char c5 = 2;
            float f19 = fArr[2];
            char c6 = 3;
            float f20 = fArr[3];
            float f21 = fArr[4];
            float f22 = fArr[5];
            switch (c2) {
                case 'A':
                case 'a':
                    i = 7;
                    i2 = i;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    i2 = i;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i2 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i2 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i2 = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f21, f22);
                    f17 = f21;
                    f19 = f17;
                    f18 = f22;
                    f20 = f18;
                    i2 = 2;
                    break;
            }
            float f23 = f17;
            float f24 = f18;
            float f25 = f21;
            float f26 = f22;
            int i4 = 0;
            char c7 = c;
            while (i4 < fArr2.length) {
                if (c2 != 'A') {
                    if (c2 != 'C') {
                        if (c2 != 'H') {
                            if (c2 != 'Q') {
                                z = z7;
                                if (c2 != 'V') {
                                    if (c2 != 'a') {
                                        if (c2 != 'c') {
                                            z2 = z8;
                                            if (c2 != 'h') {
                                                if (c2 != 'q') {
                                                    c3 = c5;
                                                    if (c2 != 'v') {
                                                        if (c2 != 'L') {
                                                            if (c2 != 'M') {
                                                                c4 = c6;
                                                                if (c2 != 'S') {
                                                                    if (c2 != 'T') {
                                                                        if (c2 != 'l') {
                                                                            if (c2 != 'm') {
                                                                                if (c2 != 's') {
                                                                                    if (c2 == 't') {
                                                                                        if (c7 != 'q' && c7 != 't' && c7 != 'Q' && c7 != 'T') {
                                                                                            f16 = 0.0f;
                                                                                            f15 = 0.0f;
                                                                                        } else {
                                                                                            f15 = f23 - f19;
                                                                                            f16 = f24 - f20;
                                                                                        }
                                                                                        int i5 = i4 + 1;
                                                                                        path2.rQuadTo(f15, f16, fArr2[i4], fArr2[i5]);
                                                                                        float f27 = f15 + f23;
                                                                                        float f28 = f16 + f24;
                                                                                        f23 += fArr2[i4];
                                                                                        f24 += fArr2[i5];
                                                                                        f20 = f28;
                                                                                        f19 = f27;
                                                                                    }
                                                                                } else {
                                                                                    if (c7 != 'c' && c7 != 's' && c7 != 'C' && c7 != 'S') {
                                                                                        f14 = 0.0f;
                                                                                        f13 = 0.0f;
                                                                                    } else {
                                                                                        f13 = f24 - f20;
                                                                                        f14 = f23 - f19;
                                                                                    }
                                                                                    int i6 = i4 + 1;
                                                                                    int i7 = i4 + 2;
                                                                                    int i8 = i4 + 3;
                                                                                    path2.rCubicTo(f14, f13, fArr2[i4], fArr2[i6], fArr2[i7], fArr2[i8]);
                                                                                    f7 = fArr2[i4] + f23;
                                                                                    f8 = fArr2[i6] + f24;
                                                                                    f23 += fArr2[i7];
                                                                                    f9 = fArr2[i8];
                                                                                }
                                                                            } else {
                                                                                float f29 = fArr2[i4];
                                                                                f23 += f29;
                                                                                float f30 = fArr2[i4 + 1];
                                                                                f24 += f30;
                                                                                if (i4 > 0) {
                                                                                    path2.rLineTo(f29, f30);
                                                                                } else {
                                                                                    path2.rMoveTo(f29, f30);
                                                                                    f25 = f23;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            int i9 = i4 + 1;
                                                                            path2.rLineTo(fArr2[i4], fArr2[i9]);
                                                                            f23 += fArr2[i4];
                                                                            f10 = fArr2[i9];
                                                                        }
                                                                    } else {
                                                                        if (c7 == 'q' || c7 == 't' || c7 == 'Q' || c7 == 'T') {
                                                                            f23 = (f23 * 2.0f) - f19;
                                                                            f24 = (f24 * 2.0f) - f20;
                                                                        }
                                                                        int i10 = i4 + 1;
                                                                        path2.quadTo(f23, f24, fArr2[i4], fArr2[i10]);
                                                                        float f31 = fArr2[i4];
                                                                        f4 = fArr2[i10];
                                                                        f19 = f23;
                                                                        f20 = f24;
                                                                        i3 = i4;
                                                                        f23 = f31;
                                                                    }
                                                                } else {
                                                                    if (c7 == 'c' || c7 == 's' || c7 == 'C' || c7 == 'S') {
                                                                        f23 = (f23 * 2.0f) - f19;
                                                                        f24 = (f24 * 2.0f) - f20;
                                                                    }
                                                                    float f32 = f23;
                                                                    float f33 = f24;
                                                                    int i11 = i4 + 1;
                                                                    int i12 = i4 + 2;
                                                                    int i13 = i4 + 3;
                                                                    path2.cubicTo(f32, f33, fArr2[i4], fArr2[i11], fArr2[i12], fArr2[i13]);
                                                                    f2 = fArr2[i4];
                                                                    f3 = fArr2[i11];
                                                                    f23 = fArr2[i12];
                                                                    f24 = fArr2[i13];
                                                                    i3 = i4;
                                                                }
                                                            } else {
                                                                c4 = c6;
                                                                f11 = fArr2[i4];
                                                                f12 = fArr2[i4 + 1];
                                                                if (i4 > 0) {
                                                                    path2.lineTo(f11, f12);
                                                                } else {
                                                                    path2.moveTo(f11, f12);
                                                                    f23 = f11;
                                                                    f25 = f23;
                                                                    f24 = f12;
                                                                }
                                                            }
                                                            f26 = f24;
                                                        } else {
                                                            c4 = c6;
                                                            int i14 = i4 + 1;
                                                            path2.lineTo(fArr2[i4], fArr2[i14]);
                                                            f11 = fArr2[i4];
                                                            f12 = fArr2[i14];
                                                        }
                                                        f23 = f11;
                                                        f24 = f12;
                                                    } else {
                                                        c4 = c6;
                                                        path2.rLineTo(0.0f, fArr2[i4]);
                                                        f10 = fArr2[i4];
                                                    }
                                                    f24 += f10;
                                                } else {
                                                    c3 = c5;
                                                    c4 = c6;
                                                    int i15 = i4 + 1;
                                                    int i16 = i4 + 2;
                                                    int i17 = i4 + 3;
                                                    path2.rQuadTo(fArr2[i4], fArr2[i15], fArr2[i16], fArr2[i17]);
                                                    f7 = fArr2[i4] + f23;
                                                    f8 = fArr2[i15] + f24;
                                                    f23 += fArr2[i16];
                                                    f9 = fArr2[i17];
                                                }
                                                f24 += f9;
                                                f19 = f7;
                                                f20 = f8;
                                            } else {
                                                c3 = c5;
                                                c4 = c6;
                                                path2.rLineTo(fArr2[i4], 0.0f);
                                                f23 += fArr2[i4];
                                            }
                                        } else {
                                            z2 = z8;
                                            c3 = c5;
                                            c4 = c6;
                                            int i18 = i4 + 2;
                                            int i19 = i4 + 3;
                                            int i20 = i4 + 4;
                                            int i21 = i4 + 5;
                                            path2.rCubicTo(fArr2[i4], fArr2[i4 + 1], fArr2[i18], fArr2[i19], fArr2[i20], fArr2[i21]);
                                            float f34 = fArr2[i18] + f23;
                                            float f35 = fArr2[i19] + f24;
                                            f23 += fArr2[i20];
                                            f24 += fArr2[i21];
                                            f19 = f34;
                                            f20 = f35;
                                        }
                                        i3 = i4;
                                    } else {
                                        z2 = z8;
                                        c3 = c5;
                                        c4 = c6;
                                        int i22 = i4 + 5;
                                        float f36 = fArr2[i22] + f23;
                                        int i23 = i4 + 6;
                                        float f37 = fArr2[i23] + f24;
                                        float f38 = fArr2[i4];
                                        float f39 = fArr2[i4 + 1];
                                        float f40 = fArr2[i4 + 2];
                                        if (fArr2[i4 + 3] != 0.0f) {
                                            f5 = 0.0f;
                                            f6 = f24;
                                            z5 = z2;
                                        } else {
                                            f5 = 0.0f;
                                            f6 = f24;
                                            z5 = z;
                                        }
                                        i3 = i4;
                                        if (fArr2[i4 + 4] != f5) {
                                            z6 = z2;
                                        } else {
                                            z6 = z;
                                        }
                                        float f41 = f23;
                                        g(path, f41, f6, f36, f37, f38, f39, f40, z5, z6);
                                        f23 = f41 + fArr2[i22];
                                        f24 = f6 + fArr2[i23];
                                        f19 = f23;
                                        f20 = f24;
                                    }
                                } else {
                                    z2 = z8;
                                    c3 = c5;
                                    c4 = c6;
                                    i3 = i4;
                                    path2.lineTo(f23, fArr2[i3]);
                                    f4 = fArr2[i3];
                                }
                                f24 = f4;
                            } else {
                                z = z7;
                                z2 = z8;
                                c3 = c5;
                                c4 = c6;
                                i3 = i4;
                                int i24 = i3 + 1;
                                int i25 = i3 + 2;
                                int i26 = i3 + 3;
                                path2.quadTo(fArr2[i3], fArr2[i24], fArr2[i25], fArr2[i26]);
                                f2 = fArr2[i3];
                                f3 = fArr2[i24];
                                f23 = fArr2[i25];
                                f24 = fArr2[i26];
                            }
                            f19 = f2;
                            f20 = f3;
                        } else {
                            z = z7;
                            z2 = z8;
                            c3 = c5;
                            c4 = c6;
                            i3 = i4;
                            path2.lineTo(fArr2[i3], f24);
                            f23 = fArr2[i3];
                        }
                    } else {
                        z = z7;
                        z2 = z8;
                        c3 = c5;
                        c4 = c6;
                        i3 = i4;
                        int i27 = i3 + 2;
                        int i28 = i3 + 3;
                        int i29 = i3 + 4;
                        int i30 = i3 + 5;
                        path2.cubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i27], fArr2[i28], fArr2[i29], fArr2[i30]);
                        float f42 = fArr2[i29];
                        float f43 = fArr2[i30];
                        float f44 = fArr2[i27];
                        float f45 = fArr2[i28];
                        f23 = f42;
                        f24 = f43;
                        f20 = f45;
                        f19 = f44;
                    }
                } else {
                    float f46 = f23;
                    float f47 = f24;
                    z = z7;
                    z2 = z8;
                    c3 = c5;
                    c4 = c6;
                    i3 = i4;
                    int i31 = i3 + 5;
                    float f48 = fArr2[i31];
                    int i32 = i3 + 6;
                    float f49 = fArr2[i32];
                    float f50 = fArr2[i3];
                    float f51 = fArr2[i3 + 1];
                    float f52 = fArr2[i3 + 2];
                    if (fArr2[i3 + 3] != 0.0f) {
                        f = 0.0f;
                        z3 = z2;
                    } else {
                        f = 0.0f;
                        z3 = z;
                    }
                    if (fArr2[i3 + 4] != f) {
                        z4 = z2;
                    } else {
                        z4 = z;
                    }
                    g(path, f46, f47, f48, f49, f50, f51, f52, z3, z4);
                    f19 = fArr2[i31];
                    f23 = f19;
                    f20 = fArr2[i32];
                    f24 = f20;
                }
                i4 = i3 + i2;
                path2 = path;
                c7 = c2;
                z7 = z;
                z8 = z2;
                c5 = c3;
                c6 = c4;
            }
            fArr[z7 ? 1 : 0] = f23;
            fArr[z8 ? 1 : 0] = f24;
            fArr[c5] = f19;
            fArr[c6] = f20;
            fArr[4] = f25;
            fArr[5] = f26;
        }

        public static void f(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            double d10 = d3;
            int ceil = (int) Math.ceil(Math.abs((d9 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d7);
            double sin = Math.sin(d7);
            double cos2 = Math.cos(d8);
            double sin2 = Math.sin(d8);
            double d11 = -d10;
            double d12 = d11 * cos;
            double d13 = d4 * sin;
            double d14 = (d12 * sin2) - (d13 * cos2);
            double d15 = d11 * sin;
            double d16 = d4 * cos;
            double d17 = (sin2 * d15) + (cos2 * d16);
            double d18 = d9 / ceil;
            double d19 = d17;
            double d20 = d14;
            int i = 0;
            double d21 = d5;
            double d22 = d6;
            double d23 = d8;
            while (i < ceil) {
                double d24 = d23 + d18;
                double sin3 = Math.sin(d24);
                double cos3 = Math.cos(d24);
                double d25 = (d + ((d10 * cos) * cos3)) - (d13 * sin3);
                int i2 = i;
                double d26 = d2 + (d3 * sin * cos3) + (d16 * sin3);
                double d27 = (d12 * sin3) - (d13 * cos3);
                double d28 = (sin3 * d15) + (cos3 * d16);
                double d29 = d24 - d23;
                double tan = Math.tan(d29 / 2.0d);
                double sin4 = (Math.sin(d29) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                double d30 = d21 + (d20 * sin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d30, (float) (d22 + (d19 * sin4)), (float) (d25 - (sin4 * d27)), (float) (d26 - (sin4 * d28)), (float) d25, (float) d26);
                sin = sin;
                d18 = d18;
                d21 = d25;
                d15 = d15;
                d23 = d24;
                d19 = d28;
                cos = cos;
                d10 = d3;
                d22 = d26;
                i = i2 + 1;
                ceil = ceil;
                d20 = d27;
            }
        }

        public static void g(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            boolean z3;
            double radians = Math.toRadians(f7);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d3 = f;
            double d4 = f2;
            double d5 = f5;
            double d6 = ((d3 * cos) + (d4 * sin)) / d5;
            double d7 = f6;
            double d8 = (((-f) * sin) + (d4 * cos)) / d7;
            double d9 = f4;
            double d10 = ((f3 * cos) + (d9 * sin)) / d5;
            double d11 = (((-f3) * sin) + (d9 * cos)) / d7;
            double d12 = d6 - d10;
            double d13 = d8 - d11;
            double d14 = (d6 + d10) / 2.0d;
            double d15 = (d8 + d11) / 2.0d;
            double d16 = (d12 * d12) + (d13 * d13);
            if (d16 == 0.0d) {
                Log.w(C9624sz1.a, " Points are coincident");
                return;
            }
            double d17 = (1.0d / d16) - 0.25d;
            if (d17 < 0.0d) {
                Log.w(C9624sz1.a, "Points are too far apart " + d16);
                float sqrt = (float) (Math.sqrt(d16) / 1.99999d);
                g(path, f, f2, f3, f4, f5 * sqrt, sqrt * f6, f7, z, z2);
                return;
            }
            double sqrt2 = Math.sqrt(d17);
            double d18 = d12 * sqrt2;
            double d19 = sqrt2 * d13;
            if (z == z2) {
                d = d14 - d19;
                d2 = d15 + d18;
            } else {
                d = d14 + d19;
                d2 = d15 - d18;
            }
            double atan2 = Math.atan2(d8 - d2, d6 - d);
            double atan22 = Math.atan2(d11 - d2, d10 - d) - atan2;
            int i = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
            if (i >= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2 != z3) {
                if (i > 0) {
                    atan22 -= 6.283185307179586d;
                } else {
                    atan22 += 6.283185307179586d;
                }
            }
            double d20 = d * d5;
            double d21 = d2 * d7;
            f(path, (d20 * cos) - (d21 * sin), (d20 * sin) + (d21 * cos), d5, d7, d3, d4, radians, atan2, atan22);
        }

        @Deprecated
        public static void k(b[] bVarArr, Path path) {
            C9624sz1.l(bVarArr, path);
        }

        public float[] h() {
            return this.b;
        }

        public char i() {
            return this.a;
        }

        public void j(b bVar, b bVar2, float f) {
            this.a = bVar.a;
            int i = 0;
            while (true) {
                float[] fArr = bVar.b;
                if (i < fArr.length) {
                    this.b[i] = (fArr[i] * (1.0f - f)) + (bVar2.b[i] * f);
                    i++;
                } else {
                    return;
                }
            }
        }

        public b(b bVar) {
            this.a = bVar.a;
            float[] fArr = bVar.b;
            this.b = C9624sz1.c(fArr, 0, fArr.length);
        }
    }
}
