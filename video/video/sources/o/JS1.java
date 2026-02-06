package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.jetbrains.annotations.NotNull;

@Target({ElementType.ANNOTATION_TYPE})
@InterfaceC7780lU1(EnumC7796la.Y)
@Retention(RetentionPolicy.CLASS)
@InterfaceC2758Dl2(allowedTargets = {EnumC8057ma.Y})
@InterfaceC6480g82(version = "1.3")
/* loaded from: classes3.dex */
public @interface JS1 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class a {
        public static final a X = new a("WARNING", 0);
        public static final a Y = new a("ERROR", 1);
        public static final /* synthetic */ InterfaceC3127Hd0 Y0;
        public static final /* synthetic */ a[] Z;

        static {
            a[] e = e();
            Z = e;
            Y0 = C3323Jd0.c(e);
        }

        public a(String str, int i) {
        }

        public static final /* synthetic */ a[] e() {
            return new a[]{X, Y};
        }

        @NotNull
        public static InterfaceC3127Hd0<a> g() {
            return Y0;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) Z.clone();
        }
    }

    a level() default a.Y;

    String message() default "";
}
