package o;

import android.annotation.SuppressLint;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@InterfaceC11025yk1
/* renamed from: o.dg0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5868dg0 {
    @InterfaceC11123z82
    @SuppressLint({"ThreadPoolCreation"})
    @InterfaceC6770hK1
    public static Executor a() {
        return new ExecutorC10976yX1(Executors.newSingleThreadExecutor());
    }
}
