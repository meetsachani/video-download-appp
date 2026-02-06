package o;

@Deprecated
/* renamed from: o.Hb2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3121Hb2 implements InterfaceC2729De1 {
    public final LD X;
    public boolean Y;
    public long Y0;
    public long Z;
    public DD1 Z0 = DD1.Y0;

    public C3121Hb2(LD ld) {
        this.X = ld;
    }

    public void a(long j) {
        this.Z = j;
        if (this.Y) {
            this.Y0 = this.X.b();
        }
    }

    public void b() {
        if (!this.Y) {
            this.Y0 = this.X.b();
            this.Y = true;
        }
    }

    public void c() {
        if (this.Y) {
            a(z());
            this.Y = false;
        }
    }

    @Override // o.InterfaceC2729De1
    public void f(DD1 dd1) {
        if (this.Y) {
            a(z());
        }
        this.Z0 = dd1;
    }

    @Override // o.InterfaceC2729De1
    public DD1 h() {
        return this.Z0;
    }

    @Override // o.InterfaceC2729De1
    public long z() {
        long b;
        long j = this.Z;
        if (this.Y) {
            long b2 = this.X.b() - this.Y0;
            DD1 dd1 = this.Z0;
            if (dd1.X == 1.0f) {
                b = TD2.j1(b2);
            } else {
                b = dd1.b(b2);
            }
            return j + b;
        }
        return j;
    }
}
