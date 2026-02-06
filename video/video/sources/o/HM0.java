package o;

import java.util.Objects;

/* loaded from: classes.dex */
public class HM0 {
    public static final long c = -1;
    public static final long d = -1;
    public static final HM0 e = new HM0(-1, -1);
    public final long a;
    public final long b;

    public HM0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HM0)) {
            return false;
        }
        HM0 hm0 = (HM0) obj;
        if (this.a == hm0.a && this.b == hm0.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b));
    }

    public String toString() {
        return "captureLatencyMillis=" + this.a + ", processingLatencyMillis=" + this.b;
    }
}
