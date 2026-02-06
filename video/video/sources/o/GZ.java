package o;

@Deprecated
/* loaded from: classes2.dex */
public final class GZ implements InterfaceC2729De1 {
    public final C3121Hb2 X;
    public final a Y;
    @InterfaceC11300zs1
    public InterfaceC2729De1 Y0;
    @InterfaceC11300zs1
    public InterfaceC10469wR1 Z;
    public boolean Z0 = true;
    public boolean a1;

    /* loaded from: classes2.dex */
    public interface a {
        void A(DD1 dd1);
    }

    public GZ(a aVar, LD ld) {
        this.Y = aVar;
        this.X = new C3121Hb2(ld);
    }

    public void a(InterfaceC10469wR1 interfaceC10469wR1) {
        if (interfaceC10469wR1 == this.Z) {
            this.Y0 = null;
            this.Z = null;
            this.Z0 = true;
        }
    }

    public void b(InterfaceC10469wR1 interfaceC10469wR1) throws C3824Og0 {
        InterfaceC2729De1 interfaceC2729De1;
        InterfaceC2729De1 G = interfaceC10469wR1.G();
        if (G != null && G != (interfaceC2729De1 = this.Y0)) {
            if (interfaceC2729De1 == null) {
                this.Y0 = G;
                this.Z = interfaceC10469wR1;
                G.f(this.X.h());
                return;
            }
            throw C3824Og0.m(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
    }

    public void c(long j) {
        this.X.a(j);
    }

    public final boolean d(boolean z) {
        InterfaceC10469wR1 interfaceC10469wR1 = this.Z;
        if (interfaceC10469wR1 != null && !interfaceC10469wR1.c()) {
            if (!this.Z.isReady()) {
                if (!z && !this.Z.k()) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public void e() {
        this.a1 = true;
        this.X.b();
    }

    @Override // o.InterfaceC2729De1
    public void f(DD1 dd1) {
        InterfaceC2729De1 interfaceC2729De1 = this.Y0;
        if (interfaceC2729De1 != null) {
            interfaceC2729De1.f(dd1);
            dd1 = this.Y0.h();
        }
        this.X.f(dd1);
    }

    public void g() {
        this.a1 = false;
        this.X.c();
    }

    @Override // o.InterfaceC2729De1
    public DD1 h() {
        InterfaceC2729De1 interfaceC2729De1 = this.Y0;
        if (interfaceC2729De1 != null) {
            return interfaceC2729De1.h();
        }
        return this.X.h();
    }

    public long i(boolean z) {
        j(z);
        return z();
    }

    public final void j(boolean z) {
        if (d(z)) {
            this.Z0 = true;
            if (this.a1) {
                this.X.b();
                return;
            }
            return;
        }
        InterfaceC2729De1 interfaceC2729De1 = (InterfaceC2729De1) C9542sf.g(this.Y0);
        long z2 = interfaceC2729De1.z();
        if (this.Z0) {
            if (z2 < this.X.z()) {
                this.X.c();
                return;
            }
            this.Z0 = false;
            if (this.a1) {
                this.X.b();
            }
        }
        this.X.a(z2);
        DD1 h = interfaceC2729De1.h();
        if (!h.equals(this.X.h())) {
            this.X.f(h);
            this.Y.A(h);
        }
    }

    @Override // o.InterfaceC2729De1
    public long z() {
        if (this.Z0) {
            return this.X.z();
        }
        return ((InterfaceC2729De1) C9542sf.g(this.Y0)).z();
    }
}
