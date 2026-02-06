package o;

import java.util.HashMap;
import java.util.Map;

/* renamed from: o.jK2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7255jK2 {
    public static final int c = 2;
    public static final int d = 1;
    public static final int e = 0;
    public int a;
    public Map<String, Integer> b;

    /* renamed from: o.jK2$a */
    /* loaded from: classes.dex */
    public static final class a {
        public int a;
        public Map<String, Integer> b = new HashMap();

        public a(int i) {
            this.a = i;
        }

        public a c(String str, int i) {
            this.b.put(str, Integer.valueOf(i));
            return this;
        }

        public C7255jK2 d() {
            return new C7255jK2(this);
        }

        public a e(Map<String, Integer> map) {
            this.b = map;
            return this;
        }
    }

    public C7255jK2(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
    }

    public int a() {
        return this.a;
    }

    public Map<String, Integer> b() {
        return this.b;
    }
}
