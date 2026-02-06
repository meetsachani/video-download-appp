package o;

import android.util.Size;
import o.IF2;

/* renamed from: o.Ej  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2845Ej extends IF2 {
    public final String d;
    public final int e;
    public final EnumC5905dp2 f;
    public final Size g;
    public final int h;
    public final MF2 i;
    public final int j;
    public final int k;
    public final int l;

    /* renamed from: o.Ej$b */
    /* loaded from: classes.dex */
    public static final class b extends IF2.a {
        public String a;
        public Integer b;
        public EnumC5905dp2 c;
        public Size d;
        public Integer e;
        public MF2 f;
        public Integer g;
        public Integer h;
        public Integer i;

        @Override // o.IF2.a
        public IF2 a() {
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
                str = str + " resolution";
            }
            if (this.e == null) {
                str = str + " colorFormat";
            }
            if (this.f == null) {
                str = str + " dataSpace";
            }
            if (this.g == null) {
                str = str + " frameRate";
            }
            if (this.h == null) {
                str = str + " IFrameInterval";
            }
            if (this.i == null) {
                str = str + " bitrate";
            }
            if (str.isEmpty()) {
                return new C2845Ej(this.a, this.b.intValue(), this.c, this.d, this.e.intValue(), this.f, this.g.intValue(), this.h.intValue(), this.i.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // o.IF2.a
        public IF2.a b(int i) {
            this.i = Integer.valueOf(i);
            return this;
        }

        @Override // o.IF2.a
        public IF2.a c(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        @Override // o.IF2.a
        public IF2.a d(MF2 mf2) {
            if (mf2 != null) {
                this.f = mf2;
                return this;
            }
            throw new NullPointerException("Null dataSpace");
        }

        @Override // o.IF2.a
        public IF2.a e(int i) {
            this.g = Integer.valueOf(i);
            return this;
        }

        @Override // o.IF2.a
        public IF2.a f(int i) {
            this.h = Integer.valueOf(i);
            return this;
        }

        @Override // o.IF2.a
        public IF2.a g(EnumC5905dp2 enumC5905dp2) {
            if (enumC5905dp2 != null) {
                this.c = enumC5905dp2;
                return this;
            }
            throw new NullPointerException("Null inputTimebase");
        }

        @Override // o.IF2.a
        public IF2.a h(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null mimeType");
        }

        @Override // o.IF2.a
        public IF2.a i(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // o.IF2.a
        public IF2.a j(Size size) {
            if (size != null) {
                this.d = size;
                return this;
            }
            throw new NullPointerException("Null resolution");
        }
    }

    @Override // o.IF2, o.InterfaceC2923Fb0
    public String b() {
        return this.d;
    }

    @Override // o.IF2, o.InterfaceC2923Fb0
    public EnumC5905dp2 c() {
        return this.f;
    }

    @Override // o.IF2
    public int e() {
        return this.l;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IF2) {
            IF2 if2 = (IF2) obj;
            if (this.d.equals(if2.b()) && this.e == if2.getProfile() && this.f.equals(if2.c()) && this.g.equals(if2.j()) && this.h == if2.f() && this.i.equals(if2.g()) && this.j == if2.h() && this.k == if2.i() && this.l == if2.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // o.IF2
    public int f() {
        return this.h;
    }

    @Override // o.IF2
    public MF2 g() {
        return this.i;
    }

    @Override // o.IF2, o.InterfaceC2923Fb0
    public int getProfile() {
        return this.e;
    }

    @Override // o.IF2
    public int h() {
        return this.j;
    }

    public int hashCode() {
        return ((((((((((((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j) * 1000003) ^ this.k) * 1000003) ^ this.l;
    }

    @Override // o.IF2
    public int i() {
        return this.k;
    }

    @Override // o.IF2
    public Size j() {
        return this.g;
    }

    public String toString() {
        return "VideoEncoderConfig{mimeType=" + this.d + ", profile=" + this.e + ", inputTimebase=" + this.f + ", resolution=" + this.g + ", colorFormat=" + this.h + ", dataSpace=" + this.i + ", frameRate=" + this.j + ", IFrameInterval=" + this.k + ", bitrate=" + this.l + "}";
    }

    public C2845Ej(String str, int i, EnumC5905dp2 enumC5905dp2, Size size, int i2, MF2 mf2, int i3, int i4, int i5) {
        this.d = str;
        this.e = i;
        this.f = enumC5905dp2;
        this.g = size;
        this.h = i2;
        this.i = mf2;
        this.j = i3;
        this.k = i4;
        this.l = i5;
    }
}
