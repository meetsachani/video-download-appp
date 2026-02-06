package o;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: o.i20  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6940i20 extends InputStream {
    public final InheritableThreadLocal<InputStream> X = new InheritableThreadLocal<>();

    public InputStream a(InputStream inputStream) {
        InputStream inputStream2 = this.X.get();
        this.X.set(inputStream);
        return inputStream2;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        C7743lL0.v(this.X.get());
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        InputStream inputStream = this.X.get();
        if (inputStream != null) {
            return inputStream.read();
        }
        return -1;
    }
}
