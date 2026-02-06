package o;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.util.Objects;

/* loaded from: classes4.dex */
public abstract class X72 extends SimpleFileVisitor<Path> implements AA1 {
    public final InterfaceC8483oJ0<Path, IOException, FileVisitResult> X;

    /* loaded from: classes4.dex */
    public static abstract class a<T, B extends AbstractC10371w3<T, B>> extends AbstractC10371w3<T, B> {
        public InterfaceC8483oJ0<Path, IOException, FileVisitResult> a;

        public InterfaceC8483oJ0<Path, IOException, FileVisitResult> e() {
            return this.a;
        }

        public B f(InterfaceC8483oJ0<Path, IOException, FileVisitResult> interfaceC8483oJ0) {
            this.a = interfaceC8483oJ0;
            return c();
        }
    }

    public X72() {
        this.X = new InterfaceC8483oJ0() { // from class: o.V72
            @Override // o.InterfaceC8483oJ0
            public final Object apply(Object obj, Object obj2) {
                return X72.b(X72.this, (Path) obj, (IOException) obj2);
            }
        };
    }

    public static /* synthetic */ FileVisitResult a(X72 x72, Object obj, IOException iOException) {
        return super.visitFileFailed(obj, iOException);
    }

    public static /* synthetic */ FileVisitResult b(X72 x72, Object obj, IOException iOException) {
        return super.visitFileFailed(obj, iOException);
    }

    public FileVisitResult c(Path path, IOException iOException) throws IOException {
        return C4255Sq0.a(this.X.apply(path, iOException));
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFileFailed(Path path, IOException iOException) throws IOException {
        return c(N30.a(path), iOException);
    }

    public X72(a<?, ?> aVar) {
        this.X = aVar.a != null ? aVar.a : new InterfaceC8483oJ0() { // from class: o.W72
            @Override // o.InterfaceC8483oJ0
            public final Object apply(Object obj, Object obj2) {
                return X72.a(X72.this, (Path) obj, (IOException) obj2);
            }
        };
    }

    public X72(InterfaceC8483oJ0<Path, IOException, FileVisitResult> interfaceC8483oJ0) {
        Objects.requireNonNull(interfaceC8483oJ0, "visitFileFailedFunction");
        this.X = interfaceC8483oJ0;
    }
}
