package o;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import o.InterfaceC8148mw2;
import okhttp3.HttpUrl;

/* renamed from: o.oD */
/* loaded from: classes4.dex */
public class C8457oD {
    public static final char a = '.';
    public static final char c = '$';
    public static final Map<String, Class<?>> e;
    public static final Map<Class<?>, Class<?>> f;
    public static final Map<Class<?>, Class<?>> g;
    public static final Map<String, String> h;
    public static final Map<String, String> i;
    public static final String b = String.valueOf('.');
    public static final String d = String.valueOf('$');

    /* renamed from: o.oD$a */
    /* loaded from: classes4.dex */
    public enum a {
        INCLUDE,
        EXCLUDE
    }

    static {
        HashMap hashMap = new HashMap();
        e = hashMap;
        Class cls = Boolean.TYPE;
        hashMap.put(InterfaceC8148mw2.b.f, cls);
        Class cls2 = Byte.TYPE;
        hashMap.put(com.facebook.a0.u, cls2);
        Class cls3 = Character.TYPE;
        hashMap.put(com.facebook.a0.G, cls3);
        Class cls4 = Short.TYPE;
        hashMap.put(com.facebook.a0.w, cls4);
        Class cls5 = Integer.TYPE;
        hashMap.put(com.facebook.a0.y, cls5);
        Class cls6 = Long.TYPE;
        hashMap.put(com.facebook.a0.A, cls6);
        Class cls7 = Double.TYPE;
        hashMap.put(com.facebook.a0.E, cls7);
        Class cls8 = Float.TYPE;
        hashMap.put("float", cls8);
        Class cls9 = Void.TYPE;
        hashMap.put("void", cls9);
        HashMap hashMap2 = new HashMap();
        f = hashMap2;
        hashMap2.put(cls, Boolean.class);
        hashMap2.put(cls2, Byte.class);
        hashMap2.put(cls3, Character.class);
        hashMap2.put(cls4, Short.class);
        hashMap2.put(cls5, Integer.class);
        hashMap2.put(cls6, Long.class);
        hashMap2.put(cls7, Double.class);
        hashMap2.put(cls8, Float.class);
        hashMap2.put(cls9, cls9);
        g = new HashMap();
        for (Map.Entry entry : hashMap2.entrySet()) {
            Class<?> cls10 = (Class) entry.getKey();
            Class<?> cls11 = (Class) entry.getValue();
            if (!cls10.equals(cls11)) {
                g.put(cls11, cls10);
            }
        }
        HashMap hashMap3 = new HashMap();
        hashMap3.put(com.facebook.a0.y, "I");
        hashMap3.put(InterfaceC8148mw2.b.f, "Z");
        hashMap3.put("float", "F");
        hashMap3.put(com.facebook.a0.A, "J");
        hashMap3.put(com.facebook.a0.w, "S");
        hashMap3.put(com.facebook.a0.u, "B");
        hashMap3.put(com.facebook.a0.E, "D");
        hashMap3.put(com.facebook.a0.G, "C");
        HashMap hashMap4 = new HashMap();
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            hashMap4.put(entry2.getValue(), entry2.getKey());
        }
        h = Collections.unmodifiableMap(hashMap3);
        i = Collections.unmodifiableMap(hashMap4);
    }

    public static String A(Object obj, String str) {
        if (obj == null) {
            return str;
        }
        return z(obj.getClass());
    }

    public static String B(String str) {
        if (C4500Ve2.I0(str)) {
            return "";
        }
        while (str.charAt(0) == '[') {
            str = str.substring(1);
        }
        if (str.charAt(0) == 'L' && str.charAt(str.length() - 1) == ';') {
            str = str.substring(1);
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return "";
        }
        return str.substring(0, lastIndexOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Method C(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Method method;
        Method method2 = cls.getMethod(str, clsArr);
        if (Modifier.isPublic(method2.getDeclaringClass().getModifiers())) {
            return method2;
        }
        ArrayList<Class> arrayList = new ArrayList(g(cls));
        arrayList.addAll(i(cls));
        for (Class cls2 : arrayList) {
            if (Modifier.isPublic(cls2.getModifiers())) {
                try {
                    method = cls2.getMethod(str, clsArr);
                } catch (NoSuchMethodException unused) {
                }
                if (Modifier.isPublic(method.getDeclaringClass().getModifiers())) {
                    return method;
                }
            }
            while (r2.hasNext()) {
            }
        }
        throw new NoSuchMethodException("Can't find a public method for " + str + C4500Ve2.b + C4206Se.S5(clsArr));
    }

    public static String D(Class<?> cls) {
        if (cls == null) {
            return "";
        }
        return F(cls.getName());
    }

    public static String E(Object obj, String str) {
        if (obj == null) {
            return str;
        }
        return F(obj.getClass().getName());
    }

    public static String F(String str) {
        return I(n(str));
    }

    public static String G(Class<?> cls) {
        if (cls == null) {
            return "";
        }
        return I(cls.getName());
    }

    public static String H(Object obj, String str) {
        if (obj == null) {
            return str;
        }
        return G(obj.getClass());
    }

    public static String I(String str) {
        if (C4500Ve2.I0(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        if (str.startsWith(C6566gU0.f)) {
            while (str.charAt(0) == '[') {
                str = str.substring(1);
                sb.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            }
            if (str.charAt(0) == 'L' && str.charAt(str.length() - 1) == ';') {
                str = str.substring(1, str.length() - 1);
            }
            Map<String, String> map = i;
            if (map.containsKey(str)) {
                str = map.get(str);
            }
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            i2 = lastIndexOf + 1;
        }
        int indexOf = str.indexOf(36, i2);
        String substring = str.substring(lastIndexOf + 1);
        if (indexOf != -1) {
            substring = substring.replace('$', '.');
        }
        return substring + ((Object) sb);
    }

    public static String J(Class<?> cls) {
        return K(cls, "");
    }

    public static String K(Class<?> cls, String str) {
        if (cls == null) {
            return str;
        }
        return cls.getSimpleName();
    }

    public static String L(Object obj) {
        return M(obj, "");
    }

    public static String M(Object obj, String str) {
        if (obj == null) {
            return str;
        }
        return obj.getClass().getSimpleName();
    }

    public static Iterable<Class<?>> N(Class<?> cls) {
        return O(cls, a.EXCLUDE);
    }

    public static Iterable<Class<?>> O(final Class<?> cls, a aVar) {
        final Iterable<Class<?>> iterable = new Iterable() { // from class: o.kD
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return C8457oD.b(cls);
            }
        };
        if (aVar != a.INCLUDE) {
            return iterable;
        }
        return new Iterable() { // from class: o.lD
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return C8457oD.a(iterable);
            }
        };
    }

    public static boolean P(Class<?> cls, Class<?> cls2) {
        return Q(cls, cls2, true);
    }

    public static boolean Q(Class<?> cls, Class<?> cls2, boolean z) {
        if (cls2 == null) {
            return false;
        }
        if (cls == null) {
            return !cls2.isPrimitive();
        }
        if (z) {
            if (cls.isPrimitive() && !cls2.isPrimitive() && (cls = W(cls)) == null) {
                return false;
            }
            if (cls2.isPrimitive() && !cls.isPrimitive() && (cls = b0(cls)) == null) {
                return false;
            }
        }
        if (cls.equals(cls2)) {
            return true;
        }
        if (cls.isPrimitive()) {
            if (!cls2.isPrimitive()) {
                return false;
            }
            Class cls3 = Integer.TYPE;
            boolean equals = cls3.equals(cls);
            Class cls4 = Long.TYPE;
            Class cls5 = Double.TYPE;
            Class cls6 = Float.TYPE;
            if (equals) {
                if (!cls4.equals(cls2) && !cls6.equals(cls2) && !cls5.equals(cls2)) {
                    return false;
                }
                return true;
            } else if (cls4.equals(cls)) {
                if (!cls6.equals(cls2) && !cls5.equals(cls2)) {
                    return false;
                }
                return true;
            } else if (Boolean.TYPE.equals(cls) || cls5.equals(cls)) {
                return false;
            } else {
                if (cls6.equals(cls)) {
                    return cls5.equals(cls2);
                }
                if (Character.TYPE.equals(cls)) {
                    if (!cls3.equals(cls2) && !cls4.equals(cls2) && !cls6.equals(cls2) && !cls5.equals(cls2)) {
                        return false;
                    }
                    return true;
                }
                Class cls7 = Short.TYPE;
                if (cls7.equals(cls)) {
                    if (!cls3.equals(cls2) && !cls4.equals(cls2) && !cls6.equals(cls2) && !cls5.equals(cls2)) {
                        return false;
                    }
                    return true;
                } else if (!Byte.TYPE.equals(cls)) {
                    return false;
                } else {
                    if (!cls7.equals(cls2) && !cls3.equals(cls2) && !cls4.equals(cls2) && !cls6.equals(cls2) && !cls5.equals(cls2)) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return cls2.isAssignableFrom(cls);
    }

    public static boolean R(Class<?>[] clsArr, Class<?>... clsArr2) {
        return S(clsArr, clsArr2, true);
    }

    public static boolean S(Class<?>[] clsArr, Class<?>[] clsArr2, boolean z) {
        if (!C4206Se.H1(clsArr, clsArr2)) {
            return false;
        }
        if (clsArr == null) {
            clsArr = C4206Se.g;
        }
        if (clsArr2 == null) {
            clsArr2 = C4206Se.g;
        }
        for (int i2 = 0; i2 < clsArr.length; i2++) {
            if (!Q(clsArr[i2], clsArr2[i2], z)) {
                return false;
            }
        }
        return true;
    }

    public static boolean T(Class<?> cls) {
        if (cls != null && cls.getEnclosingClass() != null) {
            return true;
        }
        return false;
    }

    public static boolean U(Class<?> cls) {
        if (cls == null) {
            return false;
        }
        if (!cls.isPrimitive() && !V(cls)) {
            return false;
        }
        return true;
    }

    public static boolean V(Class<?> cls) {
        return g.containsKey(cls);
    }

    public static Class<?> W(Class<?> cls) {
        if (cls != null && cls.isPrimitive()) {
            return f.get(cls);
        }
        return cls;
    }

    public static Class<?>[] X(Class<?>... clsArr) {
        if (clsArr == null) {
            return null;
        }
        if (clsArr.length == 0) {
            return clsArr;
        }
        Class<?>[] clsArr2 = new Class[clsArr.length];
        for (int i2 = 0; i2 < clsArr.length; i2++) {
            clsArr2[i2] = W(clsArr[i2]);
        }
        return clsArr2;
    }

    public static String Y(String str) {
        String N = C4500Ve2.N(str);
        C11147zE2.V(N, "className", new Object[0]);
        if (N.endsWith(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
            StringBuilder sb = new StringBuilder();
            while (N.endsWith(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
                N = N.substring(0, N.length() - 2);
                sb.append(C6566gU0.f);
            }
            String str2 = h.get(N);
            if (str2 != null) {
                sb.append(str2);
            } else {
                sb.append("L");
                sb.append(N);
                sb.append(";");
            }
            return sb.toString();
        }
        return N;
    }

    public static Class<?>[] Z(Object... objArr) {
        Class<?> cls;
        if (objArr == null) {
            return null;
        }
        if (objArr.length == 0) {
            return C4206Se.g;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                cls = null;
            } else {
                cls = obj.getClass();
            }
            clsArr[i2] = cls;
        }
        return clsArr;
    }

    public static /* synthetic */ Iterator a(Iterable iterable) {
        return new C8214nD(iterable.iterator(), new HashSet());
    }

    public static boolean a0(int i2, int i3, int i4, int i5) {
        if (i3 < i4 && (i2 + i4) - i3 > i5) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ Iterator b(Class cls) {
        return new C7971mD(new C10551wn1(cls));
    }

    public static Class<?> b0(Class<?> cls) {
        return g.get(cls);
    }

    public static List<Class<?>> c(List<String> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            try {
                arrayList.add(Class.forName(str));
            } catch (Exception unused) {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public static Class<?>[] c0(Class<?>... clsArr) {
        if (clsArr == null) {
            return null;
        }
        if (clsArr.length == 0) {
            return clsArr;
        }
        Class<?>[] clsArr2 = new Class[clsArr.length];
        for (int i2 = 0; i2 < clsArr.length; i2++) {
            clsArr2[i2] = b0(clsArr[i2]);
        }
        return clsArr2;
    }

    public static List<String> d(List<Class<?>> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Class<?> cls : list) {
            if (cls == null) {
                arrayList.add(null);
            } else {
                arrayList.add(cls.getName());
            }
        }
        return arrayList;
    }

    public static String e(Class<?> cls, int i2) {
        if (cls == null) {
            return "";
        }
        return f(cls.getName(), i2);
    }

    public static String f(String str, int i2) {
        char c2;
        if (i2 > 0) {
            if (str == null) {
                return "";
            }
            if (str.length() <= i2) {
                return str;
            }
            char[] charArray = str.toCharArray();
            int i3 = 0;
            int i4 = 0;
            while (i3 < charArray.length) {
                int i5 = i4;
                while (i3 < charArray.length && (c2 = charArray[i3]) != '.') {
                    i3++;
                    charArray[i5] = c2;
                    i5++;
                }
                int i6 = i4 + 1;
                if (!a0(i5, i3, charArray.length, i2) && i6 <= i5) {
                    i5 = i6;
                }
                if (i3 < charArray.length) {
                    i4 = i5 + 1;
                    charArray[i5] = charArray[i3];
                    i3++;
                } else {
                    i4 = i5;
                }
            }
            return new String(charArray, 0, i4);
        }
        throw new IllegalArgumentException("len must be > 0");
    }

    public static List<Class<?>> g(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        h(cls, linkedHashSet);
        return new ArrayList(linkedHashSet);
    }

    public static void h(Class<?> cls, HashSet<Class<?>> hashSet) {
        Class<?>[] interfaces;
        while (cls != null) {
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (hashSet.add(cls2)) {
                    h(cls2, hashSet);
                }
            }
            cls = cls.getSuperclass();
        }
    }

    public static List<Class<?>> i(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Class<? super Object> superclass = cls.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            arrayList.add(superclass);
        }
        return arrayList;
    }

    public static String j(Class<?> cls) {
        return k(cls, "");
    }

    public static String k(Class<?> cls, String str) {
        String canonicalName;
        if (cls == null || (canonicalName = cls.getCanonicalName()) == null) {
            return str;
        }
        return canonicalName;
    }

    public static String l(Object obj) {
        return m(obj, "");
    }

    public static String m(Object obj, String str) {
        String canonicalName;
        if (obj == null || (canonicalName = obj.getClass().getCanonicalName()) == null) {
            return str;
        }
        return canonicalName;
    }

    public static String n(String str) {
        int length;
        String N = C4500Ve2.N(str);
        if (N == null) {
            return null;
        }
        int i2 = 0;
        while (N.startsWith(C6566gU0.f)) {
            i2++;
            N = N.substring(1);
        }
        if (i2 < 1) {
            return N;
        }
        if (N.startsWith("L")) {
            if (N.endsWith(";")) {
                length = N.length() - 1;
            } else {
                length = N.length();
            }
            N = N.substring(1, length);
        } else if (!N.isEmpty()) {
            N = i.get(N.substring(0, 1));
        }
        StringBuilder sb = new StringBuilder(N);
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        }
        return sb.toString();
    }

    public static Class<?> o(ClassLoader classLoader, String str) throws ClassNotFoundException {
        return p(classLoader, str, true);
    }

    public static Class<?> p(ClassLoader classLoader, String str, boolean z) throws ClassNotFoundException {
        try {
            Map<String, Class<?>> map = e;
            if (map.containsKey(str)) {
                return map.get(str);
            }
            return Class.forName(Y(str), z, classLoader);
        } catch (ClassNotFoundException e2) {
            int lastIndexOf = str.lastIndexOf(46);
            if (lastIndexOf != -1) {
                try {
                    return p(classLoader, str.substring(0, lastIndexOf) + '$' + str.substring(lastIndexOf + 1), z);
                } catch (ClassNotFoundException unused) {
                    throw e2;
                }
            }
            throw e2;
        }
    }

    public static Class<?> q(String str) throws ClassNotFoundException {
        return r(str, true);
    }

    public static Class<?> r(String str, boolean z) throws ClassNotFoundException {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            contextClassLoader = C8457oD.class.getClassLoader();
        }
        return p(contextClassLoader, str, z);
    }

    public static String s(Class<?> cls) {
        return t(cls, "");
    }

    public static String t(Class<?> cls, String str) {
        if (cls == null) {
            return str;
        }
        return cls.getName();
    }

    public static String u(Object obj) {
        return v(obj, "");
    }

    public static String v(Object obj, String str) {
        if (obj == null) {
            return str;
        }
        return obj.getClass().getName();
    }

    public static String w(Class<?> cls) {
        if (cls == null) {
            return "";
        }
        return y(cls.getName());
    }

    public static String x(Object obj, String str) {
        if (obj == null) {
            return str;
        }
        return y(obj.getClass().getName());
    }

    public static String y(String str) {
        return B(n(str));
    }

    public static String z(Class<?> cls) {
        if (cls == null) {
            return "";
        }
        return B(cls.getName());
    }
}
