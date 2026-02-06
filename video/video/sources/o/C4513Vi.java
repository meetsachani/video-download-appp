package o;

import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;
import o.AbstractC4995a41;

/* renamed from: o.Vi  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4513Vi extends AbstractC4995a41 {
    public final long a;
    public final long b;
    public final HD c;
    public final Integer d;
    public final String e;
    public final List<M31> f;
    public final YK1 g;

    /* renamed from: o.Vi$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC4995a41.a {
        public Long a;
        public Long b;
        public HD c;
        public Integer d;
        public String e;
        public List<M31> f;
        public YK1 g;

        @Override // o.AbstractC4995a41.a
        public AbstractC4995a41 a() {
            String str = "";
            if (this.a == null) {
                str = " requestTimeMs";
            }
            if (this.b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new C4513Vi(this.a.longValue(), this.b.longValue(), this.c, this.d, this.e, this.f, this.g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // o.AbstractC4995a41.a
        public AbstractC4995a41.a b(@InterfaceC11300zs1 HD hd) {
            this.c = hd;
            return this;
        }

        @Override // o.AbstractC4995a41.a
        public AbstractC4995a41.a c(@InterfaceC11300zs1 List<M31> list) {
            this.f = list;
            return this;
        }

        @Override // o.AbstractC4995a41.a
        public AbstractC4995a41.a d(@InterfaceC11300zs1 Integer num) {
            this.d = num;
            return this;
        }

        @Override // o.AbstractC4995a41.a
        public AbstractC4995a41.a e(@InterfaceC11300zs1 String str) {
            this.e = str;
            return this;
        }

        @Override // o.AbstractC4995a41.a
        public AbstractC4995a41.a f(@InterfaceC11300zs1 YK1 yk1) {
            this.g = yk1;
            return this;
        }

        @Override // o.AbstractC4995a41.a
        public AbstractC4995a41.a g(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // o.AbstractC4995a41.a
        public AbstractC4995a41.a h(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    @Override // o.AbstractC4995a41
    @InterfaceC11300zs1
    public HD b() {
        return this.c;
    }

    @Override // o.AbstractC4995a41
    @InterfaceC11300zs1
    @Encodable.Field(name = "logEvent")
    public List<M31> c() {
        return this.f;
    }

    @Override // o.AbstractC4995a41
    @InterfaceC11300zs1
    public Integer d() {
        return this.d;
    }

    @Override // o.AbstractC4995a41
    @InterfaceC11300zs1
    public String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        HD hd;
        Integer num;
        String str;
        List<M31> list;
        YK1 yk1;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4995a41) {
            AbstractC4995a41 abstractC4995a41 = (AbstractC4995a41) obj;
            if (this.a == abstractC4995a41.g() && this.b == abstractC4995a41.h() && ((hd = this.c) != null ? hd.equals(abstractC4995a41.b()) : abstractC4995a41.b() == null) && ((num = this.d) != null ? num.equals(abstractC4995a41.d()) : abstractC4995a41.d() == null) && ((str = this.e) != null ? str.equals(abstractC4995a41.e()) : abstractC4995a41.e() == null) && ((list = this.f) != null ? list.equals(abstractC4995a41.c()) : abstractC4995a41.c() == null) && ((yk1 = this.g) != null ? yk1.equals(abstractC4995a41.f()) : abstractC4995a41.f() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.AbstractC4995a41
    @InterfaceC11300zs1
    public YK1 f() {
        return this.g;
    }

    @Override // o.AbstractC4995a41
    public long g() {
        return this.a;
    }

    @Override // o.AbstractC4995a41
    public long h() {
        return this.b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        HD hd = this.c;
        int i2 = 0;
        if (hd == null) {
            hashCode = 0;
        } else {
            hashCode = hd.hashCode();
        }
        int i3 = (i ^ hashCode) * 1000003;
        Integer num = this.d;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i4 = (i3 ^ hashCode2) * 1000003;
        String str = this.e;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i5 = (i4 ^ hashCode3) * 1000003;
        List<M31> list = this.f;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int i6 = (i5 ^ hashCode4) * 1000003;
        YK1 yk1 = this.g;
        if (yk1 != null) {
            i2 = yk1.hashCode();
        }
        return i6 ^ i2;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + this.g + "}";
    }

    public C4513Vi(long j, long j2, @InterfaceC11300zs1 HD hd, @InterfaceC11300zs1 Integer num, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 List<M31> list, @InterfaceC11300zs1 YK1 yk1) {
        this.a = j;
        this.b = j2;
        this.c = hd;
        this.d = num;
        this.e = str;
        this.f = list;
        this.g = yk1;
    }
}
