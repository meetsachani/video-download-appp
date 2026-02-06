package o;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/* loaded from: classes4.dex */
public class S82 extends N0 implements Serializable {
    private static final long serialVersionUID = 7388077430788600069L;
    public final long Y0;
    public final boolean Z;

    public S82(long j) {
        this(j, true);
    }

    public static /* synthetic */ FileVisitResult t(S82 s82, Path path) {
        long size;
        s82.getClass();
        size = Files.size(path);
        return s82.q(s82.u(size));
    }

    @Override // o.HJ0, o.InterfaceC6430fz1
    public FileVisitResult a(final Path path, BasicFileAttributes basicFileAttributes) {
        return j(new XK0() { // from class: o.R82
            @Override // o.XK0
            public final Object get() {
                return S82.t(S82.this, path);
            }
        });
    }

    @Override // o.N0, o.HJ0, java.io.FileFilter
    public boolean accept(File file) {
        long j;
        if (file != null) {
            j = file.length();
        } else {
            j = 0;
        }
        return u(j);
    }

    @Override // o.N0
    public FileVisitResult r(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        long size;
        size = Files.size(path);
        return q(u(size));
    }

    @Override // o.N0
    public String toString() {
        String str;
        if (this.Z) {
            str = ">=";
        } else {
            str = "<";
        }
        return super.toString() + C9811tl1.c + str + this.Y0 + C9811tl1.d;
    }

    public final boolean u(long j) {
        boolean z;
        boolean z2 = this.Z;
        if (j < this.Y0) {
            z = true;
        } else {
            z = false;
        }
        if (z2 == z) {
            return false;
        }
        return true;
    }

    @Override // o.N0, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) throws IOException {
        return r(N30.a(obj), basicFileAttributes);
    }

    public S82(long j, boolean z) {
        if (j >= 0) {
            this.Y0 = j;
            this.Z = z;
            return;
        }
        throw new IllegalArgumentException("The size must be non-negative");
    }
}
