package o;

import o.PT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/ResumeAwaitOnCompletion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1583:1\n1#2:1584\n*E\n"})
/* renamed from: o.fU1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6312fU1<T> extends AbstractC6569gV0 {
    @NotNull
    public final C8883py<T> Z0;

    /* JADX WARN: Multi-variable type inference failed */
    public C6312fU1(@NotNull C8883py<? super T> c8883py) {
        this.Z0 = c8883py;
    }

    @Override // o.AbstractC6569gV0
    public boolean E() {
        return false;
    }

    @Override // o.AbstractC6569gV0
    public void F(@Nullable Throwable th) {
        Object U0 = D().U0();
        if (U0 instanceof QH) {
            C8883py<T> c8883py = this.Z0;
            PT1.a aVar = PT1.Y;
            c8883py.q(PT1.b(RT1.a(((QH) U0).a)));
            return;
        }
        C8883py<T> c8883py2 = this.Z0;
        PT1.a aVar2 = PT1.Y;
        c8883py2.q(PT1.b(C7055iV0.h(U0)));
    }
}
