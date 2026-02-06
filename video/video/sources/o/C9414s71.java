package o;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatcherLoader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,130:1\n1971#2,14:131\n*S KotlinDebug\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatcherLoader\n*L\n34#1:131,14\n*E\n"})
/* renamed from: o.s71  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9414s71 {
    @NotNull
    public static final C9414s71 a;
    public static final boolean b = false;
    @InterfaceC7058iW0
    @NotNull
    public static final AbstractC8922q71 c;

    static {
        C9414s71 c9414s71 = new C9414s71();
        a = c9414s71;
        C2852Ek2.f(C9657t71.a, true);
        c = c9414s71.a();
    }

    public final AbstractC8922q71 a() {
        Object next;
        AbstractC8922q71 f;
        try {
            List G3 = C6695h12.G3(U02.j(ServiceLoader.load(InterfaceC9171r71.class, InterfaceC9171r71.class.getClassLoader()).iterator()));
            Iterator it = G3.iterator();
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    int c2 = ((InterfaceC9171r71) next).c();
                    do {
                        Object next2 = it.next();
                        int c3 = ((InterfaceC9171r71) next2).c();
                        if (c2 < c3) {
                            next = next2;
                            c2 = c3;
                        }
                    } while (it.hasNext());
                }
            }
            InterfaceC9171r71 interfaceC9171r71 = (InterfaceC9171r71) next;
            if (interfaceC9171r71 != null && (f = C9657t71.f(interfaceC9171r71, G3)) != null) {
                return f;
            }
            return C9657t71.b(null, null, 3, null);
        } catch (Throwable th) {
            return C9657t71.b(th, null, 2, null);
        }
    }
}
