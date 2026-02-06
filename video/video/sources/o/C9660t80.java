package o;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: o.t80  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9660t80 {
    public static final QN1<Long> a = QN1.a(C3482Ks1.u, C3482Ks1.t);

    /* renamed from: o.t80$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static <T extends Throwable> void a(InterfaceC4619Wk0<Long, Integer, T> interfaceC4619Wk0, Duration duration) throws Throwable {
        long millis;
        if (interfaceC4619Wk0 != null && duration != null) {
            millis = duration.toMillis();
            interfaceC4619Wk0.accept(Long.valueOf(millis), Integer.valueOf(b(duration)));
        }
    }

    public static int b(Duration duration) {
        int nano;
        nano = duration.getNano();
        return nano % 1000000;
    }

    public static boolean c(Duration duration) {
        boolean isNegative;
        boolean isZero;
        isNegative = duration.isNegative();
        if (!isNegative) {
            isZero = duration.isZero();
            if (!isZero) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static ChronoUnit d(TimeUnit timeUnit) {
        ChronoUnit chronoUnit;
        ChronoUnit chronoUnit2;
        ChronoUnit chronoUnit3;
        ChronoUnit chronoUnit4;
        ChronoUnit chronoUnit5;
        ChronoUnit chronoUnit6;
        ChronoUnit chronoUnit7;
        int[] iArr = a.a;
        Objects.requireNonNull(timeUnit);
        switch (iArr[timeUnit.ordinal()]) {
            case 1:
                chronoUnit = ChronoUnit.NANOS;
                return chronoUnit;
            case 2:
                chronoUnit2 = ChronoUnit.MICROS;
                return chronoUnit2;
            case 3:
                chronoUnit3 = ChronoUnit.MILLIS;
                return chronoUnit3;
            case 4:
                chronoUnit4 = ChronoUnit.SECONDS;
                return chronoUnit4;
            case 5:
                chronoUnit5 = ChronoUnit.MINUTES;
                return chronoUnit5;
            case 6:
                chronoUnit6 = ChronoUnit.HOURS;
                return chronoUnit6;
            case 7:
                chronoUnit7 = ChronoUnit.DAYS;
                return chronoUnit7;
            default:
                throw new IllegalArgumentException(timeUnit.toString());
        }
    }

    public static Duration e(long j, TimeUnit timeUnit) {
        Duration of;
        of = Duration.of(j, d(timeUnit));
        return of;
    }

    public static int f(Duration duration) {
        long millis;
        Objects.requireNonNull(duration, "duration");
        QN1<Long> qn1 = a;
        millis = duration.toMillis();
        return qn1.f(Long.valueOf(millis)).intValue();
    }

    public static Duration g(Duration duration) {
        Duration duration2;
        duration2 = Duration.ZERO;
        return C9470sL1.a(C11304zt1.t(duration, duration2));
    }
}
