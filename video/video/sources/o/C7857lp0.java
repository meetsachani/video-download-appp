package o;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/* renamed from: o.lp0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7857lp0 extends N0 implements Serializable {
    @Deprecated
    public static final HJ0 Y0;
    public static final HJ0 Z;
    private static final long serialVersionUID = 5345244090827540862L;

    static {
        C7857lp0 c7857lp0 = new C7857lp0();
        Z = c7857lp0;
        Y0 = c7857lp0;
    }

    @Override // o.HJ0, o.InterfaceC6430fz1
    public FileVisitResult a(Path path, BasicFileAttributes basicFileAttributes) {
        boolean isRegularFile;
        boolean z = false;
        if (path != null) {
            isRegularFile = Files.isRegularFile(path, new LinkOption[0]);
            if (isRegularFile) {
                z = true;
            }
        }
        return q(z);
    }

    @Override // o.N0, o.HJ0, java.io.FileFilter
    public boolean accept(File file) {
        return m(file);
    }
}
