package o;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: o.p21  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8659p21 {
    public Locale a = Locale.getDefault();
    public boolean b = false;
    public final J31 c = U31.q(C8415o21.class);
    public final C9818tn0 d;

    /* renamed from: o.p21$b */
    /* loaded from: classes4.dex */
    public static class b extends C9818tn0 {
        public final Map<Object, Object> Z;

        @Override // o.C9818tn0
        public boolean b() {
            return C3651Mm.g(this.Z);
        }

        @Override // o.C9818tn0
        public void c(boolean z) {
            C3651Mm.r(this.Z, z);
        }

        @Override // o.C9818tn0, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.Z.clear();
        }

        @Override // o.C9818tn0, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.Z.containsKey(obj);
        }

        @Override // o.C9818tn0, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public boolean containsValue(Object obj) {
            return this.Z.containsValue(obj);
        }

        @Override // o.C9818tn0, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<Object, Object>> entrySet() {
            return this.Z.entrySet();
        }

        @Override // o.C9818tn0, java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this.Z.equals(obj);
        }

        @Override // o.C9818tn0, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public Object get(Object obj) {
            return this.Z.get(obj);
        }

        @Override // o.C9818tn0, java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.Z.hashCode();
        }

        @Override // o.C9818tn0, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.Z.isEmpty();
        }

        @Override // o.C9818tn0, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public Set<Object> keySet() {
            return this.Z.keySet();
        }

        @Override // o.C9818tn0, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public Object put(Object obj, Object obj2) {
            return this.Z.put(obj, obj2);
        }

        @Override // o.C9818tn0, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public void putAll(Map map) {
            this.Z.putAll(map);
        }

        @Override // o.C9818tn0, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public Object remove(Object obj) {
            return this.Z.remove(obj);
        }

        @Override // o.C9818tn0, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.Z.size();
        }

        @Override // o.C9818tn0, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public Collection<Object> values() {
            return this.Z.values();
        }

        public b(Map<Object, Object> map) {
            this.Z = map;
        }
    }

    public C8659p21() {
        b bVar = new b(C3651Mm.d());
        this.d = bVar;
        bVar.c(false);
        k();
        bVar.c(true);
    }

    public static C8659p21 p() {
        return C8172n21.F().G();
    }

    public Object a(String str, Class<?> cls) {
        return c(str, cls, this.a, null);
    }

    public Object b(String str, Class<?> cls, String str2) {
        return c(str, cls, this.a, str2);
    }

    public Object c(String str, Class<?> cls, Locale locale, String str2) {
        if (this.c.c()) {
            J31 j31 = this.c;
            j31.a("Convert string " + str + " to class " + cls.getName() + " using " + locale + " locale and " + str2 + " pattern");
        }
        InterfaceC8902q21 r = r(cls, locale);
        if (r == null) {
            cls = String.class;
            r = r(cls, locale);
        }
        if (this.c.f()) {
            J31 j312 = this.c;
            j312.r("  Using converter " + r);
        }
        return r.a(cls, str, str2);
    }

    public Object d(String[] strArr, Class<?> cls) {
        return f(strArr, cls, o(), null);
    }

    public Object e(String[] strArr, Class<?> cls, String str) {
        return f(strArr, cls, o(), str);
    }

    public Object f(String[] strArr, Class<?> cls, Locale locale, String str) {
        if (cls.isArray()) {
            cls = cls.getComponentType();
        }
        if (this.c.c()) {
            J31 j31 = this.c;
            j31.a("Convert String[" + strArr.length + "] to class " + cls.getName() + "[] using " + locale + " locale and " + str + " pattern");
        }
        Object newInstance = Array.newInstance(cls, strArr.length);
        for (int i = 0; i < strArr.length; i++) {
            Array.set(newInstance, i, c(strArr[i], cls, locale, str));
        }
        return newInstance;
    }

    public String g(Object obj) {
        return i(obj, this.a, null);
    }

    public String h(Object obj, String str) {
        return i(obj, this.a, str);
    }

    public String i(Object obj, Locale locale, String str) {
        return (String) r(String.class, locale).a(String.class, obj, str);
    }

    @Deprecated
    public C9818tn0 j(Locale locale) {
        b bVar = new b(C3651Mm.d());
        bVar.c(false);
        bVar.put(BigDecimal.class, new C5652cn(locale, this.b));
        bVar.put(BigInteger.class, new C6380fn(locale, this.b));
        bVar.put(Byte.class, new C5430bs(locale, this.b));
        bVar.put(Byte.TYPE, new C5430bs(locale, this.b));
        bVar.put(Double.class, new C6709h50(locale, this.b));
        bVar.put(Double.TYPE, new C6709h50(locale, this.b));
        bVar.put(Float.class, new C9607sv0(locale, this.b));
        bVar.put(Float.TYPE, new C9607sv0(locale, this.b));
        bVar.put(Integer.class, new OR0(locale, this.b));
        bVar.put(Integer.TYPE, new OR0(locale, this.b));
        bVar.put(Long.class, new N41(locale, this.b));
        bVar.put(Long.TYPE, new N41(locale, this.b));
        bVar.put(Short.class, new C10864y42(locale, this.b));
        bVar.put(Short.TYPE, new C10864y42(locale, this.b));
        bVar.put(String.class, new C10516we2(locale, this.b));
        bVar.put(Date.class, new C6833hb2(locale, "yyyy-MM-dd"));
        bVar.put(Time.class, new C7560kb2(locale, "HH:mm:ss"));
        bVar.put(Timestamp.class, new C8307nb2(locale, "yyyy-MM-dd HH:mm:ss.S"));
        bVar.c(true);
        return bVar;
    }

    public void k() {
        C9818tn0 q = q(this.a);
        this.d.c(false);
        this.d.clear();
        this.d.put(this.a, q);
        this.d.c(true);
    }

    public void l(Class<?> cls, Locale locale) {
        q(locale).remove(cls);
    }

    public void m(Locale locale) {
        this.d.remove(locale);
    }

    public boolean n() {
        return this.b;
    }

    public Locale o() {
        return this.a;
    }

    @Deprecated
    public C9818tn0 q(Locale locale) {
        if (locale == null) {
            return (C9818tn0) this.d.get(this.a);
        }
        C9818tn0 c9818tn0 = (C9818tn0) this.d.get(locale);
        if (c9818tn0 == null) {
            C9818tn0 j = j(locale);
            this.d.put(locale, j);
            return j;
        }
        return c9818tn0;
    }

    public InterfaceC8902q21 r(Class<?> cls, Locale locale) {
        InterfaceC8902q21 interfaceC8902q21 = (InterfaceC8902q21) q(locale).get(cls);
        if (this.c.f()) {
            J31 j31 = this.c;
            j31.r("LocaleConverter:" + interfaceC8902q21);
        }
        return interfaceC8902q21;
    }

    public void s(InterfaceC8902q21 interfaceC8902q21, Class<?> cls, Locale locale) {
        q(locale).put(cls, interfaceC8902q21);
    }

    public void t(boolean z) {
        this.b = z;
    }

    public void u(Locale locale) {
        if (locale == null) {
            this.a = Locale.getDefault();
        } else {
            this.a = locale;
        }
    }
}
