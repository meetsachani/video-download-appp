package o;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: o.ay  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5211ay {
    public static Executor a() {
        return ExecutorC3432Kg.b();
    }

    public static Executor b() {
        return C30.b();
    }

    public static Executor c() {
        return LH0.b();
    }

    public static Executor d() {
        return GT0.b();
    }

    public static boolean e(Executor executor) {
        return executor instanceof ExecutorC8169n12;
    }

    public static ScheduledExecutorService f() {
        return C11118z71.a();
    }

    public static ScheduledExecutorService g() {
        return ScheduledExecutorServiceC5042aG0.f();
    }

    public static ScheduledExecutorService h(Handler handler) {
        return new ScheduledExecutorServiceC5042aG0(handler);
    }

    public static Executor i(Executor executor) {
        return new ExecutorC8169n12(executor);
    }
}
