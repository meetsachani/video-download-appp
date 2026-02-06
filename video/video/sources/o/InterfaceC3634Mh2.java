package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* renamed from: o.Mh2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public @interface InterfaceC3634Mh2 {
    String[] value();
}
