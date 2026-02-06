package o;

import java.io.IOException;
import java.io.InputStream;
import java.util.function.Supplier;

/* renamed from: o.Hp */
/* loaded from: classes4.dex */
public class C3174Hp extends InputStream {
    public static final C3174Hp Y = new C3174Hp();
    public final Supplier<Throwable> X;

    public C3174Hp() {
        this(new Supplier() { // from class: o.Ep
            @Override // java.util.function.Supplier
            public final Object get() {
                return C3174Hp.f();
            }
        });
    }

    public static /* synthetic */ Throwable a(IOException iOException) {
        return iOException;
    }

    public static /* synthetic */ Throwable d(Throwable th) {
        return th;
    }

    public static /* synthetic */ Throwable f() {
        return new IOException("Broken input stream");
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        throw i();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        throw i();
    }

    public Throwable h() {
        return this.X.get();
    }

    public final RuntimeException i() {
        return C7086ie0.g(h());
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        throw i();
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        throw i();
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        throw i();
    }

    @Deprecated
    public C3174Hp(final IOException iOException) {
        this(new Supplier() { // from class: o.Gp
            @Override // java.util.function.Supplier
            public final Object get() {
                return C3174Hp.a(iOException);
            }
        });
    }

    public C3174Hp(Supplier<Throwable> supplier) {
        this.X = supplier;
    }

    public C3174Hp(final Throwable th) {
        this(new Supplier() { // from class: o.Fp
            @Override // java.util.function.Supplier
            public final Object get() {
                return C3174Hp.d(th);
            }
        });
    }
}
