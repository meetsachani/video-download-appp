package o;

import android.os.Handler;
import android.os.Looper;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o.qS1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9006qS1 {
    public static final int l = 4;
    public final AtomicInteger a;
    public final Set<AbstractC5091aS1<?>> b;
    public final PriorityBlockingQueue<AbstractC5091aS1<?>> c;
    public final PriorityBlockingQueue<AbstractC5091aS1<?>> d;
    public final InterfaceC4747Xs e;
    public final InterfaceC11045yp1 f;
    public final GT1 g;
    public final C2871Ep1[] h;
    public C6404ft i;
    public final List<e> j;
    public final List<c> k;

    /* renamed from: o.qS1$a */
    /* loaded from: classes.dex */
    public class a implements d {
        public final /* synthetic */ Object a;

        public a(Object obj) {
            this.a = obj;
        }

        @Override // o.C9006qS1.d
        public boolean a(AbstractC5091aS1<?> abstractC5091aS1) {
            if (abstractC5091aS1.F() == this.a) {
                return true;
            }
            return false;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.qS1$b */
    /* loaded from: classes.dex */
    public @interface b {
        public static final int J1 = 0;
        public static final int K1 = 1;
        public static final int L1 = 2;
        public static final int M1 = 3;
        public static final int N1 = 4;
        public static final int O1 = 5;
    }

    /* renamed from: o.qS1$c */
    /* loaded from: classes.dex */
    public interface c {
        void a(AbstractC5091aS1<?> abstractC5091aS1, int i);
    }

    /* renamed from: o.qS1$d */
    /* loaded from: classes.dex */
    public interface d {
        boolean a(AbstractC5091aS1<?> abstractC5091aS1);
    }

    @Deprecated
    /* renamed from: o.qS1$e */
    /* loaded from: classes.dex */
    public interface e<T> {
        void a(AbstractC5091aS1<T> abstractC5091aS1);
    }

    public C9006qS1(InterfaceC4747Xs interfaceC4747Xs, InterfaceC11045yp1 interfaceC11045yp1, int i, GT1 gt1) {
        this.a = new AtomicInteger();
        this.b = new HashSet();
        this.c = new PriorityBlockingQueue<>();
        this.d = new PriorityBlockingQueue<>();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.e = interfaceC4747Xs;
        this.f = interfaceC11045yp1;
        this.h = new C2871Ep1[i];
        this.g = gt1;
    }

    public <T> AbstractC5091aS1<T> a(AbstractC5091aS1<T> abstractC5091aS1) {
        abstractC5091aS1.T(this);
        synchronized (this.b) {
            this.b.add(abstractC5091aS1);
        }
        abstractC5091aS1.V(j());
        abstractC5091aS1.g("add-to-queue");
        m(abstractC5091aS1, 0);
        d(abstractC5091aS1);
        return abstractC5091aS1;
    }

    public void b(c cVar) {
        synchronized (this.k) {
            this.k.add(cVar);
        }
    }

    @Deprecated
    public <T> void c(e<T> eVar) {
        synchronized (this.j) {
            this.j.add(eVar);
        }
    }

    public <T> void d(AbstractC5091aS1<T> abstractC5091aS1) {
        if (!abstractC5091aS1.b0()) {
            n(abstractC5091aS1);
        } else {
            this.c.add(abstractC5091aS1);
        }
    }

    public void e(Object obj) {
        if (obj != null) {
            f(new a(obj));
            return;
        }
        throw new IllegalArgumentException("Cannot cancelAll with a null tag");
    }

    public void f(d dVar) {
        synchronized (this.b) {
            try {
                for (AbstractC5091aS1<?> abstractC5091aS1 : this.b) {
                    if (dVar.a(abstractC5091aS1)) {
                        abstractC5091aS1.h();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public <T> void g(AbstractC5091aS1<T> abstractC5091aS1) {
        synchronized (this.b) {
            this.b.remove(abstractC5091aS1);
        }
        synchronized (this.j) {
            try {
                for (e eVar : this.j) {
                    eVar.a(abstractC5091aS1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m(abstractC5091aS1, 5);
    }

    public InterfaceC4747Xs h() {
        return this.e;
    }

    public GT1 i() {
        return this.g;
    }

    public int j() {
        return this.a.incrementAndGet();
    }

    public void k(c cVar) {
        synchronized (this.k) {
            this.k.remove(cVar);
        }
    }

    @Deprecated
    public <T> void l(e<T> eVar) {
        synchronized (this.j) {
            this.j.remove(eVar);
        }
    }

    public void m(AbstractC5091aS1<?> abstractC5091aS1, int i) {
        synchronized (this.k) {
            try {
                for (c cVar : this.k) {
                    cVar.a(abstractC5091aS1, i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public <T> void n(AbstractC5091aS1<T> abstractC5091aS1) {
        this.d.add(abstractC5091aS1);
    }

    public void o() {
        p();
        C6404ft c6404ft = new C6404ft(this.c, this.d, this.e, this.g);
        this.i = c6404ft;
        c6404ft.start();
        for (int i = 0; i < this.h.length; i++) {
            C2871Ep1 c2871Ep1 = new C2871Ep1(this.d, this.f, this.e, this.g);
            this.h[i] = c2871Ep1;
            c2871Ep1.start();
        }
    }

    public void p() {
        C2871Ep1[] c2871Ep1Arr;
        C6404ft c6404ft = this.i;
        if (c6404ft != null) {
            c6404ft.d();
        }
        for (C2871Ep1 c2871Ep1 : this.h) {
            if (c2871Ep1 != null) {
                c2871Ep1.e();
            }
        }
    }

    public C9006qS1(InterfaceC4747Xs interfaceC4747Xs, InterfaceC11045yp1 interfaceC11045yp1, int i) {
        this(interfaceC4747Xs, interfaceC11045yp1, i, new C7821lg0(new Handler(Looper.getMainLooper())));
    }

    public C9006qS1(InterfaceC4747Xs interfaceC4747Xs, InterfaceC11045yp1 interfaceC11045yp1) {
        this(interfaceC4747Xs, interfaceC11045yp1, 4);
    }
}
