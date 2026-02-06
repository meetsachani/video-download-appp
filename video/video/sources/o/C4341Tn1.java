package o;

import android.util.ArrayMap;
import java.util.Map;

/* renamed from: o.Tn1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4341Tn1 extends C4133Rk2 {
    public C4341Tn1(Map<String, Object> map) {
        super(map);
    }

    public static C4341Tn1 g() {
        return new C4341Tn1(new ArrayMap());
    }

    public static C4341Tn1 h(C4133Rk2 c4133Rk2) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : c4133Rk2.e()) {
            arrayMap.put(str, c4133Rk2.d(str));
        }
        return new C4341Tn1(arrayMap);
    }

    public void f(C4133Rk2 c4133Rk2) {
        Map<String, Object> map;
        Map<String, Object> map2 = this.a;
        if (map2 != null && (map = c4133Rk2.a) != null) {
            map2.putAll(map);
        }
    }

    public void i(String str, Object obj) {
        this.a.put(str, obj);
    }
}
