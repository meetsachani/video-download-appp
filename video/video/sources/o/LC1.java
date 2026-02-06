package o;

import android.os.PersistableBundle;
import java.util.Map;

/* loaded from: classes.dex */
public final class LC1 {
    public static final PersistableBundle a() {
        return JC1.a(0);
    }

    public static final PersistableBundle b(C4180Rx1<String, ? extends Object>... c4180Rx1Arr) {
        PersistableBundle a = JC1.a(c4180Rx1Arr.length);
        for (C4180Rx1<String, ? extends Object> c4180Rx1 : c4180Rx1Arr) {
            JC1.b(a, c4180Rx1.a(), c4180Rx1.b());
        }
        return a;
    }

    public static final PersistableBundle c(Map<String, ? extends Object> map) {
        PersistableBundle a = JC1.a(map.size());
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            JC1.b(a, entry.getKey(), entry.getValue());
        }
        return a;
    }
}
