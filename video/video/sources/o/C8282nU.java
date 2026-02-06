package o;

import o.WE2;

/* renamed from: o.nU  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8282nU {
    public final int a;
    public final byte[] b;

    public C8282nU(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    public static C8282nU[] b(byte[] bArr, WE2 we2, EnumC8074me0 enumC8074me0) {
        int i;
        if (bArr.length == we2.h()) {
            WE2.b f = we2.f(enumC8074me0);
            WE2.a[] a = f.a();
            int i2 = 0;
            for (WE2.a aVar : a) {
                i2 += aVar.a();
            }
            C8282nU[] c8282nUArr = new C8282nU[i2];
            int i3 = 0;
            for (WE2.a aVar2 : a) {
                int i4 = 0;
                while (i4 < aVar2.a()) {
                    int b = aVar2.b();
                    c8282nUArr[i3] = new C8282nU(b, new byte[f.b() + b]);
                    i4++;
                    i3++;
                }
            }
            int length = c8282nUArr[0].b.length;
            int i5 = i2 - 1;
            while (i5 >= 0 && c8282nUArr[i5].b.length != length) {
                i5--;
            }
            int i6 = i5 + 1;
            int b2 = length - f.b();
            int i7 = 0;
            for (int i8 = 0; i8 < b2; i8++) {
                int i9 = 0;
                while (i9 < i3) {
                    c8282nUArr[i9].b[i8] = bArr[i7];
                    i9++;
                    i7++;
                }
            }
            int i10 = i6;
            while (i10 < i3) {
                c8282nUArr[i10].b[b2] = bArr[i7];
                i10++;
                i7++;
            }
            int length2 = c8282nUArr[0].b.length;
            while (b2 < length2) {
                int i11 = 0;
                while (i11 < i3) {
                    if (i11 < i6) {
                        i = b2;
                    } else {
                        i = b2 + 1;
                    }
                    c8282nUArr[i11].b[i] = bArr[i7];
                    i11++;
                    i7++;
                }
                b2++;
            }
            return c8282nUArr;
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
