package o;

import java.util.List;

@Deprecated
/* renamed from: o.dv0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5927dv0 extends N {
    public static final float[] e = new float[0];

    public C5927dv0() {
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
                    float[] fArr = new float[strArr.length];
                    while (i < strArr.length) {
                        fArr[i] = Float.parseFloat(strArr[i]);
                        i++;
                    }
                    return fArr;
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
                float[] fArr2 = new float[size];
                while (i < size) {
                    fArr2[i] = Float.parseFloat((String) c.get(i));
                    i++;
                }
                return fArr2;
            } catch (Exception e3) {
                if (this.b) {
                    return this.a;
                }
                throw new WM(obj.toString(), e3);
            }
        }
    }

    public C5927dv0(Object obj) {
        this.a = obj;
        this.b = true;
    }
}
