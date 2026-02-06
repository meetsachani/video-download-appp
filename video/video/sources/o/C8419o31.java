package o;

import org.jetbrains.annotations.NotNull;

/* renamed from: o.o31  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8419o31 extends C8906q31 {
    public final void D(@NotNull HA0<? super C8906q31, C7458kA2> ha0) {
        Object l = l();
        C6562gT0.n(l, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        for (C8906q31 c8906q31 = (C8906q31) l; !C6562gT0.g(c8906q31, this); c8906q31 = c8906q31.m()) {
            ha0.invoke(c8906q31);
        }
    }

    @NotNull
    public final Void E() {
        throw new IllegalStateException("head cannot be removed");
    }

    @Override // o.C8906q31
    public boolean u() {
        return false;
    }

    @Override // o.C8906q31
    public /* bridge */ /* synthetic */ boolean w() {
        return ((Boolean) E()).booleanValue();
    }
}
