package o;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/* loaded from: classes4.dex */
public class BH0 extends N0 implements Serializable {
    public static final HJ0 Y0;
    public static final HJ0 Z;
    private static final long serialVersionUID = 8930842316112759062L;

    static {
        BH0 bh0 = new BH0();
        Z = bh0;
        Y0 = bh0.negate();
    }

    public static /* synthetic */ FileVisitResult t(BH0 bh0, Path path) {
        boolean z;
        boolean isHidden;
        if (path != null) {
            bh0.getClass();
            isHidden = Files.isHidden(path);
            if (!isHidden) {
                z = false;
                return bh0.q(z);
            }
        }
        z = true;
        return bh0.q(z);
    }

    @Override // o.HJ0, o.InterfaceC6430fz1
    public FileVisitResult a(final Path path, BasicFileAttributes basicFileAttributes) {
        return j(new XK0() { // from class: o.AH0
            @Override // o.XK0
            public final Object get() {
                return BH0.t(BH0.this, path);
            }
        });
    }

    @Override // o.N0, o.HJ0, java.io.FileFilter
    public boolean accept(File file) {
        if (file != null && !file.isHidden()) {
            return false;
        }
        return true;
    }
}
