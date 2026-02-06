package o;

import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: o.Mt  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3679Mt {

    /* renamed from: o.Mt$a */
    /* loaded from: classes.dex */
    public static final class a<T> {
        public Object a;
        public d<T> b;
        public ZS1<Void> c = ZS1.A();
        public boolean d;

        public void a(Runnable runnable, Executor executor) {
            ZS1<Void> zs1 = this.c;
            if (zs1 != null) {
                zs1.h4(runnable, executor);
            }
        }

        public void b() {
            this.a = null;
            this.b = null;
            this.c.v(null);
        }

        public boolean c(T t) {
            boolean z = true;
            this.d = true;
            d<T> dVar = this.b;
            z = (dVar == null || !dVar.b(t)) ? false : false;
            if (z) {
                e();
            }
            return z;
        }

        public boolean d() {
            boolean z = true;
            this.d = true;
            d<T> dVar = this.b;
            z = (dVar == null || !dVar.a(true)) ? false : false;
            if (z) {
                e();
            }
            return z;
        }

        public final void e() {
            this.a = null;
            this.b = null;
            this.c = null;
        }

        public boolean f(Throwable th) {
            boolean z = true;
            this.d = true;
            d<T> dVar = this.b;
            z = (dVar == null || !dVar.c(th)) ? false : false;
            if (z) {
                e();
            }
            return z;
        }

        public void finalize() {
            ZS1<Void> zs1;
            d<T> dVar = this.b;
            if (dVar != null && !dVar.isDone()) {
                dVar.c(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a));
            }
            if (!this.d && (zs1 = this.c) != null) {
                zs1.v(null);
            }
        }
    }

    /* renamed from: o.Mt$b */
    /* loaded from: classes.dex */
    public static final class b extends Throwable {
        public b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: o.Mt$c */
    /* loaded from: classes.dex */
    public interface c<T> {
        Object a(a<T> aVar) throws Exception;
    }

    /* renamed from: o.Mt$d */
    /* loaded from: classes.dex */
    public static final class d<T> implements InterfaceFutureC8411o11<T> {
        public final WeakReference<a<T>> X;
        public final O2<T> Y = new a();

        /* renamed from: o.Mt$d$a */
        /* loaded from: classes.dex */
        public class a extends O2<T> {
            public a() {
            }

            @Override // o.O2
            public String s() {
                a<T> aVar = d.this.X.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.a + C6566gU0.g;
            }
        }

        public d(a<T> aVar) {
            this.X = new WeakReference<>(aVar);
        }

        public boolean a(boolean z) {
            return this.Y.cancel(z);
        }

        public boolean b(T t) {
            return this.Y.v(t);
        }

        public boolean c(Throwable th) {
            return this.Y.w(th);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            a<T> aVar = this.X.get();
            boolean cancel = this.Y.cancel(z);
            if (cancel && aVar != null) {
                aVar.b();
            }
            return cancel;
        }

        @Override // java.util.concurrent.Future
        public T get() throws InterruptedException, ExecutionException {
            return this.Y.get();
        }

        @Override // o.InterfaceFutureC8411o11
        public void h4(Runnable runnable, Executor executor) {
            this.Y.h4(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.Y.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.Y.isDone();
        }

        public String toString() {
            return this.Y.toString();
        }

        @Override // java.util.concurrent.Future
        public T get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return this.Y.get(j, timeUnit);
        }
    }

    public static <T> InterfaceFutureC8411o11<T> a(c<T> cVar) {
        a<T> aVar = new a<>();
        d<T> dVar = new d<>(aVar);
        aVar.b = dVar;
        aVar.a = cVar.getClass();
        try {
            Object a2 = cVar.a(aVar);
            if (a2 != null) {
                aVar.a = a2;
                return dVar;
            }
            return dVar;
        } catch (Exception e) {
            dVar.c(e);
            return dVar;
        }
    }
}
