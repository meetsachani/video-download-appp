package o;

import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.Objects;

/* renamed from: o.yN1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10939yN1 extends AbstractC5224b1 {
    public final boolean Y;
    public final RandomAccessFile Z;

    /* renamed from: o.yN1$b */
    /* loaded from: classes4.dex */
    public static class b extends AbstractC9396s3<C10939yN1, b> {
        public boolean l;

        @Override // o.XK0
        /* renamed from: k0 */
        public C10939yN1 get() throws IOException {
            return new C10939yN1(this);
        }

        public b l0(boolean z) {
            this.l = z;
            return this;
        }

        @Override // o.C2
        /* renamed from: m0 */
        public b E(RandomAccessFile randomAccessFile) {
            return (b) super.E(randomAccessFile);
        }
    }

    public static b h() {
        return new b();
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return Math.toIntExact(Math.min(f(), 2147483647L));
    }

    @Override // o.AbstractC5224b1, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        if (this.Y) {
            this.Z.close();
        }
    }

    public long f() throws IOException {
        if (isClosed()) {
            return 0L;
        }
        return this.Z.length() - this.Z.getFilePointer();
    }

    public long i(long j, long j2, OutputStream outputStream) throws IOException {
        this.Z.seek(j);
        return C7743lL0.j0(this, outputStream, 0L, j2);
    }

    public RandomAccessFile j() {
        return this.Z;
    }

    public boolean k() {
        return this.Y;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        return this.Z.read();
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        if (j <= 0) {
            return 0L;
        }
        long filePointer = this.Z.getFilePointer();
        long length = this.Z.length();
        if (filePointer >= length) {
            return 0L;
        }
        long j2 = j + filePointer;
        if (j2 > length) {
            j2 = length - 1;
        }
        if (j2 > 0) {
            this.Z.seek(j2);
        }
        return this.Z.getFilePointer() - filePointer;
    }

    public C10939yN1(b bVar) throws IOException {
        this(bVar.W(), bVar.l);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return this.Z.read(bArr);
    }

    @Deprecated
    public C10939yN1(RandomAccessFile randomAccessFile) {
        this(randomAccessFile, false);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.Z.read(bArr, i, i2);
    }

    @Deprecated
    public C10939yN1(RandomAccessFile randomAccessFile, boolean z) {
        Objects.requireNonNull(randomAccessFile, "file");
        this.Z = randomAccessFile;
        this.Y = z;
    }
}
