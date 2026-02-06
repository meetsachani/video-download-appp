package o;

import o.InterfaceC7677l42;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.m42  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7920m42 {
    @NotNull
    public static final InterfaceC7677l42 a(@NotNull InterfaceC7677l42.a aVar, long j, long j2) {
        return new C6837hc2(Y70.A(j), Y70.A(j2));
    }

    public static /* synthetic */ InterfaceC7677l42 b(InterfaceC7677l42.a aVar, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Y70.Y.T();
        }
        if ((i & 2) != 0) {
            j2 = Y70.Y.n();
        }
        return a(aVar, j, j2);
    }
}
