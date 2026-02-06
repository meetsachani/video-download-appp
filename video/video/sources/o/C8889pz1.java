package o;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.util.Objects;

/* renamed from: o.pz1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8889pz1 extends N0 {
    public final PathMatcher Z;

    public C8889pz1(PathMatcher pathMatcher) {
        Objects.requireNonNull(pathMatcher, "pathMatcher");
        this.Z = C8646oz1.a(pathMatcher);
    }

    @Override // o.N0, o.HJ0, java.io.FileFilter
    public boolean accept(File file) {
        Path path;
        if (file != null) {
            path = file.toPath();
            if (matches(path)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // o.HJ0, java.nio.file.PathMatcher
    public boolean matches(Path path) {
        boolean matches;
        matches = this.Z.matches(path);
        return matches;
    }
}
