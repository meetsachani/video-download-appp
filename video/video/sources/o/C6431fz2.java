package o;

import java.io.FilterReader;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.CharBuffer;
import o.C6431fz2;

/* renamed from: o.fz2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6431fz2 extends FilterReader {

    /* renamed from: o.fz2$b */
    /* loaded from: classes4.dex */
    public static class b extends AbstractC9396s3<C6431fz2, b> {
        public static /* synthetic */ C6431fz2 j0(b bVar) {
            bVar.getClass();
            return new C6431fz2(bVar);
        }

        @Override // o.XK0
        /* renamed from: k0 */
        public C6431fz2 get() {
            return (C6431fz2) C8643oy2.j(new XK0() { // from class: o.gz2
                @Override // o.XK0
                public final Object get() {
                    return C6431fz2.b.j0(C6431fz2.b.this);
                }
            });
        }
    }

    public static b n() {
        return new b();
    }

    @Override // java.io.FilterReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws UncheckedIOException {
        C8643oy2.q(new InterfaceC8973qK0() { // from class: o.Zy2
            @Override // o.InterfaceC8973qK0
            public final void run() {
                super/*java.io.FilterReader*/.close();
            }
        });
    }

    @Override // java.io.FilterReader, java.io.Reader
    public void mark(int i) throws UncheckedIOException {
        C8643oy2.c(new XJ0() { // from class: o.cz2
            @Override // o.XJ0
            public final void accept(int i2) {
                super/*java.io.FilterReader*/.mark(i2);
            }
        }, i);
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read() throws UncheckedIOException {
        return C8643oy2.m(new ZJ0() { // from class: o.Wy2
            @Override // o.ZJ0
            public final int getAsInt() {
                int read;
                read = super/*java.io.FilterReader*/.read();
                return read;
            }
        });
    }

    @Override // java.io.FilterReader, java.io.Reader
    public boolean ready() throws UncheckedIOException {
        return C8643oy2.l(new InterfaceC9947uJ0() { // from class: o.bz2
            @Override // o.InterfaceC9947uJ0
            public final boolean getAsBoolean() {
                boolean ready;
                ready = super/*java.io.FilterReader*/.ready();
                return ready;
            }
        });
    }

    @Override // java.io.FilterReader, java.io.Reader
    public void reset() throws UncheckedIOException {
        C8643oy2.q(new InterfaceC8973qK0() { // from class: o.dz2
            @Override // o.InterfaceC8973qK0
            public final void run() {
                super/*java.io.FilterReader*/.reset();
            }
        });
    }

    @Override // java.io.FilterReader, java.io.Reader
    public long skip(long j) throws UncheckedIOException {
        return ((Long) C8643oy2.f(new RJ0() { // from class: o.ez2
            @Override // o.RJ0
            public final Object apply(Object obj) {
                Long valueOf;
                valueOf = Long.valueOf(super/*java.io.FilterReader*/.skip(((Long) obj).longValue()));
                return valueOf;
            }
        }, Long.valueOf(j))).longValue();
    }

    public C6431fz2(b bVar) throws IOException {
        super(bVar.X());
    }

    @Override // java.io.Reader
    public int read(char[] cArr) throws UncheckedIOException {
        return ((Integer) C8643oy2.f(new RJ0() { // from class: o.az2
            @Override // o.RJ0
            public final Object apply(Object obj) {
                Integer valueOf;
                valueOf = Integer.valueOf(super/*java.io.Reader*/.read((char[]) obj));
                return valueOf;
            }
        }, cArr)).intValue();
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read(char[] cArr, int i, int i2) throws UncheckedIOException {
        return ((Integer) C8643oy2.h(new InterfaceC5305bL0() { // from class: o.Xy2
            @Override // o.InterfaceC5305bL0
            public final Object b(Object obj, Object obj2, Object obj3) {
                Integer valueOf;
                valueOf = Integer.valueOf(super/*java.io.FilterReader*/.read((char[]) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue()));
                return valueOf;
            }
        }, cArr, Integer.valueOf(i), Integer.valueOf(i2))).intValue();
    }

    @Override // java.io.Reader, java.lang.Readable
    public int read(CharBuffer charBuffer) throws UncheckedIOException {
        return ((Integer) C8643oy2.f(new RJ0() { // from class: o.Yy2
            @Override // o.RJ0
            public final Object apply(Object obj) {
                Integer valueOf;
                valueOf = Integer.valueOf(super/*java.io.Reader*/.read((CharBuffer) obj));
                return valueOf;
            }
        }, charBuffer)).intValue();
    }
}
