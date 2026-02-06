package o;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC7542kW0
@InterfaceC8303na2({"SMAP\nInlineList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineList.kt\nkotlinx/coroutines/internal/InlineList\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
/* loaded from: classes4.dex */
public final class TP0<E> {
    @Nullable
    public final Object a;

    public /* synthetic */ TP0(Object obj) {
        this.a = obj;
    }

    public static final /* synthetic */ TP0 a(Object obj) {
        return new TP0(obj);
    }

    public static /* synthetic */ Object c(Object obj, int i, C9516sY c9516sY) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return b(obj);
    }

    public static boolean d(Object obj, Object obj2) {
        if (!(obj2 instanceof TP0) || !C6562gT0.g(obj, ((TP0) obj2).j())) {
            return false;
        }
        return true;
    }

    public static final boolean e(Object obj, Object obj2) {
        return C6562gT0.g(obj, obj2);
    }

    public static final void f(Object obj, @NotNull HA0<? super E, C7458kA2> ha0) {
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                ha0.invoke(obj);
                return;
            }
            C6562gT0.n(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ArrayList arrayList = (ArrayList) obj;
            int size = arrayList.size();
            while (true) {
                size--;
                if (-1 < size) {
                    ha0.invoke((Object) arrayList.get(size));
                } else {
                    return;
                }
            }
        }
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @NotNull
    public static final Object h(Object obj, E e) {
        if (obj == null) {
            return b(e);
        }
        if (obj instanceof ArrayList) {
            C6562gT0.n(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ((ArrayList) obj).add(e);
            return b(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e);
        return b(arrayList);
    }

    public static String i(Object obj) {
        return "InlineList(holder=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.a, obj);
    }

    public int hashCode() {
        return g(this.a);
    }

    public final /* synthetic */ Object j() {
        return this.a;
    }

    public String toString() {
        return i(this.a);
    }

    @NotNull
    public static <E> Object b(@Nullable Object obj) {
        return obj;
    }
}
