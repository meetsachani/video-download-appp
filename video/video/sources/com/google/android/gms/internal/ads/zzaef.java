package com.google.android.gms.internal.ads;

import o.C3503Kz;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzaef {
    public int a;
    @InterfaceC11300zs1
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public zzaef() {
    }

    public final boolean a(int i) {
        boolean m;
        int i2;
        int i3;
        int i4;
        int i5;
        String[] strArr;
        int[] iArr;
        int l;
        int[] iArr2;
        int[] iArr3;
        int i6;
        int[] iArr4;
        int[] iArr5;
        int i7;
        int[] iArr6;
        m = zzaeg.m(i);
        if (m && (i2 = (i >>> 19) & 3) != 1 && (i3 = (i >>> 17) & 3) != 0 && (i4 = (i >>> 12) & 15) != 0 && i4 != 15 && (i5 = (i >>> 10) & 3) != 3) {
            int i8 = i4 - 1;
            this.a = i2;
            strArr = zzaeg.a;
            this.b = strArr[3 - i3];
            iArr = zzaeg.b;
            int i9 = iArr[i5];
            this.d = i9;
            int i10 = 2;
            if (i2 == 2) {
                i9 /= 2;
                this.d = i9;
            } else if (i2 == 0) {
                i9 /= 4;
                this.d = i9;
            }
            int i11 = (i >>> 9) & 1;
            l = zzaeg.l(i2, i3);
            this.g = l;
            if (i3 == 3) {
                if (i2 == 3) {
                    iArr6 = zzaeg.c;
                    i7 = iArr6[i8];
                } else {
                    iArr5 = zzaeg.d;
                    i7 = iArr5[i8];
                }
                this.f = i7;
                this.c = (((i7 * 12) / i9) + i11) * 4;
            } else {
                int i12 = C3503Kz.h0;
                if (i2 != 3) {
                    iArr2 = zzaeg.g;
                    int i13 = iArr2[i8];
                    this.f = i13;
                    if (i3 == 1) {
                        i12 = 72;
                    }
                    this.c = ((i12 * i13) / i9) + i11;
                } else {
                    if (i3 == 2) {
                        iArr4 = zzaeg.e;
                        i6 = iArr4[i8];
                    } else {
                        iArr3 = zzaeg.f;
                        i6 = iArr3[i8];
                    }
                    this.f = i6;
                    this.c = ((i6 * C3503Kz.h0) / i9) + i11;
                }
            }
            if (((i >> 6) & 3) == 3) {
                i10 = 1;
            }
            this.e = i10;
            return true;
        }
        return false;
    }

    public zzaef(zzaef zzaefVar) {
        this.a = zzaefVar.a;
        this.b = zzaefVar.b;
        this.c = zzaefVar.c;
        this.d = zzaefVar.d;
        this.e = zzaefVar.e;
        this.f = zzaefVar.f;
        this.g = zzaefVar.g;
    }
}
