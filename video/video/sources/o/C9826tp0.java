package o;

import java.io.File;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.tp0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9826tp0 {
    @NotNull
    public final File a;
    @NotNull
    public final List<File> b;

    /* JADX WARN: Multi-variable type inference failed */
    public C9826tp0(@NotNull File file, @NotNull List<? extends File> list) {
        C6562gT0.p(file, "root");
        C6562gT0.p(list, "segments");
        this.a = file;
        this.b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C9826tp0 d(C9826tp0 c9826tp0, File file, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            file = c9826tp0.a;
        }
        if ((i & 2) != 0) {
            list = c9826tp0.b;
        }
        return c9826tp0.c(file, list);
    }

    @NotNull
    public final File a() {
        return this.a;
    }

    @NotNull
    public final List<File> b() {
        return this.b;
    }

    @NotNull
    public final C9826tp0 c(@NotNull File file, @NotNull List<? extends File> list) {
        C6562gT0.p(file, "root");
        C6562gT0.p(list, "segments");
        return new C9826tp0(file, list);
    }

    @NotNull
    public final File e() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9826tp0)) {
            return false;
        }
        C9826tp0 c9826tp0 = (C9826tp0) obj;
        if (C6562gT0.g(this.a, c9826tp0.a) && C6562gT0.g(this.b, c9826tp0.b)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String f() {
        String path = this.a.getPath();
        C6562gT0.o(path, "getPath(...)");
        return path;
    }

    @NotNull
    public final List<File> g() {
        return this.b;
    }

    public final int h() {
        return this.b.size();
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final boolean i() {
        String path = this.a.getPath();
        C6562gT0.o(path, "getPath(...)");
        if (path.length() > 0) {
            return true;
        }
        return false;
    }

    @NotNull
    public final File j(int i, int i2) {
        if (i >= 0 && i <= i2 && i2 <= h()) {
            String str = File.separator;
            C6562gT0.o(str, "separator");
            return new File(C10662xF.p3(this.b.subList(i, i2), str, null, null, 0, null, null, 62, null));
        }
        throw new IllegalArgumentException();
    }

    @NotNull
    public String toString() {
        return "FilePathComponents(root=" + this.a + ", segments=" + this.b + ')';
    }
}
