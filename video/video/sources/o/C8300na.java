package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/* renamed from: o.na  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8300na {
    public static final AbstractC4253Sp2 a = new a();

    /* renamed from: o.na$a */
    /* loaded from: classes4.dex */
    public static class a extends AbstractC4253Sp2 {
        private static final long serialVersionUID = 1;

        public a() {
            U0(true);
            N0(true);
            f1(true);
            i1(true);
            h1(false);
            T0(C9811tl1.c);
            R0(C9811tl1.d);
            X0(C6566gU0.h);
            Q0(C6566gU0.f);
            O0(C6566gU0.g);
        }

        @Override // o.AbstractC4253Sp2
        public void D(StringBuffer stringBuffer, String str, Object obj) {
            if (obj instanceof Annotation) {
                obj = C8300na.i((Annotation) obj);
            }
            super.D(stringBuffer, str, obj);
        }

        @Override // o.AbstractC4253Sp2
        public String v0(Class<?> cls) {
            for (Class<?> cls2 : C8457oD.g(cls)) {
                if (Annotation.class.isAssignableFrom(cls2)) {
                    return "@" + cls2.getName();
                }
            }
            return "";
        }
    }

    public static boolean a(Annotation[] annotationArr, Annotation[] annotationArr2) {
        if (annotationArr.length != annotationArr2.length) {
            return false;
        }
        for (int i = 0; i < annotationArr.length; i++) {
            if (!d(annotationArr[i], annotationArr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(Class<?> cls, Object obj, Object obj2) {
        if (cls.isAnnotation()) {
            return a((Annotation[]) obj, (Annotation[]) obj2);
        }
        if (cls.equals(Byte.TYPE)) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        if (cls.equals(Short.TYPE)) {
            return Arrays.equals((short[]) obj, (short[]) obj2);
        }
        if (cls.equals(Integer.TYPE)) {
            return Arrays.equals((int[]) obj, (int[]) obj2);
        }
        if (cls.equals(Character.TYPE)) {
            return Arrays.equals((char[]) obj, (char[]) obj2);
        }
        if (cls.equals(Long.TYPE)) {
            return Arrays.equals((long[]) obj, (long[]) obj2);
        }
        if (cls.equals(Float.TYPE)) {
            return Arrays.equals((float[]) obj, (float[]) obj2);
        }
        if (cls.equals(Double.TYPE)) {
            return Arrays.equals((double[]) obj, (double[]) obj2);
        }
        if (cls.equals(Boolean.TYPE)) {
            return Arrays.equals((boolean[]) obj, (boolean[]) obj2);
        }
        return Arrays.equals((Object[]) obj, (Object[]) obj2);
    }

    public static int c(Class<?> cls, Object obj) {
        if (cls.equals(Byte.TYPE)) {
            return Arrays.hashCode((byte[]) obj);
        }
        if (cls.equals(Short.TYPE)) {
            return Arrays.hashCode((short[]) obj);
        }
        if (cls.equals(Integer.TYPE)) {
            return Arrays.hashCode((int[]) obj);
        }
        if (cls.equals(Character.TYPE)) {
            return Arrays.hashCode((char[]) obj);
        }
        if (cls.equals(Long.TYPE)) {
            return Arrays.hashCode((long[]) obj);
        }
        if (cls.equals(Float.TYPE)) {
            return Arrays.hashCode((float[]) obj);
        }
        if (cls.equals(Double.TYPE)) {
            return Arrays.hashCode((double[]) obj);
        }
        if (cls.equals(Boolean.TYPE)) {
            return Arrays.hashCode((boolean[]) obj);
        }
        return Arrays.hashCode((Object[]) obj);
    }

    public static boolean d(Annotation annotation, Annotation annotation2) {
        Method[] declaredMethods;
        if (annotation == annotation2) {
            return true;
        }
        if (annotation != null && annotation2 != null) {
            Class<? extends Annotation> annotationType = annotation.annotationType();
            Class<? extends Annotation> annotationType2 = annotation2.annotationType();
            C11147zE2.V(annotationType, "Annotation %s with null annotationType()", annotation);
            C11147zE2.V(annotationType2, "Annotation %s with null annotationType()", annotation2);
            if (!annotationType.equals(annotationType2)) {
                return false;
            }
            try {
                for (Method method : annotationType.getDeclaredMethods()) {
                    if (method.getParameterTypes().length == 0 && g(method.getReturnType())) {
                        if (!h(method.getReturnType(), method.invoke(annotation, null), method.invoke(annotation2, null))) {
                            return false;
                        }
                    }
                }
                return true;
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return false;
    }

    public static int e(Annotation annotation) {
        Method[] declaredMethods;
        int i = 0;
        for (Method method : annotation.annotationType().getDeclaredMethods()) {
            try {
                Object invoke = method.invoke(annotation, null);
                if (invoke != null) {
                    i += f(method.getName(), invoke);
                } else {
                    throw new IllegalStateException(String.format("Annotation method %s returned null", method));
                }
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
        return i;
    }

    public static int f(String str, Object obj) {
        int hashCode;
        int hashCode2 = str.hashCode() * 127;
        if (obj.getClass().isArray()) {
            hashCode = c(obj.getClass().getComponentType(), obj);
        } else if (obj instanceof Annotation) {
            hashCode = e((Annotation) obj);
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public static boolean g(Class<?> cls) {
        if (cls == null) {
            return false;
        }
        if (cls.isArray()) {
            cls = cls.getComponentType();
        }
        if (!cls.isPrimitive() && !cls.isEnum() && !cls.isAnnotation() && !String.class.equals(cls) && !Class.class.equals(cls)) {
            return false;
        }
        return true;
    }

    public static boolean h(Class<?> cls, Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj2 != null) {
            if (cls.isArray()) {
                return b(cls.getComponentType(), obj, obj2);
            }
            if (cls.isAnnotation()) {
                return d((Annotation) obj, (Annotation) obj2);
            }
            return obj.equals(obj2);
        }
        return false;
    }

    public static String i(Annotation annotation) {
        Method[] declaredMethods;
        C4056Qp2 c4056Qp2 = new C4056Qp2(annotation, a);
        for (Method method : annotation.annotationType().getDeclaredMethods()) {
            if (method.getParameterTypes().length <= 0) {
                try {
                    c4056Qp2.n(method.getName(), method.invoke(annotation, null));
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return c4056Qp2.build();
    }
}
