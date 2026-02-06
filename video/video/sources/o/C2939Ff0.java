package o;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.Ff0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2939Ff0 {
    public final int a;
    public int b;
    @NotNull
    public final List<Exception> c;
    @Nullable
    public Path d;

    public C2939Ff0() {
        this(0, 1, null);
    }

    public final void a(@NotNull Exception exc) {
        Throwable initCause;
        C6562gT0.p(exc, "exception");
        this.b++;
        if (this.c.size() < this.a) {
            if (this.d != null) {
                C2830Ef0.a();
                initCause = C2732Df0.a(String.valueOf(this.d)).initCause(exc);
                C6562gT0.n(initCause, "null cannot be cast to non-null type java.nio.file.FileSystemException");
                exc = C2634Cf0.a(initCause);
            }
            this.c.add(exc);
        }
    }

    public final void b(@NotNull Path path) {
        Path path2;
        C6562gT0.p(path, "name");
        Path path3 = this.d;
        if (path3 != null) {
            path2 = path3.resolve(path);
        } else {
            path2 = null;
        }
        this.d = path2;
    }

    public final void c(@NotNull Path path) {
        Path path2;
        C6562gT0.p(path, "name");
        Path path3 = this.d;
        Path path4 = null;
        if (path3 != null) {
            path2 = path3.getFileName();
        } else {
            path2 = null;
        }
        if (C6562gT0.g(path, path2)) {
            Path path5 = this.d;
            if (path5 != null) {
                path4 = path5.getParent();
            }
            this.d = path4;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @NotNull
    public final List<Exception> d() {
        return this.c;
    }

    @Nullable
    public final Path e() {
        return this.d;
    }

    public final int f() {
        return this.b;
    }

    public final void g(@Nullable Path path) {
        this.d = path;
    }

    public C2939Ff0(int i) {
        this.a = i;
        this.c = new ArrayList();
    }

    public /* synthetic */ C2939Ff0(int i, int i2, C9516sY c9516sY) {
        this((i2 & 1) != 0 ? 64 : i);
    }
}
