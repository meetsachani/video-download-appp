package o;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;

/* renamed from: o.qr1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9100qr1 extends N0 implements Serializable {
    private static final long serialVersionUID = 6131563330944994230L;
    public final HJ0 Z;

    public C9100qr1(HJ0 hj0) {
        Objects.requireNonNull(hj0, "filter");
        this.Z = hj0;
    }

    @Override // o.HJ0, o.InterfaceC6430fz1
    public FileVisitResult a(Path path, BasicFileAttributes basicFileAttributes) {
        return t(this.Z.a(path, basicFileAttributes));
    }

    @Override // o.N0, o.HJ0, java.io.FileFilter
    public boolean accept(File file) {
        return !this.Z.accept(file);
    }

    public final FileVisitResult t(FileVisitResult fileVisitResult) {
        FileVisitResult fileVisitResult2;
        FileVisitResult fileVisitResult3;
        FileVisitResult fileVisitResult4;
        fileVisitResult2 = FileVisitResult.CONTINUE;
        if (fileVisitResult == fileVisitResult2) {
            fileVisitResult4 = FileVisitResult.TERMINATE;
            return fileVisitResult4;
        }
        fileVisitResult3 = FileVisitResult.CONTINUE;
        return fileVisitResult3;
    }

    @Override // o.N0
    public String toString() {
        return "NOT (" + this.Z.toString() + C9811tl1.d;
    }

    @Override // o.N0, o.HJ0, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return !this.Z.accept(file, str);
    }
}
