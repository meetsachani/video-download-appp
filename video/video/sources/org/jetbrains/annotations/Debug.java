package org.jetbrains.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o.InterfaceC8295nY0;

/* loaded from: classes4.dex */
public final class Debug {

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes4.dex */
    public @interface Renderer {
        @InterfaceC8295nY0(prefix = "class Renderer{Object[] $childrenArray(){return ", suffix = ";}}", value = "JAVA")
        @NonNls
        String childrenArray() default "";

        @InterfaceC8295nY0(prefix = "class Renderer{boolean $hasChildren(){return ", suffix = ";}}", value = "JAVA")
        @NonNls
        String hasChildren() default "";

        @InterfaceC8295nY0(prefix = "class Renderer{String $text(){return ", suffix = ";}}", value = "JAVA")
        @NonNls
        String text() default "";
    }

    private Debug() {
        throw new AssertionError("Debug should not be instantiated");
    }
}
