package o;

import java.util.List;
import org.jetbrains.annotations.NotNull;

@InterfaceC8046mW0(name = "TuplesKt")
/* renamed from: o.gv2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6670gv2 {
    @NotNull
    public static final <A, B> C4180Rx1<A, B> a(A a, B b) {
        return new C4180Rx1<>(a, b);
    }

    @NotNull
    public static final <T> List<T> b(@NotNull C4180Rx1<? extends T, ? extends T> c4180Rx1) {
        C6562gT0.p(c4180Rx1, "<this>");
        return C8222nF.O(c4180Rx1.e(), c4180Rx1.f());
    }

    @NotNull
    public static final <T> List<T> c(@NotNull Au2<? extends T, ? extends T, ? extends T> au2) {
        C6562gT0.p(au2, "<this>");
        return C8222nF.O(au2.f(), au2.g(), au2.h());
    }
}
