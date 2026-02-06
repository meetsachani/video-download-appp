package o;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: o.Wp0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4639Wp0 {
    public static final BigDecimal a = BigDecimal.valueOf(Long.MIN_VALUE);
    public static final BigDecimal b = BigDecimal.valueOf(Long.MAX_VALUE);
    public static final MathContext c = new MathContext(0, RoundingMode.FLOOR);
    public static final FileTime d;
    public static final long e = -116444736000000000L;
    public static final BigDecimal f;
    public static final long g;
    public static final BigDecimal h;
    public static final long i;
    public static final BigDecimal j;
    public static final long k = 100;
    public static final BigDecimal l;

    static {
        Instant instant;
        FileTime from;
        instant = Instant.EPOCH;
        from = FileTime.from(instant);
        d = from;
        f = BigDecimal.valueOf((long) e);
        long nanos = TimeUnit.SECONDS.toNanos(1L) / 100;
        g = nanos;
        h = BigDecimal.valueOf(nanos);
        long nanos2 = TimeUnit.MILLISECONDS.toNanos(1L) / 100;
        i = nanos2;
        j = BigDecimal.valueOf(nanos2);
        l = BigDecimal.valueOf(100L);
    }

    public static FileTime a(long j2) {
        FileTime from;
        from = FileTime.from(j2, TimeUnit.SECONDS);
        return from;
    }

    public static boolean b(long j2) {
        if (-2147483648L <= j2 && j2 <= 2147483647L) {
            return true;
        }
        return false;
    }

    public static boolean c(FileTime fileTime) {
        return b(w(fileTime));
    }

    public static FileTime d(FileTime fileTime, long j2) {
        Instant instant;
        Instant minusMillis;
        FileTime from;
        instant = fileTime.toInstant();
        minusMillis = instant.minusMillis(j2);
        from = FileTime.from(minusMillis);
        return from;
    }

    public static FileTime e(FileTime fileTime, long j2) {
        Instant instant;
        Instant minusNanos;
        FileTime from;
        instant = fileTime.toInstant();
        minusNanos = instant.minusNanos(j2);
        from = FileTime.from(minusNanos);
        return from;
    }

    public static FileTime f(FileTime fileTime, long j2) {
        Instant instant;
        Instant minusSeconds;
        FileTime from;
        instant = fileTime.toInstant();
        minusSeconds = instant.minusSeconds(j2);
        from = FileTime.from(minusSeconds);
        return from;
    }

    public static FileTime g() {
        Instant now;
        FileTime from;
        now = Instant.now();
        from = FileTime.from(now);
        return from;
    }

    public static Date h(long j2) {
        return i(BigDecimal.valueOf(j2));
    }

    public static Date i(BigDecimal bigDecimal) {
        long epochMilli;
        epochMilli = l(bigDecimal).toEpochMilli();
        return new Date(epochMilli);
    }

    public static FileTime j(long j2) {
        FileTime from;
        from = FileTime.from(k(j2));
        return from;
    }

    public static Instant k(long j2) {
        return l(BigDecimal.valueOf(j2));
    }

    public static Instant l(BigDecimal bigDecimal) {
        Instant ofEpochSecond;
        BigDecimal[] divideAndRemainder = bigDecimal.add(f).divideAndRemainder(h, c);
        ofEpochSecond = Instant.ofEpochSecond(divideAndRemainder[0].longValueExact(), divideAndRemainder[1].multiply(l).longValueExact());
        return ofEpochSecond;
    }

    public static FileTime m(FileTime fileTime, long j2) {
        Instant instant;
        Instant plusMillis;
        FileTime from;
        instant = fileTime.toInstant();
        plusMillis = instant.plusMillis(j2);
        from = FileTime.from(plusMillis);
        return from;
    }

    public static FileTime n(FileTime fileTime, long j2) {
        Instant instant;
        Instant plusNanos;
        FileTime from;
        instant = fileTime.toInstant();
        plusNanos = instant.plusNanos(j2);
        from = FileTime.from(plusNanos);
        return from;
    }

    public static FileTime o(FileTime fileTime, long j2) {
        Instant instant;
        Instant plusSeconds;
        FileTime from;
        instant = fileTime.toInstant();
        plusSeconds = instant.plusSeconds(j2);
        from = FileTime.from(plusSeconds);
        return from;
    }

    public static void p(Path path) throws IOException {
        Files.setLastModifiedTime(path, g());
    }

    public static Date q(FileTime fileTime) {
        long millis;
        if (fileTime != null) {
            millis = fileTime.toMillis();
            return new Date(millis);
        }
        return null;
    }

    public static FileTime r(Date date) {
        FileTime fromMillis;
        if (date != null) {
            fromMillis = FileTime.fromMillis(date.getTime());
            return fromMillis;
        }
        return null;
    }

    public static long s(long j2) {
        BigDecimal subtract = BigDecimal.valueOf(j2).multiply(j).subtract(f);
        if (subtract.compareTo(b) >= 0) {
            return Long.MAX_VALUE;
        }
        if (subtract.compareTo(a) <= 0) {
            return Long.MIN_VALUE;
        }
        return subtract.longValue();
    }

    public static long t(FileTime fileTime) {
        Instant instant;
        instant = fileTime.toInstant();
        return u(instant);
    }

    public static long u(Instant instant) {
        long epochSecond;
        int nano;
        epochSecond = instant.getEpochSecond();
        BigDecimal multiply = BigDecimal.valueOf(epochSecond).multiply(h);
        nano = instant.getNano();
        return multiply.add(BigDecimal.valueOf(nano / 100)).subtract(f).longValueExact();
    }

    public static long v(Date date) {
        return s(date.getTime());
    }

    public static long w(FileTime fileTime) {
        long j2;
        if (fileTime != null) {
            j2 = fileTime.to(TimeUnit.SECONDS);
            return j2;
        }
        return 0L;
    }
}
