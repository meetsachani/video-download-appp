package o;

import java.util.zip.Deflater;
import org.jetbrains.annotations.NotNull;

@InterfaceC8046mW0(name = "-DeflaterSinkExtensions")
/* renamed from: o.d  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5704d {
    @NotNull
    public static final N10 a(@NotNull J82 j82, @NotNull Deflater deflater) {
        C6562gT0.p(j82, "<this>");
        C6562gT0.p(deflater, "deflater");
        return new N10(j82, deflater);
    }

    public static /* synthetic */ N10 b(J82 j82, Deflater deflater, int i, Object obj) {
        if ((i & 1) != 0) {
            deflater = new Deflater();
        }
        C6562gT0.p(j82, "<this>");
        C6562gT0.p(deflater, "deflater");
        return new N10(j82, deflater);
    }
}
