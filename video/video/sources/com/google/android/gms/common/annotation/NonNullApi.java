package com.google.android.gms.common.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o.Iv2;

@Target({ElementType.TYPE, ElementType.PACKAGE})
@KeepForSdk
@Documented
@Retention(RetentionPolicy.CLASS)
@Iv2({ElementType.METHOD, ElementType.PARAMETER})
/* loaded from: classes2.dex */
public @interface NonNullApi {
}
