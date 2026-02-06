package o;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import o.InterfaceC3240Ih;

/* renamed from: o.p62 */
/* loaded from: classes.dex */
public class C8676p62 implements InterfaceC3240Ih {
    public static final String i = "SilentAudioStream";
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final int c;
    public final int d;
    public byte[] e;
    public long f;
    public InterfaceC3240Ih.a g;
    public Executor h;

    public C8676p62(AbstractC8328nh abstractC8328nh) {
        this.c = abstractC8328nh.d();
        this.d = abstractC8328nh.f();
    }

    public static /* synthetic */ void b(InterfaceC3240Ih.a aVar) {
        aVar.a(true);
    }

    public static void c(long j) {
        long f = j - f();
        if (f > 0) {
            try {
                Thread.sleep(TimeUnit.NANOSECONDS.toMillis(f));
            } catch (InterruptedException e) {
                C7433k41.q(i, "Ignore interruption", e);
            }
        }
    }

    private void d() {
        C10907yF1.o(!this.b.get(), "AudioStream has been released.");
    }

    private void e() {
        C10907yF1.o(this.a.get(), "AudioStream has not been started.");
    }

    public static long f() {
        return System.nanoTime();
    }

    @Override // o.InterfaceC3240Ih
    public void a(InterfaceC3240Ih.a aVar, Executor executor) {
        boolean z = true;
        C10907yF1.o(!this.a.get(), "AudioStream can not be started when setCallback.");
        d();
        if (aVar != null && executor == null) {
            z = false;
        }
        C10907yF1.b(z, "executor can't be null with non-null callback.");
        this.g = aVar;
        this.h = executor;
    }

    @Override // o.InterfaceC3240Ih
    public void g() {
        this.b.getAndSet(true);
    }

    public final void h() {
        final InterfaceC3240Ih.a aVar = this.g;
        Executor executor = this.h;
        if (aVar != null && executor != null) {
            executor.execute(new Runnable() { // from class: o.o62
                @Override // java.lang.Runnable
                public final void run() {
                    C8676p62.b(InterfaceC3240Ih.a.this);
                }
            });
        }
    }

    public final void i(ByteBuffer byteBuffer, int i2) {
        boolean z;
        if (i2 <= byteBuffer.remaining()) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.n(z);
        byte[] bArr = this.e;
        if (bArr == null || bArr.length < i2) {
            this.e = new byte[i2];
        }
        int position = byteBuffer.position();
        byteBuffer.put(this.e, 0, i2).limit(i2 + position).position(position);
    }

    @Override // o.InterfaceC3240Ih
    public InterfaceC3240Ih.c read(ByteBuffer byteBuffer) {
        d();
        e();
        long f = C4021Qh.f(byteBuffer.remaining(), this.c);
        int d = (int) C4021Qh.d(f, this.c);
        if (d <= 0) {
            return InterfaceC3240Ih.c.c(0, this.f);
        }
        long c = this.f + C4021Qh.c(f, this.d);
        c(c);
        i(byteBuffer, d);
        InterfaceC3240Ih.c c2 = InterfaceC3240Ih.c.c(d, this.f);
        this.f = c;
        return c2;
    }

    @Override // o.InterfaceC3240Ih
    public void start() {
        d();
        if (this.a.getAndSet(true)) {
            return;
        }
        this.f = f();
        h();
    }

    @Override // o.InterfaceC3240Ih
    public void stop() {
        d();
        this.a.set(false);
    }
}
