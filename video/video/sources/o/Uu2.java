package o;

import java.io.IOException;
import o.AbstractC9082qn;

@Deprecated
/* loaded from: classes2.dex */
public final class Uu2 extends AbstractC9082qn {
    public static final long f = 100000;
    public static final int g = 940;

    /* loaded from: classes2.dex */
    public static final class a implements AbstractC9082qn.f {
        public final C10071up2 a;
        public final C3012Fy1 b = new C3012Fy1();
        public final int c;
        public final int d;

        public a(int i, C10071up2 c10071up2, int i2) {
            this.c = i;
            this.a = c10071up2;
            this.d = i2;
        }

        @Override // o.AbstractC9082qn.f
        public AbstractC9082qn.e a(InterfaceC4421Uj0 interfaceC4421Uj0, long j) throws IOException {
            long position = interfaceC4421Uj0.getPosition();
            int min = (int) Math.min(this.d, interfaceC4421Uj0.getLength() - position);
            this.b.U(min);
            interfaceC4421Uj0.x(this.b.e(), 0, min);
            return c(this.b, j, position);
        }

        @Override // o.AbstractC9082qn.f
        public void b() {
            this.b.V(TD2.f);
        }

        public final AbstractC9082qn.e c(C3012Fy1 c3012Fy1, long j, long j2) {
            int a;
            int a2;
            int g = c3012Fy1.g();
            long j3 = -1;
            long j4 = -1;
            long j5 = -9223372036854775807L;
            while (c3012Fy1.a() >= 188 && (a2 = (a = Zu2.a(c3012Fy1.e(), c3012Fy1.f(), g)) + Xu2.A) <= g) {
                long c = Zu2.c(c3012Fy1, a, this.c);
                if (c != C10323vs.b) {
                    long b = this.a.b(c);
                    if (b > j) {
                        if (j5 == C10323vs.b) {
                            return AbstractC9082qn.e.d(b, j2);
                        }
                        return AbstractC9082qn.e.e(j2 + j4);
                    } else if (100000 + b > j) {
                        return AbstractC9082qn.e.e(j2 + a);
                    } else {
                        j4 = a;
                        j5 = b;
                    }
                }
                c3012Fy1.Y(a2);
                j3 = a2;
            }
            if (j5 != C10323vs.b) {
                return AbstractC9082qn.e.f(j5, j2 + j3);
            }
            return AbstractC9082qn.e.h;
        }
    }

    public Uu2(C10071up2 c10071up2, long j, long j2, int i, int i2) {
        super(new AbstractC9082qn.b(), new a(i, c10071up2, i2), j, 0L, j + 1, 0L, j2, 188L, g);
    }
}
