package o;

import o.AbstractC2735Dg;

/* renamed from: o.ji  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7342ji extends AbstractC2735Dg {
    public final String b;
    public final int c;
    public final EnumC5905dp2 d;
    public final int e;
    public final int f;
    public final int g;

    /* renamed from: o.ji$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC2735Dg.a {
        public String a;
        public Integer b;
        public EnumC5905dp2 c;
        public Integer d;
        public Integer e;
        public Integer f;

        @Override // o.AbstractC2735Dg.a
        public AbstractC2735Dg a() {
            String str = "";
            if (this.a == null) {
                str = " mimeType";
            }
            if (this.b == null) {
                str = str + " profile";
            }
            if (this.c == null) {
                str = str + " inputTimebase";
            }
            if (this.d == null) {
                str = str + " bitrate";
            }
            if (this.e == null) {
                str = str + " sampleRate";
            }
            if (this.f == null) {
                str = str + " channelCount";
            }
            if (str.isEmpty()) {
                return new C7342ji(this.a, this.b.intValue(), this.c, this.d.intValue(), this.e.intValue(), this.f.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // o.AbstractC2735Dg.a
        public AbstractC2735Dg.a c(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }

        @Override // o.AbstractC2735Dg.a
        public AbstractC2735Dg.a d(int i) {
            this.f = Integer.valueOf(i);
            return this;
        }

        @Override // o.AbstractC2735Dg.a
        public AbstractC2735Dg.a e(EnumC5905dp2 enumC5905dp2) {
            if (enumC5905dp2 != null) {
                this.c = enumC5905dp2;
                return this;
            }
            throw new NullPointerException("Null inputTimebase");
        }

        @Override // o.AbstractC2735Dg.a
        public AbstractC2735Dg.a f(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null mimeType");
        }

        @Override // o.AbstractC2735Dg.a
        public AbstractC2735Dg.a g(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // o.AbstractC2735Dg.a
        public AbstractC2735Dg.a h(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }
    }

    @Override // o.AbstractC2735Dg, o.InterfaceC2923Fb0
    public String b() {
        return this.b;
    }

    @Override // o.AbstractC2735Dg, o.InterfaceC2923Fb0
    public EnumC5905dp2 c() {
        return this.d;
    }

    @Override // o.AbstractC2735Dg
    public int e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2735Dg) {
            AbstractC2735Dg abstractC2735Dg = (AbstractC2735Dg) obj;
            if (this.b.equals(abstractC2735Dg.b()) && this.c == abstractC2735Dg.getProfile() && this.d.equals(abstractC2735Dg.c()) && this.e == abstractC2735Dg.e() && this.f == abstractC2735Dg.g() && this.g == abstractC2735Dg.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // o.AbstractC2735Dg
    public int f() {
        return this.g;
    }

    @Override // o.AbstractC2735Dg
    public int g() {
        return this.f;
    }

    @Override // o.AbstractC2735Dg, o.InterfaceC2923Fb0
    public int getProfile() {
        return this.c;
    }

    public int hashCode() {
        return ((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g;
    }

    public String toString() {
        return "AudioEncoderConfig{mimeType=" + this.b + ", profile=" + this.c + ", inputTimebase=" + this.d + ", bitrate=" + this.e + ", sampleRate=" + this.f + ", channelCount=" + this.g + "}";
    }

    public C7342ji(String str, int i, EnumC5905dp2 enumC5905dp2, int i2, int i3, int i4) {
        this.b = str;
        this.c = i;
        this.d = enumC5905dp2;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }
}
