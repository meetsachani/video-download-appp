package o;

import android.text.Layout;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Deprecated
/* renamed from: o.ev2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6172ev2 {
    public static final int A = 2;
    public static final int B = 3;
    public static final int C = 0;
    public static final int D = 1;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 3;
    public static final int H = 4;
    public static final int t = -1;
    public static final float u = Float.MAX_VALUE;
    public static final int v = 0;
    public static final int w = 1;
    public static final int x = 2;
    public static final int y = 3;
    public static final int z = 1;
    @InterfaceC11300zs1
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    @InterfaceC11300zs1
    public String l;
    @InterfaceC11300zs1

    /* renamed from: o  reason: collision with root package name */
    public Layout.Alignment f733o;
    @InterfaceC11300zs1
    public Layout.Alignment p;
    @InterfaceC11300zs1
    public C10791xm2 r;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.ev2$a */
    /* loaded from: classes2.dex */
    public @interface a {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.ev2$b */
    /* loaded from: classes2.dex */
    public @interface b {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.ev2$c */
    /* loaded from: classes2.dex */
    public @interface c {
    }

    @InterfaceC6181ey
    public C6172ev2 A(int i) {
        this.j = i;
        return this;
    }

    @InterfaceC6181ey
    public C6172ev2 B(@InterfaceC11300zs1 String str) {
        this.l = str;
        return this;
    }

    @InterfaceC6181ey
    public C6172ev2 C(boolean z2) {
        this.i = z2 ? 1 : 0;
        return this;
    }

    @InterfaceC6181ey
    public C6172ev2 D(boolean z2) {
        this.f = z2 ? 1 : 0;
        return this;
    }

    @InterfaceC6181ey
    public C6172ev2 E(@InterfaceC11300zs1 Layout.Alignment alignment) {
        this.p = alignment;
        return this;
    }

    @InterfaceC6181ey
    public C6172ev2 F(int i) {
        this.n = i;
        return this;
    }

    @InterfaceC6181ey
    public C6172ev2 G(int i) {
        this.m = i;
        return this;
    }

    @InterfaceC6181ey
    public C6172ev2 H(float f) {
        this.s = f;
        return this;
    }

    @InterfaceC6181ey
    public C6172ev2 I(@InterfaceC11300zs1 Layout.Alignment alignment) {
        this.f733o = alignment;
        return this;
    }

    @InterfaceC6181ey
    public C6172ev2 J(boolean z2) {
        this.q = z2 ? 1 : 0;
        return this;
    }

    @InterfaceC6181ey
    public C6172ev2 K(@InterfaceC11300zs1 C10791xm2 c10791xm2) {
        this.r = c10791xm2;
        return this;
    }

    @InterfaceC6181ey
    public C6172ev2 L(boolean z2) {
        this.g = z2 ? 1 : 0;
        return this;
    }

    @InterfaceC6181ey
    public C6172ev2 a(@InterfaceC11300zs1 C6172ev2 c6172ev2) {
        return s(c6172ev2, true);
    }

    public int b() {
        if (this.e) {
            return this.d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int c() {
        if (this.c) {
            return this.b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    @InterfaceC11300zs1
    public String d() {
        return this.a;
    }

    public float e() {
        return this.k;
    }

    public int f() {
        return this.j;
    }

    @InterfaceC11300zs1
    public String g() {
        return this.l;
    }

    @InterfaceC11300zs1
    public Layout.Alignment h() {
        return this.p;
    }

    public int i() {
        return this.n;
    }

    public int j() {
        return this.m;
    }

    public float k() {
        return this.s;
    }

    public int l() {
        int i;
        int i2 = this.h;
        if (i2 == -1 && this.i == -1) {
            return -1;
        }
        int i3 = 0;
        if (i2 == 1) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.i == 1) {
            i3 = 2;
        }
        return i | i3;
    }

    @InterfaceC11300zs1
    public Layout.Alignment m() {
        return this.f733o;
    }

    public boolean n() {
        if (this.q == 1) {
            return true;
        }
        return false;
    }

    @InterfaceC11300zs1
    public C10791xm2 o() {
        return this.r;
    }

    public boolean p() {
        return this.e;
    }

    public boolean q() {
        return this.c;
    }

    @InterfaceC6181ey
    public C6172ev2 r(@InterfaceC11300zs1 C6172ev2 c6172ev2) {
        return s(c6172ev2, false);
    }

    @InterfaceC6181ey
    public final C6172ev2 s(@InterfaceC11300zs1 C6172ev2 c6172ev2, boolean z2) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (c6172ev2 != null) {
            if (!this.c && c6172ev2.c) {
                x(c6172ev2.b);
            }
            if (this.h == -1) {
                this.h = c6172ev2.h;
            }
            if (this.i == -1) {
                this.i = c6172ev2.i;
            }
            if (this.a == null && (str = c6172ev2.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = c6172ev2.f;
            }
            if (this.g == -1) {
                this.g = c6172ev2.g;
            }
            if (this.n == -1) {
                this.n = c6172ev2.n;
            }
            if (this.f733o == null && (alignment2 = c6172ev2.f733o) != null) {
                this.f733o = alignment2;
            }
            if (this.p == null && (alignment = c6172ev2.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = c6172ev2.q;
            }
            if (this.j == -1) {
                this.j = c6172ev2.j;
                this.k = c6172ev2.k;
            }
            if (this.r == null) {
                this.r = c6172ev2.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = c6172ev2.s;
            }
            if (z2 && !this.e && c6172ev2.e) {
                v(c6172ev2.d);
            }
            if (z2 && this.m == -1 && (i = c6172ev2.m) != -1) {
                this.m = i;
            }
        }
        return this;
    }

    public boolean t() {
        if (this.f == 1) {
            return true;
        }
        return false;
    }

    public boolean u() {
        if (this.g == 1) {
            return true;
        }
        return false;
    }

    @InterfaceC6181ey
    public C6172ev2 v(int i) {
        this.d = i;
        this.e = true;
        return this;
    }

    @InterfaceC6181ey
    public C6172ev2 w(boolean z2) {
        this.h = z2 ? 1 : 0;
        return this;
    }

    @InterfaceC6181ey
    public C6172ev2 x(int i) {
        this.b = i;
        this.c = true;
        return this;
    }

    @InterfaceC6181ey
    public C6172ev2 y(@InterfaceC11300zs1 String str) {
        this.a = str;
        return this;
    }

    @InterfaceC6181ey
    public C6172ev2 z(float f) {
        this.k = f;
        return this;
    }
}
