package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.PACKAGE})
@Documented
@Retention(RetentionPolicy.SOURCE)
/* renamed from: o.ka  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public @interface InterfaceC7553ka {
    String[] value();
}
