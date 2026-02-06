package o;

import o.InterfaceC5809dQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.mQ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC8023mQ extends InterfaceC5809dQ.b {
    @NotNull
    public static final b z = b.X;

    /* renamed from: o.mQ$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public static <R> R a(@NotNull InterfaceC8023mQ interfaceC8023mQ, R r, @NotNull VA0<? super R, ? super InterfaceC5809dQ.b, ? extends R> va0) {
            return (R) InterfaceC5809dQ.b.a.a(interfaceC8023mQ, r, va0);
        }

        @Nullable
        public static <E extends InterfaceC5809dQ.b> E b(@NotNull InterfaceC8023mQ interfaceC8023mQ, @NotNull InterfaceC5809dQ.c<E> cVar) {
            return (E) InterfaceC5809dQ.b.a.b(interfaceC8023mQ, cVar);
        }

        @NotNull
        public static InterfaceC5809dQ c(@NotNull InterfaceC8023mQ interfaceC8023mQ, @NotNull InterfaceC5809dQ.c<?> cVar) {
            return InterfaceC5809dQ.b.a.c(interfaceC8023mQ, cVar);
        }

        @NotNull
        public static InterfaceC5809dQ d(@NotNull InterfaceC8023mQ interfaceC8023mQ, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
            return InterfaceC5809dQ.b.a.d(interfaceC8023mQ, interfaceC5809dQ);
        }
    }

    /* renamed from: o.mQ$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC5809dQ.c<InterfaceC8023mQ> {
        public static final /* synthetic */ b X = new b();
    }

    void S(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull Throwable th);
}
