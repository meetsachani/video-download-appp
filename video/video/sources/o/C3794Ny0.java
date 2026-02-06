package o;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.Ny0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3794Ny0 extends C8120mp2 {
    @NotNull
    public C8120mp2 a;

    public C3794Ny0(@NotNull C8120mp2 c8120mp2) {
        C6562gT0.p(c8120mp2, "delegate");
        this.a = c8120mp2;
    }

    @InterfaceC8046mW0(name = "delegate")
    @NotNull
    public final C8120mp2 a() {
        return this.a;
    }

    @NotNull
    public final C3794Ny0 b(@NotNull C8120mp2 c8120mp2) {
        C6562gT0.p(c8120mp2, "delegate");
        this.a = c8120mp2;
        return this;
    }

    public final /* synthetic */ void c(C8120mp2 c8120mp2) {
        C6562gT0.p(c8120mp2, "<set-?>");
        this.a = c8120mp2;
    }

    @Override // o.C8120mp2
    @NotNull
    public C8120mp2 clearDeadline() {
        return this.a.clearDeadline();
    }

    @Override // o.C8120mp2
    @NotNull
    public C8120mp2 clearTimeout() {
        return this.a.clearTimeout();
    }

    @Override // o.C8120mp2
    public long deadlineNanoTime() {
        return this.a.deadlineNanoTime();
    }

    @Override // o.C8120mp2
    public boolean hasDeadline() {
        return this.a.hasDeadline();
    }

    @Override // o.C8120mp2
    public void throwIfReached() throws IOException {
        this.a.throwIfReached();
    }

    @Override // o.C8120mp2
    @NotNull
    public C8120mp2 timeout(long j, @NotNull TimeUnit timeUnit) {
        C6562gT0.p(timeUnit, "unit");
        return this.a.timeout(j, timeUnit);
    }

    @Override // o.C8120mp2
    public long timeoutNanos() {
        return this.a.timeoutNanos();
    }

    @Override // o.C8120mp2
    @NotNull
    public C8120mp2 deadlineNanoTime(long j) {
        return this.a.deadlineNanoTime(j);
    }
}
