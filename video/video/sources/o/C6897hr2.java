package o;

import android.os.Trace;

/* renamed from: o.hr2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6897hr2 {
    public static void a(String str, int i) {
        Trace.beginAsyncSection(str, i);
    }

    public static void b(String str, int i) {
        Trace.endAsyncSection(str, i);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }

    public static void d(String str, int i) {
        Trace.setCounter(str, i);
    }
}
