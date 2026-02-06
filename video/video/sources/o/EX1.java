package o;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import o.GX1;
import o.InterfaceC10568wr2;
import o.InterfaceC10877y8;

@Deprecated
/* loaded from: classes2.dex */
public class EX1 {
    public static final int h = 32;
    public final InterfaceC10877y8 a;
    public final int b;
    public final C3012Fy1 c;
    public a d;
    public a e;
    public a f;
    public long g;

    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC10877y8.a {
        public long a;
        public long b;
        @InterfaceC11300zs1
        public C10634x8 c;
        @InterfaceC11300zs1
        public a d;

        public a(long j, int i) {
            d(j, i);
        }

        @Override // o.InterfaceC10877y8.a
        public C10634x8 a() {
            return (C10634x8) C9542sf.g(this.c);
        }

        public a b() {
            this.c = null;
            a aVar = this.d;
            this.d = null;
            return aVar;
        }

        public void c(C10634x8 c10634x8, a aVar) {
            this.c = c10634x8;
            this.d = aVar;
        }

        public void d(long j, int i) {
            boolean z;
            if (this.c == null) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.i(z);
            this.a = j;
            this.b = j + i;
        }

        public int e(long j) {
            return ((int) (j - this.a)) + this.c.b;
        }

        @Override // o.InterfaceC10877y8.a
        @InterfaceC11300zs1
        public InterfaceC10877y8.a next() {
            a aVar = this.d;
            if (aVar != null && aVar.c != null) {
                return aVar;
            }
            return null;
        }
    }

    public EX1(InterfaceC10877y8 interfaceC10877y8) {
        this.a = interfaceC10877y8;
        int f = interfaceC10877y8.f();
        this.b = f;
        this.c = new C3012Fy1(32);
        a aVar = new a(0L, f);
        this.d = aVar;
        this.e = aVar;
        this.f = aVar;
    }

    public static a d(a aVar, long j) {
        while (j >= aVar.b) {
            aVar = aVar.d;
        }
        return aVar;
    }

    public static a i(a aVar, long j, ByteBuffer byteBuffer, int i) {
        a d = d(aVar, j);
        while (i > 0) {
            int min = Math.min(i, (int) (d.b - j));
            byteBuffer.put(d.c.a, d.e(j), min);
            i -= min;
            j += min;
            if (j == d.b) {
                d = d.d;
            }
        }
        return d;
    }

