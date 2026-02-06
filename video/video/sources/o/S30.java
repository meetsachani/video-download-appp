package o;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/* loaded from: classes4.dex */
public class S30 extends N0 implements Serializable {
    public static final HJ0 Y0;
    public static final HJ0 Z;
    private static final long serialVersionUID = -5148237843784525732L;

    static {
        S30 s30 = new S30();
        Z = s30;
        Y0 = s30;
    }

    @Override // o.HJ0, o.InterfaceC6430fz1
    public FileVisitResult a(Path path, BasicFileAttributes basicFileAttributes) {
        boolean isDirectory;
        boolean z = false;
        if (path != null) {
            isDirectory = Files.isDirectory(path, new LinkOption[0]);
            if (isDirectory) {
                z = true;
            }
        }
        return q(z);
    }

    @Override // o.N0, o.HJ0, java.io.FileFilter
    public boolean accept(File file) {
        return l(file);
    }
}
