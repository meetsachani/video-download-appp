package o;

import java.util.List;

@Deprecated
/* renamed from: o.u42  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9889u42 extends N {
    public static final short[] e = new short[0];

    public C9889u42() {
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
                    short[] sArr = new short[strArr.length];
                    while (i < strArr.length) {
                        sArr[i] = Short.parseShort(strArr[i]);
                        i++;
                    }
                    return sArr;
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
                short[] sArr2 = new short[size];
                while (i < size) {
                    sArr2[i] = Short.parseShort((String) c.get(i));
                    i++;
                }
                return sArr2;
            } catch (Exception e3) {
                if (this.b) {
                    return this.a;
                }
                throw new WM(obj.toString(), e3);
            }
        }
    }

    public C9889u42(Object obj) {
        this.a = obj;
        this.b = true;
    }
}
