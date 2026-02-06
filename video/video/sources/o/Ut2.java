package o;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Callable;
import o.HT1;

@InterfaceC11123z82
/* loaded from: classes2.dex */
public class Ut2 implements St2 {
    public static volatile Vt2 e;
    public final ND a;
    public final ND b;
    public final InterfaceC6081eY1 c;
    public final GC2 d;

    @RP0
    public Ut2(@InterfaceC10438wJ2 ND nd, @InterfaceC3058Gk1 ND nd2, InterfaceC6081eY1 interfaceC6081eY1, GC2 gc2, WM2 wm2) {
        this.a = nd;
        this.b = nd2;
        this.c = interfaceC6081eY1;
        this.d = gc2;
        wm2.c();
    }

    public static Ut2 c() {
        Vt2 vt2 = e;
        if (vt2 != null) {
            return vt2.d();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static Set<C3123Hc0> d(B20 b20) {
        if (b20 instanceof InterfaceC10745xb0) {
            return Collections.unmodifiableSet(((InterfaceC10745xb0) b20).a());
        }
        return Collections.singleton(C3123Hc0.b("proto"));
    }

    public static void f(Context context) {
        if (e == null) {
            synchronized (Ut2.class) {
                try {
                    if (e == null) {
                        e = ZT.f().a(context).build();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @HT1({HT1.a.Z0})
    @InterfaceC5056aJ2
    public static void i(Vt2 vt2, Callable<Void> callable) throws Throwable {
        Vt2 vt22;
        synchronized (Ut2.class) {
            vt22 = e;
            e = vt2;
        }
        try {
            callable.call();
            synchronized (Ut2.class) {
                e = vt22;
            }
        } catch (Throwable th) {
            synchronized (Ut2.class) {
                e = vt22;
                throw th;
            }
        }
    }

    @Override // o.St2
    public void a(AbstractC10605x02 abstractC10605x02, Xt2 xt2) {
        this.c.a(abstractC10605x02.f().f(abstractC10605x02.c().c()), b(abstractC10605x02), xt2);
    }

    public final AbstractC3033Ge0 b(AbstractC10605x02 abstractC10605x02) {
        return AbstractC3033Ge0.a().i(this.a.a()).k(this.b.a()).j(abstractC10605x02.g()).h(new C10988yb0(abstractC10605x02.b(), abstractC10605x02.d())).g(abstractC10605x02.c().a()).d();
    }

    @HT1({HT1.a.Y})
    public GC2 e() {
        return this.d;
    }

    @Deprecated
    public Ot2 g(String str) {
        return new Pt2(d(null), Nt2.a().b(str).a(), this);
    }

    public Ot2 h(B20 b20) {
        return new Pt2(d(b20), Nt2.a().b(b20.getName()).c(b20.getExtras()).a(), this);
    }
}
