package o;

import o.VE2;

/* renamed from: o.oU  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8526oU {
    public final int a;
    public final byte[] b;

    public C8526oU(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    public static C8526oU[] b(byte[] bArr, VE2 ve2) {
        boolean z;
        int i;
        int i2;
        VE2.c d = ve2.d();
        VE2.b[] a = d.a();
        int i3 = 0;
        for (VE2.b bVar : a) {
            i3 += bVar.a();
        }
        C8526oU[] c8526oUArr = new C8526oU[i3];
        int i4 = 0;
        for (VE2.b bVar2 : a) {
            int i5 = 0;
            while (i5 < bVar2.a()) {
                int b = bVar2.b();
                c8526oUArr[i4] = new C8526oU(b, new byte[d.b() + b]);
                i5++;
                i4++;
            }
        }
        int length = c8526oUArr[0].b.length - d.b();
        int i6 = length - 1;
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            int i9 = 0;
            while (i9 < i4) {
                c8526oUArr[i9].b[i8] = bArr[i7];
                i9++;
                i7++;
            }
        }
        if (ve2.i() == 24) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 8;
        } else {
            i = i4;
        }
        int i10 = 0;
        while (i10 < i) {
            c8526oUArr[i10].b[i6] = bArr[i7];
            i10++;
            i7++;
        }
        int length2 = c8526oUArr[0].b.length;
        while (length < length2) {
            int i11 = 0;
            while (i11 < i4) {
                if (z) {
                    i2 = (i11 + 8) % i4;
                } else {
                    i2 = i11;
                }
                c8526oUArr[i2].b[(z && i2 > 7) ? length - 1 : length] = bArr[i7];
                i11++;
                i7++;
            }
            length++;
        }
        if (i7 == bArr.length) {
            return c8526oUArr;
        }
        throw new IllegalArgumentException();
    }

    public byte[] a() {
        return this.b;
    }

    public int c() {
        return this.a;
    }
}
