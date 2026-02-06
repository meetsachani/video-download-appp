package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface YD0 {
    public static final int x1 = 0;
    public static final int y1 = 1;
    public static final int z1 = 2;

    boolean memoizeStaticMethod() default false;

    int override() default 0;

    boolean skipStaticMethod() default false;

    String staticMethodName() default "";
}
