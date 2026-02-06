package o;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: o.Kl1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3454Kl1 extends J20 {
    public static final K20[] c = new K20[0];

    public C3454Kl1(C2469An c2469An) {
        super(c2469An);
    }

    public K20[] n(Map<XV, ?> map) throws C9349rr1 {
        VT1 vt1;
        C2469An h = h();
        if (map == null) {
            vt1 = null;
        } else {
            vt1 = (VT1) map.get(XV.NEED_RESULT_POINT_CALLBACK);
        }
        C10817xt0[] r = new C3649Ml1(h, vt1).r(map);
        if (r.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (C10817xt0 c10817xt0 : r) {
                try {
                    arrayList.add(j(c10817xt0));
                } catch (FO1 unused) {
                }
            }
            if (arrayList.isEmpty()) {
                return c;
            }
            return (K20[]) arrayList.toArray(new K20[arrayList.size()]);
        }
        throw C9349rr1.a();
    }
}
