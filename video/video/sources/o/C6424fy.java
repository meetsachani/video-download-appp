package o;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/* renamed from: o.fy  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6424fy extends N0 implements Serializable {
    public static final HJ0 Y0;
    public static final HJ0 Z;
    public static final HJ0 Z0;
    private static final long serialVersionUID = 3179904805251622989L;

    static {
        C6424fy c6424fy = new C6424fy();
        Z = c6424fy;
        Y0 = c6424fy.negate();
        Z0 = c6424fy.e(C6679gy.Y0);
    }

    @Override // o.HJ0, o.InterfaceC6430fz1
    public FileVisitResult a(Path path, BasicFileAttributes basicFileAttributes) {
        boolean z;
        boolean isReadable;
        if (path != null) {
            isReadable = Files.isReadable(path);
            if (isReadable) {
                z = true;
                return q(z);
            }
        }
        z = false;
        return q(z);
    }

    @Override // o.N0, o.HJ0, java.io.FileFilter
    public boolean accept(File file) {
        if (file != null && file.canRead()) {
            return true;
        }
        return false;
    }
}
