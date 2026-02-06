package o;

import java.io.IOException;

@Deprecated
/* renamed from: o.v82  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10148v82 extends AbstractC9809tl {

    /* renamed from: o  reason: collision with root package name */
    public final int f892o;
    public final C10833xx0 p;
    public long q;
    public boolean r;

    public C10148v82(FU fu, OU ou, C10833xx0 c10833xx0, int i, @InterfaceC11300zs1 Object obj, long j, long j2, long j3, int i2, C10833xx0 c10833xx02) {
        super(fu, ou, c10833xx0, i, obj, j, j2, C10323vs.b, C10323vs.b, j3);
        this.f892o = i2;
        this.p = c10833xx02;
    }

    @Override // o.R11.e
    public void a() throws IOException {
        C10295vl j = j();
        j.c(0L);
        InterfaceC10568wr2 b = j.b(0, this.f892o);
        b.a(this.p);
        try {
            long a = this.i.a(this.b.e(this.q));
            if (a != -1) {
                a += this.q;
            }
            WY wy = new WY(this.i, this.q, a);
            for (int i = 0; i != -1; i = b.c(wy, Integer.MAX_VALUE, true)) {
                this.q += i;
            }
            b.b(this.g, 1, (int) this.q, 0, null);
            NU.a(this.i);
            this.r = true;
        } catch (Throwable th) {
            NU.a(this.i);
            throw th;
        }
    }

    @Override // o.AbstractC2533Be1
    public boolean h() {
        return this.r;
    }

    @Override // o.R11.e
    public void c() {
    }
}
