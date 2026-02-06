package o;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/* loaded from: classes4.dex */
public class Cu2 implements HJ0, Serializable {
    public static final String X = Boolean.TRUE.toString();
    public static final HJ0 Y;
    public static final HJ0 Z;
    private static final long serialVersionUID = 8782512160909720199L;

    static {
        Cu2 cu2 = new Cu2();
        Y = cu2;
        Z = cu2;
    }

    @Override // o.HJ0, o.InterfaceC6430fz1
    public FileVisitResult a(Path path, BasicFileAttributes basicFileAttributes) {
        FileVisitResult fileVisitResult;
        fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResult;
    }

    @Override // o.HJ0, java.io.FileFilter
    public boolean accept(File file) {
        return true;
    }

    @Override // o.HJ0
    public HJ0 d(HJ0 hj0) {
        return Z;
    }

    @Override // o.HJ0
    public HJ0 negate() {
        return C7363jn0.Z;
    }

    public String toString() {
        return X;
    }

    @Override // o.HJ0, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return true;
    }

    @Override // o.HJ0
    public HJ0 e(HJ0 hj0) {
        return hj0;
    }
}
