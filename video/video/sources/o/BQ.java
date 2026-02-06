package o;

import java.io.IOException;

/* loaded from: classes.dex */
public final class BQ extends IOException {
    public /* synthetic */ BQ(String str, Throwable th, int i, C9516sY c9516sY) {
        this(str, (i & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BQ(String str, Throwable th) {
        super(str, th);
        C6562gT0.p(str, "message");
    }
}
