package o;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: o.nQ1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8268nQ1 {
    public static final b a;

    /* renamed from: o.nQ1$b */
    /* loaded from: classes3.dex */
    public static abstract class b {
        public b() {
        }

        public abstract Method a(Class<?> cls, Field field);

        public abstract <T> Constructor<T> b(Class<T> cls);

        public abstract String[] c(Class<?> cls);

        public abstract boolean d(Class<?> cls);
    }

    /* renamed from: o.nQ1$c */
    /* loaded from: classes3.dex */
    public static class c extends b {
        public c() {
            super();
        }

        @Override // o.C8268nQ1.b
        public Method a(Class<?> cls, Field field) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // o.C8268nQ1.b
        public <T> Constructor<T> b(Class<T> cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // o.C8268nQ1.b
        public String[] c(Class<?> cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // o.C8268nQ1.b
        public boolean d(Class<?> cls) {
            return false;
        }
    }

    /* renamed from: o.nQ1$d */
    /* loaded from: classes3.dex */
    public static class d extends b {
        public final Method a;
        public final Method b;
        public final Method c;
        public final Method d;

        @Override // o.C8268nQ1.b
        public Method a(Class<?> cls, Field field) {
            try {
                return cls.getMethod(field.getName(), null);
            } catch (ReflectiveOperationException e) {
                throw C8268nQ1.d(e);
            }
        }

        @Override // o.C8268nQ1.b
        public <T> Constructor<T> b(Class<T> cls) {
            try {
                Object[] objArr = (Object[]) this.b.invoke(cls, null);
                Class<?>[] clsArr = new Class[objArr.length];
                for (int i = 0; i < objArr.length; i++) {
                    clsArr[i] = (Class) this.d.invoke(objArr[i], null);
                }
                return cls.getDeclaredConstructor(clsArr);
            } catch (ReflectiveOperationException e) {
                throw C8268nQ1.d(e);
            }
        }

        @Override // o.C8268nQ1.b
        public String[] c(Class<?> cls) {
            try {
                Object[] objArr = (Object[]) this.b.invoke(cls, null);
                String[] strArr = new String[objArr.length];
                for (int i = 0; i < objArr.length; i++) {
                    strArr[i] = (String) this.c.invoke(objArr[i], null);
                }
                return strArr;
            } catch (ReflectiveOperationException e) {
                throw C8268nQ1.d(e);
            }
        }

        @Override // o.C8268nQ1.b
        public boolean d(Class<?> cls) {
            try {
                return ((Boolean) this.a.invoke(cls, null)).booleanValue();
            } catch (ReflectiveOperationException e) {
                throw C8268nQ1.d(e);
            }
        }

        public d() throws NoSuchMethodException, ClassNotFoundException {
            super();
            this.a = Class.class.getMethod("isRecord", null);
            this.b = Class.class.getMethod("getRecordComponents", null);
            Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
            this.c = cls.getMethod("getName", null);
            this.d = cls.getMethod("getType", null);
        }
    }

    static {
        b cVar;
        try {
            cVar = new d();
        } catch (ReflectiveOperationException unused) {
            cVar = new c();
        }
        a = cVar;
    }

    public static void b(AccessibleObject accessibleObject, StringBuilder sb) {
        Class<?>[] parameterTypes;
        sb.append('(');
        if (accessibleObject instanceof Method) {
            parameterTypes = ((Method) accessibleObject).getParameterTypes();
        } else {
            parameterTypes = ((Constructor) accessibleObject).getParameterTypes();
        }
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i > 0) {
                sb.append(C6566gU0.h);
            }
            sb.append(parameterTypes[i].getSimpleName());
        }
        sb.append(')');
    }

    public static String c(Constructor<?> constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        b(constructor, sb);
        return sb.toString();
    }

    public static RuntimeException d(ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException);
    }

    public static RuntimeException e(IllegalAccessException illegalAccessException) {
        throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
    }

    public static String f(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    public static String g(AccessibleObject accessibleObject, boolean z) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + f((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb = new StringBuilder(method.getName());
            b(method, sb);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + c((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (z && Character.isLowerCase(str.charAt(0))) {
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        return str;
    }

    public static Method h(Class<?> cls, Field field) {
        return a.a(cls, field);
    }

    public static <T> Constructor<T> i(Class<T> cls) {
        return a.b(cls);
    }

    public static String j(Exception exc) {
        String str;
        if (exc.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
            String message = exc.getMessage();
            if (message != null && message.contains("to module com.google.gson")) {
                str = "reflection-inaccessible-to-module-gson";
            } else {
                str = "reflection-inaccessible";
            }
            return "\nSee " + Bu2.a(str);
        }
        return "";
    }

    public static String[] k(Class<?> cls) {
        return a.c(cls);
    }

    public static boolean l(Class<?> cls) {
        if (!n(cls)) {
            if (cls.isAnonymousClass() || cls.isLocalClass()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean m(Class<?> cls) {
        return a.d(cls);
    }

    public static boolean n(Class<?> cls) {
        return Modifier.isStatic(cls.getModifiers());
    }

    public static void o(AccessibleObject accessibleObject) throws GV0 {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e) {
            String g = g(accessibleObject, false);
            throw new GV0("Failed making " + g + " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type." + j(e), e);
        }
    }

    public static String p(Constructor<?> constructor) {
        try {
            constructor.setAccessible(true);
            return null;
        } catch (Exception e) {
            return "Failed making constructor '" + c(constructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e.getMessage() + j(e);
        }
    }
}
