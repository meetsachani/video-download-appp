package o;

import java.io.IOException;
import o.AbstractC9082qn;

@Deprecated
/* renamed from: o.zK1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11170zK1 extends AbstractC9082qn {
    public static final long f = 100000;
    public static final int g = 1000;
    public static final int h = 20000;

    /* renamed from: o.zK1$b */
    /* loaded from: classes2.dex */
    public static final class b implements AbstractC9082qn.f {
        public final C10071up2 a;
        public final C3012Fy1 b;

        public static void d(C3012Fy1 c3012Fy1) {
            int k;
            int g = c3012Fy1.g();
            if (c3012Fy1.a() < 10) {
                c3012Fy1.Y(g);
                return;
            }
            c3012Fy1.Z(9);
            int L = c3012Fy1.L() & 7;
            if (c3012Fy1.a() < L) {
                c3012Fy1.Y(g);
                return;
            }
            c3012Fy1.Z(L);
            if (c3012Fy1.a() < 4) {
                c3012Fy1.Y(g);
                return;
            }
            if (C11170zK1.k(c3012Fy1.e(), c3012Fy1.f()) == 443) {
                c3012Fy1.Z(4);
                int R = c3012Fy1.R();
                if (c3012Fy1.a() < R) {
                    c3012Fy1.Y(g);
                    return;
                }
                c3012Fy1.Z(R);
            }
            while (c3012Fy1.a() >= 4 && (k = C11170zK1.k(c3012Fy1.e(), c3012Fy1.f())) != 442 && k != 441 && (k >>> 8) == 1) {
                c3012Fy1.Z(4);
                if (c3012Fy1.a() < 2) {
                    c3012Fy1.Y(g);
                    return;
                }
                c3012Fy1.Y(Math.min(c3012Fy1.g(), c3012Fy1.f() + c3012Fy1.R()));
            }
        }

        @Override // o.AbstractC9082qn.f
        public AbstractC9082qn.e a(InterfaceC4421Uj0 interfaceC4421Uj0, long j) throws IOException {
            long position = interfaceC4421Uj0.getPosition();
            int min = (int) Math.min(20000L, interfaceC4421Uj0.getLength() - position);
            this.b.U(min);
            interfaceC4421Uj0.x(this.b.e(), 0, min);
            return c(this.b, j, position);
        }

        @Override // o.AbstractC9082qn.f
        public void b() {
            this.b.V(TD2.f);
        }

        public final AbstractC9082qn.e c(C3012Fy1 c3012Fy1, long j, long j2) {
            int i = -1;
            int i2 = -1;
            long j3 = -9223372036854775807L;
            while (c3012Fy1.a() >= 4) {
                if (C11170zK1.k(c3012Fy1.e(), c3012Fy1.f()) != 442) {
                    c3012Fy1.Z(1);
                } else {
                    c3012Fy1.Z(4);
                    long l = AK1.l(c3012Fy1);
                    if (l != C10323vs.b) {
                        long b = this.a.b(l);
                        if (b > j) {
                            if (j3 == C10323vs.b) {
                                return AbstractC9082qn.e.d(b, j2);
                            }
                            return AbstractC9082qn.e.e(j2 + i2);
                        } else if (100000 + b > j) {
                            return AbstractC9082qn.e.e(j2 + c3012Fy1.f());
                        } else {
                            i2 = c3012Fy1.f();
                            j3 = b;
                        }
                    }
                    d(c3012Fy1);
                    i = c3012Fy1.f();
                }
            }
            if (j3 != C10323vs.b) {
                return AbstractC9082qn.e.f(j3, j2 + i);
            }
            return AbstractC9082qn.e.h;
        }

        public b(C10071up2 c10071up2) {
            this.a = c10071up2;
            this.b = new C3012Fy1();
        }
    }

    public C11170zK1(C10071up2 c10071up2, long j, long j2) {
        super(new AbstractC9082qn.b(), new b(c10071up2), j, 0L, j + 1, 0L, j2, 188L, 1000);
    }

    public static int k(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
