package o;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: o.vP1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10215vP1 implements AutoCloseable {
    public final AtomicBoolean X;
    public final C7033iP1 Y;
    public final AbstractC5209ax1 Y0;
    public final long Z;
    public final boolean Z0;
    public final RD a1;

    public C10215vP1(C7033iP1 c7033iP1, long j, AbstractC5209ax1 abstractC5209ax1, boolean z, boolean z2) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.X = atomicBoolean;
        RD b = RD.b();
        this.a1 = b;
        this.Y = c7033iP1;
        this.Z = j;
        this.Y0 = abstractC5209ax1;
        this.Z0 = z;
        if (z2) {
            atomicBoolean.set(true);
        } else {
            b.c("stop");
        }
    }

    public static C10215vP1 a(C9677tC1 c9677tC1, long j) {
        C10907yF1.m(c9677tC1, "The given PendingRecording cannot be null.");
        return new C10215vP1(c9677tC1.f(), j, c9677tC1.e(), c9677tC1.h(), true);
    }

    public static C10215vP1 d(C9677tC1 c9677tC1, long j) {
        C10907yF1.m(c9677tC1, "The given PendingRecording cannot be null.");
        return new C10215vP1(c9677tC1.f(), j, c9677tC1.e(), c9677tC1.h(), false);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        n(0, null);
    }

    public AbstractC5209ax1 f() {
        return this.Y0;
    }

    public void finalize() throws Throwable {
        try {
            this.a1.d();
            n(10, new RuntimeException("Recording stopped due to being garbage collected."));
        } finally {
            super.finalize();
        }
    }

    public long h() {
        return this.Z;
    }

    public boolean i() {
        return this.Z0;
    }

    public boolean isClosed() {
        return this.X.get();
    }

    public void j(boolean z) {
        if (!this.X.get()) {
            this.Y.R(this, z);
            return;
        }
        throw new IllegalStateException("The recording has been stopped.");
    }

    public void k() {
        if (!this.X.get()) {
            this.Y.c0(this);
            return;
        }
        throw new IllegalStateException("The recording has been stopped.");
    }

    public void l() {
        if (!this.X.get()) {
            this.Y.n0(this);
            return;
        }
        throw new IllegalStateException("The recording has been stopped.");
    }

    public void m() {
        close();
    }

    public final void n(int i, Throwable th) {
        this.a1.a();
        if (this.X.getAndSet(true)) {
            return;
        }
        this.Y.C0(this, i, th);
    }
}
