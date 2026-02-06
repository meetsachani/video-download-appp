package o;

import android.hardware.camera2.CameraCharacteristics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.C2898Ex;
import o.InterfaceC2797Dw;

/* renamed from: o.Cu  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2693Cu implements InterfaceC2797Dw {
    public static final String j = "Camera2CameraCoordinator";
    public final C8392nx d;
    public int i = 0;
    public final Map<String, List<String>> f = new HashMap();
    public Set<Set<String>> h = new HashSet();
    public final List<InterfaceC2797Dw.b> e = new ArrayList();
    public List<InterfaceC6420fx> g = new ArrayList();

    public C2693Cu(C8392nx c8392nx) {
        this.d = c8392nx;
        k();
    }

    public static /* synthetic */ List i(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC6420fx interfaceC6420fx = (InterfaceC6420fx) it.next();
            if (str.equals(C5199av.b(interfaceC6420fx).e())) {
                return Collections.singletonList(interfaceC6420fx);
            }
        }
        throw new IllegalArgumentException("No camera can be find for id: " + str);
    }

    public static C2898Ex j(C8392nx c8392nx, final String str) {
        C2898Ex.a a = new C2898Ex.a().a(new InterfaceC5450bx() { // from class: o.Bu
            @Override // o.InterfaceC5450bx
            public final List b(List list) {
                return C2693Cu.i(str, list);
            }
        });
        try {
            a.d(((Integer) c8392nx.d(str).a(CameraCharacteristics.LENS_FACING)).intValue());
            return a.b();
        } catch (C3197Hv e) {
            throw new RuntimeException(e);
        }
    }

    @Override // o.InterfaceC2797Dw
    public List<List<C2898Ex>> a() {
        ArrayList arrayList = new ArrayList();
        for (Set<String> set : this.h) {
            ArrayList arrayList2 = new ArrayList();
            for (String str : set) {
                arrayList2.add(j(this.d, str));
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    @Override // o.InterfaceC2797Dw
    public void b(List<InterfaceC6420fx> list) {
        this.g = new ArrayList(list);
    }

    @Override // o.InterfaceC2797Dw
    public void c(InterfaceC2797Dw.b bVar) {
        this.e.add(bVar);
    }

    @Override // o.InterfaceC2797Dw
    public String d(String str) {
        if (!this.f.containsKey(str)) {
            return null;
        }
        for (String str2 : this.f.get(str)) {
            for (InterfaceC6420fx interfaceC6420fx : this.g) {
                if (str2.equals(C5199av.b(interfaceC6420fx).e())) {
                    return str2;
                }
            }
        }
        return null;
    }

    @Override // o.InterfaceC2797Dw
    public int e() {
        return this.i;
    }

    @Override // o.InterfaceC2797Dw
    public void f(InterfaceC2797Dw.b bVar) {
        this.e.remove(bVar);
    }

    @Override // o.InterfaceC2797Dw
    public List<InterfaceC6420fx> g() {
        return this.g;
    }

    @Override // o.InterfaceC2797Dw
    public void h(int i) {
        if (i != this.i) {
            for (InterfaceC2797Dw.b bVar : this.e) {
                bVar.a(this.i, i);
            }
        }
        if (this.i == 2 && i != 2) {
            this.g.clear();
        }
        this.i = i;
    }

    public final void k() {
        try {
            this.h = this.d.f();
        } catch (C3197Hv unused) {
            C7433k41.c(j, "Failed to get concurrent camera ids");
        }
        for (Set<String> set : this.h) {
            ArrayList arrayList = new ArrayList(set);
            if (arrayList.size() >= 2) {
                String str = (String) arrayList.get(0);
                String str2 = (String) arrayList.get(1);
                if (!this.f.containsKey(str)) {
                    this.f.put(str, new ArrayList());
                }
                if (!this.f.containsKey(str2)) {
                    this.f.put(str2, new ArrayList());
                }
                this.f.get(str).add((String) arrayList.get(1));
                this.f.get(str2).add((String) arrayList.get(0));
            }
        }
    }

    @Override // o.InterfaceC2797Dw
    public void shutdown() {
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.h.clear();
        this.i = 0;
    }
}
