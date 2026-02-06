package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowSlot\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,746:1\n1#2:747\n*E\n"})
/* loaded from: classes4.dex */
public final class Y32 extends AbstractC6202f3<W32<?>> {
    @InterfaceC7058iW0
    public long a = -1;
    @InterfaceC7058iW0
    @Nullable
    public HM<? super C7458kA2> b;

    @Override // o.AbstractC6202f3
    /* renamed from: c */
    public boolean a(@NotNull W32<?> w32) {
        if (this.a >= 0) {
            return false;
        }
        this.a = w32.e0();
        return true;
    }

    @Override // o.AbstractC6202f3
    @NotNull
    /* renamed from: d */
    public HM<C7458kA2>[] b(@NotNull W32<?> w32) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return w32.d0(j);
    }
}
