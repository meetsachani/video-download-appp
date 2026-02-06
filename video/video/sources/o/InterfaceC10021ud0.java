package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
/* renamed from: o.ud0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC10021ud0 {
    InterfaceC9858tx0[] foreignKeys() default {};

    String[] ignoredColumns() default {};

    InterfaceC7273jP0[] indices() default {};

    boolean inheritSuperIndices() default false;

    String[] primaryKeys() default {};

    String tableName() default "";
}
