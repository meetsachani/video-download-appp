package o;

import java.util.List;

@Deprecated
/* loaded from: classes4.dex */
public final class LR0 extends N {
    public static final int[] e = new int[0];

    public LR0() {
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
            if (N.d.getClass() == obj.getClass()) {
                try {
                    String[] strArr = (String[]) obj;
                    int[] iArr = new int[strArr.length];
                    while (i < strArr.length) {
                        iArr[i] = Integer.parseInt(strArr[i]);
                        i++;
                    }
                    return iArr;
                } catch (Exception e2) {
                    if (this.b) {
                        return this.a;
                    }
                    throw new WM(obj.toString(), e2);
                }
            }
            try {
                List c = c(obj.toString());
                int size = c.size();
                int[] iArr2 = new int[size];
                while (i < size) {
                    iArr2[i] = Integer.parseInt((String) c.get(i));
                    i++;
                }
                return iArr2;
            } catch (Exception e3) {
                if (this.b) {
                    return this.a;
                }
                throw new WM(obj.toString(), e3);
            }
        }
    }

    public LR0(Object obj) {
        this.a = obj;
        this.b = true;
    }
}
