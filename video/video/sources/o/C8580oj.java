package o;

import java.util.Set;
import o.AbstractC6822hY1;

/* renamed from: o.oj  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8580oj extends AbstractC6822hY1.b {
    public final long a;
    public final long b;
    public final Set<AbstractC6822hY1.c> c;

    /* renamed from: o.oj$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC6822hY1.b.a {
        public Long a;
        public Long b;
        public Set<AbstractC6822hY1.c> c;

        @Override // o.AbstractC6822hY1.b.a
        public AbstractC6822hY1.b a() {
            String str = "";
            if (this.a == null) {
                str = " delta";
            }
            if (this.b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C8580oj(this.a.longValue(), this.b.longValue(), this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // o.AbstractC6822hY1.b.a
        public AbstractC6822hY1.b.a b(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // o.AbstractC6822hY1.b.a
        public AbstractC6822hY1.b.a c(Set<AbstractC6822hY1.c> set) {
            if (set != null) {
                this.c = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        @Override // o.AbstractC6822hY1.b.a
        public AbstractC6822hY1.b.a d(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    @Override // o.AbstractC6822hY1.b
    public long b() {
        return this.a;
    }

    @Override // o.AbstractC6822hY1.b
    public Set<AbstractC6822hY1.c> c() {
        return this.c;
    }

    @Override // o.AbstractC6822hY1.b
    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6822hY1.b) {
            AbstractC6822hY1.b bVar = (AbstractC6822hY1.b) obj;
            if (this.a == bVar.b() && this.b == bVar.d() && this.c.equals(bVar.c())) {
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
        return "ConfigValue{delta=" + this.a + ", maxAllowedDelay=" + this.b + ", flags=" + this.c + "}";
    }

    public C8580oj(long j, long j2, Set<AbstractC6822hY1.c> set) {
        this.a = j;
        this.b = j2;
        this.c = set;
    }
}
