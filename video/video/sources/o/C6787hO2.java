package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.hO2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6787hO2 {
    @Nullable
    public static final Object a(@NotNull HM<? super C7458kA2> hm) {
        C7189j40 c7189j40;
        Object obj;
        InterfaceC5809dQ context = hm.getContext();
        C5829dV0.y(context);
        HM e = C7048iT0.e(hm);
        if (e instanceof C7189j40) {
            c7189j40 = (C7189j40) e;
        } else {
            c7189j40 = null;
        }
        if (c7189j40 == null) {
            obj = C7458kA2.a;
        } else {
            if (c7189j40.Y0.U(context)) {
                c7189j40.n(context, C7458kA2.a);
            } else {
                C6544gO2 c6544gO2 = new C6544gO2();
                InterfaceC5809dQ M = context.M(c6544gO2);
                C7458kA2 c7458kA2 = C7458kA2.a;
                c7189j40.n(M, c7458kA2);
                if (c6544gO2.Y) {
                    if (C7432k40.e(c7189j40)) {
                        obj = C7289jT0.l();
                    } else {
                        obj = c7458kA2;
                    }
                }
            }
            obj = C7289jT0.l();
        }
        if (obj == C7289jT0.l()) {
            MV.c(hm);
        }
        if (obj == C7289jT0.l()) {
            return obj;
        }
        return C7458kA2.a;
    }
}
