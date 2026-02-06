package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@InterfaceC7780lU1(EnumC7796la.Y)
@Documented
@Retention(RetentionPolicy.CLASS)
@InterfaceC2968Fm1
@InterfaceC2758Dl2(allowedTargets = {EnumC8057ma.d1, EnumC8057ma.e1, EnumC8057ma.f1, EnumC8057ma.b1, EnumC8057ma.Z0, EnumC8057ma.a1, EnumC8057ma.Y})
/* renamed from: o.s30  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC9397s30 {
    public static final a f1 = a.a;
    public static final int g1 = 0;
    public static final int h1 = 1;
    public static final int i1 = 2;

    /* renamed from: o.s30$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final int b = 0;
        public static final int c = 1;
        public static final int d = 2;
    }

    int unit() default 1;
}
