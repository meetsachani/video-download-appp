package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import o.InterfaceC2426Ac0;

/* loaded from: classes.dex */
public class Q80 implements InterfaceC11235zc0 {
    public final InterfaceC11235zc0 b;
    public final N80 c;
    public final Map<Integer, InterfaceC2426Ac0> d = new HashMap();

    public Q80(InterfaceC11235zc0 interfaceC11235zc0, N80 n80) {
        this.b = interfaceC11235zc0;
        this.c = n80;
    }

    public static InterfaceC2426Ac0 c(InterfaceC2426Ac0 interfaceC2426Ac0, N80 n80) {
        if (interfaceC2426Ac0 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (InterfaceC2426Ac0.c cVar : interfaceC2426Ac0.b()) {
            if (e(cVar, n80) && f(cVar, n80)) {
                arrayList.add(cVar);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return InterfaceC2426Ac0.b.h(interfaceC2426Ac0.a(), interfaceC2426Ac0.e(), interfaceC2426Ac0.f(), arrayList);
    }

    private InterfaceC2426Ac0 d(int i) {
        if (this.d.containsKey(Integer.valueOf(i))) {
            return this.d.get(Integer.valueOf(i));
        }
        if (this.b.a(i)) {
            InterfaceC2426Ac0 c = c(this.b.b(i), this.c);
            this.d.put(Integer.valueOf(i), c);
            return c;
        }
        return null;
    }

    public static boolean e(InterfaceC2426Ac0.c cVar, N80 n80) {
        Set<Integer> set = S80.a.get(Integer.valueOf(n80.a()));
        if (set != null && set.contains(Integer.valueOf(cVar.b()))) {
            return true;
        }
        return false;
    }

    public static boolean f(InterfaceC2426Ac0.c cVar, N80 n80) {
        Set<Integer> set = S80.b.get(Integer.valueOf(n80.b()));
        if (set != null && set.contains(Integer.valueOf(cVar.g()))) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC11235zc0
    public boolean a(int i) {
        if (!this.b.a(i) || d(i) == null) {
            return false;
        }
        return true;
    }

    @Override // o.InterfaceC11235zc0
    public InterfaceC2426Ac0 b(int i) {
        return d(i);
    }
}
