package o;

import java.util.HashMap;
import java.util.Set;

/* loaded from: classes.dex */
public class KQ1 {
    public static final KQ1 b = new KQ1();
    public HashMap<String, LQ1> a = new HashMap<>();

    public static KQ1 c() {
        return b;
    }

    public String a(String str) {
        LQ1 lq1 = this.a.get(str);
        if (lq1 != null) {
            return lq1.g();
        }
        return null;
    }

    public String b(String str) {
        LQ1 lq1 = this.a.get(str);
        if (lq1 != null) {
            return lq1.h();
        }
        return null;
    }

    public long d(String str) {
        LQ1 lq1 = this.a.get(str);
        if (lq1 != null) {
            return lq1.e();
        }
        return Long.MAX_VALUE;
    }

    public Set<String> e() {
        return this.a.keySet();
    }

    public void f(String str, LQ1 lq1) {
        this.a.put(str, lq1);
    }

    public void g(String str, int i) {
        LQ1 lq1 = this.a.get(str);
        if (lq1 != null) {
            lq1.a(i);
        }
    }

    public void h(String str, int i) {
        LQ1 lq1 = this.a.get(str);
        if (lq1 != null) {
            lq1.b(i);
        }
    }

    public void i(String str, LQ1 lq1) {
        this.a.remove(str);
    }

    public void j(String str, String str2) {
        LQ1 lq1 = this.a.get(str);
        if (lq1 != null) {
            lq1.f(str2);
        }
    }

    public void k(String str, int i, int i2) {
        LQ1 lq1 = this.a.get(str);
        if (lq1 != null) {
            lq1.d(i, i2);
        }
    }

    public void l(String str, float f) {
        LQ1 lq1 = this.a.get(str);
        if (lq1 != null) {
            lq1.c(f);
        }
    }
}
