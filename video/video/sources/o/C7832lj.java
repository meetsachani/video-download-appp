package o;

/* renamed from: o.lj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7832lj extends AbstractC10461wP1 {
    public final long a;
    public final long b;
    public final AbstractC3142Hh c;

    public C7832lj(long j, long j2, AbstractC3142Hh abstractC3142Hh) {
        this.a = j;
        this.b = j2;
        if (abstractC3142Hh != null) {
            this.c = abstractC3142Hh;
            return;
        }
        throw new NullPointerException("Null audioStats");
    }

    @Override // o.AbstractC10461wP1
    public AbstractC3142Hh a() {
        return this.c;
    }

    @Override // o.AbstractC10461wP1
    public long b() {
        return this.b;
    }

    @Override // o.AbstractC10461wP1
    public long c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC10461wP1) {
            AbstractC10461wP1 abstractC10461wP1 = (AbstractC10461wP1) obj;
            if (this.a == abstractC10461wP1.c() && this.b == abstractC10461wP1.b() && this.c.equals(abstractC10461wP1.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "RecordingStats{recordedDurationNanos=" + this.a + ", numBytesRecorded=" + this.b + ", audioStats=" + this.c + "}";
    }
}
