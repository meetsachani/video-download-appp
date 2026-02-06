package o;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: o.So1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4248So1 {
    public static final a i = new a(null);
    public static final int j = 0;
    public static final int k = 1;
    public C4248So1 a;
    public final InterfaceC10579wu1 b;
    public boolean c;
    public boolean d;
    public final C4830Yo1 e;
    public final Set<C4248So1> f;
    public final Set<AbstractC4442Uo1<?>> g;
    public final Set<AbstractC4733Xo1> h;

    /* renamed from: o.So1$a */
    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @InterfaceC7780lU1(EnumC7796la.X)
    /* renamed from: o.So1$b */
    /* loaded from: classes.dex */
    public @interface b {
    }

    public C4248So1(C4248So1 c4248So1, InterfaceC10579wu1 interfaceC10579wu1) {
        C4830Yo1 c4830Yo1;
        this.a = c4248So1;
        this.b = interfaceC10579wu1;
        this.d = true;
        this.e = (c4248So1 == null || (c4830Yo1 = c4248So1.e) == null) ? new C4830Yo1() : c4830Yo1;
        this.f = new LinkedHashSet();
        this.g = new LinkedHashSet();
        this.h = new LinkedHashSet();
        C4248So1 c4248So12 = this.a;
        if (c4248So12 != null) {
            c4248So12.f.add(this);
        }
    }

    public static /* synthetic */ void c(C4248So1 c4248So1, AbstractC4442Uo1 abstractC4442Uo1, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        c4248So1.b(abstractC4442Uo1, i2);
    }

    public final void a(AbstractC4442Uo1<?> abstractC4442Uo1) {
        C6562gT0.p(abstractC4442Uo1, "handler");
        c(this, abstractC4442Uo1, 0, 2, null);
    }

    public final void b(AbstractC4442Uo1<?> abstractC4442Uo1, int i2) {
        C6562gT0.p(abstractC4442Uo1, "handler");
        f();
        if (this.g.add(abstractC4442Uo1)) {
            this.e.a(this, abstractC4442Uo1, i2);
        }
    }

    public final void d(AbstractC4733Xo1 abstractC4733Xo1) {
        C6562gT0.p(abstractC4733Xo1, "input");
        f();
        if (this.h.add(abstractC4733Xo1)) {
            this.e.c(this, abstractC4733Xo1, -1);
        }
    }

    public final void e(AbstractC4733Xo1 abstractC4733Xo1, int i2) {
        C6562gT0.p(abstractC4733Xo1, "input");
        f();
        if (i2 != 1 && i2 != 0) {
            throw new IllegalArgumentException(("Unsupported priority value: " + i2).toString());
        } else if (this.h.add(abstractC4733Xo1)) {
            this.e.c(this, abstractC4733Xo1, i2);
        }
    }

    public final void f() {
        if (!p()) {
            return;
        }
        throw new IllegalStateException("This NavigationEventDispatcher has already been disposed and cannot be used.");
    }

    public final void g(AbstractC4733Xo1 abstractC4733Xo1, int i2) {
        C6562gT0.p(abstractC4733Xo1, "input");
        f();
        if (!q()) {
            return;
        }
        this.e.d(abstractC4733Xo1, i2);
    }

    public final void h(AbstractC4733Xo1 abstractC4733Xo1, int i2) {
        C6562gT0.p(abstractC4733Xo1, "input");
        f();
        if (!q()) {
            return;
        }
        this.e.e(abstractC4733Xo1, i2, this.b);
    }

    public final void i(AbstractC4733Xo1 abstractC4733Xo1, int i2, C4148Ro1 c4148Ro1) {
        C6562gT0.p(abstractC4733Xo1, "input");
        C6562gT0.p(c4148Ro1, "event");
        f();
        if (!q()) {
            return;
        }
        this.e.f(abstractC4733Xo1, i2, c4148Ro1);
    }

    public final void j(AbstractC4733Xo1 abstractC4733Xo1, int i2, C4148Ro1 c4148Ro1) {
        C6562gT0.p(abstractC4733Xo1, "input");
        f();
        if (!q()) {
            return;
        }
        this.e.g(abstractC4733Xo1, i2, c4148Ro1);
    }

    public final void k() {
        Set<C4248So1> set;
        f();
        this.c = true;
        C7085ie c7085ie = new C7085ie();
        c7085ie.add(this);
        while (!c7085ie.isEmpty()) {
            C4248So1 c4248So1 = (C4248So1) c7085ie.removeFirst();
            c4248So1.c = true;
            C9444sF.q0(c7085ie, c4248So1.f);
            for (AbstractC4733Xo1 abstractC4733Xo1 : c4248So1.h) {
                this.e.o(abstractC4733Xo1);
            }
            c4248So1.h.clear();
            for (AbstractC4442Uo1<?> abstractC4442Uo1 : c4248So1.g) {
                abstractC4442Uo1.x();
            }
            c4248So1.g.clear();
            c4248So1.f.clear();
            C4248So1 c4248So12 = c4248So1.a;
            if (c4248So12 != null && (set = c4248So12.f) != null) {
                set.remove(c4248So1);
            }
            c4248So1.a = null;
        }
    }

    public final Set<C4248So1> l() {
        return this.f;
    }

    public final InterfaceC9041qc2<C4539Vo1> m() {
        return this.e.j();
    }

    public final C4830Yo1 n() {
        return this.e;
    }

    public final InterfaceC9041qc2<AbstractC4937Zo1> o() {
        return this.e.l();
    }

    public final boolean p() {
        C4248So1 c4248So1 = this.a;
        if (c4248So1 != null && c4248So1.p()) {
            return true;
        }
        return this.c;
    }

    public final boolean q() {
        C4248So1 c4248So1 = this.a;
        if (c4248So1 != null && !c4248So1.q()) {
            return false;
        }
        return this.d;
    }

    public final void r(AbstractC4442Uo1<?> abstractC4442Uo1) {
        C6562gT0.p(abstractC4442Uo1, "handler");
        if (this.g.remove(abstractC4442Uo1)) {
            this.e.n(abstractC4442Uo1);
        }
    }

    public final void s(AbstractC4733Xo1 abstractC4733Xo1) {
        C6562gT0.p(abstractC4733Xo1, "input");
        f();
        if (this.h.remove(abstractC4733Xo1)) {
            this.e.o(abstractC4733Xo1);
        }
    }

    public final void t(boolean z) {
        f();
        if (this.d == z) {
            return;
        }
        this.d = z;
        this.e.m();
    }

    public C4248So1() {
        this(null, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4248So1(InterfaceC10579wu1 interfaceC10579wu1) {
        this(null, interfaceC10579wu1);
        C6562gT0.p(interfaceC10579wu1, "onBackCompletedFallback");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4248So1(C4248So1 c4248So1) {
        this(c4248So1, null);
        C6562gT0.p(c4248So1, androidx.constraintlayout.widget.e.W1);
    }
}
