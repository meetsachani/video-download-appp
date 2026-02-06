package o;

import java.io.IOException;

@Deprecated
/* renamed from: o.ju1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7392ju1 implements InterfaceC4324Tj0 {
    public static final InterfaceC4809Yj0 g = new InterfaceC4809Yj0() { // from class: o.iu1
        @Override // o.InterfaceC4809Yj0
        public final InterfaceC4324Tj0[] b() {
            return C7392ju1.c();
        }
    };
    public static final int h = 8;
    public InterfaceC4518Vj0 d;
    public AbstractC3423Kd2 e;
    public boolean f;

    public static /* synthetic */ InterfaceC4324Tj0[] c() {
        return new InterfaceC4324Tj0[]{new C7392ju1()};
    }

    public static C3012Fy1 e(C3012Fy1 c3012Fy1) {
        c3012Fy1.Y(0);
        return c3012Fy1;
    }

    @Override // o.InterfaceC4324Tj0
    public void a(long j, long j2) {
        AbstractC3423Kd2 abstractC3423Kd2 = this.e;
        if (abstractC3423Kd2 != null) {
            abstractC3423Kd2.m(j, j2);
        }
    }

    @Override // o.InterfaceC4324Tj0
    public void b(InterfaceC4518Vj0 interfaceC4518Vj0) {
        this.d = interfaceC4518Vj0;
    }

    @Override // o.InterfaceC4324Tj0
    public boolean d(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        try {
            return f(interfaceC4421Uj0);
        } catch (C3989Py1 unused) {
            return false;
        }
    }

    @InterfaceC8800pd0(expression = {"streamReader"}, result = true)
    public final boolean f(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        C8139mu1 c8139mu1 = new C8139mu1();
        if (c8139mu1.a(interfaceC4421Uj0, true) && (c8139mu1.b & 2) == 2) {
            int min = Math.min(c8139mu1.i, 8);
            C3012Fy1 c3012Fy1 = new C3012Fy1(min);
            interfaceC4421Uj0.x(c3012Fy1.e(), 0, min);
            if (C3782Nu0.p(e(c3012Fy1))) {
                this.e = new C3782Nu0();
            } else if (C7998mJ2.r(e(c3012Fy1))) {
                this.e = new C7998mJ2();
            } else if (C6175ew1.o(e(c3012Fy1))) {
                this.e = new C6175ew1();
            }
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC4324Tj0
    public int j(InterfaceC4421Uj0 interfaceC4421Uj0, KE1 ke1) throws IOException {
        C9542sf.k(this.d);
        if (this.e == null) {
            if (f(interfaceC4421Uj0)) {
                interfaceC4421Uj0.i();
            } else {
                throw C3989Py1.a("Failed to determine bitstream type", null);
            }
        }
        if (!this.f) {
            InterfaceC10568wr2 b = this.d.b(0, 1);
            this.d.n();
            this.e.d(this.d, b);
            this.f = true;
        }
        return this.e.g(interfaceC4421Uj0, ke1);
    }

    @Override // o.InterfaceC4324Tj0
    public void g() {
    }
}
