package o;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: o.wJ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10435wJ {

    /* renamed from: o.wJ$a */
    /* loaded from: classes4.dex */
    public static final class a<T> implements Future<T> {
        public final T X;

        public a(T t) {
            this.X = t;
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            return false;
        }

        @Override // java.util.concurrent.Future
        public T get() {
            return this.X;
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return false;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public T get(long j, TimeUnit timeUnit) {
            return this.X;
        }
    }

    public static Throwable a(Throwable th) {
        boolean z;
        if (th != null && !(th instanceof RuntimeException) && !(th instanceof Error)) {
            z = true;
        } else {
            z = false;
        }
        C11147zE2.B(z, "Not a checked exception: " + th, new Object[0]);
        return th;
    }

    public static <T> Future<T> b(T t) {
        return new a(t);
    }

    public static <K, V> V c(ConcurrentMap<K, V> concurrentMap, K k, InterfaceC9217rJ<V> interfaceC9217rJ) throws C8725pJ {
        if (concurrentMap != null && interfaceC9217rJ != null) {
            V v = concurrentMap.get(k);
            if (v == null) {
                return (V) k(concurrentMap, k, interfaceC9217rJ.get());
            }
            return v;
        }
        return null;
    }

    public static <K, V> V d(ConcurrentMap<K, V> concurrentMap, K k, InterfaceC9217rJ<V> interfaceC9217rJ) {
        try {
            return (V) c(concurrentMap, k, interfaceC9217rJ);
        } catch (C8725pJ e) {
            throw new C10189vJ(e.getCause());
        }
    }

    public static C8725pJ e(ExecutionException executionException) {
        if (executionException != null && executionException.getCause() != null) {
            l(executionException);
            return new C8725pJ(executionException.getMessage(), executionException.getCause());
        }
        return null;
    }

    public static C10189vJ f(ExecutionException executionException) {
        if (executionException != null && executionException.getCause() != null) {
            l(executionException);
            return new C10189vJ(executionException.getMessage(), executionException.getCause());
        }
        return null;
    }

    public static void g(ExecutionException executionException) throws C8725pJ {
        C8725pJ e = e(executionException);
        if (e == null) {
            return;
        }
        throw e;
    }

    public static void h(ExecutionException executionException) {
        C10189vJ f = f(executionException);
        if (f == null) {
            return;
        }
        throw f;
    }

    public static <T> T i(InterfaceC9217rJ<T> interfaceC9217rJ) throws C8725pJ {
        if (interfaceC9217rJ != null) {
            return interfaceC9217rJ.get();
        }
        return null;
    }

    public static <T> T j(InterfaceC9217rJ<T> interfaceC9217rJ) {
        try {
            return (T) i(interfaceC9217rJ);
        } catch (C8725pJ e) {
            throw new C10189vJ(e.getCause());
        }
    }

    public static <K, V> V k(ConcurrentMap<K, V> concurrentMap, K k, V v) {
        if (concurrentMap == null) {
            return null;
        }
        V putIfAbsent = concurrentMap.putIfAbsent(k, v);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        return v;
    }

    public static void l(ExecutionException executionException) {
        if (!(executionException.getCause() instanceof RuntimeException)) {
            if (!(executionException.getCause() instanceof Error)) {
                return;
            }
            throw ((Error) executionException.getCause());
        }
        throw ((RuntimeException) executionException.getCause());
    }
}
