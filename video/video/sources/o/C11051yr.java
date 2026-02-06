package o;

import java.util.List;

@Deprecated
/* renamed from: o.yr  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C11051yr extends N {
    public static final byte[] e = new byte[0];

    public C11051yr() {
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
                    byte[] bArr = new byte[strArr.length];
                    while (i < strArr.length) {
                        bArr[i] = Byte.parseByte(strArr[i]);
                        i++;
                    }
                    return bArr;
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
                byte[] bArr2 = new byte[size];
                while (i < size) {
                    bArr2[i] = Byte.parseByte((String) c.get(i));
                    i++;
                }
                return bArr2;
            } catch (Exception e3) {
                if (this.b) {
                    return this.a;
                }
                throw new WM(obj.toString(), e3);
            }
        }
    }

    public C11051yr(Object obj) {
        this.a = obj;
        this.b = true;
    }
}
