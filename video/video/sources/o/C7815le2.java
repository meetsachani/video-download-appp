package o;

import java.util.List;

@Deprecated
/* renamed from: o.le2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7815le2 extends N {
    public static final String[] e = new String[0];
    public static final int[] f = new int[0];

    public C7815le2() {
        this.a = null;
        this.b = false;
    }

    @Override // o.N, o.InterfaceC7507kN
    public Object b(Class cls, Object obj) {
        if (obj == null) {
            if (this.b) {
                return this.a;
            }
            throw new WM("No value specified");
        } else if (e.getClass() == obj.getClass()) {
            return obj;
        } else {
            int i = 0;
            if (f.getClass() == obj.getClass()) {
                int[] iArr = (int[]) obj;
                String[] strArr = new String[iArr.length];
                while (i < iArr.length) {
                    strArr[i] = Integer.toString(iArr[i]);
                    i++;
                }
                return strArr;
            }
            try {
                List c = c(obj.toString());
                int size = c.size();
                String[] strArr2 = new String[size];
                while (i < size) {
                    strArr2[i] = (String) c.get(i);
                    i++;
                }
                return strArr2;
            } catch (Exception e2) {
                if (this.b) {
                    return this.a;
                }
                throw new WM(obj.toString(), e2);
            }
        }
    }

    public C7815le2(Object obj) {
        this.a = obj;
        this.b = true;
    }
}
