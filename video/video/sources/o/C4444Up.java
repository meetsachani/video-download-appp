package o;

import java.io.IOException;
import java.io.Writer;
import java.util.function.Supplier;

/* renamed from: o.Up */
/* loaded from: classes4.dex */
public class C4444Up extends Writer {
    public static final C4444Up Y = new C4444Up();
    public final Supplier<Throwable> X;

    public C4444Up() {
        this(new Supplier() { // from class: o.Rp
            @Override // java.util.function.Supplier
            public final Object get() {
                return C4444Up.h();
            }
        });
    }

    public static /* synthetic */ Throwable d(IOException iOException) {
        return iOException;
    }

    public static /* synthetic */ Throwable f(Throwable th) {
        return th;
    }

    public static /* synthetic */ Throwable h() {
        return new IOException("Broken writer");
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        throw i();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        throw i();
    }

    public final RuntimeException i() {
        return C7086ie0.g(this.X.get());
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        throw i();
    }

    @Deprecated
    public C4444Up(final IOException iOException) {
        this(new Supplier() { // from class: o.Tp
            @Override // java.util.function.Supplier
            public final Object get() {
                return C4444Up.d(iOException);
            }
        });
    }

    public C4444Up(Supplier<Throwable> supplier) {
        this.X = supplier;
    }

    public C4444Up(final Throwable th) {
        this(new Supplier() { // from class: o.Sp
            @Override // java.util.function.Supplier
            public final Object get() {
                return C4444Up.f(th);
            }
        });
    }
}
