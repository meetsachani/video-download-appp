package o;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: o.jx0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7403jx0 {
    public final C5215az a;

    @FunctionalInterface
    /* renamed from: o.jx0$a */
    /* loaded from: classes.dex */
    public interface a {
        void a(InterfaceC10290vj2 interfaceC10290vj2);
    }

    public C7403jx0(C10931yL1 c10931yL1) {
        this.a = (C5215az) c10931yL1.b(C5215az.class);
    }

    public final void a(Set<InterfaceC10290vj2> set) {
        for (InterfaceC10290vj2 interfaceC10290vj2 : set) {
            interfaceC10290vj2.e().w(interfaceC10290vj2);
        }
    }

    public final void b(Set<InterfaceC10290vj2> set) {
        for (InterfaceC10290vj2 interfaceC10290vj2 : set) {
            interfaceC10290vj2.e().x(interfaceC10290vj2);
        }
    }

    public void c(InterfaceC10290vj2 interfaceC10290vj2, List<InterfaceC10290vj2> list, List<InterfaceC10290vj2> list2, a aVar) {
        InterfaceC10290vj2 next;
        InterfaceC10290vj2 next2;
        if (d()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<InterfaceC10290vj2> it = list.iterator();
            while (it.hasNext() && (next2 = it.next()) != interfaceC10290vj2) {
                linkedHashSet.add(next2);
            }
            b(linkedHashSet);
        }
        aVar.a(interfaceC10290vj2);
        if (d()) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator<InterfaceC10290vj2> it2 = list2.iterator();
            while (it2.hasNext() && (next = it2.next()) != interfaceC10290vj2) {
                linkedHashSet2.add(next);
            }
            a(linkedHashSet2);
        }
    }

    public boolean d() {
        if (this.a != null) {
            return true;
        }
        return false;
    }
}
