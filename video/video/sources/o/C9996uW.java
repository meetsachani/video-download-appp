package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Deprecated
/* renamed from: o.uW  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9996uW {
    public static final int f = 0;
    public static final int g = 1;
    public static final int h = 2;
    public static final int i = 3;
    public static final int j = 1;
    public static final int k = 2;
    public static final int l = 4;
    public static final int m = 8;
    public static final int n = 16;

    /* renamed from: o  reason: collision with root package name */
    public static final int f885o = 32;
    public static final int p = 64;
    public static final int q = 128;
    public static final int r = 256;
    public static final int s = 512;
    public static final int t = 1024;
    public static final int u = 2048;
    public static final int v = 4096;
    public static final int w = 8192;
    public static final int x = 16384;
    public static final int y = 32768;
    public final String a;
    public final C10833xx0 b;
    public final C10833xx0 c;
    public final int d;
    public final int e;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.uW$a */
    /* loaded from: classes2.dex */
    public @interface a {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.uW$b */
    /* loaded from: classes2.dex */
    public @interface b {
    }

    public C9996uW(String str, C10833xx0 c10833xx0, C10833xx0 c10833xx02, int i2, int i3) {
        boolean z;
        if (i2 != 0 && i3 != 0) {
            z = false;
        } else {
            z = true;
        }
        C9542sf.a(z);
        this.a = C9542sf.e(str);
        this.b = (C10833xx0) C9542sf.g(c10833xx0);
        this.c = (C10833xx0) C9542sf.g(c10833xx02);
        this.d = i2;
        this.e = i3;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9996uW.class == obj.getClass()) {
            C9996uW c9996uW = (C9996uW) obj;
            if (this.d == c9996uW.d && this.e == c9996uW.e && this.a.equals(c9996uW.a) && this.b.equals(c9996uW.b) && this.c.equals(c9996uW.c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.d) * 31) + this.e) * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}
