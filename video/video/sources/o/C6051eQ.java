package o;

import o.InterfaceC5809dQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.eQ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6051eQ {
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC4912Zi0
    @InterfaceC6480g82(version = "1.3")
    @Nullable
    public static final <E extends InterfaceC5809dQ.b> E a(@NotNull InterfaceC5809dQ.b bVar, @NotNull InterfaceC5809dQ.c<E> cVar) {
        E e;
        C6562gT0.p(bVar, "<this>");
        C6562gT0.p(cVar, "key");
        if (cVar instanceof AbstractC9870u0) {
            AbstractC9870u0 abstractC9870u0 = (AbstractC9870u0) cVar;
            if (!abstractC9870u0.a(bVar.getKey()) || (e = (E) abstractC9870u0.b(bVar)) == null) {
                return null;
            }
            return e;
        } else if (bVar.getKey() != cVar) {
            return null;
        } else {
            return bVar;
        }
    }

    @InterfaceC4912Zi0
    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static final InterfaceC5809dQ b(@NotNull InterfaceC5809dQ.b bVar, @NotNull InterfaceC5809dQ.c<?> cVar) {
        C6562gT0.p(bVar, "<this>");
        C6562gT0.p(cVar, "key");
        if (cVar instanceof AbstractC9870u0) {
            AbstractC9870u0 abstractC9870u0 = (AbstractC9870u0) cVar;
            if (abstractC9870u0.a(bVar.getKey()) && abstractC9870u0.b(bVar) != null) {
                return C3897Pa0.X;
            }
            return bVar;
        } else if (bVar.getKey() == cVar) {
            return C3897Pa0.X;
        } else {
            return bVar;
        }
    }
}
