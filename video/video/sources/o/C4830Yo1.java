package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import o.AbstractC4937Zo1;

/* renamed from: o.Yo1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4830Yo1 {
    public final InterfaceC4144Rn1<AbstractC4937Zo1> a;
    public final InterfaceC9041qc2<AbstractC4937Zo1> b;
    public final InterfaceC4144Rn1<C4539Vo1> c;
    public final InterfaceC9041qc2<C4539Vo1> d;
    public final C7085ie<AbstractC4442Uo1<?>> e;
    public final C7085ie<AbstractC4442Uo1<?>> f;
    public AbstractC4442Uo1<?> g;
    public int h;
    public AbstractC4733Xo1 i;
    public final Set<AbstractC4733Xo1> j;
    public final Set<AbstractC4733Xo1> k;
    public final Set<AbstractC4733Xo1> l;
    public boolean m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f675o;

    public C4830Yo1() {
        InterfaceC4144Rn1<AbstractC4937Zo1> a = C9533sc2.a(AbstractC4937Zo1.c.e);
        this.a = a;
        this.b = C4467Uv0.l(a);
        InterfaceC4144Rn1<C4539Vo1> a2 = C9533sc2.a(new C4539Vo1());
        this.c = a2;
        this.d = C4467Uv0.l(a2);
        this.e = new C7085ie<>();
        this.f = new C7085ie<>();
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
        this.l = new LinkedHashSet();
    }

    public static /* synthetic */ void b(C4830Yo1 c4830Yo1, C4248So1 c4248So1, AbstractC4442Uo1 abstractC4442Uo1, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 1;
        }
        c4830Yo1.a(c4248So1, abstractC4442Uo1, i);
    }

    public static /* synthetic */ void h(C4830Yo1 c4830Yo1, AbstractC4733Xo1 abstractC4733Xo1, int i, C4148Ro1 c4148Ro1, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            c4148Ro1 = null;
        }
        c4830Yo1.g(abstractC4733Xo1, i, c4148Ro1);
    }

    public static /* synthetic */ AbstractC4442Uo1 r(C4830Yo1 c4830Yo1, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return c4830Yo1.q(i);
    }

    public final void a(C4248So1 c4248So1, AbstractC4442Uo1<?> abstractC4442Uo1, int i) {
        C6562gT0.p(c4248So1, "dispatcher");
        C6562gT0.p(abstractC4442Uo1, "handler");
        if (abstractC4442Uo1.k() == null) {
            if (i != 0) {
                if (i == 1) {
                    this.f.addFirst(abstractC4442Uo1);
                } else {
                    throw new IllegalArgumentException("Unsupported priority value: " + i);
                }
            } else {
                this.e.addFirst(abstractC4442Uo1);
            }
            abstractC4442Uo1.z(c4248So1);
            m();
            return;
        }
        throw new IllegalArgumentException(("Handler '" + abstractC4442Uo1 + "' is already registered with a dispatcher").toString());
    }

    public final void c(C4248So1 c4248So1, AbstractC4733Xo1 abstractC4733Xo1, int i) {
        Set<AbstractC4733Xo1> set;
        boolean z;
        C6562gT0.p(c4248So1, "dispatcher");
        C6562gT0.p(abstractC4733Xo1, "input");
        if (abstractC4733Xo1.m() == null) {
            if (i != 0) {
                if (i != 1) {
                    set = this.j;
                } else {
                    set = this.k;
                }
            } else {
                set = this.l;
            }
            set.add(abstractC4733Xo1);
            abstractC4733Xo1.r(c4248So1);
            abstractC4733Xo1.i(c4248So1);
            abstractC4733Xo1.k(this.d.getValue());
            if (i != 0) {
                if (i != 1) {
                    z = this.f675o;
                } else {
                    z = this.m;
                }
            } else {
                z = this.n;
            }
            abstractC4733Xo1.j(z);
            return;
        }
        throw new IllegalArgumentException(("Input '" + abstractC4733Xo1 + "' is already added to dispatcher " + abstractC4733Xo1.m() + '.').toString());
    }

    public final void d(AbstractC4733Xo1 abstractC4733Xo1, int i) {
        C6562gT0.p(abstractC4733Xo1, "input");
        if (C6562gT0.g(abstractC4733Xo1, this.i) && i == this.h) {
            AbstractC4442Uo1<?> abstractC4442Uo1 = this.g;
            if (abstractC4442Uo1 == null) {
                abstractC4442Uo1 = q(i);
            }
            this.g = null;
            this.h = 0;
            this.i = null;
            if (i != -1) {
                if (i == 1 && abstractC4442Uo1 != null) {
                    abstractC4442Uo1.e();
                }
            } else if (abstractC4442Uo1 != null) {
                abstractC4442Uo1.a();
            }
            this.a.setValue(AbstractC4937Zo1.c.e);
        }
    }

    public final void e(AbstractC4733Xo1 abstractC4733Xo1, int i, InterfaceC10579wu1 interfaceC10579wu1) {
        C6562gT0.p(abstractC4733Xo1, "input");
        if (C6562gT0.g(abstractC4733Xo1, this.i) && i == this.h) {
            AbstractC4442Uo1<?> abstractC4442Uo1 = this.g;
            if (abstractC4442Uo1 == null) {
                abstractC4442Uo1 = q(i);
            }
            this.g = null;
            this.h = 0;
            this.i = null;
            if (i != -1) {
                if (i == 1 && abstractC4442Uo1 != null) {
                    abstractC4442Uo1.f();
                }
            } else if (abstractC4442Uo1 == null) {
                if (interfaceC10579wu1 != null) {
                    interfaceC10579wu1.a();
                }
            } else {
                abstractC4442Uo1.b();
            }
            this.a.setValue(AbstractC4937Zo1.c.e);
        }
    }

    public final void f(AbstractC4733Xo1 abstractC4733Xo1, int i, C4148Ro1 c4148Ro1) {
        C6562gT0.p(abstractC4733Xo1, "input");
        C6562gT0.p(c4148Ro1, "event");
        if (C6562gT0.g(abstractC4733Xo1, this.i) && i == this.h) {
            AbstractC4442Uo1<?> abstractC4442Uo1 = this.g;
            if (abstractC4442Uo1 == null) {
                abstractC4442Uo1 = q(i);
            }
            if (i != -1) {
                if (i == 1 && abstractC4442Uo1 != null) {
                    abstractC4442Uo1.g(c4148Ro1);
                }
            } else if (abstractC4442Uo1 != null) {
                abstractC4442Uo1.c(c4148Ro1);
            }
            this.a.setValue(new AbstractC4937Zo1.d(c4148Ro1, i));
        }
    }

    public final void g(AbstractC4733Xo1 abstractC4733Xo1, int i, C4148Ro1 c4148Ro1) {
        C6562gT0.p(abstractC4733Xo1, "input");
        if (this.h == 0) {
            AbstractC4442Uo1<?> q = q(i);
            this.g = q;
            this.h = i;
            this.i = abstractC4733Xo1;
            if (c4148Ro1 != null) {
                if (i != -1) {
                    if (i == 1 && q != null) {
                        q.h(c4148Ro1);
                    }
                } else if (q != null) {
                    q.d(c4148Ro1);
                }
                this.a.setValue(new AbstractC4937Zo1.d(c4148Ro1, i));
            }
        }
    }

    public final AbstractC4442Uo1<?> i(HA0<? super AbstractC4442Uo1<?>, Boolean> ha0) {
        AbstractC4442Uo1<?> abstractC4442Uo1;
        AbstractC4442Uo1<?> abstractC4442Uo12;
        Iterator<AbstractC4442Uo1<?>> it = this.e.iterator();
        while (true) {
            abstractC4442Uo1 = null;
            if (it.hasNext()) {
                abstractC4442Uo12 = it.next();
                if (ha0.invoke(abstractC4442Uo12).booleanValue()) {
                    break;
                }
            } else {
                abstractC4442Uo12 = null;
                break;
            }
        }
        AbstractC4442Uo1<?> abstractC4442Uo13 = abstractC4442Uo12;
        if (abstractC4442Uo13 == null) {
            Iterator<AbstractC4442Uo1<?>> it2 = this.f.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                AbstractC4442Uo1<?> next = it2.next();
                if (ha0.invoke(next).booleanValue()) {
                    abstractC4442Uo1 = next;
                    break;
                }
            }
            return abstractC4442Uo1;
        }
        return abstractC4442Uo13;
    }

    public final InterfaceC9041qc2<C4539Vo1> j() {
        return this.d;
    }

    public final InterfaceC9041qc2<AbstractC4937Zo1> l() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C7085ie<AbstractC4442Uo1<?>> c7085ie = this.e;
        if (c7085ie == null || !c7085ie.isEmpty()) {
            for (AbstractC4442Uo1<?> abstractC4442Uo1 : c7085ie) {
                if (abstractC4442Uo1.n() || abstractC4442Uo1.o()) {
                    z = true;
                    break;
                }
                while (r0.hasNext()) {
                }
            }
        }
        z = false;
        C7085ie<AbstractC4442Uo1<?>> c7085ie2 = this.f;
        if (c7085ie2 == null || !c7085ie2.isEmpty()) {
            for (AbstractC4442Uo1<?> abstractC4442Uo12 : c7085ie2) {
                if (abstractC4442Uo12.n() || abstractC4442Uo12.o()) {
                    z2 = true;
                    break;
                }
                while (r3.hasNext()) {
                }
            }
        }
        z2 = false;
        if (!z && !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (this.n != z) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.m != z2) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (this.f675o != z3) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z4) {
            for (AbstractC4733Xo1 abstractC4733Xo1 : this.l) {
                abstractC4733Xo1.j(z);
            }
        }
        if (z5) {
            for (AbstractC4733Xo1 abstractC4733Xo12 : this.k) {
                abstractC4733Xo12.j(z2);
            }
        }
        if (z6) {
            for (AbstractC4733Xo1 abstractC4733Xo13 : this.j) {
                abstractC4733Xo13.j(z3);
            }
        }
        this.n = z;
        this.m = z2;
        this.f675o = z3;
        AbstractC4442Uo1<?> abstractC4442Uo13 = this.g;
        if (abstractC4442Uo13 == null) {
            abstractC4442Uo13 = r(this, 0, 1, null);
        }
        s(abstractC4442Uo13);
    }

    public final void n(AbstractC4442Uo1<?> abstractC4442Uo1) {
        C6562gT0.p(abstractC4442Uo1, "handler");
        if (C6562gT0.g(abstractC4442Uo1, this.g)) {
            int i = this.h;
            if (i != -1) {
                if (i == 1) {
                    abstractC4442Uo1.e();
                }
            } else {
                abstractC4442Uo1.a();
            }
            this.g = null;
            this.h = 0;
            this.i = null;
        }
        this.e.remove(abstractC4442Uo1);
        this.f.remove(abstractC4442Uo1);
        abstractC4442Uo1.z(null);
        m();
    }

    public final void o(AbstractC4733Xo1 abstractC4733Xo1) {
        C6562gT0.p(abstractC4733Xo1, "input");
        this.l.remove(abstractC4733Xo1);
        this.k.remove(abstractC4733Xo1);
        this.j.remove(abstractC4733Xo1);
        abstractC4733Xo1.r(null);
        abstractC4733Xo1.l();
    }

    public final List<AbstractC4636Wo1> p() {
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractC4442Uo1<?>> it = this.e.iterator();
        while (it.hasNext()) {
            AbstractC4442Uo1<?> next = it.next();
            if (next.n() && !next.i().isEmpty()) {
                arrayList.addAll(next.i());
            }
        }
        Iterator<AbstractC4442Uo1<?>> it2 = this.f.iterator();
        while (it2.hasNext()) {
            AbstractC4442Uo1<?> next2 = it2.next();
            if (next2.n() && !next2.i().isEmpty()) {
                arrayList.addAll(next2.i());
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC4442Uo1<?> q(int i) {
        AbstractC4442Uo1<?> abstractC4442Uo1;
        AbstractC4442Uo1<?> abstractC4442Uo12;
        AbstractC4442Uo1<?> abstractC4442Uo13;
        AbstractC4442Uo1<?> abstractC4442Uo14 = null;
        if (i != -1) {
            if (i != 0) {
                if (i == 1) {
                    Iterator<AbstractC4442Uo1<?>> it = this.e.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            abstractC4442Uo13 = it.next();
                            if (abstractC4442Uo13.o()) {
                                break;
                            }
                        } else {
                            abstractC4442Uo13 = null;
                            break;
                        }
                    }
                    AbstractC4442Uo1<?> abstractC4442Uo15 = abstractC4442Uo13;
                    if (abstractC4442Uo15 == null) {
                        Iterator<AbstractC4442Uo1<?>> it2 = this.f.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            AbstractC4442Uo1<?> next = it2.next();
                            if (next.o()) {
                                abstractC4442Uo14 = next;
                                break;
                            }
                        }
                        return abstractC4442Uo14;
                    }
                    return abstractC4442Uo15;
                }
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator<AbstractC4442Uo1<?>> it3 = this.e.iterator();
            while (true) {
                if (it3.hasNext()) {
                    abstractC4442Uo12 = it3.next();
                    AbstractC4442Uo1<?> abstractC4442Uo16 = abstractC4442Uo12;
                    if (abstractC4442Uo16.n()) {
                        break;
                    } else if (abstractC4442Uo16.o()) {
                        break;
                    }
                } else {
                    abstractC4442Uo12 = null;
                    break;
                }
            }
            AbstractC4442Uo1<?> abstractC4442Uo17 = abstractC4442Uo12;
            if (abstractC4442Uo17 == null) {
                for (AbstractC4442Uo1<?> abstractC4442Uo18 : this.f) {
                    AbstractC4442Uo1<?> abstractC4442Uo19 = abstractC4442Uo18;
                    if (abstractC4442Uo19.n() || abstractC4442Uo19.o()) {
                        abstractC4442Uo14 = abstractC4442Uo18;
                        break;
                    }
                    while (r5.hasNext()) {
                    }
                }
                return abstractC4442Uo14;
            }
            return abstractC4442Uo17;
        }
        Iterator<AbstractC4442Uo1<?>> it4 = this.e.iterator();
        while (true) {
            if (it4.hasNext()) {
                abstractC4442Uo1 = it4.next();
                if (abstractC4442Uo1.n()) {
                    break;
                }
            } else {
                abstractC4442Uo1 = null;
                break;
            }
        }
        AbstractC4442Uo1<?> abstractC4442Uo110 = abstractC4442Uo1;
        if (abstractC4442Uo110 == null) {
            Iterator<AbstractC4442Uo1<?>> it5 = this.f.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                AbstractC4442Uo1<?> next2 = it5.next();
                if (next2.n()) {
                    abstractC4442Uo14 = next2;
                    break;
                }
            }
            return abstractC4442Uo14;
        }
        return abstractC4442Uo110;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [o.Wo1] */
    public final void s(AbstractC4442Uo1<?> abstractC4442Uo1) {
        C4539Vo1 c4539Vo1;
        AbstractC4442Uo1<?> abstractC4442Uo12 = this.g;
        if (abstractC4442Uo12 == null) {
            abstractC4442Uo12 = r(this, 0, 1, null);
        }
        if (C6562gT0.g(abstractC4442Uo12, abstractC4442Uo1)) {
            if (abstractC4442Uo12 == null) {
                c4539Vo1 = new C4539Vo1();
            } else {
                c4539Vo1 = new C4539Vo1(abstractC4442Uo12.j(), p(), abstractC4442Uo12.l());
            }
            if (!C6562gT0.g(this.c.getValue(), c4539Vo1)) {
                this.c.setValue(c4539Vo1);
                for (AbstractC4733Xo1 abstractC4733Xo1 : this.l) {
                    abstractC4733Xo1.k(c4539Vo1);
                }
                for (AbstractC4733Xo1 abstractC4733Xo12 : this.k) {
                    abstractC4733Xo12.k(c4539Vo1);
                }
                for (AbstractC4733Xo1 abstractC4733Xo13 : this.j) {
                    abstractC4733Xo13.k(c4539Vo1);
                }
            }
        }
    }

    public static /* synthetic */ void k() {
    }
}
