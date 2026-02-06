package o;

import java.util.Collection;
import java.util.ServiceLoader;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nCoroutineExceptionHandlerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandlerImpl.kt\nkotlinx/coroutines/internal/CoroutineExceptionHandlerImplKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
/* renamed from: o.nQ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8266nQ {
    @NotNull
    public static final Collection<InterfaceC8023mQ> a = C6695h12.G3(U02.j(ServiceLoader.load(InterfaceC8023mQ.class, InterfaceC8023mQ.class.getClassLoader()).iterator()));

    public static final void a(@NotNull InterfaceC8023mQ interfaceC8023mQ) {
        if (a.contains(interfaceC8023mQ)) {
            return;
        }
        throw new IllegalStateException("Exception handler was not found via a ServiceLoader");
    }

    @NotNull
    public static final Collection<InterfaceC8023mQ> b() {
        return a;
    }

    public static final void c(@NotNull Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
