package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import o.Oy2;

/* loaded from: classes4.dex */
public final class Oy2 extends FilterInputStream {

    /* loaded from: classes4.dex */
    public static class b extends AbstractC9396s3<Oy2, b> {
        public static /* synthetic */ Oy2 j0(b bVar) {
            bVar.getClass();
            return new Oy2(bVar);
        }

        @Override // o.XK0
        /* renamed from: k0 */
        public Oy2 get() {
            return (Oy2) C8643oy2.j(new XK0() { // from class: o.Py2
                @Override // o.XK0
                public final Object get() {
                    return Oy2.b.j0(Oy2.b.this);
                }
            });
        }
    }

    public static b l() {
        return new b();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws UncheckedIOException {
        return C8643oy2.m(new ZJ0() { // from class: o.Ly2
            @Override // o.ZJ0
            public final int getAsInt() {
                int available;
                available = super/*java.io.FilterInputStream*/.available();
                return available;
            }
        });
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws UncheckedIOException {
        C8643oy2.q(new InterfaceC8973qK0() { // from class: o.Ky2
            @Override // o.InterfaceC8973qK0
            public final void run() {
                super/*java.io.FilterInputStream*/.close();
            }
        });
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws UncheckedIOException {
        return C8643oy2.m(new ZJ0() { // from class: o.Hy2
            @Override // o.ZJ0
            public final int getAsInt() {
                int read;
                read = super/*java.io.FilterInputStream*/.read();
                return read;
            }
        });
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws UncheckedIOException {
        C8643oy2.q(new InterfaceC8973qK0() { // from class: o.Iy2
            @Override // o.InterfaceC8973qK0
            public final void run() {
                super/*java.io.FilterInputStream*/.reset();
            }
        });
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws UncheckedIOException {
        return ((Long) C8643oy2.f(new RJ0() { // from class: o.My2
            @Override // o.RJ0
            public final Object apply(Object obj) {
                Long valueOf;
                valueOf = Long.valueOf(super/*java.io.FilterInputStream*/.skip(((Long) obj).longValue()));
                return valueOf;
            }
        }, Long.valueOf(j))).longValue();
    }

    public Oy2(b bVar) throws IOException {
        super(bVar.S());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws UncheckedIOException {
        return ((Integer) C8643oy2.f(new RJ0() { // from class: o.Ny2
            @Override // o.RJ0
            public final Object apply(Object obj) {
                Integer valueOf;
                valueOf = Integer.valueOf(super/*java.io.FilterInputStream*/.read((byte[]) obj));
                return valueOf;
            }
        }, bArr)).intValue();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws UncheckedIOException {
        return ((Integer) C8643oy2.h(new InterfaceC5305bL0() { // from class: o.Jy2
            @Override // o.InterfaceC5305bL0
            public final Object b(Object obj, Object obj2, Object obj3) {
                Integer valueOf;
                valueOf = Integer.valueOf(super/*java.io.FilterInputStream*/.read((byte[]) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue()));
                return valueOf;
            }
        }, bArr, Integer.valueOf(i), Integer.valueOf(i2))).intValue();
    }
}
