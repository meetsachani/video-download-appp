package o;

import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.function.BiFunction;
import java.util.function.Function;

/* renamed from: o.De2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2730De2 {
    public static final C2730De2 a = new C2730De2();
    public static final C8450oB0<String> b = C8450oB0.h(new Function() { // from class: o.ye2
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return C2730De2.c((String) obj);
        }
    });
    public static final C8450oB0<String> c = C8450oB0.h(new Function() { // from class: o.ze2
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            String a2;
            a2 = C3612Mc0.a(C3515Lc0.a(), ((String) obj).getBytes(StandardCharsets.ISO_8859_1));
            return a2;
        }
    });
    public static final C8450oB0<String> d = C8450oB0.h(new Function() { // from class: o.Ae2
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return System.getenv((String) obj);
        }
    });
    public static final C8450oB0<String> e = C8450oB0.h(new Function() { // from class: o.Be2
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return C2730De2.a((String) obj);
        }
    });
    public static final C8450oB0<String> f = C8450oB0.h(new Function() { // from class: o.Ce2
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return System.getProperty((String) obj);
        }
    });
    public static final String g = "base64Decoder";
    public static final String h = "base64Encoder";
    public static final String i = "const";
    public static final String j = "date";
    public static final String k = "dns";
    public static final String l = "env";
    public static final String m = "file";
    public static final String n = "java";

    /* renamed from: o  reason: collision with root package name */
    public static final String f442o = "localhost";
    public static final String p = "properties";
    public static final String q = "resourceBundle";
    public static final String r = "script";
    public static final String s = "sys";
    public static final String t = "url";
    public static final String u = "urlDecoder";
    public static final String v = "urlEncoder";
    public static final String w = "xml";
    public static final String x = "org.apache.commons.text.lookup.StringLookupFactory.defaultStringLookups";

    /* renamed from: o.De2$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public static final a b = new a(System.getProperties());
        public final Map<String, InterfaceC10759xe2> a;

        public a(Properties properties) {
            Map<String, InterfaceC10759xe2> b2;
            if (properties.containsKey(C2730De2.x)) {
                b2 = d(properties.getProperty(C2730De2.x));
            } else {
                b2 = b();
            }
            this.a = Collections.unmodifiableMap(b2);
        }

        public static void a(F00 f00, Map<String, InterfaceC10759xe2> map) {
            map.put(C2730De2.C(f00.e()), f00.g());
            if (F00.Z.equals(f00)) {
                map.put(C2730De2.C("base64"), f00.g());
            }
        }

        public static Map<String, InterfaceC10759xe2> b() {
            HashMap hashMap = new HashMap();
            a(F00.Z, hashMap);
            a(F00.Y0, hashMap);
            a(F00.Z0, hashMap);
            a(F00.a1, hashMap);
            a(F00.c1, hashMap);
            a(F00.d1, hashMap);
            a(F00.e1, hashMap);
            a(F00.f1, hashMap);
            a(F00.g1, hashMap);
            a(F00.h1, hashMap);
            a(F00.j1, hashMap);
            a(F00.l1, hashMap);
            a(F00.m1, hashMap);
            a(F00.n1, hashMap);
            return hashMap;
        }

        public static Map<String, InterfaceC10759xe2> d(String str) {
            String[] split;
            HashMap hashMap = new HashMap();
            try {
                for (String str2 : str.split("[\\s,]+")) {
                    if (!str2.isEmpty()) {
                        a(F00.valueOf(str2.toUpperCase()), hashMap);
                    }
                }
                return hashMap;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid default string lookups definition: " + str, e);
            }
        }

        public Map<String, InterfaceC10759xe2> c() {
            return this.a;
        }
    }

    public static String C(String str) {
        return str.toLowerCase(Locale.ROOT);
    }

    public static <K, V> Map<K, V> D(Map<K, V> map) {
        if (map == null) {
            return Collections.EMPTY_MAP;
        }
        return map;
    }

    public static /* synthetic */ String a(String str) {
        return null;
    }

    public static /* synthetic */ String c(String str) {
        return new String(C3417Kc0.a(C3319Jc0.a(), str), StandardCharsets.ISO_8859_1);
    }

    public static void i() {
        C9707tK.g();
    }

    public InterfaceC10759xe2 A() {
        return SY1.c;
    }

    public InterfaceC10759xe2 B() {
        return f;
    }

    public InterfaceC10759xe2 E() {
        return UC2.c;
    }

    public InterfaceC10759xe2 F() {
        return VC2.c;
    }

    public InterfaceC10759xe2 G() {
        return C5032aD2.c;
    }

    public InterfaceC10759xe2 H() {
        return C5561cO2.c;
    }

    public void d(Map<String, InterfaceC10759xe2> map) {
        if (map != null) {
            map.putAll(a.b.c());
        }
    }

    public InterfaceC10759xe2 e() {
        return b;
    }

    public InterfaceC10759xe2 f() {
        return c;
    }

    @Deprecated
    public InterfaceC10759xe2 g() {
        return b;
    }

    public <R, U> InterfaceC4723Xm<U> h(BiFunction<String, U, R> biFunction) {
        return C4529Vm.d(biFunction);
    }

    public InterfaceC10759xe2 j() {
        return C9707tK.e;
    }

    public InterfaceC10759xe2 k() {
        return C9264rV.c;
    }

    public InterfaceC10759xe2 l() {
        return I40.c;
    }

    public InterfaceC10759xe2 m() {
        return d;
    }

    public InterfaceC10759xe2 n() {
        return C10801xp0.c;
    }

    public <R> InterfaceC10759xe2 o(Function<String, R> function) {
        return C8450oB0.h(function);
    }

    public InterfaceC10759xe2 p() {
        return QS0.e;
    }

    public <V> InterfaceC10759xe2 q(Map<String, V> map) {
        return new QS0(map);
    }

    public InterfaceC10759xe2 r(Map<String, InterfaceC10759xe2> map, InterfaceC10759xe2 interfaceC10759xe2, boolean z) {
        return new QS0(map, interfaceC10759xe2, z);
    }

    public InterfaceC10759xe2 s(InterfaceC10759xe2 interfaceC10759xe2) {
        return new QS0(interfaceC10759xe2);
    }

    public InterfaceC10759xe2 t() {
        return BU0.c;
    }

    public InterfaceC10759xe2 u() {
        return C6698h21.c;
    }

    public <V> InterfaceC10759xe2 v(Map<String, V> map) {
        return C8450oB0.g(map);
    }

    public InterfaceC10759xe2 w() {
        return e;
    }

    public InterfaceC10759xe2 x() {
        return C10923yJ1.c;
    }

    public InterfaceC10759xe2 y() {
        return C6065eT1.d;
    }

    public InterfaceC10759xe2 z(String str) {
        return new C6065eT1(str);
    }
}
