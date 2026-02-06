package o;

import android.util.Log;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicInteger;
import o.C3679Mt;

/* loaded from: classes.dex */
public abstract class D10 {
    public static final Size k = new Size(0, 0);
    public static final String l = "DeferrableSurface";
    public static final boolean m = C7433k41.h(l);
    public static final AtomicInteger n = new AtomicInteger(0);

    /* renamed from: o */
    public static final AtomicInteger f434o = new AtomicInteger(0);
    public final Object a;
    public int b;
    public boolean c;
    public C3679Mt.a<Void> d;
    public final InterfaceFutureC8411o11<Void> e;
    public C3679Mt.a<Void> f;
    public final InterfaceFutureC8411o11<Void> g;
    public final Size h;
    public final int i;
    public Class<?> j;

    /* loaded from: classes.dex */
    public static final class a extends Exception {
        public D10 X;

        public a(String str, D10 d10) {
            super(str);
            this.X = d10;
        }

        public D10 a() {
            return this.X;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends Exception {
        public b(String str) {
            super(str);
        }
    }

    public D10() {
        this(k, 0);
    }

    public static /* synthetic */ Object a(D10 d10, C3679Mt.a aVar) {
        synchronized (d10.a) {
            d10.d = aVar;
        }
        return "DeferrableSurface-termination(" + d10 + C9811tl1.d;
    }

    public static /* synthetic */ Object b(D10 d10, C3679Mt.a aVar) {
        synchronized (d10.a) {
            d10.f = aVar;
        }
        return "DeferrableSurface-close(" + d10 + C9811tl1.d;
    }

    public static /* synthetic */ void c(D10 d10, String str) {
        d10.getClass();
        try {
            d10.e.get();
            d10.o("Surface terminated", f434o.decrementAndGet(), n.get());
        } catch (Exception e) {
            C7433k41.c(l, "Unexpected surface termination for " + d10 + "\nStack Trace:\n" + str);
            synchronized (d10.a) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", d10, Boolean.valueOf(d10.c), Integer.valueOf(d10.b)), e);
            }
        }
    }

    public void d() {
        C3679Mt.a<Void> aVar;
        synchronized (this.a) {
            try {
                if (!this.c) {
                    this.c = true;
                    this.f.c(null);
                    if (this.b == 0) {
                        aVar = this.d;
                        this.d = null;
                    } else {
                        aVar = null;
                    }
                    if (C7433k41.h(l)) {
                        C7433k41.a(l, "surface closed,  useCount=" + this.b + " closed=true " + this);
                    }
                } else {
                    aVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.c(null);
        }
    }

    public void e() {
        C3679Mt.a<Void> aVar;
        synchronized (this.a) {
            try {
                int i = this.b;
                if (i != 0) {
                    int i2 = i - 1;
                    this.b = i2;
                    if (i2 == 0 && this.c) {
                        aVar = this.d;
                        this.d = null;
                    } else {
                        aVar = null;
                    }
                    if (C7433k41.h(l)) {
                        C7433k41.a(l, "use count-1,  useCount=" + this.b + " closed=" + this.c + C4500Ve2.b + this);
                        if (this.b == 0) {
                            o("Surface no longer in use", f434o.get(), n.decrementAndGet());
                        }
                    }
                } else {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.c(null);
        }
    }

    public InterfaceFutureC8411o11<Void> f() {
        return C7221jC0.i(this.g);
    }

    public Class<?> g() {
        return this.j;
    }

    public Size h() {
        return this.h;
    }

    public int i() {
        return this.i;
    }

    public final InterfaceFutureC8411o11<Surface> j() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return C7221jC0.f(new a("DeferrableSurface already closed.", this));
                }
                return p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public InterfaceFutureC8411o11<Void> k() {
        return C7221jC0.i(this.e);
    }

    public int l() {
        int i;
        synchronized (this.a) {
            i = this.b;
        }
        return i;
    }

    public void m() throws a {
        synchronized (this.a) {
            try {
                int i = this.b;
                if (i == 0 && this.c) {
                    throw new a("Cannot begin use on a closed surface.", this);
                }
                this.b = i + 1;
                if (C7433k41.h(l)) {
                    if (this.b == 1) {
                        o("New surface in use", f434o.get(), n.incrementAndGet());
                    }
                    C7433k41.a(l, "use count+1, useCount=" + this.b + C4500Ve2.b + this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean n() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    public final void o(String str, int i, int i2) {
        if (!m && C7433k41.h(l)) {
            C7433k41.a(l, "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        C7433k41.a(l, str + "[total_surfaces=" + i + ", used_surfaces=" + i2 + "](" + this + "}");
    }

    public abstract InterfaceFutureC8411o11<Surface> p();

    public void q(Class<?> cls) {
        this.j = cls;
    }

    public D10(Size size, int i) {
        this.a = new Object();
        this.b = 0;
        this.c = false;
        this.h = size;
        this.i = i;
        InterfaceFutureC8411o11<Void> a2 = C3679Mt.a(new C3679Mt.c() { // from class: o.A10
            @Override // o.C3679Mt.c
            public final Object a(C3679Mt.a aVar) {
                return D10.a(D10.this, aVar);
            }
        });
        this.e = a2;
        this.g = C3679Mt.a(new C3679Mt.c() { // from class: o.B10
            @Override // o.C3679Mt.c
            public final Object a(C3679Mt.a aVar) {
                return D10.b(D10.this, aVar);
            }
        });
        if (C7433k41.h(l)) {
            o("Surface created", f434o.incrementAndGet(), n.get());
            final String stackTraceString = Log.getStackTraceString(new Exception());
            a2.h4(new Runnable() { // from class: o.C10
                @Override // java.lang.Runnable
                public final void run() {
                    D10.c(D10.this, stackTraceString);
                }
            }, C5211ay.b());
        }
    }
}
