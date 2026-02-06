package o;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: o.ni1 */
/* loaded from: classes.dex */
public class C8334ni1 {
    public final Runnable a;
    public final CopyOnWriteArrayList<InterfaceC10042ui1> b = new CopyOnWriteArrayList<>();
    public final Map<InterfaceC10042ui1, a> c = new HashMap();

    /* renamed from: o.ni1$a */
    /* loaded from: classes.dex */
    public static class a {
        public final androidx.lifecycle.f a;
        public androidx.lifecycle.i b;

        public a(androidx.lifecycle.f fVar, androidx.lifecycle.i iVar) {
            this.a = fVar;
            this.b = iVar;
            fVar.a(iVar);
        }

        public void a() {
            this.a.d(this.b);
            this.b = null;
        }
    }

    public C8334ni1(Runnable runnable) {
        this.a = runnable;
    }

    public static /* synthetic */ void a(C8334ni1 c8334ni1, f.b bVar, InterfaceC10042ui1 interfaceC10042ui1, KZ0 kz0, f.a aVar) {
        c8334ni1.getClass();
        if (aVar == f.a.l(bVar)) {
            c8334ni1.c(interfaceC10042ui1);
        } else if (aVar == f.a.ON_DESTROY) {
            c8334ni1.j(interfaceC10042ui1);
        } else if (aVar == f.a.g(bVar)) {
            c8334ni1.b.remove(interfaceC10042ui1);
            c8334ni1.a.run();
        }
    }

    public static /* synthetic */ void b(C8334ni1 c8334ni1, InterfaceC10042ui1 interfaceC10042ui1, KZ0 kz0, f.a aVar) {
        c8334ni1.getClass();
        if (aVar == f.a.ON_DESTROY) {
            c8334ni1.j(interfaceC10042ui1);
        }
    }

    public void c(InterfaceC10042ui1 interfaceC10042ui1) {
        this.b.add(interfaceC10042ui1);
        this.a.run();
    }

    public void d(final InterfaceC10042ui1 interfaceC10042ui1, KZ0 kz0) {
        c(interfaceC10042ui1);
        androidx.lifecycle.f b = kz0.b();
        a remove = this.c.remove(interfaceC10042ui1);
        if (remove != null) {
            remove.a();
        }
        this.c.put(interfaceC10042ui1, new a(b, new androidx.lifecycle.i() { // from class: o.mi1
            {
                C8334ni1.this = this;
            }

            @Override // androidx.lifecycle.i
            public final void i(KZ0 kz02, f.a aVar) {
                C8334ni1.b(C8334ni1.this, interfaceC10042ui1, kz02, aVar);
            }
        }));
    }

    public void e(final InterfaceC10042ui1 interfaceC10042ui1, KZ0 kz0, final f.b bVar) {
        androidx.lifecycle.f b = kz0.b();
        a remove = this.c.remove(interfaceC10042ui1);
        if (remove != null) {
            remove.a();
        }
        this.c.put(interfaceC10042ui1, new a(b, new androidx.lifecycle.i() { // from class: o.li1
            {
                C8334ni1.this = this;
            }

            @Override // androidx.lifecycle.i
            public final void i(KZ0 kz02, f.a aVar) {
                C8334ni1.a(C8334ni1.this, bVar, interfaceC10042ui1, kz02, aVar);
            }
        }));
    }

    public void f(Menu menu, MenuInflater menuInflater) {
        Iterator<InterfaceC10042ui1> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().d(menu, menuInflater);
        }
    }

    public void g(Menu menu) {
        Iterator<InterfaceC10042ui1> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().a(menu);
        }
    }

    public boolean h(MenuItem menuItem) {
        Iterator<InterfaceC10042ui1> it = this.b.iterator();
        while (it.hasNext()) {
            if (it.next().c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void i(Menu menu) {
        Iterator<InterfaceC10042ui1> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
    }

    public void j(InterfaceC10042ui1 interfaceC10042ui1) {
        this.b.remove(interfaceC10042ui1);
        a remove = this.c.remove(interfaceC10042ui1);
        if (remove != null) {
            remove.a();
        }
        this.a.run();
    }
}
