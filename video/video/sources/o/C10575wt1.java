package o;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: o.wt1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C10575wt1 implements Comparator<Object>, Serializable {
    public static final C10575wt1 X = new C10575wt1();
    private static final long serialVersionUID = 1;

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return 0;
        }
        if (obj == null) {
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        String obj3 = obj.toString();
        String obj4 = obj2.toString();
        if (obj3 == null && obj4 == null) {
            return 0;
        }
        if (obj3 == null) {
            return 1;
        }
        if (obj4 == null) {
            return -1;
        }
        return obj3.compareTo(obj4);
    }
}
