package o;

import java.util.ArrayList;
import java.util.List;
import o.C9337ro1;

@Deprecated
/* renamed from: o.Pj  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3932Pj {
    public final List<byte[]> a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final float h;
    @InterfaceC11300zs1
    public final String i;

    public C3932Pj(List<byte[]> list, int i, int i2, int i3, int i4, int i5, int i6, float f, @InterfaceC11300zs1 String str) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = f;
        this.i = str;
    }

    public static byte[] a(C3012Fy1 c3012Fy1) {
        int R = c3012Fy1.R();
        int f = c3012Fy1.f();
        c3012Fy1.Z(R);
        return JE.d(c3012Fy1.e(), f, R);
    }

    public static C3932Pj b(C3012Fy1 c3012Fy1) throws C3989Py1 {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        int i5;
        try {
            c3012Fy1.Z(4);
            int L = (c3012Fy1.L() & 3) + 1;
            if (L != 3) {
                ArrayList arrayList = new ArrayList();
                int L2 = c3012Fy1.L() & 31;
                for (int i6 = 0; i6 < L2; i6++) {
                    arrayList.add(a(c3012Fy1));
                }
                int L3 = c3012Fy1.L();
                for (int i7 = 0; i7 < L3; i7++) {
                    arrayList.add(a(c3012Fy1));
                }
                if (L2 > 0) {
                    C9337ro1.c l = C9337ro1.l((byte[]) arrayList.get(0), L, ((byte[]) arrayList.get(0)).length);
                    int i8 = l.f;
                    int i9 = l.g;
                    int i10 = l.f854o;
                    int i11 = l.p;
                    int i12 = l.q;
                    float f2 = l.h;
                    str = JE.a(l.a, l.b, l.c);
                    i3 = i11;
                    i4 = i12;
                    f = f2;
                    i = i8;
                    i2 = i9;
                    i5 = i10;
                } else {
                    str = null;
                    i = -1;
                    i2 = -1;
                    i3 = -1;
                    i4 = -1;
                    f = 1.0f;
                    i5 = -1;
                }
                return new C3932Pj(arrayList, L, i, i2, i5, i3, i4, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw C3989Py1.a("Error parsing AVC config", e);
        }
    }
}
