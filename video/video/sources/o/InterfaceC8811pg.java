package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
/* renamed from: o.pg  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC8811pg {

    @Target({})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.pg$a */
    /* loaded from: classes.dex */
    public @interface a {
        int mask() default 0;

        String name();

        int value();
    }

    a[] intMapping() default {};

    String value();
}
