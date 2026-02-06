package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Deprecated
/* loaded from: classes2.dex */
public final class AR1 {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface a {
    }

    public static int a(int i, int i2) {
        for (int i3 = 1; i3 <= 2; i3++) {
            int i4 = (i + i3) % 3;
            if (b(i4, i2)) {
                return i4;
            }
        }
        return i;
    }

    public static boolean b(int i, int i2) {
        if (i == 0) {
            return true;
        }
        if (i != 1) {
            if (i == 2 && (i2 & 2) != 0) {
                return true;
            }
            return false;
        } else if ((i2 & 1) != 0) {
            return true;
        } else {
            return false;
        }
    }
}
