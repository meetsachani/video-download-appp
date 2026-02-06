package o;

import android.graphics.Path;

/* renamed from: o.mz1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8159mz1 {
    public static final Path a(Path path, Path path2) {
        Path path3 = new Path();
        path3.op(path, path2, Path.Op.INTERSECT);
        return path3;
    }

    public static final Iterable<C2906Ez1> b(Path path, float f) {
        return C10887yA1.b(path, f);
    }

    public static /* synthetic */ Iterable c(Path path, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.5f;
        }
        return b(path, f);
    }

    public static final Path d(Path path, Path path2) {
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.DIFFERENCE);
        return path3;
    }

    public static final Path e(Path path, Path path2) {
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.UNION);
        return path3;
    }

    public static final Path f(Path path, Path path2) {
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.UNION);
        return path3;
    }

    public static final Path g(Path path, Path path2) {
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.XOR);
        return path3;
    }
}
