package o;

import o.QZ1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC7542kW0
/* loaded from: classes4.dex */
public final class TZ1<S extends QZ1<S>> {
    @Nullable
    public final Object a;

    public /* synthetic */ TZ1(Object obj) {
        this.a = obj;
    }

    public static final /* synthetic */ TZ1 a(Object obj) {
        return new TZ1(obj);
    }

    public static boolean c(Object obj, Object obj2) {
        if (!(obj2 instanceof TZ1) || !C6562gT0.g(obj, ((TZ1) obj2).j())) {
            return false;
        }
        return true;
    }

    public static final boolean d(Object obj, Object obj2) {
        return C6562gT0.g(obj, obj2);
    }

    @NotNull
    public static final S f(Object obj) {
        if (obj != C9703tJ.b) {
            C6562gT0.n(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (S) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean h(Object obj) {
        if (obj == C9703tJ.b) {
            return true;
        }
        return false;
    }

    public static String i(Object obj) {
        return "SegmentOrClosed(value=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.a, obj);
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

    public static /* synthetic */ void e() {
    }

    @NotNull
    public static <S extends QZ1<S>> Object b(@Nullable Object obj) {
        return obj;
    }
}
