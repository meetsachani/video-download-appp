package androidx.lifecycle;

import androidx.lifecycle.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import o.C10490wX1;
import o.C10550wn0;
import o.C4102Rd;
import o.C6562gT0;
import o.C9516sY;
import o.InterfaceC9150r20;
import o.InterfaceC9511sW0;
import o.JZ0;
import o.KZ0;

/* loaded from: classes.dex */
public class j extends f {
    public static final a j = new a(null);
    public final boolean b;
    public C10550wn0<JZ0, b> c;
    public f.b d;
    public final WeakReference<KZ0> e;
    public int f;
    public boolean g;
    public boolean h;
    public ArrayList<f.b> i;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        public final j a(KZ0 kz0) {
            C6562gT0.p(kz0, "owner");
            return new j(kz0, false, null);
        }

        @InterfaceC9511sW0
        public final f.b b(f.b bVar, f.b bVar2) {
            C6562gT0.p(bVar, "state1");
            if (bVar2 != null && bVar2.compareTo(bVar) < 0) {
                return bVar2;
            }
            return bVar;
        }

        public a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public f.b a;
        public i b;

        public b(JZ0 jz0, f.b bVar) {
            C6562gT0.p(bVar, "initialState");
            C6562gT0.m(jz0);
            this.b = k.f(jz0);
            this.a = bVar;
        }

        public final void a(KZ0 kz0, f.a aVar) {
            C6562gT0.p(aVar, "event");
            f.b i = aVar.i();
            this.a = j.j.b(this.a, i);
            i iVar = this.b;
            C6562gT0.m(kz0);
            iVar.i(kz0, aVar);
            this.a = i;
        }

        public final i b() {
            return this.b;
        }

        public final f.b c() {
            return this.a;
        }

        public final void d(i iVar) {
            C6562gT0.p(iVar, "<set-?>");
            this.b = iVar;
        }

