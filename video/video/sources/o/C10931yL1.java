package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.yL1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10931yL1 {
    public final List<InterfaceC10688xL1> a;

    public C10931yL1(List<InterfaceC10688xL1> list) {
        this.a = new ArrayList(list);
    }

    public boolean a(Class<? extends InterfaceC10688xL1> cls) {
        for (InterfaceC10688xL1 interfaceC10688xL1 : this.a) {
            if (cls.isAssignableFrom(interfaceC10688xL1.getClass())) {
                return true;
            }
        }
        return false;
    }

    public <T extends InterfaceC10688xL1> T b(Class<T> cls) {
        Iterator<InterfaceC10688xL1> it = this.a.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }

    public <T extends InterfaceC10688xL1> List<T> c(Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC10688xL1 interfaceC10688xL1 : this.a) {
            if (cls.isAssignableFrom(interfaceC10688xL1.getClass())) {
                arrayList.add(interfaceC10688xL1);
            }
        }
        return arrayList;
    }
}
