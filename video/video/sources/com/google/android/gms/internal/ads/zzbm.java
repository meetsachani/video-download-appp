package com.google.android.gms.internal.ads;

import java.util.Arrays;
import o.C10323vs;
import o.C9593sr2;
import o.C9811tl1;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzbm {
    public final int a;
    public final String b;
    public final int c;
    public final zzz[] d;
    public int e;

    static {
        String str = zzeu.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzbm(String str, zzz... zzzVarArr) {
        boolean z;
        int length = zzzVarArr.length;
        int i = 1;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        zzdc.d(z);
        this.b = str;
        this.d = zzzVarArr;
        this.a = length;
        int b = zzay.b(zzzVarArr[0].f301o);
        this.c = b == -1 ? zzay.b(zzzVarArr[0].n) : b;
        String c = c(zzzVarArr[0].d);
        int i2 = zzzVarArr[0].f | 16384;
        while (true) {
            zzz[] zzzVarArr2 = this.d;
            if (i < zzzVarArr2.length) {
                if (!c.equals(c(zzzVarArr2[i].d))) {
                    zzz[] zzzVarArr3 = this.d;
                    d("languages", zzzVarArr3[0].d, zzzVarArr3[i].d, i);
                    return;
                }
                zzz[] zzzVarArr4 = this.d;
                if (i2 != (zzzVarArr4[i].f | 16384)) {
                    d("role flags", Integer.toBinaryString(zzzVarArr4[0].f), Integer.toBinaryString(this.d[i].f), i);
                    return;
                }
                i++;
            } else {
                return;
            }
        }
    }

    public static String c(@InterfaceC11300zs1 String str) {
        if (str != null && !str.equals(C10323vs.g1)) {
            return str;
        }
        return "";
    }

    public static void d(String str, @InterfaceC11300zs1 String str2, @InterfaceC11300zs1 String str3, int i) {
        zzdx.d(C9593sr2.a1, "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + C9811tl1.d));
    }

    public final int a(zzz zzzVar) {
        int i = 0;
        while (true) {
            zzz[] zzzVarArr = this.d;
            if (i < zzzVarArr.length) {
                if (zzzVar == zzzVarArr[i]) {
                    return i;
                }
                i++;
            } else {
                return -1;
            }
        }
    }

    public final zzz b(int i) {
        return this.d[i];
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbm.class == obj.getClass()) {
            zzbm zzbmVar = (zzbm) obj;
            if (this.b.equals(zzbmVar.b) && Arrays.equals(this.d, zzbmVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        if (i == 0) {
            int hashCode = ((this.b.hashCode() + 527) * 31) + Arrays.hashCode(this.d);
            this.e = hashCode;
            return hashCode;
        }
        return i;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.d);
        return this.b + ": " + arrays;
    }
}
