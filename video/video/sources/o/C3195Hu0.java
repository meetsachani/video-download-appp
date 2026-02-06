package o;

import java.io.IOException;
import java.util.Objects;
import o.AbstractC9082qn;
import o.C3586Lu0;

@Deprecated
/* renamed from: o.Hu0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3195Hu0 extends AbstractC9082qn {

    /* renamed from: o.Hu0$b */
    /* loaded from: classes2.dex */
    public static final class b implements AbstractC9082qn.f {
        public final C3976Pu0 a;
        public final int b;
        public final C3586Lu0.a c;

        @Override // o.AbstractC9082qn.f
        public AbstractC9082qn.e a(InterfaceC4421Uj0 interfaceC4421Uj0, long j) throws IOException {
            long position = interfaceC4421Uj0.getPosition();
            long c = c(interfaceC4421Uj0);
            long n = interfaceC4421Uj0.n();
            interfaceC4421Uj0.p(Math.max(6, this.a.c));
            long c2 = c(interfaceC4421Uj0);
            long n2 = interfaceC4421Uj0.n();
            if (c <= j && c2 > j) {
                return AbstractC9082qn.e.e(n);
            }
            if (c2 <= j) {
                return AbstractC9082qn.e.f(c2, n2);
            }
            return AbstractC9082qn.e.d(c, position);
        }

        public final long c(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
            while (interfaceC4421Uj0.n() < interfaceC4421Uj0.getLength() - 6 && !C3586Lu0.h(interfaceC4421Uj0, this.a, this.b, this.c)) {
                interfaceC4421Uj0.p(1);
            }
            if (interfaceC4421Uj0.n() >= interfaceC4421Uj0.getLength() - 6) {
                interfaceC4421Uj0.p((int) (interfaceC4421Uj0.getLength() - interfaceC4421Uj0.n()));
                return this.a.j;
            }
            return this.c.a;
        }

        public b(C3976Pu0 c3976Pu0, int i) {
            this.a = c3976Pu0;
            this.b = i;
            this.c = new C3586Lu0.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3195Hu0(final C3976Pu0 c3976Pu0, int i, long j, long j2) {
        super(new AbstractC9082qn.d() { // from class: o.Gu0
            @Override // o.AbstractC9082qn.d
            public final long a(long j3) {
                return C3976Pu0.this.l(j3);
            }
        }, new b(c3976Pu0, i), c3976Pu0.h(), 0L, c3976Pu0.j, j, j2, c3976Pu0.e(), Math.max(6, c3976Pu0.c));
        Objects.requireNonNull(c3976Pu0);
    }
}
