package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* renamed from: o.Pv0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public @interface InterfaceC3979Pv0 {
    public static final String j1 = "The method argument (if parameter was annotated) or this container (if instance method was annotated)";
    public static final String k1 = "this";
    public static final String l1 = "This container (if the parameter was annotated) or the return value (if instance method was annotated)";
    public static final String m1 = "The return value of this method";
    public static final String n1 = "this";

    String source() default "The method argument (if parameter was annotated) or this container (if instance method was annotated)";

    boolean sourceIsContainer() default false;

    String target() default "This container (if the parameter was annotated) or the return value (if instance method was annotated)";

    boolean targetIsContainer() default false;
}
