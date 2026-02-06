package o;

import com.facebook.internal.C2379y;
import java.util.HashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.vo  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10307vo {
    public static boolean b;
    @NotNull
    public static final C10307vo a = new C10307vo();
    @NotNull
    public static Set<String> c = new HashSet();

    @InterfaceC9511sW0
    public static final void a() {
        if (SQ.e(C10307vo.class)) {
            return;
        }
        try {
            b = false;
            c = new HashSet();
        } catch (Throwable th) {
            SQ.c(th, C10307vo.class);
        }
    }

    @InterfaceC9511sW0
    public static final void b() {
        if (SQ.e(C10307vo.class)) {
            return;
        }
        try {
            a.d();
            Set<String> set = c;
            if (set != null && !set.isEmpty()) {
                b = true;
            }
        } catch (Throwable th) {
            SQ.c(th, C10307vo.class);
        }
    }

    @InterfaceC9511sW0
    public static final boolean c(@NotNull String str) {
        if (SQ.e(C10307vo.class)) {
            return false;
        }
        try {
            C6562gT0.p(str, "eventName");
            if (!b) {
                return false;
            }
            return c.contains(str);
        } catch (Throwable th) {
            SQ.c(th, C10307vo.class);
            return false;
        }
    }

    public final void d() {
        if (!SQ.e(this)) {
            try {
                com.facebook.internal.C c2 = com.facebook.internal.C.a;
                com.facebook.M m = com.facebook.M.a;
                C2379y q = com.facebook.internal.C.q(com.facebook.M.o(), false);
                if (q != null) {
                    com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                    HashSet<String> m2 = com.facebook.internal.l0.m(q.b());
                    if (m2 == null) {
                        return;
                    }
                    c = m2;
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }
}
