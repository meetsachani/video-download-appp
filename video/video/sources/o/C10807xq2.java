package o;

/* renamed from: o.xq2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10807xq2 {
    public final long a;
    public final long b;
    public final int c;

    public C10807xq2(long j, long j2, int i) {
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final long a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    public final int c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10807xq2)) {
            return false;
        }
        C10807xq2 c10807xq2 = (C10807xq2) obj;
        if (this.a == c10807xq2.a && this.b == c10807xq2.b && this.c == c10807xq2.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((Long.hashCode(this.a) * 31) + Long.hashCode(this.b)) * 31) + Integer.hashCode(this.c);
    }

    public String toString() {
        return "Topic { " + ("TaxonomyVersion=" + this.a + ", ModelVersion=" + this.b + ", TopicCode=" + this.c + " }");
    }
}
