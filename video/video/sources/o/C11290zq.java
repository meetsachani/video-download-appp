package o;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/* renamed from: o.zq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C11290zq extends InputStream {
    public final ByteBuffer X;
    public final FileChannel Y;

    /* renamed from: o.zq$b */
    /* loaded from: classes4.dex */
    public static class b extends AbstractC9396s3<C11290zq, b> {
        public FileChannel l;

        @Override // o.XK0
        /* renamed from: k0 */
        public C11290zq get() throws IOException {
            return new C11290zq(this);
        }

        public b l0(FileChannel fileChannel) {
            this.l = fileChannel;
            return this;
        }
    }

    public static b a() {
        return new b();
    }

    @Override // java.io.InputStream
    public synchronized int available() throws IOException {
        if (!this.Y.isOpen()) {
            return 0;
        }
        if (!h()) {
            return 0;
        }
        return this.X.remaining();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.Y.close();
        d(this.X);
    }

    public final void d(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            f(byteBuffer);
        }
    }

    public final void f(ByteBuffer byteBuffer) {
        if (C3769Nr.c()) {
            C3769Nr.a(byteBuffer);
        }
    }

    public final boolean h() throws IOException {
        YP0.a(this.Y.isOpen());
        if (this.X.hasRemaining()) {
            return true;
        }
        this.X.clear();
        int i = 0;
        while (i == 0) {
            i = this.Y.read(this.X);
        }
        this.X.flip();
        if (i >= 0) {
            return true;
        }
        return false;
    }

    public final long i(long j) throws IOException {
        long position = this.Y.position();
        long size = this.Y.size();
        long j2 = size - position;
        if (j > j2) {
            this.Y.position(size);
            return j2;
        }
        this.Y.position(position + j);
        return j;
    }

    @Override // java.io.InputStream
    public synchronized int read() throws IOException {
        if (h()) {
            return this.X.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public synchronized long skip(long j) throws IOException {
        if (j <= 0) {
            return 0L;
        }
        if (this.X.remaining() >= j) {
            ByteBuffer byteBuffer = this.X;
            byteBuffer.position(byteBuffer.position() + ((int) j));
            return j;
        }
        long remaining = this.X.remaining();
        this.X.position(0);
        this.X.flip();
        return remaining + i(j - remaining);
    }

    public C11290zq(b bVar) throws IOException {
        StandardOpenOption standardOpenOption;
        FileChannel open;
        if (bVar.l != null) {
            open = bVar.l;
        } else {
            Path V = bVar.V();
            standardOpenOption = StandardOpenOption.READ;
            open = FileChannel.open(V, standardOpenOption);
        }
        this.Y = open;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bVar.L());
        this.X = allocateDirect;
        allocateDirect.flip();
    }

    @Override // java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        C7743lL0.q(bArr, i, i2);
        if (i2 == 0) {
            return 0;
        }
        if (h()) {
            int min = Math.min(i2, this.X.remaining());
            this.X.get(bArr, i, min);
            return min;
        }
        return -1;
    }

    @Deprecated
    public C11290zq(File file) throws IOException {
        this(file, 8192);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C11290zq(File file, int i) throws IOException {
        this(r1, i);
        Path path;
        path = file.toPath();
    }

    @Deprecated
    public C11290zq(Path path) throws IOException {
        this(path, 8192);
    }

    @Deprecated
    public C11290zq(Path path, int i) throws IOException {
        this(((b) a().D(path)).Z(i));
    }
}
