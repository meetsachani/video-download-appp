package o;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/* renamed from: o.hi1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6860hi1 extends AbstractC5224b1 {
    public static final int a1 = 262144;
    public static final ByteBuffer b1 = ByteBuffer.wrap(new byte[0]).asReadOnlyBuffer();
    public final int Y;
    public ByteBuffer Y0;
    public final FileChannel Z;
    public long Z0;

    /* renamed from: o.hi1$b */
    /* loaded from: classes4.dex */
    public static class b extends AbstractC9396s3<C6860hi1, b> {
        public b() {
            c0(262144);
            Z(262144);
        }

        @Override // o.XK0
        /* renamed from: j0 */
        public C6860hi1 get() throws IOException {
            return new C6860hi1(this);
        }
    }

    public static b f() {
        return new b();
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.Y0.remaining();
    }

    @Override // o.AbstractC5224b1, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!isClosed()) {
            h();
            this.Y0 = b1;
            this.Z.close();
            super.close();
        }
    }

    public final void h() {
        if (C3769Nr.c() && this.Y0.isDirect()) {
            C3769Nr.a(this.Y0);
        }
    }

    public int i() {
        return this.Y;
    }

    public final void j() throws IOException {
        long size = this.Z.size() - this.Z0;
        if (size > 0) {
            long min = Math.min(size, this.Y);
            h();
            this.Y0 = this.Z.map(FileChannel.MapMode.READ_ONLY, this.Z0, min);
            this.Z0 += min;
            return;
        }
        this.Y0 = b1;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        a();
        if (!this.Y0.hasRemaining()) {
            j();
            if (!this.Y0.hasRemaining()) {
                return -1;
            }
        }
        return C6617gi1.a(this.Y0.get());
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        ByteBuffer byteBuffer;
        a();
        if (j <= 0) {
            return 0L;
        }
        if (j <= this.Y0.remaining()) {
            this.Y0.position((int) (byteBuffer.position() + j));
            return j;
        }
        long remaining = this.Y0.remaining() + Math.min(this.Z.size() - this.Z0, j - this.Y0.remaining());
        this.Z0 += remaining - this.Y0.remaining();
        j();
        return remaining;
    }

    public C6860hi1(b bVar) throws IOException {
        StandardOpenOption standardOpenOption;
        FileChannel open;
        this.Y0 = b1;
        this.Y = bVar.L();
        Path V = bVar.V();
        standardOpenOption = StandardOpenOption.READ;
        open = FileChannel.open(V, standardOpenOption);
        this.Z = open;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        C7743lL0.q(bArr, i, i2);
        if (i2 == 0) {
            return 0;
        }
        a();
        if (!this.Y0.hasRemaining()) {
            j();
            if (!this.Y0.hasRemaining()) {
                return -1;
            }
        }
        int min = Math.min(this.Y0.remaining(), i2);
        this.Y0.get(bArr, i, min);
        return min;
    }
}
