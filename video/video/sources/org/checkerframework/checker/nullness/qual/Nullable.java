package org.checkerframework.checker.nullness.qual;

import com.facebook.ads.redexgen.X.C0L;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.DefaultFor;
import org.checkerframework.framework.qual.QualifierForLiterals;
import org.checkerframework.framework.qual.SubtypeOf;

@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@QualifierForLiterals({C0L.A0A})
@DefaultFor(types = {Void.class})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@SubtypeOf({})
/* loaded from: assets/audience_network/classes.dex */
public @interface Nullable {
}
