package o;

import java.io.InputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: o.tL1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9713tL1 extends InputStream {
    public final BlockingQueue<Integer> X;
    public final long Y;

    /* renamed from: o.tL1$b */
    /* loaded from: classes4.dex */
    public static class b extends AbstractC9396s3<C9713tL1, b> {
        public BlockingQueue<Integer> l = new LinkedBlockingQueue();
        public Duration m;

        public b() {
            Duration duration;
            duration = Duration.ZERO;
            this.m = duration;
        }

        @Override // o.XK0
        /* renamed from: l0 */
        public C9713tL1 get() {
            return new C9713tL1(this);
        }

        public b m0(BlockingQueue<Integer> blockingQueue) {
            if (blockingQueue == null) {
                blockingQueue = new LinkedBlockingQueue<>();
            }
            this.l = blockingQueue;
            return this;
        }

        public b n0(Duration duration) {
            long nanos;
            if (duration != null) {
                nanos = duration.toNanos();
                if (nanos < 0) {
                    throw new IllegalArgumentException("timeout must not be negative");
                }
            }
            if (duration == null) {
                duration = Duration.ZERO;
            }
            this.m = duration;
            return this;
        }
    }

    public static b a() {
        return new b();
    }

    public BlockingQueue<Integer> d() {
        return this.X;
    }

    public Duration f() {
        Duration ofNanos;
        ofNanos = Duration.ofNanos(this.Y);
        return ofNanos;
    }

    public C9956uL1 h() {
        return new C9956uL1(this.X);
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            Integer poll = this.X.poll(this.Y, TimeUnit.NANOSECONDS);
            if (poll == null) {
                return -1;
            }
            return poll.intValue() & 255;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException(e);
        }
    }

    public C9713tL1() {
        this(new LinkedBlockingQueue());
    }

    @Deprecated
    public C9713tL1(BlockingQueue<Integer> blockingQueue) {
        this(a().m0(blockingQueue));
    }

    public C9713tL1(b bVar) {
        long nanos;
        BlockingQueue<Integer> blockingQueue = bVar.l;
        Objects.requireNonNull(blockingQueue, "blockingQueue");
        this.X = blockingQueue;
        Duration duration = bVar.m;
        Objects.requireNonNull(duration, "timeout");
        nanos = C9470sL1.a(duration).toNanos();
        this.Y = nanos;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        C7743lL0.q(bArr, i, i2);
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        ArrayList<Integer> arrayList = new ArrayList(Math.min(i2, this.X.size()));
        this.X.drainTo(arrayList, i2);
        if (arrayList.isEmpty()) {
            int read = read();
            if (read == -1) {
                return -1;
            }
            arrayList.add(Integer.valueOf(read));
            this.X.drainTo(arrayList, i2 - 1);
        }
        for (Integer num : arrayList) {
            bArr[i + i3] = (byte) (num.intValue() & 255);
            i3++;
        }
        return i3;
    }
}
