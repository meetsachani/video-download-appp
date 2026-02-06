package o;

import java.util.concurrent.CancellationException;

@InterfaceC8303na2({"SMAP\nCancellationException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellationException.kt\nkotlin/coroutines/cancellation/CancellationExceptionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
/* renamed from: o.vy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10350vy {
    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final CancellationException a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static final CancellationException b(Throwable th) {
        String str;
        if (th != null) {
            str = th.toString();
        } else {
            str = null;
        }
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @InterfaceC6480g82(version = "1.4")
    public static /* synthetic */ void c() {
    }
}
