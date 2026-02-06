package o;

import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.file.StandardOpenOption;

/* loaded from: classes4.dex */
public final class GN1 extends OutputStream {
    public final RandomAccessFile X;

    /* loaded from: classes4.dex */
    public static final class b extends AbstractC9396s3<GN1, b> {
        @Override // o.XK0
        /* renamed from: j0 */
        public GN1 get() throws IOException {
            return new GN1(this);
        }

        public b() {
            StandardOpenOption standardOpenOption;
            standardOpenOption = StandardOpenOption.WRITE;
            h0(standardOpenOption);
        }
    }

    public static b a() {
        return new b();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.X.close();
        super.close();
    }

    public RandomAccessFile d() {
        return this.X;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.X.getChannel().force(true);
        super.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.X.write(i);
    }

    public GN1(b bVar) throws IOException {
        this.X = bVar.W();
    }
}
