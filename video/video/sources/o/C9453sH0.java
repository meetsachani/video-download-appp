package o;

import o.C8901q20;

/* renamed from: o.sH0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9453sH0 extends WK2 {
    public C9453sH0(UK uk) {
        super(uk);
    }

    private void u(C8901q20 c8901q20) {
        this.h.k.add(c8901q20);
        c8901q20.l.add(this.h);
    }

    @Override // o.WK2, o.InterfaceC7910m20
    public void a(InterfaceC7910m20 interfaceC7910m20) {
        C4327Tk c4327Tk = (C4327Tk) this.b;
        int q2 = c4327Tk.q2();
        int i = 0;
        int i2 = -1;
        for (C8901q20 c8901q20 : this.h.l) {
            int i3 = c8901q20.g;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (q2 != 0 && q2 != 2) {
            this.h.e(i + c4327Tk.r2());
        } else {
            this.h.e(i2 + c4327Tk.r2());
        }
    }

    @Override // o.WK2
    public void d() {
        UK uk = this.b;
        if (uk instanceof C4327Tk) {
            this.h.b = true;
            C4327Tk c4327Tk = (C4327Tk) uk;
            int q2 = c4327Tk.q2();
            boolean p2 = c4327Tk.p2();
            int i = 0;
            if (q2 != 0) {
                if (q2 != 1) {
                    if (q2 != 2) {
                        if (q2 == 3) {
                            this.h.e = C8901q20.a.BOTTOM;
                            while (i < c4327Tk.C1) {
                                UK uk2 = c4327Tk.B1[i];
                                if (p2 || uk2.l0() != 8) {
                                    C8901q20 c8901q20 = uk2.f.i;
                                    c8901q20.k.add(this.h);
                                    this.h.l.add(c8901q20);
                                }
                                i++;
                            }
                            u(this.b.f.h);
                            u(this.b.f.i);
                            return;
                        }
                        return;
                    }
                    this.h.e = C8901q20.a.TOP;
                    while (i < c4327Tk.C1) {
                        UK uk3 = c4327Tk.B1[i];
                        if (p2 || uk3.l0() != 8) {
                            C8901q20 c8901q202 = uk3.f.h;
                            c8901q202.k.add(this.h);
                            this.h.l.add(c8901q202);
                        }
                        i++;
                    }
                    u(this.b.f.h);
                    u(this.b.f.i);
                    return;
                }
                this.h.e = C8901q20.a.RIGHT;
                while (i < c4327Tk.C1) {
                    UK uk4 = c4327Tk.B1[i];
                    if (p2 || uk4.l0() != 8) {
                        C8901q20 c8901q203 = uk4.e.i;
                        c8901q203.k.add(this.h);
                        this.h.l.add(c8901q203);
                    }
                    i++;
                }
                u(this.b.e.h);
                u(this.b.e.i);
                return;
            }
            this.h.e = C8901q20.a.LEFT;
            while (i < c4327Tk.C1) {
                UK uk5 = c4327Tk.B1[i];
                if (p2 || uk5.l0() != 8) {
                    C8901q20 c8901q204 = uk5.e.h;
                    c8901q204.k.add(this.h);
                    this.h.l.add(c8901q204);
                }
                i++;
            }
            u(this.b.e.h);
            u(this.b.e.i);
        }
    }

    @Override // o.WK2
    public void e() {
        UK uk = this.b;
        if (uk instanceof C4327Tk) {
            int q2 = ((C4327Tk) uk).q2();
            if (q2 != 0 && q2 != 1) {
                this.b.h2(this.h.g);
            } else {
                this.b.g2(this.h.g);
            }
        }
    }

    @Override // o.WK2
    public void f() {
        this.c = null;
        this.h.c();
    }

    @Override // o.WK2
    public void n() {
        this.h.j = false;
    }

    @Override // o.WK2
    public boolean p() {
        return false;
    }
}
