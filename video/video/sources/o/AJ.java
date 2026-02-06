package o;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class AJ {
    public static final int a = -1640531527;
    public static final int b = 16;
    @NotNull
    public static final C7592kj2 c = new C7592kj2("REHASH");
    @NotNull
    public static final C10393w81 d = new C10393w81(null);
    @NotNull
    public static final C10393w81 e = new C10393w81(Boolean.TRUE);

    public static final C10393w81 d(Object obj) {
        if (obj == null) {
            return d;
        }
        if (C6562gT0.g(obj, Boolean.TRUE)) {
            return e;
        }
        return new C10393w81(obj);
    }

    public static final Void e() {
        throw new UnsupportedOperationException("not implemented");
    }
}
