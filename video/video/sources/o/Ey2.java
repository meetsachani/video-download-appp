package o;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.CharBuffer;
import o.Ey2;

/* loaded from: classes4.dex */
public final class Ey2 extends BufferedReader {

    /* loaded from: classes4.dex */
    public static class b extends AbstractC9396s3<Ey2, b> {
        public static /* synthetic */ Ey2 j0(b bVar) {
            bVar.getClass();
            return new Ey2(bVar);
        }

        @Override // o.XK0
        /* renamed from: k0 */
        public Ey2 get() {
            return (Ey2) C8643oy2.j(new XK0() { // from class: o.Fy2
                @Override // o.XK0
                public final Object get() {
                    return Ey2.b.j0(Ey2.b.this);
                }
            });
        }
    }

    public static b o() {
        return new b();
    }

    @Override // java.io.BufferedReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws UncheckedIOException {
        C8643oy2.q(new InterfaceC8973qK0() { // from class: o.Dy2
            @Override // o.InterfaceC8973qK0
            public final void run() {
                super/*java.io.BufferedReader*/.close();
            }
        });
    }

    @Override // java.io.BufferedReader, java.io.Reader
    public void mark(int i) throws UncheckedIOException {
        C8643oy2.c(new XJ0() { // from class: o.vy2
            @Override // o.XJ0
            public final void accept(int i2) {
                super/*java.io.BufferedReader*/.mark(i2);
            }
        }, i);
    }

    @Override // java.io.BufferedReader, java.io.Reader
    public int read() throws UncheckedIOException {
        return C8643oy2.m(new ZJ0() { // from class: o.Ay2
            @Override // o.ZJ0
            public final int getAsInt() {
                int read;
                read = super/*java.io.BufferedReader*/.read();
                return read;
            }
        });
    }

    @Override // java.io.BufferedReader
    public String readLine() throws UncheckedIOException {
        return (String) C8643oy2.j(new XK0() { // from class: o.wy2
            @Override // o.XK0
            public final Object get() {
                String readLine;
                readLine = super/*java.io.BufferedReader*/.readLine();
                return readLine;
            }
        });
    }

    @Override // java.io.BufferedReader, java.io.Reader
    public boolean ready() throws UncheckedIOException {
        return C8643oy2.l(new InterfaceC9947uJ0() { // from class: o.Cy2
            @Override // o.InterfaceC9947uJ0
            public final boolean getAsBoolean() {
                boolean ready;
                ready = super/*java.io.BufferedReader*/.ready();
                return ready;
            }
        });
    }

    @Override // java.io.BufferedReader, java.io.Reader
    public void reset() throws UncheckedIOException {
        C8643oy2.q(new InterfaceC8973qK0() { // from class: o.By2
            @Override // o.InterfaceC8973qK0
            public final void run() {
                super/*java.io.BufferedReader*/.reset();
            }
        });
    }

    @Override // java.io.BufferedReader, java.io.Reader
    public long skip(long j) throws UncheckedIOException {
        return ((Long) C8643oy2.f(new RJ0() { // from class: o.zy2
            @Override // o.RJ0
            public final Object apply(Object obj) {
                Long valueOf;
                valueOf = Long.valueOf(super/*java.io.BufferedReader*/.skip(((Long) obj).longValue()));
                return valueOf;
            }
        }, Long.valueOf(j))).longValue();
    }

    public Ey2(b bVar) throws IOException {
        super(bVar.X(), bVar.L());
    }

    @Override // java.io.Reader
    public int read(char[] cArr) throws UncheckedIOException {
        return ((Integer) C8643oy2.f(new RJ0() { // from class: o.uy2
            @Override // o.RJ0
            public final Object apply(Object obj) {
                Integer valueOf;
                valueOf = Integer.valueOf(super/*java.io.Reader*/.read((char[]) obj));
                return valueOf;
            }
        }, cArr)).intValue();
    }

    @Override // java.io.BufferedReader, java.io.Reader
    public int read(char[] cArr, int i, int i2) throws UncheckedIOException {
        return ((Integer) C8643oy2.h(new InterfaceC5305bL0() { // from class: o.yy2
            @Override // o.InterfaceC5305bL0
            public final Object b(Object obj, Object obj2, Object obj3) {
                Integer valueOf;
                valueOf = Integer.valueOf(super/*java.io.BufferedReader*/.read((char[]) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue()));
                return valueOf;
            }
        }, cArr, Integer.valueOf(i), Integer.valueOf(i2))).intValue();
    }

    @Override // java.io.Reader, java.lang.Readable
    public int read(CharBuffer charBuffer) throws UncheckedIOException {
        return ((Integer) C8643oy2.f(new RJ0() { // from class: o.xy2
            @Override // o.RJ0
            public final Object apply(Object obj) {
                Integer valueOf;
                valueOf = Integer.valueOf(super/*java.io.Reader*/.read((CharBuffer) obj));
                return valueOf;
            }
        }, charBuffer)).intValue();
    }
}
