package o;

import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: o.uL1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9956uL1 extends OutputStream {
    public final BlockingQueue<Integer> X;

    public C9956uL1() {
        this(new LinkedBlockingQueue());
    }

    public C9713tL1 a() {
        return C9713tL1.a().m0(this.X).get();
    }

    @Override // java.io.OutputStream
    public void write(int i) throws InterruptedIOException {
        try {
            this.X.put(Integer.valueOf(i & 255));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            InterruptedIOException interruptedIOException = new InterruptedIOException();
            interruptedIOException.initCause(e);
            throw interruptedIOException;
        }
    }

    public C9956uL1(BlockingQueue<Integer> blockingQueue) {
        Objects.requireNonNull(blockingQueue, "blockingQueue");
        this.X = blockingQueue;
    }
}
