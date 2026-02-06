package o;

import java.io.File;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;

/* renamed from: o.ip0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7129ip0 extends N0 {
    public final Path Y0;
    public final File Z;

    public C7129ip0(File file) {
        Path path;
        Objects.requireNonNull(file, "file");
        this.Z = file;
        path = file.toPath();
        this.Y0 = path;
    }

    @Override // o.HJ0, o.InterfaceC6430fz1
    public FileVisitResult a(Path path, BasicFileAttributes basicFileAttributes) {
        return q(Objects.equals(this.Y0, path));
    }

    @Override // o.N0, o.HJ0, java.io.FileFilter
    public boolean accept(File file) {
        return Objects.equals(this.Z, file);
    }
}
