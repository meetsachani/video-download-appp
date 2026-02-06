package o;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: o.uK1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9952uK1 extends FilterOutputStream {

    /* renamed from: o.uK1$a */
    /* loaded from: classes4.dex */
    public static class a extends AbstractC9396s3<C9952uK1, a> {
        @Override // o.XK0
        /* renamed from: j0 */
        public C9952uK1 get() throws IOException {
            return new C9952uK1(this);
        }
    }

    public C9952uK1(a aVar) throws IOException {
        super(aVar.U());
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        C7743lL0.w(((FilterOutputStream) this).out, new EJ0() { // from class: o.tK1
            @Override // o.EJ0
            public final void accept(Object obj) {
                C9952uK1.this.f((IOException) obj);
            }
        });
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        try {
            ((FilterOutputStream) this).out.flush();
        } catch (IOException e) {
            f(e);
        }
    }

    public C9952uK1 h(OutputStream outputStream) {
        ((FilterOutputStream) this).out = outputStream;
        return this;
    }

    public OutputStream i() {
        return ((FilterOutputStream) this).out;
    }

    public void j(int i, long j) throws IOException {
        while (true) {
            long j2 = j - 1;
            if (j > 0) {
                write(i);
                j = j2;
            } else {
                return;
            }
        }
    }

    public void k(byte[] bArr, int i, int i2, long j) throws IOException {
        while (true) {
            long j2 = j - 1;
            if (j > 0) {
                write(bArr, i, i2);
                j = j2;
            } else {
                return;
            }
        }
    }

    public void l(byte[] bArr, long j) throws IOException {
        while (true) {
            long j2 = j - 1;
            if (j > 0) {
                write(bArr);
                j = j2;
            } else {
                return;
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        try {
            int s0 = C7743lL0.s0(bArr);
            d(s0);
            ((FilterOutputStream) this).out.write(bArr);
            a(s0);
        } catch (IOException e) {
            f(e);
        }
    }

    public C9952uK1(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            d(i2);
            ((FilterOutputStream) this).out.write(bArr, i, i2);
            a(i2);
        } catch (IOException e) {
            f(e);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        try {
            d(1);
            ((FilterOutputStream) this).out.write(i);
            a(1);
        } catch (IOException e) {
            f(e);
        }
    }

    public void a(int i) throws IOException {
    }

    public void d(int i) throws IOException {
    }

    public void f(IOException iOException) throws IOException {
        throw iOException;
    }
}
