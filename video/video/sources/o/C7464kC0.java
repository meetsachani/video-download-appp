package o;

import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@InterfaceC5601ca0
@InterfaceC11149zF0
/* renamed from: o.kC0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7464kC0 {
    public static final AbstractC10587ww1<Constructor<?>> a = AbstractC10587ww1.z().D(new a()).E();

    /* renamed from: o.kC0$a */
    /* loaded from: classes3.dex */
    public class a implements YA0<Constructor<?>, Boolean> {
        @Override // o.YA0
        /* renamed from: a */
        public Boolean apply(Constructor<?> constructor) {
            return Boolean.valueOf(Arrays.asList(constructor.getParameterTypes()).contains(String.class));
        }
    }

    @InterfaceC5299bJ2
    /* renamed from: o.kC0$b */
    /* loaded from: classes3.dex */
    public interface b {
        void e(Class<? extends Exception> cls);
    }

    @InterfaceC5299bJ2
    /* renamed from: o.kC0$c */
    /* loaded from: classes3.dex */
    public static class c {
        public static final b a = a();

        /* renamed from: o.kC0$c$a */
        /* loaded from: classes3.dex */
        public enum a implements b {
            INSTANCE;
            
            public static final Set<WeakReference<Class<? extends Exception>>> Y = new CopyOnWriteArraySet();

            @Override // o.C7464kC0.b
            public void e(Class<? extends Exception> cls) {
                for (WeakReference<Class<? extends Exception>> weakReference : Y) {
                    if (cls.equals(weakReference.get())) {
                        return;
                    }
                }
                C7464kC0.b(cls);
                Set<WeakReference<Class<? extends Exception>>> set = Y;
                if (set.size() > 1000) {
                    set.clear();
                }
                set.add(new WeakReference<>(cls));
            }
        }

        public static b a() {
            return C7464kC0.k();
        }
    }

    public static b a() {
        return c.a;
    }

    @InterfaceC5299bJ2
    public static void b(Class<? extends Exception> cls) {
        C10664xF1.u(g(cls), "Futures.getChecked exception type (%s) must not be a RuntimeException", cls);
        C10664xF1.u(f(cls), "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable", cls);
    }

    @InterfaceC6181ey
    @InterfaceC7165iy1
    public static <V, X extends Exception> V c(Future<V> future, Class<X> cls) throws Exception {
        return (V) e(a(), future, cls);
    }

    @InterfaceC6181ey
    @InterfaceC7165iy1
    public static <V, X extends Exception> V d(Future<V> future, Class<X> cls, long j, TimeUnit timeUnit) throws Exception {
        a().e(cls);
        try {
            return future.get(j, timeUnit);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw i(cls, e);
        } catch (ExecutionException e2) {
            l(e2.getCause(), cls);
            throw new AssertionError();
        } catch (TimeoutException e3) {
            throw i(cls, e3);
        }
    }

    @InterfaceC6181ey
    @InterfaceC5299bJ2
    @InterfaceC7165iy1
    public static <V, X extends Exception> V e(b bVar, Future<V> future, Class<X> cls) throws Exception {
        bVar.e(cls);
        try {
            return future.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw i(cls, e);
        } catch (ExecutionException e2) {
            l(e2.getCause(), cls);
            throw new AssertionError();
        }
    }

    public static boolean f(Class<? extends Exception> cls) {
        try {
            i(cls, new Exception());
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @InterfaceC5299bJ2
    public static boolean g(Class<? extends Exception> cls) {
        return !RuntimeException.class.isAssignableFrom(cls);
    }

    @MB
    public static <X> X h(Constructor<X> constructor, Throwable th) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Object[] objArr = new Object[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; i++) {
            Class<?> cls = parameterTypes[i];
            if (cls.equals(String.class)) {
                objArr[i] = th.toString();
            } else if (!cls.equals(Throwable.class)) {
                return null;
            } else {
                objArr[i] = th;
            }
        }
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public static <X extends Exception> X i(Class<X> cls, Throwable th) {
        for (Constructor constructor : j(Arrays.asList(cls.getConstructors()))) {
            X x = (X) h(constructor, th);
            if (x != null) {
                if (x.getCause() == null) {
                    x.initCause(th);
                }
                return x;
            }
        }
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(valueOf.length() + 82);
        sb.append("No appropriate constructor for exception of type ");
        sb.append(valueOf);
        sb.append(" in response to chained exception");
        throw new IllegalArgumentException(sb.toString(), th);
    }

    public static <X extends Exception> List<Constructor<X>> j(List<Constructor<X>> list) {
        return (List<Constructor<X>>) a.F(list);
    }

    @InterfaceC5299bJ2
    public static b k() {
        return c.a.INSTANCE;
    }

    public static <X extends Exception> void l(Throwable th, Class<X> cls) throws Exception {
        if (!(th instanceof Error)) {
            if (th instanceof RuntimeException) {
                throw new Gy2(th);
            }
            throw i(cls, th);
        }
        throw new C5140ag0((Error) th);
    }
}
