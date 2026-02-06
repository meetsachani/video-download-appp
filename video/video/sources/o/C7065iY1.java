package o;

import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.iY1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7065iY1 extends AbstractC7335jg0 {
    public final int Y0;
    public final int Z0;
    public final long a1;
    @NotNull
    public final String b1;
    @NotNull
    public ExecutorC9488sQ c1;

    public C7065iY1() {
        this(0, 0, 0L, null, 15, null);
    }

    @Override // o.AbstractC7762lQ
    public void I(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull Runnable runnable) {
        ExecutorC9488sQ.q(this.c1, runnable, false, false, 6, null);
    }

    @Override // o.AbstractC7762lQ
    public void R(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull Runnable runnable) {
        ExecutorC9488sQ.q(this.c1, runnable, false, true, 2, null);
    }

    @Override // o.AbstractC7335jg0
    @NotNull
    public Executor b0() {
        return this.c1;
    }

    @Override // o.AbstractC7335jg0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.c1.close();
    }

    public final ExecutorC9488sQ g0() {
        return new ExecutorC9488sQ(this.Y0, this.Z0, this.a1, this.b1);
    }

    public final void j0(@NotNull Runnable runnable, boolean z, boolean z2) {
        this.c1.p(runnable, z, z2);
    }

    public final void k0() {
        m0();
    }

    public final synchronized void l0(long j) {
        this.c1.R(j);
    }

    public final synchronized void m0() {
        this.c1.R(1000L);
        this.c1 = g0();
    }

    public /* synthetic */ C7065iY1(int i, int i2, long j, String str, int i3, C9516sY c9516sY) {
        this((i3 & 1) != 0 ? C4528Vl2.c : i, (i3 & 2) != 0 ? C4528Vl2.d : i2, (i3 & 4) != 0 ? C4528Vl2.e : j, (i3 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    public C7065iY1(int i, int i2, long j, @NotNull String str) {
        this.Y0 = i;
        this.Z0 = i2;
        this.a1 = j;
        this.b1 = str;
        this.c1 = g0();
    }
}
