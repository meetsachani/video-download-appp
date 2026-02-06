package o;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: o.vu0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10335vu0 implements Comparator {
    public static final int Z0 = 0;
    public static final int a1 = 1;
    public static final int b1 = 2;
    public final Map X = new HashMap();
    public int Y = 0;
    public boolean Z = false;
    public int Y0 = 2;

    public C10335vu0() {
    }

    public boolean a(Object obj) {
        c();
        Map map = this.X;
        int i = this.Y;
        this.Y = i + 1;
        if (map.put(obj, new Integer(i)) == null) {
            return true;
        }
        return false;
    }

    public boolean b(Object obj, Object obj2) {
        c();
        Integer num = (Integer) this.X.get(obj);
        if (num != null) {
            if (this.X.put(obj2, num) == null) {
                return true;
            }
            return false;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(obj);
        stringBuffer.append(" not known to ");
        stringBuffer.append(this);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public void c() {
        if (!e()) {
            return;
        }
        throw new UnsupportedOperationException("Cannot modify a FixedOrderComparator after a comparison");
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        this.Z = true;
        Integer num = (Integer) this.X.get(obj);
        Integer num2 = (Integer) this.X.get(obj2);
        if (num != null && num2 != null) {
            return num.compareTo(num2);
        }
        int i = this.Y0;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    if (num != null) {
                        obj = obj2;
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Attempting to compare unknown object ");
                    stringBuffer.append(obj);
                    throw new IllegalArgumentException(stringBuffer.toString());
                }
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("Unknown unknownObjectBehavior: ");
                stringBuffer2.append(this.Y0);
                throw new UnsupportedOperationException(stringBuffer2.toString());
            } else if (num != null) {
                return -1;
            } else {
                if (num2 != null) {
                    return 1;
                }
                return 0;
            }
        } else if (num != null) {
            return 1;
        } else {
            if (num2 != null) {
                return -1;
            }
            return 0;
        }
    }

    public int d() {
        return this.Y0;
    }

    public boolean e() {
        return this.Z;
    }

    public void f(int i) {
        c();
        if (i != 1 && i != 0 && i != 2) {
            throw new IllegalArgumentException("Unrecognised value for unknown behaviour flag");
        }
        this.Y0 = i;
    }

    public C10335vu0(Object[] objArr) {
        if (objArr != null) {
            for (Object obj : objArr) {
                a(obj);
            }
            return;
        }
        throw new IllegalArgumentException("The list of items must not be null");
    }

    public C10335vu0(List list) {
        if (list != null) {
            for (Object obj : list) {
                a(obj);
            }
            return;
        }
        throw new IllegalArgumentException("The list of items must not be null");
    }
}
