package o;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.nL1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8248nL1 implements InterfaceC7017iL1 {
    public static final int g = 5;
    public static final int h = 33;
    public static final int i = 35937;
    public int[] a;
    public int[] b;
    public int[] c;
    public int[] d;
    public double[] e;
    public b[] f;

    /* renamed from: o.nL1$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public b() {
            this.a = 0;
            this.b = 0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
        }
    }

    /* renamed from: o.nL1$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public int a;

        public c(int i, int i2) {
            this.a = i2;
        }
    }

    /* renamed from: o.nL1$d */
    /* loaded from: classes3.dex */
    public enum d {
        RED,
        GREEN,
        BLUE
    }

    /* renamed from: o.nL1$e */
    /* loaded from: classes3.dex */
    public static final class e {
        public int a;
        public double b;

        public e(int i, double d) {
            this.a = i;
            this.b = d;
        }
    }

    public static int b(b bVar, d dVar, int[] iArr) {
        int i2;
        int i3;
        int ordinal = dVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i2 = (-iArr[h(bVar.b, bVar.d, bVar.e)]) + iArr[h(bVar.b, bVar.c, bVar.e)] + iArr[h(bVar.a, bVar.d, bVar.e)];
                    i3 = iArr[h(bVar.a, bVar.c, bVar.e)];
                } else {
                    throw new IllegalArgumentException("unexpected direction " + dVar);
                }
            } else {
                i2 = (-iArr[h(bVar.b, bVar.c, bVar.f)]) + iArr[h(bVar.b, bVar.c, bVar.e)] + iArr[h(bVar.a, bVar.c, bVar.f)];
                i3 = iArr[h(bVar.a, bVar.c, bVar.e)];
            }
        } else {
            i2 = (-iArr[h(bVar.a, bVar.d, bVar.f)]) + iArr[h(bVar.a, bVar.d, bVar.e)] + iArr[h(bVar.a, bVar.c, bVar.f)];
            i3 = iArr[h(bVar.a, bVar.c, bVar.e)];
        }
        return i2 - i3;
    }

    public static int h(int i2, int i3, int i4) {
        return (i2 << 10) + (i2 << 6) + i2 + (i3 << 5) + i3 + i4;
    }

    public static int j(b bVar, d dVar, int i2, int[] iArr) {
        int i3;
        int i4;
        int ordinal = dVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i3 = (iArr[h(bVar.b, bVar.d, i2)] - iArr[h(bVar.b, bVar.c, i2)]) - iArr[h(bVar.a, bVar.d, i2)];
                    i4 = iArr[h(bVar.a, bVar.c, i2)];
                } else {
                    throw new IllegalArgumentException("unexpected direction " + dVar);
                }
            } else {
                i3 = (iArr[h(bVar.b, i2, bVar.f)] - iArr[h(bVar.b, i2, bVar.e)]) - iArr[h(bVar.a, i2, bVar.f)];
                i4 = iArr[h(bVar.a, i2, bVar.e)];
            }
        } else {
            i3 = (iArr[h(i2, bVar.d, bVar.f)] - iArr[h(i2, bVar.d, bVar.e)]) - iArr[h(i2, bVar.c, bVar.f)];
            i4 = iArr[h(i2, bVar.c, bVar.e)];
        }
        return i3 + i4;
    }

    public static int l(b bVar, int[] iArr) {
        return ((((((iArr[h(bVar.b, bVar.d, bVar.f)] - iArr[h(bVar.b, bVar.d, bVar.e)]) - iArr[h(bVar.b, bVar.c, bVar.f)]) + iArr[h(bVar.b, bVar.c, bVar.e)]) - iArr[h(bVar.a, bVar.d, bVar.f)]) + iArr[h(bVar.a, bVar.d, bVar.e)]) + iArr[h(bVar.a, bVar.c, bVar.f)]) - iArr[h(bVar.a, bVar.c, bVar.e)];
    }

    @Override // o.InterfaceC7017iL1
    public C7744lL1 a(int[] iArr, int i2) {
        c(new C7501kL1().a(iArr, i2).a);
        e();
        List<Integer> f = f(d(i2).a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Integer num : f) {
            num.intValue();
            linkedHashMap.put(num, 0);
        }
        return new C7744lL1(linkedHashMap);
    }

    public void c(Map<Integer, Integer> map) {
        this.a = new int[i];
        this.b = new int[i];
        this.c = new int[i];
        this.d = new int[i];
        this.e = new double[i];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            int q = C9448sG.q(intValue);
            int i2 = C9448sG.i(intValue);
            int g2 = C9448sG.g(intValue);
            int h2 = h((q >> 3) + 1, (i2 >> 3) + 1, (g2 >> 3) + 1);
            int[] iArr = this.a;
            iArr[h2] = iArr[h2] + intValue2;
            int[] iArr2 = this.b;
            iArr2[h2] = iArr2[h2] + (q * intValue2);
            int[] iArr3 = this.c;
            iArr3[h2] = iArr3[h2] + (i2 * intValue2);
            int[] iArr4 = this.d;
            iArr4[h2] = iArr4[h2] + (g2 * intValue2);
            double[] dArr = this.e;
            dArr[h2] = dArr[h2] + (intValue2 * ((q * q) + (i2 * i2) + (g2 * g2)));
        }
    }

    public c d(int i2) {
        int i3;
        double d2;
        double d3;
        this.f = new b[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            this.f[i4] = new b();
        }
        double[] dArr = new double[i2];
        b bVar = this.f[0];
        bVar.b = 32;
        bVar.d = 32;
        bVar.f = 32;
        int i5 = 0;
        int i6 = 1;
        while (true) {
            if (i6 < i2) {
                b[] bVarArr = this.f;
                if (g(bVarArr[i5], bVarArr[i6]).booleanValue()) {
                    b bVar2 = this.f[i5];
                    if (bVar2.g > 1) {
                        d2 = k(bVar2);
                    } else {
                        d2 = 0.0d;
                    }
                    dArr[i5] = d2;
                    b bVar3 = this.f[i6];
                    if (bVar3.g > 1) {
                        d3 = k(bVar3);
                    } else {
                        d3 = 0.0d;
                    }
                    dArr[i6] = d3;
                } else {
                    dArr[i5] = 0.0d;
                    i6--;
                }
                double d4 = dArr[0];
                int i7 = 0;
                for (int i8 = 1; i8 <= i6; i8++) {
                    double d5 = dArr[i8];
                    if (d5 > d4) {
                        i7 = i8;
                        d4 = d5;
                    }
                }
                if (d4 <= 0.0d) {
                    i3 = i6 + 1;
                    break;
                }
                i6++;
                i5 = i7;
            } else {
                i3 = i2;
                break;
            }
        }
        return new c(i2, i3);
    }

    public void e() {
        int i2 = 1;
        while (true) {
            int i3 = 33;
            if (i2 < 33) {
                int[] iArr = new int[33];
                int[] iArr2 = new int[33];
                int[] iArr3 = new int[33];
                int[] iArr4 = new int[33];
                double[] dArr = new double[33];
                int i4 = 1;
                while (i4 < i3) {
                    int i5 = 0;
                    int i6 = 0;
                    double d2 = 0.0d;
                    int i7 = 1;
                    int i8 = 0;
                    int i9 = 0;
                    while (i7 < i3) {
                        int h2 = h(i2, i4, i7);
                        i5 += this.a[h2];
                        i8 += this.b[h2];
                        i9 += this.c[h2];
                        i6 += this.d[h2];
                        d2 += this.e[h2];
                        iArr[i7] = iArr[i7] + i5;
                        iArr2[i7] = iArr2[i7] + i8;
                        iArr3[i7] = iArr3[i7] + i9;
                        iArr4[i7] = iArr4[i7] + i6;
                        dArr[i7] = dArr[i7] + d2;
                        int h3 = h(i2 - 1, i4, i7);
                        int i10 = i7;
                        int[] iArr5 = this.a;
                        iArr5[h2] = iArr5[h3] + iArr[i10];
                        int[] iArr6 = this.b;
                        iArr6[h2] = iArr6[h3] + iArr2[i10];
                        int[] iArr7 = this.c;
                        iArr7[h2] = iArr7[h3] + iArr3[i10];
                        int[] iArr8 = this.d;
                        iArr8[h2] = iArr8[h3] + iArr4[i10];
                        double[] dArr2 = this.e;
                        dArr2[h2] = dArr2[h3] + dArr[i10];
                        i7 = i10 + 1;
                        i3 = 33;
                    }
                    i4++;
                    i3 = 33;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public List<Integer> f(int i2) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < i2; i3++) {
            b bVar = this.f[i3];
            int l = l(bVar, this.a);
            if (l > 0) {
                int l2 = l(bVar, this.c) / l;
                arrayList.add(Integer.valueOf(((l(bVar, this.d) / l) & 255) | (((l(bVar, this.b) / l) & 255) << 16) | (-16777216) | ((l2 & 255) << 8)));
            }
        }
        return arrayList;
    }

    public Boolean g(b bVar, b bVar2) {
        int l = l(bVar, this.b);
        int l2 = l(bVar, this.c);
        int l3 = l(bVar, this.d);
        int l4 = l(bVar, this.a);
        d dVar = d.RED;
        e i2 = i(bVar, dVar, bVar.a + 1, bVar.b, l, l2, l3, l4);
        d dVar2 = d.GREEN;
        e i3 = i(bVar, dVar2, bVar.c + 1, bVar.d, l, l2, l3, l4);
        d dVar3 = d.BLUE;
        e i4 = i(bVar, dVar3, bVar.e + 1, bVar.f, l, l2, l3, l4);
        double d2 = i2.b;
        double d3 = i3.b;
        double d4 = i4.b;
        if (d2 >= d3 && d2 >= d4) {
            if (i2.a < 0) {
                return Boolean.FALSE;
            }
            dVar3 = dVar;
        } else if (d3 >= d2 && d3 >= d4) {
            dVar3 = dVar2;
        }
        bVar2.b = bVar.b;
        bVar2.d = bVar.d;
        bVar2.f = bVar.f;
        int ordinal = dVar3.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    int i5 = i4.a;
                    bVar.f = i5;
                    bVar2.a = bVar.a;
                    bVar2.c = bVar.c;
                    bVar2.e = i5;
                }
            } else {
                int i6 = i3.a;
                bVar.d = i6;
                bVar2.a = bVar.a;
                bVar2.c = i6;
                bVar2.e = bVar.e;
            }
        } else {
            int i7 = i2.a;
            bVar.b = i7;
            bVar2.a = i7;
            bVar2.c = bVar.c;
            bVar2.e = bVar.e;
        }
        bVar.g = (bVar.b - bVar.a) * (bVar.d - bVar.c) * (bVar.f - bVar.e);
        bVar2.g = (bVar2.b - bVar2.a) * (bVar2.d - bVar2.c) * (bVar2.f - bVar2.e);
        return Boolean.TRUE;
    }

    public e i(b bVar, d dVar, int i2, int i3, int i4, int i5, int i6, int i7) {
        C8248nL1 c8248nL1 = this;
        b bVar2 = bVar;
        int b2 = b(bVar2, dVar, c8248nL1.b);
        int b3 = b(bVar2, dVar, c8248nL1.c);
        int b4 = b(bVar2, dVar, c8248nL1.d);
        int b5 = b(bVar2, dVar, c8248nL1.a);
        int i8 = -1;
        double d2 = 0.0d;
        int i9 = i2;
        while (i9 < i3) {
            int j = j(bVar2, dVar, i9, c8248nL1.b) + b2;
            int j2 = j(bVar2, dVar, i9, c8248nL1.c) + b3;
            int j3 = j(bVar2, dVar, i9, c8248nL1.d) + b4;
            int j4 = j(bVar2, dVar, i9, c8248nL1.a) + b5;
            if (j4 != 0) {
                double d3 = (((j * j) + (j2 * j2)) + (j3 * j3)) / j4;
                int i10 = i4 - j;
                int i11 = i5 - j2;
                int i12 = i6 - j3;
                int i13 = i7 - j4;
                if (i13 != 0) {
                    double d4 = d3 + ((((i10 * i10) + (i11 * i11)) + (i12 * i12)) / i13);
                    if (d4 > d2) {
                        d2 = d4;
                        i8 = i9;
                    }
                }
            }
            i9++;
            c8248nL1 = this;
            bVar2 = bVar;
        }
        return new e(i8, d2);
    }

    public double k(b bVar) {
        int l = l(bVar, this.b);
        int l2 = l(bVar, this.c);
        int l3 = l(bVar, this.d);
        return (((((((this.e[h(bVar.b, bVar.d, bVar.f)] - this.e[h(bVar.b, bVar.d, bVar.e)]) - this.e[h(bVar.b, bVar.c, bVar.f)]) + this.e[h(bVar.b, bVar.c, bVar.e)]) - this.e[h(bVar.a, bVar.d, bVar.f)]) + this.e[h(bVar.a, bVar.d, bVar.e)]) + this.e[h(bVar.a, bVar.c, bVar.f)]) - this.e[h(bVar.a, bVar.c, bVar.e)]) - ((((l * l) + (l2 * l2)) + (l3 * l3)) / l(bVar, this.a));
    }
}
