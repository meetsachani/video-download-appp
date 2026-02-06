package o;

/* loaded from: classes.dex */
public final class RR1 {
    public final long a;
    public final L6 b;

    public RR1(long j, L6 l6) {
        C6562gT0.p(l6, "adSelectionConfig");
        this.a = j;
        this.b = l6;
    }

    public final L6 a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RR1)) {
            return false;
        }
        RR1 rr1 = (RR1) obj;
        if (this.a == rr1.a && C6562gT0.g(this.b, rr1.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Long.hashCode(this.a) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "ReportImpressionRequest: adSelectionId=" + this.a + ", adSelectionConfig=" + this.b;
    }
}
