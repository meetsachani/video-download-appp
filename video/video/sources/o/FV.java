package o;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@InterfaceC2758Dl2(allowedTargets = {EnumC8057ma.X})
@InterfaceC6480g82(version = "1.3")
/* loaded from: classes3.dex */
public @interface FV {
    @InterfaceC8046mW0(name = "c")
    String c() default "";

    @InterfaceC8046mW0(name = "f")
    String f() default "";

    @InterfaceC8046mW0(name = "i")
    int[] i() default {};

    @InterfaceC8046mW0(name = C10901yE.l)
    int[] l() default {};

    @InterfaceC8046mW0(name = "m")
    String m() default "";

    @InterfaceC8046mW0(name = GoogleApiAvailabilityLight.e)
    String[] n() default {};

    @InterfaceC8046mW0(name = "s")
    String[] s() default {};

    @InterfaceC8046mW0(name = "v")
    int v() default 1;
}
