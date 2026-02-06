package o;

import o.AbstractC8328nh;

/* renamed from: o.li  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7828li extends AbstractC8328nh {
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    /* renamed from: o.li$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC8328nh.a {
        public Integer a;
        public Integer b;
        public Integer c;
        public Integer d;

        @Override // o.AbstractC8328nh.a
        public AbstractC8328nh a() {
            String str = "";
            if (this.a == null) {
                str = " audioSource";
            }
            if (this.b == null) {
                str = str + " sampleRate";
            }
            if (this.c == null) {
                str = str + " channelCount";
            }
            if (this.d == null) {
                str = str + " audioFormat";
            }
            if (str.isEmpty()) {
                return new C7828li(this.a.intValue(), this.b.intValue(), this.c.intValue(), this.d.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // o.AbstractC8328nh.a
        public AbstractC8328nh.a c(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }

        @Override // o.AbstractC8328nh.a
        public AbstractC8328nh.a d(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        @Override // o.AbstractC8328nh.a
        public AbstractC8328nh.a e(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // o.AbstractC8328nh.a
        public AbstractC8328nh.a f(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public b() {
        }

        public b(AbstractC8328nh abstractC8328nh) {
            this.a = Integer.valueOf(abstractC8328nh.c());
            this.b = Integer.valueOf(abstractC8328nh.f());
            this.c = Integer.valueOf(abstractC8328nh.e());
            this.d = Integer.valueOf(abstractC8328nh.b());
        }
    }

    @Override // o.AbstractC8328nh
    public int b() {
        return this.e;
    }

    @Override // o.AbstractC8328nh
    public int c() {
        return this.b;
    }

    @Override // o.AbstractC8328nh
    public int e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8328nh) {
            AbstractC8328nh abstractC8328nh = (AbstractC8328nh) obj;
            if (this.b == abstractC8328nh.c() && this.c == abstractC8328nh.f() && this.d == abstractC8328nh.e() && this.e == abstractC8328nh.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // o.AbstractC8328nh
    public int f() {
        return this.c;
    }

    @Override // o.AbstractC8328nh
    public AbstractC8328nh.a g() {
        return new b(this);
    }

    public int hashCode() {
        return ((((((this.b ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e;
    }

    public String toString() {
        return "AudioSettings{audioSource=" + this.b + ", sampleRate=" + this.c + ", channelCount=" + this.d + ", audioFormat=" + this.e + "}";
    }

    public C7828li(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }
}
