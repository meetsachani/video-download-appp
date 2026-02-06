package o;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class RY0 implements InterfaceC5774dH0 {
    public final Map<String, List<QY0>> c;
    public volatile Map<String, String> d;

    /* loaded from: classes.dex */
    public static final class a {
        public static final String d = "User-Agent";
        public static final String e;
        public static final Map<String, List<QY0>> f;
        public boolean a = true;
        public Map<String, List<QY0>> b = f;
        public boolean c = true;

        static {
            String g = g();
            e = g;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(g)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(g)));
            }
            f = Collections.unmodifiableMap(hashMap);
        }

        public static String g() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                    sb.append(charAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        public a a(String str, String str2) {
            return b(str, new b(str2));
        }

        public a b(String str, QY0 qy0) {
            if (this.c && "User-Agent".equalsIgnoreCase(str)) {
                return i(str, qy0);
            }
            e();
            f(str).add(qy0);
            return this;
        }

        public RY0 c() {
            this.a = true;
            return new RY0(this.b);
        }

        public final Map<String, List<QY0>> d() {
            HashMap hashMap = new HashMap(this.b.size());
            for (Map.Entry<String, List<QY0>> entry : this.b.entrySet()) {
                hashMap.put(entry.getKey(), new ArrayList(entry.getValue()));
            }
            return hashMap;
        }

        public final void e() {
            if (this.a) {
                this.a = false;
                this.b = d();
            }
        }

        public final List<QY0> f(String str) {
            List<QY0> list = this.b.get(str);
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                this.b.put(str, arrayList);
                return arrayList;
            }
            return list;
        }

        public a h(String str, String str2) {
            b bVar;
            if (str2 == null) {
                bVar = null;
            } else {
                bVar = new b(str2);
            }
            return i(str, bVar);
        }

        public a i(String str, QY0 qy0) {
            e();
            if (qy0 == null) {
                this.b.remove(str);
            } else {
                List<QY0> f2 = f(str);
                f2.clear();
                f2.add(qy0);
            }
            if (this.c && "User-Agent".equalsIgnoreCase(str)) {
                this.c = false;
            }
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements QY0 {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        @Override // o.QY0
        public String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.a.equals(((b) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.a + "'}";
        }
    }

    public RY0(Map<String, List<QY0>> map) {
        this.c = Collections.unmodifiableMap(map);
    }

    @Override // o.InterfaceC5774dH0
    public Map<String, String> a() {
        if (this.d == null) {
            synchronized (this) {
                try {
                    if (this.d == null) {
                        this.d = Collections.unmodifiableMap(c());
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final String b(List<QY0> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String a2 = list.get(i).a();
            if (!TextUtils.isEmpty(a2)) {
                sb.append(a2);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    public final Map<String, String> c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<QY0>> entry : this.c.entrySet()) {
            String b2 = b(entry.getValue());
            if (!TextUtils.isEmpty(b2)) {
                hashMap.put(entry.getKey(), b2);
            }
        }
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (obj instanceof RY0) {
            return this.c.equals(((RY0) obj).c);
        }
        return false;
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.c + '}';
    }
}
