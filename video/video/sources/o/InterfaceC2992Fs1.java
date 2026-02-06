package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@InterfaceC7866lr1
@Kz2(status = EnumC3837Oj1.STRICT)
@Retention(RetentionPolicy.CLASS)
@Iv2({ElementType.METHOD, ElementType.PARAMETER})
/* renamed from: o.Fs1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public @interface InterfaceC2992Fs1 {

    /* renamed from: o.Fs1$a */
    /* loaded from: classes2.dex */
    public enum a {
        LOCAL,
        STRICT
    }

    /* renamed from: o.Fs1$b */
    /* loaded from: classes2.dex */
    public @interface b {
        boolean trustAll() default false;

        Class[] value();
    }

    b trustOnly() default @b(trustAll = true, value = {});

    a value();
}
