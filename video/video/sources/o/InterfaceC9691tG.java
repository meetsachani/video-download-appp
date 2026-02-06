package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* renamed from: o.tG  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC9691tG {
    public static final String H0 = "[field-name]";
    public static final int I0 = 1;
    public static final int J0 = 2;
    public static final int K0 = 3;
    public static final int L0 = 4;
    public static final int M0 = 5;
    public static final int N0 = 1;
    public static final int O0 = 2;
    public static final int P0 = 3;
    public static final int Q0 = 4;
    public static final int R0 = 5;
    public static final int S0 = 6;
    public static final String T0 = "[value-unspecified]";

    @Retention(RetentionPolicy.CLASS)
    /* renamed from: o.tG$a */
    /* loaded from: classes.dex */
    public @interface a {
    }

    @Retention(RetentionPolicy.CLASS)
    /* renamed from: o.tG$b */
    /* loaded from: classes.dex */
    public @interface b {
    }

    int collate() default 1;

    String defaultValue() default "[value-unspecified]";

    boolean index() default false;

    String name() default "[field-name]";

    int typeAffinity() default 1;
}
