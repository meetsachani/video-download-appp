package o;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/* renamed from: o.nj2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8339nj2 extends N0 implements Serializable {
    public static final C8339nj2 Z = new C8339nj2();
    private static final long serialVersionUID = 1;

    public C8339nj2() {
    }

    @Override // o.HJ0, o.InterfaceC6430fz1
    public FileVisitResult a(Path path, BasicFileAttributes basicFileAttributes) {
        return q(t(path));
    }

    @Override // o.N0, o.HJ0, java.io.FileFilter
    public boolean accept(File file) {
        Path path;
        path = file.toPath();
        return t(path);
    }

    public boolean t(Path path) {
        boolean isSymbolicLink;
        isSymbolicLink = Files.isSymbolicLink(path);
        return isSymbolicLink;
    }

    public C8339nj2(FileVisitResult fileVisitResult, FileVisitResult fileVisitResult2) {
        super(fileVisitResult, fileVisitResult2);
    }
}
