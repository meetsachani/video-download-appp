package o;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/* renamed from: o.gy  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6679gy extends N0 implements Serializable {
    public static final HJ0 Y0;
    public static final HJ0 Z;
    private static final long serialVersionUID = 5132005214688990379L;

    static {
        C6679gy c6679gy = new C6679gy();
        Z = c6679gy;
        Y0 = c6679gy.negate();
    }

    @Override // o.HJ0, o.InterfaceC6430fz1
    public FileVisitResult a(Path path, BasicFileAttributes basicFileAttributes) {
        boolean z;
        boolean isWritable;
        if (path != null) {
            isWritable = Files.isWritable(path);
            if (isWritable) {
                z = true;
                return q(z);
            }
        }
        z = false;
        return q(z);
    }

    @Override // o.N0, o.HJ0, java.io.FileFilter
    public boolean accept(File file) {
        if (file != null && file.canWrite()) {
            return true;
        }
        return false;
    }
}
