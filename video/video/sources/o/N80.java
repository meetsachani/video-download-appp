package o;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class N80 {
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 4;
    public static final int h = 5;
    public static final int i = 6;
    public static final int j = 0;
    public static final int k = 8;
    public static final int l = 10;
    public static final N80 m = new N80(0, 0);
    public static final N80 n = new N80(1, 8);

    /* renamed from: o  reason: collision with root package name */
    public static final N80 f550o = new N80(2, 10);
    public static final N80 p = new N80(3, 10);
    public static final N80 q = new N80(4, 10);
    public static final N80 r = new N80(5, 10);
    public static final N80 s = new N80(6, 10);
    public static final N80 t = new N80(6, 8);
    public final int a;
    public final int b;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    public N80(int i2, int i3) {
        this.a = i2;
        this.b = i3;
    }

    public static String c(int i2) {
        switch (i2) {
            case 0:
                return "UNSPECIFIED";
            case 1:
                return "SDR";
            case 2:
                return "HDR_UNSPECIFIED";
            case 3:
                return "HLG";
            case 4:
                return "HDR10";
            case 5:
                return "HDR10_PLUS";
            case 6:
                return "DOLBY_VISION";
            default:
                return "<Unknown>";
        }
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public boolean d() {
        if (e() && b() != 1 && a() == 10) {
            return true;
        }
        return false;
    }

    public boolean e() {
        if (b() != 0 && b() != 2 && a() != 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof N80) {
            N80 n80 = (N80) obj;
            if (this.a == n80.b() && this.b == n80.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public String toString() {
        return "DynamicRange@" + Integer.toHexString(System.identityHashCode(this)) + "{encoding=" + c(this.a) + ", bitDepth=" + this.b + "}";
    }
}
