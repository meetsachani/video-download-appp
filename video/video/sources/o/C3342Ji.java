package o;

import java.util.Map;
import o.AbstractC3033Ge0;

/* renamed from: o.Ji  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3342Ji extends AbstractC3033Ge0 {
    public final String a;
    public final Integer b;
    public final C10988yb0 c;
    public final long d;
    public final long e;
    public final Map<String, String> f;

    /* renamed from: o.Ji$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC3033Ge0.a {
        public String a;
        public Integer b;
        public C10988yb0 c;
        public Long d;
        public Long e;
        public Map<String, String> f;

        @Override // o.AbstractC3033Ge0.a
        public AbstractC3033Ge0 d() {
            String str = "";
            if (this.a == null) {
                str = " transportName";
            }
            if (this.c == null) {
                str = str + " encodedPayload";
            }
            if (this.d == null) {
                str = str + " eventMillis";
            }
            if (this.e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C3342Ji(this.a, this.b, this.c, this.d.longValue(), this.e.longValue(), this.f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // o.AbstractC3033Ge0.a
        public Map<String, String> e() {
            Map<String, String> map = this.f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // o.AbstractC3033Ge0.a
        public AbstractC3033Ge0.a f(Map<String, String> map) {
            if (map != null) {
                this.f = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        @Override // o.AbstractC3033Ge0.a
        public AbstractC3033Ge0.a g(Integer num) {
            this.b = num;
            return this;
        }

        @Override // o.AbstractC3033Ge0.a
        public AbstractC3033Ge0.a h(C10988yb0 c10988yb0) {
            if (c10988yb0 != null) {
                this.c = c10988yb0;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        @Override // o.AbstractC3033Ge0.a
        public AbstractC3033Ge0.a i(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // o.AbstractC3033Ge0.a
        public AbstractC3033Ge0.a j(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        @Override // o.AbstractC3033Ge0.a
        public AbstractC3033Ge0.a k(long j) {
            this.e = Long.valueOf(j);
            return this;
        }
    }

    @Override // o.AbstractC3033Ge0
    public Map<String, String> c() {
        return this.f;
    }

    @Override // o.AbstractC3033Ge0
    @InterfaceC11300zs1
    public Integer d() {
        return this.b;
    }

    @Override // o.AbstractC3033Ge0
    public C10988yb0 e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3033Ge0) {
            AbstractC3033Ge0 abstractC3033Ge0 = (AbstractC3033Ge0) obj;
            if (this.a.equals(abstractC3033Ge0.l()) && ((num = this.b) != null ? num.equals(abstractC3033Ge0.d()) : abstractC3033Ge0.d() == null) && this.c.equals(abstractC3033Ge0.e()) && this.d == abstractC3033Ge0.f() && this.e == abstractC3033Ge0.m() && this.f.equals(abstractC3033Ge0.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // o.AbstractC3033Ge0
    public long f() {
        return this.d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j = this.d;
        long j2 = this.e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f.hashCode();
    }

    @Override // o.AbstractC3033Ge0
    public String l() {
        return this.a;
    }

    @Override // o.AbstractC3033Ge0
    public long m() {
        return this.e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + "}";
    }

    public C3342Ji(String str, @InterfaceC11300zs1 Integer num, C10988yb0 c10988yb0, long j, long j2, Map<String, String> map) {
        this.a = str;
        this.b = num;
        this.c = c10988yb0;
        this.d = j;
        this.e = j2;
        this.f = map;
    }
}
