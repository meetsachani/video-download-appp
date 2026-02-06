package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
@InterfaceC7780lU1(EnumC7796la.Y)
@Retention(RetentionPolicy.CLASS)
@InterfaceC2968Fm1
@InterfaceC2758Dl2(allowedTargets = {EnumC8057ma.Y, EnumC8057ma.X, EnumC8057ma.d1, EnumC8057ma.e1, EnumC8057ma.f1, EnumC8057ma.c1, EnumC8057ma.Z0, EnumC8057ma.i1})
@Documented
@Repeatable(a.class)
@BR1
/* loaded from: classes.dex */
public @interface FS1 {

    @Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
    @InterfaceC7780lU1(EnumC7796la.Y)
    @CR1
    @Retention(RetentionPolicy.CLASS)
    @InterfaceC2758Dl2(allowedTargets = {EnumC8057ma.Y, EnumC8057ma.X, EnumC8057ma.d1, EnumC8057ma.e1, EnumC8057ma.f1, EnumC8057ma.c1, EnumC8057ma.Z0, EnumC8057ma.i1})
    /* loaded from: classes.dex */
    public @interface a {
        FS1[] value();
    }

    int extension();

    int version();
}
