package o;

import android.os.Looper;

/* renamed from: o.co2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5659co2 {
    public static void a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Must be invoked from the main thread.");
    }
}
