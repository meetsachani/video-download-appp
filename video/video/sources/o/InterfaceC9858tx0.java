package o;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
/* renamed from: o.tx0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC9858tx0 {
    public static final int o1 = 1;
    public static final int p1 = 2;
    public static final int q1 = 3;
    public static final int r1 = 4;
    public static final int s1 = 5;

    @Retention(RetentionPolicy.CLASS)
    /* renamed from: o.tx0$a */
    /* loaded from: classes.dex */
    public @interface a {
    }

    String[] childColumns();

    boolean deferred() default false;

    Class<?> entity();

    int onDelete() default 1;

    int onUpdate() default 1;

    String[] parentColumns();
}
