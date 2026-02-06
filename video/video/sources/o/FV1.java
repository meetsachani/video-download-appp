package o;

import o.InterfaceC8148mw2;

@Deprecated
/* loaded from: classes2.dex */
public final class FV1 implements PV1 {
    public static final String m = "RtpH263Reader";
    public static final int n = 90000;

    /* renamed from: o  reason: collision with root package name */
    public static final int f455o = 0;
    public static final int p = 128;
    public final OV1 a;
    public InterfaceC10568wr2 b;
    public int d;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public long j;
    public long k;
    public boolean l;
    public long c = C10323vs.b;
    public int e = -1;

    public FV1(OV1 ov1) {
        this.a = ov1;
    }

    private void e() {
        long j = this.k;
        boolean z = this.h;
        ((InterfaceC10568wr2) C9542sf.g(this.b)).b(j, z ? 1 : 0, this.d, 0, null);
        this.d = 0;
        this.k = C10323vs.b;
        this.h = false;
        this.l = false;
    }

    @Override // o.PV1
    public void a(long j, long j2) {
        this.c = j;
        this.d = 0;
        this.j = j2;
    }

    @Override // o.PV1
    public void b(InterfaceC4518Vj0 interfaceC4518Vj0, int i) {
        InterfaceC10568wr2 b = interfaceC4518Vj0.b(i, 2);
        this.b = b;
        b.a(this.a.c);
    }

    @Override // o.PV1
    public void c(long j, int i) {
        boolean z;
        if (this.c == C10323vs.b) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        this.c = j;
    }

    @Override // o.PV1
    public void d(C3012Fy1 c3012Fy1, long j, int i, boolean z) {
        boolean z2;
        C9542sf.k(this.b);
        int f = c3012Fy1.f();
        int R = c3012Fy1.R();
        if ((R & 1024) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((R & 512) == 0 && (R & InterfaceC8148mw2.g.l) == 0 && (R & 7) == 0) {
            if (z2) {
                if (this.l && this.d > 0) {
                    e();
                }
                this.l = true;
                if ((c3012Fy1.k() & 252) < 128) {
                    I31.n(m, "Picture start Code (PSC) missing, dropping packet.");
                    return;
                }
                c3012Fy1.e()[f] = 0;
                c3012Fy1.e()[f + 1] = 0;
                c3012Fy1.Y(f);
            } else if (this.l) {
                int b = LV1.b(this.e);
                if (i < b) {
                    I31.n(m, TD2.M("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(b), Integer.valueOf(i)));
                    return;
                }
            } else {
                I31.n(m, "First payload octet of the H263 packet is not the beginning of a new H263 partition, Dropping current packet.");
                return;
            }
            if (this.d == 0) {
                f(c3012Fy1, this.i);
                if (!this.i && this.h) {
                    int i2 = this.f;
                    C10833xx0 c10833xx0 = this.a.c;
                    if (i2 != c10833xx0.l1 || this.g != c10833xx0.m1) {
                        this.b.a(c10833xx0.b().n0(this.f).S(this.g).G());
                    }
                    this.i = true;
                }
            }
            int a = c3012Fy1.a();
            this.b.e(c3012Fy1, a);
            this.d += a;
            this.k = RV1.a(this.j, j, this.c, 90000);
            if (z) {
                e();
            }
            this.e = i;
            return;
        }
        I31.n(m, "Dropping packet: video reduncancy coding is not supported, packet header VRC, or PLEN or PEBIT is non-zero");
    }

    public final void f(C3012Fy1 c3012Fy1, boolean z) {
        int f = c3012Fy1.f();
        boolean z2 = false;
        if (((c3012Fy1.N() >> 10) & 63) == 32) {
            int k = c3012Fy1.k();
            int i = (k >> 1) & 1;
            if (!z && i == 0) {
                int i2 = (k >> 2) & 7;
                if (i2 == 1) {
                    this.f = 128;
                    this.g = 96;
                } else {
                    int i3 = i2 - 2;
                    this.f = 176 << i3;
                    this.g = C3503Kz.h0 << i3;
                }
            }
            c3012Fy1.Y(f);
            if (i == 0) {
                z2 = true;
            }
            this.h = z2;
            return;
        }
        c3012Fy1.Y(f);
        this.h = false;
    }
}
