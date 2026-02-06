package o;

import java.io.File;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;

/* renamed from: o.dz1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5944dz1 extends N0 {
    public final Path Z;

    public C5944dz1(Path path) {
        this.Z = path;
    }

    @Override // o.HJ0, o.InterfaceC6430fz1
    public FileVisitResult a(Path path, BasicFileAttributes basicFileAttributes) {
        return q(Objects.equals(this.Z, path));
    }

    @Override // o.N0, o.HJ0, java.io.FileFilter
    public boolean accept(File file) {
        Path path;
        Path path2 = this.Z;
        path = file.toPath();
        return Objects.equals(path2, path);
    }
}
