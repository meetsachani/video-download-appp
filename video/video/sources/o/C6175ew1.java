package o;

import java.util.Arrays;
import java.util.List;
import o.AbstractC3423Kd2;
import o.C10833xx0;

@Deprecated
/* renamed from: o.ew1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6175ew1 extends AbstractC3423Kd2 {
    public static final byte[] s = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] t = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean r;

    public static boolean n(C3012Fy1 c3012Fy1, byte[] bArr) {
        if (c3012Fy1.a() < bArr.length) {
            return false;
        }
        int f = c3012Fy1.f();
        byte[] bArr2 = new byte[bArr.length];
        c3012Fy1.n(bArr2, 0, bArr.length);
        c3012Fy1.Y(f);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean o(C3012Fy1 c3012Fy1) {
        return n(c3012Fy1, s);
    }

    @Override // o.AbstractC3423Kd2
    public long f(C3012Fy1 c3012Fy1) {
        return c(C6418fw1.e(c3012Fy1.e()));
    }

    @Override // o.AbstractC3423Kd2
    @InterfaceC8800pd0(expression = {"#3.format"}, result = false)
    public boolean i(C3012Fy1 c3012Fy1, long j, AbstractC3423Kd2.b bVar) throws C3989Py1 {
        if (n(c3012Fy1, s)) {
            byte[] copyOf = Arrays.copyOf(c3012Fy1.e(), c3012Fy1.g());
            int c = C6418fw1.c(copyOf);
            List<byte[]> a = C6418fw1.a(copyOf);
            if (bVar.a != null) {
                return true;
            }
            bVar.a = new C10833xx0.b().g0(C4128Rj1.a0).J(c).h0(48000).V(a).G();
            return true;
        }
        byte[] bArr = t;
        if (n(c3012Fy1, bArr)) {
            C9542sf.k(bVar.a);
            if (this.r) {
                return true;
            }
            this.r = true;
            c3012Fy1.Z(bArr.length);
            C4224Si1 c2 = C8241nJ2.c(AbstractC5317bO0.H(C8241nJ2.i(c3012Fy1, false, false).b));
            if (c2 == null) {
                return true;
            }
            bVar.a = bVar.a.b().Z(c2.b(bVar.a.e1)).G();
            return true;
        }
        C9542sf.k(bVar.a);
        return false;
    }

    @Override // o.AbstractC3423Kd2
    public void l(boolean z) {
        super.l(z);
        if (z) {
            this.r = false;
        }
    }
}
