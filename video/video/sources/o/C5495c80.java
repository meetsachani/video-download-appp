package o;

import java.time.Duration;

@InterfaceC8046mW0(name = "DurationConversionsJDK8Kt")
@InterfaceC8303na2({"SMAP\nDurationConversions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurationConversions.kt\nkotlin/time/jdk8/DurationConversionsJDK8Kt\n+ 2 Duration.kt\nkotlin/time/Duration\n*L\n1#1,35:1\n549#2:36\n*S KotlinDebug\n*F\n+ 1 DurationConversions.kt\nkotlin/time/jdk8/DurationConversionsJDK8Kt\n*L\n35#1:36\n*E\n"})
/* renamed from: o.c80  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5495c80 {
    @XP0
    @InterfaceC6480g82(version = "1.6")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5395bj0.class})
    public static final Duration a(long j) {
        Duration ofSeconds;
        ofSeconds = Duration.ofSeconds(Y70.D(j), Y70.H(j));
        C6562gT0.o(ofSeconds, "toComponents-impl(...)");
        return ofSeconds;
    }

    @XP0
    @InterfaceC6480g82(version = "1.6")
    @InterfaceC10924yJ2(markerClass = {InterfaceC5395bj0.class})
    public static final long b(Duration duration) {
        long seconds;
        int nano;
        C6562gT0.p(duration, "<this>");
        seconds = duration.getSeconds();
        long x = C6223f80.x(seconds, EnumC6964i80.Z0);
        nano = duration.getNano();
        return Y70.V(x, C6223f80.w(nano, EnumC6964i80.Y));
    }
}
