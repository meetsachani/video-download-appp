package o;

import java.io.IOException;
import o.InterfaceC4410Ug1;
import o.InterfaceC7583kh1;

@Deprecated
/* loaded from: classes2.dex */
public final class J81 implements InterfaceC4410Ug1, InterfaceC4410Ug1.a {
    public final InterfaceC7583kh1.b X;
    public final long Y;
    public InterfaceC7583kh1 Y0;
    public final InterfaceC10877y8 Z;
    public InterfaceC4410Ug1 Z0;
    @InterfaceC11300zs1
    public InterfaceC4410Ug1.a a1;
    @InterfaceC11300zs1
    public a b1;
    public boolean c1;
    public long d1 = C10323vs.b;

    /* loaded from: classes2.dex */
    public interface a {
        void a(InterfaceC7583kh1.b bVar, IOException iOException);

        void b(InterfaceC7583kh1.b bVar);
    }

    public J81(InterfaceC7583kh1.b bVar, InterfaceC10877y8 interfaceC10877y8, long j) {
        this.X = bVar;
        this.Z = interfaceC10877y8;
        this.Y = j;
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public boolean a() {
        InterfaceC4410Ug1 interfaceC4410Ug1 = this.Z0;
        if (interfaceC4410Ug1 != null && interfaceC4410Ug1.a()) {
            return true;
        }
        return false;
    }

    public void b(InterfaceC7583kh1.b bVar) {
        long u = u(this.Y);
        InterfaceC4410Ug1 h = ((InterfaceC7583kh1) C9542sf.g(this.Y0)).h(bVar, this.Z, u);
        this.Z0 = h;
        if (this.a1 != null) {
            h.o(this, u);
        }
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public long c() {
        return ((InterfaceC4410Ug1) TD2.o(this.Z0)).c();
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public boolean d(long j) {
        InterfaceC4410Ug1 interfaceC4410Ug1 = this.Z0;
        if (interfaceC4410Ug1 != null && interfaceC4410Ug1.d(j)) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC4410Ug1
    public long e(long j, LZ1 lz1) {
        return ((InterfaceC4410Ug1) TD2.o(this.Z0)).e(j, lz1);
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public long f() {
        return ((InterfaceC4410Ug1) TD2.o(this.Z0)).f();
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public void g(long j) {
        ((InterfaceC4410Ug1) TD2.o(this.Z0)).g(j);
    }

    @Override // o.InterfaceC4410Ug1
    public long i(long j) {
        return ((InterfaceC4410Ug1) TD2.o(this.Z0)).i(j);
    }

    @Override // o.InterfaceC4410Ug1.a
    public void j(InterfaceC4410Ug1 interfaceC4410Ug1) {
        ((InterfaceC4410Ug1.a) TD2.o(this.a1)).j(this);
        a aVar = this.b1;
        if (aVar != null) {
            aVar.b(this.X);
        }
    }

    @Override // o.InterfaceC4410Ug1
    public long k() {
        return ((InterfaceC4410Ug1) TD2.o(this.Z0)).k();
    }

    @Override // o.InterfaceC4410Ug1
    public void m() throws IOException {
        try {
            InterfaceC4410Ug1 interfaceC4410Ug1 = this.Z0;
            if (interfaceC4410Ug1 != null) {
                interfaceC4410Ug1.m();
                return;
            }
            InterfaceC7583kh1 interfaceC7583kh1 = this.Y0;
            if (interfaceC7583kh1 != null) {
                interfaceC7583kh1.Q();
            }
        } catch (IOException e) {
            a aVar = this.b1;
            if (aVar != null) {
                if (!this.c1) {
                    this.c1 = true;
                    aVar.a(this.X, e);
                    return;
                }
                return;
            }
            throw e;
        }
    }

    @Override // o.InterfaceC4410Ug1
    public void o(InterfaceC4410Ug1.a aVar, long j) {
        this.a1 = aVar;
        InterfaceC4410Ug1 interfaceC4410Ug1 = this.Z0;
        if (interfaceC4410Ug1 != null) {
            interfaceC4410Ug1.o(this, u(this.Y));
        }
    }

    public long p() {
        return this.d1;
    }

    @Override // o.InterfaceC4410Ug1
    public C10079ur2 q() {
        return ((InterfaceC4410Ug1) TD2.o(this.Z0)).q();
    }

    @Override // o.InterfaceC4410Ug1
    public void r(long j, boolean z) {
        ((InterfaceC4410Ug1) TD2.o(this.Z0)).r(j, z);
    }

    @Override // o.InterfaceC4410Ug1
    public long s(InterfaceC6859hi0[] interfaceC6859hi0Arr, boolean[] zArr, IX1[] ix1Arr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.d1;
        if (j3 != C10323vs.b && j == this.Y) {
            this.d1 = C10323vs.b;
            j2 = j3;
        } else {
            j2 = j;
        }
        return ((InterfaceC4410Ug1) TD2.o(this.Z0)).s(interfaceC6859hi0Arr, zArr, ix1Arr, zArr2, j2);
    }

    public long t() {
        return this.Y;
    }

    public final long u(long j) {
        long j2 = this.d1;
        if (j2 != C10323vs.b) {
            return j2;
        }
        return j;
    }

    @Override // o.G02.a
    /* renamed from: v */
    public void l(InterfaceC4410Ug1 interfaceC4410Ug1) {
        ((InterfaceC4410Ug1.a) TD2.o(this.a1)).l(this);
    }

    public void w(long j) {
        this.d1 = j;
    }

    public void x() {
        if (this.Z0 != null) {
            ((InterfaceC7583kh1) C9542sf.g(this.Y0)).s(this.Z0);
        }
    }

    public void y(InterfaceC7583kh1 interfaceC7583kh1) {
        boolean z;
        if (this.Y0 == null) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        this.Y0 = interfaceC7583kh1;
    }

    public void z(a aVar) {
        this.b1 = aVar;
    }
}
