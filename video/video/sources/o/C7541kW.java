package o;

/* renamed from: o.kW  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7541kW {
    public final KP1 a = new KP1(LC0.m);

    public final void a(byte[] bArr, int i) throws UB {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.a.a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (MP1 unused) {
            throw UB.a();
        }
    }

    public C9753tW b(C2469An c2469An) throws C2605Bx0, UB {
        C2763Dn c2763Dn = new C2763Dn(c2469An);
        C8526oU[] b = C8526oU.b(c2763Dn.c(), c2763Dn.b());
        int i = 0;
        for (C8526oU c8526oU : b) {
            i += c8526oU.c();
        }
        byte[] bArr = new byte[i];
        int length = b.length;
        for (int i2 = 0; i2 < length; i2++) {
            C8526oU c8526oU2 = b[i2];
            byte[] a = c8526oU2.a();
            int c = c8526oU2.c();
            a(a, c);
            for (int i3 = 0; i3 < c; i3++) {
                bArr[(i3 * length) + i2] = a[i3];
            }
        }
        return C5346bW.a(bArr);
    }

    public C9753tW c(boolean[][] zArr) throws C2605Bx0, UB {
        return b(C2469An.o(zArr));
    }
}
