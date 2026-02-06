package o;

import o.InterfaceC8023mQ;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.pQ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8753pQ {

    /* renamed from: o.pQ$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC9627t0 implements InterfaceC8023mQ {
        public final /* synthetic */ VA0<InterfaceC5809dQ, Throwable, C7458kA2> Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(VA0<? super InterfaceC5809dQ, ? super Throwable, C7458kA2> va0, InterfaceC8023mQ.b bVar) {
            super(bVar);
            this.Y = va0;
        }

        @Override // o.InterfaceC8023mQ
        public void S(InterfaceC5809dQ interfaceC5809dQ, Throwable th) {
            this.Y.i(interfaceC5809dQ, th);
        }
    }

    @NotNull
    public static final InterfaceC8023mQ a(@NotNull VA0<? super InterfaceC5809dQ, ? super Throwable, C7458kA2> va0) {
        return new a(va0, InterfaceC8023mQ.z);
    }

    @InterfaceC10472wS0
    public static final void b(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull Throwable th) {
        try {
            InterfaceC8023mQ interfaceC8023mQ = (InterfaceC8023mQ) interfaceC5809dQ.f(InterfaceC8023mQ.z);
            if (interfaceC8023mQ != null) {
                interfaceC8023mQ.S(interfaceC5809dQ, th);
            } else {
                C8510oQ.a(interfaceC5809dQ, th);
            }
        } catch (Throwable th2) {
            C8510oQ.a(interfaceC5809dQ, c(th, th2));
        }
    }

    @NotNull
    public static final Throwable c(@NotNull Throwable th, @NotNull Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        C3917Pf0.a(runtimeException, th);
        return runtimeException;
    }
}
