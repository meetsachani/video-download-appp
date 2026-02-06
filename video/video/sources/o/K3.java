package o;

import java.io.IOException;
import o.KZ1;
import o.Yu2;

@Deprecated
/* loaded from: classes2.dex */
public final class K3 implements InterfaceC4324Tj0 {
    public static final InterfaceC4809Yj0 g = new InterfaceC4809Yj0() { // from class: o.J3
        @Override // o.InterfaceC4809Yj0
        public final InterfaceC4324Tj0[] b() {
            return K3.c();
        }
    };
    public static final int h = 8192;
    public static final int i = 16384;
    public static final int j = 7;
    public final L3 d = new L3();
    public final C3012Fy1 e = new C3012Fy1(16384);
    public boolean f;

    public static /* synthetic */ InterfaceC4324Tj0[] c() {
        return new InterfaceC4324Tj0[]{new K3()};
    }

    @Override // o.InterfaceC4324Tj0
    public void a(long j2, long j3) {
        this.f = false;
        this.d.b();
    }

    @Override // o.InterfaceC4324Tj0
    public void b(InterfaceC4518Vj0 interfaceC4518Vj0) {
        this.d.d(interfaceC4518Vj0, new Yu2.e(0, 1));
        interfaceC4518Vj0.n();
        interfaceC4518Vj0.p(new KZ1.b(C10323vs.b));
    }

    @Override // o.InterfaceC4324Tj0
    public boolean d(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        C3012Fy1 c3012Fy1 = new C3012Fy1(10);
        int i2 = 0;
        while (true) {
            interfaceC4421Uj0.x(c3012Fy1.e(), 0, 10);
            c3012Fy1.Y(0);
            if (c3012Fy1.O() != 4801587) {
                break;
            }
            c3012Fy1.Z(3);
            int K = c3012Fy1.K();
            i2 += K + 10;
            interfaceC4421Uj0.p(K);
        }
        interfaceC4421Uj0.i();
        interfaceC4421Uj0.p(i2);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            interfaceC4421Uj0.x(c3012Fy1.e(), 0, 7);
            c3012Fy1.Y(0);
            int R = c3012Fy1.R();
            if (R != 44096 && R != 44097) {
                interfaceC4421Uj0.i();
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                interfaceC4421Uj0.p(i4);
                i3 = 0;
            } else {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                int e = M3.e(c3012Fy1.e(), R);
                if (e == -1) {
                    return false;
                }
                interfaceC4421Uj0.p(e - 7);
            }
        }
    }

    @Override // o.InterfaceC4324Tj0
    public int j(InterfaceC4421Uj0 interfaceC4421Uj0, KE1 ke1) throws IOException {
        int read = interfaceC4421Uj0.read(this.e.e(), 0, 16384);
        if (read == -1) {
            return -1;
        }
        this.e.Y(0);
        this.e.X(read);
        if (!this.f) {
            this.d.e(0L, 4);
            this.f = true;
        }
        this.d.a(this.e);
        return 0;
    }

    @Override // o.InterfaceC4324Tj0
    public void g() {
    }
}
