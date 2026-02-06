package o;

import java.io.InputStream;
import java.io.OutputStream;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.Ad2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2432Ad2 {
    @InterfaceC3147Hi0
    @InterfaceC6480g82(version = "1.8")
    @NotNull
    public static final InputStream a(@NotNull InputStream inputStream, @NotNull C4715Xk c4715Xk) {
        C6562gT0.p(inputStream, "<this>");
        C6562gT0.p(c4715Xk, "base64");
        return new YV(inputStream, c4715Xk);
    }

    @InterfaceC3147Hi0
    @InterfaceC6480g82(version = "1.8")
    @NotNull
    public static final OutputStream b(@NotNull OutputStream outputStream, @NotNull C4715Xk c4715Xk) {
        C6562gT0.p(outputStream, "<this>");
        C6562gT0.p(c4715Xk, "base64");
        return new C9527sb0(outputStream, c4715Xk);
    }
}
