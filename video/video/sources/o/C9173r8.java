package o;

import java.util.ArrayList;
import java.util.List;

/* renamed from: o.r8  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9173r8 {
    public final C2469An a;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final float g;
    public final VT1 i;
    public final List<C8924q8> b = new ArrayList(5);
    public final int[] h = new int[3];

    public C9173r8(C2469An c2469An, int i, int i2, int i3, int i4, float f, VT1 vt1) {
        this.a = c2469An;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = f;
        this.i = vt1;
    }

    public static float a(int[] iArr, int i) {
        return (i - iArr[2]) - (iArr[1] / 2.0f);
    }

    public final float b(int i, int i2, int i3, int i4) {
        C2469An c2469An = this.a;
        int i5 = c2469An.i();
        int[] iArr = this.h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i6 = i;
        while (i6 >= 0 && c2469An.f(i2, i6)) {
            int i7 = iArr[1];
            if (i7 > i3) {
                break;
            }
            iArr[1] = i7 + 1;
            i6--;
        }
        if (i6 >= 0 && iArr[1] <= i3) {
            while (i6 >= 0 && !c2469An.f(i2, i6)) {
                int i8 = iArr[0];
                if (i8 > i3) {
                    break;
                }
                iArr[0] = i8 + 1;
                i6--;
            }
            if (iArr[0] > i3) {
                return Float.NaN;
            }
            int i9 = i + 1;
            while (i9 < i5 && c2469An.f(i2, i9)) {
                int i10 = iArr[1];
                if (i10 > i3) {
                    break;
                }
                iArr[1] = i10 + 1;
                i9++;
            }
            if (i9 != i5 && iArr[1] <= i3) {
                while (i9 < i5 && !c2469An.f(i2, i9)) {
                    int i11 = iArr[2];
                    if (i11 > i3) {
                        break;
                    }
                    iArr[2] = i11 + 1;
                    i9++;
                }
                int i12 = iArr[2];
                if (i12 <= i3 && Math.abs(((iArr[0] + iArr[1]) + i12) - i4) * 5 < i4 * 2 && d(iArr)) {
                    return a(iArr, i9);
                }
            }
        }
        return Float.NaN;
    }

    public C8924q8 c() throws C9349rr1 {
        int i;
        C8924q8 e;
        C8924q8 e2;
        int i2 = this.c;
        int i3 = this.f;
        int i4 = this.e + i2;
        int i5 = this.d + (i3 / 2);
        int[] iArr = new int[3];
        for (int i6 = 0; i6 < i3; i6++) {
            if ((i6 & 1) == 0) {
                i = (i6 + 1) / 2;
            } else {
                i = -((i6 + 1) / 2);
            }
            int i7 = i + i5;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i8 = i2;
            while (i8 < i4 && !this.a.f(i8, i7)) {
                i8++;
            }
            int i9 = 0;
            while (i8 < i4) {
                if (this.a.f(i8, i7)) {
                    if (i9 == 1) {
                        iArr[1] = iArr[1] + 1;
                    } else if (i9 == 2) {
                        if (d(iArr) && (e2 = e(iArr, i7, i8)) != null) {
                            return e2;
                        }
                        iArr[0] = iArr[2];
                        iArr[1] = 1;
                        iArr[2] = 0;
                        i9 = 1;
                    } else {
                        i9++;
                        iArr[i9] = iArr[i9] + 1;
                    }
                } else {
                    if (i9 == 1) {
                        i9++;
                    }
                    iArr[i9] = iArr[i9] + 1;
                }
                i8++;
            }
            if (d(iArr) && (e = e(iArr, i7, i4)) != null) {
                return e;
            }
        }
        if (!this.b.isEmpty()) {
            return this.b.get(0);
        }
        throw C9349rr1.a();
    }

    public final boolean d(int[] iArr) {
        float f = this.g;
        float f2 = f / 2.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(f - iArr[i]) >= f2) {
                return false;
            }
        }
        return true;
    }

    public final C8924q8 e(int[] iArr, int i, int i2) {
        int i3 = iArr[0] + iArr[1] + iArr[2];
        float a = a(iArr, i2);
        float b = b(i, (int) a, iArr[1] * 2, i3);
        if (!Float.isNaN(b)) {
            float f = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
            for (C8924q8 c8924q8 : this.b) {
                if (c8924q8.f(f, b, a)) {
                    return c8924q8.g(b, a, f);
                }
            }
            C8924q8 c8924q82 = new C8924q8(a, b, f);
            this.b.add(c8924q82);
            VT1 vt1 = this.i;
            if (vt1 != null) {
                vt1.a(c8924q82);
                return null;
            }
            return null;
        }
        return null;
    }
}
