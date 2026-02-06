package o;

import java.nio.ByteBuffer;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import o.InterfaceC3240Ih;

/* renamed from: o.tq  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9829tq implements InterfaceC3240Ih {
    public static final String m = "BufferedAudioStream";
    public static final int n = 1024;

    /* renamed from: o  reason: collision with root package name */
    public static final int f878o = 500;
    public static final int p = 1;
    public final InterfaceC3240Ih g;
    public final int h;
    public final int i;
    public final int j;
    public int l;
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final Queue<a> c = new ConcurrentLinkedQueue();
    public final Executor d = C5211ay.i(C5211ay.a());
    public final Object e = new Object();
    public a f = null;
    public final AtomicBoolean k = new AtomicBoolean(false);

    /* renamed from: o.tq$a */
    /* loaded from: classes.dex */
    public static class a {
        public final int a;
        public final int b;
        public final ByteBuffer c;
        public long d;

        public a(ByteBuffer byteBuffer, InterfaceC3240Ih.c cVar, int i, int i2) {
            byteBuffer.rewind();
            int limit = byteBuffer.limit() - byteBuffer.position();
            if (limit == cVar.a()) {
                this.a = i;
                this.b = i2;
                this.c = byteBuffer;
                this.d = cVar.b();
                return;
            }
            throw new IllegalStateException("Byte buffer size is not match with packet info: " + limit + " != " + cVar.a());
        }

        public int a() {
            return this.c.remaining();
        }

        public InterfaceC3240Ih.c b(ByteBuffer byteBuffer) {
            int remaining;
            long j = this.d;
            int position = this.c.position();
            int position2 = byteBuffer.position();
            if (this.c.remaining() > byteBuffer.remaining()) {
                remaining = byteBuffer.remaining();
                this.d += C4021Qh.c(C4021Qh.f(remaining, this.a), this.b);
                ByteBuffer duplicate = this.c.duplicate();
                duplicate.position(position).limit(position + remaining);
                byteBuffer.put(duplicate).limit(position2 + remaining).position(position2);
            } else {
                remaining = this.c.remaining();
                byteBuffer.put(this.c).limit(position2 + remaining).position(position2);
            }
            this.c.position(position + remaining);
            return InterfaceC3240Ih.c.c(remaining, j);
        }
    }

    public C9829tq(InterfaceC3240Ih interfaceC3240Ih, AbstractC8328nh abstractC8328nh) {
        boolean z;
        this.g = interfaceC3240Ih;
        int d = abstractC8328nh.d();
        this.h = d;
        int f = abstractC8328nh.f();
        this.i = f;
        if (d > 0) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.b(z, "mBytesPerFrame must be greater than 0.");
        C10907yF1.b(((long) f) > 0, "mSampleRate must be greater than 0.");
        this.j = 500;
        this.l = d * 1024;
    }

    public static /* synthetic */ void b(C9829tq c9829tq) {
        c9829tq.k.set(false);
        c9829tq.g.stop();
        synchronized (c9829tq.e) {
            c9829tq.f = null;
            c9829tq.c.clear();
        }
    }

    public static /* synthetic */ void c(C9829tq c9829tq) {
        c9829tq.getClass();
        try {
            c9829tq.g.start();
            c9829tq.l();
        } catch (InterfaceC3240Ih.b e) {
            throw new RuntimeException(e);
        }
    }

    public static /* synthetic */ void d(C9829tq c9829tq) {
        c9829tq.k.set(false);
        c9829tq.g.g();
        synchronized (c9829tq.e) {
            c9829tq.f = null;
            c9829tq.c.clear();
        }
    }

    private void i() {
        C10907yF1.o(!this.b.get(), "AudioStream has been released.");
    }

    private void j() {
        C10907yF1.o(this.a.get(), "AudioStream has not been started.");
    }

    @Override // o.InterfaceC3240Ih
    public void a(final InterfaceC3240Ih.a aVar, final Executor executor) {
        boolean z = true;
        C10907yF1.o(!this.a.get(), "AudioStream can not be started when setCallback.");
        i();
        if (aVar != null && executor == null) {
            z = false;
        }
        C10907yF1.b(z, "executor can't be null with non-null callback.");
        this.d.execute(new Runnable() { // from class: o.oq
            @Override // java.lang.Runnable
            public final void run() {
                C9829tq.this.g.a(aVar, executor);
            }
        });
    }

    @Override // o.InterfaceC3240Ih
    public void g() {
        if (this.b.getAndSet(true)) {
            return;
        }
        this.d.execute(new Runnable() { // from class: o.sq
            @Override // java.lang.Runnable
            public final void run() {
                C9829tq.d(C9829tq.this);
            }
        });
    }

    public final void k() {
        if (this.k.get()) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.l);
            a aVar = new a(allocateDirect, this.g.read(allocateDirect), this.h, this.i);
            int i = this.j;
            synchronized (this.e) {
                try {
                    this.c.offer(aVar);
                    while (this.c.size() > i) {
                        this.c.poll();
                        C7433k41.p(m, "Drop audio data due to full of queue.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.k.get()) {
                this.d.execute(new Runnable() { // from class: o.qq
                    @Override // java.lang.Runnable
                    public final void run() {
                        C9829tq.this.k();
                    }
                });
            }
        }
    }

    public final void l() {
        if (this.k.getAndSet(true)) {
            return;
        }
        k();
    }

    public final void m(int i) {
        int i2 = this.l;
        if (i2 == i) {
            return;
        }
        int i3 = this.h;
        this.l = (i / i3) * i3;
        C7433k41.a(m, "Update buffer size from " + i2 + " to " + this.l);
    }

    public final void n(final int i) {
        this.d.execute(new Runnable() { // from class: o.rq
            @Override // java.lang.Runnable
            public final void run() {
                C9829tq.this.m(i);
            }
        });
    }

    @Override // o.InterfaceC3240Ih
    public InterfaceC3240Ih.c read(ByteBuffer byteBuffer) {
        boolean z;
        i();
        j();
        n(byteBuffer.remaining());
        InterfaceC3240Ih.c c = InterfaceC3240Ih.c.c(0, 0L);
        do {
            synchronized (this.e) {
                try {
                    a aVar = this.f;
                    this.f = null;
                    if (aVar == null) {
                        aVar = this.c.poll();
                    }
                    if (aVar != null) {
                        c = aVar.b(byteBuffer);
                        if (aVar.a() > 0) {
                            this.f = aVar;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (c.a() <= 0 && this.a.get() && !this.b.get()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException e) {
                    C7433k41.q(m, "Interruption while waiting for audio data", e);
                    return c;
                }
            }
        } while (z);
        return c;
    }

    @Override // o.InterfaceC3240Ih
    public void start() throws InterfaceC3240Ih.b, IllegalStateException {
        i();
        if (this.a.getAndSet(true)) {
            return;
        }
        FutureTask futureTask = new FutureTask(new Runnable() { // from class: o.pq
            @Override // java.lang.Runnable
            public final void run() {
                C9829tq.c(C9829tq.this);
            }
        }, null);
        this.d.execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.set(false);
            throw new InterfaceC3240Ih.b(e);
        }
    }

    @Override // o.InterfaceC3240Ih
    public void stop() throws IllegalStateException {
        i();
        if (!this.a.getAndSet(false)) {
            return;
        }
        this.d.execute(new Runnable() { // from class: o.nq
            @Override // java.lang.Runnable
            public final void run() {
                C9829tq.b(C9829tq.this);
            }
        });
    }
}
