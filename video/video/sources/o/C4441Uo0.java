package o;

import java.io.File;

@Deprecated
/* renamed from: o.Uo0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4441Uo0 {
    public static final C4635Wo0 a = new C4635Wo0();

    @Deprecated
    public static synchronized void a() {
        synchronized (C4441Uo0.class) {
            a.b();
        }
    }

    public static C4635Wo0 b() {
        return a;
    }

    @Deprecated
    public static int c() {
        return a.d();
    }

    @Deprecated
    public static void d(File file, Object obj) {
        a.e(file, obj);
    }

    @Deprecated
    public static void e(File file, Object obj, C5176ap0 c5176ap0) {
        a.f(file, obj, c5176ap0);
    }

    @Deprecated
    public static void f(String str, Object obj) {
        a.g(str, obj);
    }

    @Deprecated
    public static void g(String str, Object obj, C5176ap0 c5176ap0) {
        a.h(str, obj, c5176ap0);
    }
}
