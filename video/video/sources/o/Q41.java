package o;

/* loaded from: classes.dex */
public final class Q41 {
    public final long a;
    public final long b;

    public Q41(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final long a() {
        return c();
    }

    public final long b() {
        return d();
    }

    public final long c() {
        return this.a;
    }

    public final long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Q41)) {
            return false;
        }
        Q41 q41 = (Q41) obj;
        if (q41.a != this.a || q41.b != this.b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Long.hashCode(this.a) ^ Long.hashCode(this.b);
    }

    public String toString() {
        return '(' + this.a + C6566gU0.h + this.b + ')';
    }
}
