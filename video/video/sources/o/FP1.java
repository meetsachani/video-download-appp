package o;

import java.util.Collection;

/* loaded from: classes4.dex */
public class FP1 extends AbstractC4253Sp2 {
    private static final long serialVersionUID = 1;

    @Override // o.AbstractC4253Sp2
    public void D(StringBuffer stringBuffer, String str, Object obj) {
        if (!C8457oD.V(obj.getClass()) && !String.class.equals(obj.getClass()) && k1(obj.getClass())) {
            stringBuffer.append(C8755pQ1.z0(obj, this));
        } else {
            super.D(stringBuffer, str, obj);
        }
    }

    @Override // o.AbstractC4253Sp2
    public void E(StringBuffer stringBuffer, String str, Collection<?> collection) {
        s(stringBuffer, collection);
        V(stringBuffer, collection);
        O(stringBuffer, str, collection.toArray());
    }

    public boolean k1(Class<?> cls) {
        return true;
    }
}
