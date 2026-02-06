package o;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: o.Kx  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3497Kx {
    public static AbstractC3497Kx a(Executor executor, Handler handler) {
        return new C10772xi(executor, handler);
    }

    public abstract Executor b();

    public abstract Handler c();
}
