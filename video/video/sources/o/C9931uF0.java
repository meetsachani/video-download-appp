package o;

/* renamed from: o.uF0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9931uF0 extends WK2 {
    public C9931uF0(UK uk) {
        super(uk);
        uk.e.f();
        uk.f.f();
        this.f = ((C9445sF0) uk).o2();
    }

    @Override // o.WK2, o.InterfaceC7910m20
    public void a(InterfaceC7910m20 interfaceC7910m20) {
        C8901q20 c8901q20 = this.h;
        if (!c8901q20.c || c8901q20.j) {
            return;
        }
        this.h.e((int) ((c8901q20.l.get(0).g * ((C9445sF0) this.b).s2()) + 0.5f));
    }

    @Override // o.WK2
    public void d() {
        C9445sF0 c9445sF0 = (C9445sF0) this.b;
        int p2 = c9445sF0.p2();
        int r2 = c9445sF0.r2();
        c9445sF0.s2();
        if (c9445sF0.o2() == 1) {
            if (p2 != -1) {
                this.h.l.add(this.b.c0.e.h);
                this.b.c0.e.h.k.add(this.h);
                this.h.f = p2;
            } else if (r2 != -1) {
                this.h.l.add(this.b.c0.e.i);
                this.b.c0.e.i.k.add(this.h);
                this.h.f = -r2;
            } else {
                C8901q20 c8901q20 = this.h;
                c8901q20.b = true;
                c8901q20.l.add(this.b.c0.e.i);
                this.b.c0.e.i.k.add(this.h);
            }
            u(this.b.e.h);
            u(this.b.e.i);
            return;
        }
        if (p2 != -1) {
            this.h.l.add(this.b.c0.f.h);
            this.b.c0.f.h.k.add(this.h);
            this.h.f = p2;
        } else if (r2 != -1) {
            this.h.l.add(this.b.c0.f.i);
            this.b.c0.f.i.k.add(this.h);
            this.h.f = -r2;
        } else {
            C8901q20 c8901q202 = this.h;
            c8901q202.b = true;
            c8901q202.l.add(this.b.c0.f.i);
            this.b.c0.f.i.k.add(this.h);
        }
        u(this.b.f.h);
        u(this.b.f.i);
    }

    @Override // o.WK2
    public void e() {
        if (((C9445sF0) this.b).o2() == 1) {
            this.b.g2(this.h.g);
        } else {
            this.b.h2(this.h.g);
        }
    }

    @Override // o.WK2
    public void f() {
        this.h.c();
    }

    @Override // o.WK2
    public void n() {
        this.h.j = false;
        this.i.j = false;
    }

    @Override // o.WK2
    public boolean p() {
        return false;
    }

    public final void u(C8901q20 c8901q20) {
        this.h.k.add(c8901q20);
        c8901q20.l.add(this.h);
    }
}
