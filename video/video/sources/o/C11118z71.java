package o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: o.z71  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11118z71 {
    public static volatile ScheduledExecutorService a;

    public static ScheduledExecutorService a() {
        if (a != null) {
            return a;
        }
        synchronized (C11118z71.class) {
            try {
                if (a == null) {
                    a = new ScheduledExecutorServiceC5042aG0(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a;
    }
}
