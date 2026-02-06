package o;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/* loaded from: classes4.dex */
public class CA1 extends N0 {
    public final AA1 Z;

    public CA1(AA1 aa1) {
        this.Z = aa1 == null ? C8127mr1.Y : aa1;
    }

    public static /* synthetic */ FileVisitResult t(CA1 ca1, Path path, BasicFileAttributes basicFileAttributes) {
        boolean isDirectory;
        ca1.getClass();
        isDirectory = Files.isDirectory(path, new LinkOption[0]);
        if (isDirectory) {
            return ca1.Z.postVisitDirectory(path, null);
        }
        return ca1.r(path, basicFileAttributes);
    }

    @Override // o.HJ0, o.InterfaceC6430fz1
    public FileVisitResult a(final Path path, final BasicFileAttributes basicFileAttributes) {
        return j(new XK0() { // from class: o.BA1
            @Override // o.XK0
            public final Object get() {
                return CA1.t(CA1.this, path, basicFileAttributes);
            }
        });
    }

    @Override // o.N0, o.HJ0, java.io.FileFilter
    public boolean accept(File file) {
        FileVisitResult fileVisitResult;
        Path path;
        FileVisitResult fileVisitResult2;
        try {
            path = file.toPath();
            FileVisitResult r = r(path, file.exists() ? C11130zA1.D0(path) : null);
            fileVisitResult2 = FileVisitResult.CONTINUE;
            return r == fileVisitResult2;
        } catch (IOException e) {
            FileVisitResult k = k(e);
            fileVisitResult = FileVisitResult.CONTINUE;
            return k == fileVisitResult;
        }
    }

    @Override // o.N0
    public FileVisitResult r(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return this.Z.visitFile(path, basicFileAttributes);
    }

    @Override // o.N0, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) throws IOException {
        return r(N30.a(obj), basicFileAttributes);
    }

    @Override // o.N0, o.HJ0, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        FileVisitResult fileVisitResult;
        Path path;
        Path resolve;
        FileVisitResult fileVisitResult2;
        try {
            path = file.toPath();
            resolve = path.resolve(str);
            FileVisitResult a = a(resolve, C11130zA1.D0(resolve));
            fileVisitResult2 = FileVisitResult.CONTINUE;
            return a == fileVisitResult2;
        } catch (IOException e) {
            FileVisitResult k = k(e);
            fileVisitResult = FileVisitResult.CONTINUE;
            return k == fileVisitResult;
        }
    }
}
