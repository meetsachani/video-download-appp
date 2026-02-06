package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.Qn2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4048Qn2 {
    @InterfaceC7058iW0
    @NotNull
    public final InterfaceC5809dQ a;
    @NotNull
    public final Object[] b;
    @NotNull
    public final InterfaceC9577sn2<Object>[] c;
    public int d;

    public C4048Qn2(@NotNull InterfaceC5809dQ interfaceC5809dQ, int i) {
        this.a = interfaceC5809dQ;
        this.b = new Object[i];
        this.c = new InterfaceC9577sn2[i];
    }

    public final void a(@NotNull InterfaceC9577sn2<?> interfaceC9577sn2, @Nullable Object obj) {
        Object[] objArr = this.b;
        int i = this.d;
        objArr[i] = obj;
        InterfaceC9577sn2<Object>[] interfaceC9577sn2Arr = this.c;
        this.d = i + 1;
        C6562gT0.n(interfaceC9577sn2, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        interfaceC9577sn2Arr[i] = interfaceC9577sn2;
    }

    public final void b(@NotNull InterfaceC5809dQ interfaceC5809dQ) {
        int length = this.c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            InterfaceC9577sn2<Object> interfaceC9577sn2 = this.c[length];
            C6562gT0.m(interfaceC9577sn2);
            interfaceC9577sn2.G(interfaceC5809dQ, this.b[length]);
            if (i >= 0) {
                length = i;
            } else {
                return;
            }
        }
    }
}
