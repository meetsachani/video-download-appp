package o;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: o.Fl2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2965Fl2 {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Fl2$a */
    /* loaded from: classes.dex */
    public @interface a {
    }

    public int a(String str, C7641kw c7641kw) {
        C5424bq1 c5424bq1 = (C5424bq1) X20.a(C5424bq1.class);
        if (c5424bq1 != null) {
            return c5424bq1.d();
        }
        C8564of c8564of = (C8564of) C11075yx.a(str, c7641kw).b(C8564of.class);
        if (c8564of != null) {
            return c8564of.d();
        }
        return 3;
    }
}
