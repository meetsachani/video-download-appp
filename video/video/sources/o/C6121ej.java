package o;

/* renamed from: o.ej  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6121ej extends MC1 {
    public final long a;
    public final Nt2 b;
    public final AbstractC3033Ge0 c;

    public C6121ej(long j, Nt2 nt2, AbstractC3033Ge0 abstractC3033Ge0) {
        this.a = j;
        if (nt2 != null) {
            this.b = nt2;
            if (abstractC3033Ge0 != null) {
                this.c = abstractC3033Ge0;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    @Override // o.MC1
    public AbstractC3033Ge0 b() {
        return this.c;
    }

    @Override // o.MC1
    public long c() {
        return this.a;
    }

    @Override // o.MC1
    public Nt2 d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MC1) {
            MC1 mc1 = (MC1) obj;
            if (this.a == mc1.c() && this.b.equals(mc1.d()) && this.c.equals(mc1.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
