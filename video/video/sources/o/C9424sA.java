package o;

import o.C10642xA;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.sA  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9424sA {
    @NotNull
    public static final <E> InterfaceC6728hA<E> b(int i, @NotNull EnumC7132iq enumC7132iq, @Nullable HA0<? super E, C7458kA2> ha0) {
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i != Integer.MAX_VALUE) {
                        if (enumC7132iq == EnumC7132iq.X) {
                            return new C10804xq(i, ha0);
                        }
                        return new ZJ(i, enumC7132iq, ha0);
                    }
                    return new C10804xq(Integer.MAX_VALUE, ha0);
                } else if (enumC7132iq == EnumC7132iq.X) {
                    return new C10804xq(0, ha0);
                } else {
                    return new ZJ(1, enumC7132iq, ha0);
                }
            } else if (enumC7132iq == EnumC7132iq.X) {
                return new ZJ(1, EnumC7132iq.Y, ha0);
            } else {
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
        } else if (enumC7132iq == EnumC7132iq.X) {
            return new C10804xq(InterfaceC6728hA.r.a(), ha0);
        } else {
            return new ZJ(1, enumC7132iq, ha0);
        }
    }

    public static /* synthetic */ InterfaceC6728hA c(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return d(i, null, null, 6, null);
    }

    public static /* synthetic */ InterfaceC6728hA d(int i, EnumC7132iq enumC7132iq, HA0 ha0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            enumC7132iq = EnumC7132iq.X;
        }
        if ((i2 & 4) != 0) {
            ha0 = null;
        }
        return b(i, enumC7132iq, ha0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T e(@NotNull Object obj, @NotNull HA0<? super Throwable, ? extends T> ha0) {
        if (obj instanceof C10642xA.c) {
            return ha0.invoke(C10642xA.f(obj));
        }
        return obj;
    }

    @NotNull
    public static final <T> Object f(@NotNull Object obj, @NotNull HA0<? super Throwable, C7458kA2> ha0) {
        if (obj instanceof C10642xA.a) {
            ha0.invoke(C10642xA.f(obj));
        }
        return obj;
    }

    @NotNull
    public static final <T> Object g(@NotNull Object obj, @NotNull HA0<? super Throwable, C7458kA2> ha0) {
        if (obj instanceof C10642xA.c) {
            ha0.invoke(C10642xA.f(obj));
        }
        return obj;
    }

    @NotNull
    public static final <T> Object h(@NotNull Object obj, @NotNull HA0<? super T, C7458kA2> ha0) {
        if (!(obj instanceof C10642xA.c)) {
            ha0.invoke(obj);
        }
        return obj;
    }
}
