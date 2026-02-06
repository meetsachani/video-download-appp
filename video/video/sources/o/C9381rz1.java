package o;

import java.nio.file.Path;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.rz1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9381rz1 {
    @NotNull
    public final Path a;
    @Nullable
    public final Object b;
    @Nullable
    public final C9381rz1 c;
    @Nullable
    public Iterator<C9381rz1> d;

    public C9381rz1(@NotNull Path path, @Nullable Object obj, @Nullable C9381rz1 c9381rz1) {
        C6562gT0.p(path, "path");
        this.a = path;
        this.b = obj;
        this.c = c9381rz1;
    }

    @Nullable
    public final Iterator<C9381rz1> a() {
        return this.d;
    }

    @Nullable
    public final Object b() {
        return this.b;
    }

    @Nullable
    public final C9381rz1 c() {
        return this.c;
    }

    @NotNull
    public final Path d() {
        return this.a;
    }

    public final void e(@Nullable Iterator<C9381rz1> it) {
        this.d = it;
    }
}
