package o;

import java.io.IOException;
import java.io.OutputStream;
import java.util.function.Function;
import java.util.function.Supplier;

/* renamed from: o.Mp */
/* loaded from: classes4.dex */
public class C3663Mp extends OutputStream {
    public static final C3663Mp Y = new C3663Mp();
    public final Function<String, Throwable> X;

    public C3663Mp() {
        this(new Function() { // from class: o.Kp
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C3663Mp.d((String) obj);
            }
        });
    }

    public static /* synthetic */ Throwable a(IOException iOException, String str) {
        return iOException;
    }

    public static /* synthetic */ Throwable d(String str) {
        return new IOException("Broken output stream: " + str);
    }

    public static /* synthetic */ Throwable f(Throwable th, String str) {
        return th;
    }

    public static /* synthetic */ Throwable h(Supplier supplier, String str) {
        return (Throwable) supplier.get();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        throw i("close()");
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        throw i("flush()");
    }

    public final RuntimeException i(String str) {
        return C7086ie0.g(this.X.apply(str));
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        throw i("write(int)");
    }

    public C3663Mp(Function<String, Throwable> function) {
        this.X = function;
    }

    @Deprecated
    public C3663Mp(final IOException iOException) {
        this(new Function() { // from class: o.Jp
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C3663Mp.a(iOException, (String) obj);
            }
        });
    }

    @Deprecated
    public C3663Mp(final Supplier<Throwable> supplier) {
        this.X = new Function() { // from class: o.Ip
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C3663Mp.h(supplier, (String) obj);
            }
        };
    }

    public C3663Mp(final Throwable th) {
        this(new Function() { // from class: o.Lp
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C3663Mp.f(th, (String) obj);
            }
        });
    }
}
