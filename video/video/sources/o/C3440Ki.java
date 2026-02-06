package o;

import o.AbstractC4304Te0;

/* renamed from: o.Ki  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3440Ki extends AbstractC4304Te0 {
    public final long g;
    public final int h;
    public final int i;
    public final long j;
    public final int k;

    /* renamed from: o.Ki$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC4304Te0.a {
        public Long a;
        public Integer b;
        public Integer c;
        public Long d;
        public Integer e;

        @Override // o.AbstractC4304Te0.a
        public AbstractC4304Te0 a() {
            String str = "";
            if (this.a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.b == null) {
                str = str + " loadBatchSize";
            }
            if (this.c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C3440Ki(this.a.longValue(), this.b.intValue(), this.c.intValue(), this.d.longValue(), this.e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // o.AbstractC4304Te0.a
        public AbstractC4304Te0.a b(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // o.AbstractC4304Te0.a
        public AbstractC4304Te0.a c(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // o.AbstractC4304Te0.a
        public AbstractC4304Te0.a d(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // o.AbstractC4304Te0.a
        public AbstractC4304Te0.a e(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        @Override // o.AbstractC4304Te0.a
        public AbstractC4304Te0.a f(long j) {
            this.a = Long.valueOf(j);
            return this;
        }
    }

    @Override // o.AbstractC4304Te0
    public int b() {
        return this.i;
    }

    @Override // o.AbstractC4304Te0
    public long c() {
        return this.j;
    }

    @Override // o.AbstractC4304Te0
    public int d() {
        return this.h;
    }

    @Override // o.AbstractC4304Te0
    public int e() {
        return this.k;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4304Te0) {
            AbstractC4304Te0 abstractC4304Te0 = (AbstractC4304Te0) obj;
            if (this.g == abstractC4304Te0.f() && this.h == abstractC4304Te0.d() && this.i == abstractC4304Te0.b() && this.j == abstractC4304Te0.c() && this.k == abstractC4304Te0.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // o.AbstractC4304Te0
    public long f() {
        return this.g;
    }

    public int hashCode() {
        long j = this.g;
        long j2 = this.j;
        return ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.k;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.g + ", loadBatchSize=" + this.h + ", criticalSectionEnterTimeoutMs=" + this.i + ", eventCleanUpAge=" + this.j + ", maxBlobByteSizePerRow=" + this.k + "}";
    }

    public C3440Ki(long j, int i, int i2, long j2, int i3) {
        this.g = j;
        this.h = i;
        this.i = i2;
        this.j = j2;
        this.k = i3;
    }
}
