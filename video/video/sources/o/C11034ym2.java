package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Deprecated
/* renamed from: o.ym2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11034ym2 implements InterfaceC8539oY0 {
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    public static final int g = 3;
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 2;
    public int a;
    public int b;
    public final int c;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.ym2$a */
    /* loaded from: classes2.dex */
    public @interface a {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.ym2$b */
    /* loaded from: classes2.dex */
    public @interface b {
    }

    public C11034ym2(int i2, int i3, int i4) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
    }
}
