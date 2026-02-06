package o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeoutException;

@Deprecated
/* loaded from: classes2.dex */
public final class OD1 {
    public final b a;
    public final a b;
    public final LD c;
    public final AbstractC7373jp2 d;
    public int e;
    @InterfaceC11300zs1
    public Object f;
    public Looper g;
    public int h;
    public long i = C10323vs.b;
    public boolean j = true;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;

    /* loaded from: classes2.dex */
    public interface a {
        void d(OD1 od1);
    }

    /* loaded from: classes2.dex */
    public interface b {
        void t(int i, @InterfaceC11300zs1 Object obj) throws C3824Og0;
    }

    public OD1(a aVar, b bVar, AbstractC7373jp2 abstractC7373jp2, int i, LD ld, Looper looper) {
        this.b = aVar;
        this.a = bVar;
        this.d = abstractC7373jp2;
        this.g = looper;
        this.c = ld;
        this.h = i;
    }

    public synchronized boolean a() throws InterruptedException {
        boolean z;
        try {
            C9542sf.i(this.k);
            if (this.g.getThread() != Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.i(z);
            while (!this.m) {
                wait();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.l;
    }

    public synchronized boolean b(long j) throws InterruptedException, TimeoutException {
        boolean z;
        boolean z2;
        try {
            C9542sf.i(this.k);
            if (this.g.getThread() != Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.i(z);
            long b2 = this.c.b() + j;
            while (true) {
                z2 = this.m;
                if (z2 || j <= 0) {
                    break;
                }
                this.c.e();
                wait(j);
                j = b2 - this.c.b();
            }
            if (z2) {
            } else {
                throw new TimeoutException("Message delivery timed out.");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.l;
    }

    @InterfaceC6181ey
    public synchronized OD1 c() {
        C9542sf.i(this.k);
        this.n = true;
        m(false);
        return this;
    }

    public boolean d() {
        return this.j;
    }

    public Looper e() {
        return this.g;
    }

    public int f() {
        return this.h;
    }

    @InterfaceC11300zs1
    public Object g() {
        return this.f;
    }

    public long h() {
        return this.i;
    }

    public b i() {
        return this.a;
    }

    public AbstractC7373jp2 j() {
        return this.d;
    }

    public int k() {
        return this.e;
    }

    public synchronized boolean l() {
        return this.n;
    }

    public synchronized void m(boolean z) {
        this.l = z | this.l;
        this.m = true;
        notifyAll();
    }

    @InterfaceC6181ey
    public OD1 n() {
        C9542sf.i(!this.k);
        if (this.i == C10323vs.b) {
            C9542sf.a(this.j);
        }
        this.k = true;
        this.b.d(this);
        return this;
    }

    @InterfaceC6181ey
    public OD1 o(boolean z) {
        C9542sf.i(!this.k);
        this.j = z;
        return this;
    }

    @InterfaceC6181ey
    @Deprecated
    public OD1 p(Handler handler) {
        return q(handler.getLooper());
    }

    @InterfaceC6181ey
    public OD1 q(Looper looper) {
        C9542sf.i(!this.k);
        this.g = looper;
        return this;
    }

    @InterfaceC6181ey
    public OD1 r(@InterfaceC11300zs1 Object obj) {
        C9542sf.i(!this.k);
        this.f = obj;
        return this;
    }

    @InterfaceC6181ey
    public OD1 s(int i, long j) {
        boolean z = true;
        C9542sf.i(!this.k);
        if (j == C10323vs.b) {
            z = false;
        }
        C9542sf.a(z);
        if (i >= 0 && (this.d.x() || i < this.d.w())) {
            this.h = i;
            this.i = j;
            return this;
        }
        throw new C6534gM0(this.d, i, j);
    }

    @InterfaceC6181ey
    public OD1 t(long j) {
        C9542sf.i(!this.k);
        this.i = j;
        return this;
    }

    @InterfaceC6181ey
    public OD1 u(int i) {
        C9542sf.i(!this.k);
        this.e = i;
        return this;
    }
}
