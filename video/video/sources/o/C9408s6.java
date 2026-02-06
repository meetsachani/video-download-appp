package o;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.s6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9408s6<E> extends C7212jA<E> implements InterfaceC9894u6<E> {
    public C9408s6(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull InterfaceC6728hA<E> interfaceC6728hA, boolean z) {
        super(interfaceC5809dQ, interfaceC6728hA, false, z);
        b1((RU0) interfaceC5809dQ.f(RU0.W));
    }

    @Override // o.C6812hV0
    public boolean Z0(@NotNull Throwable th) {
        C8753pQ.b(getContext(), th);
        return true;
    }

    @Override // o.C6812hV0
    public void t1(@Nullable Throwable th) {
        InterfaceC6728hA<E> T1 = T1();
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                cancellationException = C3722Nf0.a(NV.a(this) + " was cancelled", th);
            }
        }
        T1.i(cancellationException);
    }
}
