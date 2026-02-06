package o;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.attribute.BasicFileAttributes;

/* loaded from: classes4.dex */
public interface HJ0 extends FileFilter, FilenameFilter, InterfaceC6430fz1, PathMatcher {
    public static final String[] O = new String[0];

    default FileVisitResult a(Path path, BasicFileAttributes basicFileAttributes) {
        boolean z;
        File file;
        if (path != null) {
            file = path.toFile();
            if (accept(file)) {
                z = true;
                return N0.p(z);
            }
        }
        z = false;
        return N0.p(z);
    }

    @Override // java.io.FileFilter
    boolean accept(File file);

    boolean accept(File file, String str);

    default HJ0 d(HJ0 hj0) {
        return new C7643kw1(this, hj0);
    }

    default HJ0 e(HJ0 hj0) {
        return new O8(this, hj0);
    }

    @Override // java.nio.file.PathMatcher
    default boolean matches(Path path) {
        FileVisitResult fileVisitResult;
        FileVisitResult a = a(path, null);
        fileVisitResult = FileVisitResult.TERMINATE;
        if (a != fileVisitResult) {
            return true;
        }
        return false;
    }

    default HJ0 negate() {
        return new C9100qr1(this);
    }
}
