package o;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: o.b1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5224b1 extends InputStream {
    public boolean X;

    public void a() throws IOException {
        YP0.a(!isClosed());
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.X = true;
    }

    public void d(boolean z) {
        this.X = z;
    }

    public boolean isClosed() {
        return this.X;
    }
}
