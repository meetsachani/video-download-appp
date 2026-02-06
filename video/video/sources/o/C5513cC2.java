package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Deprecated
/* renamed from: o.cC2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5513cC2 extends Exception {
    public static final int Y = 1;
    public static final int Z = 2;
    public final int X;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.cC2$a */
    /* loaded from: classes2.dex */
    public @interface a {
    }

    public C5513cC2(int i) {
        this.X = i;
    }

    public C5513cC2(int i, Exception exc) {
        super(exc);
        this.X = i;
    }
}
