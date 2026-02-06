package o;

import java.nio.file.FileSystemException;
import java.nio.file.Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.fM0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6279fM0 extends FileSystemException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6279fM0(@NotNull Path path, @Nullable Path path2, @Nullable String str) {
        super(path.toString(), path2 != null ? path2.toString() : null, str);
        C6562gT0.p(path, "file");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6279fM0(@NotNull Path path) {
        this(path, null, null);
        C6562gT0.p(path, "file");
    }
}
