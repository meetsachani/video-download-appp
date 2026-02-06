package o;

import java.io.IOException;
import o.InterfaceC10568wr2;

@Deprecated
/* loaded from: classes2.dex */
public final class Du2 {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public void a(InterfaceC10568wr2 interfaceC10568wr2, @InterfaceC11300zs1 InterfaceC10568wr2.a aVar) {
        if (this.c > 0) {
            interfaceC10568wr2.b(this.d, this.e, this.f, this.g, aVar);
            this.c = 0;
        }
    }

    public void b() {
        this.b = false;
        this.c = 0;
    }

    public void c(InterfaceC10568wr2 interfaceC10568wr2, long j, int i, int i2, int i3, @InterfaceC11300zs1 InterfaceC10568wr2.a aVar) {
        boolean z;
        if (this.g <= i2 + i3) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.j(z, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                a(interfaceC10568wr2, aVar);
            }
        }
    }

    public void d(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        if (!this.b) {
            interfaceC4421Uj0.x(this.a, 0, 10);
            interfaceC4421Uj0.i();
            if (I3.j(this.a) == 0) {
                return;
            }
            this.b = true;
        }
    }
}
