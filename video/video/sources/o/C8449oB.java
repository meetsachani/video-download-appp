package o;

import java.util.List;

@Deprecated
/* renamed from: o.oB  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8449oB extends N {
    public static final char[] e = new char[0];

    public C8449oB() {
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
            if (N.d.getClass() == obj.getClass()) {
                try {
                    String[] strArr = (String[]) obj;
                    char[] cArr = new char[strArr.length];
                    for (int i = 0; i < strArr.length; i++) {
                        cArr[i] = strArr[i].charAt(0);
                    }
                    return cArr;
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
                char[] cArr2 = new char[size];
                for (int i2 = 0; i2 < size; i2++) {
                    cArr2[i2] = ((String) c.get(i2)).charAt(0);
                }
                return cArr2;
            } catch (Exception e3) {
                if (this.b) {
                    return this.a;
                }
                throw new WM(obj.toString(), e3);
            }
        }
    }

    public C8449oB(Object obj) {
        this.a = obj;
        this.b = true;
    }
}
