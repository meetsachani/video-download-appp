package o;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.Lo2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3565Lo2 {
    public static final long a(Duration duration) {
        Duration duration2;
        int compareTo;
        ChronoUnit chronoUnit;
        Duration duration3;
        int compareTo2;
        long seconds;
        long millis;
        long seconds2;
        int nano;
        duration2 = Duration.ZERO;
        compareTo = duration.compareTo(duration2);
        if (compareTo > 0) {
            chronoUnit = ChronoUnit.MILLIS;
            duration3 = chronoUnit.getDuration();
            compareTo2 = duration.compareTo(duration3);
            if (compareTo2 > 0) {
                seconds = duration.getSeconds();
                if (seconds >= 9223372036854775L) {
                    seconds2 = duration.getSeconds();
                    if (seconds2 == 9223372036854775L) {
                        nano = duration.getNano();
                        if (nano >= 807000000) {
                            return Long.MAX_VALUE;
                        }
                    } else {
                        return Long.MAX_VALUE;
                    }
                }
                millis = duration.toMillis();
                return millis;
            }
            return 1L;
        }
        return 0L;
    }

    @InterfaceC9611sw0
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> b(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull Duration duration) {
        return C4467Uv0.a0(interfaceC3882Ov0, a(duration));
    }

    @Nullable
    public static final Object c(@NotNull Duration duration, @NotNull HM<? super C7458kA2> hm) {
        Object b = P10.b(a(duration), hm);
        if (b == C7289jT0.l()) {
            return b;
        }
        return C7458kA2.a;
    }

    public static final <R> void d(@NotNull XZ1<? super R> xz1, @NotNull Duration duration, @NotNull HA0<? super HM<? super R>, ? extends Object> ha0) {
        C8143mv1.a(xz1, a(duration), ha0);
    }

    @InterfaceC9611sw0
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> e(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull Duration duration) {
        return C4467Uv0.A1(interfaceC3882Ov0, a(duration));
    }

    @Nullable
    public static final <T> Object f(@NotNull Duration duration, @NotNull VA0<? super InterfaceC9974uQ, ? super HM<? super T>, ? extends Object> va0, @NotNull HM<? super T> hm) {
        return C9342rp2.c(a(duration), va0, hm);
    }

    @Nullable
    public static final <T> Object g(@NotNull Duration duration, @NotNull VA0<? super InterfaceC9974uQ, ? super HM<? super T>, ? extends Object> va0, @NotNull HM<? super T> hm) {
        return C9342rp2.e(a(duration), va0, hm);
    }
}
