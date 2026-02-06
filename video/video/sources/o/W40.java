package o;

import java.util.List;

@Deprecated
/* loaded from: classes4.dex */
public final class W40 extends N {
    public static final double[] e = new double[0];

    public W40() {
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
                    double[] dArr = new double[strArr.length];
                    while (i < strArr.length) {
                        dArr[i] = Double.parseDouble(strArr[i]);
                        i++;
                    }
                    return dArr;
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
                double[] dArr2 = new double[size];
                while (i < size) {
                    dArr2[i] = Double.parseDouble((String) c.get(i));
                    i++;
                }
                return dArr2;
            } catch (Exception e3) {
                if (this.b) {
                    return this.a;
                }
                throw new WM(obj.toString(), e3);
            }
        }
    }

    public W40(Object obj) {
        this.a = obj;
        this.b = true;
    }
}
