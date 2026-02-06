package o;

import java.util.concurrent.Executor;

/* renamed from: o.Dt1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2789Dt1<T> {

    /* renamed from: o.Dt1$a */
    /* loaded from: classes.dex */
    public interface a<T> {
        void a(T t);

        void onError(Throwable th);
    }

    InterfaceFutureC8411o11<T> a();

    void b(Executor executor, a<? super T> aVar);

    void d(a<? super T> aVar);
}
