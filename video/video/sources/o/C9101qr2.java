package o;

import java.io.IOException;

@Deprecated
/* renamed from: o.qr2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9101qr2 {
    public C9142r00 a;
    public long b;
    public long c;
    public long d;
    public int e;
    public int f;
    public boolean l;
    @InterfaceC11300zs1
    public C8858pr2 n;
    public boolean p;
    public long q;
    public boolean r;
    public long[] g = new long[0];
    public int[] h = new int[0];
    public int[] i = new int[0];
    public long[] j = new long[0];
    public boolean[] k = new boolean[0];
    public boolean[] m = new boolean[0];

    /* renamed from: o  reason: collision with root package name */
    public final C3012Fy1 f843o = new C3012Fy1();

    public void a(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        interfaceC4421Uj0.readFully(this.f843o.e(), 0, this.f843o.g());
        this.f843o.Y(0);
        this.p = false;
    }

    public void b(C3012Fy1 c3012Fy1) {
        c3012Fy1.n(this.f843o.e(), 0, this.f843o.g());
        this.f843o.Y(0);
        this.p = false;
    }

    public long c(int i) {
        return this.j[i];
    }

    public void d(int i) {
        this.f843o.U(i);
        this.l = true;
        this.p = true;
    }

    public void e(int i, int i2) {
        this.e = i;
        this.f = i2;
        if (this.h.length < i) {
            this.g = new long[i];
            this.h = new int[i];
        }
        if (this.i.length < i2) {
            int i3 = (i2 * 125) / 100;
            this.i = new int[i3];
            this.j = new long[i3];
            this.k = new boolean[i3];
            this.m = new boolean[i3];
        }
    }

    public void f() {
        this.e = 0;
        this.q = 0L;
        this.r = false;
        this.l = false;
        this.p = false;
        this.n = null;
    }

    public boolean g(int i) {
        if (this.l && this.m[i]) {
            return true;
        }
        return false;
    }
}
