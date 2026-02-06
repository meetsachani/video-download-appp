package o;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

@InterfaceC6371fk2("RegEx")
@Jv2
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.rQ1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public @interface InterfaceC9247rQ1 {

    /* renamed from: o.rQ1$a */
    /* loaded from: classes3.dex */
    public static class a implements Kv2<InterfaceC9247rQ1> {
        @Override // o.Kv2
        /* renamed from: b */
        public MK2 a(InterfaceC9247rQ1 interfaceC9247rQ1, Object obj) {
            if (!(obj instanceof String)) {
                return MK2.NEVER;
            }
            try {
                Pattern.compile((String) obj);
                return MK2.ALWAYS;
            } catch (PatternSyntaxException unused) {
                return MK2.NEVER;
            }
        }
    }

    MK2 when() default MK2.ALWAYS;
}
