package o;

import android.util.Range;
import o.QG2;

/* renamed from: o.Hj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3150Hj extends QG2 {
    public final C6276fL1 d;
    public final Range<Integer> e;
    public final Range<Integer> f;
    public final int g;

    /* renamed from: o.Hj$b */
    /* loaded from: classes.dex */
    public static final class b extends QG2.a {
        public C6276fL1 a;
        public Range<Integer> b;
        public Range<Integer> c;
        public Integer d;

        @Override // o.QG2.a
        public QG2 a() {
            String str = "";
            if (this.a == null) {
                str = " qualitySelector";
            }
            if (this.b == null) {
                str = str + " frameRate";
            }
            if (this.c == null) {
                str = str + " bitrate";
            }
            if (this.d == null) {
                str = str + " aspectRatio";
            }
            if (str.isEmpty()) {
                return new C3150Hj(this.a, this.b, this.c, this.d.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // o.QG2.a
        public QG2.a b(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }

        @Override // o.QG2.a
        public QG2.a c(Range<Integer> range) {
            if (range != null) {
                this.c = range;
                return this;
            }
            throw new NullPointerException("Null bitrate");
        }

        @Override // o.QG2.a
        public QG2.a d(Range<Integer> range) {
            if (range != null) {
                this.b = range;
                return this;
            }
            throw new NullPointerException("Null frameRate");
        }

        @Override // o.QG2.a
        public QG2.a e(C6276fL1 c6276fL1) {
            if (c6276fL1 != null) {
                this.a = c6276fL1;
                return this;
            }
            throw new NullPointerException("Null qualitySelector");
        }

        public b() {
        }

        public b(QG2 qg2) {
            this.a = qg2.e();
            this.b = qg2.d();
            this.c = qg2.c();
            this.d = Integer.valueOf(qg2.b());
        }
    }

    @Override // o.QG2
    public int b() {
        return this.g;
    }

    @Override // o.QG2
    public Range<Integer> c() {
        return this.f;
    }

    @Override // o.QG2
    public Range<Integer> d() {
        return this.e;
    }

    @Override // o.QG2
    public C6276fL1 e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof QG2) {
            QG2 qg2 = (QG2) obj;
            if (this.d.equals(qg2.e()) && this.e.equals(qg2.d()) && this.f.equals(qg2.c()) && this.g == qg2.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // o.QG2
    public QG2.a f() {
        return new b(this);
    }

    public int hashCode() {
        return ((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g;
    }

    public String toString() {
        return "VideoSpec{qualitySelector=" + this.d + ", frameRate=" + this.e + ", bitrate=" + this.f + ", aspectRatio=" + this.g + "}";
    }

    public C3150Hj(C6276fL1 c6276fL1, Range<Integer> range, Range<Integer> range2, int i) {
        this.d = c6276fL1;
        this.e = range;
        this.f = range2;
        this.g = i;
    }
}
