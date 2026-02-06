package o;

import java.util.HashMap;
import java.util.Map;
import o.LK;

/* renamed from: o.pH0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8718pH0 {
    public static final Map<LK.f, String> e;
    public static final Map<b, String> f;
    public final String a;
    public a b;
    public String c;
    public Map<String, String> d;

    /* renamed from: o.pH0$a */
    /* loaded from: classes.dex */
    public static final class a {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public String toString() {
            return this.a;
        }
    }

    /* renamed from: o.pH0$b */
    /* loaded from: classes.dex */
    public enum b {
        VERTICAL_GUIDELINE,
        HORIZONTAL_GUIDELINE,
        VERTICAL_CHAIN,
        HORIZONTAL_CHAIN,
        BARRIER
    }

    static {
        HashMap hashMap = new HashMap();
        e = hashMap;
        hashMap.put(LK.f.LEFT, "'left'");
        hashMap.put(LK.f.RIGHT, "'right'");
        hashMap.put(LK.f.TOP, "'top'");
        hashMap.put(LK.f.BOTTOM, "'bottom'");
        hashMap.put(LK.f.START, "'start'");
        hashMap.put(LK.f.END, "'end'");
        hashMap.put(LK.f.BASELINE, "'baseline'");
        HashMap hashMap2 = new HashMap();
        f = hashMap2;
        hashMap2.put(b.VERTICAL_GUIDELINE, "vGuideline");
        hashMap2.put(b.HORIZONTAL_GUIDELINE, "hGuideline");
        hashMap2.put(b.VERTICAL_CHAIN, "vChain");
        hashMap2.put(b.HORIZONTAL_CHAIN, "hChain");
        hashMap2.put(b.BARRIER, "barrier");
    }

    public C8718pH0(String str, a aVar) {
        this.b = null;
        this.d = new HashMap();
        this.a = str;
        this.b = aVar;
    }

    public static void f(String[] strArr) {
        System.out.println(new C4424Uk("abc", "['a1', 'b2']").toString());
    }

    public void a(Map<String, String> map, StringBuilder sb) {
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(str);
                sb.append(":");
                sb.append(map.get(str));
                sb.append(",\n");
            }
        }
    }

    public Map<String, String> b() {
        String str = this.c;
        if (str != null && str.length() != 0) {
            HashMap hashMap = new HashMap();
            StringBuilder sb = new StringBuilder();
            String str2 = "";
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.c.length(); i3++) {
                char charAt = this.c.charAt(i3);
                if (charAt == ':') {
                    str2 = sb.toString();
                    sb.setLength(0);
                } else if (charAt == ',' && i == 0 && i2 == 0) {
                    hashMap.put(str2, sb.toString());
                    sb.setLength(0);
                    str2 = "";
                } else if (charAt != ' ') {
                    if (charAt != '[') {
                        if (charAt == ']') {
                            i--;
                        } else if (charAt != '{') {
                            if (charAt == '}') {
                                i2--;
                            }
                        } else {
                            i2++;
                        }
                    } else {
                        i++;
                    }
                    sb.append(charAt);
                }
            }
            hashMap.put(str2, sb.toString());
            return hashMap;
        }
        return null;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.a;
    }

    public a e() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.a + ":{\n");
        if (this.b != null) {
            sb.append("type:'");
            sb.append(this.b.toString());
            sb.append("',\n");
        }
        Map<String, String> map = this.d;
        if (map != null) {
            a(map, sb);
        }
        sb.append("},\n");
        return sb.toString();
    }

    public C8718pH0(String str, a aVar, String str2) {
        this.b = null;
        this.d = new HashMap();
        this.a = str;
        this.b = aVar;
        this.c = str2;
        this.d = b();
    }
}
