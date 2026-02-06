package o;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class T32 implements Closeable {
    public static final String b1 = "SharedByteBuffer";
    public final ByteBuffer X;
    public final int Y;
    public final C4377Tx1<Executor, Runnable> Y0;
    public final AtomicInteger Z0;
    public final Object Z = new Object();
    public boolean a1 = false;

    public T32(ByteBuffer byteBuffer, AtomicInteger atomicInteger, C4377Tx1<Executor, Runnable> c4377Tx1, int i) {
        int i2;
        this.X = byteBuffer;
        this.Z0 = atomicInteger;
        this.Y0 = c4377Tx1;
        this.Y = i;
        if (C7433k41.h(b1) && (i2 = atomicInteger.get()) < 1) {
            throw new AssertionError(String.format(Locale.US, "Cannot create new instance of SharedByteBuffer with invalid ref count %d. Ref count must be >= 1. [%s]", Integer.valueOf(i2), toString()));
        }
    }

    public static T32 h(ByteBuffer byteBuffer, Executor executor, Runnable runnable) {
        return new T32(((ByteBuffer) C10907yF1.l(byteBuffer)).asReadOnlyBuffer(), new AtomicInteger(1), new C4377Tx1((Executor) C10907yF1.l(executor), (Runnable) C10907yF1.l(runnable)), System.identityHashCode(byteBuffer));
    }

    public final void a(String str) {
        if (!this.a1) {
            return;
        }
        throw new IllegalStateException("Cannot call " + str + " on a closed SharedByteBuffer.");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        d();
    }

    public final boolean d() {
        synchronized (this.Z) {
            try {
                if (this.a1) {
                    return false;
                }
                this.a1 = true;
                int decrementAndGet = this.Z0.decrementAndGet();
                if (C7433k41.h(b1)) {
                    if (decrementAndGet >= 0) {
                        C7433k41.a(b1, String.format(Locale.US, "Ref count decremented: %d [%s]", Integer.valueOf(decrementAndGet), toString()));
                    } else {
                        throw new AssertionError("Invalid ref count. close() should never produce a ref count below 0");
                    }
                }
                if (decrementAndGet == 0) {
                    if (C7433k41.h(b1)) {
                        C7433k41.a(b1, String.format(Locale.US, "Final reference released. Running final close action. [%s]", toString()));
                    }
                    try {
                        ((Executor) C10907yF1.l(this.Y0.a)).execute((Runnable) C10907yF1.l(this.Y0.b));
                    } catch (RejectedExecutionException e) {
                        C7433k41.d(b1, String.format(Locale.US, "Unable to execute final close action. [%s]", toString()), e);
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ByteBuffer f() {
        ByteBuffer byteBuffer;
        synchronized (this.Z) {
            a("get()");
            byteBuffer = this.X;
        }
        return byteBuffer;
    }

    public void finalize() throws Throwable {
        try {
            if (d()) {
                C7433k41.p(b1, String.format(Locale.US, "SharedByteBuffer closed by finalizer, but should have been closed manually with SharedByteBuffer.close() [%s]", toString()));
            }
        } finally {
            super.finalize();
        }
    }

    public T32 i() {
        int incrementAndGet;
        AtomicInteger atomicInteger;
        synchronized (this.Z) {
            a("share()");
            incrementAndGet = this.Z0.incrementAndGet();
            atomicInteger = this.Z0;
        }
        if (C7433k41.h(b1)) {
            if (incrementAndGet > 1) {
                C7433k41.a(b1, String.format(Locale.US, "Ref count incremented: %d [%s]", Integer.valueOf(incrementAndGet), toString()));
            } else {
                throw new AssertionError("Invalid ref count. share() should always produce a ref count of 2 or more.");
            }
        }
        return new T32(this.X.asReadOnlyBuffer(), atomicInteger, this.Y0, this.Y);
    }

    public String toString() {
        return String.format(Locale.US, "SharedByteBuffer[buf: %s, shareId: 0x%x, instanceId:0x%x]", this.X, Integer.valueOf(this.Y), Integer.valueOf(System.identityHashCode(this)));
    }
}
