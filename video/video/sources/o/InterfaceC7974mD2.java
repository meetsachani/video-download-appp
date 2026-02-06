package o;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE})
@InterfaceC9150r20(message = "This annotation has been replaced by `@OptIn`", replaceWith = @IR1(expression = "OptIn", imports = {"androidx.annotation.OptIn"}))
@InterfaceC7780lU1(EnumC7796la.Y)
@Retention(RetentionPolicy.CLASS)
@InterfaceC2758Dl2(allowedTargets = {EnumC8057ma.X, EnumC8057ma.Y0, EnumC8057ma.a1, EnumC8057ma.b1, EnumC8057ma.c1, EnumC8057ma.d1, EnumC8057ma.e1, EnumC8057ma.f1, EnumC8057ma.i1, EnumC8057ma.j1})
/* renamed from: o.mD2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC7974mD2 {
    Class<? extends Annotation>[] markerClass();
}
