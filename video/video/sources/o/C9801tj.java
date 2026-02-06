package o;

import android.util.Range;
import android.util.Size;
import o.AbstractC4008Qd2;

/* renamed from: o.tj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9801tj extends AbstractC4008Qd2 {
    public final Size b;
    public final N80 c;
    public final Range<Integer> d;
    public final HJ e;

    /* renamed from: o.tj$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC4008Qd2.a {
        public Size a;
        public N80 b;
        public Range<Integer> c;
        public HJ d;

        @Override // o.AbstractC4008Qd2.a
        public AbstractC4008Qd2 a() {
            String str = "";
            if (this.a == null) {
                str = " resolution";
            }
            if (this.b == null) {
                str = str + " dynamicRange";
            }
            if (this.c == null) {
                str = str + " expectedFrameRateRange";
            }
            if (str.isEmpty()) {
                return new C9801tj(this.a, this.b, this.c, this.d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // o.AbstractC4008Qd2.a
        public AbstractC4008Qd2.a b(N80 n80) {
            if (n80 != null) {
                this.b = n80;
                return this;
            }
            throw new NullPointerException("Null dynamicRange");
        }

        @Override // o.AbstractC4008Qd2.a
        public AbstractC4008Qd2.a c(Range<Integer> range) {
            if (range != null) {
                this.c = range;
                return this;
            }
            throw new NullPointerException("Null expectedFrameRateRange");
        }

        @Override // o.AbstractC4008Qd2.a
        public AbstractC4008Qd2.a d(HJ hj) {
            this.d = hj;
            return this;
        }

        @Override // o.AbstractC4008Qd2.a
        public AbstractC4008Qd2.a e(Size size) {
            if (size != null) {
                this.a = size;
                return this;
            }
            throw new NullPointerException("Null resolution");
        }

        public b() {
        }

        public b(AbstractC4008Qd2 abstractC4008Qd2) {
            this.a = abstractC4008Qd2.e();
            this.b = abstractC4008Qd2.b();
            this.c = abstractC4008Qd2.c();
            this.d = abstractC4008Qd2.d();
        }
    }

    @Override // o.AbstractC4008Qd2
    public N80 b() {
        return this.c;
    }

    @Override // o.AbstractC4008Qd2
    public Range<Integer> c() {
        return this.d;
    }

    @Override // o.AbstractC4008Qd2
    public HJ d() {
        return this.e;
    }

    @Override // o.AbstractC4008Qd2
    public Size e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        HJ hj;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4008Qd2) {
            AbstractC4008Qd2 abstractC4008Qd2 = (AbstractC4008Qd2) obj;
            if (this.b.equals(abstractC4008Qd2.e()) && this.c.equals(abstractC4008Qd2.b()) && this.d.equals(abstractC4008Qd2.c()) && ((hj = this.e) != null ? hj.equals(abstractC4008Qd2.d()) : abstractC4008Qd2.d() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.AbstractC4008Qd2
    public AbstractC4008Qd2.a f() {
        return new b(this);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        HJ hj = this.e;
        if (hj == null) {
            hashCode = 0;
        } else {
            hashCode = hj.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "StreamSpec{resolution=" + this.b + ", dynamicRange=" + this.c + ", expectedFrameRateRange=" + this.d + ", implementationOptions=" + this.e + "}";
    }

    public C9801tj(Size size, N80 n80, Range<Integer> range, HJ hj) {
        this.b = size;
        this.c = n80;
        this.d = range;
        this.e = hj;
    }
}
