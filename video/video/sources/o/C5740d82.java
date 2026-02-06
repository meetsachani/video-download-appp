package o;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.C5740d82;

@InterfaceC5601ca0
@InterfaceC11149zF0
@InterfaceC4238Sm
/* renamed from: o.d82  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5740d82 implements InterfaceC3662Mo2 {
    public final ExecutorService a;

    /* renamed from: o.d82$a */
    /* loaded from: classes3.dex */
    public class a implements InvocationHandler {
        public final /* synthetic */ Object a;
        public final /* synthetic */ long b;
        public final /* synthetic */ TimeUnit c;
        public final /* synthetic */ Set d;

        public a(Object obj, long j, TimeUnit timeUnit, Set set) {
            this.a = obj;
            this.b = j;
            this.c = timeUnit;
            this.d = set;
        }

        public static /* synthetic */ Object a(Method method, Object obj, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (InvocationTargetException e) {
                throw C5740d82.n(e, false);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        @MB
        public Object invoke(Object obj, final Method method, @MB final Object[] objArr) throws Throwable {
            final Object obj2 = this.a;
            return C5740d82.this.h(new Callable() { // from class: o.c82
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C5740d82.a.a(method, obj2, objArr);
                }
            }, this.b, this.c, this.d.contains(method));
        }
    }

    public C5740d82(ExecutorService executorService) {
        this.a = (ExecutorService) C10664xF1.E(executorService);
    }

    public static void i(long j) {
        boolean z;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.p(z, "timeout must be positive: %s", j);
    }

    public static C5740d82 j(ExecutorService executorService) {
        return new C5740d82(executorService);
    }

    public static boolean k(Method method) {
        for (Class<?> cls : method.getExceptionTypes()) {
            if (cls == InterruptedException.class) {
                return true;
            }
        }
        return false;
    }

    public static Set<Method> l(Class<?> cls) {
        Method[] methods;
        HashSet u = C10856y22.u();
        for (Method method : cls.getMethods()) {
            if (k(method)) {
                u.add(method);
            }
        }
        return u;
    }

    public static <T> T m(Class<T> cls, InvocationHandler invocationHandler) {
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static Exception n(Exception exc, boolean z) throws Exception {
        Throwable cause = exc.getCause();
        if (cause != null) {
            if (z) {
                cause.setStackTrace((StackTraceElement[]) C5436bt1.f(cause.getStackTrace(), exc.getStackTrace(), StackTraceElement.class));
            }
            if (!(cause instanceof Exception)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw exc;
            }
            throw ((Exception) cause);
        }
        throw exc;
    }

    @Override // o.InterfaceC3662Mo2
    public void a(Runnable runnable, long j, TimeUnit timeUnit) throws TimeoutException, InterruptedException {
        C10664xF1.E(runnable);
        C10664xF1.E(timeUnit);
        i(j);
        Future<?> submit = this.a.submit(runnable);
        try {
            submit.get(j, timeUnit);
        } catch (InterruptedException e) {
            e = e;
            submit.cancel(true);
            throw e;
        } catch (ExecutionException e2) {
            p(e2.getCause());
            throw new AssertionError();
        } catch (TimeoutException e3) {
            e = e3;
            submit.cancel(true);
            throw e;
        }
    }

    @Override // o.InterfaceC3662Mo2
    public <T> T b(T t, Class<T> cls, long j, TimeUnit timeUnit) {
        C10664xF1.E(t);
        C10664xF1.E(cls);
        C10664xF1.E(timeUnit);
        i(j);
        C10664xF1.e(cls.isInterface(), "interfaceType must be an interface type");
        return (T) m(cls, new a(t, j, timeUnit, l(cls)));
    }

    @Override // o.InterfaceC3662Mo2
    public void c(Runnable runnable, long j, TimeUnit timeUnit) throws TimeoutException {
        C10664xF1.E(runnable);
        C10664xF1.E(timeUnit);
        i(j);
        Future<?> submit = this.a.submit(runnable);
        try {
            C5748dA2.g(submit, j, timeUnit);
        } catch (ExecutionException e) {
            p(e.getCause());
            throw new AssertionError();
        } catch (TimeoutException e2) {
            submit.cancel(true);
            throw e2;
        }
    }

    @Override // o.InterfaceC3662Mo2
    @InterfaceC6181ey
    public <T> T d(Callable<T> callable, long j, TimeUnit timeUnit) throws TimeoutException, ExecutionException {
        C10664xF1.E(callable);
        C10664xF1.E(timeUnit);
        i(j);
        Future<T> submit = this.a.submit(callable);
        try {
            return (T) C5748dA2.g(submit, j, timeUnit);
        } catch (ExecutionException e) {
            o(e.getCause());
            throw new AssertionError();
        } catch (TimeoutException e2) {
            submit.cancel(true);
            throw e2;
        }
    }

    @Override // o.InterfaceC3662Mo2
    @InterfaceC6181ey
    public <T> T e(Callable<T> callable, long j, TimeUnit timeUnit) throws TimeoutException, InterruptedException, ExecutionException {
        C10664xF1.E(callable);
        C10664xF1.E(timeUnit);
        i(j);
        Future<T> submit = this.a.submit(callable);
        try {
            return submit.get(j, timeUnit);
        } catch (InterruptedException e) {
            e = e;
            submit.cancel(true);
            throw e;
        } catch (ExecutionException e2) {
            o(e2.getCause());
            throw new AssertionError();
        } catch (TimeoutException e3) {
            e = e3;
            submit.cancel(true);
            throw e;
        }
    }

    public final <T> T h(Callable<T> callable, long j, TimeUnit timeUnit, boolean z) throws Exception {
        C10664xF1.E(callable);
        C10664xF1.E(timeUnit);
        i(j);
        Future<T> submit = this.a.submit(callable);
        try {
            if (z) {
                try {
                    return submit.get(j, timeUnit);
                } catch (InterruptedException e) {
                    submit.cancel(true);
                    throw e;
                }
            }
            return (T) C5748dA2.g(submit, j, timeUnit);
        } catch (ExecutionException e2) {
            throw n(e2, true);
        } catch (TimeoutException e3) {
            submit.cancel(true);
            throw new Gz2(e3);
        }
    }

    public final void o(Throwable th) throws ExecutionException {
        if (!(th instanceof Error)) {
            if (th instanceof RuntimeException) {
                throw new Gy2(th);
            }
            throw new ExecutionException(th);
        }
        throw new C5140ag0((Error) th);
    }

    public final void p(Throwable th) {
        if (th instanceof Error) {
            throw new C5140ag0((Error) th);
        }
        throw new Gy2(th);
    }
}
