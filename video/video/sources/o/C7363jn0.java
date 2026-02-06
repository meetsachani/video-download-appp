package o;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/* renamed from: o.jn0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7363jn0 implements HJ0, Serializable {
    public static final String X = Boolean.FALSE.toString();
    public static final HJ0 Y;
    public static final HJ0 Z;
    private static final long serialVersionUID = 6210271677940926200L;

    static {
        C7363jn0 c7363jn0 = new C7363jn0();
        Y = c7363jn0;
        Z = c7363jn0;
    }

    @Override // o.HJ0, o.InterfaceC6430fz1
    public FileVisitResult a(Path path, BasicFileAttributes basicFileAttributes) {
        return RA1.a();
    }

    @Override // o.HJ0, java.io.FileFilter
    public boolean accept(File file) {
        return false;
    }

    @Override // o.HJ0
    public HJ0 e(HJ0 hj0) {
        return Z;
    }

    @Override // o.HJ0
    public HJ0 negate() {
        return Cu2.Z;
    }

    public String toString() {
        return X;
    }

    @Override // o.HJ0, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return false;
    }

    @Override // o.HJ0
    public HJ0 d(HJ0 hj0) {
        return hj0;
    }
}
