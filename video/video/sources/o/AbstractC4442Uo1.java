package o;

import java.util.List;
import o.AbstractC4636Wo1;
import o.AbstractC4937Zo1;

/* renamed from: o.Uo1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4442Uo1<T extends AbstractC4636Wo1> {
    public T a;
    public List<? extends T> b;
    public List<? extends T> c;
    public AbstractC4937Zo1 d;
    public boolean e;
    public boolean f;
    public C4248So1 g;

    public AbstractC4442Uo1(T t, boolean z, boolean z2) {
        C6562gT0.p(t, "initialInfo");
        this.a = t;
        this.b = C8222nF.H();
        this.c = C8222nF.H();
        this.d = AbstractC4937Zo1.c.e;
        this.e = z;
        this.f = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void E(AbstractC4442Uo1 abstractC4442Uo1, AbstractC4636Wo1 abstractC4636Wo1, List list, List list2, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                list = C8222nF.H();
            }
            if ((i & 4) != 0) {
                list2 = C8222nF.H();
            }
            abstractC4442Uo1.D(abstractC4636Wo1, list, list2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setInfo");
    }

    public final void A(boolean z) {
        C4830Yo1 n;
        if (this.f != z) {
            this.f = z;
            C4248So1 c4248So1 = this.g;
            if (c4248So1 != null && (n = c4248So1.n()) != null) {
                n.m();
            }
        }
    }

    public final void B(T t) {
        C6562gT0.p(t, "currentInfo");
        E(this, t, null, null, 6, null);
    }

    public final void C(T t, List<? extends T> list) {
        C6562gT0.p(t, "currentInfo");
        C6562gT0.p(list, "backInfo");
        E(this, t, list, null, 4, null);
    }

    public final void D(T t, List<? extends T> list, List<? extends T> list2) {
        C4830Yo1 n;
        C6562gT0.p(t, "currentInfo");
        C6562gT0.p(list, "backInfo");
        C6562gT0.p(list2, "forwardInfo");
        this.a = t;
        this.b = list;
        this.c = list2;
        C4248So1 c4248So1 = this.g;
        if (c4248So1 != null && (n = c4248So1.n()) != null) {
            n.s(this);
        }
    }

    public final void a() {
        this.d = AbstractC4937Zo1.c.e;
        p();
    }

    public final void b() {
        this.d = AbstractC4937Zo1.c.e;
        q();
    }

    public final void c(C4148Ro1 c4148Ro1) {
        C6562gT0.p(c4148Ro1, "event");
        this.d = new AbstractC4937Zo1.d(c4148Ro1, -1);
        r(c4148Ro1);
    }

    public final void d(C4148Ro1 c4148Ro1) {
        C6562gT0.p(c4148Ro1, "event");
        this.d = new AbstractC4937Zo1.d(c4148Ro1, -1);
        s(c4148Ro1);
    }

    public final void e() {
        this.d = AbstractC4937Zo1.c.e;
        t();
    }

    public final void f() {
        this.d = AbstractC4937Zo1.c.e;
        u();
    }

    public final void g(C4148Ro1 c4148Ro1) {
        C6562gT0.p(c4148Ro1, "event");
        this.d = new AbstractC4937Zo1.d(c4148Ro1, 1);
        v(c4148Ro1);
    }

    public final void h(C4148Ro1 c4148Ro1) {
        C6562gT0.p(c4148Ro1, "event");
        this.d = new AbstractC4937Zo1.d(c4148Ro1, 1);
        w(c4148Ro1);
    }

    public final List<T> i() {
        return (List<? extends T>) this.b;
    }

    public final T j() {
        return this.a;
    }

    public final C4248So1 k() {
        return this.g;
    }

    public final List<T> l() {
        return (List<? extends T>) this.c;
    }

    public final AbstractC4937Zo1 m() {
        return this.d;
    }

    public final boolean n() {
        C4248So1 c4248So1 = this.g;
        if (c4248So1 != null && !c4248So1.q()) {
            return false;
        }
        return this.e;
    }

    public final boolean o() {
        C4248So1 c4248So1 = this.g;
        if (c4248So1 != null && !c4248So1.q()) {
            return false;
        }
        return this.f;
    }

    public void q() {
        throw new UnsupportedOperationException("A handler that receives a 'backCompleted' event must override 'onBackCompleted()' to handle the callback.");
    }

    public void r(C4148Ro1 c4148Ro1) {
        C6562gT0.p(c4148Ro1, "event");
    }

    public void s(C4148Ro1 c4148Ro1) {
        C6562gT0.p(c4148Ro1, "event");
    }

    public void u() {
        throw new UnsupportedOperationException("A handler that receives a 'forwardCompleted' event must override 'onForwardCompleted()' to handle the callback.");
    }

    public void v(C4148Ro1 c4148Ro1) {
        C6562gT0.p(c4148Ro1, "event");
    }

    public void w(C4148Ro1 c4148Ro1) {
        C6562gT0.p(c4148Ro1, "event");
    }

    public final void x() {
        C4248So1 c4248So1 = this.g;
        if (c4248So1 != null) {
            c4248So1.r(this);
        }
    }

    public final void y(boolean z) {
        C4830Yo1 n;
        if (this.e != z) {
            this.e = z;
            C4248So1 c4248So1 = this.g;
            if (c4248So1 != null && (n = c4248So1.n()) != null) {
                n.m();
            }
        }
    }

    public final void z(C4248So1 c4248So1) {
        this.g = c4248So1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC4442Uo1(T t, boolean z) {
        this(t, z, false);
        C6562gT0.p(t, "initialInfo");
    }

    public void p() {
    }

    public void t() {
    }
}
