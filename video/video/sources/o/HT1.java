package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
@InterfaceC7780lU1(EnumC7796la.Y)
@Documented
@Retention(RetentionPolicy.CLASS)
@InterfaceC2968Fm1
@InterfaceC2758Dl2(allowedTargets = {EnumC8057ma.Y, EnumC8057ma.X, EnumC8057ma.d1, EnumC8057ma.e1, EnumC8057ma.f1, EnumC8057ma.c1, EnumC8057ma.Z0, EnumC8057ma.i1})
/* loaded from: classes.dex */
public @interface HT1 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static final class a {
        public static final /* synthetic */ a[] b1;
        public static final /* synthetic */ InterfaceC3127Hd0 c1;
        public static final a X = new a("LIBRARY", 0);
        public static final a Y = new a("LIBRARY_GROUP", 1);
        public static final a Z = new a("LIBRARY_GROUP_PREFIX", 2);
        @InterfaceC9150r20(message = "Use LIBRARY_GROUP_PREFIX instead.")
        public static final a Y0 = new a("GROUP_ID", 3);
        public static final a Z0 = new a("TESTS", 4);
        public static final a a1 = new a("SUBCLASSES", 5);

        static {
            a[] e = e();
            b1 = e;
            c1 = C3323Jd0.c(e);
        }

        public a(String str, int i) {
        }

        public static final /* synthetic */ a[] e() {
            return new a[]{X, Y, Z, Y0, Z0, a1};
        }

        public static InterfaceC3127Hd0<a> g() {
            return c1;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) b1.clone();
        }
    }

    a[] value();
}
