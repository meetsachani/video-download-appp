package o;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;
import java.util.function.UnaryOperator;
import o.HQ;
import o.X72;

/* loaded from: classes4.dex */
public class NQ extends X72 {
    public static final String[] a1 = new String[0];
    public final HQ.j Y;
    public final InterfaceC6430fz1 Y0;
    public final InterfaceC6430fz1 Z;
    public final UnaryOperator<Path> Z0;

    /* loaded from: classes4.dex */
    public static abstract class a<T, B extends a<T, B>> extends X72.a<T, B> {
        public HQ.j b = NQ.h();
        public InterfaceC6430fz1 c = NQ.g();
        public InterfaceC6430fz1 d = NQ.e();
        public UnaryOperator<Path> e = NQ.f();

        @Override // o.X72.a
        public /* bridge */ /* synthetic */ AbstractC10371w3 f(InterfaceC8483oJ0 interfaceC8483oJ0) {
            return super.f(interfaceC8483oJ0);
        }

        public InterfaceC6430fz1 g() {
            return this.d;
        }

        public UnaryOperator<Path> h() {
            return this.e;
        }

        public InterfaceC6430fz1 i() {
            return this.c;
        }

        public HQ.j j() {
            return this.b;
        }

        public B k(InterfaceC6430fz1 interfaceC6430fz1) {
            if (interfaceC6430fz1 == null) {
                interfaceC6430fz1 = NQ.e();
            }
            this.d = interfaceC6430fz1;
            return (B) c();
        }

        public B l(UnaryOperator<Path> unaryOperator) {
            if (unaryOperator == null) {
                unaryOperator = NQ.f();
            }
            this.e = unaryOperator;
            return (B) c();
        }

        public B m(InterfaceC6430fz1 interfaceC6430fz1) {
            if (interfaceC6430fz1 == null) {
                interfaceC6430fz1 = NQ.g();
            }
            this.c = interfaceC6430fz1;
            return (B) c();
        }

        public B n(HQ.j jVar) {
            if (jVar == null) {
                jVar = NQ.h();
            }
            this.b = jVar;
            return (B) c();
        }
    }

    /* loaded from: classes4.dex */
    public static class b extends a<NQ, b> {
        @Override // o.XK0
        /* renamed from: o */
        public NQ get() {
            return new NQ(this);
        }
    }

    public NQ(a<?, ?> aVar) {
        super(aVar);
        this.Y = aVar.j();
        this.Z = aVar.i();
        this.Y0 = aVar.g();
        this.Z0 = aVar.h();
    }

    public static HJ0 e() {
        return Cu2.Z;
    }

    public static UnaryOperator<Path> f() {
        return UnaryOperator.identity();
    }

    public static HJ0 g() {
        FileVisitResult fileVisitResult;
        FileVisitResult fileVisitResult2;
        fileVisitResult = FileVisitResult.TERMINATE;
        fileVisitResult2 = FileVisitResult.CONTINUE;
        return new C8339nj2(fileVisitResult, fileVisitResult2);
    }

    public static HQ.j h() {
        return HQ.d();
    }

    public static NQ o() {
        return new b().n(HQ.b()).get();
    }

    public static NQ p() {
        return new b().n(HQ.d()).get();
    }

    public boolean d(Path path, BasicFileAttributes basicFileAttributes) {
        boolean exists;
        FileVisitResult fileVisitResult;
        exists = Files.exists(path, new LinkOption[0]);
        if (exists) {
            FileVisitResult a2 = this.Z.a(path, basicFileAttributes);
            fileVisitResult = FileVisitResult.CONTINUE;
            if (a2 == fileVisitResult) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NQ)) {
            return false;
        }
        return Objects.equals(this.Y, ((NQ) obj).Y);
    }

    public int hashCode() {
        return Objects.hash(this.Y);
    }

    public HQ.j i() {
        return this.Y;
    }

    public FileVisitResult j(Path path, IOException iOException) throws IOException {
        FileVisitResult fileVisitResult;
        l(N30.a(this.Z0.apply(path)), iOException);
        fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResult;
    }

    public FileVisitResult k(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        FileVisitResult fileVisitResult;
        FileVisitResult fileVisitResult2;
        FileVisitResult fileVisitResult3;
        FileVisitResult a2 = this.Y0.a(path, basicFileAttributes);
        fileVisitResult = FileVisitResult.CONTINUE;
        if (a2 != fileVisitResult) {
            fileVisitResult3 = FileVisitResult.SKIP_SUBTREE;
            return fileVisitResult3;
        }
        fileVisitResult2 = FileVisitResult.CONTINUE;
        return fileVisitResult2;
    }

    public void l(Path path, IOException iOException) {
        this.Y.b().a();
    }

    public void m(Path path, BasicFileAttributes basicFileAttributes) {
        long size;
        this.Y.c().a();
        HQ.e a2 = this.Y.a();
        size = basicFileAttributes.size();
        a2.add(size);
    }

    public FileVisitResult n(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        FileVisitResult fileVisitResult;
        if (d(path, basicFileAttributes)) {
            m(path, basicFileAttributes);
        }
        fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResult;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult postVisitDirectory(Path path, IOException iOException) throws IOException {
        return j(N30.a(path), iOException);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return k(N30.a(path), basicFileAttributes);
    }

    public String toString() {
        return this.Y.toString();
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return n(N30.a(path), basicFileAttributes);
    }

    public NQ(HQ.j jVar) {
        this(new b().n(jVar));
    }

    public NQ(HQ.j jVar, InterfaceC6430fz1 interfaceC6430fz1, InterfaceC6430fz1 interfaceC6430fz12) {
        Objects.requireNonNull(jVar, "pathCounters");
        this.Y = jVar;
        Objects.requireNonNull(interfaceC6430fz1, "fileFilter");
        this.Z = interfaceC6430fz1;
        Objects.requireNonNull(interfaceC6430fz12, "directoryFilter");
        this.Y0 = interfaceC6430fz12;
        this.Z0 = UnaryOperator.identity();
    }

    @Deprecated
    public NQ(HQ.j jVar, InterfaceC6430fz1 interfaceC6430fz1, InterfaceC6430fz1 interfaceC6430fz12, InterfaceC8483oJ0<Path, IOException, FileVisitResult> interfaceC8483oJ0) {
        super(interfaceC8483oJ0);
        Objects.requireNonNull(jVar, "pathCounters");
        this.Y = jVar;
        Objects.requireNonNull(interfaceC6430fz1, "fileFilter");
        this.Z = interfaceC6430fz1;
        Objects.requireNonNull(interfaceC6430fz12, "directoryFilter");
        this.Y0 = interfaceC6430fz12;
        this.Z0 = UnaryOperator.identity();
    }
}
