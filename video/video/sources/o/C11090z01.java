package o;

import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.z01  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11090z01 {
    @NotNull
    public static final C11090z01 a = new C11090z01();
    @NotNull
    public static final LinkOption[] b;
    @NotNull
    public static final LinkOption[] c;
    @NotNull
    public static final Set<FileVisitOption> d;
    @NotNull
    public static final Set<FileVisitOption> e;

    static {
        LinkOption linkOption;
        FileVisitOption fileVisitOption;
        linkOption = LinkOption.NOFOLLOW_LINKS;
        b = new LinkOption[]{linkOption};
        c = new LinkOption[0];
        d = B22.k();
        fileVisitOption = FileVisitOption.FOLLOW_LINKS;
        e = A22.f(fileVisitOption);
    }

    @NotNull
    public final LinkOption[] a(boolean z) {
        if (z) {
            return c;
        }
        return b;
    }

    @NotNull
    public final Set<FileVisitOption> b(boolean z) {
        if (z) {
            return e;
        }
        return d;
    }
}
