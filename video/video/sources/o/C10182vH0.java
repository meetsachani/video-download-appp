package o;

import java.util.Collections;
import java.util.List;
import o.C9337ro1;

@Deprecated
/* renamed from: o.vH0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10182vH0 {
    public static final int j = 33;
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

    public C10182vH0(List<byte[]> list, int i, int i2, int i3, int i4, int i5, int i6, float f, @InterfaceC11300zs1 String str) {
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

    public static C10182vH0 a(C3012Fy1 c3012Fy1) throws C3989Py1 {
        boolean z;
        List singletonList;
        int i;
        try {
            c3012Fy1.Z(21);
            int L = c3012Fy1.L() & 3;
            int L2 = c3012Fy1.L();
            int f = c3012Fy1.f();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                z = true;
                if (i3 >= L2) {
                    break;
                }
                c3012Fy1.Z(1);
                int R = c3012Fy1.R();
                for (int i5 = 0; i5 < R; i5++) {
                    int R2 = c3012Fy1.R();
                    i4 += R2 + 4;
                    c3012Fy1.Z(R2);
                }
                i3++;
            }
            c3012Fy1.Y(f);
            byte[] bArr = new byte[i4];
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            float f2 = 1.0f;
            String str = null;
            int i11 = 0;
            int i12 = 0;
            while (i11 < L2) {
                int L3 = c3012Fy1.L() & 63;
                int R3 = c3012Fy1.R();
                int i13 = i2;
                while (i13 < R3) {
                    int R4 = c3012Fy1.R();
                    boolean z2 = z;
                    byte[] bArr2 = C9337ro1.i;
                    int i14 = L;
                    System.arraycopy(bArr2, i2, bArr, i12, bArr2.length);
                    int length = i12 + bArr2.length;
                    System.arraycopy(c3012Fy1.e(), c3012Fy1.f(), bArr, length, R4);
                    if (L3 == 33 && i13 == 0) {
                        C9337ro1.a h = C9337ro1.h(bArr, length, length + R4);
                        i6 = h.k;
                        i7 = h.l;
                        i8 = h.n;
                        int i15 = h.f853o;
                        int i16 = h.p;
                        i = L2;
                        float f3 = h.m;
                        str = JE.c(h.a, h.b, h.c, h.d, h.h, h.i);
                        i10 = i16;
                        f2 = f3;
                        i9 = i15;
                    } else {
                        i = L2;
                    }
                    i12 = length + R4;
                    c3012Fy1.Z(R4);
                    i13++;
                    z = z2;
                    L = i14;
                    L2 = i;
                    i2 = 0;
                }
                i11++;
                i2 = 0;
            }
            int i17 = L;
            if (i4 == 0) {
                singletonList = Collections.EMPTY_LIST;
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new C10182vH0(singletonList, i17 + 1, i6, i7, i8, i9, i10, f2, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw C3989Py1.a("Error parsing HEVC config", e);
        }
    }
}
