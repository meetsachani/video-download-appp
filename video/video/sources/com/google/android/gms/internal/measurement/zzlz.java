package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzlz {
    public static final zzlz f = new zzlz(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;

    private zzlz() {
        this(0, new int[8], new Object[8], true);
    }

    public static zzlz c(zzlz zzlzVar, zzlz zzlzVar2) {
        int i = zzlzVar.a + zzlzVar2.a;
        int[] copyOf = Arrays.copyOf(zzlzVar.b, i);
        System.arraycopy(zzlzVar2.b, 0, copyOf, zzlzVar.a, zzlzVar2.a);
        Object[] copyOf2 = Arrays.copyOf(zzlzVar.c, i);
        System.arraycopy(zzlzVar2.c, 0, copyOf2, zzlzVar.a, zzlzVar2.a);
        return new zzlz(i, copyOf, copyOf2, true);
    }

    public static void f(int i, Object obj, zzmw zzmwVar) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 5) {
                            zzmwVar.l(i2, ((Integer) obj).intValue());
                            return;
                        }
                        throw new RuntimeException(zzji.a());
                    } else if (zzmwVar.a() == zzmz.a) {
                        zzmwVar.z(i2);
                        ((zzlz) obj).j(zzmwVar);
                        zzmwVar.u(i2);
                        return;
                    } else {
                        zzmwVar.u(i2);
                        ((zzlz) obj).j(zzmwVar);
                        zzmwVar.z(i2);
                        return;
                    }
                }
                zzmwVar.w(i2, (zzhm) obj);
                return;
            }
            zzmwVar.b(i2, ((Long) obj).longValue());
            return;
        }
        zzmwVar.k(i2, ((Long) obj).longValue());
    }

    public static zzlz k() {
        return f;
    }

    public static zzlz l() {
        return new zzlz();
    }

    public final int a() {
        int r0;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 == 5) {
                                r0 = zzig.m0(i5, ((Integer) this.c[i3]).intValue());
                            } else {
                                throw new IllegalStateException(zzji.a());
                            }
                        } else {
                            r0 = (zzig.x0(i5) << 1) + ((zzlz) this.c[i3]).a();
                        }
                    } else {
                        r0 = zzig.V(i5, (zzhm) this.c[i3]);
                    }
                } else {
                    r0 = zzig.U(i5, ((Long) this.c[i3]).longValue());
                }
            } else {
                r0 = zzig.r0(i5, ((Long) this.c[i3]).longValue());
            }
            i2 += r0;
        }
        this.d = i2;
        return i2;
    }

    public final zzlz b(zzlz zzlzVar) {
        if (zzlzVar.equals(f)) {
            return this;
        }
        n();
        int i = this.a + zzlzVar.a;
        d(i);
        System.arraycopy(zzlzVar.b, 0, this.b, this.a, zzlzVar.a);
        System.arraycopy(zzlzVar.c, 0, this.c, this.a, zzlzVar.a);
        this.a = i;
        return this;
    }

    public final void d(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public final void e(int i, Object obj) {
        n();
        d(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzlz)) {
            return false;
        }
        zzlz zzlzVar = (zzlz) obj;
        int i = this.a;
        if (i == zzlzVar.a) {
            int[] iArr = this.b;
            int[] iArr2 = zzlzVar.b;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                    i2++;
                } else {
                    Object[] objArr = this.c;
                    Object[] objArr2 = zzlzVar.c;
                    int i3 = this.a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void g(zzmw zzmwVar) throws IOException {
        if (zzmwVar.a() == zzmz.b) {
            for (int i = this.a - 1; i >= 0; i--) {
                zzmwVar.p(this.b[i] >>> 3, this.c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.a; i2++) {
            zzmwVar.p(this.b[i2] >>> 3, this.c[i2]);
        }
    }

    public final void h(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            zzko.d(sb, i, String.valueOf(this.b[i2] >>> 3), this.c[i2]);
        }
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final int i() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            i2 += zzig.e0(this.b[i3] >>> 3, (zzhm) this.c[i3]);
        }
        this.d = i2;
        return i2;
    }

    public final void j(zzmw zzmwVar) throws IOException {
        if (this.a != 0) {
            if (zzmwVar.a() == zzmz.a) {
                for (int i = 0; i < this.a; i++) {
                    f(this.b[i], this.c[i], zzmwVar);
                }
                return;
            }
            for (int i2 = this.a - 1; i2 >= 0; i2--) {
                f(this.b[i2], this.c[i2], zzmwVar);
            }
        }
    }

    public final void m() {
        if (this.e) {
            this.e = false;
        }
    }

    public final void n() {
        if (this.e) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public zzlz(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }
}
