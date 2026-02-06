package o;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.regex.Pattern;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Hv2(applicableTo = String.class)
/* loaded from: classes3.dex */
public @interface S81 {

    /* loaded from: classes3.dex */
    public static class a implements Kv2<S81> {
        @Override // o.Kv2
        /* renamed from: b */
        public MK2 a(S81 s81, Object obj) {
            if (Pattern.compile(s81.value(), s81.flags()).matcher((String) obj).matches()) {
                return MK2.ALWAYS;
            }
            return MK2.NEVER;
        }
    }

    int flags() default 0;

    @InterfaceC9247rQ1
    String value();
}
