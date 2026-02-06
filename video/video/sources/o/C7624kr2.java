package o;

import android.os.Trace;

@Deprecated
/* renamed from: o.kr2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7624kr2 {
    public static void a(String str) {
        if (TD2.a >= 18) {
            b(str);
        }
    }

    @ES1(18)
    public static void b(String str) {
        Trace.beginSection(str);
    }

    public static void c() {
        if (TD2.a >= 18) {
            d();
        }
    }

    @ES1(18)
    public static void d() {
        Trace.endSection();
    }
}
