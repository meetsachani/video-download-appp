package o;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/* renamed from: o.dy  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5938dy extends N0 implements Serializable {
    public static final HJ0 Y0;
    public static final HJ0 Z;
    private static final long serialVersionUID = 3179904805251622989L;

    static {
        C5938dy c5938dy = new C5938dy();
        Z = c5938dy;
        Y0 = c5938dy.negate();
    }

    @Override // o.HJ0, o.InterfaceC6430fz1
    public FileVisitResult a(Path path, BasicFileAttributes basicFileAttributes) {
        boolean z;
        boolean isExecutable;
        if (path != null) {
            isExecutable = Files.isExecutable(path);
            if (isExecutable) {
                z = true;
                return q(z);
            }
        }
        z = false;
        return q(z);
    }

    @Override // o.N0, o.HJ0, java.io.FileFilter
    public boolean accept(File file) {
        if (file != null && file.canExecute()) {
            return true;
        }
        return false;
    }
}
