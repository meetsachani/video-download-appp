package o;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: o.j20  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7181j20 extends OutputStream {
    public final InheritableThreadLocal<OutputStream> X = new InheritableThreadLocal<>();

    public OutputStream a(OutputStream outputStream) {
        OutputStream outputStream2 = this.X.get();
        this.X.set(outputStream);
        return outputStream2;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        C7743lL0.v(this.X.get());
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        OutputStream outputStream = this.X.get();
        if (outputStream != null) {
            outputStream.flush();
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        OutputStream outputStream = this.X.get();
        if (outputStream != null) {
            outputStream.write(i);
        }
    }
}
