package o;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;

/* loaded from: classes4.dex */
public final class Vy2 extends FilterOutputStream {

    /* loaded from: classes4.dex */
    public static class b extends AbstractC9396s3<Vy2, b> {
        @Override // o.XK0
        /* renamed from: j0 */
        public Vy2 get() throws IOException {
            return new Vy2(this);
        }
    }

    public static b j() {
        return new b();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws UncheckedIOException {
        C8643oy2.q(new InterfaceC8973qK0() { // from class: o.Uy2
            @Override // o.InterfaceC8973qK0
            public final void run() {
                super/*java.io.FilterOutputStream*/.close();
            }
        });
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws UncheckedIOException {
        C8643oy2.q(new InterfaceC8973qK0() { // from class: o.Ty2
            @Override // o.InterfaceC8973qK0
            public final void run() {
                super/*java.io.FilterOutputStream*/.flush();
            }
        });
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws UncheckedIOException {
        C8643oy2.b(new EJ0() { // from class: o.Ry2
            @Override // o.EJ0
            public final void accept(Object obj) {
                super/*java.io.FilterOutputStream*/.write((byte[]) obj);
            }
        }, bArr);
    }

    public Vy2(b bVar) throws IOException {
        super(bVar.U());
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws UncheckedIOException {
        C8643oy2.d(new ZK0() { // from class: o.Sy2
            @Override // o.ZK0
            public final void d(Object obj, Object obj2, Object obj3) {
                super/*java.io.FilterOutputStream*/.write((byte[]) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        }, bArr, Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws UncheckedIOException {
        C8643oy2.c(new XJ0() { // from class: o.Qy2
            @Override // o.XJ0
            public final void accept(int i2) {
                super/*java.io.FilterOutputStream*/.write(i2);
            }
        }, i);
    }
}
