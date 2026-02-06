package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzhbj {
    public static final zzhbj f = new zzhbj(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;

    public zzhbj(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static zzhbj c() {
        return f;
    }

    public static zzhbj e(zzhbj zzhbjVar, zzhbj zzhbjVar2) {
        int i = zzhbjVar.a + zzhbjVar2.a;
        int[] copyOf = Arrays.copyOf(zzhbjVar.b, i);
        System.arraycopy(zzhbjVar2.b, 0, copyOf, zzhbjVar.a, zzhbjVar2.a);
        Object[] copyOf2 = Arrays.copyOf(zzhbjVar.c, i);
        System.arraycopy(zzhbjVar2.c, 0, copyOf2, zzhbjVar.a, zzhbjVar2.a);
        return new zzhbj(i, copyOf, copyOf2, true);
    }

    public static zzhbj f() {
        return new zzhbj();
    }

    public final int a() {
        int e;
        int f2;
        int i;
        int i2 = this.d;
        if (i2 == -1) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.a; i4++) {
                int i5 = this.b[i4];
                int i6 = i5 >>> 3;
                int i7 = i5 & 7;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 == 5) {
                                    ((Integer) this.c[i4]).getClass();
                                    i = zzgxx.e(i6 << 3) + 4;
                                } else {
                                    throw new IllegalStateException(new zzgzg("Protocol message tag had invalid wire type."));
                                }
                            } else {
                                int e2 = zzgxx.e(i6 << 3);
                                e = e2 + e2;
                                f2 = ((zzhbj) this.c[i4]).a();
                            }
                        } else {
                            int e3 = zzgxx.e(i6 << 3);
                            int i8 = ((zzgxk) this.c[i4]).i();
                            i = e3 + zzgxx.e(i8) + i8;
                        }
                    } else {
                        ((Long) this.c[i4]).getClass();
                        i = zzgxx.e(i6 << 3) + 8;
                    }
                    i3 += i;
                } else {
                    int i9 = i6 << 3;
                    long longValue = ((Long) this.c[i4]).longValue();
                    e = zzgxx.e(i9);
                    f2 = zzgxx.f(longValue);
                }
                i = e + f2;
                i3 += i;
            }
            this.d = i3;
            return i3;
        }
        return i2;
    }

    public final int b() {
        int i = this.d;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.a; i3++) {
                int e = zzgxx.e(8);
                int e2 = zzgxx.e(16) + zzgxx.e(this.b[i3] >>> 3);
                int e3 = zzgxx.e(24);
                int i4 = ((zzgxk) this.c[i3]).i();
                i2 += e + e + e2 + e3 + zzgxx.e(i4) + i4;
            }
            this.d = i2;
            return i2;
        }
        return i;
    }

    public final zzhbj d(zzhbj zzhbjVar) {
        if (zzhbjVar.equals(f)) {
            return this;
        }
        g();
        int i = this.a + zzhbjVar.a;
        n(i);
        System.arraycopy(zzhbjVar.b, 0, this.b, this.a, zzhbjVar.a);
        System.arraycopy(zzhbjVar.c, 0, this.c, this.a, zzhbjVar.a);
        this.a = i;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzhbj)) {
            return false;
        }
        zzhbj zzhbjVar = (zzhbj) obj;
        int i = this.a;
        if (i == zzhbjVar.a) {
            int[] iArr = this.b;
            int[] iArr2 = zzhbjVar.b;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                    i2++;
                } else {
                    Object[] objArr = this.c;
                    Object[] objArr2 = zzhbjVar.c;
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

    public final void g() {
        if (this.e) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void h() {
        if (this.e) {
            this.e = false;
        }
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i + 527;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i2 * 31) + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final void i(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            zzhaf.b(sb, i, String.valueOf(this.b[i2] >>> 3), this.c[i2]);
        }
    }

    public final void j(int i, Object obj) {
        g();
        n(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void k(zzhbx zzhbxVar) throws IOException {
        for (int i = 0; i < this.a; i++) {
            zzhbxVar.I(this.b[i] >>> 3, this.c[i]);
        }
    }

    public final void l(zzhbx zzhbxVar) throws IOException {
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 == 5) {
                                    zzhbxVar.z(i4, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(new zzgzg("Protocol message tag had invalid wire type."));
                                }
                            } else {
                                zzhbxVar.w(i4);
                                ((zzhbj) obj).l(zzhbxVar);
                                zzhbxVar.W(i4);
                            }
                        } else {
                            zzhbxVar.F(i4, (zzgxk) obj);
                        }
                    } else {
                        zzhbxVar.K(i4, ((Long) obj).longValue());
                    }
                } else {
                    zzhbxVar.m(i4, ((Long) obj).longValue());
                }
            }
        }
    }

    public final boolean m(int i, zzgxq zzgxqVar) throws IOException {
        int q;
        g();
        int i2 = i & 7;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                j(i, Integer.valueOf(zzgxqVar.m()));
                                return true;
                            }
                            throw new zzgzg("Protocol message tag had invalid wire type.");
                        }
                        zzgxqVar.A(0);
                        return false;
                    }
                    zzhbj zzhbjVar = new zzhbj();
                    do {
                        q = zzgxqVar.q();
                        if (q == 0) {
                            break;
                        }
                    } while (zzhbjVar.m(q, zzgxqVar));
                    zzgxqVar.A(4 | ((i >>> 3) << 3));
                    j(i, zzhbjVar);
                    return true;
                }
                j(i, zzgxqVar.x());
                return true;
            }
            j(i, Long.valueOf(zzgxqVar.s()));
            return true;
        }
        j(i, Long.valueOf(zzgxqVar.t()));
        return true;
    }

    public final void n(int i) {
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

    private zzhbj() {
        this(0, new int[8], new Object[8], true);
    }
}
