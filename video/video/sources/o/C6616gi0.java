package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Deprecated
/* renamed from: o.gi0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6616gi0 extends RuntimeException {
    public static final int Y = 0;
    public static final int Y0 = 2;
    public static final int Z = 1;
    public static final int Z0 = 3;
    public final int X;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.gi0$a */
    /* loaded from: classes2.dex */
    public @interface a {
    }

    public C6616gi0(int i) {
        super(a(i));
        this.X = i;
    }

    public static String a(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "Undefined timeout.";
                }
                return "Detaching surface timed out.";
            }
            return "Setting foreground mode timed out.";
        }
        return "Player release timed out.";
    }
}
