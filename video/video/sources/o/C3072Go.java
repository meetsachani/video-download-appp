package o;

import java.util.List;

@Deprecated
/* renamed from: o.Go  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3072Go extends N {
    public static final Class f = new boolean[0].getClass();
    public static final C3562Lo g = new C3562Lo();
    public final C3562Lo e;

    public C3072Go() {
        this.e = g;
    }

    @Override // o.N, o.InterfaceC7507kN
    public Object b(Class cls, Object obj) {
        if (obj == null) {
            if (this.b) {
                return this.a;
            }
            throw new WM("No value specified");
        } else if (f == obj.getClass()) {
            return obj;
        } else {
            int i = 0;
            if (N.d.getClass() == obj.getClass()) {
                try {
                    String[] strArr = (String[]) obj;
                    boolean[] zArr = new boolean[strArr.length];
                    while (i < strArr.length) {
                        zArr[i] = ((Boolean) this.e.b(Boolean.class, strArr[i])).booleanValue();
                        i++;
                    }
                    return zArr;
                } catch (Exception e) {
                    if (this.b) {
                        return this.a;
                    }
                    throw new WM(obj.toString(), e);
                }
            }
            try {
                List c = c(obj.toString());
                int size = c.size();
                boolean[] zArr2 = new boolean[size];
                while (i < size) {
                    zArr2[i] = ((Boolean) this.e.b(Boolean.class, (String) c.get(i))).booleanValue();
                    i++;
                }
                return zArr2;
            } catch (Exception e2) {
                if (this.b) {
                    return this.a;
                }
                throw new WM(obj.toString(), e2);
            }
        }
    }

    public C3072Go(Object obj) {
        super(obj);
        this.e = g;
    }

    public C3072Go(C3562Lo c3562Lo, Object obj) {
        super(obj);
        this.e = c3562Lo;
    }
}
