package o;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.Objects;

/* loaded from: classes4.dex */
public abstract class N0 implements HJ0, AA1 {
    public final FileVisitResult X;
    public final FileVisitResult Y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public N0() {
        this(r0, r1);
        FileVisitResult fileVisitResult;
        FileVisitResult fileVisitResult2;
        fileVisitResult = FileVisitResult.CONTINUE;
        fileVisitResult2 = FileVisitResult.TERMINATE;
    }

    public static FileVisitResult p(boolean z) {
        FileVisitResult fileVisitResult;
        FileVisitResult fileVisitResult2;
        if (z) {
            fileVisitResult2 = FileVisitResult.CONTINUE;
            return fileVisitResult2;
        }
        fileVisitResult = FileVisitResult.TERMINATE;
        return fileVisitResult;
    }

    @Override // o.HJ0, java.io.FileFilter
    public boolean accept(File file) {
        Objects.requireNonNull(file, "file");
        return accept(file.getParentFile(), file.getName());
    }

    public void h(List<?> list, StringBuilder sb) {
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append(list.get(i));
        }
    }

    public void i(Object[] objArr, StringBuilder sb) {
        for (int i = 0; i < objArr.length; i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append(objArr[i]);
        }
    }

    public FileVisitResult j(XK0<FileVisitResult> xk0) {
        try {
            return C4255Sq0.a(xk0.get());
        } catch (IOException e) {
            return k(e);
        }
    }

    public FileVisitResult k(Throwable th) {
        FileVisitResult fileVisitResult;
        fileVisitResult = FileVisitResult.TERMINATE;
        return fileVisitResult;
    }

    public boolean l(File file) {
        if (file != null && file.isDirectory()) {
            return true;
        }
        return false;
    }

    public boolean m(File file) {
        if (file != null && file.isFile()) {
            return true;
        }
        return false;
    }

    public FileVisitResult n(Path path, IOException iOException) throws IOException {
        FileVisitResult fileVisitResult;
        fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResult;
    }

    public FileVisitResult o(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return a(path, basicFileAttributes);
    }

    @Override // java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult postVisitDirectory(Path path, IOException iOException) throws IOException {
        return n(N30.a(path), iOException);
    }

    @Override // java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return o(N30.a(path), basicFileAttributes);
    }

    public FileVisitResult q(boolean z) {
        if (z) {
            return this.X;
        }
        return this.Y;
    }

    public FileVisitResult r(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return a(path, basicFileAttributes);
    }

    public FileVisitResult s(Path path, IOException iOException) throws IOException {
        FileVisitResult fileVisitResult;
        fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResult;
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) throws IOException {
        return r(N30.a(obj), basicFileAttributes);
    }

    @Override // java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFileFailed(Path path, IOException iOException) throws IOException {
        return s(N30.a(path), iOException);
    }

    public N0(FileVisitResult fileVisitResult, FileVisitResult fileVisitResult2) {
        this.X = fileVisitResult;
        this.Y = fileVisitResult2;
    }

    @Override // o.HJ0, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        Objects.requireNonNull(str, "name");
        return accept(new File(file, str));
    }
}
