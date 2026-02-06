package o;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

@Deprecated
/* renamed from: o.xU1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10724xU1 extends BufferedOutputStream {
    public boolean X;

    public C10724xU1(OutputStream outputStream) {
        super(outputStream);
    }

    public void a(OutputStream outputStream) {
        C9542sf.i(this.X);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.X = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.X = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th != null) {
            TD2.H1(th);
        }
    }

    public C10724xU1(OutputStream outputStream, int i) {
        super(outputStream, i);
    }
}
