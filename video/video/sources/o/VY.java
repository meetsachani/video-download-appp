package o;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class VY implements InterfaceC8082mg0 {
    public static final int d = (Runtime.getRuntime().availableProcessors() * 2) + 1;
    public final K50 a = new K50(d, new GH1(10));
    public final Executor b = Executors.newSingleThreadExecutor();
    public final Executor c = new ExecutorC10875y71();

    @Override // o.InterfaceC8082mg0
    public K50 a() {
        return this.a;
    }

    @Override // o.InterfaceC8082mg0
    public Executor b() {
        return this.c;
    }

    @Override // o.InterfaceC8082mg0
    public Executor c() {
        return this.b;
    }
}
