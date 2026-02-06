package o;

import o.P5;

/* loaded from: classes.dex */
public final class TC1 {
    public boolean c;
    public boolean e;
    public long f;
    public P5.j.e g;
    public P5.j.h a = P5.j.c.a;
    public int b = P5.i.b.a();
    public P5.j.b d = P5.j.b.C0222b.a;

    /* loaded from: classes.dex */
    public static final class a {
        public boolean c;
        public boolean e;
        public long f;
        public P5.j.e g;
        public P5.j.h a = P5.j.c.a;
        public int b = P5.i.b.a();
        public P5.j.b d = P5.j.b.C0222b.a;

        public final TC1 a() {
            TC1 tc1 = new TC1();
            tc1.m(this.a);
            tc1.k(this.b);
            tc1.n(this.c);
            tc1.j(this.d);
            tc1.i(this.e);
            tc1.h(this.f);
            tc1.l(this.g);
            return tc1;
        }

        public final a b(long j) {
            this.f = j;
            this.e = true;
            return this;
        }

        public final a c(P5.j.b bVar) {
            C6562gT0.p(bVar, "defaultTab");
            this.d = bVar;
            return this;
        }

        public final a d(int i) {
            this.b = i;
            return this;
        }

        public final a e(P5.j.e eVar) {
            this.g = eVar;
            return this;
        }

        public final a f(P5.j.h hVar) {
            C6562gT0.p(hVar, "mediaType");
            this.a = hVar;
            return this;
        }

        public final a g(boolean z) {
            this.c = z;
            return this;
        }
    }

    public final long a() {
        return this.f;
    }

    public final P5.j.b b() {
        return this.d;
    }

    public final int c() {
        return this.b;
    }

    public final P5.j.e d() {
        return this.g;
    }

    public final P5.j.h e() {
        return this.a;
    }

    public final boolean f() {
        return this.e;
    }

    public final boolean g() {
        return this.c;
    }

    public final void h(long j) {
        this.f = j;
    }

    public final void i(boolean z) {
        this.e = z;
    }

    public final void j(P5.j.b bVar) {
        C6562gT0.p(bVar, "<set-?>");
        this.d = bVar;
    }

    public final void k(int i) {
        this.b = i;
    }

    public final void l(P5.j.e eVar) {
        this.g = eVar;
    }

    public final void m(P5.j.h hVar) {
        C6562gT0.p(hVar, "<set-?>");
        this.a = hVar;
    }

    public final void n(boolean z) {
        this.c = z;
    }
}
