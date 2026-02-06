package o;

import java.io.IOException;

@Deprecated
/* loaded from: classes2.dex */
public final class Vu2 {
    public static final String j = "TsDurationReader";
    public final int a;
    public boolean d;
    public boolean e;
    public boolean f;
    public final C10071up2 b = new C10071up2(0);
    public long g = C10323vs.b;
    public long h = C10323vs.b;
    public long i = C10323vs.b;
    public final C3012Fy1 c = new C3012Fy1();

    public Vu2(int i) {
        this.a = i;
    }

    public final int a(InterfaceC4421Uj0 interfaceC4421Uj0) {
        this.c.V(TD2.f);
        this.d = true;
        interfaceC4421Uj0.i();
        return 0;
    }

    public long b() {
        return this.i;
    }

    public C10071up2 c() {
        return this.b;
    }

    public boolean d() {
        return this.d;
    }

    public int e(InterfaceC4421Uj0 interfaceC4421Uj0, KE1 ke1, int i) throws IOException {
        if (i <= 0) {
            return a(interfaceC4421Uj0);
        }
        if (!this.f) {
            return h(interfaceC4421Uj0, ke1, i);
        }
        if (this.h == C10323vs.b) {
            return a(interfaceC4421Uj0);
        }
        if (!this.e) {
            return f(interfaceC4421Uj0, ke1, i);
        }
        long j2 = this.g;
        if (j2 == C10323vs.b) {
            return a(interfaceC4421Uj0);
        }
        long b = this.b.b(this.h) - this.b.b(j2);
        this.i = b;
        if (b < 0) {
            I31.n(j, "Invalid duration: " + this.i + ". Using TIME_UNSET instead.");
            this.i = C10323vs.b;
        }
        return a(interfaceC4421Uj0);
    }

    public final int f(InterfaceC4421Uj0 interfaceC4421Uj0, KE1 ke1, int i) throws IOException {
        int min = (int) Math.min(this.a, interfaceC4421Uj0.getLength());
        long j2 = 0;
        if (interfaceC4421Uj0.getPosition() != j2) {
            ke1.a = j2;
            return 1;
        }
        this.c.U(min);
        interfaceC4421Uj0.i();
        interfaceC4421Uj0.x(this.c.e(), 0, min);
        this.g = g(this.c, i);
        this.e = true;
        return 0;
    }

    public final long g(C3012Fy1 c3012Fy1, int i) {
        int g = c3012Fy1.g();
        for (int f = c3012Fy1.f(); f < g; f++) {
            if (c3012Fy1.e()[f] == 71) {
                long c = Zu2.c(c3012Fy1, f, i);
                if (c != C10323vs.b) {
                    return c;
                }
            }
        }
        return C10323vs.b;
    }

    public final int h(InterfaceC4421Uj0 interfaceC4421Uj0, KE1 ke1, int i) throws IOException {
        long length = interfaceC4421Uj0.getLength();
        int min = (int) Math.min(this.a, length);
        long j2 = length - min;
        if (interfaceC4421Uj0.getPosition() != j2) {
            ke1.a = j2;
            return 1;
        }
        this.c.U(min);
        interfaceC4421Uj0.i();
        interfaceC4421Uj0.x(this.c.e(), 0, min);
        this.h = i(this.c, i);
        this.f = true;
        return 0;
    }

    public final long i(C3012Fy1 c3012Fy1, int i) {
        int f = c3012Fy1.f();
        int g = c3012Fy1.g();
        for (int i2 = g - 188; i2 >= f; i2--) {
            if (Zu2.b(c3012Fy1.e(), f, g, i2)) {
                long c = Zu2.c(c3012Fy1, i2, i);
                if (c != C10323vs.b) {
                    return c;
                }
            }
        }
        return C10323vs.b;
    }
}
