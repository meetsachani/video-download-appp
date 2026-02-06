package o;

import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: o.Wc2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4589Wc2 extends C6725h90 {
    public static final boolean q = false;
    public C3156Hk1 p;

    public C4589Wc2(String str) {
        this.a = str;
        double[] dArr = new double[str.length() / 2];
        int indexOf = str.indexOf(40) + 1;
        int indexOf2 = str.indexOf(44, indexOf);
        int i = 0;
        while (indexOf2 != -1) {
            dArr[i] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
            indexOf = indexOf2 + 1;
            indexOf2 = str.indexOf(44, indexOf);
            i++;
        }
        dArr[i] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
        this.p = e(Arrays.copyOf(dArr, i + 1));
    }

    public static C3156Hk1 d(String str) {
        String[] split = str.split("\\s+");
        int length = split.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = Double.parseDouble(split[i]);
        }
        return e(dArr);
    }

    public static C3156Hk1 e(double[] dArr) {
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d = 1.0d / length2;
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i = 0; i < dArr.length; i++) {
            double d2 = dArr[i];
            int i2 = i + length2;
            dArr2[i2][0] = d2;
            double d3 = i * d;
            dArr3[i2] = d3;
            if (i > 0) {
                int i3 = (length2 * 2) + i;
                dArr2[i3][0] = d2 + 1.0d;
                dArr3[i3] = d3 + 1.0d;
                int i4 = i - 1;
                dArr2[i4][0] = (d2 - 1.0d) - d;
                dArr3[i4] = (d3 - 1.0d) - d;
            }
        }
        C3156Hk1 c3156Hk1 = new C3156Hk1(dArr3, dArr2);
        System.out.println(" 0 " + c3156Hk1.c(0.0d, 0));
        System.out.println(" 1 " + c3156Hk1.c(1.0d, 0));
        return c3156Hk1;
    }

    @Override // o.C6725h90
    public double a(double d) {
        return this.p.c(d, 0);
    }

    @Override // o.C6725h90
    public double b(double d) {
        return this.p.f(d, 0);
    }
}
