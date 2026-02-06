package o;

import org.jetbrains.annotations.NotNull;

/* renamed from: o.sr1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9592sr1 extends Error {
    public C9592sr1() {
        this(null, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9592sr1(@NotNull String str) {
        super(str);
        C6562gT0.p(str, "message");
    }

    public /* synthetic */ C9592sr1(String str, int i, C9516sY c9516sY) {
        this((i & 1) != 0 ? "An operation is not implemented." : str);
    }
}
