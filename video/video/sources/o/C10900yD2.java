package o;

import java.io.Serializable;

@InterfaceC10420wF0(serializable = true)
@InterfaceC6329fa0
/* renamed from: o.yD2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10900yD2 extends AbstractC10587ww1<Object> implements Serializable {
    public static final C10900yD2 Z = new C10900yD2();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return Z;
    }

    @Override // o.AbstractC10587ww1, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return obj.toString().compareTo(obj2.toString());
    }

    public String toString() {
        return "Ordering.usingToString()";
    }
}
