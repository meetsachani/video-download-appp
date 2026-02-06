package o;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import o.C3051Gi2;
import o.C3679Mt;
import o.D10;

/* renamed from: o.Gi2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3051Gi2 {

    /* renamed from: o  reason: collision with root package name */
    public static final Range<Integer> f476o = AbstractC4008Qd2.a;
    public final Object a;
    public final Size b;
    public final N80 c;
    public final Range<Integer> d;
    public final InterfaceC7402jx e;
    public final InterfaceFutureC8411o11<Surface> f;
    public final C3679Mt.a<Surface> g;
    public final InterfaceFutureC8411o11<Void> h;
    public final C3679Mt.a<Void> i;
    public final C3679Mt.a<Void> j;
    public final D10 k;
    public h l;
    public i m;
    public Executor n;

    /* renamed from: o.Gi2$a */
    /* loaded from: classes.dex */
    public class a implements XB0<Void> {
        public final /* synthetic */ C3679Mt.a a;
        public final /* synthetic */ InterfaceFutureC8411o11 b;

        public a(C3679Mt.a aVar, InterfaceFutureC8411o11 interfaceFutureC8411o11) {
            this.a = aVar;
            this.b = interfaceFutureC8411o11;
        }

        @Override // o.XB0
        public void b(Throwable th) {
            if (th instanceof f) {
                C10907yF1.n(this.b.cancel(false));
            } else {
                C10907yF1.n(this.a.c(null));
            }
        }

        @Override // o.XB0
        /* renamed from: c */
        public void a(Void r2) {
            C10907yF1.n(this.a.c(null));
        }
    }

    /* renamed from: o.Gi2$b */
    /* loaded from: classes.dex */
    public class b extends D10 {
        public b(Size size, int i) {
            super(size, i);
        }

        @Override // o.D10
        public InterfaceFutureC8411o11<Surface> p() {
            return C3051Gi2.this.f;
        }
    }

    /* renamed from: o.Gi2$c */
    /* loaded from: classes.dex */
    public class c implements XB0<Surface> {
        public final /* synthetic */ InterfaceFutureC8411o11 a;
        public final /* synthetic */ C3679Mt.a b;
        public final /* synthetic */ String c;

        public c(InterfaceFutureC8411o11 interfaceFutureC8411o11, C3679Mt.a aVar, String str) {
            this.a = interfaceFutureC8411o11;
            this.b = aVar;
            this.c = str;
        }

        @Override // o.XB0
        public void b(Throwable th) {
            if (th instanceof CancellationException) {
                C3679Mt.a aVar = this.b;
                C10907yF1.n(aVar.f(new f(this.c + " cancelled.", th)));
                return;
            }
            this.b.c(null);
        }

        @Override // o.XB0
        /* renamed from: c */
        public void a(Surface surface) {
            C7221jC0.j(this.a, this.b);
        }
    }

    /* renamed from: o.Gi2$d */
    /* loaded from: classes.dex */
    public class d implements XB0<Void> {
        public final /* synthetic */ InterfaceC10929yL a;
        public final /* synthetic */ Surface b;

        public d(InterfaceC10929yL interfaceC10929yL, Surface surface) {
            this.a = interfaceC10929yL;
            this.b = surface;
        }

        @Override // o.XB0
        public void b(Throwable th) {
            C10907yF1.o(th instanceof f, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th);
            this.a.accept(g.c(1, this.b));
        }

        @Override // o.XB0
        /* renamed from: c */
        public void a(Void r3) {
            this.a.accept(g.c(0, this.b));
        }
    }

    /* renamed from: o.Gi2$f */
    /* loaded from: classes.dex */
    public static final class f extends RuntimeException {
        public f(String str, Throwable th) {
            super(str, th);
        }
    }

    /* renamed from: o.Gi2$g */
    /* loaded from: classes.dex */
    public static abstract class g {
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;
        public static final int e = 4;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: o.Gi2$g$a */
        /* loaded from: classes.dex */
        public @interface a {
        }

        public static g c(int i, Surface surface) {
            return new C11262zj(i, surface);
        }

        public abstract int a();

        public abstract Surface b();
    }

    /* renamed from: o.Gi2$h */
    /* loaded from: classes.dex */
    public static abstract class h {
        public static h g(Rect rect, int i, int i2, boolean z, Matrix matrix, boolean z2) {
            return new C2453Aj(rect, i, i2, z, matrix, z2);
        }

        public abstract Rect a();

        public abstract boolean b();

        public abstract int c();

        public abstract Matrix d();

        public abstract int e();

        public abstract boolean f();
    }

    /* renamed from: o.Gi2$i */
    /* loaded from: classes.dex */
    public interface i {
        void a(h hVar);
    }

    public C3051Gi2(Size size, InterfaceC7402jx interfaceC7402jx, Runnable runnable) {
        this(size, interfaceC7402jx, N80.n, f476o, runnable);
    }

    public static /* synthetic */ Object b(AtomicReference atomicReference, String str, C3679Mt.a aVar) {
        atomicReference.set(aVar);
        return str + "-cancellation";
    }

    public static /* synthetic */ Object c(AtomicReference atomicReference, String str, C3679Mt.a aVar) {
        atomicReference.set(aVar);
        return str + "-Surface";
    }

    public static /* synthetic */ Object g(C3051Gi2 c3051Gi2, AtomicReference atomicReference, C3679Mt.a aVar) {
        c3051Gi2.getClass();
        atomicReference.set(aVar);
        return "SurfaceRequest-surface-recreation(" + c3051Gi2.hashCode() + C9811tl1.d;
    }

    public static /* synthetic */ Object h(AtomicReference atomicReference, String str, C3679Mt.a aVar) {
        atomicReference.set(aVar);
        return str + "-status";
    }

    public void j(Executor executor, Runnable runnable) {
        this.j.a(runnable, executor);
    }

    public void k() {
        synchronized (this.a) {
            this.m = null;
            this.n = null;
        }
    }

    public InterfaceC7402jx l() {
        return this.e;
    }

    public D10 m() {
        return this.k;
    }

    public N80 n() {
        return this.c;
    }

    public Range<Integer> o() {
        return this.d;
    }

    public Size p() {
        return this.b;
    }

    public final C3679Mt.a<Void> q(Executor executor, Runnable runnable) {
        final AtomicReference atomicReference = new AtomicReference(null);
        C7221jC0.b(C3679Mt.a(new C3679Mt.c() { // from class: o.Fi2
            @Override // o.C3679Mt.c
            public final Object a(C3679Mt.a aVar) {
                return C3051Gi2.g(C3051Gi2.this, atomicReference, aVar);
            }
        }), new e(runnable), executor);
        return (C3679Mt.a) C10907yF1.l((C3679Mt.a) atomicReference.get());
    }

    public boolean r() {
        w();
        return this.i.c(null);
    }

    public boolean s() {
        return this.f.isDone();
    }

    public void t(final Surface surface, Executor executor, final InterfaceC10929yL<g> interfaceC10929yL) {
        if (!this.g.c(surface) && !this.f.isCancelled()) {
            C10907yF1.n(this.f.isDone());
            try {
                this.f.get();
                executor.execute(new Runnable() { // from class: o.zi2
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC10929yL.this.accept(C3051Gi2.g.c(3, surface));
                    }
                });
                return;
            } catch (InterruptedException | ExecutionException unused) {
                executor.execute(new Runnable() { // from class: o.Ai2
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC10929yL.this.accept(C3051Gi2.g.c(4, surface));
                    }
                });
                return;
            }
        }
        C7221jC0.b(this.h, new d(interfaceC10929yL, surface), executor);
    }

    public void u(Executor executor, final i iVar) {
        final h hVar;
        synchronized (this.a) {
            this.m = iVar;
            this.n = executor;
            hVar = this.l;
        }
        if (hVar != null) {
            executor.execute(new Runnable() { // from class: o.yi2
                @Override // java.lang.Runnable
                public final void run() {
                    C3051Gi2.i.this.a(hVar);
                }
            });
        }
    }

    public void v(final h hVar) {
        final i iVar;
        Executor executor;
        synchronized (this.a) {
            this.l = hVar;
            iVar = this.m;
            executor = this.n;
        }
        if (iVar != null && executor != null) {
            executor.execute(new Runnable() { // from class: o.xi2
                @Override // java.lang.Runnable
                public final void run() {
                    C3051Gi2.i.this.a(hVar);
                }
            });
        }
    }

    public boolean w() {
        return this.g.f(new D10.b("Surface request will not complete."));
    }

    public C3051Gi2(Size size, InterfaceC7402jx interfaceC7402jx, N80 n80, Range<Integer> range, Runnable runnable) {
        this.a = new Object();
        this.b = size;
        this.e = interfaceC7402jx;
        this.c = n80;
        this.d = range;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + C6566gU0.g;
        final AtomicReference atomicReference = new AtomicReference(null);
        InterfaceFutureC8411o11 a2 = C3679Mt.a(new C3679Mt.c() { // from class: o.Bi2
            @Override // o.C3679Mt.c
            public final Object a(C3679Mt.a aVar) {
                return C3051Gi2.b(atomicReference, str, aVar);
            }
        });
        C3679Mt.a<Void> aVar = (C3679Mt.a) C10907yF1.l((C3679Mt.a) atomicReference.get());
        this.j = aVar;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        InterfaceFutureC8411o11<Void> a3 = C3679Mt.a(new C3679Mt.c() { // from class: o.Ci2
            @Override // o.C3679Mt.c
            public final Object a(C3679Mt.a aVar2) {
                return C3051Gi2.h(atomicReference2, str, aVar2);
            }
        });
        this.h = a3;
        C7221jC0.b(a3, new a(aVar, a2), C5211ay.b());
        final AtomicReference atomicReference3 = new AtomicReference(null);
        InterfaceFutureC8411o11<Surface> a4 = C3679Mt.a(new C3679Mt.c() { // from class: o.Di2
            @Override // o.C3679Mt.c
            public final Object a(C3679Mt.a aVar2) {
                return C3051Gi2.c(atomicReference3, str, aVar2);
            }
        });
        this.f = a4;
        this.g = (C3679Mt.a) C10907yF1.l((C3679Mt.a) atomicReference3.get());
        b bVar = new b(size, 34);
        this.k = bVar;
        InterfaceFutureC8411o11<Void> k = bVar.k();
        C7221jC0.b(a4, new c(k, (C3679Mt.a) C10907yF1.l((C3679Mt.a) atomicReference2.get()), str), C5211ay.b());
        k.h4(new Runnable() { // from class: o.Ei2
            @Override // java.lang.Runnable
            public final void run() {
                C3051Gi2.this.f.cancel(true);
            }
        }, C5211ay.b());
        this.i = q(C5211ay.b(), runnable);
    }

    /* renamed from: o.Gi2$e */
    /* loaded from: classes.dex */
    public class e implements XB0<Void> {
        public final /* synthetic */ Runnable a;

        public e(Runnable runnable) {
            this.a = runnable;
        }

        @Override // o.XB0
        /* renamed from: c */
        public void a(Void r1) {
            this.a.run();
        }

        @Override // o.XB0
        public void b(Throwable th) {
        }
    }
}
