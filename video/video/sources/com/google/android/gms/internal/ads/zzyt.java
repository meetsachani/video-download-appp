package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zzyt {
    public final int[] a;
    public final zzxe[] b;
    public final int[] c;
    public final int[][][] d;
    public final zzxe e;

    @InterfaceC5056aJ2
    public zzyt(String[] strArr, int[] iArr, zzxe[] zzxeVarArr, int[] iArr2, int[][][] iArr3, zzxe zzxeVar) {
        this.a = iArr;
        this.b = zzxeVarArr;
        this.d = iArr3;
        this.c = iArr2;
        this.e = zzxeVar;
    }

    public final int a(int i, int i2, boolean z) {
        zzxe[] zzxeVarArr = this.b;
        int i3 = zzxeVarArr[i].b(i2).a;
        int[] iArr = new int[i3];
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            if ((this.d[i][i2][i6] & 7) == 4) {
                iArr[i5] = i6;
                i5++;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, i5);
        String str = null;
        int i7 = 0;
        int i8 = 16;
        boolean z2 = false;
        while (i4 < copyOf.length) {
            String str2 = zzxeVarArr[i].b(i2).b(copyOf[i4]).f301o;
            int i9 = i7 + 1;
            if (i7 == 0) {
                str = str2;
            } else {
                z2 |= !Objects.equals(str, str2);
            }
            i8 = Math.min(i8, this.d[i][i2][i4] & 24);
            i4++;
            i7 = i9;
        }
        if (z2) {
            return Math.min(i8, this.c[i]);
        }
        return i8;
    }

    public final int b(int i, int i2, int i3) {
        return this.d[i][i2][i3];
    }

    public final int c(int i) {
        return this.a[i];
    }

    public final zzxe d(int i) {
        return this.b[i];
    }

    public final zzxe e() {
        return this.e;
    }
}
