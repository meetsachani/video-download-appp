package o;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

/* renamed from: o.Ra0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4091Ra0 extends N0 implements Serializable {
    public static final HJ0 Y0;
    public static final HJ0 Z;
    private static final long serialVersionUID = 3631422087512832211L;

    static {
        C4091Ra0 c4091Ra0 = new C4091Ra0();
        Z = c4091Ra0;
        Y0 = c4091Ra0.negate();
    }

    public static /* synthetic */ FileVisitResult t(C4091Ra0 c4091Ra0, Path path) {
        boolean isDirectory;
        long size;
        Stream list;
        c4091Ra0.getClass();
        boolean z = false;
        isDirectory = Files.isDirectory(path, new LinkOption[0]);
        if (isDirectory) {
            list = Files.list(path);
            try {
                FileVisitResult q = c4091Ra0.q(!list.findFirst().isPresent());
                list.close();
                return q;
            } catch (Throwable th) {
                if (list != null) {
                    try {
                        list.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        size = Files.size(path);
        if (size == 0) {
            z = true;
        }
        return c4091Ra0.q(z);
    }

    @Override // o.HJ0, o.InterfaceC6430fz1
    public FileVisitResult a(final Path path, BasicFileAttributes basicFileAttributes) {
        if (path == null) {
            return q(true);
        }
        return j(new XK0() { // from class: o.Qa0
            @Override // o.XK0
            public final Object get() {
                return C4091Ra0.t(C4091Ra0.this, path);
            }
        });
    }

    @Override // o.N0, o.HJ0, java.io.FileFilter
    public boolean accept(File file) {
        if (file == null) {
            return true;
        }
        if (file.isDirectory()) {
            if (C7743lL0.u0(file.listFiles()) == 0) {
                return true;
            }
            return false;
        } else if (file.length() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
