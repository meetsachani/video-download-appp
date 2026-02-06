package o;

import java.util.List;

@Deprecated
/* loaded from: classes4.dex */
public final class A41 extends N {
    public static final long[] e = new long[0];

    public A41() {
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
                    long[] jArr = new long[strArr.length];
                    while (i < strArr.length) {
                        jArr[i] = Long.parseLong(strArr[i]);
                        i++;
                    }
                    return jArr;
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
                long[] jArr2 = new long[size];
                while (i < size) {
                    jArr2[i] = Long.parseLong((String) c.get(i));
                    i++;
                }
                return jArr2;
            } catch (Exception e3) {
                if (this.b) {
                    return this.a;
                }
                throw new WM(obj.toString(), e3);
            }
        }
    }

    public A41(Object obj) {
        this.a = obj;
        this.b = true;
    }
}
