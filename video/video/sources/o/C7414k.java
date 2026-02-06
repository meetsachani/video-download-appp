package o;

import java.util.zip.Inflater;
import org.jetbrains.annotations.NotNull;

@InterfaceC8046mW0(name = "-InflaterSourceExtensions")
/* renamed from: o.k  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7414k {
    @NotNull
    public static final AP0 a(@NotNull InterfaceC7072ia2 interfaceC7072ia2, @NotNull Inflater inflater) {
        C6562gT0.p(interfaceC7072ia2, "<this>");
        C6562gT0.p(inflater, "inflater");
        return new AP0(interfaceC7072ia2, inflater);
    }

    public static /* synthetic */ AP0 b(InterfaceC7072ia2 interfaceC7072ia2, Inflater inflater, int i, Object obj) {
        if ((i & 1) != 0) {
            inflater = new Inflater();
        }
        C6562gT0.p(interfaceC7072ia2, "<this>");
        C6562gT0.p(inflater, "inflater");
        return new AP0(interfaceC7072ia2, inflater);
    }
}
