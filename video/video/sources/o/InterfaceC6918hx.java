package o;

import android.util.Size;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import o.C2898Ex;

/* renamed from: o.hx  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6918hx extends InterfaceC6420fx {
    Set<N80> a();

    @Override // o.InterfaceC6420fx
    default C2898Ex b() {
        return new C2898Ex.a().a(new InterfaceC5450bx() { // from class: o.gx
            @Override // o.InterfaceC5450bx
            public final List b(List list) {
                List k;
                k = InterfaceC6918hx.this.k(list);
                return k;
            }
        }).a(new C9028qZ0(g())).b();
    }

    String c();

    void d(AbstractC3393Jv abstractC3393Jv);

    List<Size> j(int i);

    /* synthetic */ default List k(List list) {
        String c = c();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC6420fx interfaceC6420fx = (InterfaceC6420fx) it.next();
            C10907yF1.a(interfaceC6420fx instanceof InterfaceC6918hx);
            if (((InterfaceC6918hx) interfaceC6420fx).c().equals(c)) {
                return Collections.singletonList(interfaceC6420fx);
            }
        }
        throw new IllegalStateException("Unable to find camera with id " + c + " from list of available cameras.");
    }

    C10931yL1 m();

    List<Size> n(int i);

    EnumC5905dp2 r();

    InterfaceC11235zc0 w();

    void z(Executor executor, AbstractC3393Jv abstractC3393Jv);

    default InterfaceC6918hx getImplementation() {
        return this;
    }
}
