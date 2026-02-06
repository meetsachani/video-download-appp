package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class f {
    public final CopyOnWriteArrayList<a> a = new CopyOnWriteArrayList<>();
    public final FragmentManager b;

    /* loaded from: classes.dex */
    public static final class a {
        public final FragmentManager.m a;
        public final boolean b;

        public a(FragmentManager.m mVar, boolean z) {
            this.a = mVar;
            this.b = z;
        }
    }

    public f(FragmentManager fragmentManager) {
        this.b = fragmentManager;
    }

    public void a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment N0 = this.b.N0();
        if (N0 != null) {
            N0.O().M0().a(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.a(this.b, fragment, bundle);
            }
        }
    }

    public void b(Fragment fragment, boolean z) {
        Context g = this.b.K0().g();
        Fragment N0 = this.b.N0();
        if (N0 != null) {
            N0.O().M0().b(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.b(this.b, fragment, g);
            }
        }
    }

    public void c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment N0 = this.b.N0();
        if (N0 != null) {
            N0.O().M0().c(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.c(this.b, fragment, bundle);
            }
        }
    }

    public void d(Fragment fragment, boolean z) {
        Fragment N0 = this.b.N0();
        if (N0 != null) {
            N0.O().M0().d(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.d(this.b, fragment);
            }
        }
    }

    public void e(Fragment fragment, boolean z) {
        Fragment N0 = this.b.N0();
        if (N0 != null) {
            N0.O().M0().e(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.e(this.b, fragment);
            }
        }
    }

    public void f(Fragment fragment, boolean z) {
        Fragment N0 = this.b.N0();
        if (N0 != null) {
            N0.O().M0().f(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.f(this.b, fragment);
            }
        }
    }

    public void g(Fragment fragment, boolean z) {
        Context g = this.b.K0().g();
        Fragment N0 = this.b.N0();
        if (N0 != null) {
            N0.O().M0().g(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.g(this.b, fragment, g);
            }
        }
    }

    public void h(Fragment fragment, Bundle bundle, boolean z) {
        Fragment N0 = this.b.N0();
        if (N0 != null) {
            N0.O().M0().h(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.h(this.b, fragment, bundle);
            }
        }
    }

    public void i(Fragment fragment, boolean z) {
        Fragment N0 = this.b.N0();
        if (N0 != null) {
            N0.O().M0().i(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.i(this.b, fragment);
            }
        }
    }

    public void j(Fragment fragment, Bundle bundle, boolean z) {
        Fragment N0 = this.b.N0();
        if (N0 != null) {
            N0.O().M0().j(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.j(this.b, fragment, bundle);
            }
        }
    }

    public void k(Fragment fragment, boolean z) {
        Fragment N0 = this.b.N0();
        if (N0 != null) {
            N0.O().M0().k(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.k(this.b, fragment);
            }
        }
    }

    public void l(Fragment fragment, boolean z) {
        Fragment N0 = this.b.N0();
        if (N0 != null) {
            N0.O().M0().l(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.l(this.b, fragment);
            }
        }
    }

    public void m(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment N0 = this.b.N0();
        if (N0 != null) {
            N0.O().M0().m(fragment, view, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.m(this.b, fragment, view, bundle);
            }
        }
    }

    public void n(Fragment fragment, boolean z) {
        Fragment N0 = this.b.N0();
        if (N0 != null) {
            N0.O().M0().n(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.n(this.b, fragment);
            }
        }
    }

    public void o(FragmentManager.m mVar, boolean z) {
        this.a.add(new a(mVar, z));
    }

    public void p(FragmentManager.m mVar) {
        synchronized (this.a) {
            try {
                int size = this.a.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    } else if (this.a.get(i).a == mVar) {
                        this.a.remove(i);
                        break;
                    } else {
                        i++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
