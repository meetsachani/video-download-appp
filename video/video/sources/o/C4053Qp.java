package o;

import java.io.IOException;
import java.io.Reader;
import java.util.function.Supplier;

/* renamed from: o.Qp */
/* loaded from: classes4.dex */
public class C4053Qp extends Reader {
    public static final C4053Qp Y = new C4053Qp();
    public final Supplier<Throwable> X;

    public C4053Qp() {
        this(new Supplier() { // from class: o.Pp
            @Override // java.util.function.Supplier
            public final Object get() {
                return C4053Qp.d();
            }
        });
    }

    public static /* synthetic */ Throwable a(IOException iOException) {
        return iOException;
    }

    public static /* synthetic */ Throwable d() {
        return new IOException("Broken reader");
    }

    public static /* synthetic */ Throwable f(Throwable th) {
        return th;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        throw h();
    }

    public final RuntimeException h() {
        return C7086ie0.g(this.X.get());
    }

    @Override // java.io.Reader
    public void mark(int i) throws IOException {
        throw h();
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        throw h();
    }

    @Override // java.io.Reader
    public boolean ready() throws IOException {
        throw h();
    }

    @Override // java.io.Reader
    public void reset() throws IOException {
        throw h();
    }

    @Override // java.io.Reader
    public long skip(long j) throws IOException {
        throw h();
    }

    @Deprecated
    public C4053Qp(final IOException iOException) {
        this(new Supplier() { // from class: o.Np
            @Override // java.util.function.Supplier
            public final Object get() {
                return C4053Qp.a(iOException);
            }
        });
    }

    public C4053Qp(Supplier<Throwable> supplier) {
        this.X = supplier;
    }

    public C4053Qp(final Throwable th) {
        this(new Supplier() { // from class: o.Op
            @Override // java.util.function.Supplier
            public final Object get() {
                return C4053Qp.f(th);
            }
        });
    }
}
