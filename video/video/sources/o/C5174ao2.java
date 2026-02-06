package o;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.TemporalAmount;

/* renamed from: o.ao2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5174ao2 {
    public static int a(Duration duration) {
        int nano;
        nano = duration.getNano();
        return nano % 1000000;
    }

    public static void b(Duration duration) throws InterruptedException {
        Instant now;
        Instant plus;
        long millis;
        Instant now2;
        boolean isNegative;
        long nanos;
        long millis2;
        Duration ofNanos;
        try {
            long nanoTime = System.nanoTime();
            nanos = duration.toNanos();
            long j = nanoTime + nanos;
            Duration duration2 = duration;
            while (true) {
                millis2 = duration2.toMillis();
                Thread.sleep(millis2, a(duration2));
                long nanoTime2 = System.nanoTime();
                ofNanos = Duration.ofNanos(j - nanoTime2);
                if (nanoTime2 - j < 0) {
                    duration2 = ofNanos;
                } else {
                    return;
                }
            }
        } catch (ArithmeticException unused) {
            now = Instant.now();
            plus = now.plus((TemporalAmount) duration);
            do {
                millis = duration.toMillis();
                Thread.sleep(millis, a(duration));
                now2 = Instant.now();
                duration = Duration.between(now2, plus);
                isNegative = duration.isNegative();
            } while (!isNegative);
        }
    }
}
