package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Deprecated
/* loaded from: classes2.dex */
public final class G50 {
    public static final int i = 0;
    public static final int j = 1;
    public static final int k = 2;
    public static final int l = 3;
    public static final int m = 4;
    public static final int n = 5;

    /* renamed from: o  reason: collision with root package name */
    public static final int f461o = 7;
    public static final int p = 0;
    public static final int q = 1;
    public static final int r = 0;
    public final C5972e60 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final int g;
    public final C5487c60 h;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface a {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface b {
    }

    public G50(C5972e60 c5972e60, int i2, long j2, long j3, long j4, int i3, int i4) {
        this(c5972e60, i2, j2, j3, j4, i3, i4, new C5487c60());
    }

    public long a() {
        return this.h.a;
    }

    public float b() {
        return this.h.b;
    }

    public boolean c() {
        int i2 = this.b;
        if (i2 != 3 && i2 != 4) {
            return false;
        }
        return true;
    }

    public G50(C5972e60 c5972e60, int i2, long j2, long j3, long j4, int i3, int i4, C5487c60 c5487c60) {
        C9542sf.g(c5487c60);
        boolean z = false;
        C9542sf.a((i4 == 0) == (i2 != 4));
        if (i3 != 0) {
            if (i2 != 2 && i2 != 0) {
                z = true;
            }
            C9542sf.a(z);
        }
        this.a = c5972e60;
        this.b = i2;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = i3;
        this.g = i4;
        this.h = c5487c60;
    }
}
