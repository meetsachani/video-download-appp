package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbh {
    public final String[] a;
    public final double[] b;
    public final double[] c;
    public final int[] d;
    public int e;

    public /* synthetic */ zzbh(zzbf zzbfVar, zzbg zzbgVar) {
        List list;
        List list2;
        List list3;
        List list4;
        list = zzbfVar.b;
        int size = list.size();
        list2 = zzbfVar.a;
        this.a = (String[]) list2.toArray(new String[size]);
        list3 = zzbfVar.b;
        this.b = c(list3);
        list4 = zzbfVar.c;
        this.c = c(list4);
        this.d = new int[size];
        this.e = 0;
    }

    public static final double[] c(List list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = ((Double) list.get(i)).doubleValue();
        }
        return dArr;
    }

    public final List a() {
        String[] strArr = this.a;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            double[] dArr = this.c;
            double[] dArr2 = this.b;
            int[] iArr = this.d;
            double d = dArr[i];
            double d2 = dArr2[i];
            int i2 = iArr[i];
            arrayList.add(new zzbe(str, d, d2, i2 / this.e, i2));
        }
        return arrayList;
    }

    public final void b(double d) {
        this.e++;
        int i = 0;
        while (true) {
            double[] dArr = this.c;
            if (i < dArr.length) {
                double d2 = dArr[i];
                if (d2 <= d && d < this.b[i]) {
                    int[] iArr = this.d;
                    iArr[i] = iArr[i] + 1;
                }
                if (d >= d2) {
                    i++;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
