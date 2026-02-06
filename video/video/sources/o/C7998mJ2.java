package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import o.AbstractC3423Kd2;
import o.C10833xx0;
import o.C8241nJ2;

@Deprecated
/* renamed from: o.mJ2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7998mJ2 extends AbstractC3423Kd2 {
    @InterfaceC11300zs1
    public a r;
    public int s;
    public boolean t;
    @InterfaceC11300zs1
    public C8241nJ2.c u;
    @InterfaceC11300zs1
    public C8241nJ2.a v;

    /* renamed from: o.mJ2$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public final C8241nJ2.c a;
        public final C8241nJ2.a b;
        public final byte[] c;
        public final C8241nJ2.b[] d;
        public final int e;

        public a(C8241nJ2.c cVar, C8241nJ2.a aVar, byte[] bArr, C8241nJ2.b[] bVarArr, int i) {
            this.a = cVar;
            this.b = aVar;
            this.c = bArr;
            this.d = bVarArr;
            this.e = i;
        }
    }

    @InterfaceC5056aJ2
    public static void n(C3012Fy1 c3012Fy1, long j) {
        if (c3012Fy1.b() < c3012Fy1.g() + 4) {
            c3012Fy1.V(Arrays.copyOf(c3012Fy1.e(), c3012Fy1.g() + 4));
        } else {
            c3012Fy1.X(c3012Fy1.g() + 4);
        }
        byte[] e = c3012Fy1.e();
        e[c3012Fy1.g() - 4] = (byte) (j & 255);
        e[c3012Fy1.g() - 3] = (byte) ((j >>> 8) & 255);
        e[c3012Fy1.g() - 2] = (byte) ((j >>> 16) & 255);
        e[c3012Fy1.g() - 1] = (byte) ((j >>> 24) & 255);
    }

    public static int o(byte b, a aVar) {
        if (!aVar.d[p(b, aVar.e, 1)].a) {
            return aVar.a.g;
        }
        return aVar.a.h;
    }

    @InterfaceC5056aJ2
    public static int p(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    public static boolean r(C3012Fy1 c3012Fy1) {
        try {
            return C8241nJ2.m(1, c3012Fy1, true);
        } catch (C3989Py1 unused) {
            return false;
        }
    }

    @Override // o.AbstractC3423Kd2
    public void e(long j) {
        boolean z;
        super.e(j);
        int i = 0;
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        this.t = z;
        C8241nJ2.c cVar = this.u;
        if (cVar != null) {
            i = cVar.g;
        }
        this.s = i;
    }

    @Override // o.AbstractC3423Kd2
    public long f(C3012Fy1 c3012Fy1) {
        int i = 0;
        if ((c3012Fy1.e()[0] & 1) == 1) {
            return -1L;
        }
        int o2 = o(c3012Fy1.e()[0], (a) C9542sf.k(this.r));
        if (this.t) {
            i = (this.s + o2) / 4;
        }
        long j = i;
        n(c3012Fy1, j);
        this.t = true;
        this.s = o2;
        return j;
    }

    @Override // o.AbstractC3423Kd2
    @InterfaceC8800pd0(expression = {"#3.format"}, result = false)
    public boolean i(C3012Fy1 c3012Fy1, long j, AbstractC3423Kd2.b bVar) throws IOException {
        if (this.r != null) {
            C9542sf.g(bVar.a);
            return false;
        }
        a q = q(c3012Fy1);
        this.r = q;
        if (q == null) {
            return true;
        }
        C8241nJ2.c cVar = q.a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar.j);
        arrayList.add(q.c);
        bVar.a = new C10833xx0.b().g0("audio/vorbis").I(cVar.e).b0(cVar.d).J(cVar.b).h0(cVar.c).V(arrayList).Z(C8241nJ2.c(AbstractC5317bO0.H(q.b.b))).G();
        return true;
    }

    @Override // o.AbstractC3423Kd2
    public void l(boolean z) {
        super.l(z);
        if (z) {
            this.r = null;
            this.u = null;
            this.v = null;
        }
        this.s = 0;
        this.t = false;
    }

    @InterfaceC11300zs1
    @InterfaceC5056aJ2
    public a q(C3012Fy1 c3012Fy1) throws IOException {
        C8241nJ2.c cVar = this.u;
        if (cVar == null) {
            this.u = C8241nJ2.j(c3012Fy1);
            return null;
        }
        C8241nJ2.a aVar = this.v;
        if (aVar == null) {
            this.v = C8241nJ2.h(c3012Fy1);
            return null;
        }
        byte[] bArr = new byte[c3012Fy1.g()];
        System.arraycopy(c3012Fy1.e(), 0, bArr, 0, c3012Fy1.g());
        C8241nJ2.b[] k = C8241nJ2.k(c3012Fy1, cVar.b);
        return new a(cVar, aVar, bArr, k, C8241nJ2.a(k.length - 1));
    }
}
