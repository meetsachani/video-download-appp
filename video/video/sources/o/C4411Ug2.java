package o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* renamed from: o.Ug2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4411Ug2 implements InterfaceC4324Tj0 {

    /* renamed from: o  reason: collision with root package name */
    public static final int f630o = 0;
    public static final int p = 1;
    public static final int q = 2;
    public static final int r = 3;
    public static final int s = 4;
    public static final int t = 5;
    public static final int u = 1024;
    public final InterfaceC4117Rg2 d;
    public final C10833xx0 g;
    public InterfaceC4518Vj0 j;
    public InterfaceC10568wr2 k;
    public int l;
    public final C7770lS e = new C7770lS();
    public final C3012Fy1 f = new C3012Fy1();
    public final List<Long> h = new ArrayList();
    public final List<C3012Fy1> i = new ArrayList();
    public int m = 0;
    public long n = C10323vs.b;

    public C4411Ug2(InterfaceC4117Rg2 interfaceC4117Rg2, C10833xx0 c10833xx0) {
        this.d = interfaceC4117Rg2;
        this.g = c10833xx0.b().g0(C4128Rj1.o0).K(c10833xx0.g1).G();
    }

    @Override // o.InterfaceC4324Tj0
    public void a(long j, long j2) {
        boolean z;
        int i = this.m;
        if (i != 0 && i != 5) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        this.n = j2;
        if (this.m == 2) {
            this.m = 1;
        }
        if (this.m == 4) {
            this.m = 3;
        }
    }

    @Override // o.InterfaceC4324Tj0
    public void b(InterfaceC4518Vj0 interfaceC4518Vj0) {
        boolean z;
        if (this.m == 0) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        this.j = interfaceC4518Vj0;
        this.k = interfaceC4518Vj0.b(0, 3);
        this.j.n();
        this.j.p(new C8507oP0(new long[]{0}, new long[]{0}, C10323vs.b));
        this.k.a(this.g);
        this.m = 1;
    }

    public final void c() throws IOException {
        try {
            C4508Vg2 d = this.d.d();
            while (d == null) {
                Thread.sleep(5L);
                d = this.d.d();
            }
            d.w(this.l);
            d.Y0.put(this.f.e(), 0, this.l);
            d.Y0.limit(this.l);
            this.d.c(d);
            AbstractC4605Wg2 b = this.d.b();
            while (b == null) {
                Thread.sleep(5L);
                b = this.d.b();
            }
            for (int i = 0; i < b.i(); i++) {
                byte[] a = this.e.a(b.g(b.h(i)));
                this.h.add(Long.valueOf(b.h(i)));
                this.i.add(new C3012Fy1(a));
            }
            b.v();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        } catch (C4217Sg2 e) {
            throw C3989Py1.a("SubtitleDecoder failed.", e);
        }
    }

    @Override // o.InterfaceC4324Tj0
    public boolean d(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        return true;
    }

    public final boolean e(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        int b = this.f.b();
        int i = this.l;
        if (b == i) {
            this.f.c(i + 1024);
        }
        int read = interfaceC4421Uj0.read(this.f.e(), this.l, this.f.b() - this.l);
        if (read != -1) {
            this.l += read;
        }
        long length = interfaceC4421Uj0.getLength();
        if ((length != -1 && this.l == length) || read == -1) {
            return true;
        }
        return false;
    }

    public final boolean f(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        int i;
        if (interfaceC4421Uj0.getLength() != -1) {
            i = C7775lT0.d(interfaceC4421Uj0.getLength());
        } else {
            i = 1024;
        }
        if (interfaceC4421Uj0.c(i) == -1) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC4324Tj0
    public void g() {
        if (this.m == 5) {
            return;
        }
        this.d.g();
        this.m = 5;
    }

    public final void h() {
        boolean z;
        int k;
        C9542sf.k(this.k);
        if (this.h.size() == this.i.size()) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        long j = this.n;
        if (j == C10323vs.b) {
            k = 0;
        } else {
            k = TD2.k(this.h, Long.valueOf(j), true, true);
        }
        while (k < this.i.size()) {
            C3012Fy1 c3012Fy1 = this.i.get(k);
            c3012Fy1.Y(0);
            int length = c3012Fy1.e().length;
            this.k.e(c3012Fy1, length);
            this.k.b(this.h.get(k).longValue(), 1, length, 0, null);
            k++;
        }
    }

    @Override // o.InterfaceC4324Tj0
    public int j(InterfaceC4421Uj0 interfaceC4421Uj0, KE1 ke1) throws IOException {
        boolean z;
        int i;
        int i2 = this.m;
        if (i2 != 0 && i2 != 5) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        if (this.m == 1) {
            C3012Fy1 c3012Fy1 = this.f;
            if (interfaceC4421Uj0.getLength() != -1) {
                i = C7775lT0.d(interfaceC4421Uj0.getLength());
            } else {
                i = 1024;
            }
            c3012Fy1.U(i);
            this.l = 0;
            this.m = 2;
        }
        if (this.m == 2 && e(interfaceC4421Uj0)) {
            c();
            h();
            this.m = 4;
        }
        if (this.m == 3 && f(interfaceC4421Uj0)) {
            h();
            this.m = 4;
        }
        if (this.m != 4) {
            return 0;
        }
        return -1;
    }
}
