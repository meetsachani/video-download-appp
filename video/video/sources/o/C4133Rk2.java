package o;

import android.util.ArrayMap;
import android.util.Pair;
import java.util.Map;
import java.util.Set;

/* renamed from: o.Rk2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4133Rk2 {
    public static final C4133Rk2 b = new C4133Rk2(new ArrayMap());
    public static final String c = "android.hardware.camera2.CaptureRequest.setTag.";
    public static final String d = "android.hardware.camera2.CaptureRequest.setTag.CX";
    public final Map<String, Object> a;

    public C4133Rk2(Map<String, Object> map) {
        this.a = map;
    }

    public static C4133Rk2 a(Pair<String, Object> pair) {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put((String) pair.first, pair.second);
        return new C4133Rk2(arrayMap);
    }

    public static C4133Rk2 b() {
        return b;
    }

    public static C4133Rk2 c(C4133Rk2 c4133Rk2) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : c4133Rk2.e()) {
            arrayMap.put(str, c4133Rk2.d(str));
        }
        return new C4133Rk2(arrayMap);
    }

    public Object d(String str) {
        return this.a.get(str);
    }

    public Set<String> e() {
        return this.a.keySet();
    }

    public final String toString() {
        return d;
    }
}
