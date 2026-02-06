package o;

/* renamed from: o.Xo1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4733Xo1 {
    public C4248So1 a;
    public boolean b;
    public boolean c;

    public final void a() {
        C4248So1 c4248So1 = this.a;
        if (c4248So1 != null) {
            if (!this.b) {
                c4248So1.j(this, -1, null);
            }
            c4248So1.g(this, -1);
            this.b = false;
            return;
        }
        throw new IllegalStateException("This input is not added to any dispatcher.");
    }

    public final void b() {
        C4248So1 c4248So1 = this.a;
        if (c4248So1 != null) {
            if (!this.b) {
                c4248So1.j(this, -1, null);
            }
            c4248So1.h(this, -1);
            this.b = false;
            return;
        }
        throw new IllegalStateException("This input is not added to any dispatcher.");
    }

    public final void c(C4148Ro1 c4148Ro1) {
        C6562gT0.p(c4148Ro1, "event");
        C4248So1 c4248So1 = this.a;
        if (c4248So1 != null) {
            if (this.b) {
                c4248So1.i(this, -1, c4148Ro1);
                return;
            }
            return;
        }
        throw new IllegalStateException("This input is not added to any dispatcher.");
    }

    public final void d(C4148Ro1 c4148Ro1) {
        C6562gT0.p(c4148Ro1, "event");
        C4248So1 c4248So1 = this.a;
        if (c4248So1 != null) {
            if (!this.b) {
                c4248So1.j(this, -1, c4148Ro1);
                this.b = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("This input is not added to any dispatcher.");
    }

    public final void e() {
        C4248So1 c4248So1 = this.a;
        if (c4248So1 != null) {
            if (!this.c) {
                c4248So1.j(this, 1, null);
            }
            c4248So1.g(this, 1);
            this.c = false;
            return;
        }
        throw new IllegalStateException("This input is not added to any dispatcher.");
    }

    public final void f() {
        C4248So1 c4248So1 = this.a;
        if (c4248So1 != null) {
            if (!this.c) {
                c4248So1.j(this, 1, null);
            }
            c4248So1.h(this, 1);
            this.c = false;
            return;
        }
        throw new IllegalStateException("This input is not added to any dispatcher.");
    }

    public final void g(C4148Ro1 c4148Ro1) {
        C6562gT0.p(c4148Ro1, "event");
        C4248So1 c4248So1 = this.a;
        if (c4248So1 != null) {
            if (this.c) {
                c4248So1.i(this, 1, c4148Ro1);
                return;
            }
            return;
        }
        throw new IllegalStateException("This input is not added to any dispatcher.");
    }

    public final void h(C4148Ro1 c4148Ro1) {
        C6562gT0.p(c4148Ro1, "event");
        C4248So1 c4248So1 = this.a;
        if (c4248So1 != null) {
            if (!this.c) {
                c4248So1.j(this, 1, c4148Ro1);
                this.c = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("This input is not added to any dispatcher.");
    }

    public final void i(C4248So1 c4248So1) {
        C6562gT0.p(c4248So1, "dispatcher");
        n(c4248So1);
    }

    public final void j(boolean z) {
        o(z);
    }

    public final void k(C4539Vo1 c4539Vo1) {
        C6562gT0.p(c4539Vo1, "history");
        p(c4539Vo1);
    }

    public final void l() {
        q();
    }

    public final C4248So1 m() {
        return this.a;
    }

    public void n(C4248So1 c4248So1) {
        C6562gT0.p(c4248So1, "dispatcher");
    }

    public void p(C4539Vo1 c4539Vo1) {
        C6562gT0.p(c4539Vo1, "history");
    }

    public final void r(C4248So1 c4248So1) {
        this.a = c4248So1;
    }

    public void q() {
    }

    public void o(boolean z) {
    }
}
