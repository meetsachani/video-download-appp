package o;

import java.util.ArrayList;
import java.util.zip.Inflater;
import o.C9705tJ1;

@Deprecated
/* renamed from: o.uJ1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9948uJ1 {
    public static final int a = 2037673328;
    public static final int b = 1836279920;
    public static final int c = 1918990112;
    public static final int d = 1684433976;
    public static final int e = 1835365224;
    public static final int f = 1886547818;
    public static final int g = 10000;
    public static final int h = 32000;
    public static final int i = 128000;

    @InterfaceC11300zs1
    public static C9705tJ1 a(byte[] bArr, int i2) {
        ArrayList<C9705tJ1.b> arrayList;
        C3012Fy1 c3012Fy1 = new C3012Fy1(bArr);
        try {
            if (c(c3012Fy1)) {
                arrayList = f(c3012Fy1);
            } else {
                arrayList = e(c3012Fy1);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        if (size != 1) {
            if (size != 2) {
                return null;
            }
            return new C9705tJ1(arrayList.get(0), arrayList.get(1), i2);
        }
        return new C9705tJ1(arrayList.get(0), i2);
    }

    public static int b(int i2) {
        return (-(i2 & 1)) ^ (i2 >> 1);
    }

    public static boolean c(C3012Fy1 c3012Fy1) {
        c3012Fy1.Z(4);
        int s = c3012Fy1.s();
        c3012Fy1.Y(0);
        if (s != 1886547818) {
            return false;
        }
        return true;
    }

    @InterfaceC11300zs1
    public static C9705tJ1.b d(C3012Fy1 c3012Fy1) {
        int s = c3012Fy1.s();
        C9705tJ1.b bVar = null;
        if (s > 10000) {
            return null;
        }
        float[] fArr = new float[s];
        for (int i2 = 0; i2 < s; i2++) {
            fArr[i2] = c3012Fy1.r();
        }
        int s2 = c3012Fy1.s();
        if (s2 > 32000) {
            return null;
        }
        double d2 = 2.0d;
        double log = Math.log(2.0d);
        int ceil = (int) Math.ceil(Math.log(s * 2.0d) / log);
        C2903Ey1 c2903Ey1 = new C2903Ey1(c3012Fy1.e());
        int i3 = 8;
        c2903Ey1.q(c3012Fy1.f() * 8);
        float[] fArr2 = new float[s2 * 5];
        int[] iArr = new int[5];
        int i4 = 0;
        int i5 = 0;
        while (i4 < s2) {
            C9705tJ1.b bVar2 = bVar;
            int i6 = 0;
            while (i6 < 5) {
                int b2 = iArr[i6] + b(c2903Ey1.h(ceil));
                if (b2 < s && b2 >= 0) {
                    fArr2[i5] = fArr[b2];
                    iArr[i6] = b2;
                    i6++;
                    i5++;
                } else {
                    return bVar2;
                }
            }
            i4++;
            bVar = bVar2;
        }
        C9705tJ1.b bVar3 = bVar;
        c2903Ey1.q((c2903Ey1.e() + 7) & (-8));
        int i7 = 32;
        int h2 = c2903Ey1.h(32);
        C9705tJ1.c[] cVarArr = new C9705tJ1.c[h2];
        int i8 = 0;
        while (i8 < h2) {
            int h3 = c2903Ey1.h(i3);
            int h4 = c2903Ey1.h(i3);
            int h5 = c2903Ey1.h(i7);
            if (h5 > 128000) {
                return bVar3;
            }
            int i9 = h2;
            int ceil2 = (int) Math.ceil(Math.log(s2 * d2) / log);
            float[] fArr3 = new float[h5 * 3];
            float[] fArr4 = new float[h5 * 2];
            int i10 = 0;
            int i11 = 0;
            while (i10 < h5) {
                int b3 = i11 + b(c2903Ey1.h(ceil2));
                if (b3 >= 0 && b3 < s2) {
                    int i12 = i10 * 3;
                    int i13 = b3 * 5;
                    fArr3[i12] = fArr2[i13];
                    fArr3[i12 + 1] = fArr2[i13 + 1];
                    fArr3[i12 + 2] = fArr2[i13 + 2];
                    int i14 = i10 * 2;
                    fArr4[i14] = fArr2[i13 + 3];
                    fArr4[i14 + 1] = fArr2[i13 + 4];
                    i10++;
                    i11 = b3;
                } else {
                    return bVar3;
                }
            }
            cVarArr[i8] = new C9705tJ1.c(h3, fArr3, fArr4, h4);
            i8++;
            h2 = i9;
            i7 = 32;
            d2 = 2.0d;
            i3 = 8;
        }
        return new C9705tJ1.b(cVarArr);
    }

    @InterfaceC11300zs1
    public static ArrayList<C9705tJ1.b> e(C3012Fy1 c3012Fy1) {
        if (c3012Fy1.L() != 0) {
            return null;
        }
        c3012Fy1.Z(7);
        int s = c3012Fy1.s();
        if (s == 1684433976) {
            C3012Fy1 c3012Fy12 = new C3012Fy1();
            Inflater inflater = new Inflater(true);
            try {
                if (!TD2.Q0(c3012Fy1, c3012Fy12, inflater)) {
                    return null;
                }
                inflater.end();
                c3012Fy1 = c3012Fy12;
            } finally {
                inflater.end();
            }
        } else if (s != 1918990112) {
            return null;
        }
        return g(c3012Fy1);
    }

    @InterfaceC11300zs1
    public static ArrayList<C9705tJ1.b> f(C3012Fy1 c3012Fy1) {
        int s;
        c3012Fy1.Z(8);
        int f2 = c3012Fy1.f();
        int g2 = c3012Fy1.g();
        while (f2 < g2 && (s = c3012Fy1.s() + f2) > f2 && s <= g2) {
            int s2 = c3012Fy1.s();
            if (s2 != 2037673328 && s2 != 1836279920) {
                c3012Fy1.Y(s);
                f2 = s;
            } else {
                c3012Fy1.X(s);
                return e(c3012Fy1);
            }
        }
        return null;
    }

    @InterfaceC11300zs1
    public static ArrayList<C9705tJ1.b> g(C3012Fy1 c3012Fy1) {
        ArrayList<C9705tJ1.b> arrayList = new ArrayList<>();
        int f2 = c3012Fy1.f();
        int g2 = c3012Fy1.g();
        while (f2 < g2) {
            int s = c3012Fy1.s() + f2;
            if (s <= f2 || s > g2) {
                return null;
            }
            if (c3012Fy1.s() == 1835365224) {
                C9705tJ1.b d2 = d(c3012Fy1);
                if (d2 == null) {
                    return null;
                }
                arrayList.add(d2);
            }
            c3012Fy1.Y(s);
            f2 = s;
        }
        return arrayList;
    }
}
