package o;

import java.util.HashMap;
import java.util.Map;

/* renamed from: o.vj1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10289vj1 {
    public final Map<String, Integer> a = new HashMap();

    public boolean a(String str, int i) {
        int i2;
        C6562gT0.p(str, "name");
        Integer num = this.a.get(str);
        boolean z = false;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        if ((i2 & i) != 0) {
            z = true;
        }
        this.a.put(str, Integer.valueOf(i | i2));
        return !z;
    }
}
