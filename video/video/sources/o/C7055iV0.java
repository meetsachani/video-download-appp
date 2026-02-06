package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.iV0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7055iV0 {
    public static final int e = -1;
    public static final int f = 0;
    public static final int g = 1;
    public static final int k = 1;
    public static final int l = 2;
    public static final int m = 4;
    @NotNull
    public static final C7592kj2 a = new C7592kj2("COMPLETING_ALREADY");
    @InterfaceC7058iW0
    @NotNull
    public static final C7592kj2 b = new C7592kj2("COMPLETING_WAITING_CHILDREN");
    @NotNull
    public static final C7592kj2 c = new C7592kj2("COMPLETING_RETRY");
    @NotNull
    public static final C7592kj2 d = new C7592kj2("TOO_LATE_TO_CANCEL");
    @NotNull
    public static final C7592kj2 h = new C7592kj2("SEALED");
    @NotNull
    public static final C3604Ma0 i = new C3604Ma0(false);
    @NotNull
    public static final C3604Ma0 j = new C3604Ma0(true);

    @Nullable
    public static final Object g(@Nullable Object obj) {
        if (obj instanceof InterfaceC5563cP0) {
            return new C5806dP0((InterfaceC5563cP0) obj);
        }
        return obj;
    }

    @Nullable
    public static final Object h(@Nullable Object obj) {
        C5806dP0 c5806dP0;
        InterfaceC5563cP0 interfaceC5563cP0;
        if (obj instanceof C5806dP0) {
            c5806dP0 = (C5806dP0) obj;
        } else {
            c5806dP0 = null;
        }
        if (c5806dP0 != null && (interfaceC5563cP0 = c5806dP0.a) != null) {
            return interfaceC5563cP0;
        }
        return obj;
    }
}
