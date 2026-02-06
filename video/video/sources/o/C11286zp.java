package o;

import org.jetbrains.annotations.NotNull;

/* renamed from: o.zp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11286zp {
    @NotNull
    public static final C7592kj2 a = new C7592kj2("NO_ELEMENT");

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "BroadcastChannel is deprecated in the favour of SharedFlow and StateFlow, and is no longer supported")
    @InterfaceC3681Mt1
    @NotNull
    public static final <E> InterfaceC10800xp<E> a(int i) {
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i != Integer.MAX_VALUE) {
                        return new C11043yp(i);
                    }
                    throw new IllegalArgumentException("Unsupported UNLIMITED capacity for BroadcastChannel");
                }
                throw new IllegalArgumentException("Unsupported 0 capacity for BroadcastChannel");
            }
            return new YJ();
        }
        return new C11043yp(InterfaceC6728hA.r.a());
    }

    public static final /* synthetic */ C7592kj2 b() {
        return a;
    }
}
