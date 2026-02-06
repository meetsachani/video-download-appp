package o;

import java.lang.reflect.Array;
import java.util.Collection;
import okhttp3.HttpUrl;

/* renamed from: o.r0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC9141r0 implements InterfaceC7507kN {
    public static final String d = "(N.B. Converters can be configured to use default values to avoid throwing exceptions)";
    public static final String e = "org.apache.commons.beanutils.converters.";
    public transient J31 a;
    public boolean b = false;
    public Object c = null;

    public AbstractC9141r0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC7507kN
    public <T> T b(Class<T> cls, Object obj) {
        Class<?> cls2;
        String str;
        if (cls == null) {
            return (T) e(cls, obj);
        }
        if (obj == null) {
            cls2 = null;
        } else {
            cls2 = obj.getClass();
        }
        Class q = C6282fN.q(cls);
        if (m().c()) {
            J31 m = m();
            StringBuilder sb = new StringBuilder();
            sb.append("Converting");
            if (obj == null) {
                str = "";
            } else {
                str = " '" + o(cls2) + "'";
            }
            sb.append(str);
            sb.append(" value '");
            sb.append(obj);
            sb.append("' to type '");
            sb.append(o(q));
            sb.append("'");
            m.a(sb.toString());
        }
        Object d2 = d(obj);
        if (d2 == null) {
            return (T) k(q);
        }
        Class<?> cls3 = d2.getClass();
        try {
            if (q.equals(String.class)) {
                return (T) q.cast(f(d2));
            }
            if (q.equals(cls3)) {
                if (m().c()) {
                    m().a("    No conversion required, value is already a " + o(q));
                }
                return (T) q.cast(d2);
            }
            Object g = g(q, d2);
            if (m().c()) {
                m().a("    Converted to " + o(q) + " value '" + g + "'");
            }
            return (T) q.cast(g);
        } catch (Throwable th) {
            return (T) j(q, d2, th);
        }
    }

    public WM c(Class<?> cls, Object obj) {
        return new WM("Can't convert value '" + obj + "' to type " + cls);
    }

    public Object d(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj.getClass().isArray()) {
            if (Array.getLength(obj) <= 0) {
                return null;
            }
            return Array.get(obj, 0);
        } else if (obj instanceof Collection) {
            Collection collection = (Collection) obj;
            if (collection.size() <= 0) {
                return null;
            }
            return collection.iterator().next();
        } else {
            return obj;
        }
    }

    public final <T> T e(Class<T> cls, Object obj) {
        return (T) b(i(), obj);
    }

    public String f(Object obj) throws Throwable {
        return obj.toString();
    }

    public abstract <T> T g(Class<T> cls, Object obj) throws Throwable;

    public Object h(Class<?> cls) {
        if (cls.equals(String.class)) {
            return null;
        }
        return this.c;
    }

    public abstract Class<?> i();

    public <T> T j(Class<T> cls, Object obj, Throwable th) {
        if (m().c()) {
            if (th instanceof WM) {
                m().a("    Conversion threw ConversionException: " + th.getMessage());
            } else {
                m().a("    Conversion threw " + th);
            }
        }
        if (this.b) {
            return (T) k(cls);
        }
        if (th instanceof WM) {
            WM wm = (WM) th;
            if (m().c()) {
                m().a("    Re-throwing ConversionException: " + wm.getMessage());
                m().a("    (N.B. Converters can be configured to use default values to avoid throwing exceptions)");
                throw wm;
            }
            throw wm;
        }
        String str = "Error converting from '" + o(obj.getClass()) + "' to '" + o(cls) + "' " + th.getMessage();
        WM wm2 = new WM(str, th);
        if (m().c()) {
            m().a("    Throwing ConversionException: " + str);
            m().a("    (N.B. Converters can be configured to use default values to avoid throwing exceptions)");
        }
        C3651Mm.p(wm2, th);
        throw wm2;
    }

    public <T> T k(Class<T> cls) {
        String str;
        if (!this.b && !cls.equals(String.class)) {
            WM wm = new WM("No value specified for '" + o(cls) + "'");
            if (m().c()) {
                m().a("    Throwing ConversionException: " + wm.getMessage());
                m().a("    (N.B. Converters can be configured to use default values to avoid throwing exceptions)");
            }
            throw wm;
        }
        Object h = h(cls);
        if (this.b && h != null && !cls.equals(h.getClass())) {
            try {
                h = g(cls, this.c);
            } catch (Throwable th) {
                throw new WM("Default conversion to " + o(cls) + " failed.", th);
            }
        }
        if (m().c()) {
            J31 m = m();
            StringBuilder sb = new StringBuilder();
            sb.append("    Using default ");
            if (h == null) {
                str = "";
            } else {
                str = o(h.getClass()) + C4500Ve2.b;
            }
            sb.append(str);
            sb.append("value '");
            sb.append(this.c);
            sb.append("'");
            m.a(sb.toString());
        }
        return cls.cast(h);
    }

    public boolean l() {
        return this.b;
    }

    public J31 m() {
        if (this.a == null) {
            this.a = U31.q(getClass());
        }
        return this.a;
    }

    public void n(Object obj) {
        this.b = false;
        if (m().c()) {
            J31 m = m();
            m.a("Setting default value: " + obj);
        }
        if (obj == null) {
            this.c = null;
        } else {
            this.c = b(i(), obj);
        }
        this.b = true;
    }

    public String o(Class<?> cls) {
        String name;
        if (cls == null) {
            name = "null";
        } else if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            int i = 1;
            while (componentType.isArray()) {
                componentType = componentType.getComponentType();
                i++;
            }
            name = componentType.getName();
            for (int i2 = 0; i2 < i; i2++) {
                name = name + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            }
        } else {
            name = cls.getName();
        }
        if (!name.startsWith("java.lang.") && !name.startsWith("java.util.") && !name.startsWith("java.math.")) {
            if (name.startsWith(e)) {
                return name.substring(40);
            }
            return name;
        }
        return name.substring(10);
    }

    public String toString() {
        return o(getClass()) + "[UseDefault=" + this.b + C6566gU0.g;
    }

    public AbstractC9141r0(Object obj) {
        n(obj);
    }
}
