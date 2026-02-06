package o;

import java.util.Map;

@Deprecated
/* renamed from: o.ld2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7811ld2<V> {
    public static final AbstractC7811ld2<String> a = new b(null);
    public static final AbstractC7811ld2<String> b = new c();

    /* renamed from: o.ld2$b */
    /* loaded from: classes4.dex */
    public static class b<V> extends AbstractC7811ld2<V> {
        public final Map<String, V> c;

        public b(Map<String, V> map) {
            this.c = map;
        }

        @Override // o.AbstractC7811ld2
        public String a(String str) {
            V v;
            Map<String, V> map = this.c;
            if (map == null || (v = map.get(str)) == null) {
                return null;
            }
            return v.toString();
        }
    }

    /* renamed from: o.ld2$c */
    /* loaded from: classes4.dex */
    public static class c extends AbstractC7811ld2<String> {
        public c() {
        }

        @Override // o.AbstractC7811ld2
        public String a(String str) {
            if (!str.isEmpty()) {
                try {
                    return System.getProperty(str);
                } catch (SecurityException unused) {
                    return null;
                }
            }
            return null;
        }
    }

    public static <V> AbstractC7811ld2<V> b(Map<String, V> map) {
        return new b(map);
    }

    public static AbstractC7811ld2<?> c() {
        return a;
    }

    public static AbstractC7811ld2<String> d() {
        return b;
    }

    public abstract String a(String str);
}
