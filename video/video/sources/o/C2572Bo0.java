package o;

import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.Bo0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2572Bo0 extends C2772Dp0 {
    public /* synthetic */ C2572Bo0(File file, File file2, String str, int i, C9516sY c9516sY) {
        this(file, (i & 2) != 0 ? null : file2, (i & 4) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2572Bo0(@NotNull File file, @Nullable File file2, @Nullable String str) {
        super(file, file2, str);
        C6562gT0.p(file, "file");
    }
}
