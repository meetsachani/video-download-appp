package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@InterfaceC7780lU1(EnumC7796la.X)
@Retention(RetentionPolicy.SOURCE)
@InterfaceC2758Dl2(allowedTargets = {EnumC8057ma.Y, EnumC8057ma.X, EnumC8057ma.Z0, EnumC8057ma.d1, EnumC8057ma.e1, EnumC8057ma.f1, EnumC8057ma.c1})
/* loaded from: classes.dex */
public @interface GS1 {
    String enforcement();

    String name();
}
