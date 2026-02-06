package o;

import java.util.List;

/* loaded from: classes4.dex */
public class ZY0 extends U2 {
    private static final long serialVersionUID = -1708388017160694542L;
    public final InterfaceC5399bk0 Y;

    public ZY0(List list, InterfaceC5399bk0 interfaceC5399bk0) {
        super(list);
        if (interfaceC5399bk0 != null) {
            this.Y = interfaceC5399bk0;
            return;
        }
        throw new IllegalArgumentException("Factory must not be null");
    }

    public static List f(List list, InterfaceC5399bk0 interfaceC5399bk0) {
        return new ZY0(list, interfaceC5399bk0);
    }

    @Override // o.AbstractC9388s1, java.util.List
    public Object get(int i) {
        int size = e().size();
        if (i < size) {
            Object obj = e().get(i);
            if (obj == null) {
                Object a = this.Y.a();
                e().set(i, a);
                return a;
            }
            return obj;
        }
        while (size < i) {
            e().add(null);
            size++;
        }
        Object a2 = this.Y.a();
        e().add(a2);
        return a2;
    }

    @Override // o.AbstractC9388s1, java.util.List
    public List subList(int i, int i2) {
        return new ZY0(e().subList(i, i2), this.Y);
    }
}
