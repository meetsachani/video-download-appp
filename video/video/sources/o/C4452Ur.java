package o;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.Ur  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4452Ur {
    public static final int a = 16384;
    public static final AtomicReference<byte[]> b = new AtomicReference<>();

    /* renamed from: o.Ur$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final int b;
        public final byte[] c;

        public b(byte[] bArr, int i, int i2) {
            this.c = bArr;
            this.a = i;
            this.b = i2;
        }
    }

    public static ByteBuffer a(File file) throws IOException {
        Throwable th;
        RandomAccessFile randomAccessFile;
        FileChannel channel;
        FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length <= 2147483647L) {
                if (length != 0) {
                    randomAccessFile = new RandomAccessFile(file, "r");
                    try {
                        channel = randomAccessFile.getChannel();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        MappedByteBuffer load = channel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                        try {
                            channel.close();
                        } catch (IOException unused) {
                        }
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused2) {
                        }
                        return load;
                    } catch (Throwable th3) {
                        th = th3;
                        fileChannel = channel;
                        if (fileChannel != null) {
                            try {
                                fileChannel.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (randomAccessFile != null) {
                            try {
                                randomAccessFile.close();
                            } catch (IOException unused4) {
                            }
                        }
                        throw th;
                    }
                }
                throw new IOException("File unsuitable for memory mapping");
            }
            throw new IOException("File too large to map into memory");
        } catch (Throwable th4) {
            th = th4;
            randomAccessFile = null;
        }
    }

    public static ByteBuffer b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = b.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int read = inputStream.read(andSet);
            if (read >= 0) {
                byteArrayOutputStream.write(andSet, 0, read);
            } else {
                b.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return d(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
        }
    }

    public static b c(ByteBuffer byteBuffer) {
        if (!byteBuffer.isReadOnly() && byteBuffer.hasArray()) {
            return new b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        }
        return null;
    }

    public static ByteBuffer d(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    public static byte[] e(ByteBuffer byteBuffer) {
        b c = c(byteBuffer);
        if (c != null && c.a == 0 && c.b == c.c.length) {
            return byteBuffer.array();
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[asReadOnlyBuffer.limit()];
        d(asReadOnlyBuffer);
        asReadOnlyBuffer.get(bArr);
        return bArr;
    }

    public static void f(ByteBuffer byteBuffer, File file) throws IOException {
        RandomAccessFile randomAccessFile;
        d(byteBuffer);
        FileChannel fileChannel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, FN1.c1);
        } catch (Throwable th) {
            th = th;
            randomAccessFile = null;
        }
        try {
            fileChannel = randomAccessFile.getChannel();
            fileChannel.write(byteBuffer);
            fileChannel.force(false);
            fileChannel.close();
            randomAccessFile.close();
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (IOException unused3) {
                }
            }
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    public static InputStream g(ByteBuffer byteBuffer) {
        return new a(byteBuffer);
    }

    public static void h(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        b c = c(byteBuffer);
        if (c != null) {
            byte[] bArr = c.c;
            int i = c.a;
            outputStream.write(bArr, i, c.b + i);
            return;
        }
        byte[] andSet = b.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (byteBuffer.remaining() > 0) {
            int min = Math.min(byteBuffer.remaining(), andSet.length);
            byteBuffer.get(andSet, 0, min);
            outputStream.write(andSet, 0, min);
        }
        b.set(andSet);
    }

    /* renamed from: o.Ur$a */
    /* loaded from: classes.dex */
    public static class a extends InputStream {
        public static final int Z = -1;
        public final ByteBuffer X;
        public int Y = -1;

        public a(ByteBuffer byteBuffer) {
            this.X = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.X.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i) {
            this.Y = this.X.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.X.hasRemaining()) {
                return this.X.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() throws IOException {
            int i = this.Y;
            if (i != -1) {
                this.X.position(i);
            } else {
                throw new IOException("Cannot reset to unset mark position");
            }
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            if (!this.X.hasRemaining()) {
                return -1L;
            }
            long min = Math.min(j, available());
            ByteBuffer byteBuffer = this.X;
            byteBuffer.position((int) (byteBuffer.position() + min));
            return min;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            if (this.X.hasRemaining()) {
                int min = Math.min(i2, available());
                this.X.get(bArr, i, min);
                return min;
            }
            return -1;
        }
    }
}
