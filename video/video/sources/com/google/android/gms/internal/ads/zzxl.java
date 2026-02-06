package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzxl extends zzxn {
    public zzxl(zzbm zzbmVar, int[] iArr, int i, zzzf zzzfVar, long j, long j2, long j3, int i2, int i3, float f, float f2, List list, zzdg zzdgVar) {
        super(zzbmVar, iArr, 0);
        zzfyc.B(list);
    }

    public static /* bridge */ /* synthetic */ zzfyc a(zzyp[] zzypVarArr) {
        int i;
        zzfyc j;
        int i2;
        long[][] jArr;
        double d;
        long j2;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 1;
            if (i4 >= 2) {
                break;
            }
            zzyp zzypVar = zzypVarArr[i4];
            if (zzypVar != null && zzypVar.b.length > 1) {
                int i5 = zzfyc.Z;
                zzfxz zzfxzVar = new zzfxz();
                zzfxzVar.g(new zzxj(0L, 0L));
                arrayList.add(zzfxzVar);
            } else {
                arrayList.add(null);
            }
            i4++;
        }
        long[][] jArr2 = new long[2];
        for (int i6 = 0; i6 < 2; i6++) {
            zzyp zzypVar2 = zzypVarArr[i6];
            if (zzypVar2 == null) {
                jArr2[i6] = new long[0];
            } else {
                int[] iArr = zzypVar2.b;
                jArr2[i6] = new long[iArr.length];
                for (int i7 = 0; i7 < iArr.length; i7++) {
                    long j3 = zzypVar2.a.b(iArr[i7]).j;
                    long[] jArr3 = jArr2[i6];
                    if (j3 == -1) {
                        j3 = 0;
                    }
                    jArr3[i7] = j3;
                }
                Arrays.sort(jArr2[i6]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr4 = new long[2];
        for (int i8 = 0; i8 < 2; i8++) {
            long[] jArr5 = jArr2[i8];
            if (jArr5.length == 0) {
                j2 = 0;
            } else {
                j2 = jArr5[0];
            }
            jArr4[i8] = j2;
        }
        d(arrayList, jArr4);
        zzfyn c = zzfzi.b(zzfzn.c()).b(2).c();
        int i9 = 0;
        while (i9 < 2) {
            int length = jArr2[i9].length;
            if (length <= i) {
                i2 = i3;
                jArr = jArr2;
            } else {
                double[] dArr = new double[length];
                int i10 = i3;
                while (true) {
                    long[] jArr6 = jArr2[i9];
                    double d2 = 0.0d;
                    if (i10 >= jArr6.length) {
                        break;
                    }
                    int i11 = i3;
                    long[][] jArr7 = jArr2;
                    long j4 = jArr6[i10];
                    if (j4 != -1) {
                        d2 = Math.log(j4);
                    }
                    dArr[i10] = d2;
                    i10++;
                    i3 = i11;
                    jArr2 = jArr7;
                }
                i2 = i3;
                jArr = jArr2;
                int i12 = length - 1;
                double d3 = dArr[i12] - dArr[i2];
                int i13 = i2;
                while (i13 < i12) {
                    double d4 = dArr[i13];
                    i13++;
                    double d5 = d4 + dArr[i13];
                    if (d3 == 0.0d) {
                        d = 1.0d;
                    } else {
                        d = ((d5 * 0.5d) - dArr[i2]) / d3;
                    }
                    c.a(Double.valueOf(d), Integer.valueOf(i9));
                    i = i;
                }
            }
            i9++;
            i3 = i2;
            jArr2 = jArr;
            i = i;
        }
        int i14 = i3;
        long[][] jArr8 = jArr2;
        zzfyc B = zzfyc.B(c.x());
        for (int i15 = i14; i15 < B.size(); i15++) {
            int intValue = ((Integer) B.get(i15)).intValue();
            int i16 = iArr2[intValue] + 1;
            iArr2[intValue] = i16;
            jArr4[intValue] = jArr8[intValue][i16];
            d(arrayList, jArr4);
        }
        for (int i17 = i14; i17 < 2; i17++) {
            if (arrayList.get(i17) != null) {
                long j5 = jArr4[i17];
                jArr4[i17] = j5 + j5;
            }
        }
        d(arrayList, jArr4);
        zzfxz zzfxzVar2 = new zzfxz();
        while (i14 < arrayList.size()) {
            zzfxz zzfxzVar3 = (zzfxz) arrayList.get(i14);
            if (zzfxzVar3 == null) {
                j = zzfyc.F();
            } else {
                j = zzfxzVar3.j();
            }
            zzfxzVar2.g(j);
            i14++;
        }
        return zzfxzVar2.j();
    }

    public static void d(List list, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzfxz zzfxzVar = (zzfxz) list.get(i2);
            if (zzfxzVar != null) {
                zzfxzVar.g(new zzxj(j, jArr[i2]));
            }
        }
    }
}
