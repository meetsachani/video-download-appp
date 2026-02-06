package o;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import o.InterfaceC2789Dt1;

/* renamed from: o.sK  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9464sK<T> implements InterfaceC2789Dt1<T> {
    public static final C9464sK<Object> b = new C9464sK<>(null);
    public static final String c = "ConstantObservable";
    public final InterfaceFutureC8411o11<T> a;

    public C9464sK(T t) {
        this.a = C7221jC0.h(t);
    }

    public static /* synthetic */ void e(C9464sK c9464sK, InterfaceC2789Dt1.a aVar) {
        c9464sK.getClass();
        try {
            aVar.a(c9464sK.a.get());
        } catch (InterruptedException | ExecutionException e) {
            aVar.onError(e);
        }
    }

    public static <U> InterfaceC2789Dt1<U> f(U u) {
        if (u == null) {
            return b;
        }
        return new C9464sK(u);
    }

    @Override // o.InterfaceC2789Dt1
    public InterfaceFutureC8411o11<T> a() {
        return this.a;
    }

    @Override // o.InterfaceC2789Dt1
    public void b(Executor executor, final InterfaceC2789Dt1.a<? super T> aVar) {
        this.a.h4(new Runnable() { // from class: o.rK
            @Override // java.lang.Runnable
            public final void run() {
                C9464sK.e(C9464sK.this, aVar);
            }
        }, executor);
    }

    @Override // o.InterfaceC2789Dt1
    public void d(InterfaceC2789Dt1.a<? super T> aVar) {
    }
}