        public final void e(f.b bVar) {
            C6562gT0.p(bVar, "<set-?>");
            this.a = bVar;
        }
    }

    public /* synthetic */ j(KZ0 kz0, boolean z, C9516sY c9516sY) {
        this(kz0, z);
    }

    @InterfaceC9511sW0
    public static final j h(KZ0 kz0) {
        return j.a(kz0);
    }

    @InterfaceC9511sW0
    public static final f.b o(f.b bVar, f.b bVar2) {
        return j.b(bVar, bVar2);
    }

    @Override // androidx.lifecycle.f
    public void a(JZ0 jz0) {
        KZ0 kz0;
        boolean z;
        C6562gT0.p(jz0, "observer");
        i("addObserver");
        f.b bVar = this.d;
        f.b bVar2 = f.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = f.b.INITIALIZED;
        }
        b bVar3 = new b(jz0, bVar2);
        if (this.c.j(jz0, bVar3) != null || (kz0 = this.e.get()) == null) {
            return;
        }
        if (this.f == 0 && !this.g) {
            z = false;
        } else {
            z = true;
        }
        f.b g = g(jz0);
        this.f++;
        while (bVar3.c().compareTo(g) < 0 && this.c.contains(jz0)) {
            r(bVar3.c());
            f.a c = f.a.Companion.c(bVar3.c());
            if (c != null) {
                bVar3.a(kz0, c);
                q();
                g = g(jz0);
            } else {
                throw new IllegalStateException("no event up from " + bVar3.c());
            }
        }
        if (!z) {
            t();
        }
        this.f--;
    }

    @Override // androidx.lifecycle.f
    public f.b b() {
        return this.d;
    }

    @Override // androidx.lifecycle.f
    public void d(JZ0 jz0) {
        C6562gT0.p(jz0, "observer");
        i("removeObserver");
        this.c.k(jz0);
    }

    public final void f(KZ0 kz0) {
        Iterator<Map.Entry<JZ0, b>> descendingIterator = this.c.descendingIterator();
        C6562gT0.o(descendingIterator, "observerMap.descendingIterator()");
        while (descendingIterator.hasNext() && !this.h) {
            Map.Entry<JZ0, b> next = descendingIterator.next();
            C6562gT0.o(next, "next()");
            JZ0 key = next.getKey();
            b value = next.getValue();
            while (value.c().compareTo(this.d) > 0 && !this.h && this.c.contains(key)) {
                f.a a2 = f.a.Companion.a(value.c());
                if (a2 != null) {
                    r(a2.i());
                    value.a(kz0, a2);
                    q();
                } else {
                    throw new IllegalStateException("no event down from " + value.c());
                }
            }
        }
    }

    public final f.b g(JZ0 jz0) {
        f.b bVar;
        ArrayList<f.b> arrayList;
        b value;
        Map.Entry<JZ0, b> l = this.c.l(jz0);
        f.b bVar2 = null;
        if (l != null && (value = l.getValue()) != null) {
            bVar = value.c();
        } else {
            bVar = null;
        }
        if (!this.i.isEmpty()) {
            bVar2 = this.i.get(arrayList.size() - 1);
        }
        a aVar = j;
        return aVar.b(aVar.b(this.d, bVar), bVar2);
    }

    public final void i(String str) {
        if (this.b && !C4102Rd.h().c()) {
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    public final void j(KZ0 kz0) {
        C10490wX1<JZ0, b>.d f = this.c.f();
        C6562gT0.o(f, "observerMap.iteratorWithAdditions()");
        while (f.hasNext() && !this.h) {
            Map.Entry next = f.next();
            JZ0 jz0 = (JZ0) next.getKey();
            b bVar = (b) next.getValue();
            while (bVar.c().compareTo(this.d) < 0 && !this.h && this.c.contains(jz0)) {
                r(bVar.c());
                f.a c = f.a.Companion.c(bVar.c());
                if (c != null) {
                    bVar.a(kz0, c);
                    q();
                } else {
                    throw new IllegalStateException("no event up from " + bVar.c());
                }
            }
        }
    }

    public int k() {
        i("getObserverCount");
        return this.c.size();
    }

    public void l(f.a aVar) {
        C6562gT0.p(aVar, "event");
        i("handleLifecycleEvent");
        p(aVar.i());
    }

    public final boolean m() {
        if (this.c.size() == 0) {
            return true;
        }
        Map.Entry<JZ0, b> d = this.c.d();
        C6562gT0.m(d);
        f.b c = d.getValue().c();
        Map.Entry<JZ0, b> h = this.c.h();
        C6562gT0.m(h);
        f.b c2 = h.getValue().c();
        if (c == c2 && this.d == c2) {
            return true;
        }
        return false;
    }

    @InterfaceC9150r20(message = "Override [currentState].")
    public void n(f.b bVar) {
        C6562gT0.p(bVar, "state");
        i("markState");
        s(bVar);
    }

    public final void p(f.b bVar) {
        f.b bVar2 = this.d;
        if (bVar2 != bVar) {
            if (bVar2 == f.b.INITIALIZED && bVar == f.b.DESTROYED) {
                throw new IllegalStateException(("no event down from " + this.d + " in component " + this.e.get()).toString());
            }
            this.d = bVar;
            if (!this.g && this.f == 0) {
                this.g = true;
                t();
                this.g = false;
                if (this.d == f.b.DESTROYED) {
                    this.c = new C10550wn0<>();
                    return;
                }
                return;
            }
            this.h = true;
        }
    }

    public final void q() {
        ArrayList<f.b> arrayList = this.i;
        arrayList.remove(arrayList.size() - 1);
    }

    public final void r(f.b bVar) {
        this.i.add(bVar);
    }

    public void s(f.b bVar) {
        C6562gT0.p(bVar, "state");
        i("setCurrentState");
        p(bVar);
    }

    public final void t() {
        KZ0 kz0 = this.e.get();
        if (kz0 != null) {
            while (!m()) {
                this.h = false;
                f.b bVar = this.d;
                Map.Entry<JZ0, b> d = this.c.d();
                C6562gT0.m(d);
                if (bVar.compareTo(d.getValue().c()) < 0) {
                    f(kz0);
                }
                Map.Entry<JZ0, b> h = this.c.h();
                if (!this.h && h != null && this.d.compareTo(h.getValue().c()) > 0) {
                    j(kz0);
                }
            }
            this.h = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }

    public j(KZ0 kz0, boolean z) {
        this.b = z;
        this.c = new C10550wn0<>();
        this.d = f.b.INITIALIZED;
        this.i = new ArrayList<>();
        this.e = new WeakReference<>(kz0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(KZ0 kz0) {
        this(kz0, true);
        C6562gT0.p(kz0, "provider");
    }
}
