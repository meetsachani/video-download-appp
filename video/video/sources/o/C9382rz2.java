package o;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Writer;

/* renamed from: o.rz2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9382rz2 extends FilterWriter {

    /* renamed from: o.rz2$b */
    /* loaded from: classes4.dex */
    public static class b extends AbstractC9396s3<C9382rz2, b> {
        @Override // o.XK0
        /* renamed from: j0 */
        public C9382rz2 get() throws IOException {
            return new C9382rz2(this);
        }
    }

    public static b p() {
        return new b();
    }

    @Override // java.io.FilterWriter, java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws UncheckedIOException {
        C8643oy2.q(new InterfaceC8973qK0() { // from class: o.nz2
            @Override // o.InterfaceC8973qK0
            public final void run() {
                super/*java.io.FilterWriter*/.close();
            }
        });
    }

    @Override // java.io.FilterWriter, java.io.Writer, java.io.Flushable
    public void flush() throws UncheckedIOException {
        C8643oy2.q(new InterfaceC8973qK0() { // from class: o.lz2
            @Override // o.InterfaceC8973qK0
            public final void run() {
                super/*java.io.FilterWriter*/.flush();
            }
        });
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws UncheckedIOException {
        C8643oy2.b(new EJ0() { // from class: o.oz2
            @Override // o.EJ0
            public final void accept(Object obj) {
                super/*java.io.Writer*/.write((char[]) obj);
            }
        }, cArr);
    }

    public C9382rz2(b bVar) throws IOException {
        super(bVar.Y());
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(char[] cArr, int i, int i2) throws UncheckedIOException {
        C8643oy2.d(new ZK0() { // from class: o.kz2
            @Override // o.ZK0
            public final void d(Object obj, Object obj2, Object obj3) {
                super/*java.io.FilterWriter*/.write((char[]) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        }, cArr, Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(int i) throws UncheckedIOException {
        C8643oy2.c(new XJ0() { // from class: o.qz2
            @Override // o.XJ0
            public final void accept(int i2) {
                super/*java.io.FilterWriter*/.write(i2);
            }
        }, i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) throws UncheckedIOException {
        return (Writer) C8643oy2.f(new RJ0() { // from class: o.iz2
            @Override // o.RJ0
            public final Object apply(Object obj) {
                Writer append;
                append = super/*java.io.Writer*/.append(((Character) obj).charValue());
                return append;
            }
        }, Character.valueOf(c));
    }

    @Override // java.io.Writer
    public void write(String str) throws UncheckedIOException {
        C8643oy2.b(new EJ0() { // from class: o.pz2
            @Override // o.EJ0
            public final void accept(Object obj) {
                super/*java.io.Writer*/.write((String) obj);
            }
        }, str);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) throws UncheckedIOException {
        return (Writer) C8643oy2.f(new RJ0() { // from class: o.hz2
            @Override // o.RJ0
            public final Object apply(Object obj) {
                Writer append;
                append = super/*java.io.Writer*/.append((CharSequence) obj);
                return append;
            }
        }, charSequence);
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(String str, int i, int i2) throws UncheckedIOException {
        C8643oy2.d(new ZK0() { // from class: o.jz2
            @Override // o.ZK0
            public final void d(Object obj, Object obj2, Object obj3) {
                super/*java.io.FilterWriter*/.write((String) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        }, str, Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) throws UncheckedIOException {
        return (Writer) C8643oy2.h(new InterfaceC5305bL0() { // from class: o.mz2
            @Override // o.InterfaceC5305bL0
            public final Object b(Object obj, Object obj2, Object obj3) {
                Writer append;
                append = super/*java.io.Writer*/.append((CharSequence) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
                return append;
            }
        }, charSequence, Integer.valueOf(i), Integer.valueOf(i2));
    }
}
