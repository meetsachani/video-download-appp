package o;

import java.io.File;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.Dp0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2772Dp0 extends IOException {
    @NotNull
    public final File X;
    @Nullable
    public final File Y;
    @Nullable
    public final String Z;

    public /* synthetic */ C2772Dp0(File file, File file2, String str, int i, C9516sY c9516sY) {
        this(file, (i & 2) != 0 ? null : file2, (i & 4) != 0 ? null : str);
    }

    @NotNull
    public final File a() {
        return this.X;
    }

    @Nullable
    public final File b() {
        return this.Y;
    }

    @Nullable
    public final String c() {
        return this.Z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2772Dp0(@NotNull File file, @Nullable File file2, @Nullable String str) {
        super(r0);
        String b;
        C6562gT0.p(file, "file");
        b = C3624Mf0.b(file, file2, str);
        this.X = file;
        this.Y = file2;
        this.Z = str;
    }
}
