package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.InterfaceC2426Ac0;

/* loaded from: classes.dex */
public abstract class VG2 implements InterfaceC2426Ac0 {
    public static VG2 h(int i, int i2, List<InterfaceC2426Ac0.a> list, List<InterfaceC2426Ac0.c> list2) {
        InterfaceC2426Ac0.a aVar;
        C10907yF1.b(!list2.isEmpty(), "Should contain at least one VideoProfile.");
        InterfaceC2426Ac0.c cVar = list2.get(0);
        if (!list.isEmpty()) {
            aVar = list.get(0);
        } else {
            aVar = null;
        }
        return new C3248Ij(i, i2, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)), aVar, cVar);
    }

    public static VG2 i(InterfaceC2426Ac0 interfaceC2426Ac0) {
        return h(interfaceC2426Ac0.a(), interfaceC2426Ac0.e(), interfaceC2426Ac0.f(), interfaceC2426Ac0.b());
    }

    public abstract InterfaceC2426Ac0.a j();

    public abstract InterfaceC2426Ac0.c k();
}
