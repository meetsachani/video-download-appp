package o;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.mL1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8005mL1 {
    public static final int a = 10;
    public static final double b = 3.0d;

    /* renamed from: o.mL1$a */
    /* loaded from: classes3.dex */
    public static final class a implements Comparable<a> {
        public int X = -1;
        public double Y = -1.0d;

        @Override // java.lang.Comparable
        /* renamed from: e */
        public int compareTo(a aVar) {
            return Double.valueOf(this.Y).compareTo(Double.valueOf(aVar.Y));
        }
    }

    public static Map<Integer, Integer> a(int[] iArr, int[] iArr2, int i) {
        char c;
        double[] dArr;
        double[] dArr2;
        Random random = new Random(272008L);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        double[][] dArr3 = new double[iArr.length];
        int[] iArr3 = new int[iArr.length];
        XD1 xd1 = new XD1();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            c = 1;
            if (i2 >= iArr.length) {
                break;
            }
            int i4 = iArr[i2];
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i4));
            if (num == null) {
                dArr3[i3] = xd1.c(i4);
                iArr3[i3] = i4;
                i3++;
                linkedHashMap.put(Integer.valueOf(i4), 1);
            } else {
                linkedHashMap.put(Integer.valueOf(i4), Integer.valueOf(num.intValue() + 1));
            }
            i2++;
        }
        int[] iArr4 = new int[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            iArr4[i5] = ((Integer) linkedHashMap.get(Integer.valueOf(iArr3[i5]))).intValue();
        }
        int min = Math.min(i, i3);
        if (iArr2.length != 0) {
            min = Math.min(min, iArr2.length);
        }
        double[][] dArr4 = new double[min];
        int i6 = 0;
        for (int i7 = 0; i7 < iArr2.length; i7++) {
            dArr4[i7] = xd1.c(iArr2[i7]);
            i6++;
        }
        int i8 = min - i6;
        if (i8 > 0) {
            for (int i9 = 0; i9 < i8; i9++) {
            }
        }
        int[] iArr5 = new int[i3];
        for (int i10 = 0; i10 < i3; i10++) {
            iArr5[i10] = random.nextInt(min);
        }
        int[][] iArr6 = new int[min];
        for (int i11 = 0; i11 < min; i11++) {
            iArr6[i11] = new int[min];
        }
        a[][] aVarArr = new a[min];
        for (int i12 = 0; i12 < min; i12++) {
            aVarArr[i12] = new a[min];
            for (int i13 = 0; i13 < min; i13++) {
                aVarArr[i12][i13] = new a();
            }
        }
        int[] iArr7 = new int[min];
        int i14 = 0;
        while (i14 < 10) {
            int i15 = 0;
            while (i15 < min) {
                int i16 = i15 + 1;
                int i17 = i16;
                while (i17 < min) {
                    int[] iArr8 = iArr4;
                    double a2 = xd1.a(dArr4[i15], dArr4[i17]);
                    a aVar = aVarArr[i17][i15];
                    aVar.Y = a2;
                    aVar.X = i15;
                    a aVar2 = aVarArr[i15][i17];
                    aVar2.Y = a2;
                    aVar2.X = i17;
                    i17++;
                    iArr4 = iArr8;
                    iArr5 = iArr5;
                    c = c;
                }
                int[] iArr9 = iArr4;
                int[] iArr10 = iArr5;
                char c2 = c;
                Arrays.sort(aVarArr[i15]);
                for (int i18 = 0; i18 < min; i18++) {
                    iArr6[i15][i18] = aVarArr[i15][i18].X;
                }
                iArr4 = iArr9;
                iArr5 = iArr10;
                i15 = i16;
                c = c2;
            }
            int[] iArr11 = iArr4;
            int[] iArr12 = iArr5;
            char c3 = c;
            int i19 = 0;
            int i20 = 0;
            while (i19 < i3) {
                double[] dArr5 = dArr3[i19];
                int i21 = iArr12[i19];
                double a3 = xd1.a(dArr5, dArr4[i21]);
                int i22 = i19;
                double d = a3;
                int i23 = -1;
                int i24 = 0;
                while (i24 < min) {
                    int i25 = i20;
                    int[][] iArr13 = iArr6;
                    if (aVarArr[i21][i24].Y < 4.0d * a3) {
                        double a4 = xd1.a(dArr5, dArr4[i24]);
                        if (a4 < d) {
                            d = a4;
                            i23 = i24;
                        }
                    }
                    i24++;
                    iArr6 = iArr13;
                    i20 = i25;
                }
                int i26 = i20;
                int[][] iArr14 = iArr6;
                if (i23 != -1 && Math.abs(Math.sqrt(d) - Math.sqrt(a3)) > 3.0d) {
                    i20 = i26 + 1;
                    iArr12[i22] = i23;
                } else {
                    i20 = i26;
                }
                i19 = i22 + 1;
                iArr6 = iArr14;
            }
            int[][] iArr15 = iArr6;
            if (i20 == 0 && i14 != 0) {
                break;
            }
            double[] dArr6 = new double[min];
            double[] dArr7 = new double[min];
            double[] dArr8 = new double[min];
            char c4 = 0;
            Arrays.fill(iArr7, 0);
            int i27 = 0;
            while (i27 < i3) {
                int i28 = iArr12[i27];
                double[] dArr9 = dArr3[i27];
                char c5 = c4;
                int i29 = iArr11[i27];
                iArr7[i28] = iArr7[i28] + i29;
                double d2 = i29;
                dArr6[i28] = dArr6[i28] + (dArr9[c5] * d2);
                dArr7[i28] = dArr7[i28] + (dArr9[c3] * d2);
                dArr8[i28] = dArr8[i28] + (dArr9[2] * d2);
                i27++;
                c4 = 0;
            }
            int i30 = 0;
            while (i30 < min) {
                int i31 = iArr7[i30];
                if (i31 == 0) {
                    dArr4[i30] = new double[]{0.0d, 0.0d, 0.0d};
                    dArr = dArr6;
                    dArr2 = dArr7;
                } else {
                    double d3 = dArr6[i30];
                    dArr = dArr6;
                    dArr2 = dArr7;
                    double d4 = i31;
                    double d5 = d3 / d4;
                    double d6 = dArr2[i30] / d4;
                    double d7 = dArr8[i30] / d4;
                    double[] dArr10 = dArr4[i30];
                    dArr10[0] = d5;
                    dArr10[c3] = d6;
                    dArr10[2] = d7;
                }
                i30++;
                dArr6 = dArr;
                dArr7 = dArr2;
            }
            i14++;
            iArr4 = iArr11;
            iArr5 = iArr12;
            c = c3;
            iArr6 = iArr15;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (int i32 = 0; i32 < min; i32++) {
            int i33 = iArr7[i32];
            if (i33 != 0) {
                int b2 = xd1.b(dArr4[i32]);
                if (!linkedHashMap2.containsKey(Integer.valueOf(b2))) {
                    linkedHashMap2.put(Integer.valueOf(b2), Integer.valueOf(i33));
                }
            }
        }
        return linkedHashMap2;
    }
}
