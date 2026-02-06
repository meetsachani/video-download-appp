package o;

import o.US1;

/* loaded from: classes.dex */
public class VS1 {
    public static US1 a(US1 us1, US1 us12) {
        if (us12 == null) {
            return us1;
        }
        if (us1 == null) {
            return us12;
        }
        US1.b b = US1.b.b(us1);
        if (us12.b() != null) {
            b.d(us12.b());
        }
        if (us12.d() != null) {
            b.f(us12.d());
        }
        if (us12.c() != null) {
            b.e(us12.c());
        }
        if (us12.a() != 0) {
            b.c(us12.a());
        }
        return b.a();
    }
}