    public static a j(a aVar, long j, byte[] bArr, int i) {
        a d = d(aVar, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (d.b - j));
            System.arraycopy(d.c.a, d.e(j), bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == d.b) {
                d = d.d;
            }
        }
        return d;
    }

    public static a k(a aVar, C9267rW c9267rW, GX1.b bVar, C3012Fy1 c3012Fy1) {
        boolean z;
        long j = bVar.b;
        int i = 1;
        c3012Fy1.U(1);
        a j2 = j(aVar, j, c3012Fy1.e(), 1);
        long j3 = j + 1;
        byte b = c3012Fy1.e()[0];
        if ((b & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        int i2 = b & Byte.MAX_VALUE;
        C7766lR c7766lR = c9267rW.Z;
        byte[] bArr = c7766lR.a;
        if (bArr == null) {
            c7766lR.a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a j4 = j(j2, j3, c7766lR.a, i2);
        long j5 = j3 + i2;
        if (z) {
            c3012Fy1.U(2);
            j4 = j(j4, j5, c3012Fy1.e(), 2);
            j5 += 2;
            i = c3012Fy1.R();
        }
        int i3 = i;
        int[] iArr = c7766lR.d;
        if (iArr == null || iArr.length < i3) {
            iArr = new int[i3];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = c7766lR.e;
        if (iArr3 == null || iArr3.length < i3) {
            iArr3 = new int[i3];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i4 = i3 * 6;
            c3012Fy1.U(i4);
            j4 = j(j4, j5, c3012Fy1.e(), i4);
            j5 += i4;
            c3012Fy1.Y(0);
            for (int i5 = 0; i5 < i3; i5++) {
                iArr2[i5] = c3012Fy1.R();
                iArr4[i5] = c3012Fy1.P();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.a - ((int) (j5 - bVar.b));
        }
        InterfaceC10568wr2.a aVar2 = (InterfaceC10568wr2.a) TD2.o(bVar.c);
        c7766lR.c(i3, iArr2, iArr4, aVar2.b, c7766lR.a, aVar2.a, aVar2.c, aVar2.d);
        long j6 = bVar.b;
        int i6 = (int) (j5 - j6);
        bVar.b = j6 + i6;
        bVar.a -= i6;
        return j4;
    }

    public static a l(a aVar, C9267rW c9267rW, GX1.b bVar, C3012Fy1 c3012Fy1) {
        if (c9267rW.y()) {
            aVar = k(aVar, c9267rW, bVar, c3012Fy1);
        }
        if (c9267rW.o()) {
            c3012Fy1.U(4);
            a j = j(aVar, bVar.b, c3012Fy1.e(), 4);
            int P = c3012Fy1.P();
            bVar.b += 4;
            bVar.a -= 4;
            c9267rW.w(P);
            a i = i(j, bVar.b, c9267rW.Y0, P);
            bVar.b += P;
            int i2 = bVar.a - P;
            bVar.a = i2;
            c9267rW.A(i2);
            return i(i, bVar.b, c9267rW.b1, bVar.a);
        }
        c9267rW.w(bVar.a);
        return i(aVar, bVar.b, c9267rW.Y0, bVar.a);
    }

    public final void a(a aVar) {
        if (aVar.c == null) {
            return;
        }
        this.a.a(aVar);
        aVar.b();
    }

    public void b(long j) {
        a aVar;
        if (j != -1) {
            while (true) {
                aVar = this.d;
                if (j < aVar.b) {
                    break;
                }
                this.a.c(aVar.c);
                this.d = this.d.b();
            }
            if (this.e.a < aVar.a) {
                this.e = aVar;
            }
        }
    }

    public void c(long j) {
        boolean z;
        if (j <= this.g) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        this.g = j;
        if (j != 0) {
            a aVar = this.d;
            if (j != aVar.a) {
                while (this.g > aVar.b) {
                    aVar = aVar.d;
                }
                a aVar2 = (a) C9542sf.g(aVar.d);
                a(aVar2);
                a aVar3 = new a(aVar.b, this.b);
                aVar.d = aVar3;
                if (this.g == aVar.b) {
                    aVar = aVar3;
                }
                this.f = aVar;
                if (this.e == aVar2) {
                    this.e = aVar3;
                    return;
                }
                return;
            }
        }
        a(this.d);
        a aVar4 = new a(this.g, this.b);
        this.d = aVar4;
        this.e = aVar4;
        this.f = aVar4;
    }

    public long e() {
        return this.g;
    }

    public void f(C9267rW c9267rW, GX1.b bVar) {
        l(this.e, c9267rW, bVar, this.c);
    }

    public final void g(int i) {
        long j = this.g + i;
        this.g = j;
        a aVar = this.f;
        if (j == aVar.b) {
            this.f = aVar.d;
        }
    }

    public final int h(int i) {
        a aVar = this.f;
        if (aVar.c == null) {
            aVar.c(this.a.b(), new a(this.f.b, this.b));
        }
        return Math.min(i, (int) (this.f.b - this.g));
    }

    public void m(C9267rW c9267rW, GX1.b bVar) {
        this.e = l(this.e, c9267rW, bVar, this.c);
    }

    public void n() {
        a(this.d);
        this.d.d(0L, this.b);
        a aVar = this.d;
        this.e = aVar;
        this.f = aVar;
        this.g = 0L;
        this.a.e();
    }

    public void o() {
        this.e = this.d;
    }

    public int p(CU cu, int i, boolean z) throws IOException {
        int h2 = h(i);
        a aVar = this.f;
        int read = cu.read(aVar.c.a, aVar.e(this.g), h2);
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        g(read);
        return read;
    }

    public void q(C3012Fy1 c3012Fy1, int i) {
        while (i > 0) {
            int h2 = h(i);
            a aVar = this.f;
            c3012Fy1.n(aVar.c.a, aVar.e(this.g), h2);
            i -= h2;
            g(h2);
        }
    }
}
