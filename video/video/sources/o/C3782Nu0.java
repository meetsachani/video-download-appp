package o;

import java.util.Arrays;
import o.AbstractC3423Kd2;
import o.C3976Pu0;

@Deprecated
/* renamed from: o.Nu0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3782Nu0 extends AbstractC3423Kd2 {
    public static final byte t = -1;
    public static final int u = 4;
    @InterfaceC11300zs1
    public C3976Pu0 r;
    @InterfaceC11300zs1
    public a s;

    /* renamed from: o.Nu0$a */
    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC8382nu1 {
        public C3976Pu0 a;
        public C3976Pu0.a b;
        public long c = -1;
        public long d = -1;

        public a(C3976Pu0 c3976Pu0, C3976Pu0.a aVar) {
            this.a = c3976Pu0;
            this.b = aVar;
        }

        @Override // o.InterfaceC8382nu1
        public long a(InterfaceC4421Uj0 interfaceC4421Uj0) {
            long j = this.d;
            if (j < 0) {
                return -1L;
            }
            long j2 = -(j + 2);
            this.d = -1L;
            return j2;
        }

        @Override // o.InterfaceC8382nu1
        public KZ1 b() {
            boolean z;
            if (this.c != -1) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.i(z);
            return new C3879Ou0(this.a, this.c);
        }

        @Override // o.InterfaceC8382nu1
        public void c(long j) {
            long[] jArr = this.b.a;
            this.d = jArr[TD2.n(jArr, j, true, true)];
        }

        public void d(long j) {
            this.c = j;
        }
    }

    public static boolean o(byte[] bArr) {
        if (bArr[0] != -1) {
            return false;
        }
        return true;
    }

    public static boolean p(C3012Fy1 c3012Fy1) {
        if (c3012Fy1.a() >= 5 && c3012Fy1.L() == 127 && c3012Fy1.N() == 1179402563) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC3423Kd2
    public long f(C3012Fy1 c3012Fy1) {
        if (!o(c3012Fy1.e())) {
            return -1L;
        }
        return n(c3012Fy1);
    }

    @Override // o.AbstractC3423Kd2
    @InterfaceC8800pd0(expression = {"#3.format"}, result = false)
    public boolean i(C3012Fy1 c3012Fy1, long j, AbstractC3423Kd2.b bVar) {
        byte[] e = c3012Fy1.e();
        C3976Pu0 c3976Pu0 = this.r;
        if (c3976Pu0 == null) {
            C3976Pu0 c3976Pu02 = new C3976Pu0(e, 17);
            this.r = c3976Pu02;
            bVar.a = c3976Pu02.i(Arrays.copyOfRange(e, 9, c3012Fy1.g()), null);
            return true;
        } else if ((e[0] & Byte.MAX_VALUE) == 3) {
            C3976Pu0.a g = C3684Mu0.g(c3012Fy1);
            C3976Pu0 c = c3976Pu0.c(g);
            this.r = c;
            this.s = new a(c, g);
            return true;
        } else if (!o(e)) {
            return true;
        } else {
            a aVar = this.s;
            if (aVar != null) {
                aVar.d(j);
                bVar.b = this.s;
            }
            C9542sf.g(bVar.a);
            return false;
        }
    }

    @Override // o.AbstractC3423Kd2
    public void l(boolean z) {
        super.l(z);
        if (z) {
            this.r = null;
            this.s = null;
        }
    }

    public final int n(C3012Fy1 c3012Fy1) {
        int i = (c3012Fy1.e()[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            c3012Fy1.Z(4);
            c3012Fy1.S();
        }
        int j = C3586Lu0.j(c3012Fy1, i);
        c3012Fy1.Y(0);
        return j;
    }
}
