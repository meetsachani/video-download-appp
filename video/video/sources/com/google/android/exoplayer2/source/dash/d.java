package com.google.android.exoplayer2.source.dash;

import android.os.Handler;
import android.os.Message;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import o.AbstractC6238fC;
import o.C10323vs;
import o.C10833xx0;
import o.C2638Cg0;
import o.C2899Ex0;
import o.C3012Fy1;
import o.C3816Oe0;
import o.C3913Pe0;
import o.C3989Py1;
import o.C4224Si1;
import o.C5638cj1;
import o.C6067eU;
import o.CU;
import o.GX1;
import o.InterfaceC10568wr2;
import o.InterfaceC10877y8;
import o.InterfaceC11300zs1;
import o.TD2;

@Deprecated
/* loaded from: classes2.dex */
public final class d implements Handler.Callback {
    public static final int f1 = 1;
    public final InterfaceC10877y8 X;
    public final b Y;
    public C6067eU a1;
    public long b1;
    public boolean c1;
    public boolean d1;
    public boolean e1;
    public final TreeMap<Long, Long> Z0 = new TreeMap<>();
    public final Handler Y0 = TD2.D(this);
    public final C3913Pe0 Z = new C3913Pe0();

    /* loaded from: classes2.dex */
    public static final class a {
        public final long a;
        public final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(long j);

        void b();
    }

    /* loaded from: classes2.dex */
    public final class c implements InterfaceC10568wr2 {
        public final GX1 d;
        public final C2899Ex0 e = new C2899Ex0();
        public final C5638cj1 f = new C5638cj1();
        public long g = C10323vs.b;

        public c(InterfaceC10877y8 interfaceC10877y8) {
            this.d = GX1.m(interfaceC10877y8);
        }

        @Override // o.InterfaceC10568wr2
        public void a(C10833xx0 c10833xx0) {
            this.d.a(c10833xx0);
        }

        @Override // o.InterfaceC10568wr2
        public void b(long j, int i, int i2, int i3, @InterfaceC11300zs1 InterfaceC10568wr2.a aVar) {
            this.d.b(j, i, i2, i3, aVar);
            l();
        }

        @Override // o.InterfaceC10568wr2
        public int d(CU cu, int i, boolean z, int i2) throws IOException {
            return this.d.c(cu, i, z);
        }

        @Override // o.InterfaceC10568wr2
        public void f(C3012Fy1 c3012Fy1, int i, int i2) {
            this.d.e(c3012Fy1, i);
        }

        @InterfaceC11300zs1
        public final C5638cj1 g() {
            this.f.l();
            if (this.d.T(this.e, this.f, 0, false) == -4) {
                this.f.x();
                return this.f;
            }
            return null;
        }

        public boolean h(long j) {
            return d.this.j(j);
        }

        public void i(AbstractC6238fC abstractC6238fC) {
            long j = this.g;
            if (j == C10323vs.b || abstractC6238fC.h > j) {
                this.g = abstractC6238fC.h;
            }
            d.this.m(abstractC6238fC);
        }

        public boolean j(AbstractC6238fC abstractC6238fC) {
            boolean z;
            long j = this.g;
            if (j != C10323vs.b && j < abstractC6238fC.g) {
                z = true;
            } else {
                z = false;
            }
            return d.this.n(z);
        }

        public final void k(long j, long j2) {
            d.this.Y0.sendMessage(d.this.Y0.obtainMessage(1, new a(j, j2)));
        }

        public final void l() {
            while (this.d.M(false)) {
                C5638cj1 g = g();
                if (g != null) {
                    long j = g.a1;
                    C4224Si1 a = d.this.Z.a(g);
                    if (a != null) {
                        C3816Oe0 c3816Oe0 = (C3816Oe0) a.d(0);
                        if (d.h(c3816Oe0.X, c3816Oe0.Y)) {
                            m(j, c3816Oe0);
                        }
                    }
                }
            }
            this.d.t();
        }

        public final void m(long j, C3816Oe0 c3816Oe0) {
            long f = d.f(c3816Oe0);
            if (f == C10323vs.b) {
                return;
            }
            k(j, f);
        }

        public void n() {
            this.d.U();
        }
    }

    public d(C6067eU c6067eU, b bVar, InterfaceC10877y8 interfaceC10877y8) {
        this.a1 = c6067eU;
        this.Y = bVar;
        this.X = interfaceC10877y8;
    }

    public static long f(C3816Oe0 c3816Oe0) {
        try {
            return TD2.s1(TD2.N(c3816Oe0.Z0));
        } catch (C3989Py1 unused) {
            return C10323vs.b;
        }
    }

    public static boolean h(String str, String str2) {
        if ("urn:mpeg:dash:event:2012".equals(str)) {
            if ("1".equals(str2) || C2638Cg0.Y4.equals(str2) || C2638Cg0.Z4.equals(str2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @InterfaceC11300zs1
    public final Map.Entry<Long, Long> e(long j) {
        return this.Z0.ceilingEntry(Long.valueOf(j));
    }

    public final void g(long j, long j2) {
        Long l = this.Z0.get(Long.valueOf(j2));
        if (l == null) {
            this.Z0.put(Long.valueOf(j2), Long.valueOf(j));
        } else if (l.longValue() > j) {
            this.Z0.put(Long.valueOf(j2), Long.valueOf(j));
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.e1) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        g(aVar.a, aVar.b);
        return true;
    }

    public final void i() {
        if (!this.c1) {
            return;
        }
        this.d1 = true;
        this.c1 = false;
        this.Y.b();
    }

    public boolean j(long j) {
        C6067eU c6067eU = this.a1;
        boolean z = false;
        if (!c6067eU.d) {
            return false;
        }
        if (this.d1) {
            return true;
        }
        Map.Entry<Long, Long> e = e(c6067eU.h);
        if (e != null && e.getValue().longValue() < j) {
            this.b1 = e.getKey().longValue();
            l();
            z = true;
        }
        if (z) {
            i();
        }
        return z;
    }

    public c k() {
        return new c(this.X);
    }

    public final void l() {
        this.Y.a(this.b1);
    }

    public void m(AbstractC6238fC abstractC6238fC) {
        this.c1 = true;
    }

    public boolean n(boolean z) {
        if (!this.a1.d) {
            return false;
        }
        if (this.d1) {
            return true;
        }
        if (!z) {
            return false;
        }
        i();
        return true;
    }

    public void o() {
        this.e1 = true;
        this.Y0.removeCallbacksAndMessages(null);
    }

    public final void p() {
        Iterator<Map.Entry<Long, Long>> it = this.Z0.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().longValue() < this.a1.h) {
                it.remove();
            }
        }
    }

    public void q(C6067eU c6067eU) {
        this.d1 = false;
        this.b1 = C10323vs.b;
        this.a1 = c6067eU;
        p();
    }
}
