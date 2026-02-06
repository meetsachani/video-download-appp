package o;

import android.os.SystemClock;
import java.io.IOException;
import o.KZ1;

@Deprecated
/* loaded from: classes2.dex */
public final class EV1 implements InterfaceC4324Tj0 {
    public final PV1 d;
    public final int g;
    public InterfaceC4518Vj0 j;
    public boolean k;
    @InterfaceC8710pF0("lock")
    public boolean n;
    public final C3012Fy1 e = new C3012Fy1((int) LV1.m);
    public final C3012Fy1 f = new C3012Fy1();
    public final Object h = new Object();
    public final NV1 i = new NV1();
    public volatile long l = C10323vs.b;
    public volatile int m = -1;
    @InterfaceC8710pF0("lock")

    /* renamed from: o  reason: collision with root package name */
    public long f448o = C10323vs.b;
    @InterfaceC8710pF0("lock")
    public long p = C10323vs.b;

    public EV1(OV1 ov1, int i) {
        this.g = i;
        this.d = (PV1) C9542sf.g(new C8650p00().a(ov1));
    }

    public static long c(long j) {
        return j - 30;
    }

    @Override // o.InterfaceC4324Tj0
    public void a(long j, long j2) {
        synchronized (this.h) {
            try {
                if (!this.n) {
                    this.n = true;
                }
                this.f448o = j;
                this.p = j2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC4324Tj0
    public void b(InterfaceC4518Vj0 interfaceC4518Vj0) {
        this.d.b(interfaceC4518Vj0, this.g);
        interfaceC4518Vj0.n();
        interfaceC4518Vj0.p(new KZ1.b(C10323vs.b));
        this.j = interfaceC4518Vj0;
    }

    @Override // o.InterfaceC4324Tj0
    public boolean d(InterfaceC4421Uj0 interfaceC4421Uj0) {
        throw new UnsupportedOperationException("RTP packets are transmitted in a packet stream do not support sniffing.");
    }

    public boolean e() {
        return this.k;
    }

    public void f() {
        synchronized (this.h) {
            this.n = true;
        }
    }

    public void h(int i) {
        this.m = i;
    }

    public void i(long j) {
        this.l = j;
    }

    @Override // o.InterfaceC4324Tj0
    public int j(InterfaceC4421Uj0 interfaceC4421Uj0, KE1 ke1) throws IOException {
        C9542sf.g(this.j);
        int read = interfaceC4421Uj0.read(this.e.e(), 0, LV1.m);
        if (read == -1) {
            return -1;
        }
        if (read == 0) {
            return 0;
        }
        this.e.Y(0);
        this.e.X(read);
        LV1 d = LV1.d(this.e);
        if (d == null) {
            return 0;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long c = c(elapsedRealtime);
        this.i.d(d, elapsedRealtime);
        LV1 e = this.i.e(c);
        if (e == null) {
            return 0;
        }
        if (!this.k) {
            if (this.l == C10323vs.b) {
                this.l = e.h;
            }
            if (this.m == -1) {
                this.m = e.g;
            }
            this.d.c(this.l, this.m);
            this.k = true;
        }
        synchronized (this.h) {
            try {
                if (this.n) {
                    if (this.f448o != C10323vs.b && this.p != C10323vs.b) {
                        this.i.f();
                        this.d.a(this.f448o, this.p);
                        this.n = false;
                        this.f448o = C10323vs.b;
                        this.p = C10323vs.b;
                    }
                } else {
                    do {
                        this.f.V(e.k);
                        this.d.d(this.f, e.h, e.g, e.e);
                        e = this.i.e(c);
                    } while (e != null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    @Override // o.InterfaceC4324Tj0
    public void g() {
    }
}
