package o;

import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import o.InterfaceC2426Ac0;

/* renamed from: o.Fc0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2927Fc0 {
    public final List<NI1> a;
    public final Set<Size> b;

    public C2927Fc0(List<NI1> list) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.b = b(list);
    }

    public InterfaceC2426Ac0 a(InterfaceC2426Ac0 interfaceC2426Ac0) {
        if (interfaceC2426Ac0 == null) {
            return null;
        }
        if (!c()) {
            return interfaceC2426Ac0;
        }
        ArrayList arrayList = new ArrayList();
        for (InterfaceC2426Ac0.c cVar : interfaceC2426Ac0.b()) {
            if (this.b.contains(new Size(cVar.k(), cVar.h()))) {
                arrayList.add(cVar);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return InterfaceC2426Ac0.b.h(interfaceC2426Ac0.a(), interfaceC2426Ac0.e(), interfaceC2426Ac0.f(), arrayList);
    }

    public final Set<Size> b(List<NI1> list) {
        if (list != null && !list.isEmpty()) {
            HashSet hashSet = new HashSet(list.get(0).c());
            for (int i = 1; i < list.size(); i++) {
                hashSet.retainAll(list.get(i).c());
            }
            return hashSet;
        }
        return Collections.EMPTY_SET;
    }

    public boolean c() {
        return !this.a.isEmpty();
    }

    public boolean d(InterfaceC2426Ac0 interfaceC2426Ac0) {
        if (interfaceC2426Ac0 == null) {
            return false;
        }
        if (!c()) {
            return !interfaceC2426Ac0.b().isEmpty();
        }
        for (InterfaceC2426Ac0.c cVar : interfaceC2426Ac0.b()) {
            if (this.b.contains(new Size(cVar.k(), cVar.h()))) {
                return true;
            }
        }
        return false;
    }
}
