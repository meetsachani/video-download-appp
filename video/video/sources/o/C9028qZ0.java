package o;

import java.util.ArrayList;
import java.util.List;

/* renamed from: o.qZ0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9028qZ0 implements InterfaceC5450bx {
    public final int b;

    public C9028qZ0(int i) {
        this.b = i;
    }

    @Override // o.InterfaceC5450bx
    public List<InterfaceC6420fx> b(List<InterfaceC6420fx> list) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC6420fx interfaceC6420fx : list) {
            C10907yF1.b(interfaceC6420fx instanceof InterfaceC6918hx, "The camera info doesn't contain internal implementation.");
            if (interfaceC6420fx.g() == this.b) {
                arrayList.add(interfaceC6420fx);
            }
        }
        return arrayList;
    }

    public int c() {
        return this.b;
    }
}
