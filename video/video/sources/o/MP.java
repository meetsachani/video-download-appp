package o;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.util.Arrays;
import java.util.Objects;
import o.HQ;

/* loaded from: classes4.dex */
public class MP extends NQ {
    public final CopyOption[] b1;
    public final Path c1;
    public final Path d1;

    public MP(HQ.j jVar, Path path, Path path2, CopyOption... copyOptionArr) {
        super(jVar);
        this.c1 = path;
        this.d1 = path2;
        this.b1 = v(copyOptionArr);
    }

    public static CopyOption[] v(CopyOption... copyOptionArr) {
        if (copyOptionArr == null) {
            return C11130zA1.c;
        }
        return (CopyOption[]) copyOptionArr.clone();
    }

    @Override // o.NQ
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        MP mp = (MP) obj;
        if (Arrays.equals(this.b1, mp.b1) && Objects.equals(this.c1, mp.c1) && Objects.equals(this.d1, mp.d1)) {
            return true;
        }
        return false;
    }

    @Override // o.NQ
    public int hashCode() {
        return (((super.hashCode() * 31) + Arrays.hashCode(this.b1)) * 31) + Objects.hash(this.c1, this.d1);
    }

    @Override // o.NQ
    public FileVisitResult k(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        boolean notExists;
        Path u = u(path);
        notExists = Files.notExists(u, new LinkOption[0]);
        if (notExists) {
            Files.createDirectory(u, new FileAttribute[0]);
        }
        return super.k(path, basicFileAttributes);
    }

    @Override // o.NQ
    public FileVisitResult n(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        FileVisitResult fileVisitResult;
        Path u = u(path);
        if (d(path, basicFileAttributes)) {
            q(path, u);
            m(u, basicFileAttributes);
        }
        fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResult;
    }

    @Override // o.NQ, java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return k(N30.a(path), basicFileAttributes);
    }

    public void q(Path path, Path path2) throws IOException {
        Files.copy(path, path2, this.b1);
    }

    public CopyOption[] r() {
        return (CopyOption[]) this.b1.clone();
    }

    public Path s() {
        return this.c1;
    }

    public Path t() {
        return this.d1;
    }

    public final Path u(Path path) {
        Path relativize;
        Path path2 = this.d1;
        relativize = this.c1.relativize(path);
        return C11130zA1.N0(path2, relativize);
    }

    @Override // o.NQ, java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return n(N30.a(path), basicFileAttributes);
    }

    public MP(HQ.j jVar, InterfaceC6430fz1 interfaceC6430fz1, InterfaceC6430fz1 interfaceC6430fz12, Path path, Path path2, CopyOption... copyOptionArr) {
        super(jVar, interfaceC6430fz1, interfaceC6430fz12);
        this.c1 = path;
        this.d1 = path2;
        this.b1 = v(copyOptionArr);
    }
}
