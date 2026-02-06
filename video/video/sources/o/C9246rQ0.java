package o;

import android.graphics.Insets;
import android.graphics.Rect;

/* renamed from: o.rQ0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9246rQ0 {
    public static final C9246rQ0 e = new C9246rQ0(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    /* renamed from: o.rQ0$a */
    /* loaded from: classes.dex */
    public static class a {
        public static Insets a(int i, int i2, int i3, int i4) {
            return Insets.of(i, i2, i3, i4);
        }
    }

    public C9246rQ0(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static C9246rQ0 a(C9246rQ0 c9246rQ0, C9246rQ0 c9246rQ02) {
        return d(c9246rQ0.a + c9246rQ02.a, c9246rQ0.b + c9246rQ02.b, c9246rQ0.c + c9246rQ02.c, c9246rQ0.d + c9246rQ02.d);
    }

    public static C9246rQ0 b(C9246rQ0 c9246rQ0, C9246rQ0 c9246rQ02) {
        return d(Math.max(c9246rQ0.a, c9246rQ02.a), Math.max(c9246rQ0.b, c9246rQ02.b), Math.max(c9246rQ0.c, c9246rQ02.c), Math.max(c9246rQ0.d, c9246rQ02.d));
    }

    public static C9246rQ0 c(C9246rQ0 c9246rQ0, C9246rQ0 c9246rQ02) {
        return d(Math.min(c9246rQ0.a, c9246rQ02.a), Math.min(c9246rQ0.b, c9246rQ02.b), Math.min(c9246rQ0.c, c9246rQ02.c), Math.min(c9246rQ0.d, c9246rQ02.d));
    }

    public static C9246rQ0 d(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return e;
        }
        return new C9246rQ0(i, i2, i3, i4);
    }

    public static C9246rQ0 e(Rect rect) {
        return d(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static C9246rQ0 f(C9246rQ0 c9246rQ0, C9246rQ0 c9246rQ02) {
        return d(c9246rQ0.a - c9246rQ02.a, c9246rQ0.b - c9246rQ02.b, c9246rQ0.c - c9246rQ02.c, c9246rQ0.d - c9246rQ02.d);
    }

    public static C9246rQ0 g(Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return d(i, i2, i3, i4);
    }

    @Deprecated
    public static C9246rQ0 i(Insets insets) {
        return g(insets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9246rQ0.class != obj.getClass()) {
            return false;
        }
        C9246rQ0 c9246rQ0 = (C9246rQ0) obj;
        if (this.d == c9246rQ0.d && this.a == c9246rQ0.a && this.c == c9246rQ0.c && this.b == c9246rQ0.b) {
            return true;
        }
        return false;
    }

    public Insets h() {
        return a.a(this.a, this.b, this.c, this.d);
    }

    public int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}
