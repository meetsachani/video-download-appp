package o;

import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.ResourceBundle;

@Deprecated
/* renamed from: o.md2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8072md2<V> implements InterfaceC10759xe2 {
    public static final AbstractC8072md2<String> a = new b(null);
    public static final AbstractC8072md2<String> b = new d();

    /* renamed from: o.md2$b */
    /* loaded from: classes4.dex */
    public static class b<V> extends AbstractC8072md2<V> {
        public final Map<String, V> c;

        public b(Map<String, V> map) {
            this.c = map == null ? Collections.EMPTY_MAP : map;
        }

        @Override // o.InterfaceC10759xe2
        public String lookup(String str) {
            return Objects.toString(this.c.get(str), null);
        }

        public String toString() {
            return super.toString() + " [map=" + this.c + C6566gU0.g;
        }
    }

    /* renamed from: o.md2$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC8072md2<String> {
        public final ResourceBundle c;

        @Override // o.InterfaceC10759xe2
        public String lookup(String str) {
            ResourceBundle resourceBundle = this.c;
            if (resourceBundle != null && str != null && resourceBundle.containsKey(str)) {
                return this.c.getString(str);
            }
            return null;
        }

        public String toString() {
            return super.toString() + " [resourceBundle=" + this.c + C6566gU0.g;
        }

        public c(ResourceBundle resourceBundle) {
            this.c = resourceBundle;
        }
    }

    /* renamed from: o.md2$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC8072md2<String> {
        public d() {
        }

        @Override // o.InterfaceC10759xe2
        public String lookup(String str) {
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

    public static <V> AbstractC8072md2<V> b(Map<String, V> map) {
        return new b(map);
    }

    public static AbstractC8072md2<?> c() {
        return a;
    }

    public static AbstractC8072md2<String> d(ResourceBundle resourceBundle) {
        return new c(resourceBundle);
    }

    public static AbstractC8072md2<String> e() {
        return b;
    }
}
