package o;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class GH2 {
    public final Map<String, CH2> a = new LinkedHashMap();

    public final void a() {
        for (CH2 ch2 : this.a.values()) {
            ch2.b();
        }
        this.a.clear();
    }

    public final CH2 b(String str) {
        C6562gT0.p(str, "key");
        return this.a.get(str);
    }

    public final Set<String> c() {
        return new HashSet(this.a.keySet());
    }

    public final void d(String str, CH2 ch2) {
        C6562gT0.p(str, "key");
        C6562gT0.p(ch2, "viewModel");
        CH2 put = this.a.put(str, ch2);
        if (put != null) {
            put.e();
        }
    }
}
