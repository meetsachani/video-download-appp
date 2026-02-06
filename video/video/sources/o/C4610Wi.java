package o;

/* renamed from: o.Wi  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4610Wi extends AbstractC5238b41 {
    public final long b;

    public C4610Wi(long j) {
        this.b = j;
    }

    @Override // o.AbstractC5238b41
    public long c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC5238b41) && this.b == ((AbstractC5238b41) obj).c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.b;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.b + "}";
    }
}
