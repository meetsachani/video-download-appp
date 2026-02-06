package o;

import java.io.IOException;

/* renamed from: o.xI0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10675xI0 extends IOException {
    public static final int Y = -1;
    private static final long serialVersionUID = 1;
    public final int X;

    public C10675xI0(int i) {
        this("Http request failed", i);
    }

    public int a() {
        return this.X;
    }

    @Deprecated
    public C10675xI0(String str) {
        this(str, -1);
    }

    public C10675xI0(String str, int i) {
        this(str, i, null);
    }

    public C10675xI0(String str, int i, Throwable th) {
        super(str + ", status code: " + i, th);
        this.X = i;
    }
}
