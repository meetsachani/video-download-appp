package o;

import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Supplier;

/* renamed from: o.vO1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10211vO1 extends FilterInputStream {
    public static final ThreadLocal<byte[]> j1 = new GD2(new Supplier() { // from class: o.uO1
        @Override // java.util.function.Supplier
        public final Object get() {
            return C10211vO1.f();
        }
    });
    public final ReentrantLock X;
    public ByteBuffer Y;
    public boolean Y0;
    public ByteBuffer Z;
    public boolean Z0;
    public boolean a1;
    public Throwable b1;
    public boolean c1;
    public boolean d1;
    public boolean e1;
    public final AtomicBoolean f1;
    public final ExecutorService g1;
    public final boolean h1;
    public final Condition i1;

    /* renamed from: o.vO1$b */
    /* loaded from: classes4.dex */
    public static class b extends AbstractC9396s3<C10211vO1, b> {
        public ExecutorService l;

        @Override // o.XK0
        /* renamed from: k0 */
        public C10211vO1 get() throws IOException {
            return new C10211vO1(this);
        }

        public b l0(ExecutorService executorService) {
            this.l = executorService;
            return this;
        }
    }

    public static /* synthetic */ void a(C10211vO1 c10211vO1, byte[] bArr) {
        c10211vO1.X.lock();
        try {
            if (c10211vO1.c1) {
                c10211vO1.Z0 = false;
                return;
            }
            c10211vO1.e1 = true;
            c10211vO1.X.unlock();
            int length = bArr.length;
            int i = 0;
            int i2 = 0;
            do {
                try {
                    i2 = ((FilterInputStream) c10211vO1).in.read(bArr, i, length);
                    if (i2 > 0) {
                        i += i2;
                        length -= i2;
                        if (length <= 0) {
                            break;
                        }
                    } else {
                        break;
                    }
                } catch (Throwable th) {
                    try {
                        if (!(th instanceof Error)) {
                            c10211vO1.X.lock();
                            try {
                                c10211vO1.Z.limit(i);
                                if (i2 >= 0 && !(th instanceof EOFException)) {
                                    c10211vO1.a1 = true;
                                    c10211vO1.b1 = th;
                                    c10211vO1.Z0 = false;
                                    c10211vO1.o();
                                    c10211vO1.X.unlock();
                                    c10211vO1.j();
                                    return;
                                }
                                c10211vO1.Y0 = true;
                                c10211vO1.Z0 = false;
                                c10211vO1.o();
                                c10211vO1.X.unlock();
                                c10211vO1.j();
                                return;
                            } finally {
                            }
                        }
                        throw th;
                    } catch (Throwable th2) {
                        c10211vO1.X.lock();
                        try {
                            c10211vO1.Z.limit(i);
                            if (i2 >= 0 && !(th instanceof EOFException)) {
                                c10211vO1.a1 = true;
                                c10211vO1.b1 = th;
                            } else {
                                c10211vO1.Y0 = true;
                            }
                            c10211vO1.Z0 = false;
                            c10211vO1.o();
                            c10211vO1.X.unlock();
                            c10211vO1.j();
                            throw th2;
                        } finally {
                        }
                    }
                }
            } while (!c10211vO1.f1.get());
            c10211vO1.X.lock();
            try {
                c10211vO1.Z.limit(i);
                if (i2 < 0) {
                    c10211vO1.Y0 = true;
                }
                c10211vO1.Z0 = false;
                c10211vO1.o();
                c10211vO1.X.unlock();
                c10211vO1.j();
            } finally {
            }
        } finally {
        }
    }

    public static /* synthetic */ byte[] f() {
        return new byte[1];
    }

    public static b h() {
        return new b();
    }

    public static Thread l(Runnable runnable) {
        Thread thread = new Thread(runnable, "commons-io-read-ahead");
        thread.setDaemon(true);
        return thread;
    }

    public static ExecutorService m() {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: o.tO1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread l;
                l = C10211vO1.l(runnable);
                return l;
            }
        });
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        this.X.lock();
        try {
            return (int) Math.min(2147483647L, this.Y.remaining() + this.Z.remaining());
        } finally {
            this.X.unlock();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.X.lock();
        try {
            if (this.c1) {
                return;
            }
            boolean z = true;
            this.c1 = true;
            if (!this.e1) {
                this.d1 = true;
            } else {
                z = false;
            }
            this.X.unlock();
            if (this.h1) {
                try {
                    try {
                        this.g1.shutdownNow();
                        this.g1.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
                    } finally {
                        if (z) {
                            super.close();
                        }
                    }
                } catch (InterruptedException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException(e.getMessage());
                    interruptedIOException.initCause(e);
                    throw interruptedIOException;
                }
            }
        } finally {
            this.X.unlock();
        }
    }

    public final void i() throws IOException {
        if (this.a1) {
            Throwable th = this.b1;
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            throw new IOException(this.b1);
        }
    }

    public final void j() {
        this.X.lock();
        boolean z = false;
        try {
            this.e1 = false;
            if (this.c1) {
                if (!this.d1) {
                    z = true;
                }
            }
            if (z) {
                try {
                    super.close();
                } catch (IOException unused) {
                }
            }
        } finally {
            this.X.unlock();
        }
    }

    public final boolean k() {
        if (!this.Y.hasRemaining() && !this.Z.hasRemaining() && this.Y0) {
            return true;
        }
        return false;
    }

    public final void n() throws IOException {
        this.X.lock();
        try {
            final byte[] array = this.Z.array();
            if (!this.Y0 && !this.Z0) {
                i();
                this.Z.position(0);
                this.Z.flip();
                this.Z0 = true;
                this.X.unlock();
                this.g1.execute(new Runnable() { // from class: o.sO1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C10211vO1.a(C10211vO1.this, array);
                    }
                });
            }
        } finally {
            this.X.unlock();
        }
    }

    public final void o() {
        this.X.lock();
        try {
            this.i1.signalAll();
        } finally {
            this.X.unlock();
        }
    }

    public final long p(long j) throws IOException {
        if (this.X.isLocked()) {
            r();
            if (k()) {
                return 0L;
            }
            if (available() >= j) {
                int remaining = ((int) j) - this.Y.remaining();
                if (remaining > 0) {
                    this.Y.position(0);
                    this.Y.flip();
                    ByteBuffer byteBuffer = this.Z;
                    byteBuffer.position(remaining + byteBuffer.position());
                    q();
                    n();
                    return j;
                }
                throw new IllegalStateException("Expected toSkip > 0, actual: " + remaining);
            }
            long available = available();
            this.Y.position(0);
            this.Y.flip();
            this.Z.position(0);
            this.Z.flip();
            long skip = ((FilterInputStream) this).in.skip(j - available);
            n();
            return available + skip;
        }
        throw new IllegalStateException("Expected stateChangeLock to be locked");
    }

    public final void q() {
        ByteBuffer byteBuffer = this.Y;
        this.Y = this.Z;
        this.Z = byteBuffer;
    }

    public final void r() throws IOException {
        this.X.lock();
        try {
            try {
                this.f1.set(true);
                while (this.Z0) {
                    this.i1.await();
                }
                try {
                    this.f1.set(false);
                    this.X.unlock();
                    i();
                } finally {
                }
            } catch (InterruptedException e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException(e.getMessage());
                interruptedIOException.initCause(e);
                throw interruptedIOException;
            }
        } catch (Throwable th) {
            try {
                this.f1.set(false);
                throw th;
            } finally {
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        byte b2;
        if (this.Y.hasRemaining()) {
            b2 = this.Y.get();
        } else {
            byte[] bArr = j1.get();
            bArr[0] = 0;
            if (read(bArr, 0, 1) == -1) {
                return -1;
            }
            b2 = bArr[0];
        }
        return b2 & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        if (j <= 0) {
            return 0L;
        }
        if (j <= this.Y.remaining()) {
            ByteBuffer byteBuffer = this.Y;
            byteBuffer.position(((int) j) + byteBuffer.position());
            return j;
        }
        this.X.lock();
        try {
            return p(j);
        } finally {
            this.X.unlock();
        }
    }

    public C10211vO1(b bVar) throws IOException {
        this(bVar.S(), bVar.L(), bVar.l != null ? bVar.l : m(), bVar.l == null);
    }

    @Deprecated
    public C10211vO1(InputStream inputStream, int i) {
        this(inputStream, i, m(), true);
    }

    @Deprecated
    public C10211vO1(InputStream inputStream, int i, ExecutorService executorService) {
        this(inputStream, i, executorService, false);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        C7743lL0.q(bArr, i, i2);
        if (i2 == 0) {
            return 0;
        }
        if (!this.Y.hasRemaining()) {
            this.X.lock();
            try {
                r();
                if (!this.Z.hasRemaining()) {
                    n();
                    r();
                    if (k()) {
                        this.X.unlock();
                        return -1;
                    }
                }
                q();
                n();
            } finally {
                this.X.unlock();
            }
        }
        int min = Math.min(i2, this.Y.remaining());
        this.Y.get(bArr, i, min);
        return min;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10211vO1(InputStream inputStream, int i, ExecutorService executorService, boolean z) {
        super(inputStream);
        Objects.requireNonNull(inputStream, "inputStream");
        ReentrantLock reentrantLock = new ReentrantLock();
        this.X = reentrantLock;
        this.f1 = new AtomicBoolean();
        this.i1 = reentrantLock.newCondition();
        if (i > 0) {
            Objects.requireNonNull(executorService, "executorService");
            this.g1 = executorService;
            this.h1 = z;
            this.Y = ByteBuffer.allocate(i);
            this.Z = ByteBuffer.allocate(i);
            this.Y.flip();
            this.Z.flip();
            return;
        }
        throw new IllegalArgumentException(String.format("bufferSizeInBytes <= 0, bufferSizeInBytes = %,d", Integer.valueOf(i)));
    }
}
