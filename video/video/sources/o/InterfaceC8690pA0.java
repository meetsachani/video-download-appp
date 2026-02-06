package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o.C8933qA0;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
/* renamed from: o.pA0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC8690pA0 {
    Class<?> contentEntity() default Object.class;

    String languageId() default "";

    C8933qA0.a matchInfo() default C8933qA0.a.FTS4;

    String[] notIndexed() default {};

    C8933qA0.b order() default C8933qA0.b.ASC;

    int[] prefix() default {};

    String tokenizer() default "simple";

    String[] tokenizerArgs() default {};
}
