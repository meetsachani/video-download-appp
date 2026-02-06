package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.mh2 */
/* loaded from: classes3.dex */
public final class C8088mh2 {
    @NotNull
    public static final MH a(@Nullable RU0 ru0) {
        return new C7827lh2(ru0);
    }

    public static /* synthetic */ MH c(RU0 ru0, int i, Object obj) {
        if ((i & 1) != 0) {
            ru0 = null;
        }
        return a(ru0);
    }

    public static /* synthetic */ RU0 d(RU0 ru0, int i, Object obj) {
        if ((i & 1) != 0) {
            ru0 = null;
        }
        return a(ru0);
    }

    @Nullable
    public static final <R> Object e(@NotNull VA0<? super InterfaceC9974uQ, ? super HM<? super R>, ? extends Object> va0, @NotNull HM<? super R> hm) {
        C7584kh2 c7584kh2 = new C7584kh2(hm.getContext(), hm);
        Object b = Rz2.b(c7584kh2, c7584kh2, va0);
        if (b == C7289jT0.l()) {
            MV.c(hm);
        }
        return b;
    }
}
