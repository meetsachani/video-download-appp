package o;

import java.time.Instant;
import o.C11193zQ0;
import org.jetbrains.annotations.NotNull;

@InterfaceC8046mW0(name = "InstantConversionsJDK8Kt")
/* loaded from: classes3.dex */
public final class DQ0 {
    @InterfaceC5395bj0
    @InterfaceC6480g82(version = "2.1")
    @NotNull
    public static final Instant a(@NotNull C11193zQ0 c11193zQ0) {
        Instant ofEpochSecond;
        C6562gT0.p(c11193zQ0, "<this>");
        ofEpochSecond = Instant.ofEpochSecond(c11193zQ0.i(), c11193zQ0.j());
        C6562gT0.o(ofEpochSecond, "ofEpochSecond(...)");
        return ofEpochSecond;
    }

    @InterfaceC5395bj0
    @InterfaceC6480g82(version = "2.1")
    @NotNull
    public static final C11193zQ0 b(@NotNull Instant instant) {
        long epochSecond;
        int nano;
        C6562gT0.p(instant, "<this>");
        C11193zQ0.a aVar = C11193zQ0.Z;
        epochSecond = instant.getEpochSecond();
        nano = instant.getNano();
        return aVar.b(epochSecond, nano);
    }
}
