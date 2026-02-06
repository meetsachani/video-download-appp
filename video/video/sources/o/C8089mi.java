package o;

import android.util.Range;
import o.AbstractC3044Gh;

/* renamed from: o.mi  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8089mi extends AbstractC3044Gh {
    public final Range<Integer> l;
    public final int m;
    public final int n;

    /* renamed from: o  reason: collision with root package name */
    public final Range<Integer> f807o;
    public final int p;

    /* renamed from: o.mi$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC3044Gh.a {
        public Range<Integer> a;
        public Integer b;
        public Integer c;
        public Range<Integer> d;
        public Integer e;

        @Override // o.AbstractC3044Gh.a
        public AbstractC3044Gh a() {
            String str = "";
            if (this.a == null) {
                str = " bitrate";
            }
            if (this.b == null) {
                str = str + " sourceFormat";
            }
            if (this.c == null) {
                str = str + " source";
            }
            if (this.d == null) {
                str = str + " sampleRate";
            }
            if (this.e == null) {
                str = str + " channelCount";
            }
            if (str.isEmpty()) {
                return new C8089mi(this.a, this.b.intValue(), this.c.intValue(), this.d, this.e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // o.AbstractC3044Gh.a
        public AbstractC3044Gh.a b(Range<Integer> range) {
            if (range != null) {
                this.a = range;
                return this;
            }
            throw new NullPointerException("Null bitrate");
        }

        @Override // o.AbstractC3044Gh.a
        public AbstractC3044Gh.a c(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        @Override // o.AbstractC3044Gh.a
        public AbstractC3044Gh.a d(Range<Integer> range) {
            if (range != null) {
                this.d = range;
                return this;
            }
            throw new NullPointerException("Null sampleRate");
        }

        @Override // o.AbstractC3044Gh.a
        public AbstractC3044Gh.a e(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // o.AbstractC3044Gh.a
        public AbstractC3044Gh.a f(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public b() {
        }

        public b(AbstractC3044Gh abstractC3044Gh) {
            this.a = abstractC3044Gh.b();
            this.b = Integer.valueOf(abstractC3044Gh.f());
            this.c = Integer.valueOf(abstractC3044Gh.e());
            this.d = abstractC3044Gh.d();
            this.e = Integer.valueOf(abstractC3044Gh.c());
        }
    }

    @Override // o.AbstractC3044Gh
    public Range<Integer> b() {
        return this.l;
    }

    @Override // o.AbstractC3044Gh
    public int c() {
        return this.p;
    }

    @Override // o.AbstractC3044Gh
    public Range<Integer> d() {
        return this.f807o;
    }

    @Override // o.AbstractC3044Gh
    public int e() {
        return this.n;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3044Gh) {
            AbstractC3044Gh abstractC3044Gh = (AbstractC3044Gh) obj;
            if (this.l.equals(abstractC3044Gh.b()) && this.m == abstractC3044Gh.f() && this.n == abstractC3044Gh.e() && this.f807o.equals(abstractC3044Gh.d()) && this.p == abstractC3044Gh.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // o.AbstractC3044Gh
    public int f() {
        return this.m;
    }

    @Override // o.AbstractC3044Gh
    public AbstractC3044Gh.a g() {
        return new b(this);
    }

    public int hashCode() {
        return ((((((((this.l.hashCode() ^ 1000003) * 1000003) ^ this.m) * 1000003) ^ this.n) * 1000003) ^ this.f807o.hashCode()) * 1000003) ^ this.p;
    }

    public String toString() {
        return "AudioSpec{bitrate=" + this.l + ", sourceFormat=" + this.m + ", source=" + this.n + ", sampleRate=" + this.f807o + ", channelCount=" + this.p + "}";
    }

    public C8089mi(Range<Integer> range, int i, int i2, Range<Integer> range2, int i3) {
        this.l = range;
        this.m = i;
        this.n = i2;
        this.f807o = range2;
        this.p = i3;
    }
}
